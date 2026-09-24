package org.jsoup.parser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.InTableBody;
        org.jsoup.parser.Token.Comment comment1 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder2 = comment1.data;
        java.lang.String str3 = comment1.toString();
        java.lang.String str4 = comment1.getData();
        java.lang.StringBuilder stringBuilder5 = comment1.data;
        org.jsoup.parser.Token token6 = comment1.reset();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilderState0.process(token6, htmlTreeBuilder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(token6);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.String str7 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.Doctype doctype8 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder9 = doctype8.name;
        org.jsoup.parser.Token.reset(stringBuilder9);
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(doctype8);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("PUBLIC", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "StartTag", "#doctype");
        documentType4.setBaseUri("<<!---->>");
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean13 = documentType11.hasAttr("hi!");
        int int14 = documentType11.childNodeSize();
        org.jsoup.nodes.Document document15 = documentType11.ownerDocument();
        java.lang.String str16 = documentType11.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = documentType4.after((org.jsoup.nodes.Node) documentType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#doctype" + "'", str16, "#doctype");
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character40 = startTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.nodes.DocumentType documentType7 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean9 = documentType7.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes10 = documentType7.attributes();
        tag1.attributes = attributes10;
        java.lang.String str12 = tag1.normalName;
        org.jsoup.nodes.Attributes attributes13 = tag1.getAttributes();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.Token.Character character6 = new org.jsoup.parser.Token.Character();
        java.lang.String str7 = character6.getData();
        org.jsoup.parser.Token.Character character9 = character6.data("<!---->");
        java.lang.String str10 = character9.getData();
        xmlTreeBuilder0.insert(character9);
        org.jsoup.parser.Token.Doctype doctype12 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder13 = doctype12.name;
        boolean boolean14 = doctype12.forceQuirks;
        boolean boolean15 = doctype12.isCharacter();
        org.jsoup.parser.Token.Doctype doctype16 = doctype12.asDoctype();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(character9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!---->" + "'", str10, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(doctype16);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        boolean boolean4 = doctype0.isCharacter();
        org.jsoup.parser.Token.TokenType tokenType5 = org.jsoup.parser.Token.TokenType.EOF;
        doctype0.type = tokenType5;
        java.lang.String str7 = doctype0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        java.lang.String str9 = documentType4.nodeName();
        java.lang.String str10 = documentType4.nodeName();
        java.lang.String str12 = documentType4.attr("<!---->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = documentType4.before("4");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        java.lang.String str2 = comment0.toString();
        java.lang.String str3 = comment0.getData();
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        org.jsoup.parser.Token token5 = comment0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag6 = comment0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(token5);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        boolean boolean5 = document3.hasAttr("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node7 = document3.removeAttr("EOF");
        org.jsoup.nodes.Document document8 = node7.ownerDocument();
        org.jsoup.parser.Token.Doctype doctype9 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder10 = doctype9.name;
        java.lang.Appendable appendable11 = document8.html((java.lang.Appendable) stringBuilder10);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "\nSYSTEM");
        org.junit.Assert.assertNotNull(appendable11);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.AfterAfterBody;
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str2 = startTag1.normalName;
        startTag1.newAttribute();
        startTag1.finaliseTag();
        org.jsoup.parser.Token.Tag tag5 = startTag1.reset();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) startTag1, htmlTreeBuilder6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(tag5);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean9 = documentType4.equals(obj8);
        org.jsoup.nodes.Document document10 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node11 = documentType4.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node11.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
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
        org.jsoup.parser.Token.StartTag startTag50 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str51 = startTag50.normalName;
        startTag50.newAttribute();
        java.lang.String str53 = startTag50.normalName();
        startTag50.appendAttributeName("");
        startTag50.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag58 = startTag50.reset();
        org.jsoup.parser.Token.StartTag startTag60 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag61 = startTag60.reset();
        org.jsoup.parser.Token.Tag tag62 = startTag60.reset();
        org.jsoup.nodes.Attributes attributes63 = startTag60.getAttributes();
        org.jsoup.parser.Token.StartTag startTag64 = startTag50.nameAttr("Doctype", attributes63);
        startTag64.appendAttributeName("SYSTEM");
        startTag64.appendAttributeValue("#");
        org.jsoup.nodes.Attributes attributes70 = null;
        org.jsoup.parser.Token.StartTag startTag71 = startTag64.nameAttr("EOF", attributes70);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element72 = xmlTreeBuilder0.insert(startTag64);
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
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertNotNull(tag61);
        org.junit.Assert.assertNotNull(tag62);
        org.junit.Assert.assertNotNull(attributes63);
        org.junit.Assert.assertNotNull(startTag64);
        org.junit.Assert.assertNotNull(startTag71);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = documentType4.after("<<!---->#doctype  name=\"\" publicId=\"hi!\" systemId=\"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
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
        org.jsoup.parser.Token token50 = startTag38.reset();
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
        org.junit.Assert.assertNotNull(token50);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.String str3 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder7 = doctype0.name;
        org.jsoup.parser.Token token8 = doctype0.reset();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(token8);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "#doctype", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.Character character11 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder0.insert(character11);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder16.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlTreeBuilder0.parseFragment("SYSTEM", "PUBLIC", parseErrorList15, parseSettings17);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document25 = xmlTreeBuilder22.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment26 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder27 = comment26.data;
        xmlTreeBuilder22.insert(comment26);
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder22.defaultSettings();
        xmlTreeBuilder0.initialiseParse("<<!---->  name=\"\" publicId=\"hi!\" systemId=\"hi!\">", "<<SYSTEM>>", parseErrorList21, parseSettings29);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "");
        org.junit.Assert.assertNotNull(parseSettings29);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
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
        org.jsoup.parser.Token.Doctype doctype17 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder18 = doctype17.name;
        boolean boolean19 = doctype17.forceQuirks;
        java.lang.String str20 = doctype17.getSystemIdentifier();
        boolean boolean21 = doctype17.isComment();
        java.lang.StringBuilder stringBuilder22 = doctype17.systemIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertNotNull(comment15);
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
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
        org.jsoup.parser.Token.Tag tag31 = startTag23.reset();
        org.jsoup.nodes.Attributes attributes32 = startTag23.getAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element33 = xmlTreeBuilder0.insert(startTag23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(token21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNotNull(attributes32);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        boolean boolean3 = tag1.selfClosing;
        tag1.setEmptyAttributeValue();
        boolean boolean5 = tag1.isCharacter();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype6 = tag1.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = documentType4.clone();
        org.jsoup.nodes.Node node8 = node7.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes9 = node8.attributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
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
        org.jsoup.nodes.Node node19 = document18.parent();
        org.jsoup.nodes.Attributes attributes20 = document18.attributes();
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(attributes20);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
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
        org.jsoup.nodes.DocumentType documentType43 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean45 = documentType43.hasAttr("hi!");
        org.jsoup.nodes.Node node46 = documentType43.clone();
        org.jsoup.parser.Token.StartTag startTag47 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag48 = startTag47.reset();
        org.jsoup.parser.Token.Tag tag49 = startTag47.reset();
        org.jsoup.parser.Token.StartTag startTag50 = tag49.asStartTag();
        org.jsoup.parser.Token.StartTag startTag51 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str52 = startTag51.normalName;
        org.jsoup.nodes.Attributes attributes53 = startTag51.attributes;
        startTag50.attributes = attributes53;
        boolean boolean55 = documentType43.equals((java.lang.Object) attributes53);
        boolean boolean56 = xmlTreeBuilder0.processStartTag("<<SYSTEM>>", attributes53);
        org.jsoup.parser.Token.StartTag startTag57 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str58 = startTag57.normalName;
        org.jsoup.nodes.Attributes attributes59 = startTag57.attributes;
        boolean boolean60 = startTag57.isSelfClosing();
        startTag57.tagName = "EOF";
        org.jsoup.parser.Token token63 = startTag57.reset();
        boolean boolean64 = startTag57.isCharacter();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean65 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertNotNull(startTag50);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(attributes53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(attributes59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(token63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean9 = documentType4.equals(obj8);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = documentType4.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
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
        org.jsoup.parser.Token.StartTag startTag61 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag62 = startTag61.reset();
        tag62.finaliseTag();
        org.jsoup.nodes.DocumentType documentType68 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean70 = documentType68.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes71 = documentType68.attributes();
        tag62.attributes = attributes71;
        java.lang.String str73 = tag62.tagName;
        boolean boolean74 = tag62.selfClosing;
        org.jsoup.parser.Token token75 = tag62.reset();
        tag62.appendAttributeName(' ');
        org.jsoup.parser.Token.Tag tag79 = tag62.name("<!DOCTYPE #doctype PUBLIC \"4\" \"PUBLIC\">");
        org.jsoup.parser.Token token80 = tag62.reset();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean81 = xmlTreeBuilder0.process((org.jsoup.parser.Token) tag62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(tag62);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(attributes71);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(token75);
        org.junit.Assert.assertNotNull(tag79);
        org.junit.Assert.assertNotNull(token80);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
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
        org.jsoup.parser.Token.TokenType tokenType22 = tag1.type;
        org.jsoup.parser.Token token23 = tag1.reset();
        boolean boolean24 = tag1.isCharacter();
        org.jsoup.parser.Token.TokenType tokenType25 = tag1.type;
        boolean boolean26 = tag1.isSelfClosing();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + tokenType22 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType22.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(token23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + tokenType25 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType25.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = document25.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        org.jsoup.nodes.Attributes attributes2 = startTag0.attributes;
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        java.lang.String str5 = tag4.tokenType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isComment();
        org.jsoup.parser.Token.Doctype doctype4 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment6 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(doctype4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.InTable;
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag1.reset();
        tag2.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str5 = startTag4.normalName;
        startTag4.newAttribute();
        java.lang.String str7 = startTag4.normalName();
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag10 = startTag9.reset();
        tag10.finaliseTag();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean18 = documentType16.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes19 = documentType16.attributes();
        tag10.attributes = attributes19;
        org.jsoup.parser.Token.StartTag startTag21 = startTag4.nameAttr("<!---->", attributes19);
        tag2.attributes = attributes19;
        tag2.newAttribute();
        boolean boolean24 = tag2.isCharacter();
        tag2.normalName = "";
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder27 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) tag2, htmlTreeBuilder27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(startTag21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node8 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        java.lang.String str11 = documentType4.attr("Doctype");
        java.lang.String str12 = documentType4.outerHtml();
        int int13 = documentType4.childNodeSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str12, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
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
        tag1.appendAttributeName('a');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment19 = tag1.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(token14);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag8 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag9 = startTag0.reset();
        java.lang.String str10 = tag9.tagName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        java.lang.String str7 = documentType4.baseUri();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        java.lang.String str10 = documentType4.nodeName();
        boolean boolean12 = documentType4.hasAttr("StartTag");
        org.jsoup.nodes.Document document13 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = documentType4.before("Comment");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SYSTEM" + "'", str7, "SYSTEM");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "SYSTEM", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.Node node5 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = node5.hasAttr("SYSTEM");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag2 = startTag0.reset();
        org.jsoup.nodes.DocumentType documentType8 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str9 = documentType8.nodeName();
        org.jsoup.nodes.Attributes attributes10 = documentType8.attributes();
        org.jsoup.parser.Token.StartTag startTag11 = startTag0.nameAttr("", attributes10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag12 = startTag0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        java.lang.String str2 = comment0.toString();
        org.jsoup.parser.Token token3 = comment0.reset();
        java.lang.Class<?> wildcardClass4 = token3.getClass();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("#doctype");
        java.lang.String str11 = node9.attr("<!---->4");
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int17 = documentType16.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = documentType16.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = documentType16.childNodesCopy();
        java.lang.String str20 = documentType16.toString();
        // The following exception was thrown during execution in test generation
        try {
            node9.replaceWith((org.jsoup.nodes.Node) documentType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str6, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str20, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Document document6 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = document6.absUrl("<!DOCTYPE #doctype PUBLIC \"4\" \"PUBLIC\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNull(document6);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = documentType4.clone();
        org.jsoup.nodes.Node node8 = node7.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document9 = node8.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
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
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder23 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.ParseSettings parseSettings27 = null;
        xmlTreeBuilder23.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList26, parseSettings27);
        org.jsoup.parser.ParseErrorList parseErrorList31 = null;
        org.jsoup.parser.ParseSettings parseSettings32 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlTreeBuilder23.parseFragment("", "#doctype", parseErrorList31, parseSettings32);
        org.jsoup.nodes.Document document36 = xmlTreeBuilder23.parse("SYSTEM", "Doctype");
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder40 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList43 = null;
        org.jsoup.parser.ParseSettings parseSettings44 = null;
        xmlTreeBuilder40.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList43, parseSettings44);
        org.jsoup.parser.ParseErrorList parseErrorList48 = null;
        org.jsoup.parser.ParseSettings parseSettings49 = null;
        xmlTreeBuilder40.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList48, parseSettings49);
        org.jsoup.parser.Token.Character character51 = new org.jsoup.parser.Token.Character();
        java.lang.String str52 = character51.getData();
        xmlTreeBuilder40.insert(character51);
        org.jsoup.parser.ParseErrorList parseErrorList56 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder57 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList60 = null;
        org.jsoup.parser.ParseSettings parseSettings61 = null;
        xmlTreeBuilder57.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList60, parseSettings61);
        org.jsoup.parser.ParseErrorList parseErrorList65 = null;
        org.jsoup.parser.ParseSettings parseSettings66 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList67 = xmlTreeBuilder57.parseFragment("", "#doctype", parseErrorList65, parseSettings66);
        org.jsoup.parser.Token.Character character68 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder57.insert(character68);
        org.jsoup.parser.ParseErrorList parseErrorList72 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder73 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings74 = xmlTreeBuilder73.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList75 = xmlTreeBuilder57.parseFragment("SYSTEM", "PUBLIC", parseErrorList72, parseSettings74);
        java.util.List<org.jsoup.nodes.Node> nodeList76 = xmlTreeBuilder40.parseFragment("#doctype", "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">", parseErrorList56, parseSettings74);
        org.jsoup.parser.ParseSettings parseSettings77 = xmlTreeBuilder40.defaultSettings();
        xmlTreeBuilder23.initialiseParse("SYSTEM", "EOF", parseErrorList39, parseSettings77);
        java.util.List<org.jsoup.nodes.Node> nodeList79 = xmlTreeBuilder0.parseFragment("SYSTEM", "<<!---->#doctype  name=\"\" publicId=\"hi!\" systemId=\"hi!\">", parseErrorList22, parseSettings77);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(character16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!---->" + "'", str17, "<!---->");
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(nodeList67);
        org.junit.Assert.assertNotNull(parseSettings74);
        org.junit.Assert.assertNotNull(nodeList75);
        org.junit.Assert.assertNotNull(nodeList76);
        org.junit.Assert.assertNotNull(parseSettings77);
        org.junit.Assert.assertNotNull(nodeList79);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Node node7 = documentType4.nextSibling();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "", "", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.parser.Token.Doctype doctype13 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder14 = doctype13.name;
        java.lang.StringBuilder stringBuilder15 = doctype13.systemIdentifier;
        java.lang.StringBuilder stringBuilder16 = documentType12.html(stringBuilder15);
        java.lang.StringBuilder stringBuilder17 = documentType4.html(stringBuilder15);
        org.jsoup.nodes.Node node18 = documentType4.parentNode();
        java.lang.String str19 = documentType4.nodeName();
        org.jsoup.nodes.Node node21 = documentType4.removeAttr("<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">");
        boolean boolean23 = documentType4.hasAttr("#doctype");
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
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#doctype" + "'", str19, "#doctype");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean9 = documentType4.equals(obj8);
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.siblingNodes();
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = documentType4.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType1 = endTag0.type;
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        endTag0.setEmptyAttributeValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = endTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tokenType1 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType1.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(endTag2);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.String str3 = comment0.toString();
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = token4.isComment();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
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
        org.jsoup.parser.Token.Tag tag37 = startTag0.name("hi!");
        // The following exception was thrown during execution in test generation
        try {
            startTag0.newAttribute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(tag37);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        boolean boolean7 = documentType4.hasAttr("");
        org.jsoup.nodes.Node node8 = documentType4.parentNode();
        int int9 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node10 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("SYSTEM", "SYSTEM", "#doctype", "SYSTEM");
        org.jsoup.nodes.Node node17 = documentType15.removeAttr("PUBLIC");
        org.jsoup.nodes.Node node19 = documentType15.removeAttr("StartTag");
        org.jsoup.parser.Token.Doctype doctype20 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder21 = doctype20.name;
        boolean boolean22 = doctype20.forceQuirks;
        java.lang.String str23 = doctype20.getPublicIdentifier();
        boolean boolean24 = doctype20.isForceQuirks();
        java.lang.StringBuilder stringBuilder25 = doctype20.publicIdentifier;
        java.lang.String str26 = doctype20.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder27 = doctype20.publicIdentifier;
        boolean boolean28 = node19.hasSameValue((java.lang.Object) doctype20);
        // The following exception was thrown during execution in test generation
        try {
            node10.replaceWith(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
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
        java.lang.String str52 = startTag51.normalName;
        startTag51.newAttribute();
        java.lang.String str54 = startTag51.normalName();
        startTag51.appendAttributeName("");
        startTag51.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag59 = startTag51.reset();
        org.jsoup.parser.Token.StartTag startTag61 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag62 = startTag61.reset();
        org.jsoup.parser.Token.Tag tag63 = startTag61.reset();
        org.jsoup.nodes.Attributes attributes64 = startTag61.getAttributes();
        org.jsoup.parser.Token.StartTag startTag65 = startTag51.nameAttr("Doctype", attributes64);
        boolean boolean66 = xmlTreeBuilder0.processStartTag("#", attributes64);
        org.jsoup.nodes.Document document69 = xmlTreeBuilder0.parse("", "<<!---->>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node71 = document69.before("Doctype");
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
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(tag59);
        org.junit.Assert.assertNotNull(tag62);
        org.junit.Assert.assertNotNull(tag63);
        org.junit.Assert.assertNotNull(attributes64);
        org.junit.Assert.assertNotNull(startTag65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(document69);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        boolean boolean4 = comment0.isEOF();
        java.lang.String str5 = comment0.toString();
        java.lang.String str6 = comment0.getData();
        java.lang.String str7 = comment0.getData();
        boolean boolean8 = comment0.isCharacter();
        boolean boolean9 = comment0.bogus;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
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
        java.lang.String str18 = comment11.getData();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
        boolean boolean9 = documentType4.equals((java.lang.Object) 0L);
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        int int11 = documentType4.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
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
        org.jsoup.parser.ParseErrorList parseErrorList82 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder83 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList86 = null;
        org.jsoup.parser.ParseSettings parseSettings87 = null;
        xmlTreeBuilder83.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList86, parseSettings87);
        org.jsoup.parser.ParseErrorList parseErrorList91 = null;
        org.jsoup.parser.ParseSettings parseSettings92 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList93 = xmlTreeBuilder83.parseFragment("", "#doctype", parseErrorList91, parseSettings92);
        org.jsoup.nodes.Document document96 = xmlTreeBuilder83.parse("SYSTEM", "Doctype");
        org.jsoup.parser.ParseSettings parseSettings97 = xmlTreeBuilder83.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList98 = xmlTreeBuilder0.parseFragment("<<SYSTEM>>", "PUBLIC", parseErrorList82, parseSettings97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(nodeList93);
        org.junit.Assert.assertNotNull(document96);
        org.junit.Assert.assertNotNull(parseSettings97);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        java.lang.String str7 = documentType4.baseUri();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        java.lang.String str10 = documentType4.nodeName();
        org.jsoup.nodes.Node node11 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node11.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SYSTEM" + "'", str7, "SYSTEM");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        xmlTreeBuilder0.initialiseParse("", "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">", parseErrorList4, parseSettings5);
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str9 = startTag8.normalName;
        startTag8.newAttribute();
        org.jsoup.parser.Token.Tag tag11 = startTag8.reset();
        java.lang.String str12 = startTag8.normalName();
        startTag8.selfClosing = false;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = xmlTreeBuilder0.insert(startTag8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag2 = startTag0.reset();
        org.jsoup.nodes.DocumentType documentType8 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str9 = documentType8.nodeName();
        org.jsoup.nodes.Attributes attributes10 = documentType8.attributes();
        org.jsoup.parser.Token.StartTag startTag11 = startTag0.nameAttr("", attributes10);
        org.jsoup.parser.Token.Tag tag12 = startTag11.reset();
        org.jsoup.parser.Token.Tag tag13 = startTag11.reset();
        startTag11.appendAttributeName('a');
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(tag13);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.Tag tag3 = tag1.reset();
        tag3.appendTagName('#');
        org.jsoup.parser.Token.StartTag startTag6 = tag3.asStartTag();
        startTag6.tagName = "<SYSTEM>";
        startTag6.appendAttributeName('4');
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(startTag6);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.AfterFrameset;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        xmlTreeBuilder1.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList4, parseSettings5);
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.ParseSettings parseSettings10 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlTreeBuilder1.parseFragment("", "#doctype", parseErrorList9, parseSettings10);
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder13 = comment12.data;
        java.lang.String str14 = comment12.toString();
        org.jsoup.parser.Token token15 = comment12.reset();
        boolean boolean16 = xmlTreeBuilder1.process((org.jsoup.parser.Token) comment12);
        java.lang.String str17 = comment12.toString();
        comment12.bogus = false;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) comment12, htmlTreeBuilder20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!---->" + "'", str14, "<!---->");
        org.junit.Assert.assertNotNull(token15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!---->" + "'", str17, "<!---->");
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder3 = doctype0.publicIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        boolean boolean3 = tag1.selfClosing;
        tag1.setEmptyAttributeValue();
        boolean boolean5 = tag1.isCharacter();
        org.jsoup.nodes.Attributes attributes6 = tag1.getAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag7 = tag1.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        boolean boolean5 = document3.hasAttr("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node7 = document3.removeAttr("EOF");
        org.jsoup.nodes.Document document8 = node7.ownerDocument();
        boolean boolean10 = document8.hasAttr("<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = document8.after("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.InRow;
        org.jsoup.parser.Token.Doctype doctype1 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder2 = doctype1.name;
        boolean boolean3 = doctype1.forceQuirks;
        java.lang.String str4 = doctype1.getPublicIdentifier();
        org.jsoup.parser.Token token5 = doctype1.reset();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) doctype1, htmlTreeBuilder6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(token5);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.String str10 = documentType4.absUrl("4");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        boolean boolean8 = documentType4.hasAttr("#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.Tag tag3 = tag1.reset();
        org.jsoup.nodes.Attributes attributes4 = tag3.attributes;
        java.lang.String str5 = tag3.tokenType();
        tag3.selfClosing = true;
        boolean boolean8 = tag3.isSelfClosing();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = tag3.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "SYSTEM", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType10 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean12 = documentType10.hasSameValue((java.lang.Object) (short) -1);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType10.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType10.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            document5.replaceWith((org.jsoup.nodes.Node) documentType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        java.lang.String str7 = documentType4.baseUri();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.Object obj9 = null;
        boolean boolean10 = node8.equals(obj9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SYSTEM" + "'", str7, "SYSTEM");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        int int8 = documentType4.childNodeSize();
        java.lang.String str9 = documentType4.baseUri();
        int int10 = documentType4.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SYSTEM" + "'", str9, "SYSTEM");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.Tag tag3 = tag1.reset();
        org.jsoup.nodes.Attributes attributes4 = tag3.attributes;
        org.jsoup.parser.Token.Tag tag5 = tag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag3.asStartTag();
        org.jsoup.parser.Token.TokenType tokenType7 = null;
        startTag6.type = tokenType7;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character9 = startTag6.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("SYSTEM", "SYSTEM", "SYSTEM", "SYSTEM");
        java.lang.String str5 = documentType4.nodeName();
        java.lang.String str7 = documentType4.attr("#");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
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
        java.lang.String str15 = startTag0.normalName;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = startTag0.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EOF" + "'", str15, "EOF");
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        java.lang.String str9 = documentType4.nodeName();
        java.lang.String str10 = documentType4.nodeName();
        org.jsoup.nodes.Node node11 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = node11.hasAttr("#");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        tag1.appendTagName('4');
        int[] intArray8 = new int[] { 0, ' ', '#' };
        tag1.appendAttributeValue(intArray8);
        boolean boolean10 = tag1.isDoctype();
        java.lang.String str11 = tag1.tagName;
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0, 32, 35 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4" + "'", str11, "4");
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
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
        java.lang.String str20 = startTag0.normalName;
        boolean boolean21 = startTag0.isComment();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!---->" + "'", str20, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = documentType4.before("EOF");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("#doctype");
        java.lang.String str10 = documentType4.nodeName();
        org.jsoup.nodes.Node node11 = documentType4.previousSibling();
        java.lang.String str12 = documentType4.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str6, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        boolean boolean5 = document3.hasAttr("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        boolean boolean7 = document3.hasAttr("PUBLIC");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = document3.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
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
        boolean boolean36 = startTag0.selfClosing;
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
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
        // The following exception was thrown during execution in test generation
        try {
            documentType17.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#doctype" + "'", str18, "#doctype");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.InHeadNoscript;
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str2 = startTag1.normalName;
        startTag1.newAttribute();
        java.lang.String str4 = startTag1.normalName();
        startTag1.appendAttributeName("");
        startTag1.normalName = "hi!";
        startTag1.appendTagName("PUBLIC");
        org.jsoup.parser.Token.Tag tag11 = startTag1.reset();
        tag11.tagName = "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">";
        tag11.selfClosing = false;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) tag11, htmlTreeBuilder16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "SYSTEM", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("<SYSTEM>", "Doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node7.before("<SYSTEM>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
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
        char[] charArray36 = new char[] { 'a', ' ', '4', ' ' };
        tag1.appendAttributeValue(charArray36);
        tag1.appendTagName('4');
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
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { 'a', ' ', '4', ' ' });
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.String str3 = doctype0.getSystemIdentifier();
        java.lang.String str4 = doctype0.getSystemIdentifier();
        doctype0.forceQuirks = false;
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        java.lang.String str9 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        int int8 = documentType4.childNodeSize();
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node10 = documentType4.clone();
        org.jsoup.nodes.Node node11 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodes();
        java.lang.String str14 = documentType4.attr("<!---->4");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = documentType4.before("<SYSTEM>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SYSTEM" + "'", str9, "SYSTEM");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        boolean boolean5 = startTag0.isSelfClosing();
        org.jsoup.nodes.Attributes attributes6 = startTag0.getAttributes();
        startTag0.appendTagName("<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">>");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
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
        java.lang.String str39 = startTag38.normalName;
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "4doctype" + "'", str39, "4doctype");
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<<!---->#doctype  name=\"\" publicId=\"hi!\" systemId=\"hi!\">", "<!DOCTYPE PUBLIC>", "4doctype", "<!DOCTYPE PUBLIC>");
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("SYSTEM", "SYSTEM", "#doctype", "SYSTEM");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("PUBLIC");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node6.childNodes();
        org.jsoup.nodes.Node node8 = node6.nextSibling();
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node6.traverse(nodeVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
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
        org.jsoup.parser.Token token13 = doctype4.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character14 = token13.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(token13);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        java.lang.String str4 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag6 = tag5.reset();
        boolean boolean7 = tag5.selfClosing;
        boolean boolean8 = tag5.isSelfClosing();
        org.jsoup.nodes.Attributes attributes9 = tag5.attributes;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = tag5.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.Tag tag3 = tag1.reset();
        boolean boolean4 = tag3.selfClosing;
        boolean boolean5 = tag3.isSelfClosing();
        tag3.appendAttributeName("<<!---->  name=\"\" publicId=\"hi!\" systemId=\"hi!\">");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int12 = documentType11.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType11.childNodes();
        java.lang.String str14 = documentType11.nodeName();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document18 = xmlTreeBuilder15.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment19 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder20 = comment19.data;
        xmlTreeBuilder15.insert(comment19);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        xmlTreeBuilder22.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList25, parseSettings26);
        org.jsoup.parser.Token.Character character28 = new org.jsoup.parser.Token.Character();
        java.lang.String str29 = character28.getData();
        org.jsoup.parser.Token.Character character31 = character28.data("<!---->");
        java.lang.String str32 = character31.getData();
        xmlTreeBuilder22.insert(character31);
        xmlTreeBuilder15.insert(character31);
        org.jsoup.parser.Token.Comment comment35 = new org.jsoup.parser.Token.Comment();
        comment35.bogus = false;
        java.lang.StringBuilder stringBuilder38 = comment35.data;
        java.lang.String str39 = comment35.getData();
        boolean boolean40 = xmlTreeBuilder15.process((org.jsoup.parser.Token) comment35);
        org.jsoup.parser.ParseErrorList parseErrorList43 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder44 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        org.jsoup.parser.ParseSettings parseSettings48 = null;
        xmlTreeBuilder44.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList47, parseSettings48);
        org.jsoup.parser.ParseErrorList parseErrorList52 = null;
        org.jsoup.parser.ParseSettings parseSettings53 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList54 = xmlTreeBuilder44.parseFragment("", "#doctype", parseErrorList52, parseSettings53);
        org.jsoup.parser.Token.Comment comment55 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder56 = comment55.data;
        java.lang.String str57 = comment55.toString();
        org.jsoup.parser.Token token58 = comment55.reset();
        boolean boolean59 = xmlTreeBuilder44.process((org.jsoup.parser.Token) comment55);
        org.jsoup.parser.ParseSettings parseSettings60 = xmlTreeBuilder44.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings61 = xmlTreeBuilder44.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList62 = xmlTreeBuilder15.parseFragment("<!DOCTYPE PUBLIC>", "<!---->4", parseErrorList43, parseSettings61);
        boolean boolean63 = documentType11.equals((java.lang.Object) "<!---->4");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(character31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<!---->" + "'", str32, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder38);
        org.junit.Assert.assertEquals(stringBuilder38.toString(), "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(nodeList54);
        org.junit.Assert.assertNotNull(stringBuilder56);
        org.junit.Assert.assertEquals(stringBuilder56.toString(), "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "<!---->" + "'", str57, "<!---->");
        org.junit.Assert.assertNotNull(token58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(parseSettings60);
        org.junit.Assert.assertNotNull(parseSettings61);
        org.junit.Assert.assertNotNull(nodeList62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">");
        document13.setBaseUri("EOF");
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean22 = documentType20.hasSameValue((java.lang.Object) (short) -1);
        java.util.List<org.jsoup.nodes.Node> nodeList23 = documentType20.siblingNodes();
        documentType20.setBaseUri("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node26 = documentType20.parentNode();
        java.lang.String str27 = documentType20.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = document13.after((org.jsoup.nodes.Node) documentType20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#doctype" + "'", str27, "#doctype");
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.parser.Token.Character character6 = new org.jsoup.parser.Token.Character();
        java.lang.String str7 = character6.toString();
        java.lang.String str8 = character6.toString();
        boolean boolean9 = documentType4.equals((java.lang.Object) str8);
        org.jsoup.nodes.Node node10 = documentType4.clone();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "#doctype", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("SYSTEM", "Doctype");
        org.jsoup.parser.Token.Doctype doctype14 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder15 = doctype14.name;
        java.lang.StringBuilder stringBuilder16 = doctype14.systemIdentifier;
        boolean boolean17 = doctype14.isComment();
        org.jsoup.parser.Token.Doctype doctype18 = doctype14.asDoctype();
        java.lang.String str19 = doctype14.getName();
        java.lang.StringBuilder stringBuilder20 = doctype14.name;
        xmlTreeBuilder0.insert(doctype14);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag22 = doctype14.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doctype18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.String str3 = doctype0.getSystemIdentifier();
        java.lang.String str4 = doctype0.getSystemIdentifier();
        doctype0.forceQuirks = false;
        boolean boolean7 = doctype0.forceQuirks;
        doctype0.forceQuirks = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
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
        org.jsoup.parser.Token.TokenType tokenType22 = tag1.type;
        org.jsoup.parser.Token token23 = tag1.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype24 = token23.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + tokenType22 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType22.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(token23);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        java.lang.String str2 = comment0.toString();
        org.jsoup.parser.Token token3 = comment0.reset();
        org.jsoup.parser.Token token4 = comment0.reset();
        java.lang.String str5 = comment0.toString();
        comment0.bogus = false;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.forceQuirks;
        org.jsoup.parser.Token token3 = doctype0.reset();
        org.jsoup.parser.Token.TokenType tokenType4 = doctype0.type;
        boolean boolean5 = doctype0.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType6 = doctype0.type;
        java.lang.String str7 = doctype0.getSystemIdentifier();
        boolean boolean8 = doctype0.forceQuirks;
        boolean boolean9 = doctype0.forceQuirks;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag10 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeName("doctype");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = endTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        startTag0.tagName = "<SYSTEM>";
        org.jsoup.nodes.Attributes attributes5 = startTag0.getAttributes();
        java.lang.String str6 = startTag0.normalName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype7 = startTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
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
        boolean boolean16 = doctype6.forceQuirks;
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node8 = documentType4.attr("hi!", "hi!");
        java.lang.String str10 = node8.absUrl("Doctype");
        node8.setBaseUri("");
        org.jsoup.nodes.Node node13 = node8.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node13.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        java.lang.String str9 = documentType4.attr("StartTag");
        org.jsoup.nodes.Node node10 = documentType4.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = node10.childNodeSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        java.lang.String str9 = documentType4.attr("StartTag");
        org.jsoup.nodes.Node node10 = documentType4.parent();
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("Comment");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
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
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str25 = startTag24.normalName;
        startTag24.newAttribute();
        java.lang.String str27 = startTag24.normalName();
        startTag24.appendAttributeName("");
        startTag24.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag32 = startTag24.reset();
        org.jsoup.parser.Token.Tag tag33 = startTag24.reset();
        org.jsoup.nodes.Attributes attributes34 = startTag24.attributes;
        boolean boolean35 = xmlTreeBuilder0.processStartTag("doctype", attributes34);
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str37 = startTag36.normalName;
        startTag36.newAttribute();
        java.lang.String str39 = startTag36.normalName();
        startTag36.appendAttributeName("");
        startTag36.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag44 = startTag36.reset();
        startTag36.appendTagName(' ');
        boolean boolean47 = startTag36.isEOF();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element48 = xmlTreeBuilder0.insert(startTag36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(token21);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataEscapedEndTagName;
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
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
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
        java.lang.String str15 = documentType4.attr("<!---->");
        org.jsoup.nodes.Document document16 = documentType4.ownerDocument();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(document16);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        java.lang.String str4 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        boolean boolean6 = startTag0.isDoctype();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character7 = startTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = documentType4.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str6, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = document18.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        int int8 = documentType4.childNodeSize();
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node10 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodesCopy();
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = documentType4.traverse(nodeVisitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SYSTEM" + "'", str9, "SYSTEM");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
        boolean boolean9 = documentType4.equals((java.lang.Object) 0L);
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = documentType4.before("<<SYSTEM>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
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
        java.lang.String str15 = documentType4.attr("<!---->");
        org.jsoup.nodes.Node node16 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = documentType4.after("<!DOCTYPE PUBLIC>");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
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
        org.jsoup.parser.Token.Tag tag16 = startTag12.reset();
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag18 = startTag17.reset();
        tag18.finaliseTag();
        tag18.appendTagName('4');
        org.jsoup.nodes.Attributes attributes22 = tag18.getAttributes();
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag24 = startTag23.reset();
        tag24.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str27 = startTag26.normalName;
        startTag26.newAttribute();
        java.lang.String str29 = startTag26.normalName();
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag32 = startTag31.reset();
        tag32.finaliseTag();
        org.jsoup.nodes.DocumentType documentType38 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean40 = documentType38.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes41 = documentType38.attributes();
        tag32.attributes = attributes41;
        org.jsoup.parser.Token.StartTag startTag43 = startTag26.nameAttr("<!---->", attributes41);
        tag24.attributes = attributes41;
        char[] charArray46 = new char[] { 'a' };
        tag24.appendAttributeValue(charArray46);
        tag18.appendAttributeValue(charArray46);
        tag16.appendAttributeValue(charArray46);
        org.jsoup.parser.Token.StartTag startTag50 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag51 = startTag50.reset();
        org.jsoup.parser.Token.Tag tag52 = startTag50.reset();
        org.jsoup.parser.Token.StartTag startTag53 = tag52.asStartTag();
        boolean boolean54 = tag52.selfClosing;
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
        tag52.appendAttributeValue(intArray90);
        tag16.appendAttributeValue(intArray90);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertNotNull(startTag43);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] { 'a' });
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertNotNull(tag52);
        org.junit.Assert.assertNotNull(startTag53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
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
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
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
        java.lang.String str12 = doctype0.getName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("SYSTEM", "SYSTEM", "#doctype", "SYSTEM");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("PUBLIC");
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("StartTag");
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node8.traverse(nodeVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        java.lang.String str9 = documentType4.attr("StartTag");
        java.lang.String str11 = documentType4.attr("<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodesCopy();
        int int13 = documentType4.siblingIndex();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document17 = xmlTreeBuilder14.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment18 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder19 = comment18.data;
        xmlTreeBuilder14.insert(comment18);
        org.jsoup.parser.Token.Character character21 = new org.jsoup.parser.Token.Character();
        java.lang.String str22 = character21.getData();
        org.jsoup.parser.Token.Character character24 = character21.data("<!---->");
        xmlTreeBuilder14.insert(character21);
        org.jsoup.nodes.Document document28 = xmlTreeBuilder14.parse("", "<!---->4");
        org.jsoup.nodes.Document document31 = xmlTreeBuilder14.parse("<<!---->#doctype  name=\"\" publicId=\"hi!\" systemId=\"hi!\">", "<!DOCTYPE PUBLIC>");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) document31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(character24);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(document31);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = documentType4.clone();
        org.jsoup.nodes.Node node8 = node7.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node7.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        int int8 = documentType4.childNodeSize();
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node10 = documentType4.clone();
        org.jsoup.nodes.Node node11 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodes();
        java.lang.String str14 = documentType4.attr("<!---->4");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = documentType4.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SYSTEM" + "'", str9, "SYSTEM");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "SYSTEM", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node6 = documentType4.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodes();
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        java.lang.String str7 = documentType4.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SYSTEM" + "'", str7, "SYSTEM");
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
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
        java.lang.String str13 = comment6.toString();
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!---->" + "'", str10, "<!---->");
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!---->", "#", "<<SYSTEM>>", "EOF");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodes();
        org.junit.Assert.assertNotNull(nodeList5);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
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
        java.lang.String str63 = character58.getData();
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
        org.junit.Assert.assertNull(str63);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isComment();
        org.jsoup.parser.Token.Doctype doctype4 = doctype0.asDoctype();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag5 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(doctype4);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag15 = token14.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(token14);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.Tag tag3 = tag1.reset();
        org.jsoup.nodes.Attributes attributes4 = tag3.attributes;
        java.lang.String str5 = tag3.normalName;
        java.lang.String str6 = tag3.normalName;
        java.lang.String str7 = tag3.normalName();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.Tag tag3 = tag1.reset();
        org.jsoup.nodes.Attributes attributes4 = tag3.attributes;
        org.jsoup.parser.Token.Tag tag5 = tag3.reset();
        tag5.normalName = "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">";
        tag5.setEmptyAttributeValue();
        java.lang.String str9 = tag5.normalName;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment10 = tag5.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
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
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        java.lang.String str4 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        boolean boolean6 = startTag0.isDoctype();
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("Doctype");
        java.lang.String str9 = startTag0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<Doctype>" + "'", str9, "<Doctype>");
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node8 = documentType4.attr("hi!", "hi!");
        java.lang.String str10 = node8.absUrl("Doctype");
        node8.setBaseUri("");
        org.jsoup.nodes.Attributes attributes13 = node8.attributes();
        org.jsoup.nodes.Node node14 = node8.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node14.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        int int8 = documentType4.childNodeSize();
        java.lang.String str9 = documentType4.baseUri();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.Attributes attributes11 = documentType4.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SYSTEM" + "'", str9, "SYSTEM");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SYSTEM" + "'", str10, "SYSTEM");
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
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
        boolean boolean32 = startTag29.isEndTag();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 1, 1, 0 });
        org.junit.Assert.assertNotNull(startTag29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.AfterAfterBody;
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = startTag1.attributes;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) startTag1, htmlTreeBuilder3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertNotNull(attributes2);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        java.lang.String str7 = documentType4.baseUri();
        java.lang.String str9 = documentType4.attr("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = documentType4.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SYSTEM" + "'", str7, "SYSTEM");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        boolean boolean5 = document3.hasAttr("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        boolean boolean7 = document3.hasAttr("PUBLIC");
        org.jsoup.nodes.Node node10 = document3.attr("<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">>", "StartTag");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = document3.after("<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "#doctype", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("SYSTEM", "SYSTEM");
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.ParseSettings parseSettings21 = null;
        xmlTreeBuilder17.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList20, parseSettings21);
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        xmlTreeBuilder17.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList25, parseSettings26);
        org.jsoup.parser.Token.Comment comment28 = new org.jsoup.parser.Token.Comment();
        comment28.bogus = false;
        java.lang.StringBuilder stringBuilder31 = comment28.data;
        org.jsoup.parser.Token.Comment comment32 = comment28.asComment();
        xmlTreeBuilder17.insert(comment28);
        org.jsoup.parser.Token.Comment comment34 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder35 = comment34.data;
        java.lang.String str36 = comment34.toString();
        org.jsoup.parser.Token token37 = comment34.reset();
        org.jsoup.parser.Token token38 = comment34.reset();
        xmlTreeBuilder17.insert(comment34);
        org.jsoup.parser.Token.Comment comment40 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder41 = comment40.data;
        java.lang.String str42 = comment40.toString();
        org.jsoup.parser.Token token43 = comment40.reset();
        org.jsoup.parser.Token token44 = comment40.reset();
        java.lang.String str45 = comment40.toString();
        org.jsoup.parser.Token.Comment comment46 = comment40.asComment();
        xmlTreeBuilder17.insert(comment40);
        org.jsoup.parser.ParseErrorList parseErrorList50 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder51 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        org.jsoup.parser.ParseSettings parseSettings55 = null;
        xmlTreeBuilder51.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList54, parseSettings55);
        org.jsoup.parser.ParseErrorList parseErrorList59 = null;
        org.jsoup.parser.ParseSettings parseSettings60 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList61 = xmlTreeBuilder51.parseFragment("", "#doctype", parseErrorList59, parseSettings60);
        org.jsoup.nodes.Document document64 = xmlTreeBuilder51.parse("SYSTEM", "Doctype");
        org.jsoup.parser.ParseErrorList parseErrorList67 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder68 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document71 = xmlTreeBuilder68.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment72 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder73 = comment72.data;
        xmlTreeBuilder68.insert(comment72);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder75 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList78 = null;
        org.jsoup.parser.ParseSettings parseSettings79 = null;
        xmlTreeBuilder75.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList78, parseSettings79);
        org.jsoup.parser.Token.Character character81 = new org.jsoup.parser.Token.Character();
        java.lang.String str82 = character81.getData();
        org.jsoup.parser.Token.Character character84 = character81.data("<!---->");
        java.lang.String str85 = character84.getData();
        xmlTreeBuilder75.insert(character84);
        xmlTreeBuilder68.insert(character84);
        org.jsoup.parser.ParseSettings parseSettings88 = xmlTreeBuilder68.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList89 = xmlTreeBuilder51.parseFragment("#doctype", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", parseErrorList67, parseSettings88);
        xmlTreeBuilder17.initialiseParse("<!DOCTYPE PUBLIC>", "SYSTEM", parseErrorList50, parseSettings88);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList91 = xmlTreeBuilder0.parseFragment("<!---->4", "<<!---->#doctype  name=\"\" publicId=\"hi!\" systemId=\"hi!\">", parseErrorList16, parseSettings88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(stringBuilder31);
        org.junit.Assert.assertEquals(stringBuilder31.toString(), "");
        org.junit.Assert.assertNotNull(comment32);
        org.junit.Assert.assertNotNull(stringBuilder35);
        org.junit.Assert.assertEquals(stringBuilder35.toString(), "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<!---->" + "'", str36, "<!---->");
        org.junit.Assert.assertNotNull(token37);
        org.junit.Assert.assertNotNull(token38);
        org.junit.Assert.assertNotNull(stringBuilder41);
        org.junit.Assert.assertEquals(stringBuilder41.toString(), "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<!---->" + "'", str42, "<!---->");
        org.junit.Assert.assertNotNull(token43);
        org.junit.Assert.assertNotNull(token44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "<!---->" + "'", str45, "<!---->");
        org.junit.Assert.assertNotNull(comment46);
        org.junit.Assert.assertNotNull(nodeList61);
        org.junit.Assert.assertNotNull(document64);
        org.junit.Assert.assertNotNull(document71);
        org.junit.Assert.assertNotNull(stringBuilder73);
        org.junit.Assert.assertEquals(stringBuilder73.toString(), "");
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNotNull(character84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "<!---->" + "'", str85, "<!---->");
        org.junit.Assert.assertNotNull(parseSettings88);
        org.junit.Assert.assertNotNull(nodeList89);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        int int8 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("<!---->4");
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("<!---->4");
        java.lang.String str13 = documentType4.toString();
        org.jsoup.select.NodeVisitor nodeVisitor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = documentType4.traverse(nodeVisitor14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str13, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
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
        org.jsoup.nodes.DocumentType documentType43 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean45 = documentType43.hasAttr("hi!");
        org.jsoup.nodes.Node node46 = documentType43.clone();
        org.jsoup.parser.Token.StartTag startTag47 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag48 = startTag47.reset();
        org.jsoup.parser.Token.Tag tag49 = startTag47.reset();
        org.jsoup.parser.Token.StartTag startTag50 = tag49.asStartTag();
        org.jsoup.parser.Token.StartTag startTag51 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str52 = startTag51.normalName;
        org.jsoup.nodes.Attributes attributes53 = startTag51.attributes;
        startTag50.attributes = attributes53;
        boolean boolean55 = documentType43.equals((java.lang.Object) attributes53);
        boolean boolean56 = xmlTreeBuilder0.processStartTag("<<SYSTEM>>", attributes53);
        org.jsoup.parser.Token.Character character57 = new org.jsoup.parser.Token.Character();
        java.lang.String str58 = character57.toString();
        java.lang.String str59 = character57.getData();
        org.jsoup.parser.Token.Character character61 = character57.data("SYSTEM");
        xmlTreeBuilder0.insert(character61);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype63 = character61.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertNotNull(startTag50);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(attributes53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(character61);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isComment();
        java.lang.String str4 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        boolean boolean6 = doctype0.forceQuirks;
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.String str8 = doctype0.getSystemIdentifier();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        int int8 = documentType4.childNodeSize();
        java.lang.String str9 = documentType4.baseUri();
        java.lang.String str11 = documentType4.absUrl("<!---->4");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SYSTEM" + "'", str9, "SYSTEM");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Node node7 = documentType4.nextSibling();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "", "", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.parser.Token.Doctype doctype13 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder14 = doctype13.name;
        java.lang.StringBuilder stringBuilder15 = doctype13.systemIdentifier;
        java.lang.StringBuilder stringBuilder16 = documentType12.html(stringBuilder15);
        java.lang.StringBuilder stringBuilder17 = documentType4.html(stringBuilder15);
        org.jsoup.nodes.Node node18 = documentType4.parentNode();
        java.lang.String str19 = documentType4.nodeName();
        org.jsoup.nodes.DocumentType documentType24 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean26 = documentType24.hasAttr("hi!");
        org.jsoup.nodes.Node node27 = documentType24.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = documentType24.childNodesCopy();
        boolean boolean29 = documentType4.hasSameValue((java.lang.Object) documentType24);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = documentType4.before("4");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#doctype" + "'", str19, "#doctype");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag2 = startTag0.reset();
        org.jsoup.parser.Token.StartTag startTag3 = tag2.asStartTag();
        boolean boolean4 = tag2.selfClosing;
        tag2.appendAttributeValue('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = tag2.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment16 = startTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<SYSTEM>" + "'", str13, "<SYSTEM>");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<SYSTEM>" + "'", str15, "<SYSTEM>");
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        tag4.appendTagName('4');
        org.jsoup.parser.Token token7 = tag4.reset();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(token7);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.Tag tag3 = tag1.reset();
        org.jsoup.nodes.Attributes attributes4 = tag3.attributes;
        java.lang.String str5 = tag3.tokenType();
        tag3.newAttribute();
        boolean boolean7 = tag3.isComment();
        org.jsoup.parser.Token.Tag tag9 = tag3.name("StartTag");
        tag9.appendAttributeValue("<!---->4");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        boolean boolean3 = tag1.selfClosing;
        tag1.setEmptyAttributeValue();
        boolean boolean5 = tag1.isCharacter();
        org.jsoup.nodes.Attributes attributes6 = tag1.getAttributes();
        tag1.appendTagName('#');
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        org.jsoup.nodes.Attributes attributes2 = startTag0.attributes;
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        tag3.appendTagName(' ');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertNotNull(tag3);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
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
        org.jsoup.parser.Token token18 = comment17.reset();
        java.lang.String str19 = comment17.toString();
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!---->" + "'", str16, "<!---->");
        org.junit.Assert.assertNotNull(comment17);
        org.junit.Assert.assertNotNull(token18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!---->" + "'", str19, "<!---->");
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        boolean boolean4 = doctype0.isStartTag();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        java.lang.String str7 = documentType4.baseUri();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node9.after("<!---->4");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SYSTEM" + "'", str7, "SYSTEM");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "#doctype", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("SYSTEM", "SYSTEM");
        java.lang.String str14 = document13.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            document13.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "SYSTEM" + "'", str14, "SYSTEM");
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
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
        boolean boolean15 = doctype6.isStartTag();
        boolean boolean16 = doctype6.isForceQuirks();
        org.jsoup.parser.Token.TokenType tokenType17 = doctype6.type;
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
        org.junit.Assert.assertTrue("'" + tokenType17 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType17.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("#doctype");
        java.lang.String str10 = documentType4.nodeName();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
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
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
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
        org.jsoup.nodes.Node node19 = node7.removeAttr("#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node7.after("Doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.Tag tag3 = tag1.reset();
        org.jsoup.nodes.Attributes attributes4 = tag3.attributes;
        java.lang.String str5 = tag3.tokenType();
        tag3.newAttribute();
        boolean boolean7 = tag3.isComment();
        org.jsoup.parser.Token.Tag tag9 = tag3.name("StartTag");
        tag9.finaliseTag();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str10 = startTag9.normalName;
        startTag9.newAttribute();
        java.lang.String str12 = startTag9.normalName();
        startTag9.appendAttributeName("");
        startTag9.normalName = "hi!";
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str19 = startTag18.normalName;
        org.jsoup.nodes.Attributes attributes20 = startTag18.attributes;
        org.jsoup.parser.Token.StartTag startTag21 = startTag9.nameAttr("SYSTEM", attributes20);
        boolean boolean22 = documentType4.equals((java.lang.Object) attributes20);
        org.jsoup.nodes.Node node24 = documentType4.removeAttr("<SYSTEM>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(startTag21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
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
        startTag14.tagName = "Doctype";
        org.jsoup.parser.Token.Tag tag17 = startTag14.reset();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertNotNull(tag17);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        java.lang.String str2 = comment0.toString();
        java.lang.String str3 = comment0.getData();
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        org.jsoup.parser.Token token5 = comment0.reset();
        java.lang.String str6 = comment0.toString();
        comment0.bogus = true;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.Tag tag3 = tag1.reset();
        org.jsoup.nodes.Attributes attributes4 = tag3.attributes;
        java.lang.String str5 = tag3.tokenType();
        tag3.newAttribute();
        boolean boolean7 = tag3.isComment();
        org.jsoup.parser.Token.Tag tag9 = tag3.name("StartTag");
        org.jsoup.parser.Token.Tag tag10 = tag3.reset();
        org.jsoup.nodes.Attributes attributes11 = tag3.getAttributes();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document8 = node7.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        java.lang.String str7 = documentType4.baseUri();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        java.lang.String str10 = documentType4.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodesCopy();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SYSTEM" + "'", str7, "SYSTEM");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
        boolean boolean9 = documentType4.equals((java.lang.Object) 0L);
        org.jsoup.nodes.Node node10 = documentType4.nextSibling();
        java.lang.String str11 = documentType4.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = documentType4.attr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "SYSTEM" + "'", str11, "SYSTEM");
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.String str5 = doctype0.getName();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "SYSTEM", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.Node node5 = documentType4.parentNode();
        org.jsoup.select.NodeVisitor nodeVisitor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = node5.traverse(nodeVisitor6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        java.lang.String str7 = documentType4.baseUri();
        org.jsoup.nodes.Node node8 = documentType4.parent();
        java.lang.String str9 = documentType4.toString();
        java.lang.String str10 = documentType4.outerHtml();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SYSTEM" + "'", str7, "SYSTEM");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str9, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str10, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
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
        org.jsoup.nodes.Node node94 = document92.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList95 = document92.siblingNodes();
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
        org.junit.Assert.assertNull(node94);
        org.junit.Assert.assertNotNull(nodeList95);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.nodes.DocumentType documentType7 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean9 = documentType7.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes10 = documentType7.attributes();
        tag1.attributes = attributes10;
        java.lang.String str12 = tag1.tagName;
        boolean boolean13 = tag1.selfClosing;
        boolean boolean14 = tag1.selfClosing;
        tag1.appendAttributeName("SYSTEM");
        boolean boolean17 = tag1.isEndTag();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        java.lang.String str8 = startTag0.normalName;
        startTag0.setEmptyAttributeValue();
        // The following exception was thrown during execution in test generation
        try {
            startTag0.newAttribute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
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
        tag10.appendAttributeName('a');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4" + "'", str13, "4");
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
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
        startTag0.setEmptyAttributeValue();
        boolean boolean16 = startTag0.isSelfClosing();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
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
        org.jsoup.nodes.Node node16 = document13.nextSibling();
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isComment();
        org.jsoup.parser.Token.Doctype doctype4 = doctype0.asDoctype();
        java.lang.String str5 = doctype0.getName();
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        java.lang.StringBuilder stringBuilder7 = doctype0.name;
        org.jsoup.parser.Token.reset(stringBuilder7);
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(doctype4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "SYSTEM", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("<SYSTEM>", "Doctype");
        org.jsoup.nodes.Node node8 = node7.previousSibling();
        java.lang.String str9 = node7.baseUri();
        org.jsoup.nodes.Attributes attributes10 = node7.attributes();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int16 = documentType15.siblingIndex();
        boolean boolean18 = documentType15.hasAttr("");
        org.jsoup.nodes.Node node19 = documentType15.parentNode();
        int int20 = documentType15.siblingIndex();
        org.jsoup.nodes.Node node21 = documentType15.clone();
        java.lang.String str22 = node21.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            node7.replaceWith(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str22, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        org.jsoup.parser.Token.Comment comment4 = comment0.asComment();
        boolean boolean5 = comment0.bogus;
        java.lang.String str6 = comment0.getData();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(comment4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag8 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes9 = null;
        tag8.attributes = attributes9;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node8 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node8.parentNode();
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "", "", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str15 = documentType14.baseUri();
        org.jsoup.nodes.Node node16 = documentType14.clone();
        org.jsoup.nodes.Document document17 = node16.ownerDocument();
        boolean boolean19 = node16.hasAttr("<<!---->#doctype  name=\"\" publicId=\"hi!\" systemId=\"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node8.before(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str15, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag2 = startTag0.reset();
        org.jsoup.parser.Token.StartTag startTag3 = tag2.asStartTag();
        boolean boolean4 = tag2.selfClosing;
        java.lang.String str5 = tag2.tagName;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = tag2.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isComment();
        org.jsoup.parser.Token.Doctype doctype4 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        boolean boolean6 = doctype0.forceQuirks;
        org.jsoup.parser.Token token7 = doctype0.reset();
        boolean boolean8 = doctype0.isComment();
        boolean boolean9 = doctype0.isEOF();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "SYSTEM", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.Node node5 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = node5.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
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
        boolean boolean15 = startTag0.isDoctype();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.Tag tag3 = tag1.reset();
        boolean boolean4 = tag3.selfClosing;
        tag3.appendTagName("4");
        java.lang.String str7 = tag3.normalName;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment8 = tag3.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4" + "'", str7, "4");
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "SYSTEM", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("<SYSTEM>", "Doctype");
        java.lang.String str8 = documentType4.outerHtml();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE PUBLIC \"SYSTEM\" \"<!DOCTYPE PUBLIC \"hi!\" \"hi!\">\">" + "'", str8, "<!DOCTYPE PUBLIC \"SYSTEM\" \"<!DOCTYPE PUBLIC \"hi!\" \"hi!\">\">");
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        java.lang.String str2 = comment0.toString();
        org.jsoup.parser.Token token3 = comment0.reset();
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = token4.isComment();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag6 = token4.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
        boolean boolean9 = documentType4.equals((java.lang.Object) 0L);
        org.jsoup.nodes.Node node10 = documentType4.previousSibling();
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str12 = startTag11.normalName;
        startTag11.newAttribute();
        java.lang.String str14 = startTag11.normalName();
        startTag11.appendAttributeName("");
        startTag11.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag19 = startTag11.reset();
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag22 = startTag21.reset();
        org.jsoup.parser.Token.Tag tag23 = startTag21.reset();
        org.jsoup.nodes.Attributes attributes24 = startTag21.getAttributes();
        org.jsoup.parser.Token.StartTag startTag25 = startTag11.nameAttr("Doctype", attributes24);
        startTag25.tagName = "Doctype";
        java.lang.String str28 = startTag25.normalName();
        boolean boolean29 = documentType4.equals((java.lang.Object) str28);
        boolean boolean31 = documentType4.hasAttr("PUBLIC");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(startTag25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "doctype" + "'", str28, "doctype");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
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
        org.jsoup.parser.Token.Tag tag37 = startTag0.name("hi!");
        boolean boolean38 = startTag0.isComment();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag39 = startTag0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
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
        java.lang.StringBuilder stringBuilder67 = doctype63.name;
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
        org.junit.Assert.assertNotNull(stringBuilder67);
        org.junit.Assert.assertEquals(stringBuilder67.toString(), "");
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.siblingNodes();
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean15 = documentType13.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Node node16 = documentType13.nextSibling();
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "", "", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.parser.Token.Doctype doctype22 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder23 = doctype22.name;
        java.lang.StringBuilder stringBuilder24 = doctype22.systemIdentifier;
        java.lang.StringBuilder stringBuilder25 = documentType21.html(stringBuilder24);
        java.lang.StringBuilder stringBuilder26 = documentType13.html(stringBuilder24);
        org.jsoup.parser.Token.Comment comment27 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder28 = comment27.data;
        java.lang.String str29 = comment27.toString();
        boolean boolean30 = comment27.isDoctype();
        boolean boolean31 = comment27.isCharacter();
        java.lang.StringBuilder stringBuilder32 = comment27.data;
        java.lang.StringBuilder stringBuilder33 = documentType13.html(stringBuilder32);
        java.lang.StringBuilder stringBuilder34 = node7.html(stringBuilder33);
        node7.setBaseUri("<SYSTEM>");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str6, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder24);
        org.junit.Assert.assertEquals(stringBuilder24.toString(), "<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">><!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">><!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">><!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "<!DOCTYPE PUBLIC \"hi!\" \"hi!\"><!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!---->" + "'", str29, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(stringBuilder32);
        org.junit.Assert.assertEquals(stringBuilder32.toString(), "<!DOCTYPE PUBLIC \"hi!\" \"hi!\"><!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder33);
        org.junit.Assert.assertEquals(stringBuilder33.toString(), "<!DOCTYPE PUBLIC \"hi!\" \"hi!\"><!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "<!DOCTYPE PUBLIC \"hi!\" \"hi!\"><!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.String str4 = comment0.getData();
        java.lang.String str5 = comment0.toString();
        java.lang.String str6 = comment0.getData();
        org.jsoup.parser.Token token7 = comment0.reset();
        java.lang.String str8 = comment0.tokenType();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Comment" + "'", str8, "Comment");
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.EndTagOpen;
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
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag2 = startTag0.reset();
        org.jsoup.nodes.DocumentType documentType8 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str9 = documentType8.nodeName();
        org.jsoup.nodes.Attributes attributes10 = documentType8.attributes();
        org.jsoup.parser.Token.StartTag startTag11 = startTag0.nameAttr("", attributes10);
        org.jsoup.parser.Token.Tag tag12 = startTag11.reset();
        org.jsoup.parser.Token.Tag tag13 = startTag11.reset();
        java.lang.String str14 = startTag11.tokenType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = startTag11.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "StartTag" + "'", str14, "StartTag");
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.AfterAfterBody;
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character();
        java.lang.String str2 = character1.getData();
        org.jsoup.parser.Token.Character character4 = character1.data("<!---->");
        java.lang.String str5 = character4.toString();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) character4, htmlTreeBuilder6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "SYSTEM", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("<SYSTEM>", "Doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node7.after("#doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
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
        org.jsoup.parser.ParseSettings parseSettings19 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str21 = startTag20.normalName;
        startTag20.newAttribute();
        java.lang.String str23 = startTag20.normalName();
        startTag20.appendAttributeName("");
        boolean boolean26 = startTag20.isSelfClosing();
        java.lang.String str27 = startTag20.normalName;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element28 = xmlTreeBuilder0.insert(startTag20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean9 = documentType4.equals(obj8);
        org.jsoup.nodes.Document document10 = documentType4.ownerDocument();
        java.lang.String str11 = documentType4.outerHtml();
        org.jsoup.nodes.Node node12 = documentType4.nextSibling();
        org.jsoup.nodes.Node node13 = documentType4.previousSibling();
        org.jsoup.parser.Token.Doctype doctype14 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder15 = doctype14.name;
        boolean boolean16 = doctype14.forceQuirks;
        java.lang.String str17 = doctype14.getSystemIdentifier();
        boolean boolean18 = doctype14.isComment();
        java.lang.StringBuilder stringBuilder19 = doctype14.systemIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder20 = node13.html(stringBuilder19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str11, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        org.jsoup.nodes.Attributes attributes2 = startTag0.attributes;
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        tag4.appendAttributeName('4');
        tag4.setEmptyAttributeValue();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        int int8 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("<!---->4");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.childNodesCopy();
        java.lang.String str12 = node10.outerHtml();
        org.jsoup.nodes.Node node15 = node10.attr("#", "StartTag");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str12, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Node node7 = documentType4.nextSibling();
        org.jsoup.parser.Token.Doctype doctype8 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder9 = doctype8.name;
        java.lang.StringBuilder stringBuilder10 = doctype8.systemIdentifier;
        boolean boolean11 = doctype8.isComment();
        boolean boolean12 = doctype8.isComment();
        boolean boolean13 = documentType4.hasSameValue((java.lang.Object) doctype8);
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.childNodes();
        org.jsoup.select.NodeVisitor nodeVisitor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = documentType4.traverse(nodeVisitor15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str58 = element49.attr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
        org.junit.Assert.assertNotNull(stringBuilder51);
        org.junit.Assert.assertEquals(stringBuilder51.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(stringBuilder55);
        org.junit.Assert.assertEquals(stringBuilder55.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder56);
        org.junit.Assert.assertEquals(stringBuilder56.toString(), "");
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
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
        org.jsoup.nodes.Document document79 = xmlTreeBuilder0.parse("<!DOCTYPE PUBLIC>", "<!DOCTYPE PUBLIC>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node81 = document79.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(document79);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        int int8 = documentType4.childNodeSize();
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node10 = documentType4.clone();
        org.jsoup.nodes.Node node11 = node10.parentNode();
        org.jsoup.nodes.Node node12 = node10.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node12.before("<<SYSTEM>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SYSTEM" + "'", str9, "SYSTEM");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        java.lang.String str9 = documentType4.attr("StartTag");
        java.lang.String str11 = documentType4.attr("<!---->");
        boolean boolean13 = documentType4.hasAttr("<<SYSTEM>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
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
        org.jsoup.parser.Token token13 = doctype4.reset();
        java.lang.String str14 = doctype4.getPublicIdentifier();
        boolean boolean15 = doctype4.isForceQuirks();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(token13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.Tag tag3 = tag1.reset();
        org.jsoup.nodes.Attributes attributes4 = tag3.attributes;
        org.jsoup.parser.Token.Tag tag5 = tag3.reset();
        tag5.normalName = "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">";
        boolean boolean8 = tag5.isStartTag();
        org.jsoup.parser.Token.StartTag startTag9 = tag5.asStartTag();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(startTag9);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        boolean boolean1 = eOF0.isDoctype();
        boolean boolean2 = eOF0.isEOF();
        org.jsoup.parser.Token token3 = eOF0.reset();
        boolean boolean4 = token3.isDoctype();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
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
        boolean boolean14 = doctype0.isStartTag();
        java.lang.StringBuilder stringBuilder15 = doctype0.name;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isComment();
        java.lang.String str4 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token5 = doctype0.reset();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(token5);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        int int8 = documentType4.childNodeSize();
        java.lang.String str9 = documentType4.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = documentType4.before("#doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SYSTEM" + "'", str9, "SYSTEM");
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag2 = startTag0.reset();
        org.jsoup.parser.Token.StartTag startTag3 = tag2.asStartTag();
        startTag3.finaliseTag();
        startTag3.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(startTag3);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        boolean boolean7 = documentType4.hasAttr("");
        org.jsoup.parser.Token.Doctype doctype8 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str9 = doctype8.getName();
        java.lang.String str10 = doctype8.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder11 = doctype8.systemIdentifier;
        java.lang.StringBuilder stringBuilder12 = documentType4.html(stringBuilder11);
        org.jsoup.parser.Token.Doctype doctype13 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder14 = doctype13.name;
        java.lang.StringBuilder stringBuilder15 = doctype13.systemIdentifier;
        boolean boolean16 = doctype13.isComment();
        org.jsoup.parser.Token.Doctype doctype17 = doctype13.asDoctype();
        java.lang.String str18 = doctype13.getName();
        java.lang.StringBuilder stringBuilder19 = doctype13.name;
        java.lang.Appendable appendable20 = documentType4.html((java.lang.Appendable) stringBuilder19);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(doctype17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(appendable20);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
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
        org.jsoup.parser.Token.StartTag startTag47 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element48 = xmlTreeBuilder0.insert(startTag47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        java.lang.String str9 = documentType4.nodeName();
        org.jsoup.nodes.Node node10 = documentType4.clone();
        int int11 = node10.childNodeSize();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag23 = startTag0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertNotNull(attributes22);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
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
        boolean boolean14 = comment6.bogus;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype15 = comment6.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!---->" + "'", str10, "<!---->");
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
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
        java.lang.String str15 = doctype6.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
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
        java.lang.String str20 = documentType4.outerHtml();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str7, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str20, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        startTag0.finaliseTag();
        startTag0.appendAttributeName(' ');
        boolean boolean6 = startTag0.selfClosing;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        boolean boolean3 = tag1.selfClosing;
        tag1.setEmptyAttributeValue();
        boolean boolean5 = tag1.isCharacter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = tag1.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
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
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder25 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document28 = xmlTreeBuilder25.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment29 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder30 = comment29.data;
        xmlTreeBuilder25.insert(comment29);
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
        java.lang.String str50 = startTag49.name();
        boolean boolean51 = xmlTreeBuilder25.process((org.jsoup.parser.Token) startTag49);
        org.jsoup.parser.Token.Character character52 = new org.jsoup.parser.Token.Character();
        java.lang.String str53 = character52.getData();
        xmlTreeBuilder25.insert(character52);
        org.jsoup.parser.Token.Character character56 = character52.data("");
        xmlTreeBuilder0.insert(character56);
        org.jsoup.parser.Token token58 = character56.reset();
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
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(stringBuilder30);
        org.junit.Assert.assertEquals(stringBuilder30.toString(), "");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(attributes47);
        org.junit.Assert.assertNotNull(startTag49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "<!---->" + "'", str50, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(character56);
        org.junit.Assert.assertNotNull(token58);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        int int8 = node7.siblingIndex();
        java.lang.String str10 = node7.absUrl("4");
        org.jsoup.nodes.Node node13 = node7.attr("PUBLIC", "<4>");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str6, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.toString();
        java.lang.String str2 = character0.getData();
        org.jsoup.parser.Token.Character character4 = character0.data("SYSTEM");
        java.lang.String str5 = character0.getData();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SYSTEM" + "'", str5, "SYSTEM");
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        startTag0.tagName = "<SYSTEM>";
        org.jsoup.nodes.Attributes attributes5 = startTag0.getAttributes();
        boolean boolean6 = startTag0.isEOF();
        startTag0.normalName = "<!---->4";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.Tag tag3 = tag1.reset();
        org.jsoup.nodes.Attributes attributes4 = tag3.attributes;
        org.jsoup.parser.Token.Tag tag5 = tag3.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = tag3.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(tag5);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes26 = node25.attributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("SYSTEM", "SYSTEM", "#doctype", "SYSTEM");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("PUBLIC");
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("StartTag");
        java.lang.String str10 = node8.absUrl("<!DOCTYPE #doctype PUBLIC \"4\" \"PUBLIC\">");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
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
        java.lang.StringBuilder stringBuilder44 = doctype35.name;
        doctype35.forceQuirks = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag47 = doctype35.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(stringBuilder44);
        org.junit.Assert.assertEquals(stringBuilder44.toString(), "");
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        boolean boolean3 = comment0.bogus;
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.String str3 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType6 = org.jsoup.parser.Token.TokenType.Character;
        doctype0.type = tokenType6;
        java.lang.String str8 = doctype0.getName();
        java.lang.String str9 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Character));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
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
        startTag0.appendAttributeValue("hi!");
        org.jsoup.parser.Token.Tag tag21 = startTag0.name("<<!---->>");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertNotNull(tag21);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.toString();
        java.lang.String str2 = character0.getData();
        org.jsoup.parser.Token.Character character4 = character0.data("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str5 = character4.toString();
        java.lang.String str6 = character4.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str5, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str6, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
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
        boolean boolean32 = tag1.isCharacter();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag33 = tag1.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        boolean boolean7 = documentType4.hasAttr("");
        java.lang.String str8 = documentType4.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = documentType4.after("4");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SYSTEM" + "'", str8, "SYSTEM");
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
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
        java.lang.String str14 = tag10.normalName;
        java.lang.String str15 = tag10.tagName;
        java.lang.String str16 = tag10.name();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str15, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str16, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.nodes.DocumentType documentType7 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean9 = documentType7.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes10 = documentType7.attributes();
        tag1.attributes = attributes10;
        java.lang.String str12 = tag1.tagName;
        boolean boolean13 = tag1.selfClosing;
        org.jsoup.parser.Token.Doctype doctype14 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str15 = doctype14.getName();
        java.lang.String str16 = doctype14.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder17 = doctype14.systemIdentifier;
        boolean boolean18 = doctype14.forceQuirks;
        java.lang.StringBuilder stringBuilder19 = doctype14.name;
        org.jsoup.parser.Token.Comment comment20 = new org.jsoup.parser.Token.Comment();
        comment20.bogus = false;
        java.lang.StringBuilder stringBuilder23 = comment20.data;
        boolean boolean24 = comment20.isEOF();
        java.lang.String str25 = comment20.toString();
        java.lang.String str26 = comment20.getData();
        java.lang.String str27 = comment20.getData();
        org.jsoup.parser.Token.TokenType tokenType28 = comment20.type;
        doctype14.type = tokenType28;
        tag1.type = tokenType28;
        boolean boolean31 = tag1.selfClosing;
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!---->" + "'", str25, "<!---->");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + tokenType28 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType28.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        startTag0.appendTagName("PUBLIC");
        org.jsoup.parser.Token.Tag tag10 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag12 = tag10.name("4");
        tag12.selfClosing = false;
        tag12.appendTagName('a');
        tag12.appendAttributeValue("#");
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag20 = startTag19.reset();
        org.jsoup.parser.Token.Tag tag21 = startTag19.reset();
        boolean boolean22 = startTag19.isComment();
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag25 = startTag24.reset();
        tag25.finaliseTag();
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
        tag25.attributes = attributes42;
        tag25.newAttribute();
        boolean boolean47 = tag25.isCharacter();
        tag25.tagName = "StartTag";
        tag25.finaliseTag();
        org.jsoup.parser.Token.Tag tag51 = tag25.reset();
        boolean boolean52 = tag51.isSelfClosing();
        org.jsoup.nodes.Attributes attributes53 = tag51.attributes;
        org.jsoup.parser.Token.StartTag startTag54 = startTag19.nameAttr("#doctype", attributes53);
        tag12.attributes = attributes53;
        tag12.appendAttributeValue("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNotNull(startTag44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(attributes53);
        org.junit.Assert.assertNotNull(startTag54);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node8 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node8.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node9.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
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
        java.lang.String str17 = comment11.getData();
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertNotNull(comment15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.String str3 = doctype0.getSystemIdentifier();
        java.lang.String str4 = doctype0.getSystemIdentifier();
        doctype0.forceQuirks = false;
        java.lang.String str7 = doctype0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character3 = character0.data("<!---->");
        java.lang.String str4 = character3.toString();
        org.jsoup.parser.Token.Character character6 = character3.data("<!---->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment7 = character3.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(character6);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag8 = startTag0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype9 = startTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isComment();
        org.jsoup.parser.Token.Doctype doctype4 = doctype0.asDoctype();
        java.lang.String str5 = doctype4.getName();
        boolean boolean6 = doctype4.isDoctype();
        java.lang.StringBuilder stringBuilder7 = doctype4.publicIdentifier;
        java.lang.String str8 = doctype4.getPublicIdentifier();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(doctype4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        org.jsoup.parser.Token token1 = eOF0.reset();
        org.jsoup.parser.Token token2 = eOF0.reset();
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str4 = startTag3.normalName;
        startTag3.newAttribute();
        java.lang.String str6 = startTag3.normalName();
        startTag3.appendAttributeName("");
        startTag3.normalName = "hi!";
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str13 = startTag12.normalName;
        org.jsoup.nodes.Attributes attributes14 = startTag12.attributes;
        org.jsoup.parser.Token.StartTag startTag15 = startTag3.nameAttr("SYSTEM", attributes14);
        startTag15.tagName = "PUBLIC";
        org.jsoup.parser.Token.TokenType tokenType18 = startTag15.type;
        token2.type = tokenType18;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character20 = token2.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EOF cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EOF and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(startTag15);
        org.junit.Assert.assertTrue("'" + tokenType18 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType18.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment8 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder9 = comment8.data;
        xmlTreeBuilder4.insert(comment8);
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str12 = startTag11.normalName;
        startTag11.newAttribute();
        java.lang.String str14 = startTag11.normalName();
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag17 = startTag16.reset();
        tag17.finaliseTag();
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean25 = documentType23.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes26 = documentType23.attributes();
        tag17.attributes = attributes26;
        org.jsoup.parser.Token.StartTag startTag28 = startTag11.nameAttr("<!---->", attributes26);
        java.lang.String str29 = startTag28.name();
        boolean boolean30 = xmlTreeBuilder4.process((org.jsoup.parser.Token) startTag28);
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
        boolean boolean49 = xmlTreeBuilder4.process((org.jsoup.parser.Token) startTag48);
        org.jsoup.parser.Token.Character character50 = new org.jsoup.parser.Token.Character();
        java.lang.String str51 = character50.toString();
        org.jsoup.parser.Token.Character character53 = character50.data("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str54 = character53.toString();
        xmlTreeBuilder4.insert(character53);
        xmlTreeBuilder0.insert(character53);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder57 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList60 = null;
        org.jsoup.parser.ParseSettings parseSettings61 = null;
        xmlTreeBuilder57.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList60, parseSettings61);
        org.jsoup.parser.Token.Character character63 = new org.jsoup.parser.Token.Character();
        java.lang.String str64 = character63.getData();
        org.jsoup.parser.Token.Character character66 = character63.data("<!---->");
        java.lang.String str67 = character66.getData();
        xmlTreeBuilder57.insert(character66);
        java.lang.String str69 = character66.getData();
        xmlTreeBuilder0.insert(character66);
        java.lang.String str71 = character66.toString();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(startTag28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!---->" + "'", str29, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertNotNull(startTag48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(character53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str54, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNotNull(character66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "<!---->" + "'", str67, "<!---->");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "<!---->" + "'", str69, "<!---->");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "<!---->" + "'", str71, "<!---->");
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        org.jsoup.parser.Token.TokenType tokenType2 = doctype0.type;
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
        boolean boolean9 = documentType4.equals((java.lang.Object) 0L);
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        org.jsoup.nodes.Node node11 = documentType4.clone();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag13 = startTag12.reset();
        tag13.finaliseTag();
        org.jsoup.parser.Token.Tag tag15 = tag13.reset();
        boolean boolean16 = tag15.selfClosing;
        java.lang.String str17 = tag15.tagName;
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes19 = startTag18.attributes;
        tag15.attributes = attributes19;
        boolean boolean21 = node11.hasSameValue((java.lang.Object) tag15);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag22 = tag15.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
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
        boolean boolean15 = doctype6.isForceQuirks();
        java.lang.String str16 = doctype6.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder17 = doctype6.systemIdentifier;
        boolean boolean18 = doctype6.isForceQuirks();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">", "#doctype", "#doctype", "StartTag");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int10 = documentType9.siblingIndex();
        java.lang.String str11 = documentType9.toString();
        org.jsoup.nodes.Node node12 = documentType9.clone();
        int int13 = node12.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = documentType4.before(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str11, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        int int8 = documentType4.childNodeSize();
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node10 = documentType4.clone();
        org.jsoup.nodes.Node node11 = documentType4.clone();
        org.jsoup.nodes.Node node12 = node11.clone();
        org.jsoup.nodes.Node node13 = node11.nextSibling();
        org.jsoup.nodes.Node node14 = node11.nextSibling();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SYSTEM" + "'", str9, "SYSTEM");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        org.jsoup.nodes.Attributes attributes2 = startTag0.attributes;
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        startTag0.appendAttributeValue("Doctype");
        org.jsoup.nodes.Attributes attributes7 = startTag0.attributes;
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean15 = documentType13.hasAttr("hi!");
        int int16 = documentType13.childNodeSize();
        int int17 = documentType13.childNodeSize();
        java.lang.String str18 = documentType13.baseUri();
        java.lang.String str19 = documentType13.baseUri();
        org.jsoup.nodes.Attributes attributes20 = documentType13.attributes();
        org.jsoup.parser.Token.StartTag startTag21 = startTag0.nameAttr("#", attributes20);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype22 = startTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "SYSTEM" + "'", str18, "SYSTEM");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "SYSTEM" + "'", str19, "SYSTEM");
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(startTag21);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
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
        java.lang.String str17 = character16.getData();
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(character14);
        org.junit.Assert.assertNotNull(character16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "StartTag" + "'", str17, "StartTag");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        doctype0.forceQuirks = true;
        org.jsoup.parser.Token token5 = doctype0.reset();
        java.lang.String str6 = doctype0.getName();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node14.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
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
        comment6.bogus = false;
        java.lang.String str15 = comment6.toString();
        java.lang.String str16 = comment6.getData();
        boolean boolean17 = comment6.isComment();
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!---->" + "'", str10, "<!---->");
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!---->" + "'", str15, "<!---->");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "SYSTEM", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("<SYSTEM>", "Doctype");
        java.lang.String str9 = node7.absUrl("<!---->");
        boolean boolean11 = node7.hasAttr("#");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node7.after("<4>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        java.lang.String str4 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        java.lang.String str6 = startTag0.tagName;
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        tag7.appendAttributeName("SYSTEM");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        boolean boolean1 = eOF0.isDoctype();
        boolean boolean2 = eOF0.isEOF();
        org.jsoup.parser.Token token3 = eOF0.reset();
        org.jsoup.parser.Token token4 = eOF0.reset();
        org.jsoup.parser.Token token5 = eOF0.reset();
        org.jsoup.parser.Token token6 = eOF0.reset();
        org.jsoup.parser.Token token7 = eOF0.reset();
        boolean boolean8 = token7.isEndTag();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        int int8 = documentType4.childNodeSize();
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node10 = documentType4.clone();
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        boolean boolean14 = documentType4.hasAttr("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str15 = documentType4.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SYSTEM" + "'", str9, "SYSTEM");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str15, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        org.jsoup.nodes.Attributes attributes2 = startTag0.attributes;
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        tag4.finaliseTag();
        org.jsoup.parser.Token.Tag tag7 = tag4.name("<!---->4");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment8 = tag4.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.siblingNodes();
        java.lang.String str9 = documentType4.nodeName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        startTag0.appendAttributeName('a');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "#doctype", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.Character character11 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder0.insert(character11);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        xmlTreeBuilder14.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList17, parseSettings18);
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        org.jsoup.parser.ParseSettings parseSettings23 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlTreeBuilder14.parseFragment("", "#doctype", parseErrorList22, parseSettings23);
        org.jsoup.parser.Token.Comment comment25 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder26 = comment25.data;
        java.lang.String str27 = comment25.toString();
        org.jsoup.parser.Token token28 = comment25.reset();
        boolean boolean29 = xmlTreeBuilder14.process((org.jsoup.parser.Token) comment25);
        org.jsoup.nodes.Document document32 = xmlTreeBuilder14.parse("hi!", "SYSTEM");
        org.jsoup.parser.Token.Character character33 = new org.jsoup.parser.Token.Character();
        java.lang.String str34 = character33.toString();
        org.jsoup.parser.Token token35 = character33.reset();
        xmlTreeBuilder14.insert(character33);
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str39 = startTag38.normalName;
        startTag38.newAttribute();
        java.lang.String str41 = startTag38.normalName();
        startTag38.appendAttributeName("");
        startTag38.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag46 = startTag38.reset();
        org.jsoup.parser.Token.Tag tag47 = startTag38.reset();
        org.jsoup.nodes.Attributes attributes48 = startTag38.attributes;
        boolean boolean49 = xmlTreeBuilder14.processStartTag("doctype", attributes48);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean50 = xmlTreeBuilder0.processStartTag("<<!---->>", attributes48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!---->" + "'", str27, "<!---->");
        org.junit.Assert.assertNotNull(token28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(token35);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertNotNull(attributes48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
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
        org.jsoup.parser.Token.StartTag startTag26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element27 = xmlTreeBuilder0.insert(startTag26);
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
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        boolean boolean1 = eOF0.isDoctype();
        org.jsoup.parser.Token token2 = eOF0.reset();
        boolean boolean3 = token2.isComment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.InSelect;
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str2 = startTag1.normalName;
        org.jsoup.nodes.Attributes attributes3 = startTag1.attributes;
        org.jsoup.parser.Token.Tag tag4 = startTag1.reset();
        org.jsoup.parser.Token.Tag tag5 = startTag1.reset();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) tag5, htmlTreeBuilder6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(tag5);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "SYSTEM", "4", "<<!---->#doctype  name=\"\" publicId=\"hi!\" systemId=\"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = documentType4.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        xmlTreeBuilder1.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList4, parseSettings5);
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.ParseSettings parseSettings10 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlTreeBuilder1.parseFragment("", "#doctype", parseErrorList9, parseSettings10);
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder13 = comment12.data;
        java.lang.String str14 = comment12.toString();
        org.jsoup.parser.Token token15 = comment12.reset();
        boolean boolean16 = xmlTreeBuilder1.process((org.jsoup.parser.Token) comment12);
        java.lang.String str17 = comment12.toString();
        java.lang.String str18 = comment12.getData();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(comment12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!---->" + "'", str14, "<!---->");
        org.junit.Assert.assertNotNull(token15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!---->" + "'", str17, "<!---->");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        java.lang.String str9 = documentType4.attr("StartTag");
        org.jsoup.nodes.Node node10 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node10.attr("<!DOCTYPE PUBLIC>", "PUBLIC");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        java.lang.String str9 = documentType4.attr("StartTag");
        org.jsoup.nodes.Node node10 = documentType4.parent();
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("Comment");
        org.jsoup.nodes.Node node14 = node12.removeAttr("<<SYSTEM>>");
        node14.setBaseUri("<!DOCTYPE PUBLIC>");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        java.lang.String str7 = documentType4.baseUri();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node11 = documentType4.attr("<<SYSTEM>>", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean18 = documentType16.hasAttr("hi!");
        java.lang.String str19 = documentType16.baseUri();
        org.jsoup.nodes.Node node20 = documentType16.clone();
        org.jsoup.nodes.Node node21 = documentType16.parentNode();
        java.lang.String str22 = documentType16.nodeName();
        boolean boolean24 = documentType16.hasAttr("StartTag");
        org.jsoup.nodes.Document document25 = documentType16.ownerDocument();
        java.lang.String str26 = documentType16.toString();
        org.jsoup.nodes.Node node27 = documentType16.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            node11.replaceWith(node27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SYSTEM" + "'", str7, "SYSTEM");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "SYSTEM" + "'", str19, "SYSTEM");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#doctype" + "'", str22, "#doctype");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(document25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str26, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("SYSTEM", "SYSTEM", "#doctype", "SYSTEM");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("PUBLIC");
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("StartTag");
        org.jsoup.nodes.Node node11 = documentType4.attr("<<!---->#doctype  name=\"\" publicId=\"hi!\" systemId=\"hi!\">", "StartTag");
        java.lang.String str13 = node11.attr("<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">>");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
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
        boolean boolean38 = tag37.isSelfClosing();
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
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.junit.Assert.assertNotNull(token1);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        org.jsoup.nodes.Node node8 = documentType4.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node8.wrap("<!DOCTYPE #doctype PUBLIC \"4\" \"PUBLIC\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("<!DOCTYPE PUBLIC>");
        org.jsoup.nodes.Node node12 = node11.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node12.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.String str3 = comment0.toString();
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.bogus;
        java.lang.String str6 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        java.lang.String str9 = documentType4.attr("StartTag");
        org.jsoup.nodes.Node node10 = documentType4.parent();
        boolean boolean12 = documentType4.hasAttr(" ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        startTag0.appendTagName("PUBLIC");
        org.jsoup.parser.Token.Tag tag10 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag12 = tag10.name("4");
        tag12.selfClosing = false;
        tag12.appendTagName('a');
        tag12.appendAttributeName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
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
        org.jsoup.parser.Token.Tag tag37 = startTag0.name("hi!");
        org.jsoup.nodes.DocumentType documentType43 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str44 = documentType43.nodeName();
        org.jsoup.nodes.Attributes attributes45 = documentType43.attributes();
        java.lang.String str46 = documentType43.outerHtml();
        org.jsoup.nodes.Attributes attributes47 = documentType43.attributes();
        org.jsoup.parser.Token.StartTag startTag48 = startTag0.nameAttr("<!DOCTYPE PUBLIC \"SYSTEM\" \"<!DOCTYPE PUBLIC \"hi!\" \"hi!\">\">", attributes47);
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
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "#doctype" + "'", str44, "#doctype");
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str46, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(attributes47);
        org.junit.Assert.assertNotNull(startTag48);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
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
        org.jsoup.parser.Token.Character character78 = character71.data("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
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
        org.junit.Assert.assertNotNull(character78);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        boolean boolean6 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes8 = startTag0.getAttributes();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#", "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">", "a", "StartTag");
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character3 = character0.data("<!---->");
        java.lang.String str4 = character3.toString();
        java.lang.String str5 = character3.toString();
        java.lang.String str6 = character3.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
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
        boolean boolean24 = tag1.isComment();
        tag1.appendAttributeName("doctype");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.siblingNodes();
        int int9 = node7.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node7.childNodesCopy();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str6, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        int int8 = documentType4.childNodeSize();
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node10 = documentType4.clone();
        org.jsoup.nodes.Node node11 = node10.parentNode();
        org.jsoup.nodes.Node node12 = node10.parentNode();
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
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("SYSTEM", "SYSTEM", "#doctype", "SYSTEM");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.siblingNodes();
        int int6 = documentType4.siblingIndex();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document11 = xmlTreeBuilder8.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder13 = comment12.data;
        xmlTreeBuilder8.insert(comment12);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.ParseSettings parseSettings19 = null;
        xmlTreeBuilder15.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList18, parseSettings19);
        org.jsoup.parser.Token.Character character21 = new org.jsoup.parser.Token.Character();
        java.lang.String str22 = character21.getData();
        org.jsoup.parser.Token.Character character24 = character21.data("<!---->");
        java.lang.String str25 = character24.getData();
        xmlTreeBuilder15.insert(character24);
        xmlTreeBuilder8.insert(character24);
        org.jsoup.parser.Token.Comment comment28 = new org.jsoup.parser.Token.Comment();
        comment28.bogus = false;
        java.lang.StringBuilder stringBuilder31 = comment28.data;
        java.lang.String str32 = comment28.getData();
        boolean boolean33 = xmlTreeBuilder8.process((org.jsoup.parser.Token) comment28);
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        org.jsoup.parser.ParseSettings parseSettings41 = null;
        xmlTreeBuilder37.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList40, parseSettings41);
        org.jsoup.parser.ParseErrorList parseErrorList45 = null;
        org.jsoup.parser.ParseSettings parseSettings46 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList47 = xmlTreeBuilder37.parseFragment("", "#doctype", parseErrorList45, parseSettings46);
        org.jsoup.parser.Token.Comment comment48 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder49 = comment48.data;
        java.lang.String str50 = comment48.toString();
        org.jsoup.parser.Token token51 = comment48.reset();
        boolean boolean52 = xmlTreeBuilder37.process((org.jsoup.parser.Token) comment48);
        org.jsoup.parser.ParseSettings parseSettings53 = xmlTreeBuilder37.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings54 = xmlTreeBuilder37.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList55 = xmlTreeBuilder8.parseFragment("<!DOCTYPE PUBLIC>", "<!---->4", parseErrorList36, parseSettings54);
        boolean boolean56 = documentType4.equals((java.lang.Object) "<!---->4");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node58 = documentType4.wrap("4doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(character24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!---->" + "'", str25, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder31);
        org.junit.Assert.assertEquals(stringBuilder31.toString(), "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertNotNull(stringBuilder49);
        org.junit.Assert.assertEquals(stringBuilder49.toString(), "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "<!---->" + "'", str50, "<!---->");
        org.junit.Assert.assertNotNull(token51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(parseSettings53);
        org.junit.Assert.assertNotNull(parseSettings54);
        org.junit.Assert.assertNotNull(nodeList55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "SYSTEM", "4", "<<!---->#doctype  name=\"\" publicId=\"hi!\" systemId=\"hi!\">");
        int int5 = documentType4.siblingIndex();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
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
        org.jsoup.parser.Token.Doctype doctype61 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder62 = doctype61.name;
        java.lang.StringBuilder stringBuilder63 = doctype61.systemIdentifier;
        boolean boolean64 = doctype61.isComment();
        org.jsoup.parser.Token.Doctype doctype65 = doctype61.asDoctype();
        java.lang.StringBuilder stringBuilder66 = doctype61.publicIdentifier;
        org.jsoup.parser.Token.TokenType tokenType67 = doctype61.type;
        boolean boolean68 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype61);
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
        org.junit.Assert.assertNotNull(stringBuilder62);
        org.junit.Assert.assertEquals(stringBuilder62.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder63);
        org.junit.Assert.assertEquals(stringBuilder63.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(doctype65);
        org.junit.Assert.assertNotNull(stringBuilder66);
        org.junit.Assert.assertEquals(stringBuilder66.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType67 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType67.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("StartTag");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = documentType4.traverse(nodeVisitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.String str3 = doctype0.getPublicIdentifier();
        java.lang.String str4 = doctype0.getName();
        boolean boolean5 = doctype0.forceQuirks;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.setEmptyAttributeValue();
        startTag0.newAttribute();
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype24 = character21.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("SYSTEM", "SYSTEM", "#doctype", "SYSTEM");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("PUBLIC");
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("StartTag");
        org.jsoup.nodes.Node node11 = documentType4.attr("<<!---->#doctype  name=\"\" publicId=\"hi!\" systemId=\"hi!\">", "StartTag");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document15 = xmlTreeBuilder12.parse("SYSTEM", "#doctype");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.ParseSettings parseSettings20 = null;
        xmlTreeBuilder16.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList19, parseSettings20);
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.ParseSettings parseSettings25 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList26 = xmlTreeBuilder16.parseFragment("", "#doctype", parseErrorList24, parseSettings25);
        org.jsoup.parser.Token.Character character27 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder16.insert(character27);
        xmlTreeBuilder12.insert(character27);
        org.jsoup.nodes.Document document32 = xmlTreeBuilder12.parse("<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">>", "<<SYSTEM>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = documentType4.before((org.jsoup.nodes.Node) document32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(document32);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        java.lang.String str8 = startTag0.tagName;
        org.jsoup.nodes.Attributes attributes9 = startTag0.attributes;
        java.lang.String str10 = startTag0.tagName;
        org.jsoup.parser.Token.Tag tag12 = startTag0.name("PUBLIC");
        // The following exception was thrown during execution in test generation
        try {
            tag12.finaliseTag();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = document19.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        boolean boolean5 = document3.hasAttr("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node7 = document3.removeAttr("EOF");
        org.jsoup.nodes.Document document8 = node7.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node7.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(document8);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.Tag tag3 = tag1.reset();
        org.jsoup.nodes.Attributes attributes4 = tag3.attributes;
        java.lang.String str5 = tag3.tokenType();
        tag3.newAttribute();
        boolean boolean7 = tag3.isComment();
        org.jsoup.parser.Token.Tag tag9 = tag3.name("StartTag");
        org.jsoup.parser.Token.Tag tag10 = tag3.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character11 = tag3.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "", "", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.parser.Token.Doctype doctype5 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder6 = doctype5.name;
        java.lang.StringBuilder stringBuilder7 = doctype5.systemIdentifier;
        java.lang.StringBuilder stringBuilder8 = documentType4.html(stringBuilder7);
        java.lang.Class<?> wildcardClass9 = stringBuilder8.getClass();
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">>");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">>");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Node node7 = documentType4.nextSibling();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "", "", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.parser.Token.Doctype doctype13 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder14 = doctype13.name;
        java.lang.StringBuilder stringBuilder15 = doctype13.systemIdentifier;
        java.lang.StringBuilder stringBuilder16 = documentType12.html(stringBuilder15);
        java.lang.StringBuilder stringBuilder17 = documentType4.html(stringBuilder15);
        org.jsoup.parser.Token.reset(stringBuilder17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
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
        org.jsoup.nodes.Document document79 = xmlTreeBuilder0.parse("<!DOCTYPE PUBLIC>", "<!DOCTYPE PUBLIC>");
        org.jsoup.nodes.Node node80 = document79.previousSibling();
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
        org.junit.Assert.assertNotNull(document79);
        org.junit.Assert.assertNull(node80);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        int int8 = documentType4.childNodeSize();
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node10 = documentType4.clone();
        org.jsoup.nodes.Node node11 = documentType4.clone();
        org.jsoup.nodes.Node node12 = node11.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SYSTEM" + "'", str9, "SYSTEM");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        startTag0.tagName = "<SYSTEM>";
        org.jsoup.nodes.Attributes attributes5 = startTag0.getAttributes();
        java.lang.String str6 = startTag0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<<SYSTEM>>" + "'", str6, "<<SYSTEM>>");
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
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
        org.jsoup.parser.Token.StartTag startTag44 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str45 = startTag44.normalName;
        startTag44.newAttribute();
        java.lang.String str47 = startTag44.normalName();
        java.lang.String str48 = startTag44.normalName();
        org.jsoup.parser.Token.Tag tag49 = startTag44.reset();
        startTag44.appendTagName("<SYSTEM>");
        boolean boolean52 = startTag44.isSelfClosing();
        org.jsoup.nodes.Element element53 = xmlTreeBuilder0.insert(startTag44);
        org.jsoup.parser.Token token54 = startTag44.reset();
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
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(token54);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        boolean boolean6 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        tag7.normalName = "<4>";
        boolean boolean10 = tag7.isCharacter();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
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
        boolean boolean46 = doctype35.isForceQuirks();
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
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
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
        java.lang.String str23 = doctype20.getSystemIdentifier();
        java.lang.String str24 = doctype20.getSystemIdentifier();
        doctype20.forceQuirks = false;
        boolean boolean27 = doctype20.forceQuirks;
        java.lang.StringBuilder stringBuilder28 = doctype20.systemIdentifier;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder29 = null;
        boolean boolean30 = htmlTreeBuilderState7.process((org.jsoup.parser.Token) doctype20, htmlTreeBuilder29);
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str32 = startTag31.normalName;
        startTag31.newAttribute();
        java.lang.String str34 = startTag31.normalName();
        java.lang.String str35 = startTag31.normalName();
        org.jsoup.parser.Token.Tag tag36 = startTag31.reset();
        java.lang.String str37 = startTag31.tagName;
        boolean boolean38 = startTag31.isSelfClosing();
        java.lang.String str39 = startTag31.normalName();
        org.jsoup.parser.Token token40 = startTag31.reset();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder41 = null;
        boolean boolean42 = htmlTreeBuilderState7.process((org.jsoup.parser.Token) startTag31, htmlTreeBuilder41);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(token40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
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
        java.lang.String str15 = documentType4.attr("<!---->");
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean22 = documentType20.hasAttr("hi!");
        int int23 = documentType20.childNodeSize();
        int int24 = documentType20.childNodeSize();
        java.lang.String str25 = documentType20.baseUri();
        org.jsoup.nodes.Node node26 = documentType20.clone();
        org.jsoup.nodes.Node node27 = documentType20.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = documentType20.childNodes();
        java.lang.String str30 = documentType20.attr("<!---->4");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = documentType4.before((org.jsoup.nodes.Node) documentType20);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "SYSTEM" + "'", str25, "SYSTEM");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
        org.jsoup.nodes.Node node8 = documentType4.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node8.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str6, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder3 = doctype0.publicIdentifier;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "", "", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.parser.Token.Doctype doctype5 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder6 = doctype5.name;
        java.lang.StringBuilder stringBuilder7 = doctype5.systemIdentifier;
        java.lang.StringBuilder stringBuilder8 = documentType4.html(stringBuilder7);
        org.jsoup.nodes.Node node9 = documentType4.parent();
        org.jsoup.nodes.Document document10 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        int int12 = documentType4.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.childNodes();
        org.jsoup.nodes.Node node14 = documentType4.parentNode();
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str16 = startTag15.normalName;
        org.jsoup.nodes.Attributes attributes17 = startTag15.attributes;
        boolean boolean18 = startTag15.isSelfClosing();
        startTag15.appendAttributeValue('a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = node14.equals((java.lang.Object) startTag15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Node node7 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = node7.attr("<Doctype>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
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
        java.lang.String str52 = startTag51.normalName;
        startTag51.newAttribute();
        java.lang.String str54 = startTag51.normalName();
        startTag51.appendAttributeName("");
        startTag51.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag59 = startTag51.reset();
        org.jsoup.parser.Token.StartTag startTag61 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag62 = startTag61.reset();
        org.jsoup.parser.Token.Tag tag63 = startTag61.reset();
        org.jsoup.nodes.Attributes attributes64 = startTag61.getAttributes();
        org.jsoup.parser.Token.StartTag startTag65 = startTag51.nameAttr("Doctype", attributes64);
        boolean boolean66 = xmlTreeBuilder0.processStartTag("#", attributes64);
        org.jsoup.nodes.Document document69 = xmlTreeBuilder0.parse("", "<<!---->>");
        java.lang.Object obj70 = null;
        boolean boolean71 = document69.hasSameValue(obj70);
        org.jsoup.select.NodeVisitor nodeVisitor72 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node73 = document69.traverse(nodeVisitor72);
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
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(tag59);
        org.junit.Assert.assertNotNull(tag62);
        org.junit.Assert.assertNotNull(tag63);
        org.junit.Assert.assertNotNull(attributes64);
        org.junit.Assert.assertNotNull(startTag65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(document69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag2 = startTag0.reset();
        boolean boolean3 = startTag0.isComment();
        boolean boolean4 = startTag0.isDoctype();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        java.lang.String str7 = documentType4.baseUri();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        java.lang.String str11 = documentType4.absUrl("#doctype");
        java.lang.String str12 = documentType4.outerHtml();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SYSTEM" + "'", str7, "SYSTEM");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str12, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
        java.lang.String str8 = documentType4.outerHtml();
        java.lang.String str9 = documentType4.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str8, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SYSTEM" + "'", str9, "SYSTEM");
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("<!DOCTYPE PUBLIC>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        comment0.bogus = true;
        boolean boolean5 = comment0.bogus;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
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
        boolean boolean15 = startTag12.isSelfClosing();
        boolean boolean16 = startTag12.isCharacter();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
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
        char[] charArray36 = new char[] { 'a', ' ', '4', ' ' };
        tag1.appendAttributeValue(charArray36);
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag39 = startTag38.reset();
        org.jsoup.parser.Token.Tag tag40 = startTag38.reset();
        org.jsoup.parser.Token.StartTag startTag41 = tag40.asStartTag();
        org.jsoup.parser.Token.StartTag startTag42 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str43 = startTag42.normalName;
        org.jsoup.nodes.Attributes attributes44 = startTag42.attributes;
        startTag41.attributes = attributes44;
        tag1.attributes = attributes44;
        tag1.appendAttributeValue('4');
        org.jsoup.parser.Token.Tag tag49 = tag1.reset();
        java.lang.String str50 = tag1.normalName;
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
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { 'a', ' ', '4', ' ' });
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertNotNull(startTag41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertNull(str50);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        boolean boolean4 = comment0.isEOF();
        java.lang.String str5 = comment0.toString();
        java.lang.String str6 = comment0.toString();
        org.jsoup.parser.Token token7 = comment0.reset();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertNotNull(token7);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
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
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
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
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        boolean boolean2 = doctype0.forceQuirks;
        boolean boolean3 = doctype0.isCharacter();
        boolean boolean4 = doctype0.isForceQuirks();
        org.jsoup.parser.Token token5 = doctype0.reset();
        java.lang.String str6 = doctype0.getName();
        java.lang.Class<?> wildcardClass7 = doctype0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        boolean boolean4 = comment0.isEOF();
        java.lang.String str5 = comment0.getData();
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        comment0.bogus = true;
        boolean boolean9 = comment0.bogus;
        java.lang.String str10 = comment0.tokenType();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Comment" + "'", str10, "Comment");
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "SYSTEM", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node6 = documentType4.previousSibling();
        java.lang.String str7 = documentType4.nodeName();
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
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
        org.jsoup.parser.Token.StartTag startTag44 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str45 = startTag44.normalName;
        startTag44.newAttribute();
        java.lang.String str47 = startTag44.normalName();
        java.lang.String str48 = startTag44.normalName();
        org.jsoup.parser.Token.Tag tag49 = startTag44.reset();
        startTag44.appendTagName("<SYSTEM>");
        boolean boolean52 = startTag44.isSelfClosing();
        org.jsoup.nodes.Element element53 = xmlTreeBuilder0.insert(startTag44);
        org.jsoup.parser.Token.StartTag startTag54 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag55 = startTag54.reset();
        tag55.finaliseTag();
        org.jsoup.parser.Token.Tag tag57 = tag55.reset();
        org.jsoup.nodes.Attributes attributes58 = tag57.attributes;
        java.lang.String str59 = tag57.tokenType();
        org.jsoup.parser.Token.TokenType tokenType60 = tag57.type;
        tag57.appendAttributeValue("Doctype");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean63 = xmlTreeBuilder0.process((org.jsoup.parser.Token) tag57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertNotNull(tag57);
        org.junit.Assert.assertNotNull(attributes58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "StartTag" + "'", str59, "StartTag");
        org.junit.Assert.assertTrue("'" + tokenType60 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType60.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        startTag0.finaliseTag();
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag5 = tag4.reset();
        java.lang.String str6 = tag5.tagName;
        tag5.appendAttributeName("4a");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "SYSTEM", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("<SYSTEM>", "Doctype");
        java.lang.String str8 = documentType4.nodeName();
        java.lang.String str10 = documentType4.absUrl("4");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = documentType4.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "", "", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.parser.Token.Doctype doctype5 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder6 = doctype5.name;
        java.lang.StringBuilder stringBuilder7 = doctype5.systemIdentifier;
        java.lang.StringBuilder stringBuilder8 = documentType4.html(stringBuilder7);
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
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
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.Tag tag3 = tag1.reset();
        boolean boolean4 = tag3.selfClosing;
        tag3.appendTagName("4");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character7 = tag3.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment8 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder9 = comment8.data;
        xmlTreeBuilder4.insert(comment8);
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str12 = startTag11.normalName;
        startTag11.newAttribute();
        java.lang.String str14 = startTag11.normalName();
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag17 = startTag16.reset();
        tag17.finaliseTag();
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean25 = documentType23.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes26 = documentType23.attributes();
        tag17.attributes = attributes26;
        org.jsoup.parser.Token.StartTag startTag28 = startTag11.nameAttr("<!---->", attributes26);
        java.lang.String str29 = startTag28.name();
        boolean boolean30 = xmlTreeBuilder4.process((org.jsoup.parser.Token) startTag28);
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
        boolean boolean49 = xmlTreeBuilder4.process((org.jsoup.parser.Token) startTag48);
        org.jsoup.parser.Token.Character character50 = new org.jsoup.parser.Token.Character();
        java.lang.String str51 = character50.toString();
        org.jsoup.parser.Token.Character character53 = character50.data("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str54 = character53.toString();
        xmlTreeBuilder4.insert(character53);
        xmlTreeBuilder0.insert(character53);
        org.jsoup.parser.Token.StartTag startTag57 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str58 = startTag57.normalName;
        startTag57.newAttribute();
        java.lang.String str60 = startTag57.normalName();
        startTag57.appendAttributeName("");
        startTag57.normalName = "hi!";
        java.lang.String str65 = startTag57.normalName;
        startTag57.setEmptyAttributeValue();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element67 = xmlTreeBuilder0.insert(startTag57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(startTag28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!---->" + "'", str29, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertNotNull(startTag48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(character53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str54, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.InCaption;
        org.jsoup.parser.Token.EOF eOF1 = new org.jsoup.parser.Token.EOF();
        org.jsoup.parser.Token token2 = eOF1.reset();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = htmlTreeBuilderState0.process(token2, htmlTreeBuilder3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertNotNull(token2);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag1.reset();
        boolean boolean3 = tag2.isEndTag();
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag5 = startTag4.reset();
        tag5.finaliseTag();
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
        tag5.attributes = attributes22;
        char[] charArray27 = new char[] { 'a' };
        tag5.appendAttributeValue(charArray27);
        tag2.appendAttributeValue(charArray27);
        startTag0.appendAttributeValue(charArray27);
        org.jsoup.nodes.Attributes attributes31 = startTag0.attributes;
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(startTag24);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { 'a' });
        org.junit.Assert.assertNotNull(attributes31);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
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
        boolean boolean25 = tag1.isSelfClosing();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(startTag20);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        java.lang.String str7 = documentType4.baseUri();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        int int10 = documentType4.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = documentType4.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SYSTEM" + "'", str7, "SYSTEM");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag2 = startTag0.reset();
        org.jsoup.parser.Token.StartTag startTag3 = tag2.asStartTag();
        startTag3.appendAttributeName("SYSTEM");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(startTag3);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isComment();
        org.jsoup.parser.Token token4 = doctype0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag5 = token4.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(token4);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
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
        org.jsoup.parser.Token token18 = comment17.reset();
        java.lang.String str19 = comment17.getData();
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!---->" + "'", str16, "<!---->");
        org.junit.Assert.assertNotNull(comment17);
        org.junit.Assert.assertNotNull(token18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
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
        boolean boolean14 = comment6.bogus;
        java.lang.StringBuilder stringBuilder15 = comment6.data;
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!---->" + "'", str10, "<!---->");
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        java.lang.String str8 = startTag0.normalName;
        startTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag10 = startTag0.asStartTag();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(startTag10);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        java.lang.String str4 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        boolean boolean6 = startTag0.isDoctype();
        startTag0.appendTagName('#');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        java.lang.String str4 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag6 = startTag0.reset();
        startTag0.tagName = "<!---->";
        boolean boolean9 = startTag0.isEOF();
        startTag0.appendTagName("#doctype");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
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
        startTag0.tagName = "<SYSTEM>";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag38 = startTag0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
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
        org.jsoup.parser.ParseSettings parseSettings80 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder81 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList84 = null;
        org.jsoup.parser.ParseSettings parseSettings85 = null;
        xmlTreeBuilder81.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList84, parseSettings85);
        org.jsoup.parser.ParseErrorList parseErrorList89 = null;
        org.jsoup.parser.ParseSettings parseSettings90 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList91 = xmlTreeBuilder81.parseFragment("", "#doctype", parseErrorList89, parseSettings90);
        org.jsoup.parser.Token.Character character92 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder81.insert(character92);
        java.lang.String str94 = character92.getData();
        boolean boolean95 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character92);
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
        org.junit.Assert.assertNotNull(parseSettings80);
        org.junit.Assert.assertNotNull(nodeList91);
        org.junit.Assert.assertNull(str94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean9 = documentType4.equals(obj8);
        java.lang.String str10 = documentType4.toString();
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
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        org.jsoup.parser.Token.StartTag startTag8 = startTag0.asStartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype9 = startTag8.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(startTag8);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.toString();
        org.jsoup.parser.Token.Character character3 = character0.data("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        boolean boolean4 = character3.isStartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag5 = character3.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
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
        org.jsoup.nodes.DocumentType documentType43 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean45 = documentType43.hasAttr("hi!");
        org.jsoup.nodes.Node node46 = documentType43.clone();
        org.jsoup.parser.Token.StartTag startTag47 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag48 = startTag47.reset();
        org.jsoup.parser.Token.Tag tag49 = startTag47.reset();
        org.jsoup.parser.Token.StartTag startTag50 = tag49.asStartTag();
        org.jsoup.parser.Token.StartTag startTag51 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str52 = startTag51.normalName;
        org.jsoup.nodes.Attributes attributes53 = startTag51.attributes;
        startTag50.attributes = attributes53;
        boolean boolean55 = documentType43.equals((java.lang.Object) attributes53);
        boolean boolean56 = xmlTreeBuilder0.processStartTag("<<SYSTEM>>", attributes53);
        org.jsoup.parser.Token.Character character57 = new org.jsoup.parser.Token.Character();
        java.lang.String str58 = character57.toString();
        java.lang.String str59 = character57.getData();
        org.jsoup.parser.Token.Character character61 = character57.data("SYSTEM");
        xmlTreeBuilder0.insert(character61);
        java.lang.String str63 = character61.getData();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertNotNull(startTag50);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(attributes53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(character61);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "SYSTEM" + "'", str63, "SYSTEM");
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isComment();
        org.jsoup.parser.Token.Doctype doctype4 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        org.jsoup.parser.Token token6 = doctype0.reset();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(doctype4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(token6);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.RcdataLessthanSign;
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
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.nodes.DocumentType documentType7 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean9 = documentType7.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes10 = documentType7.attributes();
        tag1.attributes = attributes10;
        tag1.appendTagName("#doctype");
        org.jsoup.parser.Token.Tag tag15 = tag1.name("Doctype");
        java.lang.String str16 = tag1.tokenType();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "StartTag" + "'", str16, "StartTag");
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.BeforeAttributeValue;
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
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        boolean boolean6 = startTag0.isSelfClosing();
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
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag27 = startTag26.reset();
        tag27.finaliseTag();
        org.jsoup.nodes.DocumentType documentType33 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean35 = documentType33.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes36 = documentType33.attributes();
        tag27.attributes = attributes36;
        startTag24.attributes = attributes36;
        org.jsoup.nodes.Attributes attributes39 = startTag24.getAttributes();
        startTag0.attributes = attributes39;
        startTag0.appendAttributeValue('4');
        org.jsoup.nodes.DocumentType documentType48 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean50 = documentType48.hasAttr("hi!");
        int int51 = documentType48.childNodeSize();
        int int52 = documentType48.childNodeSize();
        org.jsoup.nodes.Node node54 = documentType48.removeAttr("<!---->4");
        org.jsoup.nodes.Node node56 = documentType48.removeAttr("<!---->4");
        org.jsoup.nodes.Attributes attributes57 = node56.attributes();
        org.jsoup.parser.Token.StartTag startTag58 = startTag0.nameAttr("SYSTEM", attributes57);
        org.jsoup.parser.Token.Tag tag59 = startTag0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character60 = tag59.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(startTag24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!---->" + "'", str25, "<!---->");
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(attributes57);
        org.junit.Assert.assertNotNull(startTag58);
        org.junit.Assert.assertNotNull(tag59);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        int int8 = documentType4.childNodeSize();
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node10 = documentType4.clone();
        org.jsoup.nodes.Node node11 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodes();
        java.lang.String str14 = documentType4.attr("<!---->4");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = documentType4.before("#");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SYSTEM" + "'", str9, "SYSTEM");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
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
        java.lang.Class<?> wildcardClass28 = tag1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        int int8 = documentType4.childNodeSize();
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node10 = documentType4.clone();
        org.jsoup.nodes.Node node11 = node10.parentNode();
        node10.setBaseUri("#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node10.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SYSTEM" + "'", str9, "SYSTEM");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
        boolean boolean9 = documentType4.equals((java.lang.Object) 0L);
        org.jsoup.nodes.Node node10 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = node10.attr("<4>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment8 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder9 = comment8.data;
        xmlTreeBuilder4.insert(comment8);
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str12 = startTag11.normalName;
        startTag11.newAttribute();
        java.lang.String str14 = startTag11.normalName();
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag17 = startTag16.reset();
        tag17.finaliseTag();
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean25 = documentType23.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes26 = documentType23.attributes();
        tag17.attributes = attributes26;
        org.jsoup.parser.Token.StartTag startTag28 = startTag11.nameAttr("<!---->", attributes26);
        java.lang.String str29 = startTag28.name();
        boolean boolean30 = xmlTreeBuilder4.process((org.jsoup.parser.Token) startTag28);
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
        boolean boolean49 = xmlTreeBuilder4.process((org.jsoup.parser.Token) startTag48);
        org.jsoup.parser.Token.Character character50 = new org.jsoup.parser.Token.Character();
        java.lang.String str51 = character50.toString();
        org.jsoup.parser.Token.Character character53 = character50.data("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str54 = character53.toString();
        xmlTreeBuilder4.insert(character53);
        xmlTreeBuilder0.insert(character53);
        org.jsoup.nodes.Document document59 = xmlTreeBuilder0.parse("<<!---->>", "<SYSTEM>");
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(startTag28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!---->" + "'", str29, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertNotNull(startTag48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(character53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str54, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(document59);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder5 = comment4.data;
        xmlTreeBuilder0.insert(comment4);
        org.jsoup.parser.Token.Character character7 = new org.jsoup.parser.Token.Character();
        java.lang.String str8 = character7.getData();
        org.jsoup.parser.Token.Character character10 = character7.data("<!---->");
        xmlTreeBuilder0.insert(character7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag12 = character7.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(character10);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
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
        java.lang.String str28 = doctype23.getPublicIdentifier();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(token21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + tokenType25 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType25.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(token26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
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
        org.jsoup.parser.TokeniserState tokeniserState19 = org.jsoup.parser.TokeniserState.CdataSection;
        boolean boolean20 = node7.equals((java.lang.Object) tokeniserState19);
        java.util.List<org.jsoup.nodes.Node> nodeList21 = node7.childNodes();
        org.jsoup.nodes.Node node22 = node7.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = node22.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node8 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node8.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList10 = node9.childNodesCopy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "#doctype", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.Character character11 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder0.insert(character11);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder16.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlTreeBuilder0.parseFragment("SYSTEM", "PUBLIC", parseErrorList15, parseSettings17);
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str20 = startTag19.normalName;
        startTag19.newAttribute();
        java.lang.String str22 = startTag19.normalName();
        boolean boolean23 = startTag19.isSelfClosing();
        boolean boolean24 = startTag19.isSelfClosing();
        startTag19.appendAttributeValue("#");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element27 = xmlTreeBuilder0.insert(startTag19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        boolean boolean2 = doctype0.forceQuirks;
        boolean boolean3 = doctype0.isCharacter();
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.Doctype doctype6 = doctype0.asDoctype();
        boolean boolean7 = doctype0.forceQuirks;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean14 = documentType12.hasAttr("hi!");
        int int15 = documentType12.childNodeSize();
        int int16 = documentType12.childNodeSize();
        org.jsoup.nodes.Node node18 = documentType12.removeAttr("<!---->4");
        org.jsoup.nodes.Node node20 = documentType12.removeAttr("<!---->4");
        org.jsoup.nodes.Attributes attributes21 = node20.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = documentType4.before(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(attributes21);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str10 = startTag9.normalName;
        startTag9.newAttribute();
        java.lang.String str12 = startTag9.normalName();
        startTag9.appendAttributeName("");
        startTag9.normalName = "hi!";
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str19 = startTag18.normalName;
        org.jsoup.nodes.Attributes attributes20 = startTag18.attributes;
        org.jsoup.parser.Token.StartTag startTag21 = startTag9.nameAttr("SYSTEM", attributes20);
        boolean boolean22 = documentType4.equals((java.lang.Object) attributes20);
        org.jsoup.nodes.Node node24 = documentType4.removeAttr("<SYSTEM>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = node24.before("<Doctype>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(startTag21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        int int8 = documentType4.childNodeSize();
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node10 = documentType4.clone();
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node12.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SYSTEM" + "'", str9, "SYSTEM");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
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
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder38 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        org.jsoup.parser.ParseSettings parseSettings42 = null;
        xmlTreeBuilder38.initialiseParse("#doctype", "hi!", parseErrorList41, parseSettings42);
        org.jsoup.parser.Token.Character character44 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder38.insert(character44);
        java.lang.String str46 = character44.getData();
        xmlTreeBuilder0.insert(character44);
        boolean boolean48 = character44.isComment();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.Tag tag3 = tag1.reset();
        boolean boolean4 = tag3.selfClosing;
        java.lang.String str5 = tag3.tagName;
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        tag3.attributes = attributes7;
        org.jsoup.parser.Token.Tag tag9 = tag3.reset();
        tag3.appendAttributeValue('#');
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
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
        boolean boolean14 = doctype0.isStartTag();
        org.jsoup.parser.Token token15 = doctype0.reset();
        java.lang.String str16 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(token15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.String str3 = doctype0.getSystemIdentifier();
        boolean boolean4 = doctype0.isStartTag();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
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
        comment11.bogus = false;
        java.lang.String str19 = comment11.toString();
        boolean boolean20 = comment11.isEndTag();
        org.jsoup.parser.Token token21 = comment11.reset();
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!---->" + "'", str16, "<!---->");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!---->" + "'", str19, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(token21);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "#doctype", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.Character character11 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder0.insert(character11);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document19 = xmlTreeBuilder16.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment20 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder21 = comment20.data;
        xmlTreeBuilder16.insert(comment20);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder23 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.ParseSettings parseSettings27 = null;
        xmlTreeBuilder23.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList26, parseSettings27);
        org.jsoup.parser.Token.Character character29 = new org.jsoup.parser.Token.Character();
        java.lang.String str30 = character29.getData();
        org.jsoup.parser.Token.Character character32 = character29.data("<!---->");
        java.lang.String str33 = character32.getData();
        xmlTreeBuilder23.insert(character32);
        xmlTreeBuilder16.insert(character32);
        org.jsoup.parser.Token.Comment comment36 = new org.jsoup.parser.Token.Comment();
        comment36.bogus = false;
        java.lang.StringBuilder stringBuilder39 = comment36.data;
        java.lang.String str40 = comment36.getData();
        boolean boolean41 = xmlTreeBuilder16.process((org.jsoup.parser.Token) comment36);
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder45 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList48 = null;
        org.jsoup.parser.ParseSettings parseSettings49 = null;
        xmlTreeBuilder45.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList48, parseSettings49);
        org.jsoup.parser.ParseErrorList parseErrorList53 = null;
        org.jsoup.parser.ParseSettings parseSettings54 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList55 = xmlTreeBuilder45.parseFragment("", "#doctype", parseErrorList53, parseSettings54);
        org.jsoup.parser.Token.Comment comment56 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder57 = comment56.data;
        java.lang.String str58 = comment56.toString();
        org.jsoup.parser.Token token59 = comment56.reset();
        boolean boolean60 = xmlTreeBuilder45.process((org.jsoup.parser.Token) comment56);
        org.jsoup.parser.ParseSettings parseSettings61 = xmlTreeBuilder45.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings62 = xmlTreeBuilder45.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList63 = xmlTreeBuilder16.parseFragment("<!DOCTYPE PUBLIC>", "<!---->4", parseErrorList44, parseSettings62);
        xmlTreeBuilder0.initialiseParse("<<!---->#doctype  name=\"\" publicId=\"hi!\" systemId=\"hi!\">", "4", parseErrorList15, parseSettings62);
        org.jsoup.parser.Token.Doctype doctype65 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str66 = doctype65.getName();
        java.lang.String str67 = doctype65.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder68 = doctype65.systemIdentifier;
        boolean boolean69 = doctype65.forceQuirks;
        boolean boolean70 = doctype65.forceQuirks;
        boolean boolean71 = doctype65.isForceQuirks();
        doctype65.forceQuirks = true;
        xmlTreeBuilder0.insert(doctype65);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag75 = doctype65.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(character32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!---->" + "'", str33, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder39);
        org.junit.Assert.assertEquals(stringBuilder39.toString(), "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(nodeList55);
        org.junit.Assert.assertNotNull(stringBuilder57);
        org.junit.Assert.assertEquals(stringBuilder57.toString(), "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "<!---->" + "'", str58, "<!---->");
        org.junit.Assert.assertNotNull(token59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(parseSettings61);
        org.junit.Assert.assertNotNull(parseSettings62);
        org.junit.Assert.assertNotNull(nodeList63);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(stringBuilder68);
        org.junit.Assert.assertEquals(stringBuilder68.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
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
        org.jsoup.parser.ParseSettings parseSettings56 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Comment comment57 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder58 = comment57.data;
        java.lang.String str59 = comment57.toString();
        org.jsoup.parser.Token token60 = comment57.reset();
        org.jsoup.parser.Token token61 = comment57.reset();
        java.lang.String str62 = comment57.toString();
        org.jsoup.parser.Token.Comment comment63 = comment57.asComment();
        xmlTreeBuilder0.insert(comment57);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder65 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document68 = xmlTreeBuilder65.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment69 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder70 = comment69.data;
        xmlTreeBuilder65.insert(comment69);
        org.jsoup.parser.ParseSettings parseSettings72 = xmlTreeBuilder65.defaultSettings();
        org.jsoup.parser.Token.Comment comment73 = new org.jsoup.parser.Token.Comment();
        comment73.bogus = true;
        boolean boolean76 = comment73.bogus;
        xmlTreeBuilder65.insert(comment73);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder78 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList81 = null;
        org.jsoup.parser.ParseSettings parseSettings82 = null;
        xmlTreeBuilder78.initialiseParse("#doctype", "hi!", parseErrorList81, parseSettings82);
        org.jsoup.parser.Token.Character character84 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder78.insert(character84);
        org.jsoup.parser.Token token86 = character84.reset();
        xmlTreeBuilder65.insert(character84);
        org.jsoup.parser.Token.Doctype doctype88 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str89 = doctype88.getName();
        org.jsoup.parser.Token.TokenType tokenType90 = doctype88.type;
        org.jsoup.parser.Token token91 = doctype88.reset();
        xmlTreeBuilder65.insert(doctype88);
        xmlTreeBuilder0.insert(doctype88);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(nodeList52);
        org.junit.Assert.assertNotNull(nodeList53);
        org.junit.Assert.assertNotNull(parseSettings54);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(stringBuilder58);
        org.junit.Assert.assertEquals(stringBuilder58.toString(), "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "<!---->" + "'", str59, "<!---->");
        org.junit.Assert.assertNotNull(token60);
        org.junit.Assert.assertNotNull(token61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "<!---->" + "'", str62, "<!---->");
        org.junit.Assert.assertNotNull(comment63);
        org.junit.Assert.assertNotNull(document68);
        org.junit.Assert.assertNotNull(stringBuilder70);
        org.junit.Assert.assertEquals(stringBuilder70.toString(), "");
        org.junit.Assert.assertNotNull(parseSettings72);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(token86);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertTrue("'" + tokenType90 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType90.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(token91);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        int int8 = node7.siblingIndex();
        java.lang.String str10 = node7.absUrl("4");
        java.lang.String str11 = node7.toString();
        org.jsoup.nodes.Attributes attributes12 = node7.attributes();
        org.jsoup.nodes.Node node13 = node7.parentNode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str6, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str11, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
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
        startTag12.appendAttributeValue('a');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(startTag12);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag8 = startTag0.reset();
        startTag0.appendTagName(' ');
        boolean boolean11 = startTag0.isEOF();
        org.jsoup.parser.Token.Tag tag13 = startTag0.name("Doctype");
        boolean boolean14 = startTag0.isEndTag();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
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
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder30 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.ParseSettings parseSettings34 = null;
        xmlTreeBuilder30.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList33, parseSettings34);
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        org.jsoup.parser.ParseSettings parseSettings39 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList40 = xmlTreeBuilder30.parseFragment("", "#doctype", parseErrorList38, parseSettings39);
        org.jsoup.nodes.Document document43 = xmlTreeBuilder30.parse("SYSTEM", "Doctype");
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder47 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document50 = xmlTreeBuilder47.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment51 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder52 = comment51.data;
        xmlTreeBuilder47.insert(comment51);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder54 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList57 = null;
        org.jsoup.parser.ParseSettings parseSettings58 = null;
        xmlTreeBuilder54.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList57, parseSettings58);
        org.jsoup.parser.Token.Character character60 = new org.jsoup.parser.Token.Character();
        java.lang.String str61 = character60.getData();
        org.jsoup.parser.Token.Character character63 = character60.data("<!---->");
        java.lang.String str64 = character63.getData();
        xmlTreeBuilder54.insert(character63);
        xmlTreeBuilder47.insert(character63);
        org.jsoup.parser.ParseSettings parseSettings67 = xmlTreeBuilder47.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList68 = xmlTreeBuilder30.parseFragment("#doctype", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", parseErrorList46, parseSettings67);
        xmlTreeBuilder0.initialiseParse("", "<!DOCTYPE #doctype PUBLIC \"4\" \"PUBLIC\">", parseErrorList29, parseSettings67);
        org.jsoup.parser.Token.Doctype doctype70 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder71 = doctype70.name;
        java.lang.StringBuilder stringBuilder72 = doctype70.systemIdentifier;
        boolean boolean73 = doctype70.isComment();
        boolean boolean74 = doctype70.isComment();
        xmlTreeBuilder0.insert(doctype70);
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
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertNotNull(stringBuilder52);
        org.junit.Assert.assertEquals(stringBuilder52.toString(), "");
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(character63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "<!---->" + "'", str64, "<!---->");
        org.junit.Assert.assertNotNull(parseSettings67);
        org.junit.Assert.assertNotNull(nodeList68);
        org.junit.Assert.assertNotNull(stringBuilder71);
        org.junit.Assert.assertEquals(stringBuilder71.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder72);
        org.junit.Assert.assertEquals(stringBuilder72.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        java.lang.String str4 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        boolean boolean6 = startTag0.isDoctype();
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("Doctype");
        startTag0.appendAttributeName("<<SYSTEM>>");
        startTag0.appendAttributeName('a');
        startTag0.appendAttributeName('a');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "", "", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str5 = documentType4.baseUri();
        org.jsoup.nodes.Node node6 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes7 = node6.attributes();
        java.lang.String str9 = node6.absUrl("PUBLIC");
        org.jsoup.nodes.Node node10 = node6.clone();
        node10.setBaseUri("EOF");
        org.jsoup.select.NodeVisitor nodeVisitor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node10.traverse(nodeVisitor13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str5, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
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
        org.jsoup.parser.Token.Character character27 = new org.jsoup.parser.Token.Character();
        java.lang.String str28 = character27.getData();
        xmlTreeBuilder0.insert(character27);
        org.jsoup.parser.Token.Character character31 = character27.data("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype32 = character31.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
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
        org.junit.Assert.assertNotNull(character31);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        java.lang.String str8 = startTag0.tagName;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype9 = startTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag2 = startTag0.reset();
        startTag0.normalName = "StartTag";
        org.jsoup.nodes.Attributes attributes5 = startTag0.attributes;
        java.lang.String str6 = startTag0.normalName;
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "StartTag" + "'", str6, "StartTag");
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.String str4 = comment0.getData();
        java.lang.String str5 = comment0.toString();
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        org.jsoup.parser.Token token7 = comment0.reset();
        org.jsoup.parser.Token token8 = comment0.reset();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(token8);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        java.lang.String str4 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        startTag0.appendTagName("<SYSTEM>");
        boolean boolean8 = startTag0.isSelfClosing();
        startTag0.appendAttributeName('4');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
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
        org.jsoup.parser.Token.Doctype doctype47 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str48 = doctype47.getName();
        boolean boolean49 = doctype47.forceQuirks;
        java.lang.String str50 = doctype47.getSystemIdentifier();
        java.lang.String str51 = doctype47.getSystemIdentifier();
        boolean boolean52 = doctype47.isForceQuirks();
        java.lang.String str53 = doctype47.getSystemIdentifier();
        boolean boolean54 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype47);
        org.jsoup.parser.Token.Character character55 = new org.jsoup.parser.Token.Character();
        java.lang.String str56 = character55.getData();
        org.jsoup.parser.Token.Character character58 = character55.data("<!---->");
        org.jsoup.parser.Token.Character character60 = character58.data("<!DOCTYPE #doctype PUBLIC \"4\" \"PUBLIC\">");
        org.jsoup.parser.Token.Character character62 = character58.data("PUBLIC");
        java.lang.String str63 = character62.getData();
        xmlTreeBuilder0.insert(character62);
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
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(character58);
        org.junit.Assert.assertNotNull(character60);
        org.junit.Assert.assertNotNull(character62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "PUBLIC" + "'", str63, "PUBLIC");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        org.jsoup.nodes.Attributes attributes2 = startTag0.attributes;
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        tag3.finaliseTag();
        boolean boolean5 = tag3.isDoctype();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        int int8 = documentType4.childNodeSize();
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node10 = documentType4.clone();
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node13 = documentType4.nextSibling();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SYSTEM" + "'", str9, "SYSTEM");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">", "#doctype", "#doctype", "StartTag");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = documentType4.before("<!---->4");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        org.jsoup.parser.Token.reset(stringBuilder3);
        org.jsoup.parser.Token.reset(stringBuilder3);
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
        java.lang.String str8 = documentType4.outerHtml();
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("", "SYSTEM", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.Document document15 = documentType14.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = documentType4.after((org.jsoup.nodes.Node) document15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str8, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SYSTEM" + "'", str9, "SYSTEM");
        org.junit.Assert.assertNull(document15);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean9 = documentType4.equals(obj8);
        org.jsoup.nodes.Node node10 = documentType4.nextSibling();
        org.jsoup.parser.Token.Doctype doctype11 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder12 = doctype11.name;
        boolean boolean13 = doctype11.forceQuirks;
        boolean boolean14 = doctype11.isCharacter();
        boolean boolean15 = doctype11.isForceQuirks();
        java.lang.StringBuilder stringBuilder16 = doctype11.name;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = node10.hasSameValue((java.lang.Object) stringBuilder16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        java.lang.String str8 = startTag0.tagName;
        startTag0.appendAttributeValue("Character");
        startTag0.selfClosing = false;
        startTag0.appendAttributeValue("<!---->");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str10 = startTag9.normalName;
        startTag9.newAttribute();
        java.lang.String str12 = startTag9.normalName();
        startTag9.appendAttributeName("");
        startTag9.normalName = "hi!";
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str19 = startTag18.normalName;
        org.jsoup.nodes.Attributes attributes20 = startTag18.attributes;
        org.jsoup.parser.Token.StartTag startTag21 = startTag9.nameAttr("SYSTEM", attributes20);
        boolean boolean22 = documentType4.equals((java.lang.Object) attributes20);
        org.jsoup.nodes.Node node24 = documentType4.removeAttr("<SYSTEM>");
        org.jsoup.nodes.Node node25 = node24.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes26 = node25.attributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(startTag21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
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
        tag1.appendAttributeValue(intArray35);
        boolean boolean39 = tag1.isSelfClosing();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(startTag20);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 0, 32, 35 });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
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
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag29 = startTag28.reset();
        tag29.finaliseTag();
        tag29.appendTagName('4');
        org.jsoup.nodes.Attributes attributes33 = tag29.getAttributes();
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag35 = startTag34.reset();
        tag35.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag37 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str38 = startTag37.normalName;
        startTag37.newAttribute();
        java.lang.String str40 = startTag37.normalName();
        org.jsoup.parser.Token.StartTag startTag42 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag43 = startTag42.reset();
        tag43.finaliseTag();
        org.jsoup.nodes.DocumentType documentType49 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean51 = documentType49.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes52 = documentType49.attributes();
        tag43.attributes = attributes52;
        org.jsoup.parser.Token.StartTag startTag54 = startTag37.nameAttr("<!---->", attributes52);
        tag35.attributes = attributes52;
        char[] charArray57 = new char[] { 'a' };
        tag35.appendAttributeValue(charArray57);
        tag29.appendAttributeValue(charArray57);
        org.jsoup.parser.Token.StartTag startTag60 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag61 = startTag60.reset();
        org.jsoup.parser.Token.Tag tag62 = startTag60.reset();
        org.jsoup.parser.Token.StartTag startTag63 = tag62.asStartTag();
        org.jsoup.parser.Token.StartTag startTag64 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str65 = startTag64.normalName;
        org.jsoup.nodes.Attributes attributes66 = startTag64.attributes;
        startTag63.attributes = attributes66;
        tag29.attributes = attributes66;
        boolean boolean69 = xmlTreeBuilder0.processStartTag("StartTag", attributes66);
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
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(attributes52);
        org.junit.Assert.assertNotNull(startTag54);
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertArrayEquals(charArray57, new char[] { 'a' });
        org.junit.Assert.assertNotNull(tag61);
        org.junit.Assert.assertNotNull(tag62);
        org.junit.Assert.assertNotNull(startTag63);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(attributes66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
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
        boolean boolean28 = doctype23.isEOF();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(token21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + tokenType25 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType25.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(token26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        java.lang.String str2 = comment0.toString();
        boolean boolean3 = comment0.isDoctype();
        boolean boolean4 = comment0.isStartTag();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.toString();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token token5 = token4.reset();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(token5);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        boolean boolean4 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
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
        boolean boolean17 = comment11.bogus;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag18 = comment11.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!---->" + "'", str16, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
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
        org.jsoup.parser.Token.Doctype doctype52 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str53 = doctype52.getName();
        org.jsoup.parser.Token.TokenType tokenType54 = doctype52.type;
        org.jsoup.parser.Token token55 = doctype52.reset();
        java.lang.StringBuilder stringBuilder56 = doctype52.name;
        boolean boolean57 = doctype52.forceQuirks;
        xmlTreeBuilder0.insert(doctype52);
        org.jsoup.parser.ParseSettings parseSettings59 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings60 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList63 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder64 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document67 = xmlTreeBuilder64.parse("SYSTEM", "#doctype");
        org.jsoup.parser.ParseErrorList parseErrorList70 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder71 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList74 = null;
        org.jsoup.parser.ParseSettings parseSettings75 = null;
        xmlTreeBuilder71.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList74, parseSettings75);
        org.jsoup.parser.ParseErrorList parseErrorList79 = null;
        org.jsoup.parser.ParseSettings parseSettings80 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList81 = xmlTreeBuilder71.parseFragment("", "#doctype", parseErrorList79, parseSettings80);
        org.jsoup.parser.Token.Character character82 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder71.insert(character82);
        org.jsoup.parser.ParseErrorList parseErrorList86 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder87 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings88 = xmlTreeBuilder87.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList89 = xmlTreeBuilder71.parseFragment("SYSTEM", "PUBLIC", parseErrorList86, parseSettings88);
        xmlTreeBuilder64.initialiseParse("#doctype", "PUBLIC", parseErrorList70, parseSettings88);
        java.util.List<org.jsoup.nodes.Node> nodeList91 = xmlTreeBuilder0.parseFragment("Comment", "<<!---->>", parseErrorList63, parseSettings88);
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
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + tokenType54 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType54.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(token55);
        org.junit.Assert.assertNotNull(stringBuilder56);
        org.junit.Assert.assertEquals(stringBuilder56.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(parseSettings59);
        org.junit.Assert.assertNotNull(parseSettings60);
        org.junit.Assert.assertNotNull(document67);
        org.junit.Assert.assertNotNull(nodeList81);
        org.junit.Assert.assertNotNull(parseSettings88);
        org.junit.Assert.assertNotNull(nodeList89);
        org.junit.Assert.assertNotNull(nodeList91);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
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
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str20 = startTag19.normalName;
        startTag19.newAttribute();
        java.lang.String str22 = startTag19.normalName();
        startTag19.appendAttributeName("");
        startTag19.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag27 = startTag19.reset();
        org.jsoup.parser.Token.Tag tag28 = startTag19.reset();
        org.jsoup.nodes.Attributes attributes29 = startTag19.attributes;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = xmlTreeBuilder0.processStartTag("<!---->4", attributes29);
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
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(attributes29);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        int int8 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("<!---->4");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.childNodes();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.Tag tag3 = tag1.reset();
        org.jsoup.nodes.Attributes attributes4 = tag3.attributes;
        org.jsoup.parser.Token.Tag tag5 = tag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag3.asStartTag();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str8 = startTag7.normalName;
        startTag7.newAttribute();
        java.lang.String str10 = startTag7.normalName();
        startTag7.appendAttributeName("");
        boolean boolean13 = startTag7.isSelfClosing();
        org.jsoup.parser.Token.Tag tag14 = startTag7.reset();
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
        tag16.appendTagName("Doctype");
        org.jsoup.parser.Token.TokenType tokenType49 = org.jsoup.parser.Token.TokenType.EOF;
        tag16.type = tokenType49;
        org.jsoup.parser.Token.StartTag startTag51 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str52 = startTag51.normalName;
        startTag51.newAttribute();
        java.lang.String str54 = startTag51.normalName();
        startTag51.appendAttributeName("");
        startTag51.normalName = "hi!";
        startTag51.appendTagName("PUBLIC");
        org.jsoup.parser.Token.StartTag startTag61 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag62 = startTag61.reset();
        tag62.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag64 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str65 = startTag64.normalName;
        startTag64.newAttribute();
        java.lang.String str67 = startTag64.normalName();
        org.jsoup.parser.Token.StartTag startTag69 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag70 = startTag69.reset();
        tag70.finaliseTag();
        org.jsoup.nodes.DocumentType documentType76 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean78 = documentType76.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes79 = documentType76.attributes();
        tag70.attributes = attributes79;
        org.jsoup.parser.Token.StartTag startTag81 = startTag64.nameAttr("<!---->", attributes79);
        tag62.attributes = attributes79;
        char[] charArray84 = new char[] { 'a' };
        tag62.appendAttributeValue(charArray84);
        startTag51.appendAttributeValue(charArray84);
        tag16.appendAttributeValue(charArray84);
        startTag7.appendAttributeValue(charArray84);
        tag3.appendAttributeValue(charArray84);
        org.jsoup.nodes.Attributes attributes90 = tag3.getAttributes();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
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
        org.junit.Assert.assertTrue("'" + tokenType49 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType49.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(tag62);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNotNull(tag70);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(attributes79);
        org.junit.Assert.assertNotNull(startTag81);
        org.junit.Assert.assertNotNull(charArray84);
        org.junit.Assert.assertArrayEquals(charArray84, new char[] { 'a' });
        org.junit.Assert.assertNotNull(attributes90);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
        java.lang.String str8 = documentType4.outerHtml();
        java.lang.String str10 = documentType4.attr("Character");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str8, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag2 = startTag0.reset();
        org.jsoup.parser.Token.StartTag startTag3 = tag2.asStartTag();
        java.lang.String str4 = startTag3.tagName;
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment6 = startTag3.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(tag5);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("SYSTEM", "SYSTEM", "#doctype", "SYSTEM");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("PUBLIC");
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("StartTag");
        java.lang.String str10 = documentType4.attr("<Doctype>");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "<!DOCTYPE PUBLIC \"SYSTEM\" \"<!DOCTYPE PUBLIC \"hi!\" \"hi!\">\">", "<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">>");
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        int int8 = documentType4.childNodeSize();
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node10 = documentType4.clone();
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "", "", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.parser.Token.Doctype doctype18 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder19 = doctype18.name;
        java.lang.StringBuilder stringBuilder20 = doctype18.systemIdentifier;
        java.lang.StringBuilder stringBuilder21 = documentType17.html(stringBuilder20);
        org.jsoup.nodes.Node node22 = documentType17.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = documentType4.after((org.jsoup.nodes.Node) documentType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SYSTEM" + "'", str9, "SYSTEM");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">>");
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">>");
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
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
        org.jsoup.parser.Token.Doctype doctype47 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str48 = doctype47.getName();
        boolean boolean49 = doctype47.forceQuirks;
        java.lang.String str50 = doctype47.getSystemIdentifier();
        java.lang.String str51 = doctype47.getSystemIdentifier();
        boolean boolean52 = doctype47.isForceQuirks();
        java.lang.String str53 = doctype47.getSystemIdentifier();
        boolean boolean54 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype47);
        org.jsoup.nodes.Document document57 = xmlTreeBuilder0.parse("<!---->", "");
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
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(document57);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
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
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("4", "<SYSTEM>", "4", "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">");
        org.jsoup.nodes.Node node20 = documentType19.nextSibling();
        org.jsoup.nodes.DocumentType documentType25 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean27 = documentType25.hasSameValue((java.lang.Object) (short) -1);
        java.util.List<org.jsoup.nodes.Node> nodeList28 = documentType25.siblingNodes();
        java.lang.String str29 = documentType25.outerHtml();
        java.lang.String str30 = documentType25.baseUri();
        org.jsoup.nodes.Node node31 = documentType25.nextSibling();
        boolean boolean32 = documentType19.equals((java.lang.Object) documentType25);
        org.jsoup.nodes.Node node33 = documentType19.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = documentType4.after((org.jsoup.nodes.Node) documentType19);
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
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str29, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "SYSTEM" + "'", str30, "SYSTEM");
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(node33);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
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
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder23 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document26 = xmlTreeBuilder23.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment27 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder28 = comment27.data;
        xmlTreeBuilder23.insert(comment27);
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
        java.lang.String str48 = startTag47.name();
        boolean boolean49 = xmlTreeBuilder23.process((org.jsoup.parser.Token) startTag47);
        org.jsoup.parser.ParseErrorList parseErrorList52 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder53 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList56 = null;
        org.jsoup.parser.ParseSettings parseSettings57 = null;
        xmlTreeBuilder53.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList56, parseSettings57);
        org.jsoup.parser.ParseErrorList parseErrorList61 = null;
        org.jsoup.parser.ParseSettings parseSettings62 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList63 = xmlTreeBuilder53.parseFragment("", "#doctype", parseErrorList61, parseSettings62);
        org.jsoup.parser.Token.Comment comment64 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder65 = comment64.data;
        java.lang.String str66 = comment64.toString();
        org.jsoup.parser.Token token67 = comment64.reset();
        boolean boolean68 = xmlTreeBuilder53.process((org.jsoup.parser.Token) comment64);
        org.jsoup.parser.ParseSettings parseSettings69 = xmlTreeBuilder53.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings70 = xmlTreeBuilder53.defaultSettings();
        xmlTreeBuilder23.initialiseParse("4", "SYSTEM", parseErrorList52, parseSettings70);
        org.jsoup.parser.Token.StartTag startTag72 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str73 = startTag72.normalName;
        startTag72.newAttribute();
        org.jsoup.parser.Token.Tag tag75 = startTag72.reset();
        org.jsoup.parser.Token.StartTag startTag76 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag77 = startTag76.reset();
        tag77.finaliseTag();
        tag77.appendTagName('4');
        int[] intArray84 = new int[] { 0, ' ', '#' };
        tag77.appendAttributeValue(intArray84);
        startTag72.appendAttributeValue(intArray84);
        org.jsoup.parser.Token.StartTag startTag88 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag89 = startTag88.reset();
        tag89.finaliseTag();
        org.jsoup.parser.Token.Tag tag91 = tag89.reset();
        org.jsoup.nodes.Attributes attributes92 = tag91.attributes;
        org.jsoup.parser.Token.StartTag startTag93 = startTag72.nameAttr("<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">", attributes92);
        org.jsoup.parser.Token.StartTag startTag94 = startTag93.asStartTag();
        startTag93.appendAttributeName('#');
        org.jsoup.nodes.Element element97 = xmlTreeBuilder23.insert(startTag93);
        boolean boolean98 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag93);
        boolean boolean99 = startTag93.isCharacter();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(token21);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertNotNull(startTag47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "<!---->" + "'", str48, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(nodeList63);
        org.junit.Assert.assertNotNull(stringBuilder65);
        org.junit.Assert.assertEquals(stringBuilder65.toString(), "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "<!---->" + "'", str66, "<!---->");
        org.junit.Assert.assertNotNull(token67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(parseSettings69);
        org.junit.Assert.assertNotNull(parseSettings70);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNotNull(tag75);
        org.junit.Assert.assertNotNull(tag77);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertArrayEquals(intArray84, new int[] { 0, 32, 35 });
        org.junit.Assert.assertNotNull(tag89);
        org.junit.Assert.assertNotNull(tag91);
        org.junit.Assert.assertNotNull(attributes92);
        org.junit.Assert.assertNotNull(startTag93);
        org.junit.Assert.assertNotNull(startTag94);
        org.junit.Assert.assertNotNull(element97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        java.lang.String str4 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag6 = startTag0.reset();
        java.lang.String str7 = startTag0.normalName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">");
        // The following exception was thrown during execution in test generation
        try {
            document13.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document13);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
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
        org.jsoup.nodes.Attributes attributes18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = xmlTreeBuilder0.processStartTag("", attributes18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(parseSettings16);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.String str3 = comment0.getData();
        boolean boolean4 = comment0.isComment();
        java.lang.String str5 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.String str3 = doctype0.getSystemIdentifier();
        boolean boolean4 = doctype0.isComment();
        java.lang.String str5 = doctype0.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment6 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
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
        boolean boolean11 = tag7.isEOF();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag13 = startTag12.reset();
        tag13.finaliseTag();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean21 = documentType19.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes22 = documentType19.attributes();
        tag13.attributes = attributes22;
        java.lang.String str24 = tag13.tagName;
        tag13.appendAttributeValue('4');
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag28 = startTag27.reset();
        tag28.finaliseTag();
        tag28.appendTagName('4');
        org.jsoup.nodes.Attributes attributes32 = tag28.getAttributes();
        tag13.attributes = attributes32;
        tag13.normalName = "<!---->";
        int[] intArray39 = new int[] { (byte) 1, (byte) 1, (short) 0 };
        tag13.appendAttributeValue(intArray39);
        tag7.appendAttributeValue(intArray39);
        tag7.newAttribute();
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 1, 1, 0 });
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        java.lang.String str7 = documentType4.baseUri();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = node8.clone();
        int int10 = node9.siblingIndex();
        java.lang.String str11 = node9.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = node9.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SYSTEM" + "'", str7, "SYSTEM");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str11, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
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
        // The following exception was thrown during execution in test generation
        try {
            document26.remove();
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
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertNotNull(document26);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        java.lang.String str4 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        boolean boolean6 = startTag0.isDoctype();
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("Doctype");
        startTag0.appendAttributeName("<<SYSTEM>>");
        startTag0.appendAttributeName('a');
        startTag0.appendTagName(' ');
        startTag0.setEmptyAttributeValue();
        startTag0.appendAttributeName("4a");
        startTag0.appendAttributeValue('a');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
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
        org.jsoup.parser.Token.Tag tag16 = startTag12.reset();
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag18 = startTag17.reset();
        tag18.finaliseTag();
        tag18.appendTagName('4');
        org.jsoup.nodes.Attributes attributes22 = tag18.getAttributes();
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag24 = startTag23.reset();
        tag24.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str27 = startTag26.normalName;
        startTag26.newAttribute();
        java.lang.String str29 = startTag26.normalName();
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag32 = startTag31.reset();
        tag32.finaliseTag();
        org.jsoup.nodes.DocumentType documentType38 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean40 = documentType38.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes41 = documentType38.attributes();
        tag32.attributes = attributes41;
        org.jsoup.parser.Token.StartTag startTag43 = startTag26.nameAttr("<!---->", attributes41);
        tag24.attributes = attributes41;
        char[] charArray46 = new char[] { 'a' };
        tag24.appendAttributeValue(charArray46);
        tag18.appendAttributeValue(charArray46);
        tag16.appendAttributeValue(charArray46);
        org.jsoup.nodes.Attributes attributes50 = null;
        tag16.attributes = attributes50;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertNotNull(startTag43);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] { 'a' });
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.InRow;
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str2 = startTag1.normalName;
        startTag1.newAttribute();
        java.lang.String str4 = startTag1.normalName();
        startTag1.appendAttributeName("");
        startTag1.normalName = "hi!";
        startTag1.appendTagName("PUBLIC");
        org.jsoup.parser.Token.Tag tag11 = startTag1.reset();
        org.jsoup.parser.Token.Tag tag13 = tag11.name("4");
        tag13.selfClosing = false;
        tag13.appendTagName('a');
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) tag13, htmlTreeBuilder18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag13);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        startTag0.appendTagName("PUBLIC");
        org.jsoup.parser.Token.Tag tag10 = startTag0.reset();
        boolean boolean11 = tag10.selfClosing;
        tag10.appendAttributeValue(' ');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        java.lang.String str4 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag6 = tag5.reset();
        boolean boolean7 = tag5.selfClosing;
        boolean boolean8 = tag5.isSelfClosing();
        boolean boolean9 = tag5.isCharacter();
        boolean boolean10 = tag5.selfClosing;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.String str3 = comment0.toString();
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.bogus;
        comment0.bogus = false;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        java.lang.String str7 = documentType4.baseUri();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node11 = documentType4.attr("<<SYSTEM>>", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        boolean boolean13 = documentType4.equals((java.lang.Object) " ");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SYSTEM" + "'", str7, "SYSTEM");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.Tag tag3 = tag1.reset();
        tag3.appendTagName('#');
        org.jsoup.parser.Token.StartTag startTag6 = tag3.asStartTag();
        tag3.normalName = "<!---->4";
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(startTag6);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        java.lang.String str9 = documentType4.nodeName();
        java.lang.String str10 = documentType4.nodeName();
        java.lang.String str12 = documentType4.attr("<!---->");
        java.lang.Class<?> wildcardClass13 = documentType4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
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
        org.jsoup.nodes.DocumentType documentType28 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean30 = documentType28.hasSameValue((java.lang.Object) (short) -1);
        java.util.List<org.jsoup.nodes.Node> nodeList31 = documentType28.siblingNodes();
        boolean boolean33 = documentType28.equals((java.lang.Object) 0L);
        org.jsoup.nodes.Node node34 = documentType28.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = documentType28.siblingNodes();
        documentType28.setBaseUri("4");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(nodeList35);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("SYSTEM", "SYSTEM", "#doctype", "SYSTEM");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("PUBLIC");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = org.jsoup.parser.HtmlTreeBuilderState.ForeignContent;
        boolean boolean8 = documentType4.hasSameValue((java.lang.Object) htmlTreeBuilderState7);
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("EOF");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.siblingNodes();
        org.jsoup.nodes.Node node12 = documentType4.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node12.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
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
        org.jsoup.parser.Token.Tag tag37 = startTag0.name("hi!");
        boolean boolean38 = startTag0.isSelfClosing();
        boolean boolean39 = startTag0.isEndTag();
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
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        int int8 = documentType4.childNodeSize();
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node10 = documentType4.clone();
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        boolean boolean14 = documentType4.hasAttr("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str15 = documentType4.nodeName();
        org.jsoup.nodes.Node node18 = documentType4.attr("<!DOCTYPE PUBLIC>", "<<!---->  name=\"\" publicId=\"hi!\" systemId=\"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SYSTEM" + "'", str9, "SYSTEM");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#doctype" + "'", str15, "#doctype");
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        startTag0.tagName = "<SYSTEM>";
        org.jsoup.nodes.Attributes attributes5 = startTag0.getAttributes();
        java.lang.String str6 = startTag0.normalName();
        startTag0.finaliseTag();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
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
        java.lang.String str15 = doctype6.getPublicIdentifier();
        boolean boolean16 = doctype6.isEOF();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.childNodesCopy();
        java.lang.String str10 = documentType4.absUrl("<<!---->#doctype  name=\"\" publicId=\"hi!\" systemId=\"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        java.lang.String str2 = comment0.toString();
        java.lang.String str3 = comment0.getData();
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        org.jsoup.parser.Token token5 = comment0.reset();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(token5);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag8 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag9 = startTag0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character10 = startTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        boolean boolean6 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        java.lang.String str8 = tag7.tagName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">");
        int int14 = document13.siblingIndex();
        java.lang.String str15 = document13.toString();
        java.lang.String str16 = document13.toString();
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE PUBLIC>" + "'", str15, "<!DOCTYPE PUBLIC>");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE PUBLIC>" + "'", str16, "<!DOCTYPE PUBLIC>");
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isComment();
        org.jsoup.parser.Token.Doctype doctype4 = doctype0.asDoctype();
        java.lang.String str5 = doctype4.getName();
        boolean boolean6 = doctype4.isDoctype();
        java.lang.StringBuilder stringBuilder7 = doctype4.publicIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag8 = doctype4.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(doctype4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "", "", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str5 = documentType4.baseUri();
        org.jsoup.nodes.Node node6 = documentType4.clone();
        org.jsoup.nodes.Document document7 = node6.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = document7.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str5, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node7.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str6, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        tag1.appendTagName('4');
        org.jsoup.nodes.Attributes attributes5 = tag1.attributes;
        org.jsoup.parser.Token.StartTag startTag6 = tag1.asStartTag();
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
        startTag7.appendAttributeName("StartTag");
        startTag7.appendTagName("#doctype");
        org.jsoup.nodes.Attributes attributes29 = startTag7.attributes;
        startTag6.attributes = attributes29;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype31 = startTag6.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(startTag24);
        org.junit.Assert.assertNotNull(attributes29);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
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
        org.jsoup.nodes.Attributes attributes81 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean82 = xmlTreeBuilder0.processStartTag("", attributes81);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        startTag0.appendTagName("PUBLIC");
        org.jsoup.parser.Token.Tag tag10 = startTag0.reset();
        tag10.tagName = "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">";
        tag10.selfClosing = false;
        tag10.tagName = "<SYSTEM>";
        java.lang.String str17 = tag10.tagName;
        org.jsoup.nodes.Attributes attributes18 = tag10.getAttributes();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<SYSTEM>" + "'", str17, "<SYSTEM>");
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        java.lang.String str4 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag6 = tag5.reset();
        java.lang.String str7 = tag5.normalName;
        org.jsoup.parser.Token.TokenType tokenType8 = tag5.type;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        java.lang.String str9 = documentType4.nodeName();
        java.lang.String str10 = documentType4.baseUri();
        documentType4.setBaseUri("EOF");
        int int13 = documentType4.childNodeSize();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SYSTEM" + "'", str10, "SYSTEM");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
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
        org.jsoup.nodes.DocumentType documentType36 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int37 = documentType36.siblingIndex();
        java.lang.String str38 = documentType36.toString();
        org.jsoup.nodes.Node node39 = documentType36.clone();
        int int40 = node39.siblingIndex();
        java.lang.String str42 = node39.absUrl("4");
        java.lang.String str43 = node39.toString();
        org.jsoup.parser.Token.Doctype doctype44 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str45 = doctype44.getName();
        java.lang.String str46 = doctype44.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder47 = doctype44.systemIdentifier;
        java.lang.Appendable appendable48 = node39.html((java.lang.Appendable) stringBuilder47);
        org.jsoup.nodes.Document document49 = node39.ownerDocument();
        org.jsoup.nodes.Node node51 = node39.removeAttr("#doctype");
        org.jsoup.nodes.Attributes attributes52 = node39.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean53 = xmlTreeBuilder0.processStartTag("<<!---->  name=\"\" publicId=\"hi!\" systemId=\"hi!\">", attributes52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str38, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str43, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(stringBuilder47);
        org.junit.Assert.assertEquals(stringBuilder47.toString(), "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(appendable48);
        org.junit.Assert.assertNull(document49);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(attributes52);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
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
        java.lang.String str14 = doctype6.tokenType();
        boolean boolean15 = doctype6.isForceQuirks();
        java.lang.StringBuilder stringBuilder16 = doctype6.publicIdentifier;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Doctype" + "'", str14, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.nodes.DocumentType documentType7 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean9 = documentType7.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes10 = documentType7.attributes();
        tag1.attributes = attributes10;
        tag1.appendTagName("#doctype");
        tag1.newAttribute();
        boolean boolean15 = tag1.selfClosing;
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag2 = startTag0.reset();
        org.jsoup.nodes.DocumentType documentType8 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str9 = documentType8.nodeName();
        org.jsoup.nodes.Attributes attributes10 = documentType8.attributes();
        org.jsoup.parser.Token.StartTag startTag11 = startTag0.nameAttr("", attributes10);
        org.jsoup.parser.Token.Tag tag12 = startTag11.reset();
        org.jsoup.parser.Token.Tag tag13 = startTag11.reset();
        org.jsoup.parser.Token.StartTag startTag14 = startTag11.asStartTag();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(startTag14);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "SYSTEM", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("<SYSTEM>", "Doctype");
        org.jsoup.nodes.Node node8 = node7.previousSibling();
        org.jsoup.parser.Token.Doctype doctype9 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str10 = doctype9.getName();
        org.jsoup.parser.Token.TokenType tokenType11 = doctype9.type;
        org.jsoup.parser.Token token12 = doctype9.reset();
        java.lang.StringBuilder stringBuilder13 = doctype9.name;
        java.lang.StringBuilder stringBuilder14 = doctype9.publicIdentifier;
        org.jsoup.parser.Token.reset(stringBuilder14);
        java.lang.StringBuilder stringBuilder16 = node7.html(stringBuilder14);
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean23 = documentType21.hasAttr("hi!");
        org.jsoup.nodes.Node node24 = documentType21.clone();
        org.jsoup.nodes.DocumentType documentType29 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean31 = documentType29.hasAttr("hi!");
        int int32 = documentType29.childNodeSize();
        int int33 = documentType29.childNodeSize();
        org.jsoup.nodes.Node node35 = documentType29.removeAttr("<!---->4");
        org.jsoup.nodes.Node node37 = documentType29.removeAttr("<!---->4");
        org.jsoup.nodes.Attributes attributes38 = node37.attributes();
        org.jsoup.nodes.Node node39 = node37.clone();
        boolean boolean40 = documentType21.hasSameValue((java.lang.Object) node37);
        boolean boolean41 = node7.hasSameValue((java.lang.Object) documentType21);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "<!DOCTYPE PUBLIC \"SYSTEM\" \"<!DOCTYPE PUBLIC \"hi!\" \"hi!\">\">");
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "<!DOCTYPE PUBLIC \"SYSTEM\" \"<!DOCTYPE PUBLIC \"hi!\" \"hi!\">\">");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
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
        org.jsoup.nodes.Node node20 = documentType4.removeAttr("<<SYSTEM>>");
        org.jsoup.nodes.Node node22 = node20.removeAttr("<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">");
        org.jsoup.nodes.DocumentType documentType27 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int28 = documentType27.siblingIndex();
        org.jsoup.nodes.Node node31 = documentType27.attr("hi!", "hi!");
        java.lang.String str33 = node31.absUrl("Doctype");
        node31.setBaseUri("");
        org.jsoup.nodes.Node node36 = node31.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            node22.replaceWith(node36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str7, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(node36);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        boolean boolean1 = eOF0.isDoctype();
        boolean boolean2 = eOF0.isEOF();
        org.jsoup.parser.Token token3 = eOF0.reset();
        org.jsoup.parser.Token token4 = eOF0.reset();
        org.jsoup.parser.Token token5 = eOF0.reset();
        org.jsoup.parser.Token token6 = eOF0.reset();
        org.jsoup.parser.Token token7 = eOF0.reset();
        boolean boolean8 = token7.isCharacter();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("StartTag");
        org.jsoup.nodes.Node node13 = documentType4.attr("#", "#");
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int19 = documentType18.siblingIndex();
        org.jsoup.nodes.Node node22 = documentType18.attr("hi!", "hi!");
        int int23 = documentType18.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = node13.before((org.jsoup.nodes.Node) documentType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataEscapedLessthanSign;
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
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
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
        startTag0.appendAttributeName("SYSTEM");
        boolean boolean20 = startTag0.isDoctype();
        java.lang.String str21 = startTag0.toString();
        org.jsoup.parser.Token.TokenType tokenType22 = startTag0.type;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<<!---->  name=\"\" publicId=\"hi!\" systemId=\"hi!\">" + "'", str21, "<<!---->  name=\"\" publicId=\"hi!\" systemId=\"hi!\">");
        org.junit.Assert.assertTrue("'" + tokenType22 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType22.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag8 = startTag0.reset();
        startTag0.newAttribute();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str11 = startTag10.normalName;
        startTag10.newAttribute();
        java.lang.String str13 = startTag10.normalName();
        startTag10.appendAttributeName("");
        startTag10.normalName = "hi!";
        java.lang.String str18 = startTag10.tagName;
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean25 = documentType23.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes26 = documentType23.attributes();
        startTag10.attributes = attributes26;
        boolean boolean28 = startTag10.isComment();
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str31 = startTag30.normalName;
        startTag30.newAttribute();
        org.jsoup.parser.Token.Tag tag33 = startTag30.reset();
        java.lang.String str34 = startTag30.normalName();
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str37 = startTag36.normalName;
        startTag36.newAttribute();
        java.lang.String str39 = startTag36.normalName();
        java.lang.String str40 = startTag36.normalName();
        org.jsoup.parser.Token.Tag tag41 = startTag36.reset();
        boolean boolean42 = startTag36.isDoctype();
        org.jsoup.parser.Token.Tag tag44 = startTag36.name("Doctype");
        org.jsoup.nodes.Attributes attributes45 = tag44.attributes;
        org.jsoup.parser.Token.StartTag startTag46 = startTag30.nameAttr("<!---->", attributes45);
        startTag30.normalName = "StartTag";
        org.jsoup.parser.Token.StartTag startTag49 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag50 = startTag49.reset();
        tag50.finaliseTag();
        tag50.appendTagName('4');
        org.jsoup.nodes.Attributes attributes54 = tag50.getAttributes();
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
        char[] charArray78 = new char[] { 'a' };
        tag56.appendAttributeValue(charArray78);
        tag50.appendAttributeValue(charArray78);
        org.jsoup.parser.Token.StartTag startTag81 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag82 = startTag81.reset();
        org.jsoup.parser.Token.Tag tag83 = startTag81.reset();
        org.jsoup.parser.Token.StartTag startTag84 = tag83.asStartTag();
        org.jsoup.parser.Token.StartTag startTag85 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str86 = startTag85.normalName;
        org.jsoup.nodes.Attributes attributes87 = startTag85.attributes;
        startTag84.attributes = attributes87;
        tag50.attributes = attributes87;
        startTag30.attributes = attributes87;
        org.jsoup.parser.Token.StartTag startTag91 = startTag10.nameAttr("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", attributes87);
        startTag0.attributes = attributes87;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertNotNull(startTag46);
        org.junit.Assert.assertNotNull(tag50);
        org.junit.Assert.assertNotNull(attributes54);
        org.junit.Assert.assertNotNull(tag56);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(tag64);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(attributes73);
        org.junit.Assert.assertNotNull(startTag75);
        org.junit.Assert.assertNotNull(charArray78);
        org.junit.Assert.assertArrayEquals(charArray78, new char[] { 'a' });
        org.junit.Assert.assertNotNull(tag82);
        org.junit.Assert.assertNotNull(tag83);
        org.junit.Assert.assertNotNull(startTag84);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertNotNull(attributes87);
        org.junit.Assert.assertNotNull(startTag91);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        boolean boolean7 = documentType4.hasAttr("");
        org.jsoup.parser.Token.Doctype doctype8 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str9 = doctype8.getName();
        java.lang.String str10 = doctype8.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder11 = doctype8.systemIdentifier;
        java.lang.StringBuilder stringBuilder12 = documentType4.html(stringBuilder11);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int19 = documentType18.siblingIndex();
        java.lang.String str20 = documentType18.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = documentType18.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = documentType18.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = documentType4.before((org.jsoup.nodes.Node) documentType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str20, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(nodeList22);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        org.jsoup.parser.Token.TokenType tokenType2 = doctype0.type;
        org.jsoup.parser.Token token3 = doctype0.reset();
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        doctype0.forceQuirks = true;
        boolean boolean8 = doctype0.isForceQuirks();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        java.lang.String str7 = documentType4.baseUri();
        java.lang.String str9 = documentType4.attr("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("SYSTEM", "SYSTEM", "#doctype", "SYSTEM");
        org.jsoup.nodes.Node node16 = documentType14.removeAttr("PUBLIC");
        org.jsoup.nodes.Node node18 = documentType14.removeAttr("StartTag");
        org.jsoup.nodes.Node node21 = documentType14.attr("<<!---->#doctype  name=\"\" publicId=\"hi!\" systemId=\"hi!\">", "StartTag");
        int int22 = node21.childNodeSize();
        org.jsoup.nodes.Node node23 = node21.previousSibling();
        boolean boolean24 = documentType4.equals((java.lang.Object) node23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SYSTEM" + "'", str7, "SYSTEM");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.Tag tag3 = tag1.reset();
        org.jsoup.nodes.Attributes attributes4 = tag3.attributes;
        java.lang.String str5 = tag3.tokenType();
        tag3.newAttribute();
        boolean boolean7 = tag3.isComment();
        org.jsoup.parser.Token.Tag tag9 = tag3.name("StartTag");
        boolean boolean10 = tag9.isEndTag();
        java.lang.String str11 = tag9.normalName;
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "starttag" + "'", str11, "starttag");
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
        documentType4.setBaseUri("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node10 = documentType4.parentNode();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = documentType4.traverse(nodeVisitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        boolean boolean5 = document3.hasAttr("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node6 = document3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node6.childNodesCopy();
        java.lang.String str9 = node6.absUrl("<!---->4");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node6.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
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
        java.lang.String str14 = doctype6.tokenType();
        boolean boolean15 = doctype6.forceQuirks;
        boolean boolean16 = doctype6.forceQuirks;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Doctype" + "'", str14, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.nodes.DocumentType documentType7 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean9 = documentType7.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes10 = documentType7.attributes();
        tag1.attributes = attributes10;
        java.lang.String str12 = tag1.tagName;
        boolean boolean13 = tag1.selfClosing;
        boolean boolean14 = tag1.selfClosing;
        org.jsoup.nodes.Attributes attributes15 = tag1.attributes;
        boolean boolean16 = tag1.isDoctype();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
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
        java.lang.String str32 = startTag29.tagName;
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
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
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
        org.jsoup.nodes.Attributes attributes29 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = xmlTreeBuilder0.processStartTag("<4>", attributes29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(token21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + tokenType25 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType25.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(token26);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        boolean boolean4 = comment0.isEOF();
        java.lang.String str5 = comment0.toString();
        java.lang.String str6 = comment0.getData();
        java.lang.String str7 = comment0.getData();
        org.jsoup.parser.Token.TokenType tokenType8 = comment0.type;
        java.lang.String str9 = comment0.toString();
        java.lang.String str10 = comment0.tokenType();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!---->" + "'", str9, "<!---->");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Comment" + "'", str10, "Comment");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("#doctype", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.Token.Character character6 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder0.insert(character6);
        org.jsoup.nodes.Document document10 = xmlTreeBuilder0.parse("EOF", "<SYSTEM>");
        // The following exception was thrown during execution in test generation
        try {
            document10.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document10);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node8 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node8.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document10 = node9.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
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
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str25 = startTag24.normalName;
        startTag24.newAttribute();
        java.lang.String str27 = startTag24.normalName();
        startTag24.appendAttributeName("");
        startTag24.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag32 = startTag24.reset();
        org.jsoup.parser.Token.Tag tag33 = startTag24.reset();
        org.jsoup.nodes.Attributes attributes34 = startTag24.attributes;
        boolean boolean35 = xmlTreeBuilder0.processStartTag("doctype", attributes34);
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder39 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        org.jsoup.parser.ParseSettings parseSettings43 = null;
        xmlTreeBuilder39.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList42, parseSettings43);
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        org.jsoup.parser.ParseSettings parseSettings48 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList49 = xmlTreeBuilder39.parseFragment("", "#doctype", parseErrorList47, parseSettings48);
        org.jsoup.nodes.Document document52 = xmlTreeBuilder39.parse("SYSTEM", "Doctype");
        org.jsoup.parser.ParseErrorList parseErrorList55 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder56 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList59 = null;
        org.jsoup.parser.ParseSettings parseSettings60 = null;
        xmlTreeBuilder56.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList59, parseSettings60);
        org.jsoup.parser.ParseErrorList parseErrorList64 = null;
        org.jsoup.parser.ParseSettings parseSettings65 = null;
        xmlTreeBuilder56.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList64, parseSettings65);
        org.jsoup.parser.Token.Character character67 = new org.jsoup.parser.Token.Character();
        java.lang.String str68 = character67.getData();
        xmlTreeBuilder56.insert(character67);
        org.jsoup.parser.ParseErrorList parseErrorList72 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder73 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList76 = null;
        org.jsoup.parser.ParseSettings parseSettings77 = null;
        xmlTreeBuilder73.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList76, parseSettings77);
        org.jsoup.parser.ParseErrorList parseErrorList81 = null;
        org.jsoup.parser.ParseSettings parseSettings82 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList83 = xmlTreeBuilder73.parseFragment("", "#doctype", parseErrorList81, parseSettings82);
        org.jsoup.parser.Token.Character character84 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder73.insert(character84);
        org.jsoup.parser.ParseErrorList parseErrorList88 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder89 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings90 = xmlTreeBuilder89.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList91 = xmlTreeBuilder73.parseFragment("SYSTEM", "PUBLIC", parseErrorList88, parseSettings90);
        java.util.List<org.jsoup.nodes.Node> nodeList92 = xmlTreeBuilder56.parseFragment("#doctype", "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">", parseErrorList72, parseSettings90);
        org.jsoup.parser.ParseSettings parseSettings93 = xmlTreeBuilder56.defaultSettings();
        xmlTreeBuilder39.initialiseParse("SYSTEM", "EOF", parseErrorList55, parseSettings93);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList95 = xmlTreeBuilder0.parseFragment("<!DOCTYPE #doctype PUBLIC \"4\" \"PUBLIC\">", "<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">>", parseErrorList38, parseSettings93);
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
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(token21);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNotNull(nodeList83);
        org.junit.Assert.assertNotNull(parseSettings90);
        org.junit.Assert.assertNotNull(nodeList91);
        org.junit.Assert.assertNotNull(nodeList92);
        org.junit.Assert.assertNotNull(parseSettings93);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
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
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag20 = startTag19.reset();
        tag20.finaliseTag();
        tag20.appendTagName('4');
        org.jsoup.nodes.Attributes attributes24 = tag20.getAttributes();
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag26 = startTag25.reset();
        tag26.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str29 = startTag28.normalName;
        startTag28.newAttribute();
        java.lang.String str31 = startTag28.normalName();
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag34 = startTag33.reset();
        tag34.finaliseTag();
        org.jsoup.nodes.DocumentType documentType40 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean42 = documentType40.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes43 = documentType40.attributes();
        tag34.attributes = attributes43;
        org.jsoup.parser.Token.StartTag startTag45 = startTag28.nameAttr("<!---->", attributes43);
        tag26.attributes = attributes43;
        char[] charArray48 = new char[] { 'a' };
        tag26.appendAttributeValue(charArray48);
        tag20.appendAttributeValue(charArray48);
        startTag0.appendAttributeValue(charArray48);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(attributes43);
        org.junit.Assert.assertNotNull(startTag45);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] { 'a' });
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendTagName("");
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
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
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        org.jsoup.parser.ParseSettings parseSettings38 = null;
        xmlTreeBuilder34.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList37, parseSettings38);
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder43 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        org.jsoup.parser.ParseSettings parseSettings47 = null;
        xmlTreeBuilder43.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList46, parseSettings47);
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        org.jsoup.parser.ParseSettings parseSettings52 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList53 = xmlTreeBuilder43.parseFragment("", "#doctype", parseErrorList51, parseSettings52);
        org.jsoup.parser.Token.Character character54 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder43.insert(character54);
        org.jsoup.parser.ParseErrorList parseErrorList58 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder59 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings60 = xmlTreeBuilder59.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList61 = xmlTreeBuilder43.parseFragment("SYSTEM", "PUBLIC", parseErrorList58, parseSettings60);
        xmlTreeBuilder34.initialiseParse("<SYSTEM>", "Doctype", parseErrorList42, parseSettings60);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder63 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList66 = null;
        org.jsoup.parser.ParseSettings parseSettings67 = null;
        xmlTreeBuilder63.initialiseParse("#doctype", "hi!", parseErrorList66, parseSettings67);
        org.jsoup.parser.Token.Character character69 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder63.insert(character69);
        java.lang.String str71 = character69.getData();
        xmlTreeBuilder34.insert(character69);
        org.jsoup.parser.Token.Comment comment73 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder74 = comment73.data;
        java.lang.String str75 = comment73.toString();
        org.jsoup.parser.Token token76 = comment73.reset();
        org.jsoup.parser.Token token77 = comment73.reset();
        java.lang.String str78 = comment73.toString();
        org.jsoup.parser.Token.Comment comment79 = comment73.asComment();
        xmlTreeBuilder34.insert(comment73);
        org.jsoup.parser.ParseErrorList parseErrorList83 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder84 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document87 = xmlTreeBuilder84.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment88 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder89 = comment88.data;
        xmlTreeBuilder84.insert(comment88);
        org.jsoup.parser.ParseSettings parseSettings91 = xmlTreeBuilder84.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList92 = xmlTreeBuilder34.parseFragment("", "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">", parseErrorList83, parseSettings91);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList93 = xmlTreeBuilder0.parseFragment("<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">>", "doctype", parseErrorList33, parseSettings91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(nodeList53);
        org.junit.Assert.assertNotNull(parseSettings60);
        org.junit.Assert.assertNotNull(nodeList61);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNotNull(stringBuilder74);
        org.junit.Assert.assertEquals(stringBuilder74.toString(), "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "<!---->" + "'", str75, "<!---->");
        org.junit.Assert.assertNotNull(token76);
        org.junit.Assert.assertNotNull(token77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "<!---->" + "'", str78, "<!---->");
        org.junit.Assert.assertNotNull(comment79);
        org.junit.Assert.assertNotNull(document87);
        org.junit.Assert.assertNotNull(stringBuilder89);
        org.junit.Assert.assertEquals(stringBuilder89.toString(), "");
        org.junit.Assert.assertNotNull(parseSettings91);
        org.junit.Assert.assertNotNull(nodeList92);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        org.jsoup.nodes.Attributes attributes2 = startTag0.attributes;
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        startTag0.tagName = "<!DOCTYPE #doctype PUBLIC \"4\" \"PUBLIC\">";
        startTag0.normalName = "<<SYSTEM>>";
        startTag0.setEmptyAttributeValue();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "", "", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str5 = documentType4.baseUri();
        int int6 = documentType4.childNodeSize();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str5, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        startTag0.appendTagName("PUBLIC");
        org.jsoup.parser.Token.Tag tag10 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag12 = tag10.name("4");
        tag12.selfClosing = false;
        tag12.appendTagName('a');
        tag12.normalName = "4";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.siblingNodes();
        org.jsoup.nodes.Node node11 = documentType4.previousSibling();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.Tag tag3 = tag1.reset();
        tag3.appendTagName('#');
        org.jsoup.parser.Token.StartTag startTag6 = tag3.asStartTag();
        startTag6.tagName = "<SYSTEM>";
        startTag6.appendAttributeName(' ');
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(startTag6);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag8 = startTag0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag9 = startTag0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        java.lang.String str7 = documentType4.baseUri();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            node9.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SYSTEM" + "'", str7, "SYSTEM");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Node node7 = documentType4.nextSibling();
        org.jsoup.parser.Token.Doctype doctype8 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder9 = doctype8.name;
        java.lang.StringBuilder stringBuilder10 = doctype8.systemIdentifier;
        boolean boolean11 = doctype8.isComment();
        boolean boolean12 = doctype8.isComment();
        boolean boolean13 = documentType4.hasSameValue((java.lang.Object) doctype8);
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean20 = documentType18.hasAttr("hi!");
        int int21 = documentType18.childNodeSize();
        org.jsoup.nodes.Node node22 = documentType18.nextSibling();
        org.jsoup.nodes.Node node24 = documentType18.removeAttr("StartTag");
        org.jsoup.nodes.Node node27 = documentType18.attr("#", "#");
        boolean boolean28 = documentType4.equals((java.lang.Object) documentType18);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = documentType4.before("<!DOCTYPE PUBLIC \"SYSTEM\" \"<!DOCTYPE PUBLIC \"hi!\" \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
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
        boolean boolean40 = tag6.isEndTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character41 = tag6.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendTagName('4');
        java.lang.String str6 = startTag0.tokenType();
        java.lang.String str7 = startTag0.toString();
        java.lang.String str8 = startTag0.normalName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "StartTag" + "'", str6, "StartTag");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<4>" + "'", str7, "<4>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4" + "'", str8, "4");
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node8 = documentType4.attr("hi!", "hi!");
        int int9 = documentType4.siblingIndex();
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean16 = documentType14.hasAttr("hi!");
        org.jsoup.nodes.Node node17 = documentType14.clone();
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag19 = startTag18.reset();
        org.jsoup.parser.Token.Tag tag20 = startTag18.reset();
        org.jsoup.parser.Token.StartTag startTag21 = tag20.asStartTag();
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str23 = startTag22.normalName;
        org.jsoup.nodes.Attributes attributes24 = startTag22.attributes;
        startTag21.attributes = attributes24;
        boolean boolean26 = documentType14.equals((java.lang.Object) attributes24);
        int int27 = documentType14.childNodeSize();
        java.lang.String str28 = documentType14.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = documentType4.before((org.jsoup.nodes.Node) documentType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(startTag21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "SYSTEM" + "'", str28, "SYSTEM");
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
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
        org.jsoup.nodes.Attributes attributes26 = startTag25.attributes;
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
        org.junit.Assert.assertNotNull(attributes26);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag2 = startTag0.reset();
        org.jsoup.parser.Token.StartTag startTag3 = tag2.asStartTag();
        startTag3.finaliseTag();
        boolean boolean5 = startTag3.isComment();
        boolean boolean6 = startTag3.isCharacter();
        java.lang.String str7 = startTag3.normalName();
        startTag3.tagName = "<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">>";
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
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
        org.jsoup.parser.Token.Doctype doctype90 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str91 = doctype90.getName();
        boolean boolean92 = doctype90.forceQuirks;
        java.lang.String str93 = doctype90.getSystemIdentifier();
        java.lang.String str94 = doctype90.getSystemIdentifier();
        boolean boolean95 = doctype90.isForceQuirks();
        java.lang.String str96 = doctype90.getSystemIdentifier();
        xmlTreeBuilder0.insert(doctype90);
        java.lang.String str98 = doctype90.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder99 = doctype90.systemIdentifier;
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
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "" + "'", str96, "");
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "" + "'", str98, "");
        org.junit.Assert.assertNotNull(stringBuilder99);
        org.junit.Assert.assertEquals(stringBuilder99.toString(), "");
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        java.lang.String str4 = startTag0.normalName();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str7 = startTag6.normalName;
        startTag6.newAttribute();
        java.lang.String str9 = startTag6.normalName();
        java.lang.String str10 = startTag6.normalName();
        org.jsoup.parser.Token.Tag tag11 = startTag6.reset();
        boolean boolean12 = startTag6.isDoctype();
        org.jsoup.parser.Token.Tag tag14 = startTag6.name("Doctype");
        org.jsoup.nodes.Attributes attributes15 = tag14.attributes;
        org.jsoup.parser.Token.StartTag startTag16 = startTag0.nameAttr("<!---->", attributes15);
        startTag0.appendAttributeValue("<a>");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(startTag16);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataLessthanSign;
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
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
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
            org.jsoup.nodes.Node node17 = node14.after("a");
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
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
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
        char[] charArray36 = new char[] { 'a', ' ', '4', ' ' };
        tag1.appendAttributeValue(charArray36);
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag39 = startTag38.reset();
        org.jsoup.parser.Token.Tag tag40 = startTag38.reset();
        org.jsoup.parser.Token.StartTag startTag41 = tag40.asStartTag();
        org.jsoup.parser.Token.StartTag startTag42 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str43 = startTag42.normalName;
        org.jsoup.nodes.Attributes attributes44 = startTag42.attributes;
        startTag41.attributes = attributes44;
        tag1.attributes = attributes44;
        tag1.newAttribute();
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
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { 'a', ' ', '4', ' ' });
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertNotNull(startTag41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(attributes44);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag2 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        startTag0.appendAttributeName(' ');
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(attributes3);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.String str3 = doctype0.getSystemIdentifier();
        boolean boolean4 = doctype0.isComment();
        boolean boolean5 = doctype0.forceQuirks;
        boolean boolean6 = doctype0.isForceQuirks();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
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
        org.jsoup.parser.Token.Doctype doctype47 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "SYSTEM", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node6 = documentType4.previousSibling();
        documentType4.setBaseUri("<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">>");
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = documentType4.traverse(nodeVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNull(node6);
    }
}

