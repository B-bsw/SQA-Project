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
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("<![CDATA[<!---->]]>", "");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        boolean boolean5 = comment4.bogus;
        comment4.bogus = true;
        boolean boolean8 = comment4.bogus;
        java.lang.String str9 = comment4.toString();
        java.lang.String str10 = comment4.getData();
        xmlTreeBuilder0.insert(comment4);
        boolean boolean12 = comment4.bogus;
        boolean boolean13 = comment4.isEndTag();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!---->" + "'", str9, "<!---->");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState7);
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element10 = htmlTreeBuilder0.getHeadElement();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList11 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.setFosterInserts(true);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList15 = htmlTreeBuilder0.getStack();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(parseSettings9);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNull(elementList11);
        org.junit.Assert.assertNull(htmlTreeBuilderState12);
        org.junit.Assert.assertNull(elementList15);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings8 = htmlTreeBuilder7.defaultSettings();
        org.jsoup.nodes.FormElement formElement9 = null;
        htmlTreeBuilder7.setFormElement(formElement9);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState11 = htmlTreeBuilder7.state();
        org.jsoup.nodes.FormElement formElement12 = null;
        htmlTreeBuilder7.setFormElement(formElement12);
        htmlTreeBuilder7.generateImpliedEndTags();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder15 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean16 = htmlTreeBuilder15.isFragmentParsing();
        htmlTreeBuilder15.newPendingTableCharacters();
        org.jsoup.nodes.Document document18 = htmlTreeBuilder15.getDocument();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder19 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder19.defaultSettings();
        org.jsoup.nodes.Document document23 = xmlTreeBuilder19.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData25 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder19.insert((org.jsoup.parser.Token.Character) cData25);
        org.jsoup.nodes.Document document29 = xmlTreeBuilder19.parse("EndTag", "EOF");
        htmlTreeBuilder15.maybeSetBaseUri((org.jsoup.nodes.Element) document29);
        htmlTreeBuilder7.setHeadElement((org.jsoup.nodes.Element) document29);
        boolean boolean32 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document29);
        htmlTreeBuilder0.newPendingTableCharacters();
        boolean boolean34 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.FormElement formElement35 = htmlTreeBuilder0.getFormElement();
        boolean boolean36 = htmlTreeBuilder0.framesetOk();
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertNull(htmlTreeBuilderState11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(document18);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(formElement35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.getAttributes();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        java.lang.String str4 = attributes3.toString();
        org.jsoup.parser.Token.StartTag startTag5 = startTag0.nameAttr("EOF", attributes3);
        attributes3.remove("");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes3.spliterator();
        org.jsoup.nodes.Attributes attributes11 = attributes3.put("a  hi!=\"\"", " =\"</a>\"");
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(startTag5);
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.jsoup.parser.Token.CData cData1 = new org.jsoup.parser.Token.CData("<!---->");
        java.lang.String str2 = cData1.getData();
        org.jsoup.parser.Token.Character character4 = cData1.data("<![CDATA[hi!=\"\"]]>");
        org.jsoup.parser.Token token5 = cData1.reset();
        org.jsoup.parser.Token.Character character7 = cData1.data("<![cdata[endtag]]>");
        org.jsoup.parser.Token token8 = character7.reset();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(character7);
        org.junit.Assert.assertNotNull(token8);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder4.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData10 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder4.insert((org.jsoup.parser.Token.Character) cData10);
        org.jsoup.nodes.Document document14 = xmlTreeBuilder4.parse("EndTag", "EOF");
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document14);
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.generateImpliedEndTags();
        java.lang.String str18 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState19 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList20 = htmlTreeBuilder0.getStack();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(htmlTreeBuilderState19);
        org.junit.Assert.assertNull(elementList20);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        boolean boolean5 = doctype0.isDoctype();
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        java.lang.String str8 = doctype0.pubSysKey;
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        java.lang.String str10 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData6 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData6);
        org.jsoup.parser.Token.Comment comment8 = new org.jsoup.parser.Token.Comment();
        comment8.bogus = true;
        java.lang.String str11 = comment8.toString();
        xmlTreeBuilder0.insert(comment8);
        org.jsoup.parser.Token.CData cData14 = new org.jsoup.parser.Token.CData("EndTag");
        boolean boolean15 = cData14.isStartTag();
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData14);
        org.jsoup.parser.Token token17 = cData14.reset();
        java.lang.String str18 = cData14.toString();
        boolean boolean19 = cData14.isDoctype();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(token17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<![CDATA[null]]>" + "'", str18, "<![CDATA[null]]>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        startTag0.normalName = "hi!";
        startTag0.appendAttributeValue('a');
        org.jsoup.nodes.Attributes attributes6 = startTag0.attributes;
        org.jsoup.parser.ParseSettings parseSettings8 = org.jsoup.parser.ParseSettings.preserveCase;
        java.lang.String str10 = parseSettings8.normalizeTag("hi!");
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        attributes11.normalize();
        org.jsoup.nodes.Attributes attributes13 = attributes11.clone();
        org.jsoup.nodes.Attributes attributes14 = parseSettings8.normalizeAttributes(attributes13);
        attributes14.normalize();
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes19 = attributes16.put("", false);
        org.jsoup.nodes.Attributes attributes22 = attributes16.put("hi!", "hi!=\"\"");
        org.jsoup.nodes.Attributes attributes25 = attributes22.put("a ", "hi!=\"\"");
        attributes14.addAll(attributes22);
        org.jsoup.parser.Token.StartTag startTag27 = startTag0.nameAttr("<![CDATA[EndTag]]>", attributes22);
        org.jsoup.parser.Token.Tag tag29 = startTag0.name("EndTag");
        org.jsoup.nodes.Attributes attributes31 = new org.jsoup.nodes.Attributes();
        attributes31.normalize();
        org.jsoup.nodes.Attributes attributes33 = attributes31.clone();
        boolean boolean35 = attributes31.equals((java.lang.Object) (short) -1);
        org.jsoup.parser.Token.EndTag endTag36 = new org.jsoup.parser.Token.EndTag();
        endTag36.appendAttributeValue(" hi!=\"\"");
        java.lang.String str39 = endTag36.normalName;
        endTag36.selfClosing = true;
        boolean boolean42 = attributes31.equals((java.lang.Object) endTag36);
        org.jsoup.parser.Token.StartTag startTag43 = startTag0.nameAttr("=\"</a>\"", attributes31);
        boolean boolean44 = startTag0.isSelfClosing();
        boolean boolean45 = startTag0.isCharacter();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(startTag27);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(startTag43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        comment5.bogus = true;
        org.jsoup.parser.Token token8 = comment5.reset();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.CData cData11 = new org.jsoup.parser.Token.CData(" hi!=\"\"");
        org.jsoup.parser.Token.Character character13 = cData11.data("hi!=\"\"");
        java.lang.String str14 = cData11.toString();
        org.jsoup.parser.Token.Character character16 = cData11.data("a");
        java.lang.String str17 = cData11.tokenType();
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData11);
        org.jsoup.parser.Token.Comment comment19 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token20 = comment19.reset();
        java.lang.String str21 = comment19.toString();
        comment19.bogus = false;
        java.lang.StringBuilder stringBuilder24 = comment19.data;
        java.lang.String str25 = comment19.toString();
        xmlTreeBuilder0.insert(comment19);
        org.jsoup.parser.Token.Comment comment27 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token28 = comment27.reset();
        java.lang.String str29 = comment27.getData();
        java.lang.StringBuilder stringBuilder30 = comment27.data;
        xmlTreeBuilder0.insert(comment27);
        org.jsoup.parser.Token.Doctype doctype32 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token33 = doctype32.reset();
        java.lang.StringBuilder stringBuilder34 = doctype32.systemIdentifier;
        boolean boolean35 = doctype32.isForceQuirks();
        boolean boolean36 = doctype32.isDoctype();
        doctype32.forceQuirks = false;
        org.jsoup.parser.Token.Doctype doctype39 = doctype32.asDoctype();
        doctype32.pubSysKey = "";
        java.lang.StringBuilder stringBuilder42 = doctype32.systemIdentifier;
        boolean boolean43 = doctype32.isDoctype();
        java.lang.String str44 = doctype32.getSystemIdentifier();
        boolean boolean45 = doctype32.isCharacter();
        xmlTreeBuilder0.insert(doctype32);
        java.lang.String str47 = doctype32.getName();
        doctype32.forceQuirks = false;
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNotNull(character13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<![CDATA[hi!=\"\"]]>" + "'", str14, "<![CDATA[hi!=\"\"]]>");
        org.junit.Assert.assertNotNull(character16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "CData" + "'", str17, "CData");
        org.junit.Assert.assertNotNull(token20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!---->" + "'", str21, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder24);
        org.junit.Assert.assertEquals(stringBuilder24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!---->" + "'", str25, "<!---->");
        org.junit.Assert.assertNotNull(token28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(stringBuilder30);
        org.junit.Assert.assertEquals(stringBuilder30.toString(), "");
        org.junit.Assert.assertNotNull(token33);
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(doctype39);
        org.junit.Assert.assertNotNull(stringBuilder42);
        org.junit.Assert.assertEquals(stringBuilder42.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.jsoup.parser.Token.CData cData1 = new org.jsoup.parser.Token.CData("<!---->");
        org.jsoup.parser.Token.Character character3 = cData1.data("Doctype");
        java.lang.String str4 = cData1.toString();
        org.junit.Assert.assertNotNull(character3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<![CDATA[Doctype]]>" + "'", str4, "<![CDATA[Doctype]]>");
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        startTag0.normalName = "hi!";
        startTag0.appendAttributeValue('a');
        org.jsoup.nodes.Attributes attributes6 = startTag0.attributes;
        org.jsoup.parser.Token.TokenType tokenType7 = startTag0.type;
        startTag0.appendAttributeName('4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = startTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes3 = attributes0.put("hi!", "");
        java.lang.String str4 = attributes0.toString();
        org.jsoup.nodes.Attributes attributes7 = attributes0.put("a", false);
        org.jsoup.nodes.Attributes attributes10 = attributes0.put("hi!", true);
        org.jsoup.nodes.Attributes attributes11 = attributes10.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList12 = attributes10.asList();
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " hi!=\"\"" + "'", str4, " hi!=\"\"");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(attributeList12);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.jsoup.parser.ParseSettings parseSettings0 = org.jsoup.parser.ParseSettings.preserveCase;
        java.lang.String str2 = parseSettings0.normalizeTag("hi!");
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        attributes3.normalize();
        org.jsoup.nodes.Attributes attributes5 = attributes3.clone();
        org.jsoup.nodes.Attributes attributes6 = parseSettings0.normalizeAttributes(attributes5);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator7 = attributes5.spliterator();
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes11 = attributes8.put("hi!", "");
        org.jsoup.nodes.Attributes attributes14 = attributes11.put(" hi!=\"\"", false);
        boolean boolean16 = attributes14.hasKeyIgnoreCase("Doctype");
        int int17 = attributes14.size();
        org.jsoup.nodes.Attributes attributes20 = attributes14.put("hi!=\"\"", false);
        attributes5.addAll(attributes14);
        org.jsoup.parser.ParseSettings parseSettings24 = new org.jsoup.parser.ParseSettings(true, true);
        org.jsoup.nodes.Attributes attributes25 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes28 = attributes25.put("hi!", "");
        org.jsoup.nodes.Attributes attributes31 = attributes28.put(" hi!=\"\"", false);
        boolean boolean33 = attributes31.hasKeyIgnoreCase("Doctype");
        int int34 = attributes31.size();
        org.jsoup.nodes.Attributes attributes35 = parseSettings24.normalizeAttributes(attributes31);
        java.lang.String str37 = attributes31.getIgnoreCase("EOF");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator38 = attributes31.spliterator();
        attributes5.addAll(attributes31);
        java.lang.String str40 = attributes5.html();
        org.junit.Assert.assertNotNull(parseSettings0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(attributeSpliterator7);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(attributeSpliterator38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + " hi!=\"\"" + "'", str40, " hi!=\"\"");
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(" hi!=\"\"");
        java.lang.String str3 = endTag0.normalName;
        endTag0.setEmptyAttributeValue();
        endTag0.appendTagName('a');
        char[] charArray12 = new char[] { ' ', ' ', '#', ' ', 'a' };
        endTag0.appendAttributeValue(charArray12);
        endTag0.appendTagName(' ');
        java.lang.String str16 = endTag0.normalName();
        org.jsoup.parser.Token.Tag tag17 = endTag0.reset();
        endTag0.appendTagName("doctype");
        org.jsoup.parser.Token.EndTag endTag20 = new org.jsoup.parser.Token.EndTag();
        endTag20.appendAttributeValue(" hi!=\"\"");
        java.lang.String str23 = endTag20.normalName;
        endTag20.setEmptyAttributeValue();
        endTag20.appendTagName('a');
        boolean boolean27 = endTag20.isEndTag();
        boolean boolean28 = endTag20.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag30 = startTag29.reset();
        java.lang.String str31 = startTag29.normalName();
        int[] intArray32 = new int[] {};
        startTag29.appendAttributeValue(intArray32);
        endTag20.appendAttributeValue(intArray32);
        endTag0.appendAttributeValue(intArray32);
        org.jsoup.parser.Token.Tag tag36 = endTag0.reset();
        endTag0.setEmptyAttributeValue();
        org.jsoup.nodes.Attributes attributes38 = endTag0.attributes;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ', '#', ' ', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "a " + "'", str16, "a ");
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] {});
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNull(attributes38);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData6 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData6);
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes12 = attributes9.put("hi!", "");
        org.jsoup.nodes.Attributes attributes15 = attributes12.put(" hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes12.iterator();
        boolean boolean17 = xmlTreeBuilder0.processStartTag("EOF", attributes12);
        org.jsoup.parser.Token.EndTag endTag19 = new org.jsoup.parser.Token.EndTag();
        endTag19.appendAttributeValue(" hi!=\"\"");
        java.lang.String str22 = endTag19.normalName;
        endTag19.setEmptyAttributeValue();
        endTag19.appendTagName('a');
        endTag19.newAttribute();
        org.jsoup.nodes.Attributes attributes27 = endTag19.attributes;
        org.jsoup.parser.Token.Tag tag28 = endTag19.reset();
        org.jsoup.parser.Token.EndTag endTag29 = new org.jsoup.parser.Token.EndTag();
        endTag29.setEmptyAttributeValue();
        endTag29.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes33 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes36 = attributes33.put("hi!", "");
        attributes33.removeIgnoreCase("Doctype");
        endTag29.attributes = attributes33;
        java.lang.String str41 = attributes33.get(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes42 = new org.jsoup.nodes.Attributes();
        attributes42.normalize();
        org.jsoup.nodes.Attributes attributes44 = attributes42.clone();
        boolean boolean46 = attributes42.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes47 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes50 = attributes47.put("hi!", "");
        attributes42.addAll(attributes47);
        attributes33.addAll(attributes47);
        tag28.attributes = attributes33;
        boolean boolean54 = xmlTreeBuilder0.processStartTag("Doctype", attributes33);
        org.jsoup.parser.ParseSettings parseSettings55 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings56 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Comment comment57 = new org.jsoup.parser.Token.Comment();
        java.lang.String str58 = comment57.getData();
        java.lang.String str59 = comment57.getData();
        java.lang.StringBuilder stringBuilder60 = comment57.data;
        xmlTreeBuilder0.insert(comment57);
        org.jsoup.parser.Token.Doctype doctype62 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token63 = doctype62.reset();
        java.lang.StringBuilder stringBuilder64 = doctype62.systemIdentifier;
        boolean boolean65 = doctype62.isForceQuirks();
        java.lang.String str66 = doctype62.getSystemIdentifier();
        boolean boolean67 = doctype62.isStartTag();
        java.lang.StringBuilder stringBuilder68 = doctype62.systemIdentifier;
        xmlTreeBuilder0.insert(doctype62);
        org.jsoup.parser.Token token70 = doctype62.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag71 = doctype62.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(parseSettings55);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(stringBuilder60);
        org.junit.Assert.assertEquals(stringBuilder60.toString(), "");
        org.junit.Assert.assertNotNull(token63);
        org.junit.Assert.assertNotNull(stringBuilder64);
        org.junit.Assert.assertEquals(stringBuilder64.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(stringBuilder68);
        org.junit.Assert.assertEquals(stringBuilder68.toString(), "");
        org.junit.Assert.assertNotNull(token70);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue("hi!");
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes6 = attributes3.put("hi!", "");
        attributes3.removeIgnoreCase("Doctype");
        endTag0.attributes = attributes3;
        endTag0.selfClosing = false;
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes15 = attributes12.put("hi!", "");
        endTag0.attributes = attributes15;
        endTag0.appendAttributeValue("EOF");
        endTag0.normalName = "hi!=\"\"";
        endTag0.appendTagName('4');
        org.jsoup.parser.Token.TokenType tokenType23 = endTag0.type;
        endTag0.selfClosing = true;
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + tokenType23 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType23.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder3 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document6 = xmlTreeBuilder3.parse("<![CDATA[<!---->]]>", "");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document6);
        org.jsoup.nodes.Element element8 = null;
        htmlTreeBuilder0.setHeadElement(element8);
        boolean boolean10 = htmlTreeBuilder0.isFosterInserts();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        boolean boolean6 = htmlTreeBuilder0.isFragmentParsing();
        java.util.List<java.lang.String> strList7 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.parser.ParseSettings parseSettings10 = htmlTreeBuilder0.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.reconstructFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNotNull(parseSettings10);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.FormElement formElement8 = htmlTreeBuilder0.getFormElement();
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(element5);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(formElement8);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData6 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData6);
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes12 = attributes9.put("hi!", "");
        org.jsoup.nodes.Attributes attributes15 = attributes12.put(" hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes12.iterator();
        boolean boolean17 = xmlTreeBuilder0.processStartTag("EOF", attributes12);
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        attributes19.normalize();
        org.jsoup.nodes.Attributes attributes21 = attributes19.clone();
        boolean boolean23 = attributes19.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes24 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes27 = attributes24.put("hi!", "");
        attributes19.addAll(attributes24);
        org.jsoup.nodes.Attributes attributes31 = attributes24.put("hi!", true);
        boolean boolean33 = attributes31.hasKeyIgnoreCase(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes36 = attributes31.put("Doctype", false);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator37 = attributes36.spliterator();
        org.jsoup.nodes.Attributes attributes38 = parseSettings18.normalizeAttributes(attributes36);
        java.util.List<org.jsoup.nodes.Attribute> attributeList39 = attributes38.asList();
        org.jsoup.nodes.Attributes attributes40 = attributes38.clone();
        attributes38.removeIgnoreCase("<![CDATA[<![CDATA[<!---->]]>]]>");
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(attributeSpliterator37);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNotNull(attributeList39);
        org.junit.Assert.assertNotNull(attributes40);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        org.jsoup.parser.Token token3 = comment0.reset();
        boolean boolean4 = comment0.bogus;
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        boolean boolean7 = htmlTreeBuilder0.isFosterInserts();
        htmlTreeBuilder0.framesetOk(false);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToBefore("<![CDATA[<![CDATA[<!---->]]>]]>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.setFosterInserts(false);
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.nodes.Element element11 = htmlTreeBuilder0.getHeadElement();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
        org.junit.Assert.assertNull(element11);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList7 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.lang.String str9 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder0.state();
        java.lang.String str11 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = htmlTreeBuilder0.state();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = htmlTreeBuilder0.getFromStack(" hi!=\"Doctype\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(htmlTreeBuilderState12);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList7 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.newPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = htmlTreeBuilder0.lastFormattingElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNotNull(parseSettings9);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(" hi!=\"\"");
        java.lang.String str3 = endTag0.normalName;
        endTag0.setEmptyAttributeValue();
        endTag0.appendTagName('a');
        char[] charArray12 = new char[] { ' ', ' ', '#', ' ', 'a' };
        endTag0.appendAttributeValue(charArray12);
        endTag0.appendTagName(' ');
        java.lang.String str16 = endTag0.name();
        boolean boolean17 = endTag0.isSelfClosing();
        java.lang.String str18 = endTag0.normalName;
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes22 = attributes19.put("", false);
        java.util.List<org.jsoup.nodes.Attribute> attributeList23 = attributes19.asList();
        java.util.Map<java.lang.String, java.lang.String> strMap24 = attributes19.dataset();
        endTag0.attributes = attributes19;
        java.lang.String str26 = endTag0.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character27 = endTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ', '#', ' ', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "a " + "'", str16, "a ");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "a " + "'", str18, "a ");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(attributeList23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "</a >" + "'", str26, "</a >");
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag3 = endTag0.name("");
        boolean boolean4 = tag3.selfClosing;
        java.lang.String str5 = tag3.normalName;
        boolean boolean6 = tag3.isComment();
        tag3.tagName = "";
        java.lang.String str9 = tag3.tagName;
        char[] charArray10 = new char[] {};
        tag3.appendAttributeValue(charArray10);
        java.lang.String str12 = tag3.tokenType();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EndTag" + "'", str12, "EndTag");
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes6 = attributes3.put("hi!", "");
        boolean boolean8 = attributes6.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag9 = startTag0.nameAttr("a ", attributes6);
        org.jsoup.parser.Token.Tag tag10 = startTag9.reset();
        java.lang.String str11 = startTag9.tagName;
        startTag9.setEmptyAttributeValue();
        startTag9.finaliseTag();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(startTag9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        org.jsoup.nodes.Attributes attributes2 = attributes0.clone();
        boolean boolean4 = attributes0.equals((java.lang.Object) (short) -1);
        org.jsoup.parser.Token.EndTag endTag5 = new org.jsoup.parser.Token.EndTag();
        endTag5.appendAttributeValue(" hi!=\"\"");
        java.lang.String str8 = endTag5.normalName;
        endTag5.selfClosing = true;
        boolean boolean11 = attributes0.equals((java.lang.Object) endTag5);
        endTag5.appendAttributeName('#');
        org.jsoup.parser.Token.Tag tag14 = endTag5.reset();
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag14);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.FormElement formElement6 = null;
        htmlTreeBuilder0.setFormElement(formElement6);
        java.util.List<java.lang.String> strList8 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = htmlTreeBuilder0.state();
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(element5);
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertNull(htmlTreeBuilderState9);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.setEmptyAttributeValue();
        endTag0.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes7 = attributes4.put("hi!", "");
        attributes4.removeIgnoreCase("Doctype");
        endTag0.attributes = attributes4;
        endTag0.appendAttributeName("hi!=\"\"");
        endTag0.selfClosing = true;
        endTag0.finaliseTag();
        endTag0.finaliseTag();
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        java.lang.String[] strArray4 = org.jsoup.parser.HtmlTreeBuilder.TagSearchSelectScope;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "optgroup", "option" });
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes3 = attributes0.put("hi!", "");
        org.jsoup.nodes.Attributes attributes6 = attributes3.put(" hi!=\"\"", false);
        boolean boolean8 = attributes6.hasKeyIgnoreCase("Doctype");
        java.lang.String str9 = attributes6.toString();
        org.jsoup.nodes.Attribute attribute10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes11 = attributes6.put(attribute10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " hi!=\"\"" + "'", str9, " hi!=\"\"");
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.markInsertionMode();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(elementList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(element4);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState7);
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element10 = htmlTreeBuilder0.getHeadElement();
        boolean boolean11 = htmlTreeBuilder0.isFosterInserts();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearFormattingElementsToLastMarker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(parseSettings9);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        htmlTreeBuilder0.markInsertionMode();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState6);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = htmlTreeBuilder9.defaultSettings();
        org.jsoup.nodes.FormElement formElement11 = null;
        htmlTreeBuilder9.setFormElement(formElement11);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState13 = htmlTreeBuilder9.state();
        java.util.List<java.lang.String> strList14 = htmlTreeBuilder9.getPendingTableCharacters();
        boolean boolean15 = htmlTreeBuilder9.isFragmentParsing();
        java.util.List<java.lang.String> strList16 = htmlTreeBuilder9.getPendingTableCharacters();
        htmlTreeBuilder9.framesetOk(true);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder19 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder19.defaultSettings();
        org.jsoup.nodes.Document document23 = xmlTreeBuilder19.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData25 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder19.insert((org.jsoup.parser.Token.Character) cData25);
        org.jsoup.nodes.Document document29 = xmlTreeBuilder19.parse("<a   hi!=\"\">", "<![CDATA[null]]>");
        htmlTreeBuilder9.setHeadElement((org.jsoup.nodes.Element) document29);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder31 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = htmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState33 = htmlTreeBuilder31.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList34 = htmlTreeBuilder31.getStack();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder35 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings36 = xmlTreeBuilder35.defaultSettings();
        org.jsoup.nodes.Document document39 = xmlTreeBuilder35.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData41 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder35.insert((org.jsoup.parser.Token.Character) cData41);
        org.jsoup.parser.Token.StartTag startTag43 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag44 = startTag43.reset();
        org.jsoup.nodes.Attributes attributes46 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes49 = attributes46.put("hi!", "");
        boolean boolean51 = attributes49.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag52 = startTag43.nameAttr("a ", attributes49);
        java.lang.String str53 = startTag43.toString();
        org.jsoup.nodes.Element element54 = xmlTreeBuilder35.insert(startTag43);
        boolean boolean55 = htmlTreeBuilder31.isSpecial(element54);
        htmlTreeBuilder9.setHeadElement(element54);
        htmlTreeBuilder0.setHeadElement(element54);
        org.jsoup.parser.ParseSettings parseSettings58 = htmlTreeBuilder0.defaultSettings();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(htmlTreeBuilderState8);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNull(htmlTreeBuilderState13);
        org.junit.Assert.assertNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(strList16);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNull(htmlTreeBuilderState33);
        org.junit.Assert.assertNull(elementList34);
        org.junit.Assert.assertNotNull(parseSettings36);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertNotNull(attributes49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(startTag52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "<a   hi!=\"\">" + "'", str53, "<a   hi!=\"\">");
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(parseSettings58);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        java.lang.String str5 = doctype0.tokenType();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Doctype" + "'", str5, "Doctype");
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.lang.String str5 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.FormElement formElement8 = null;
        htmlTreeBuilder0.setFormElement(formElement8);
        org.jsoup.parser.Token.StartTag startTag10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = htmlTreeBuilder0.insertEmpty(startTag10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.forceQuirks;
        org.jsoup.parser.Token token5 = doctype0.reset();
        java.lang.String str6 = doctype0.tokenType();
        doctype0.forceQuirks = true;
        org.jsoup.parser.Token.Doctype doctype9 = doctype0.asDoctype();
        boolean boolean10 = doctype9.isForceQuirks();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Doctype" + "'", str6, "Doctype");
        org.junit.Assert.assertNotNull(doctype9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag3 = endTag0.name("");
        tag3.normalName = " hi!=\"\"";
        java.lang.String str6 = tag3.tagName;
        boolean boolean7 = tag3.isDoctype();
        java.lang.String str8 = tag3.normalName();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " hi!=\"\"" + "'", str8, " hi!=\"\"");
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        doctype0.forceQuirks = false;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token1 = comment0.reset();
        java.lang.StringBuilder stringBuilder2 = comment0.data;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        boolean boolean4 = comment0.bogus;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag5 = comment0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.nodes.FormElement formElement7 = htmlTreeBuilder0.getFormElement();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = htmlTreeBuilder0.removeLastFormattingElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings4);
        org.junit.Assert.assertNull(formElement7);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = htmlTreeBuilder6.defaultSettings();
        org.jsoup.nodes.FormElement formElement8 = null;
        htmlTreeBuilder6.setFormElement(formElement8);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder6.state();
        java.util.List<java.lang.String> strList11 = htmlTreeBuilder6.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = htmlTreeBuilder6.state();
        java.util.List<java.lang.String> strList13 = htmlTreeBuilder6.getPendingTableCharacters();
        htmlTreeBuilder6.newPendingTableCharacters();
        org.jsoup.nodes.Document document15 = htmlTreeBuilder6.getDocument();
        java.util.List<java.lang.String> strList16 = htmlTreeBuilder6.getPendingTableCharacters();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder17.defaultSettings();
        org.jsoup.nodes.Document document21 = xmlTreeBuilder17.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData23 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder17.insert((org.jsoup.parser.Token.Character) cData23);
        org.jsoup.parser.Token.CData cData26 = new org.jsoup.parser.Token.CData("<!---->");
        org.jsoup.parser.Token.Character character28 = cData26.data("Doctype");
        java.lang.String str29 = cData26.getData();
        java.lang.String str30 = cData26.getData();
        boolean boolean31 = xmlTreeBuilder17.process((org.jsoup.parser.Token) cData26);
        org.jsoup.nodes.Document document34 = xmlTreeBuilder17.parse("", "hi!");
        htmlTreeBuilder6.maybeSetBaseUri((org.jsoup.nodes.Element) document34);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceOnStack(element5, (org.jsoup.nodes.Element) document34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
        org.junit.Assert.assertNull(strList11);
        org.junit.Assert.assertNull(htmlTreeBuilderState12);
        org.junit.Assert.assertNull(strList13);
        org.junit.Assert.assertNull(document15);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(character28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Doctype" + "'", str29, "Doctype");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Doctype" + "'", str30, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(document34);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.setEmptyAttributeValue();
        endTag0.appendAttributeName('#');
        endTag0.newAttribute();
        boolean boolean5 = endTag0.isSelfClosing();
        endTag0.appendAttributeValue("<EOF>");
        endTag0.appendAttributeName("Doctype");
        org.jsoup.nodes.Attributes attributes10 = null;
        endTag0.attributes = attributes10;
        boolean boolean12 = endTag0.isSelfClosing();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.framesetOk(false);
        java.lang.String str7 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = htmlTreeBuilder0.state();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToBefore(" =\"</a>\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(htmlTreeBuilderState8);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData6 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData6);
        org.jsoup.parser.Token.Comment comment8 = new org.jsoup.parser.Token.Comment();
        comment8.bogus = true;
        java.lang.String str11 = comment8.toString();
        xmlTreeBuilder0.insert(comment8);
        org.jsoup.parser.Token.Doctype doctype13 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token14 = doctype13.reset();
        java.lang.StringBuilder stringBuilder15 = doctype13.systemIdentifier;
        boolean boolean16 = doctype13.isForceQuirks();
        boolean boolean17 = doctype13.isDoctype();
        doctype13.forceQuirks = false;
        org.jsoup.parser.Token.Doctype doctype20 = doctype13.asDoctype();
        doctype13.pubSysKey = "";
        boolean boolean23 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype13);
        org.jsoup.nodes.Document document26 = xmlTreeBuilder0.parse(" hi! eof", "<![CDATA[ a]]>");
        org.jsoup.parser.Token.CData cData28 = new org.jsoup.parser.Token.CData("<!---->");
        java.lang.String str29 = cData28.toString();
        java.lang.String str30 = cData28.toString();
        java.lang.String str31 = cData28.toString();
        java.lang.String str32 = cData28.getData();
        java.lang.String str33 = cData28.toString();
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData28);
        org.jsoup.parser.Token.Doctype doctype35 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token36 = doctype35.reset();
        java.lang.StringBuilder stringBuilder37 = doctype35.systemIdentifier;
        java.lang.String str38 = doctype35.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder39 = doctype35.name;
        org.jsoup.parser.Token token40 = doctype35.reset();
        xmlTreeBuilder0.insert(doctype35);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder43 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean44 = htmlTreeBuilder43.isFragmentParsing();
        htmlTreeBuilder43.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder46 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings47 = htmlTreeBuilder46.defaultSettings();
        org.jsoup.nodes.FormElement formElement48 = null;
        htmlTreeBuilder46.setFormElement(formElement48);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState50 = htmlTreeBuilder46.state();
        java.util.List<java.lang.String> strList51 = htmlTreeBuilder46.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState52 = htmlTreeBuilder46.state();
        htmlTreeBuilder46.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState55 = htmlTreeBuilder46.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder56 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean57 = htmlTreeBuilder56.isFragmentParsing();
        htmlTreeBuilder56.newPendingTableCharacters();
        htmlTreeBuilder56.framesetOk(false);
        htmlTreeBuilder56.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder62 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder62.setFosterInserts(false);
        org.jsoup.nodes.Document document65 = htmlTreeBuilder62.getDocument();
        org.jsoup.nodes.FormElement formElement66 = htmlTreeBuilder62.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder67 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings68 = xmlTreeBuilder67.defaultSettings();
        org.jsoup.nodes.Document document71 = xmlTreeBuilder67.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder62.maybeSetBaseUri((org.jsoup.nodes.Element) document71);
        htmlTreeBuilder56.maybeSetBaseUri((org.jsoup.nodes.Element) document71);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder74 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean75 = htmlTreeBuilder74.isFragmentParsing();
        htmlTreeBuilder74.newPendingTableCharacters();
        htmlTreeBuilder74.framesetOk(false);
        htmlTreeBuilder74.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder80 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder80.setFosterInserts(false);
        org.jsoup.nodes.Document document83 = htmlTreeBuilder80.getDocument();
        org.jsoup.nodes.FormElement formElement84 = htmlTreeBuilder80.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder85 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings86 = xmlTreeBuilder85.defaultSettings();
        org.jsoup.nodes.Document document89 = xmlTreeBuilder85.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder80.maybeSetBaseUri((org.jsoup.nodes.Element) document89);
        htmlTreeBuilder74.maybeSetBaseUri((org.jsoup.nodes.Element) document89);
        boolean boolean92 = htmlTreeBuilder56.isSpecial((org.jsoup.nodes.Element) document89);
        htmlTreeBuilder46.setHeadElement((org.jsoup.nodes.Element) document89);
        htmlTreeBuilder43.setHeadElement((org.jsoup.nodes.Element) document89);
        org.jsoup.parser.Parser parser96 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList97 = xmlTreeBuilder0.parseFragment("<![CDATA[</a>]]>", (org.jsoup.nodes.Element) document89, "<doctype>", parser96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(doctype20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<![CDATA[<!---->]]>" + "'", str29, "<![CDATA[<!---->]]>");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<![CDATA[<!---->]]>" + "'", str30, "<![CDATA[<!---->]]>");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<![CDATA[<!---->]]>" + "'", str31, "<![CDATA[<!---->]]>");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<!---->" + "'", str32, "<!---->");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<![CDATA[<!---->]]>" + "'", str33, "<![CDATA[<!---->]]>");
        org.junit.Assert.assertNotNull(token36);
        org.junit.Assert.assertNotNull(stringBuilder37);
        org.junit.Assert.assertEquals(stringBuilder37.toString(), "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(stringBuilder39);
        org.junit.Assert.assertEquals(stringBuilder39.toString(), "");
        org.junit.Assert.assertNotNull(token40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(parseSettings47);
        org.junit.Assert.assertNull(htmlTreeBuilderState50);
        org.junit.Assert.assertNull(strList51);
        org.junit.Assert.assertNull(htmlTreeBuilderState52);
        org.junit.Assert.assertNull(htmlTreeBuilderState55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(document65);
        org.junit.Assert.assertNull(formElement66);
        org.junit.Assert.assertNotNull(parseSettings68);
        org.junit.Assert.assertNotNull(document71);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(document83);
        org.junit.Assert.assertNull(formElement84);
        org.junit.Assert.assertNotNull(parseSettings86);
        org.junit.Assert.assertNotNull(document89);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState6);
        java.lang.String str8 = htmlTreeBuilder0.getBaseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = htmlTreeBuilder0.insertStartTag("StartTag");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Document document7 = htmlTreeBuilder0.getDocument();
        java.lang.String str8 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Document document9 = htmlTreeBuilder0.getDocument();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes6 = attributes3.put("hi!", "");
        boolean boolean8 = attributes6.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag9 = startTag0.nameAttr("a ", attributes6);
        org.jsoup.parser.Token.Tag tag10 = startTag9.reset();
        java.lang.String str11 = startTag9.tagName;
        org.jsoup.nodes.Attributes attributes12 = startTag9.attributes;
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag14 = startTag13.reset();
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes19 = attributes16.put("hi!", "");
        boolean boolean21 = attributes19.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag22 = startTag13.nameAttr("a ", attributes19);
        boolean boolean24 = attributes19.hasKeyIgnoreCase("</aEOF>");
        attributes12.addAll(attributes19);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(startTag9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes3 = attributes0.put("hi!", "");
        org.jsoup.nodes.Attributes attributes6 = attributes3.put(" hi!=\"\"", false);
        boolean boolean8 = attributes6.hasKeyIgnoreCase("Doctype");
        java.lang.String str9 = attributes6.toString();
        org.jsoup.nodes.Attributes attributes12 = attributes6.put(" hi!=\"hi!=&quot;&quot;\" a=\"hi!=&quot;&quot;\" a<!---->=\"eof\"", "</aEOF>");
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " hi!=\"\"" + "'", str9, " hi!=\"\"");
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag3 = endTag0.name("");
        boolean boolean4 = tag3.selfClosing;
        java.lang.String str5 = tag3.normalName;
        tag3.appendTagName("aEOF");
        org.jsoup.parser.Token.EndTag endTag8 = new org.jsoup.parser.Token.EndTag();
        endTag8.appendAttributeValue(" hi!=\"\"");
        java.lang.String str11 = endTag8.normalName;
        endTag8.setEmptyAttributeValue();
        endTag8.appendTagName('a');
        char[] charArray20 = new char[] { ' ', ' ', '#', ' ', 'a' };
        endTag8.appendAttributeValue(charArray20);
        java.lang.String str22 = endTag8.name();
        org.jsoup.parser.Token.EndTag endTag23 = new org.jsoup.parser.Token.EndTag();
        endTag23.appendAttributeValue(" hi!=\"\"");
        java.lang.String str26 = endTag23.normalName;
        endTag23.setEmptyAttributeValue();
        endTag23.appendTagName('a');
        boolean boolean30 = endTag23.isEndTag();
        boolean boolean31 = endTag23.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag33 = startTag32.reset();
        java.lang.String str34 = startTag32.normalName();
        int[] intArray35 = new int[] {};
        startTag32.appendAttributeValue(intArray35);
        endTag23.appendAttributeValue(intArray35);
        org.jsoup.parser.Token.EndTag endTag38 = new org.jsoup.parser.Token.EndTag();
        endTag38.appendAttributeValue("hi!");
        org.jsoup.nodes.Attributes attributes41 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes44 = attributes41.put("hi!", "");
        attributes41.removeIgnoreCase("Doctype");
        endTag38.attributes = attributes41;
        endTag38.selfClosing = false;
        endTag38.newAttribute();
        org.jsoup.parser.Token.EndTag endTag51 = new org.jsoup.parser.Token.EndTag();
        endTag51.appendAttributeValue(" hi!=\"\"");
        java.lang.String str54 = endTag51.normalName;
        endTag51.setEmptyAttributeValue();
        endTag51.appendTagName('a');
        boolean boolean58 = endTag51.isEndTag();
        boolean boolean59 = endTag51.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag60 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag61 = startTag60.reset();
        java.lang.String str62 = startTag60.normalName();
        int[] intArray63 = new int[] {};
        startTag60.appendAttributeValue(intArray63);
        endTag51.appendAttributeValue(intArray63);
        endTag38.appendAttributeValue(intArray63);
        endTag23.appendAttributeValue(intArray63);
        endTag8.appendAttributeValue(intArray63);
        tag3.appendAttributeValue(intArray63);
        boolean boolean70 = tag3.isSelfClosing();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { ' ', ' ', '#', ' ', 'a' });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "a" + "'", str22, "a");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] {});
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(tag61);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertArrayEquals(intArray63, new int[] {});
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.setEmptyAttributeValue();
        endTag0.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes7 = attributes4.put("hi!", "");
        attributes4.removeIgnoreCase("Doctype");
        endTag0.attributes = attributes4;
        endTag0.appendAttributeValue('a');
        org.jsoup.nodes.Attributes attributes13 = endTag0.attributes;
        org.jsoup.parser.Token.Tag tag15 = endTag0.name("=\"</a>\"");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(tag15);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.lang.String str5 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.markInsertionMode();
        java.io.Reader reader8 = null;
        org.jsoup.parser.Parser parser10 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.initialiseParse(reader8, "<!---->", parser10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.TokenType tokenType3 = org.jsoup.parser.Token.TokenType.StartTag;
        doctype0.type = tokenType3;
        doctype0.forceQuirks = true;
        boolean boolean7 = doctype0.isDoctype();
        org.jsoup.parser.Token token8 = doctype0.reset();
        java.lang.String str9 = doctype0.getPublicIdentifier();
        java.lang.String str10 = doctype0.tokenType();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Doctype" + "'", str10, "Doctype");
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.finaliseTag();
        startTag0.appendTagName(' ');
        java.lang.String str4 = startTag0.normalName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " " + "'", str4, " ");
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        org.jsoup.parser.ParseSettings parseSettings2 = new org.jsoup.parser.ParseSettings(true, false);
        boolean boolean3 = parseSettings2.preserveTagCase();
        java.lang.String str5 = parseSettings2.normalizeTag(" hi!=\"\"");
        java.lang.String str7 = parseSettings2.normalizeAttribute("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.FormElement formElement10 = htmlTreeBuilder0.getFormElement();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.setFosterInserts(true);
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
        org.junit.Assert.assertNull(formElement10);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag3 = endTag0.name("");
        java.lang.String str4 = endTag0.tagName;
        boolean boolean5 = endTag0.isEndTag();
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag();
        endTag6.appendAttributeValue(" hi!=\"\"");
        java.lang.String str9 = endTag6.normalName;
        endTag6.setEmptyAttributeValue();
        endTag6.appendTagName('a');
        boolean boolean13 = endTag6.isEndTag();
        boolean boolean14 = endTag6.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag16 = startTag15.reset();
        java.lang.String str17 = startTag15.normalName();
        int[] intArray18 = new int[] {};
        startTag15.appendAttributeValue(intArray18);
        endTag6.appendAttributeValue(intArray18);
        endTag0.appendAttributeValue(intArray18);
        java.lang.String str22 = endTag0.normalName();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] {});
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.lang.String str5 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.nodes.Document document9 = htmlTreeBuilder0.getDocument();
        java.lang.String str10 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.framesetOk(false);
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(" hi!=\"\"");
        java.lang.String str3 = endTag0.normalName;
        endTag0.setEmptyAttributeValue();
        endTag0.appendTagName('a');
        char[] charArray12 = new char[] { ' ', ' ', '#', ' ', 'a' };
        endTag0.appendAttributeValue(charArray12);
        java.lang.String str14 = endTag0.name();
        endTag0.appendAttributeValue(' ');
        endTag0.newAttribute();
        org.jsoup.parser.Token.Tag tag19 = endTag0.name("<a   hi!=\"\">");
        endTag0.normalName = "<![CDATA[EndTag]]>";
        boolean boolean22 = endTag0.isSelfClosing();
        boolean boolean23 = endTag0.selfClosing;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ', '#', ' ', 'a' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "a" + "'", str14, "a");
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token1 = comment0.reset();
        java.lang.String str2 = comment0.toString();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        java.lang.String str6 = comment0.getData();
        java.lang.String str7 = comment0.getData();
        boolean boolean8 = comment0.isEndTag();
        java.lang.StringBuilder stringBuilder9 = comment0.data;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState6);
        java.lang.String str8 = htmlTreeBuilder0.getBaseUri();
        java.util.List<java.lang.String> strList9 = htmlTreeBuilder0.getPendingTableCharacters();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strList9);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        boolean boolean7 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = htmlTreeBuilder0.state();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = htmlTreeBuilder0.inListItemScope(" hi!=\"hi!=&quot;&quot;\" a =\"hi!=&quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState8);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token1 = comment0.reset();
        java.lang.String str2 = comment0.toString();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        org.jsoup.parser.Token.Comment comment6 = comment0.asComment();
        java.lang.String str7 = comment0.toString();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(comment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.jsoup.parser.Token.CData cData1 = new org.jsoup.parser.Token.CData("<!---->");
        java.lang.String str2 = cData1.getData();
        org.jsoup.parser.Token.Character character4 = cData1.data("<![CDATA[hi!=\"\"]]>");
        org.jsoup.parser.Token.Character character5 = cData1.asCharacter();
        org.jsoup.parser.Token.Character character7 = cData1.data("<eof>");
        java.lang.String str8 = cData1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertNotNull(character5);
        org.junit.Assert.assertNotNull(character7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<![CDATA[<eof>]]>" + "'", str8, "<![CDATA[<eof>]]>");
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData6 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData6);
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes12 = attributes9.put("hi!", "");
        org.jsoup.nodes.Attributes attributes15 = attributes12.put(" hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes12.iterator();
        boolean boolean17 = xmlTreeBuilder0.processStartTag("EOF", attributes12);
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes23 = attributes20.put("a", true);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor24 = attributes23.iterator();
        boolean boolean25 = xmlTreeBuilder0.processStartTag("</<a   hi!=\"\">>", attributes23);
        org.jsoup.nodes.Attributes attributes27 = new org.jsoup.nodes.Attributes();
        attributes27.normalize();
        org.jsoup.nodes.Attributes attributes29 = attributes27.clone();
        boolean boolean31 = attributes27.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes32 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes35 = attributes32.put("hi!", "");
        attributes27.addAll(attributes32);
        org.jsoup.nodes.Attributes attributes39 = attributes32.put("<![CDATA[<!---->]]>", true);
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes41 = startTag40.getAttributes();
        attributes32.addAll(attributes41);
        org.jsoup.nodes.Attributes attributes43 = new org.jsoup.nodes.Attributes();
        attributes43.normalize();
        boolean boolean46 = attributes43.hasKeyIgnoreCase(" hi!=\"\"");
        java.lang.String str48 = attributes43.getIgnoreCase(" hi!=\"\"");
        int int49 = attributes43.size();
        attributes32.addAll(attributes43);
        org.jsoup.nodes.Attributes attributes51 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes54 = attributes51.put("hi!", "");
        org.jsoup.nodes.Attributes attributes57 = attributes54.put(" hi!=\"\"", false);
        int int58 = attributes54.size();
        org.jsoup.nodes.Attributes attributes59 = attributes54.clone();
        java.lang.String str61 = attributes59.getIgnoreCase("EOF");
        attributes32.addAll(attributes59);
        org.jsoup.nodes.Attributes attributes63 = attributes32.clone();
        boolean boolean64 = xmlTreeBuilder0.processStartTag("<![CDATA[a ]]>", attributes63);
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(attributeItor24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(attributes54);
        org.junit.Assert.assertNotNull(attributes57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(attributes59);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(attributes63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.nodes.FormElement formElement6 = null;
        htmlTreeBuilder0.setFormElement(formElement6);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        startTag0.normalName = "hi!";
        startTag0.appendAttributeValue('a');
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag();
        endTag6.appendAttributeValue(" hi!=\"\"");
        java.lang.String str9 = endTag6.normalName;
        endTag6.setEmptyAttributeValue();
        endTag6.appendTagName('a');
        boolean boolean13 = endTag6.isEndTag();
        boolean boolean14 = endTag6.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag16 = startTag15.reset();
        java.lang.String str17 = startTag15.normalName();
        int[] intArray18 = new int[] {};
        startTag15.appendAttributeValue(intArray18);
        endTag6.appendAttributeValue(intArray18);
        startTag0.appendAttributeValue(intArray18);
        boolean boolean22 = startTag0.isStartTag();
        org.jsoup.parser.Token.Tag tag23 = startTag0.reset();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(tag23);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder5.defaultSettings();
        org.jsoup.nodes.FormElement formElement7 = null;
        htmlTreeBuilder5.setFormElement(formElement7);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = htmlTreeBuilder5.state();
        java.util.List<java.lang.String> strList10 = htmlTreeBuilder5.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState11 = htmlTreeBuilder5.state();
        java.util.List<java.lang.String> strList12 = htmlTreeBuilder5.getPendingTableCharacters();
        htmlTreeBuilder5.newPendingTableCharacters();
        org.jsoup.parser.ParseSettings parseSettings14 = htmlTreeBuilder5.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState15 = htmlTreeBuilder5.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder16 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings17 = htmlTreeBuilder16.defaultSettings();
        org.jsoup.nodes.FormElement formElement18 = null;
        htmlTreeBuilder16.setFormElement(formElement18);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState20 = htmlTreeBuilder16.state();
        java.util.List<java.lang.String> strList21 = htmlTreeBuilder16.getPendingTableCharacters();
        boolean boolean22 = htmlTreeBuilder16.isFragmentParsing();
        java.util.List<java.lang.String> strList23 = htmlTreeBuilder16.getPendingTableCharacters();
        htmlTreeBuilder16.framesetOk(true);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder26 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings27 = xmlTreeBuilder26.defaultSettings();
        org.jsoup.nodes.Document document30 = xmlTreeBuilder26.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData32 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder26.insert((org.jsoup.parser.Token.Character) cData32);
        org.jsoup.nodes.Document document36 = xmlTreeBuilder26.parse("<a   hi!=\"\">", "<![CDATA[null]]>");
        htmlTreeBuilder16.setHeadElement((org.jsoup.nodes.Element) document36);
        htmlTreeBuilder5.setHeadElement((org.jsoup.nodes.Element) document36);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = htmlTreeBuilder0.isInActiveFormattingElements((org.jsoup.nodes.Element) document36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(elementList4);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(htmlTreeBuilderState9);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNull(htmlTreeBuilderState11);
        org.junit.Assert.assertNull(strList12);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNull(htmlTreeBuilderState15);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNull(htmlTreeBuilderState20);
        org.junit.Assert.assertNull(strList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(strList23);
        org.junit.Assert.assertNotNull(parseSettings27);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertNotNull(document36);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = null;
        htmlTreeBuilder0.setFormElement(formElement1);
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.getDocument();
        java.util.List<java.lang.String> strList7 = htmlTreeBuilder0.getPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = htmlTreeBuilder0.removeLastFormattingElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNull(strList7);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token1 = comment0.reset();
        java.lang.String str2 = comment0.getData();
        java.lang.String str3 = comment0.getData();
        boolean boolean4 = comment0.bogus;
        java.lang.String str5 = comment0.getData();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        org.jsoup.nodes.Attributes attributes2 = attributes0.clone();
        boolean boolean4 = attributes0.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes8 = attributes5.put("hi!", "");
        attributes0.addAll(attributes5);
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        attributes10.normalize();
        org.jsoup.nodes.Attributes attributes12 = attributes10.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList13 = attributes12.asList();
        attributes0.addAll(attributes12);
        org.jsoup.nodes.Attributes attributes15 = attributes12.clone();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes15.iterator();
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributeList13);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributeItor16);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes6 = attributes3.put("hi!", "");
        boolean boolean8 = attributes6.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag9 = startTag0.nameAttr("a ", attributes6);
        org.jsoup.parser.Token.Tag tag10 = startTag9.reset();
        java.lang.String str11 = startTag9.tagName;
        startTag9.setEmptyAttributeValue();
        boolean boolean13 = startTag9.selfClosing;
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(startTag9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean8 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = htmlTreeBuilder9.defaultSettings();
        org.jsoup.nodes.FormElement formElement11 = null;
        htmlTreeBuilder9.setFormElement(formElement11);
        htmlTreeBuilder9.markInsertionMode();
        java.util.List<java.lang.String> strList14 = htmlTreeBuilder9.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState15 = null;
        htmlTreeBuilder9.transition(htmlTreeBuilderState15);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState17 = htmlTreeBuilder9.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder18 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings19 = htmlTreeBuilder18.defaultSettings();
        org.jsoup.nodes.FormElement formElement20 = null;
        htmlTreeBuilder18.setFormElement(formElement20);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState22 = htmlTreeBuilder18.state();
        java.util.List<java.lang.String> strList23 = htmlTreeBuilder18.getPendingTableCharacters();
        boolean boolean24 = htmlTreeBuilder18.isFragmentParsing();
        java.util.List<java.lang.String> strList25 = htmlTreeBuilder18.getPendingTableCharacters();
        htmlTreeBuilder18.framesetOk(true);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder28 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder28.defaultSettings();
        org.jsoup.nodes.Document document32 = xmlTreeBuilder28.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData34 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder28.insert((org.jsoup.parser.Token.Character) cData34);
        org.jsoup.nodes.Document document38 = xmlTreeBuilder28.parse("<a   hi!=\"\">", "<![CDATA[null]]>");
        htmlTreeBuilder18.setHeadElement((org.jsoup.nodes.Element) document38);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder40 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings41 = htmlTreeBuilder40.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState42 = htmlTreeBuilder40.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList43 = htmlTreeBuilder40.getStack();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder44 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings45 = xmlTreeBuilder44.defaultSettings();
        org.jsoup.nodes.Document document48 = xmlTreeBuilder44.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData50 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder44.insert((org.jsoup.parser.Token.Character) cData50);
        org.jsoup.parser.Token.StartTag startTag52 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag53 = startTag52.reset();
        org.jsoup.nodes.Attributes attributes55 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes58 = attributes55.put("hi!", "");
        boolean boolean60 = attributes58.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag61 = startTag52.nameAttr("a ", attributes58);
        java.lang.String str62 = startTag52.toString();
        org.jsoup.nodes.Element element63 = xmlTreeBuilder44.insert(startTag52);
        boolean boolean64 = htmlTreeBuilder40.isSpecial(element63);
        htmlTreeBuilder18.setHeadElement(element63);
        htmlTreeBuilder9.setHeadElement(element63);
        boolean boolean67 = htmlTreeBuilder0.isSpecial(element63);
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNull(strList14);
        org.junit.Assert.assertNull(htmlTreeBuilderState17);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNull(htmlTreeBuilderState22);
        org.junit.Assert.assertNull(strList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(strList25);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(parseSettings41);
        org.junit.Assert.assertNull(htmlTreeBuilderState42);
        org.junit.Assert.assertNull(elementList43);
        org.junit.Assert.assertNotNull(parseSettings45);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertNotNull(attributes58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(startTag61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "<a   hi!=\"\">" + "'", str62, "<a   hi!=\"\">");
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement7 = null;
        htmlTreeBuilder0.setFormElement(formElement7);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder9.setFosterInserts(false);
        org.jsoup.nodes.Document document12 = htmlTreeBuilder9.getDocument();
        boolean boolean13 = htmlTreeBuilder9.isFragmentParsing();
        htmlTreeBuilder9.generateImpliedEndTags();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        org.jsoup.nodes.Document document19 = xmlTreeBuilder15.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData21 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder15.insert((org.jsoup.parser.Token.Character) cData21);
        org.jsoup.parser.Token.Comment comment23 = new org.jsoup.parser.Token.Comment();
        comment23.bogus = true;
        java.lang.String str26 = comment23.toString();
        xmlTreeBuilder15.insert(comment23);
        org.jsoup.parser.Token.Doctype doctype28 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token29 = doctype28.reset();
        java.lang.StringBuilder stringBuilder30 = doctype28.systemIdentifier;
        boolean boolean31 = doctype28.isForceQuirks();
        boolean boolean32 = doctype28.isDoctype();
        doctype28.forceQuirks = false;
        org.jsoup.parser.Token.Doctype doctype35 = doctype28.asDoctype();
        doctype28.pubSysKey = "";
        boolean boolean38 = xmlTreeBuilder15.process((org.jsoup.parser.Token) doctype28);
        org.jsoup.nodes.Document document41 = xmlTreeBuilder15.parse(" hi! eof", "<![CDATA[ a]]>");
        htmlTreeBuilder9.setHeadElement((org.jsoup.nodes.Element) document41);
        boolean boolean43 = htmlTreeBuilder9.isFosterInserts();
        org.jsoup.nodes.Element element44 = htmlTreeBuilder9.getHeadElement();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = htmlTreeBuilder0.onStack(element44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState5);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!---->" + "'", str26, "<!---->");
        org.junit.Assert.assertNotNull(token29);
        org.junit.Assert.assertNotNull(stringBuilder30);
        org.junit.Assert.assertEquals(stringBuilder30.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(doctype35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(element44);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(elementList4);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(" hi!=\"\"");
        java.lang.String str3 = endTag0.normalName;
        endTag0.setEmptyAttributeValue();
        endTag0.appendTagName('a');
        endTag0.newAttribute();
        org.jsoup.nodes.Attributes attributes8 = endTag0.attributes;
        org.jsoup.parser.Token.TokenType tokenType9 = org.jsoup.parser.Token.TokenType.StartTag;
        endTag0.type = tokenType9;
        java.lang.String str11 = endTag0.toString();
        endTag0.normalName = "EndTag";
        org.jsoup.parser.Token.EndTag endTag14 = new org.jsoup.parser.Token.EndTag();
        endTag14.appendAttributeValue("hi!");
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes20 = attributes17.put("hi!", "");
        attributes17.removeIgnoreCase("Doctype");
        endTag14.attributes = attributes17;
        endTag14.selfClosing = false;
        endTag14.newAttribute();
        org.jsoup.parser.Token.EndTag endTag27 = new org.jsoup.parser.Token.EndTag();
        endTag27.appendAttributeValue(" hi!=\"\"");
        java.lang.String str30 = endTag27.normalName;
        endTag27.setEmptyAttributeValue();
        endTag27.appendTagName('a');
        boolean boolean34 = endTag27.isEndTag();
        boolean boolean35 = endTag27.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag37 = startTag36.reset();
        java.lang.String str38 = startTag36.normalName();
        int[] intArray39 = new int[] {};
        startTag36.appendAttributeValue(intArray39);
        endTag27.appendAttributeValue(intArray39);
        endTag14.appendAttributeValue(intArray39);
        endTag0.appendAttributeValue(intArray39);
        org.jsoup.parser.Token.Tag tag45 = endTag0.name(" hi!=\"Doctype\"");
        endTag0.appendAttributeName(' ');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "</a>" + "'", str11, "</a>");
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] {});
        org.junit.Assert.assertNotNull(tag45);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData6 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData6);
        org.jsoup.parser.Token token8 = cData6.reset();
        org.jsoup.parser.Token token9 = cData6.reset();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNotNull(token9);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        htmlTreeBuilder0.framesetOk(true);
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState10);
        boolean boolean12 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean13 = htmlTreeBuilder0.framesetOk();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.setEmptyAttributeValue();
        endTag0.appendAttributeName('#');
        endTag0.newAttribute();
        boolean boolean5 = endTag0.isSelfClosing();
        endTag0.appendAttributeValue('a');
        endTag0.selfClosing = false;
        endTag0.appendTagName('a');
        endTag0.appendTagName('a');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        htmlTreeBuilder0.markInsertionMode();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState6);
        org.jsoup.parser.Token.Comment comment8 = new org.jsoup.parser.Token.Comment();
        comment8.bogus = true;
        comment8.bogus = true;
        java.lang.String str13 = comment8.toString();
        org.jsoup.parser.Token token14 = comment8.reset();
        java.lang.String str15 = comment8.toString();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = htmlTreeBuilder0.process((org.jsoup.parser.Token) comment8, htmlTreeBuilderState16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!---->" + "'", str15, "<!---->");
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(" hi!=\"\"");
        java.lang.String str3 = endTag0.normalName;
        endTag0.setEmptyAttributeValue();
        endTag0.appendTagName('a');
        boolean boolean7 = endTag0.isEndTag();
        boolean boolean8 = endTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag9 = endTag0.reset();
        endTag0.normalName = "hi!=\"\"";
        org.jsoup.parser.Token.EndTag endTag12 = endTag0.asEndTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = endTag0.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(endTag12);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        java.io.Reader reader6 = null;
        org.jsoup.parser.Parser parser8 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.initialiseParse(reader6, " hi!=\"hi!=&quot;&quot;\" a =\"hi!=&quot;&quot;\"", parser8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.lang.String str5 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean9 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder0.state();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        org.jsoup.nodes.Attributes attributes2 = attributes0.clone();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        attributes3.normalize();
        org.jsoup.nodes.Attributes attributes5 = attributes3.clone();
        attributes2.addAll(attributes5);
        boolean boolean8 = attributes5.hasKeyIgnoreCase("");
        attributes5.remove("StartTag");
        boolean boolean12 = attributes5.hasKey("<EOF>");
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData6 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData6);
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes12 = attributes9.put("hi!", "");
        org.jsoup.nodes.Attributes attributes15 = attributes12.put(" hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes12.iterator();
        boolean boolean17 = xmlTreeBuilder0.processStartTag("EOF", attributes12);
        org.jsoup.parser.Token.EndTag endTag19 = new org.jsoup.parser.Token.EndTag();
        endTag19.appendAttributeValue(" hi!=\"\"");
        java.lang.String str22 = endTag19.normalName;
        endTag19.setEmptyAttributeValue();
        endTag19.appendTagName('a');
        endTag19.newAttribute();
        org.jsoup.nodes.Attributes attributes27 = endTag19.attributes;
        org.jsoup.parser.Token.Tag tag28 = endTag19.reset();
        org.jsoup.parser.Token.EndTag endTag29 = new org.jsoup.parser.Token.EndTag();
        endTag29.setEmptyAttributeValue();
        endTag29.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes33 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes36 = attributes33.put("hi!", "");
        attributes33.removeIgnoreCase("Doctype");
        endTag29.attributes = attributes33;
        java.lang.String str41 = attributes33.get(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes42 = new org.jsoup.nodes.Attributes();
        attributes42.normalize();
        org.jsoup.nodes.Attributes attributes44 = attributes42.clone();
        boolean boolean46 = attributes42.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes47 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes50 = attributes47.put("hi!", "");
        attributes42.addAll(attributes47);
        attributes33.addAll(attributes47);
        tag28.attributes = attributes33;
        boolean boolean54 = xmlTreeBuilder0.processStartTag("Doctype", attributes33);
        org.jsoup.parser.ParseSettings parseSettings55 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings56 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings57 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes59 = null;
        boolean boolean60 = xmlTreeBuilder0.processStartTag("</<a   hi!=\"\">>", attributes59);
        org.jsoup.parser.Token.Comment comment61 = new org.jsoup.parser.Token.Comment();
        boolean boolean62 = comment61.bogus;
        java.lang.String str63 = comment61.getData();
        xmlTreeBuilder0.insert(comment61);
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(parseSettings55);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(parseSettings57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData6 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData6);
        org.jsoup.parser.Token.Comment comment8 = new org.jsoup.parser.Token.Comment();
        comment8.bogus = true;
        java.lang.String str11 = comment8.toString();
        xmlTreeBuilder0.insert(comment8);
        org.jsoup.parser.Token.Doctype doctype13 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token14 = doctype13.reset();
        java.lang.StringBuilder stringBuilder15 = doctype13.systemIdentifier;
        boolean boolean16 = doctype13.isForceQuirks();
        boolean boolean17 = doctype13.isDoctype();
        doctype13.forceQuirks = false;
        org.jsoup.parser.Token.Doctype doctype20 = doctype13.asDoctype();
        doctype13.pubSysKey = "";
        boolean boolean23 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype13);
        org.jsoup.nodes.Document document26 = xmlTreeBuilder0.parse(" hi! eof", "<![CDATA[ a]]>");
        org.jsoup.parser.Token.CData cData28 = new org.jsoup.parser.Token.CData("<!---->");
        java.lang.String str29 = cData28.toString();
        java.lang.String str30 = cData28.toString();
        java.lang.String str31 = cData28.toString();
        java.lang.String str32 = cData28.getData();
        java.lang.String str33 = cData28.toString();
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData28);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder36 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings37 = htmlTreeBuilder36.defaultSettings();
        boolean boolean38 = parseSettings37.preserveTagCase();
        org.jsoup.nodes.Attributes attributes39 = new org.jsoup.nodes.Attributes();
        attributes39.normalize();
        org.jsoup.nodes.Attributes attributes41 = attributes39.clone();
        attributes39.remove("Doctype");
        org.jsoup.nodes.Attributes attributes44 = new org.jsoup.nodes.Attributes();
        attributes44.normalize();
        org.jsoup.nodes.Attributes attributes46 = attributes44.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList47 = attributes46.asList();
        boolean boolean48 = attributes39.equals((java.lang.Object) attributes46);
        attributes46.remove("<!---->");
        org.jsoup.nodes.Attributes attributes51 = parseSettings37.normalizeAttributes(attributes46);
        java.lang.String str53 = parseSettings37.normalizeAttribute("<![CDATA[EndTag]]>");
        boolean boolean54 = parseSettings37.preserveTagCase();
        org.jsoup.parser.Token.StartTag startTag55 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag56 = startTag55.reset();
        org.jsoup.nodes.Attributes attributes58 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes61 = attributes58.put("hi!", "");
        boolean boolean63 = attributes61.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag64 = startTag55.nameAttr("a ", attributes61);
        org.jsoup.nodes.Attributes attributes66 = new org.jsoup.nodes.Attributes();
        attributes66.normalize();
        org.jsoup.nodes.Attributes attributes68 = attributes66.clone();
        boolean boolean70 = attributes66.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes71 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes74 = attributes71.put("hi!", "");
        attributes66.addAll(attributes71);
        org.jsoup.nodes.Attributes attributes76 = new org.jsoup.nodes.Attributes();
        attributes76.normalize();
        org.jsoup.nodes.Attributes attributes78 = attributes76.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList79 = attributes78.asList();
        attributes66.addAll(attributes78);
        org.jsoup.parser.Token.StartTag startTag81 = startTag64.nameAttr("a", attributes66);
        org.jsoup.nodes.Attributes attributes83 = new org.jsoup.nodes.Attributes();
        attributes83.normalize();
        int int85 = attributes83.size();
        org.jsoup.nodes.Attributes attributes86 = new org.jsoup.nodes.Attributes();
        attributes86.normalize();
        org.jsoup.nodes.Attributes attributes88 = attributes86.clone();
        attributes86.remove("Doctype");
        java.lang.String str92 = attributes86.getIgnoreCase("Doctype");
        attributes83.addAll(attributes86);
        org.jsoup.parser.Token.StartTag startTag94 = startTag81.nameAttr("doctype", attributes83);
        org.jsoup.nodes.Attributes attributes95 = parseSettings37.normalizeAttributes(attributes83);
        boolean boolean96 = xmlTreeBuilder0.processStartTag("<![CDATA[</a>]]>", attributes83);
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(doctype20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<![CDATA[<!---->]]>" + "'", str29, "<![CDATA[<!---->]]>");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<![CDATA[<!---->]]>" + "'", str30, "<![CDATA[<!---->]]>");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<![CDATA[<!---->]]>" + "'", str31, "<![CDATA[<!---->]]>");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<!---->" + "'", str32, "<!---->");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<![CDATA[<!---->]]>" + "'", str33, "<![CDATA[<!---->]]>");
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertNotNull(attributeList47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(attributes51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "<![cdata[endtag]]>" + "'", str53, "<![cdata[endtag]]>");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(tag56);
        org.junit.Assert.assertNotNull(attributes61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(startTag64);
        org.junit.Assert.assertNotNull(attributes68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(attributes74);
        org.junit.Assert.assertNotNull(attributes78);
        org.junit.Assert.assertNotNull(attributeList79);
        org.junit.Assert.assertNotNull(startTag81);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(attributes88);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertNotNull(startTag94);
        org.junit.Assert.assertNotNull(attributes95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList7 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.lang.String str9 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Document document11 = htmlTreeBuilder0.getDocument();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearFormattingElementsToLastMarker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(document11);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue("hi!");
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes6 = attributes3.put("hi!", "");
        attributes3.removeIgnoreCase("Doctype");
        endTag0.attributes = attributes3;
        endTag0.selfClosing = false;
        endTag0.newAttribute();
        boolean boolean13 = endTag0.isDoctype();
        endTag0.selfClosing = true;
        boolean boolean16 = endTag0.selfClosing;
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.getAttributes();
        org.jsoup.parser.Token.Tag tag2 = startTag0.reset();
        startTag0.newAttribute();
        org.jsoup.nodes.Attributes attributes4 = startTag0.attributes;
        java.lang.String str5 = startTag0.normalName();
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(" hi!=\"\"");
        java.lang.String str3 = endTag0.normalName;
        org.jsoup.parser.Token.TokenType tokenType4 = endTag0.type;
        endTag0.tagName = "<!---->";
        boolean boolean7 = endTag0.isStartTag();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        boolean boolean6 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        boolean boolean8 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean11 = htmlTreeBuilder0.framesetOk();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = htmlTreeBuilder0.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData6 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData6);
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes12 = attributes9.put("hi!", "");
        org.jsoup.nodes.Attributes attributes15 = attributes12.put(" hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes12.iterator();
        boolean boolean17 = xmlTreeBuilder0.processStartTag("EOF", attributes12);
        org.jsoup.parser.Token.EndTag endTag19 = new org.jsoup.parser.Token.EndTag();
        endTag19.appendAttributeValue(" hi!=\"\"");
        java.lang.String str22 = endTag19.normalName;
        endTag19.setEmptyAttributeValue();
        endTag19.appendTagName('a');
        endTag19.newAttribute();
        org.jsoup.nodes.Attributes attributes27 = endTag19.attributes;
        org.jsoup.parser.Token.Tag tag28 = endTag19.reset();
        org.jsoup.parser.Token.EndTag endTag29 = new org.jsoup.parser.Token.EndTag();
        endTag29.setEmptyAttributeValue();
        endTag29.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes33 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes36 = attributes33.put("hi!", "");
        attributes33.removeIgnoreCase("Doctype");
        endTag29.attributes = attributes33;
        java.lang.String str41 = attributes33.get(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes42 = new org.jsoup.nodes.Attributes();
        attributes42.normalize();
        org.jsoup.nodes.Attributes attributes44 = attributes42.clone();
        boolean boolean46 = attributes42.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes47 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes50 = attributes47.put("hi!", "");
        attributes42.addAll(attributes47);
        attributes33.addAll(attributes47);
        tag28.attributes = attributes33;
        boolean boolean54 = xmlTreeBuilder0.processStartTag("Doctype", attributes33);
        org.jsoup.parser.ParseSettings parseSettings55 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.EndTag endTag57 = new org.jsoup.parser.Token.EndTag();
        endTag57.setEmptyAttributeValue();
        endTag57.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes61 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes64 = attributes61.put("hi!", "");
        attributes61.removeIgnoreCase("Doctype");
        endTag57.attributes = attributes61;
        java.lang.String str69 = attributes61.get(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes70 = new org.jsoup.nodes.Attributes();
        attributes70.normalize();
        org.jsoup.nodes.Attributes attributes72 = attributes70.clone();
        boolean boolean74 = attributes70.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes75 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes78 = attributes75.put("hi!", "");
        attributes70.addAll(attributes75);
        attributes61.addAll(attributes75);
        java.util.Map<java.lang.String, java.lang.String> strMap81 = attributes61.dataset();
        boolean boolean82 = xmlTreeBuilder0.processStartTag("EOF", attributes61);
        org.jsoup.nodes.Document document85 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Document document88 = xmlTreeBuilder0.parse("hi!=\"hi!=&quot;&quot;\" a=\"hi!=&quot;&quot;\" a<!---->=\"eof\"", "<![cdata[</a>]]>");
        java.io.Reader reader89 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document91 = xmlTreeBuilder0.parse(reader89, "<![CDATA[<![CDATA[<!---->]]>]]>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(parseSettings55);
        org.junit.Assert.assertNotNull(attributes64);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(attributes72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(attributes78);
        org.junit.Assert.assertNotNull(strMap81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(document85);
        org.junit.Assert.assertNotNull(document88);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement5 = null;
        htmlTreeBuilder0.setFormElement(formElement5);
        org.jsoup.nodes.FormElement formElement7 = htmlTreeBuilder0.getFormElement();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList8 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState9);
        java.lang.String[] strArray14 = new java.lang.String[] { "a<<!---->>", "<![CDATA[<eof>]]>", "<![CDATA[Doctype]]>" };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = htmlTreeBuilder0.inScope(strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(formElement7);
        org.junit.Assert.assertNull(elementList8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "a<<!---->>", "<![CDATA[<eof>]]>", "<![CDATA[Doctype]]>" });
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        boolean boolean5 = doctype0.forceQuirks;
        org.jsoup.parser.Token.Doctype doctype6 = doctype0.asDoctype();
        java.lang.String str7 = doctype0.pubSysKey;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        java.lang.String str3 = comment0.toString();
        boolean boolean4 = comment0.bogus;
        boolean boolean5 = comment0.bogus;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.nodes.Element element6 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.setFosterInserts(false);
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes6 = attributes3.put("hi!", "");
        boolean boolean8 = attributes6.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag9 = startTag0.nameAttr("a ", attributes6);
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        attributes11.normalize();
        org.jsoup.nodes.Attributes attributes13 = attributes11.clone();
        boolean boolean15 = attributes11.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes19 = attributes16.put("hi!", "");
        attributes11.addAll(attributes16);
        org.jsoup.nodes.Attributes attributes21 = new org.jsoup.nodes.Attributes();
        attributes21.normalize();
        org.jsoup.nodes.Attributes attributes23 = attributes21.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList24 = attributes23.asList();
        attributes11.addAll(attributes23);
        org.jsoup.parser.Token.StartTag startTag26 = startTag9.nameAttr("a", attributes11);
        org.jsoup.parser.Token.Tag tag27 = startTag9.reset();
        org.jsoup.parser.Token.Tag tag28 = tag27.reset();
        org.jsoup.parser.Token.StartTag startTag29 = tag28.asStartTag();
        startTag29.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag31 = startTag29.reset();
        org.jsoup.parser.Token.Comment comment32 = new org.jsoup.parser.Token.Comment();
        java.lang.String str33 = comment32.getData();
        boolean boolean34 = comment32.isDoctype();
        org.jsoup.parser.Token.CData cData36 = new org.jsoup.parser.Token.CData("<!---->");
        java.lang.String str37 = cData36.getData();
        org.jsoup.parser.Token.Character character39 = cData36.data("<![CDATA[hi!=\"\"]]>");
        boolean boolean40 = character39.isEndTag();
        org.jsoup.parser.Token.TokenType tokenType41 = character39.type;
        comment32.type = tokenType41;
        startTag29.type = tokenType41;
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(startTag9);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(attributeList24);
        org.junit.Assert.assertNotNull(startTag26);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(startTag29);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<!---->" + "'", str37, "<!---->");
        org.junit.Assert.assertNotNull(character39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + tokenType41 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType41.equals(org.jsoup.parser.Token.TokenType.Character));
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.forceQuirks;
        org.jsoup.parser.Token token5 = doctype0.reset();
        java.lang.String str6 = doctype0.tokenType();
        boolean boolean7 = doctype0.isForceQuirks();
        org.jsoup.parser.Token.Doctype doctype8 = doctype0.asDoctype();
        boolean boolean9 = doctype8.forceQuirks;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag10 = doctype8.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Doctype" + "'", str6, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doctype8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList7 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.lang.String str9 = htmlTreeBuilder0.getBaseUri();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = htmlTreeBuilder0.inTableScope("<!---->");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes3 = attributes0.put("", false);
        java.lang.String str5 = attributes3.get("a ");
        boolean boolean7 = attributes3.hasKeyIgnoreCase("EOF");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes3.spliterator();
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator8);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.appendAttributeValue('a');
        tag1.appendTagName('a');
        org.junit.Assert.assertNotNull(tag1);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        org.jsoup.parser.Token.CData cData1 = new org.jsoup.parser.Token.CData(" hi!=\"\"");
        org.jsoup.parser.Token.Character character3 = cData1.data("hi!=\"\"");
        java.lang.String str4 = cData1.toString();
        java.lang.String str5 = cData1.toString();
        org.junit.Assert.assertNotNull(character3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<![CDATA[hi!=\"\"]]>" + "'", str4, "<![CDATA[hi!=\"\"]]>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<![CDATA[hi!=\"\"]]>" + "'", str5, "<![CDATA[hi!=\"\"]]>");
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.lang.String str5 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.nodes.Document document9 = htmlTreeBuilder0.getDocument();
        java.lang.String str10 = htmlTreeBuilder0.getBaseUri();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose("<a   hi!=\"\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(" hi!=\"\"");
        java.lang.String str3 = endTag0.normalName;
        endTag0.setEmptyAttributeValue();
        endTag0.appendTagName('a');
        boolean boolean7 = endTag0.isEndTag();
        boolean boolean8 = endTag0.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag10 = startTag9.reset();
        java.lang.String str11 = startTag9.normalName();
        int[] intArray12 = new int[] {};
        startTag9.appendAttributeValue(intArray12);
        endTag0.appendAttributeValue(intArray12);
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag16 = startTag15.reset();
        java.lang.String str17 = startTag15.normalName();
        int[] intArray18 = new int[] {};
        startTag15.appendAttributeValue(intArray18);
        endTag0.appendAttributeValue(intArray18);
        java.lang.String str21 = endTag0.tagName;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] {});
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "a" + "'", str21, "a");
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue("hi!");
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes6 = attributes3.put("hi!", "");
        attributes3.removeIgnoreCase("Doctype");
        endTag0.attributes = attributes3;
        endTag0.selfClosing = false;
        java.lang.String str12 = endTag0.tagName;
        endTag0.normalName = "<a   hi!=\"\">";
        org.jsoup.parser.Token.Tag tag16 = endTag0.name("</doctype>");
        endTag0.newAttribute();
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(tag16);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        org.jsoup.parser.ParseSettings parseSettings0 = org.jsoup.parser.ParseSettings.htmlDefault;
        java.lang.String str2 = parseSettings0.normalizeAttribute("hi!");
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        attributes3.normalize();
        org.jsoup.nodes.Attributes attributes5 = attributes3.clone();
        org.jsoup.nodes.Attributes attributes6 = parseSettings0.normalizeAttributes(attributes5);
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes10 = attributes7.put("a", true);
        boolean boolean12 = attributes7.hasKeyIgnoreCase("<<![CDATA[hi!=\"\"]]>  hi!=\"hi!=&quot;&quot;\">");
        boolean boolean13 = attributes5.equals((java.lang.Object) attributes7);
        org.junit.Assert.assertNotNull(parseSettings0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.setEmptyAttributeValue();
        endTag0.appendAttributeName('#');
        endTag0.newAttribute();
        boolean boolean5 = endTag0.isSelfClosing();
        endTag0.appendAttributeValue("<EOF>");
        endTag0.appendTagName('#');
        endTag0.appendAttributeName('a');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData6 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData6);
        org.jsoup.parser.Token.CData cData9 = new org.jsoup.parser.Token.CData("<!---->");
        org.jsoup.parser.Token.Character character11 = cData9.data("Doctype");
        java.lang.String str12 = cData9.getData();
        java.lang.String str13 = cData9.getData();
        boolean boolean14 = xmlTreeBuilder0.process((org.jsoup.parser.Token) cData9);
        org.jsoup.nodes.Document document17 = xmlTreeBuilder0.parse("=\"</a>\"", "<![cdata[</a>]]>");
        org.jsoup.parser.Token.Comment comment18 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token19 = comment18.reset();
        boolean boolean20 = comment18.bogus;
        comment18.bogus = false;
        xmlTreeBuilder0.insert(comment18);
        org.jsoup.parser.Token.TokenType tokenType24 = comment18.type;
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(character11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Doctype" + "'", str12, "Doctype");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Doctype" + "'", str13, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(token19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + tokenType24 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType24.equals(org.jsoup.parser.Token.TokenType.Comment));
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        org.jsoup.parser.ParseSettings parseSettings2 = new org.jsoup.parser.ParseSettings(true, true);
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes6 = attributes3.put("hi!", "");
        org.jsoup.nodes.Attributes attributes9 = attributes6.put(" hi!=\"\"", false);
        boolean boolean11 = attributes9.hasKeyIgnoreCase("Doctype");
        int int12 = attributes9.size();
        org.jsoup.nodes.Attributes attributes13 = parseSettings2.normalizeAttributes(attributes9);
        org.jsoup.parser.Token.EndTag endTag14 = new org.jsoup.parser.Token.EndTag();
        endTag14.appendAttributeValue(" hi!=\"\"");
        org.jsoup.parser.Token.Tag tag18 = endTag14.name("a ");
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes22 = attributes19.put("hi!", "");
        org.jsoup.nodes.Attributes attributes25 = attributes22.put(" hi!=\"\"", false);
        int int26 = attributes22.size();
        endTag14.attributes = attributes22;
        attributes22.normalize();
        org.jsoup.nodes.Attributes attributes31 = attributes22.put("<![CDATA[hi!=\"\"]]>", "<![CDATA[Doctype]]>");
        boolean boolean33 = attributes22.hasKey(" a");
        org.jsoup.nodes.Attributes attributes34 = parseSettings2.normalizeAttributes(attributes22);
        boolean boolean36 = attributes22.hasKey("aeof");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes3 = attributes0.put("hi!", "");
        java.lang.String str4 = attributes0.toString();
        org.jsoup.nodes.Attributes attributes7 = attributes0.put("a", false);
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        attributes8.normalize();
        org.jsoup.nodes.Attributes attributes10 = attributes8.clone();
        boolean boolean12 = attributes8.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes16 = attributes13.put("hi!", "");
        attributes8.addAll(attributes13);
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        attributes18.normalize();
        org.jsoup.nodes.Attributes attributes20 = attributes18.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList21 = attributes20.asList();
        attributes8.addAll(attributes20);
        org.jsoup.nodes.Attributes attributes23 = attributes20.clone();
        boolean boolean25 = attributes20.hasKeyIgnoreCase("<<!---->  hi!=\"\">");
        int int26 = attributes20.size();
        attributes0.addAll(attributes20);
        java.util.List<org.jsoup.nodes.Attribute> attributeList28 = attributes20.asList();
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " hi!=\"\"" + "'", str4, " hi!=\"\"");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(attributeList21);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(attributeList28);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        boolean boolean5 = doctype0.isDoctype();
        java.lang.String str6 = doctype0.getName();
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.String str8 = doctype0.pubSysKey;
        boolean boolean9 = doctype0.forceQuirks;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        org.jsoup.parser.Token.CData cData1 = new org.jsoup.parser.Token.CData("<!---->");
        java.lang.String str2 = cData1.toString();
        java.lang.String str3 = cData1.toString();
        boolean boolean4 = cData1.isComment();
        java.lang.String str5 = cData1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<![CDATA[<!---->]]>" + "'", str2, "<![CDATA[<!---->]]>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<![CDATA[<!---->]]>" + "'", str3, "<![CDATA[<!---->]]>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<![CDATA[<!---->]]>" + "'", str5, "<![CDATA[<!---->]]>");
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.forceQuirks;
        org.jsoup.parser.Token token5 = doctype0.reset();
        java.lang.String str6 = doctype0.tokenType();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        doctype0.forceQuirks = false;
        boolean boolean12 = doctype0.isForceQuirks();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Doctype" + "'", str6, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        startTag0.normalName = "hi!";
        boolean boolean4 = startTag0.isStartTag();
        startTag0.finaliseTag();
        org.jsoup.parser.Token.Tag tag6 = startTag0.reset();
        startTag0.normalName = " hi!=\"\"  a=\"<eof>\"";
        java.lang.Class<?> wildcardClass9 = startTag0.getClass();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.isDoctype();
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        java.lang.String str8 = doctype7.pubSysKey;
        java.lang.StringBuilder stringBuilder9 = doctype7.systemIdentifier;
        org.jsoup.parser.Token token10 = doctype7.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character11 = doctype7.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(token10);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes6 = attributes3.put("hi!", "");
        boolean boolean8 = attributes6.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag9 = startTag0.nameAttr("a ", attributes6);
        java.lang.String str10 = startTag0.normalName();
        java.lang.String str11 = startTag0.name();
        startTag0.setEmptyAttributeValue();
        java.lang.String str13 = startTag0.toString();
        org.jsoup.parser.Token.TokenType tokenType14 = startTag0.type;
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(startTag9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "a " + "'", str10, "a ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "a " + "'", str11, "a ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<a   hi!=\"\">" + "'", str13, "<a   hi!=\"\">");
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        org.jsoup.parser.Token.CData cData1 = new org.jsoup.parser.Token.CData("<!---->");
        org.jsoup.parser.Token.Character character3 = cData1.data("Doctype");
        java.lang.String str4 = cData1.getData();
        java.lang.String str5 = cData1.tokenType();
        java.lang.String str6 = cData1.toString();
        org.jsoup.parser.Token.TokenType tokenType7 = org.jsoup.parser.Token.TokenType.EndTag;
        cData1.type = tokenType7;
        org.jsoup.parser.Token token9 = cData1.reset();
        org.junit.Assert.assertNotNull(character3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Doctype" + "'", str4, "Doctype");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CData" + "'", str5, "CData");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<![CDATA[Doctype]]>" + "'", str6, "<![CDATA[Doctype]]>");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(token9);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue("hi!");
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes6 = attributes3.put("hi!", "");
        attributes3.removeIgnoreCase("Doctype");
        endTag0.attributes = attributes3;
        endTag0.selfClosing = false;
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes15 = attributes12.put("hi!", "");
        endTag0.attributes = attributes15;
        endTag0.appendAttributeValue("EOF");
        boolean boolean19 = endTag0.isSelfClosing();
        boolean boolean20 = endTag0.isSelfClosing();
        java.lang.String str21 = endTag0.normalName;
        endTag0.setEmptyAttributeValue();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character23 = endTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.getAttributes();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        java.lang.String str4 = attributes3.toString();
        org.jsoup.parser.Token.StartTag startTag5 = startTag0.nameAttr("EOF", attributes3);
        attributes3.remove("");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes3.spliterator();
        int int9 = attributes3.size();
        java.lang.String str10 = attributes3.html();
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(startTag5);
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        boolean boolean6 = htmlTreeBuilder0.isFragmentParsing();
        java.util.List<java.lang.String> strList7 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(true);
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder11 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder11.setFosterInserts(false);
        org.jsoup.nodes.Document document14 = htmlTreeBuilder11.getDocument();
        boolean boolean15 = htmlTreeBuilder11.isFragmentParsing();
        org.jsoup.nodes.Element element16 = htmlTreeBuilder11.getHeadElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder17.defaultSettings();
        org.jsoup.nodes.Document document21 = xmlTreeBuilder17.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder11.setHeadElement((org.jsoup.nodes.Element) document21);
        boolean boolean23 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document21);
        htmlTreeBuilder0.generateImpliedEndTags();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element25 = htmlTreeBuilder0.lastFormattingElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        org.jsoup.parser.ParseSettings parseSettings0 = org.jsoup.parser.ParseSettings.preserveCase;
        java.lang.String str2 = parseSettings0.normalizeTag("hi!");
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        attributes3.normalize();
        org.jsoup.nodes.Attributes attributes5 = attributes3.clone();
        org.jsoup.nodes.Attributes attributes6 = parseSettings0.normalizeAttributes(attributes5);
        attributes6.normalize();
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes11 = attributes8.put("", false);
        org.jsoup.nodes.Attributes attributes14 = attributes8.put("hi!", "hi!=\"\"");
        org.jsoup.nodes.Attributes attributes17 = attributes14.put("a ", "hi!=\"\"");
        attributes6.addAll(attributes14);
        org.jsoup.nodes.Attributes attributes19 = attributes6.clone();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = attributes19.dataset();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder21 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings22 = htmlTreeBuilder21.defaultSettings();
        org.jsoup.nodes.FormElement formElement23 = null;
        htmlTreeBuilder21.setFormElement(formElement23);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState25 = htmlTreeBuilder21.state();
        org.jsoup.nodes.Element element26 = null;
        htmlTreeBuilder21.setHeadElement(element26);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState28 = htmlTreeBuilder21.originalState();
        htmlTreeBuilder21.setFosterInserts(false);
        org.jsoup.nodes.FormElement formElement31 = htmlTreeBuilder21.getFormElement();
        boolean boolean32 = attributes19.equals((java.lang.Object) htmlTreeBuilder21);
        org.jsoup.parser.Token.Doctype doctype33 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token34 = doctype33.reset();
        java.lang.StringBuilder stringBuilder35 = doctype33.systemIdentifier;
        java.lang.String str36 = doctype33.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder37 = doctype33.name;
        org.jsoup.parser.Token token38 = doctype33.reset();
        boolean boolean39 = doctype33.isForceQuirks();
        boolean boolean40 = attributes19.equals((java.lang.Object) boolean39);
        org.junit.Assert.assertNotNull(parseSettings0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNull(htmlTreeBuilderState25);
        org.junit.Assert.assertNull(htmlTreeBuilderState28);
        org.junit.Assert.assertNull(formElement31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(token34);
        org.junit.Assert.assertNotNull(stringBuilder35);
        org.junit.Assert.assertEquals(stringBuilder35.toString(), "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(stringBuilder37);
        org.junit.Assert.assertEquals(stringBuilder37.toString(), "");
        org.junit.Assert.assertNotNull(token38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        comment0.bogus = true;
        java.lang.String str5 = comment0.getData();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = null;
        htmlTreeBuilder0.setFormElement(formElement1);
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = htmlTreeBuilder6.defaultSettings();
        org.jsoup.nodes.FormElement formElement8 = null;
        htmlTreeBuilder6.setFormElement(formElement8);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder6.state();
        java.util.List<java.lang.String> strList11 = htmlTreeBuilder6.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = htmlTreeBuilder6.state();
        htmlTreeBuilder6.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState15 = htmlTreeBuilder6.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder16 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean17 = htmlTreeBuilder16.isFragmentParsing();
        htmlTreeBuilder16.newPendingTableCharacters();
        htmlTreeBuilder16.framesetOk(false);
        htmlTreeBuilder16.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder22 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder22.setFosterInserts(false);
        org.jsoup.nodes.Document document25 = htmlTreeBuilder22.getDocument();
        org.jsoup.nodes.FormElement formElement26 = htmlTreeBuilder22.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder27 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings28 = xmlTreeBuilder27.defaultSettings();
        org.jsoup.nodes.Document document31 = xmlTreeBuilder27.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder22.maybeSetBaseUri((org.jsoup.nodes.Element) document31);
        htmlTreeBuilder16.maybeSetBaseUri((org.jsoup.nodes.Element) document31);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder34 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean35 = htmlTreeBuilder34.isFragmentParsing();
        htmlTreeBuilder34.newPendingTableCharacters();
        htmlTreeBuilder34.framesetOk(false);
        htmlTreeBuilder34.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder40 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder40.setFosterInserts(false);
        org.jsoup.nodes.Document document43 = htmlTreeBuilder40.getDocument();
        org.jsoup.nodes.FormElement formElement44 = htmlTreeBuilder40.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder45 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings46 = xmlTreeBuilder45.defaultSettings();
        org.jsoup.nodes.Document document49 = xmlTreeBuilder45.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder40.maybeSetBaseUri((org.jsoup.nodes.Element) document49);
        htmlTreeBuilder34.maybeSetBaseUri((org.jsoup.nodes.Element) document49);
        boolean boolean52 = htmlTreeBuilder16.isSpecial((org.jsoup.nodes.Element) document49);
        htmlTreeBuilder6.setHeadElement((org.jsoup.nodes.Element) document49);
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document49);
        htmlTreeBuilder0.generateImpliedEndTags();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
        org.junit.Assert.assertNull(strList11);
        org.junit.Assert.assertNull(htmlTreeBuilderState12);
        org.junit.Assert.assertNull(htmlTreeBuilderState15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(document25);
        org.junit.Assert.assertNull(formElement26);
        org.junit.Assert.assertNotNull(parseSettings28);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(document43);
        org.junit.Assert.assertNull(formElement44);
        org.junit.Assert.assertNotNull(parseSettings46);
        org.junit.Assert.assertNotNull(document49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState5);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        org.jsoup.parser.ParseSettings parseSettings0 = org.jsoup.parser.ParseSettings.htmlDefault;
        java.lang.String str2 = parseSettings0.normalizeAttribute("hi!");
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        attributes3.normalize();
        org.jsoup.nodes.Attributes attributes5 = attributes3.clone();
        org.jsoup.nodes.Attributes attributes6 = parseSettings0.normalizeAttributes(attributes5);
        attributes5.remove("hi!");
        attributes5.remove("<!---->");
        org.jsoup.parser.Token.Doctype doctype11 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token12 = doctype11.reset();
        java.lang.StringBuilder stringBuilder13 = doctype11.systemIdentifier;
        boolean boolean14 = doctype11.isForceQuirks();
        boolean boolean15 = doctype11.isDoctype();
        doctype11.forceQuirks = false;
        org.jsoup.parser.Token.Doctype doctype18 = doctype11.asDoctype();
        java.lang.String str19 = doctype11.getName();
        boolean boolean20 = attributes5.equals((java.lang.Object) doctype11);
        boolean boolean21 = doctype11.isStartTag();
        java.lang.String str22 = doctype11.tokenType();
        org.junit.Assert.assertNotNull(parseSettings0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(doctype18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Doctype" + "'", str22, "Doctype");
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes6 = attributes3.put("hi!", "");
        boolean boolean8 = attributes6.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag9 = startTag0.nameAttr("a ", attributes6);
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        attributes11.normalize();
        org.jsoup.nodes.Attributes attributes13 = attributes11.clone();
        boolean boolean15 = attributes11.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes19 = attributes16.put("hi!", "");
        attributes11.addAll(attributes16);
        org.jsoup.nodes.Attributes attributes21 = new org.jsoup.nodes.Attributes();
        attributes21.normalize();
        org.jsoup.nodes.Attributes attributes23 = attributes21.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList24 = attributes23.asList();
        attributes11.addAll(attributes23);
        org.jsoup.parser.Token.StartTag startTag26 = startTag9.nameAttr("a", attributes11);
        org.jsoup.nodes.Attributes attributes29 = attributes11.put("<![CDATA[null]]>", true);
        org.jsoup.nodes.Attributes attributes30 = attributes29.clone();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator31 = attributes30.spliterator();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(startTag9);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(attributeList24);
        org.junit.Assert.assertNotNull(startTag26);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(attributeSpliterator31);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes3 = attributes0.put("hi!", "");
        org.jsoup.nodes.Attributes attributes6 = attributes3.put(" hi!=\"\"", false);
        boolean boolean8 = attributes6.hasKeyIgnoreCase("Doctype");
        int int9 = attributes6.size();
        org.jsoup.nodes.Attributes attributes12 = attributes6.put("hi!=\"\"", false);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator13 = attributes12.spliterator();
        java.lang.String str15 = attributes12.getIgnoreCase(" hi!=\"\" hi!=\"\"=\"\"");
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributeSpliterator13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        org.jsoup.parser.ParseSettings parseSettings0 = org.jsoup.parser.ParseSettings.htmlDefault;
        java.lang.String str2 = parseSettings0.normalizeAttribute("hi!");
        java.lang.String str4 = parseSettings0.normalizeAttribute("Doctype");
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes8 = attributes5.put("hi!", "");
        attributes5.removeIgnoreCase("Doctype");
        java.lang.String str12 = attributes5.get("");
        org.jsoup.nodes.Attributes attributes13 = parseSettings0.normalizeAttributes(attributes5);
        attributes5.removeIgnoreCase("</Doctype>");
        org.junit.Assert.assertNotNull(parseSettings0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "doctype" + "'", str4, "doctype");
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.bogus;
        org.jsoup.parser.Token token2 = comment0.reset();
        java.lang.String str3 = comment0.toString();
        org.jsoup.parser.Token token4 = comment0.reset();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertNotNull(token4);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        comment5.bogus = true;
        org.jsoup.parser.Token token8 = comment5.reset();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.CData cData11 = new org.jsoup.parser.Token.CData(" hi!=\"\"");
        org.jsoup.parser.Token.Character character13 = cData11.data("hi!=\"\"");
        java.lang.String str14 = cData11.toString();
        org.jsoup.parser.Token.Character character16 = cData11.data("a");
        java.lang.String str17 = cData11.tokenType();
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData11);
        org.jsoup.parser.Token.CData cData20 = new org.jsoup.parser.Token.CData(" hi!=\"\"");
        org.jsoup.parser.Token.Character character22 = cData20.data("hi!=\"\"");
        java.lang.String str23 = cData20.toString();
        org.jsoup.parser.Token.Character character25 = cData20.data("a");
        boolean boolean26 = character25.isCData();
        xmlTreeBuilder0.insert(character25);
        org.jsoup.nodes.Attributes attributes29 = new org.jsoup.nodes.Attributes();
        java.lang.String str30 = attributes29.toString();
        attributes29.removeIgnoreCase("<EOF>");
        boolean boolean33 = xmlTreeBuilder0.processStartTag("<![CDATA[<!---->]]>", attributes29);
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNotNull(character13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<![CDATA[hi!=\"\"]]>" + "'", str14, "<![CDATA[hi!=\"\"]]>");
        org.junit.Assert.assertNotNull(character16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "CData" + "'", str17, "CData");
        org.junit.Assert.assertNotNull(character22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<![CDATA[hi!=\"\"]]>" + "'", str23, "<![CDATA[hi!=\"\"]]>");
        org.junit.Assert.assertNotNull(character25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        boolean boolean6 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        boolean boolean8 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = htmlTreeBuilder0.originalState();
        boolean boolean10 = htmlTreeBuilder0.isFosterInserts();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList11 = htmlTreeBuilder0.getStack();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(elementList11);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes6 = attributes3.put("hi!", "");
        boolean boolean8 = attributes6.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag9 = startTag0.nameAttr("a ", attributes6);
        startTag0.appendAttributeValue('4');
        java.lang.String str12 = startTag0.name();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(startTag9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "a " + "'", str12, "a ");
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.lang.String str7 = htmlTreeBuilder0.getBaseUri();
        java.util.List<java.lang.String> strList8 = htmlTreeBuilder0.getPendingTableCharacters();
        java.io.Reader reader9 = null;
        org.jsoup.parser.Parser parser11 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.initialiseParse(reader9, "<![CDATA[eof]]>", parser11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(formElement4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement5 = null;
        htmlTreeBuilder0.setFormElement(formElement5);
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder8 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean9 = htmlTreeBuilder8.isFragmentParsing();
        htmlTreeBuilder8.newPendingTableCharacters();
        org.jsoup.nodes.Document document11 = htmlTreeBuilder8.getDocument();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings13 = xmlTreeBuilder12.defaultSettings();
        org.jsoup.nodes.Document document16 = xmlTreeBuilder12.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData18 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder12.insert((org.jsoup.parser.Token.Character) cData18);
        org.jsoup.nodes.Document document22 = xmlTreeBuilder12.parse("EndTag", "EOF");
        htmlTreeBuilder8.maybeSetBaseUri((org.jsoup.nodes.Element) document22);
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document22);
        org.jsoup.nodes.FormElement formElement25 = htmlTreeBuilder0.getFormElement();
        boolean boolean26 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder27 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings28 = xmlTreeBuilder27.defaultSettings();
        org.jsoup.nodes.Document document31 = xmlTreeBuilder27.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData33 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder27.insert((org.jsoup.parser.Token.Character) cData33);
        org.jsoup.nodes.Attributes attributes36 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes39 = attributes36.put("hi!", "");
        org.jsoup.nodes.Attributes attributes42 = attributes39.put(" hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor43 = attributes39.iterator();
        boolean boolean44 = xmlTreeBuilder27.processStartTag("EOF", attributes39);
        org.jsoup.nodes.Document document47 = xmlTreeBuilder27.parse("doctype", "<EOF>");
        org.jsoup.parser.Token.Comment comment48 = new org.jsoup.parser.Token.Comment();
        java.lang.String str49 = comment48.getData();
        java.lang.StringBuilder stringBuilder50 = comment48.data;
        org.jsoup.parser.Token token51 = comment48.reset();
        xmlTreeBuilder27.insert(comment48);
        org.jsoup.nodes.Document document55 = xmlTreeBuilder27.parse("<![CDATA[EndTag]]>", "a<<!---->>");
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document55);
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNull(formElement25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(parseSettings28);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNotNull(attributeItor43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(stringBuilder50);
        org.junit.Assert.assertEquals(stringBuilder50.toString(), "");
        org.junit.Assert.assertNotNull(token51);
        org.junit.Assert.assertNotNull(document55);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean7 = htmlTreeBuilder6.isFragmentParsing();
        htmlTreeBuilder6.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = htmlTreeBuilder9.defaultSettings();
        org.jsoup.nodes.FormElement formElement11 = null;
        htmlTreeBuilder9.setFormElement(formElement11);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState13 = htmlTreeBuilder9.state();
        java.util.List<java.lang.String> strList14 = htmlTreeBuilder9.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState15 = htmlTreeBuilder9.state();
        htmlTreeBuilder9.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState18 = htmlTreeBuilder9.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder19 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean20 = htmlTreeBuilder19.isFragmentParsing();
        htmlTreeBuilder19.newPendingTableCharacters();
        htmlTreeBuilder19.framesetOk(false);
        htmlTreeBuilder19.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder25 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder25.setFosterInserts(false);
        org.jsoup.nodes.Document document28 = htmlTreeBuilder25.getDocument();
        org.jsoup.nodes.FormElement formElement29 = htmlTreeBuilder25.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder30 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings31 = xmlTreeBuilder30.defaultSettings();
        org.jsoup.nodes.Document document34 = xmlTreeBuilder30.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder25.maybeSetBaseUri((org.jsoup.nodes.Element) document34);
        htmlTreeBuilder19.maybeSetBaseUri((org.jsoup.nodes.Element) document34);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder37 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean38 = htmlTreeBuilder37.isFragmentParsing();
        htmlTreeBuilder37.newPendingTableCharacters();
        htmlTreeBuilder37.framesetOk(false);
        htmlTreeBuilder37.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder43 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder43.setFosterInserts(false);
        org.jsoup.nodes.Document document46 = htmlTreeBuilder43.getDocument();
        org.jsoup.nodes.FormElement formElement47 = htmlTreeBuilder43.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder48 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings49 = xmlTreeBuilder48.defaultSettings();
        org.jsoup.nodes.Document document52 = xmlTreeBuilder48.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder43.maybeSetBaseUri((org.jsoup.nodes.Element) document52);
        htmlTreeBuilder37.maybeSetBaseUri((org.jsoup.nodes.Element) document52);
        boolean boolean55 = htmlTreeBuilder19.isSpecial((org.jsoup.nodes.Element) document52);
        htmlTreeBuilder9.setHeadElement((org.jsoup.nodes.Element) document52);
        htmlTreeBuilder6.setHeadElement((org.jsoup.nodes.Element) document52);
        boolean boolean58 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document52);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState59 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState59);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.reconstructFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNull(htmlTreeBuilderState13);
        org.junit.Assert.assertNull(strList14);
        org.junit.Assert.assertNull(htmlTreeBuilderState15);
        org.junit.Assert.assertNull(htmlTreeBuilderState18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(document28);
        org.junit.Assert.assertNull(formElement29);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(document46);
        org.junit.Assert.assertNull(formElement47);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        boolean boolean6 = comment5.bogus;
        org.jsoup.parser.Token token7 = comment5.reset();
        boolean boolean8 = comment5.isEndTag();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag10.reset();
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes16 = attributes13.put("hi!", "");
        boolean boolean18 = attributes16.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag19 = startTag10.nameAttr("a ", attributes16);
        java.lang.String str20 = startTag10.toString();
        org.jsoup.parser.Token.EndTag endTag22 = new org.jsoup.parser.Token.EndTag();
        endTag22.appendAttributeValue(" hi!=\"\"");
        org.jsoup.parser.Token.Tag tag26 = endTag22.name("a ");
        org.jsoup.nodes.Attributes attributes27 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes30 = attributes27.put("hi!", "");
        org.jsoup.nodes.Attributes attributes33 = attributes30.put(" hi!=\"\"", false);
        int int34 = attributes30.size();
        endTag22.attributes = attributes30;
        attributes30.normalize();
        org.jsoup.parser.Token.StartTag startTag37 = startTag10.nameAttr("<!---->", attributes30);
        startTag37.normalName = "<![CDATA[null]]>";
        startTag37.appendAttributeName('4');
        startTag37.appendAttributeValue("a<!---->");
        org.jsoup.nodes.Element element44 = xmlTreeBuilder0.insert(startTag37);
        org.jsoup.parser.ParseSettings parseSettings45 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.StartTag startTag46 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes47 = startTag46.getAttributes();
        org.jsoup.nodes.Attributes attributes49 = new org.jsoup.nodes.Attributes();
        java.lang.String str50 = attributes49.toString();
        org.jsoup.parser.Token.StartTag startTag51 = startTag46.nameAttr("EOF", attributes49);
        java.lang.String str52 = startTag46.toString();
        startTag46.normalName = "hi!=\"\"";
        org.jsoup.parser.Token token55 = startTag46.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element56 = xmlTreeBuilder0.insert(startTag46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<a   hi!=\"\">" + "'", str20, "<a   hi!=\"\">");
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(startTag37);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(parseSettings45);
        org.junit.Assert.assertNotNull(attributes47);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(startTag51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "<EOF>" + "'", str52, "<EOF>");
        org.junit.Assert.assertNotNull(token55);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        java.lang.String str2 = startTag0.normalName();
        int[] intArray3 = new int[] {};
        startTag0.appendAttributeValue(intArray3);
        java.lang.String str5 = startTag0.normalName;
        org.jsoup.parser.Token.Tag tag6 = startTag0.reset();
        startTag0.appendAttributeName(" hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = startTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] {});
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag3 = startTag0.name("<a  hi!=\"\">");
        org.jsoup.parser.Token.EndTag endTag4 = new org.jsoup.parser.Token.EndTag();
        endTag4.appendAttributeValue(" hi!=\"\"");
        java.lang.String str7 = endTag4.normalName;
        endTag4.setEmptyAttributeValue();
        endTag4.appendTagName('a');
        java.lang.String str11 = endTag4.name();
        endTag4.setEmptyAttributeValue();
        boolean boolean13 = endTag4.isDoctype();
        boolean boolean14 = endTag4.isComment();
        org.jsoup.parser.Token.EndTag endTag15 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.EndTag endTag16 = new org.jsoup.parser.Token.EndTag();
        endTag16.appendAttributeValue("hi!");
        boolean boolean19 = endTag16.isEndTag();
        boolean boolean20 = endTag16.isEndTag();
        char[] charArray23 = new char[] { 'a', ' ' };
        endTag16.appendAttributeValue(charArray23);
        endTag15.appendAttributeValue(charArray23);
        endTag4.appendAttributeValue(charArray23);
        tag3.appendAttributeValue(charArray23);
        tag3.selfClosing = false;
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "a" + "'", str11, "a");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { 'a', ' ' });
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(" hi!=\"\"");
        java.lang.String str3 = endTag0.normalName;
        endTag0.setEmptyAttributeValue();
        endTag0.appendTagName('a');
        java.lang.String str7 = endTag0.name();
        endTag0.selfClosing = false;
        boolean boolean10 = endTag0.selfClosing;
        java.lang.String str11 = endTag0.normalName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a" + "'", str7, "a");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "a" + "'", str11, "a");
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings8 = htmlTreeBuilder7.defaultSettings();
        org.jsoup.nodes.FormElement formElement9 = null;
        htmlTreeBuilder7.setFormElement(formElement9);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState11 = htmlTreeBuilder7.state();
        org.jsoup.nodes.FormElement formElement12 = null;
        htmlTreeBuilder7.setFormElement(formElement12);
        htmlTreeBuilder7.generateImpliedEndTags();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder15 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean16 = htmlTreeBuilder15.isFragmentParsing();
        htmlTreeBuilder15.newPendingTableCharacters();
        org.jsoup.nodes.Document document18 = htmlTreeBuilder15.getDocument();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder19 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder19.defaultSettings();
        org.jsoup.nodes.Document document23 = xmlTreeBuilder19.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData25 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder19.insert((org.jsoup.parser.Token.Character) cData25);
        org.jsoup.nodes.Document document29 = xmlTreeBuilder19.parse("EndTag", "EOF");
        htmlTreeBuilder15.maybeSetBaseUri((org.jsoup.nodes.Element) document29);
        htmlTreeBuilder7.setHeadElement((org.jsoup.nodes.Element) document29);
        boolean boolean32 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document29);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder34 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings35 = htmlTreeBuilder34.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState36 = htmlTreeBuilder34.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList37 = htmlTreeBuilder34.getStack();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder38 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings39 = xmlTreeBuilder38.defaultSettings();
        org.jsoup.nodes.Document document42 = xmlTreeBuilder38.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData44 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder38.insert((org.jsoup.parser.Token.Character) cData44);
        org.jsoup.parser.Token.StartTag startTag46 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag47 = startTag46.reset();
        org.jsoup.nodes.Attributes attributes49 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes52 = attributes49.put("hi!", "");
        boolean boolean54 = attributes52.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag55 = startTag46.nameAttr("a ", attributes52);
        java.lang.String str56 = startTag46.toString();
        org.jsoup.nodes.Element element57 = xmlTreeBuilder38.insert(startTag46);
        boolean boolean58 = htmlTreeBuilder34.isSpecial(element57);
        org.jsoup.parser.Parser parser60 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList61 = htmlTreeBuilder0.parseFragment("<a  hi!=\"\">", element57, " ", parser60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertNull(htmlTreeBuilderState11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(document18);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(parseSettings35);
        org.junit.Assert.assertNull(htmlTreeBuilderState36);
        org.junit.Assert.assertNull(elementList37);
        org.junit.Assert.assertNotNull(parseSettings39);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertNotNull(attributes52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(startTag55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "<a   hi!=\"\">" + "'", str56, "<a   hi!=\"\">");
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes6 = attributes3.put("hi!", "");
        boolean boolean8 = attributes6.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag9 = startTag0.nameAttr("a ", attributes6);
        org.jsoup.parser.Token.Tag tag10 = startTag9.reset();
        java.lang.String str11 = startTag9.tagName;
        startTag9.normalName = "<![CDATA[eof]]>";
        startTag9.appendAttributeName("<![cdata[null]]>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(startTag9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        org.jsoup.parser.Token.CData cData1 = new org.jsoup.parser.Token.CData("<!---->");
        org.jsoup.parser.Token.Character character3 = cData1.data("Doctype");
        java.lang.String str4 = cData1.getData();
        java.lang.String str5 = cData1.tokenType();
        java.lang.String str6 = cData1.toString();
        org.jsoup.parser.Token.Character character8 = cData1.data("");
        org.jsoup.parser.Token.Character character10 = cData1.data("<hi!=\"\"  hi!=\"\">");
        org.jsoup.parser.Token token11 = character10.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag12 = character10.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$CData cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$CData and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(character3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Doctype" + "'", str4, "Doctype");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CData" + "'", str5, "CData");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<![CDATA[Doctype]]>" + "'", str6, "<![CDATA[Doctype]]>");
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(character10);
        org.junit.Assert.assertNotNull(token11);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        comment5.bogus = true;
        org.jsoup.parser.Token token8 = comment5.reset();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.CData cData11 = new org.jsoup.parser.Token.CData(" hi!=\"\"");
        org.jsoup.parser.Token.Character character13 = cData11.data("hi!=\"\"");
        java.lang.String str14 = cData11.toString();
        org.jsoup.parser.Token.Character character16 = cData11.data("a");
        java.lang.String str17 = cData11.tokenType();
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData11);
        org.jsoup.parser.Token.Comment comment19 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token20 = comment19.reset();
        java.lang.String str21 = comment19.toString();
        comment19.bogus = false;
        java.lang.StringBuilder stringBuilder24 = comment19.data;
        java.lang.String str25 = comment19.toString();
        xmlTreeBuilder0.insert(comment19);
        org.jsoup.parser.Token.Comment comment27 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token28 = comment27.reset();
        java.lang.String str29 = comment27.getData();
        java.lang.StringBuilder stringBuilder30 = comment27.data;
        xmlTreeBuilder0.insert(comment27);
        org.jsoup.parser.Token.Doctype doctype32 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token33 = doctype32.reset();
        java.lang.StringBuilder stringBuilder34 = doctype32.systemIdentifier;
        boolean boolean35 = doctype32.isForceQuirks();
        boolean boolean36 = doctype32.isDoctype();
        doctype32.forceQuirks = false;
        org.jsoup.parser.Token.Doctype doctype39 = doctype32.asDoctype();
        doctype32.pubSysKey = "";
        java.lang.StringBuilder stringBuilder42 = doctype32.systemIdentifier;
        boolean boolean43 = doctype32.isDoctype();
        java.lang.String str44 = doctype32.getSystemIdentifier();
        boolean boolean45 = doctype32.isCharacter();
        xmlTreeBuilder0.insert(doctype32);
        boolean boolean47 = doctype32.isDoctype();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNotNull(character13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<![CDATA[hi!=\"\"]]>" + "'", str14, "<![CDATA[hi!=\"\"]]>");
        org.junit.Assert.assertNotNull(character16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "CData" + "'", str17, "CData");
        org.junit.Assert.assertNotNull(token20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!---->" + "'", str21, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder24);
        org.junit.Assert.assertEquals(stringBuilder24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!---->" + "'", str25, "<!---->");
        org.junit.Assert.assertNotNull(token28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(stringBuilder30);
        org.junit.Assert.assertEquals(stringBuilder30.toString(), "");
        org.junit.Assert.assertNotNull(token33);
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(doctype39);
        org.junit.Assert.assertNotNull(stringBuilder42);
        org.junit.Assert.assertEquals(stringBuilder42.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        boolean boolean1 = eOF0.isStartTag();
        java.lang.String str2 = eOF0.tokenType();
        org.jsoup.parser.Token token3 = eOF0.reset();
        org.jsoup.parser.Token token4 = eOF0.reset();
        org.jsoup.parser.Token token5 = eOF0.reset();
        org.jsoup.parser.Token token6 = eOF0.reset();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(token6);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        org.jsoup.parser.Token.CData cData1 = new org.jsoup.parser.Token.CData("hi!=\"\"");
        org.jsoup.parser.Token token2 = cData1.reset();
        org.junit.Assert.assertNotNull(token2);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(" hi!=\"\"");
        java.lang.String str3 = endTag0.normalName;
        endTag0.setEmptyAttributeValue();
        endTag0.appendTagName('a');
        java.lang.String str7 = endTag0.name();
        endTag0.setEmptyAttributeValue();
        boolean boolean9 = endTag0.isDoctype();
        endTag0.tagName = "EOF";
        endTag0.appendAttributeName(' ');
        org.jsoup.parser.Token.Tag tag15 = endTag0.name(" hi!=\"\"");
        boolean boolean16 = tag15.isSelfClosing();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a" + "'", str7, "a");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        boolean boolean2 = comment0.bogus;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.String str4 = comment0.toString();
        boolean boolean5 = comment0.isCData();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement8 = null;
        htmlTreeBuilder7.setFormElement(formElement8);
        java.lang.String str10 = htmlTreeBuilder7.getBaseUri();
        org.jsoup.nodes.Element element11 = null;
        htmlTreeBuilder7.setHeadElement(element11);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder13 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings14 = htmlTreeBuilder13.defaultSettings();
        org.jsoup.nodes.FormElement formElement15 = null;
        htmlTreeBuilder13.setFormElement(formElement15);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState17 = htmlTreeBuilder13.state();
        java.util.List<java.lang.String> strList18 = htmlTreeBuilder13.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState19 = htmlTreeBuilder13.state();
        htmlTreeBuilder13.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState22 = htmlTreeBuilder13.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder23 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean24 = htmlTreeBuilder23.isFragmentParsing();
        htmlTreeBuilder23.newPendingTableCharacters();
        htmlTreeBuilder23.framesetOk(false);
        htmlTreeBuilder23.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder29 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder29.setFosterInserts(false);
        org.jsoup.nodes.Document document32 = htmlTreeBuilder29.getDocument();
        org.jsoup.nodes.FormElement formElement33 = htmlTreeBuilder29.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings35 = xmlTreeBuilder34.defaultSettings();
        org.jsoup.nodes.Document document38 = xmlTreeBuilder34.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder29.maybeSetBaseUri((org.jsoup.nodes.Element) document38);
        htmlTreeBuilder23.maybeSetBaseUri((org.jsoup.nodes.Element) document38);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder41 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean42 = htmlTreeBuilder41.isFragmentParsing();
        htmlTreeBuilder41.newPendingTableCharacters();
        htmlTreeBuilder41.framesetOk(false);
        htmlTreeBuilder41.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder47 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder47.setFosterInserts(false);
        org.jsoup.nodes.Document document50 = htmlTreeBuilder47.getDocument();
        org.jsoup.nodes.FormElement formElement51 = htmlTreeBuilder47.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder52 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings53 = xmlTreeBuilder52.defaultSettings();
        org.jsoup.nodes.Document document56 = xmlTreeBuilder52.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder47.maybeSetBaseUri((org.jsoup.nodes.Element) document56);
        htmlTreeBuilder41.maybeSetBaseUri((org.jsoup.nodes.Element) document56);
        boolean boolean59 = htmlTreeBuilder23.isSpecial((org.jsoup.nodes.Element) document56);
        htmlTreeBuilder13.setHeadElement((org.jsoup.nodes.Element) document56);
        htmlTreeBuilder7.maybeSetBaseUri((org.jsoup.nodes.Element) document56);
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document56);
        org.jsoup.nodes.FormElement formElement63 = null;
        htmlTreeBuilder0.setFormElement(formElement63);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNull(htmlTreeBuilderState17);
        org.junit.Assert.assertNull(strList18);
        org.junit.Assert.assertNull(htmlTreeBuilderState19);
        org.junit.Assert.assertNull(htmlTreeBuilderState22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(document32);
        org.junit.Assert.assertNull(formElement33);
        org.junit.Assert.assertNotNull(parseSettings35);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(document50);
        org.junit.Assert.assertNull(formElement51);
        org.junit.Assert.assertNotNull(parseSettings53);
        org.junit.Assert.assertNotNull(document56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(" hi!=\"\"");
        java.lang.String str3 = endTag0.normalName;
        endTag0.setEmptyAttributeValue();
        endTag0.appendTagName('a');
        char[] charArray12 = new char[] { ' ', ' ', '#', ' ', 'a' };
        endTag0.appendAttributeValue(charArray12);
        java.lang.String str14 = endTag0.name();
        endTag0.appendAttributeValue(' ');
        endTag0.finaliseTag();
        endTag0.newAttribute();
        java.lang.String str19 = endTag0.normalName;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ', '#', ' ', 'a' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "a" + "'", str14, "a");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "a" + "'", str19, "a");
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        org.jsoup.parser.ParseSettings parseSettings2 = new org.jsoup.parser.ParseSettings(true, true);
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes6 = attributes3.put("hi!", "");
        org.jsoup.nodes.Attributes attributes9 = attributes6.put(" hi!=\"\"", false);
        boolean boolean11 = attributes9.hasKeyIgnoreCase("Doctype");
        int int12 = attributes9.size();
        org.jsoup.nodes.Attributes attributes13 = parseSettings2.normalizeAttributes(attributes9);
        org.jsoup.parser.Token.EndTag endTag14 = new org.jsoup.parser.Token.EndTag();
        endTag14.appendAttributeValue(" hi!=\"\"");
        org.jsoup.parser.Token.Tag tag18 = endTag14.name("a ");
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes22 = attributes19.put("hi!", "");
        org.jsoup.nodes.Attributes attributes25 = attributes22.put(" hi!=\"\"", false);
        int int26 = attributes22.size();
        endTag14.attributes = attributes22;
        attributes22.normalize();
        org.jsoup.nodes.Attributes attributes31 = attributes22.put("<![CDATA[hi!=\"\"]]>", "<![CDATA[Doctype]]>");
        boolean boolean33 = attributes22.hasKey(" a");
        org.jsoup.nodes.Attributes attributes34 = parseSettings2.normalizeAttributes(attributes22);
        boolean boolean35 = parseSettings2.preserveTagCase();
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        java.lang.String str2 = startTag0.normalName();
        boolean boolean3 = startTag0.isSelfClosing();
        boolean boolean4 = startTag0.selfClosing;
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData6 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData6);
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes12 = attributes9.put("hi!", "");
        org.jsoup.nodes.Attributes attributes15 = attributes12.put(" hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes12.iterator();
        boolean boolean17 = xmlTreeBuilder0.processStartTag("EOF", attributes12);
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes23 = attributes20.put("a", true);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor24 = attributes23.iterator();
        boolean boolean25 = xmlTreeBuilder0.processStartTag("</<a   hi!=\"\">>", attributes23);
        org.jsoup.parser.Token.Doctype doctype26 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token27 = doctype26.reset();
        java.lang.StringBuilder stringBuilder28 = doctype26.systemIdentifier;
        boolean boolean29 = doctype26.isForceQuirks();
        java.lang.String str30 = doctype26.getSystemIdentifier();
        boolean boolean31 = doctype26.isStartTag();
        xmlTreeBuilder0.insert(doctype26);
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag();
        startTag33.finaliseTag();
        java.lang.String str35 = startTag33.normalName();
        org.jsoup.nodes.Attributes attributes36 = startTag33.getAttributes();
        org.jsoup.nodes.Attributes attributes38 = new org.jsoup.nodes.Attributes();
        attributes38.normalize();
        org.jsoup.nodes.Attributes attributes40 = attributes38.clone();
        org.jsoup.nodes.Attributes attributes43 = attributes40.put("hi!", "Doctype");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator44 = attributes43.spliterator();
        org.jsoup.parser.Token.StartTag startTag45 = startTag33.nameAttr("", attributes43);
        org.jsoup.parser.ParseSettings parseSettings47 = org.jsoup.parser.ParseSettings.htmlDefault;
        java.lang.String str49 = parseSettings47.normalizeAttribute("hi!");
        org.jsoup.nodes.Attributes attributes50 = new org.jsoup.nodes.Attributes();
        attributes50.normalize();
        org.jsoup.nodes.Attributes attributes52 = attributes50.clone();
        org.jsoup.nodes.Attributes attributes53 = parseSettings47.normalizeAttributes(attributes52);
        attributes52.remove("hi!");
        org.jsoup.parser.Token.StartTag startTag56 = startTag45.nameAttr("Doctype", attributes52);
        boolean boolean57 = startTag56.isCharacter();
        startTag56.finaliseTag();
        boolean boolean59 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag56);
        org.jsoup.nodes.Attributes attributes61 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes64 = attributes61.put("hi!", "");
        org.jsoup.nodes.Attributes attributes67 = attributes64.put("", "hi!");
        org.jsoup.parser.Token.StartTag startTag68 = startTag56.nameAttr("</a >", attributes64);
        attributes64.remove("<![CDATA[eof]]>");
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(attributeItor24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(token27);
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(attributes40);
        org.junit.Assert.assertNotNull(attributes43);
        org.junit.Assert.assertNotNull(attributeSpliterator44);
        org.junit.Assert.assertNotNull(startTag45);
        org.junit.Assert.assertNotNull(parseSettings47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(attributes52);
        org.junit.Assert.assertNotNull(attributes53);
        org.junit.Assert.assertNotNull(startTag56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(attributes64);
        org.junit.Assert.assertNotNull(attributes67);
        org.junit.Assert.assertNotNull(startTag68);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData6 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData6);
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes12 = attributes9.put("hi!", "");
        org.jsoup.nodes.Attributes attributes15 = attributes12.put(" hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes12.iterator();
        boolean boolean17 = xmlTreeBuilder0.processStartTag("EOF", attributes12);
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.CData cData20 = new org.jsoup.parser.Token.CData("<!---->");
        java.lang.String str21 = cData20.getData();
        org.jsoup.parser.Token.Character character23 = cData20.data("<![CDATA[hi!=\"\"]]>");
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData20);
        org.jsoup.parser.Token.CData cData26 = new org.jsoup.parser.Token.CData("<!---->");
        org.jsoup.parser.Token.Character character28 = cData26.data("Doctype");
        java.lang.String str29 = cData26.getData();
        java.lang.String str30 = cData26.getData();
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData26);
        org.jsoup.nodes.Document document34 = xmlTreeBuilder0.parse("hi!=\"hi!=&quot;&quot;\" a =\"hi!=&quot;&quot;\"", " =\"</a>\"");
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag36 = startTag35.reset();
        org.jsoup.nodes.Attributes attributes38 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes41 = attributes38.put("hi!", "");
        boolean boolean43 = attributes41.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag44 = startTag35.nameAttr("a ", attributes41);
        java.lang.String str45 = startTag35.normalName();
        java.lang.String str46 = startTag35.toString();
        org.jsoup.nodes.Element element47 = xmlTreeBuilder0.insert(startTag35);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder48 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings49 = xmlTreeBuilder48.defaultSettings();
        org.jsoup.nodes.Document document52 = xmlTreeBuilder48.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.Comment comment53 = new org.jsoup.parser.Token.Comment();
        comment53.bogus = true;
        org.jsoup.parser.Token token56 = comment53.reset();
        xmlTreeBuilder48.insert(comment53);
        org.jsoup.parser.Token.CData cData59 = new org.jsoup.parser.Token.CData(" hi!=\"\"");
        org.jsoup.parser.Token.Character character61 = cData59.data("hi!=\"\"");
        java.lang.String str62 = cData59.toString();
        org.jsoup.parser.Token.Character character64 = cData59.data("a");
        java.lang.String str65 = cData59.tokenType();
        xmlTreeBuilder48.insert((org.jsoup.parser.Token.Character) cData59);
        org.jsoup.parser.Token.Character character67 = cData59.asCharacter();
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData59);
        java.lang.String str69 = cData59.getData();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!---->" + "'", str21, "<!---->");
        org.junit.Assert.assertNotNull(character23);
        org.junit.Assert.assertNotNull(character28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Doctype" + "'", str29, "Doctype");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Doctype" + "'", str30, "Doctype");
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(startTag44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "a " + "'", str45, "a ");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "<a   hi!=\"\">" + "'", str46, "<a   hi!=\"\">");
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertNotNull(token56);
        org.junit.Assert.assertNotNull(character61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "<![CDATA[hi!=\"\"]]>" + "'", str62, "<![CDATA[hi!=\"\"]]>");
        org.junit.Assert.assertNotNull(character64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "CData" + "'", str65, "CData");
        org.junit.Assert.assertNotNull(character67);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "a" + "'", str69, "a");
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.getStack();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder5.setFosterInserts(false);
        boolean boolean8 = htmlTreeBuilder5.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder5.defaultSettings();
        org.jsoup.nodes.Element element10 = null;
        htmlTreeBuilder5.setHeadElement(element10);
        boolean boolean12 = htmlTreeBuilder5.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder13 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings14 = htmlTreeBuilder13.defaultSettings();
        org.jsoup.nodes.FormElement formElement15 = null;
        htmlTreeBuilder13.setFormElement(formElement15);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState17 = htmlTreeBuilder13.state();
        java.util.List<java.lang.String> strList18 = htmlTreeBuilder13.getPendingTableCharacters();
        boolean boolean19 = htmlTreeBuilder13.isFragmentParsing();
        java.util.List<java.lang.String> strList20 = htmlTreeBuilder13.getPendingTableCharacters();
        htmlTreeBuilder13.framesetOk(true);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder23 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings24 = xmlTreeBuilder23.defaultSettings();
        org.jsoup.nodes.Document document27 = xmlTreeBuilder23.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData29 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder23.insert((org.jsoup.parser.Token.Character) cData29);
        org.jsoup.nodes.Document document33 = xmlTreeBuilder23.parse("<a   hi!=\"\">", "<![CDATA[null]]>");
        htmlTreeBuilder13.setHeadElement((org.jsoup.nodes.Element) document33);
        boolean boolean35 = htmlTreeBuilder5.isSpecial((org.jsoup.nodes.Element) document33);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.push((org.jsoup.nodes.Element) document33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNull(elementList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parseSettings9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNull(htmlTreeBuilderState17);
        org.junit.Assert.assertNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(strList20);
        org.junit.Assert.assertNotNull(parseSettings24);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState7);
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element10 = htmlTreeBuilder0.getHeadElement();
        boolean boolean11 = htmlTreeBuilder0.isFosterInserts();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableRowContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(parseSettings9);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(" hi!=\"\"");
        java.lang.String str3 = endTag0.normalName;
        endTag0.setEmptyAttributeValue();
        endTag0.appendTagName('a');
        char[] charArray12 = new char[] { ' ', ' ', '#', ' ', 'a' };
        endTag0.appendAttributeValue(charArray12);
        java.lang.String str14 = endTag0.name();
        endTag0.appendAttributeValue(' ');
        endTag0.newAttribute();
        org.jsoup.parser.Token.Tag tag19 = endTag0.name("<a   hi!=\"\">");
        org.jsoup.parser.Token.TokenType tokenType20 = tag19.type;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ', '#', ' ', 'a' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "a" + "'", str14, "a");
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.setEmptyAttributeValue();
        endTag0.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes7 = attributes4.put("hi!", "");
        attributes4.removeIgnoreCase("Doctype");
        endTag0.attributes = attributes4;
        java.lang.String str12 = attributes4.get(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        attributes13.normalize();
        org.jsoup.nodes.Attributes attributes15 = attributes13.clone();
        boolean boolean17 = attributes13.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes21 = attributes18.put("hi!", "");
        attributes13.addAll(attributes18);
        attributes4.addAll(attributes18);
        java.lang.String str25 = attributes4.get("<!---->");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator26 = attributes4.spliterator();
        java.lang.String str27 = attributes4.toString();
        org.jsoup.nodes.Attributes attributes28 = new org.jsoup.nodes.Attributes();
        attributes28.normalize();
        org.jsoup.nodes.Attributes attributes30 = attributes28.clone();
        boolean boolean32 = attributes28.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes33 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes36 = attributes33.put("hi!", "");
        attributes28.addAll(attributes33);
        org.jsoup.nodes.Attributes attributes40 = attributes33.put("hi!", true);
        java.lang.String str42 = attributes33.get("hi!=\"\"");
        attributes4.addAll(attributes33);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(attributeSpliterator26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + " hi!=\"\"" + "'", str27, " hi!=\"\"");
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(attributes40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.setFosterInserts(false);
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.nodes.FormElement formElement11 = htmlTreeBuilder0.getFormElement();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings14 = xmlTreeBuilder13.defaultSettings();
        org.jsoup.nodes.Document document17 = xmlTreeBuilder13.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.Comment comment18 = new org.jsoup.parser.Token.Comment();
        boolean boolean19 = comment18.bogus;
        org.jsoup.parser.Token token20 = comment18.reset();
        boolean boolean21 = comment18.isEndTag();
        xmlTreeBuilder13.insert(comment18);
        org.jsoup.parser.Token.Comment comment23 = new org.jsoup.parser.Token.Comment();
        boolean boolean24 = comment23.bogus;
        java.lang.String str25 = comment23.getData();
        org.jsoup.parser.Token.Comment comment26 = comment23.asComment();
        xmlTreeBuilder13.insert(comment23);
        org.jsoup.nodes.Document document30 = xmlTreeBuilder13.parse("hi!=\"\"", " hi!=\"\"");
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.push((org.jsoup.nodes.Element) document30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
        org.junit.Assert.assertNull(formElement11);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(token20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(comment26);
        org.junit.Assert.assertNotNull(document30);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder5.defaultSettings();
        org.jsoup.nodes.FormElement formElement7 = null;
        htmlTreeBuilder5.setFormElement(formElement7);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = htmlTreeBuilder5.state();
        org.jsoup.nodes.Element element10 = null;
        htmlTreeBuilder5.setHeadElement(element10);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = htmlTreeBuilder5.originalState();
        htmlTreeBuilder5.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder15 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = htmlTreeBuilder15.defaultSettings();
        org.jsoup.nodes.FormElement formElement17 = null;
        htmlTreeBuilder15.setFormElement(formElement17);
        htmlTreeBuilder15.setFosterInserts(true);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder21 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings22 = xmlTreeBuilder21.defaultSettings();
        org.jsoup.nodes.Document document25 = xmlTreeBuilder21.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData27 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder21.insert((org.jsoup.parser.Token.Character) cData27);
        org.jsoup.nodes.Attributes attributes30 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes33 = attributes30.put("hi!", "");
        org.jsoup.nodes.Attributes attributes36 = attributes33.put(" hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor37 = attributes33.iterator();
        boolean boolean38 = xmlTreeBuilder21.processStartTag("EOF", attributes33);
        org.jsoup.parser.Token.EndTag endTag40 = new org.jsoup.parser.Token.EndTag();
        endTag40.appendAttributeValue(" hi!=\"\"");
        java.lang.String str43 = endTag40.normalName;
        endTag40.setEmptyAttributeValue();
        endTag40.appendTagName('a');
        endTag40.newAttribute();
        org.jsoup.nodes.Attributes attributes48 = endTag40.attributes;
        org.jsoup.parser.Token.Tag tag49 = endTag40.reset();
        org.jsoup.parser.Token.EndTag endTag50 = new org.jsoup.parser.Token.EndTag();
        endTag50.setEmptyAttributeValue();
        endTag50.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes54 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes57 = attributes54.put("hi!", "");
        attributes54.removeIgnoreCase("Doctype");
        endTag50.attributes = attributes54;
        java.lang.String str62 = attributes54.get(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes63 = new org.jsoup.nodes.Attributes();
        attributes63.normalize();
        org.jsoup.nodes.Attributes attributes65 = attributes63.clone();
        boolean boolean67 = attributes63.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes68 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes71 = attributes68.put("hi!", "");
        attributes63.addAll(attributes68);
        attributes54.addAll(attributes68);
        tag49.attributes = attributes54;
        boolean boolean75 = xmlTreeBuilder21.processStartTag("Doctype", attributes54);
        org.jsoup.parser.ParseSettings parseSettings76 = xmlTreeBuilder21.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings77 = xmlTreeBuilder21.defaultSettings();
        org.jsoup.parser.Token.Comment comment78 = new org.jsoup.parser.Token.Comment();
        java.lang.String str79 = comment78.getData();
        java.lang.String str80 = comment78.getData();
        java.lang.StringBuilder stringBuilder81 = comment78.data;
        xmlTreeBuilder21.insert(comment78);
        org.jsoup.parser.Token.StartTag startTag83 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes84 = startTag83.getAttributes();
        org.jsoup.nodes.Attributes attributes86 = new org.jsoup.nodes.Attributes();
        java.lang.String str87 = attributes86.toString();
        org.jsoup.parser.Token.StartTag startTag88 = startTag83.nameAttr("EOF", attributes86);
        org.jsoup.nodes.Element element89 = xmlTreeBuilder21.insert(startTag88);
        htmlTreeBuilder15.setHeadElement(element89);
        boolean boolean91 = htmlTreeBuilder5.isSpecial(element89);
        boolean boolean92 = htmlTreeBuilder0.isSpecial(element89);
        org.jsoup.nodes.FormElement formElement93 = null;
        htmlTreeBuilder0.setFormElement(formElement93);
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNull(strList4);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(htmlTreeBuilderState9);
        org.junit.Assert.assertNull(htmlTreeBuilderState12);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(attributeItor37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(attributes48);
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertNotNull(attributes57);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(attributes65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(attributes71);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(parseSettings76);
        org.junit.Assert.assertNotNull(parseSettings77);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(stringBuilder81);
        org.junit.Assert.assertEquals(stringBuilder81.toString(), "");
        org.junit.Assert.assertNotNull(attributes84);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertNotNull(startTag88);
        org.junit.Assert.assertNotNull(element89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(" hi!=\"\"");
        java.lang.String str3 = endTag0.normalName;
        endTag0.setEmptyAttributeValue();
        endTag0.appendTagName('a');
        java.lang.String str7 = endTag0.name();
        java.lang.String str8 = endTag0.normalName;
        endTag0.appendAttributeName(' ');
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag12 = startTag11.reset();
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes17 = attributes14.put("hi!", "");
        boolean boolean19 = attributes17.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag20 = startTag11.nameAttr("a ", attributes17);
        org.jsoup.nodes.Attributes attributes22 = new org.jsoup.nodes.Attributes();
        attributes22.normalize();
        org.jsoup.nodes.Attributes attributes24 = attributes22.clone();
        boolean boolean26 = attributes22.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes27 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes30 = attributes27.put("hi!", "");
        attributes22.addAll(attributes27);
        org.jsoup.nodes.Attributes attributes32 = new org.jsoup.nodes.Attributes();
        attributes32.normalize();
        org.jsoup.nodes.Attributes attributes34 = attributes32.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList35 = attributes34.asList();
        attributes22.addAll(attributes34);
        org.jsoup.parser.Token.StartTag startTag37 = startTag20.nameAttr("a", attributes22);
        org.jsoup.nodes.Attributes attributes40 = attributes22.put("<![CDATA[null]]>", true);
        org.jsoup.nodes.Attributes attributes41 = attributes40.clone();
        org.jsoup.nodes.Attributes attributes44 = attributes40.put("<![CDATA[a  hi!=\"\"]]>", true);
        endTag0.attributes = attributes44;
        boolean boolean46 = endTag0.isCData();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a" + "'", str7, "a");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "a" + "'", str8, "a");
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(startTag20);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertNotNull(attributeList35);
        org.junit.Assert.assertNotNull(startTag37);
        org.junit.Assert.assertNotNull(attributes40);
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        org.jsoup.parser.ParseSettings parseSettings0 = org.jsoup.parser.ParseSettings.htmlDefault;
        java.lang.String str2 = parseSettings0.normalizeAttribute("hi!");
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        attributes3.normalize();
        org.jsoup.nodes.Attributes attributes5 = attributes3.clone();
        org.jsoup.nodes.Attributes attributes6 = parseSettings0.normalizeAttributes(attributes5);
        boolean boolean8 = attributes6.hasKey("<![CDATA[</<a   hi!=\"\">>]]>");
        org.junit.Assert.assertNotNull(parseSettings0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(" hi!=\"\"");
        java.lang.String str3 = endTag0.normalName;
        endTag0.setEmptyAttributeValue();
        endTag0.appendTagName('a');
        org.jsoup.parser.Token.EndTag endTag7 = new org.jsoup.parser.Token.EndTag();
        endTag7.setEmptyAttributeValue();
        endTag7.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes14 = attributes11.put("hi!", "");
        attributes11.removeIgnoreCase("Doctype");
        endTag7.attributes = attributes11;
        java.lang.String str19 = attributes11.get(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        attributes20.normalize();
        org.jsoup.nodes.Attributes attributes22 = attributes20.clone();
        boolean boolean24 = attributes20.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes25 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes28 = attributes25.put("hi!", "");
        attributes20.addAll(attributes25);
        attributes11.addAll(attributes25);
        org.jsoup.nodes.Attributes attributes33 = attributes25.put("hi!=\"\"", "");
        endTag0.attributes = attributes25;
        endTag0.tagName = "";
        boolean boolean37 = endTag0.selfClosing;
        endTag0.tagName = "</hi!a>";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        boolean boolean7 = htmlTreeBuilder0.isFosterInserts();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean10 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.Token.Comment comment11 = new org.jsoup.parser.Token.Comment();
        java.lang.String str12 = comment11.getData();
        java.lang.String str13 = comment11.getData();
        java.lang.String str14 = comment11.toString();
        boolean boolean15 = comment11.bogus;
        java.lang.String str16 = comment11.toString();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(comment11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!---->" + "'", str14, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!---->" + "'", str16, "<!---->");
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        startTag0.normalName = "hi!";
        startTag0.appendAttributeValue('a');
        org.jsoup.nodes.Attributes attributes6 = startTag0.attributes;
        java.lang.String str8 = attributes6.getIgnoreCase("EndTag");
        org.jsoup.nodes.Attributes attributes11 = attributes6.put(" a", true);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.nodes.FormElement formElement6 = null;
        htmlTreeBuilder0.setFormElement(formElement6);
        org.jsoup.nodes.FormElement formElement8 = htmlTreeBuilder0.getFormElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Document document11 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder12 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder12.setFosterInserts(false);
        org.jsoup.nodes.Document document15 = htmlTreeBuilder12.getDocument();
        boolean boolean16 = htmlTreeBuilder12.isFragmentParsing();
        htmlTreeBuilder12.generateImpliedEndTags();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder18 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings19 = xmlTreeBuilder18.defaultSettings();
        org.jsoup.nodes.Document document22 = xmlTreeBuilder18.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData24 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder18.insert((org.jsoup.parser.Token.Character) cData24);
        org.jsoup.parser.Token.Comment comment26 = new org.jsoup.parser.Token.Comment();
        comment26.bogus = true;
        java.lang.String str29 = comment26.toString();
        xmlTreeBuilder18.insert(comment26);
        org.jsoup.parser.Token.Doctype doctype31 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token32 = doctype31.reset();
        java.lang.StringBuilder stringBuilder33 = doctype31.systemIdentifier;
        boolean boolean34 = doctype31.isForceQuirks();
        boolean boolean35 = doctype31.isDoctype();
        doctype31.forceQuirks = false;
        org.jsoup.parser.Token.Doctype doctype38 = doctype31.asDoctype();
        doctype31.pubSysKey = "";
        boolean boolean41 = xmlTreeBuilder18.process((org.jsoup.parser.Token) doctype31);
        org.jsoup.nodes.Document document44 = xmlTreeBuilder18.parse(" hi! eof", "<![CDATA[ a]]>");
        htmlTreeBuilder12.setHeadElement((org.jsoup.nodes.Element) document44);
        boolean boolean46 = htmlTreeBuilder12.isFosterInserts();
        org.jsoup.nodes.Element element47 = htmlTreeBuilder12.getHeadElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder48 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings49 = xmlTreeBuilder48.defaultSettings();
        org.jsoup.nodes.Document document52 = xmlTreeBuilder48.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData54 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder48.insert((org.jsoup.parser.Token.Character) cData54);
        org.jsoup.nodes.Attributes attributes57 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes60 = attributes57.put("hi!", "");
        org.jsoup.nodes.Attributes attributes63 = attributes60.put(" hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor64 = attributes60.iterator();
        boolean boolean65 = xmlTreeBuilder48.processStartTag("EOF", attributes60);
        org.jsoup.parser.ParseSettings parseSettings66 = xmlTreeBuilder48.defaultSettings();
        org.jsoup.parser.Token.CData cData68 = new org.jsoup.parser.Token.CData("<!---->");
        java.lang.String str69 = cData68.getData();
        org.jsoup.parser.Token.Character character71 = cData68.data("<![CDATA[hi!=\"\"]]>");
        xmlTreeBuilder48.insert((org.jsoup.parser.Token.Character) cData68);
        org.jsoup.parser.Token.CData cData74 = new org.jsoup.parser.Token.CData("<!---->");
        org.jsoup.parser.Token.Character character76 = cData74.data("Doctype");
        java.lang.String str77 = cData74.getData();
        java.lang.String str78 = cData74.getData();
        xmlTreeBuilder48.insert((org.jsoup.parser.Token.Character) cData74);
        org.jsoup.nodes.Document document82 = xmlTreeBuilder48.parse("hi!=\"hi!=&quot;&quot;\" a =\"hi!=&quot;&quot;\"", " =\"</a>\"");
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertOnStackAfter(element47, (org.jsoup.nodes.Element) document82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(formElement4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(formElement8);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNull(document15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!---->" + "'", str29, "<!---->");
        org.junit.Assert.assertNotNull(token32);
        org.junit.Assert.assertNotNull(stringBuilder33);
        org.junit.Assert.assertEquals(stringBuilder33.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(doctype38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertNotNull(attributes60);
        org.junit.Assert.assertNotNull(attributes63);
        org.junit.Assert.assertNotNull(attributeItor64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(parseSettings66);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "<!---->" + "'", str69, "<!---->");
        org.junit.Assert.assertNotNull(character71);
        org.junit.Assert.assertNotNull(character76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Doctype" + "'", str77, "Doctype");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Doctype" + "'", str78, "Doctype");
        org.junit.Assert.assertNotNull(document82);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token1 = comment0.reset();
        org.jsoup.parser.Token token2 = comment0.reset();
        comment0.bogus = false;
        boolean boolean5 = comment0.isEOF();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(false);
        htmlTreeBuilder0.newPendingTableCharacters();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState7);
        htmlTreeBuilder0.newPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = htmlTreeBuilder0.removeLastFormattingElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.forceQuirks;
        java.lang.String str5 = doctype0.pubSysKey;
        doctype0.pubSysKey = "aeof";
        doctype0.pubSysKey = "hi!=\"hi!=&quot;&quot;\" a =\"hi!=&quot;&quot;\"";
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.parser.ParseSettings parseSettings7 = htmlTreeBuilder0.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = htmlTreeBuilder0.insertStartTag(" hi!=\"Doctype\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings4);
        org.junit.Assert.assertNotNull(parseSettings7);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue("hi!");
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes6 = attributes3.put("hi!", "");
        attributes3.removeIgnoreCase("Doctype");
        endTag0.attributes = attributes3;
        endTag0.appendAttributeName('a');
        org.jsoup.parser.Token.EndTag endTag12 = new org.jsoup.parser.Token.EndTag();
        endTag12.appendAttributeValue("hi!");
        boolean boolean15 = endTag12.isEndTag();
        org.jsoup.parser.Token.EndTag endTag16 = new org.jsoup.parser.Token.EndTag();
        endTag16.appendAttributeValue(" hi!=\"\"");
        java.lang.String str19 = endTag16.normalName;
        endTag16.setEmptyAttributeValue();
        endTag16.appendTagName('a');
        char[] charArray28 = new char[] { ' ', ' ', '#', ' ', 'a' };
        endTag16.appendAttributeValue(charArray28);
        endTag12.appendAttributeValue(charArray28);
        endTag0.appendAttributeValue(charArray28);
        endTag0.selfClosing = false;
        endTag0.newAttribute();
        java.lang.String str35 = endTag0.normalName;
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { ' ', ' ', '#', ' ', 'a' });
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(" hi!=\"\"");
        java.lang.String str3 = endTag0.normalName;
        endTag0.setEmptyAttributeValue();
        endTag0.appendTagName('a');
        char[] charArray12 = new char[] { ' ', ' ', '#', ' ', 'a' };
        endTag0.appendAttributeValue(charArray12);
        java.lang.String str14 = endTag0.name();
        endTag0.appendAttributeValue(' ');
        endTag0.newAttribute();
        org.jsoup.parser.Token.Tag tag19 = endTag0.name("<a   hi!=\"\">");
        endTag0.appendAttributeValue('#');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ', '#', ' ', 'a' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "a" + "'", str14, "a");
        org.junit.Assert.assertNotNull(tag19);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        org.jsoup.parser.Token.CData cData1 = new org.jsoup.parser.Token.CData("<!---->");
        java.lang.String str2 = cData1.getData();
        org.jsoup.parser.Token.Character character4 = cData1.data("<![CDATA[hi!=\"\"]]>");
        org.jsoup.parser.Token.Character character5 = cData1.asCharacter();
        org.jsoup.parser.Token.Character character7 = character5.data("</aEOF>");
        org.jsoup.parser.Token.Character character9 = character5.data(" ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertNotNull(character5);
        org.junit.Assert.assertNotNull(character7);
        org.junit.Assert.assertNotNull(character9);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.lang.String str8 = parseSettings6.normalizeTag(" =\"</a>\"");
        boolean boolean9 = parseSettings6.preserveTagCase();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder10.defaultSettings();
        org.jsoup.nodes.Document document14 = xmlTreeBuilder10.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData16 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder10.insert((org.jsoup.parser.Token.Character) cData16);
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes22 = attributes19.put("hi!", "");
        org.jsoup.nodes.Attributes attributes25 = attributes22.put(" hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor26 = attributes22.iterator();
        boolean boolean27 = xmlTreeBuilder10.processStartTag("EOF", attributes22);
        java.util.List<org.jsoup.nodes.Attribute> attributeList28 = attributes22.asList();
        java.lang.String str29 = attributes22.html();
        org.jsoup.nodes.Attributes attributes30 = parseSettings6.normalizeAttributes(attributes22);
        org.jsoup.nodes.Attributes attributes33 = attributes22.put("hi!", true);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState5);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "=\"</a>\"" + "'", str8, "=\"</a>\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(attributeItor26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(attributeList28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + " hi!=\"\"" + "'", str29, " hi!=\"\"");
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(attributes33);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        boolean boolean6 = htmlTreeBuilder0.isFragmentParsing();
        java.util.List<java.lang.String> strList7 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.parser.ParseSettings parseSettings10 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.markInsertionMode();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearFormattingElementsToLastMarker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNotNull(parseSettings10);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(" hi!=\"\"");
        org.jsoup.parser.Token.Tag tag4 = endTag0.name("a ");
        java.lang.String str5 = endTag0.tagName;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character6 = endTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a " + "'", str5, "a ");
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData6 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData6);
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag9 = startTag8.reset();
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes14 = attributes11.put("hi!", "");
        boolean boolean16 = attributes14.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag17 = startTag8.nameAttr("a ", attributes14);
        java.lang.String str18 = startTag8.toString();
        org.jsoup.nodes.Element element19 = xmlTreeBuilder0.insert(startTag8);
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings21 = xmlTreeBuilder0.defaultSettings();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<a   hi!=\"\">" + "'", str18, "<a   hi!=\"\">");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(parseSettings21);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        org.jsoup.nodes.Attributes attributes2 = attributes0.clone();
        boolean boolean4 = attributes0.equals((java.lang.Object) (short) -1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList5 = attributes0.asList();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = attributes0.dataset();
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeList5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        org.jsoup.nodes.Attributes attributes2 = attributes0.clone();
        attributes0.remove("Doctype");
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        attributes5.normalize();
        org.jsoup.nodes.Attributes attributes7 = attributes5.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList8 = attributes7.asList();
        boolean boolean9 = attributes0.equals((java.lang.Object) attributes7);
        attributes7.removeIgnoreCase("a");
        java.lang.String str13 = attributes7.getIgnoreCase("EOF");
        java.lang.String str15 = attributes7.get("</aEOF>");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = attributes7.dataset();
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributeList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.nodes.FormElement formElement6 = null;
        htmlTreeBuilder0.setFormElement(formElement6);
        org.jsoup.nodes.Document document8 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = htmlTreeBuilder0.originalState();
        boolean boolean10 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.FormElement formElement11 = null;
        htmlTreeBuilder0.setFormElement(formElement11);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(formElement4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNull(htmlTreeBuilderState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        boolean boolean2 = comment0.bogus;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.String str4 = comment0.toString();
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag6 = startTag5.reset();
        startTag5.normalName = "hi!";
        startTag5.appendAttributeValue('a');
        org.jsoup.parser.Token.TokenType tokenType11 = startTag5.type;
        comment0.type = tokenType11;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.nodes.FormElement formElement6 = null;
        htmlTreeBuilder0.setFormElement(formElement6);
        org.jsoup.nodes.FormElement formElement8 = htmlTreeBuilder0.getFormElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Document document11 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = htmlTreeBuilder0.state();
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(formElement4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(formElement8);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNull(htmlTreeBuilderState12);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document7 = htmlTreeBuilder0.getDocument();
        java.io.Reader reader8 = null;
        org.jsoup.parser.Parser parser10 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.initialiseParse(reader8, "", parser10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState5);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData6 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData6);
        org.jsoup.nodes.Document document10 = xmlTreeBuilder0.parse("<a   hi!=\"\">", "<![CDATA[null]]>");
        org.jsoup.parser.Token.Doctype doctype11 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token12 = doctype11.reset();
        java.lang.StringBuilder stringBuilder13 = doctype11.systemIdentifier;
        boolean boolean14 = doctype11.isForceQuirks();
        boolean boolean15 = doctype11.forceQuirks;
        org.jsoup.parser.Token token16 = doctype11.reset();
        java.lang.String str17 = doctype11.tokenType();
        boolean boolean18 = doctype11.isForceQuirks();
        boolean boolean19 = doctype11.isCData();
        xmlTreeBuilder0.insert(doctype11);
        org.jsoup.parser.Token.CData cData22 = new org.jsoup.parser.Token.CData("<!---->");
        org.jsoup.parser.Token.Character character24 = cData22.data("Doctype");
        java.lang.String str25 = cData22.toString();
        java.lang.String str26 = cData22.toString();
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData22);
        org.jsoup.parser.Token token28 = cData22.reset();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(token16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Doctype" + "'", str17, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(character24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<![CDATA[Doctype]]>" + "'", str25, "<![CDATA[Doctype]]>");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<![CDATA[Doctype]]>" + "'", str26, "<![CDATA[Doctype]]>");
        org.junit.Assert.assertNotNull(token28);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState7);
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element10 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState11 = htmlTreeBuilder0.state();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = htmlTreeBuilder0.lastFormattingElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(parseSettings9);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNull(htmlTreeBuilderState11);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.appendAttributeValue('a');
        tag1.appendTagName('#');
        org.jsoup.parser.Token.Tag tag7 = tag1.name("hi!");
        org.jsoup.parser.Token.Tag tag8 = tag7.reset();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData6 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData6);
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes12 = attributes9.put("hi!", "");
        org.jsoup.nodes.Attributes attributes15 = attributes12.put(" hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes12.iterator();
        boolean boolean17 = xmlTreeBuilder0.processStartTag("EOF", attributes12);
        org.jsoup.nodes.Document document20 = xmlTreeBuilder0.parse("doctype", "<EOF>");
        org.jsoup.parser.Token.Comment comment21 = new org.jsoup.parser.Token.Comment();
        java.lang.String str22 = comment21.getData();
        java.lang.StringBuilder stringBuilder23 = comment21.data;
        org.jsoup.parser.Token token24 = comment21.reset();
        xmlTreeBuilder0.insert(comment21);
        java.lang.StringBuilder stringBuilder26 = comment21.data;
        org.jsoup.parser.Token.reset(stringBuilder26);
        org.jsoup.parser.Token.reset(stringBuilder26);
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertNotNull(token24);
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(false);
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder6.setFosterInserts(false);
        org.jsoup.nodes.Document document9 = htmlTreeBuilder6.getDocument();
        org.jsoup.nodes.FormElement formElement10 = htmlTreeBuilder6.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder11 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings12 = xmlTreeBuilder11.defaultSettings();
        org.jsoup.nodes.Document document15 = xmlTreeBuilder11.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder6.maybeSetBaseUri((org.jsoup.nodes.Element) document15);
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document15);
        java.lang.String str18 = htmlTreeBuilder0.getBaseUri();
        boolean boolean19 = htmlTreeBuilder0.isFosterInserts();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNull(formElement10);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        startTag0.normalName = "hi!";
        startTag0.appendAttributeValue('a');
        org.jsoup.nodes.Attributes attributes6 = startTag0.attributes;
        org.jsoup.parser.Token.TokenType tokenType7 = startTag0.type;
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        attributes8.normalize();
        org.jsoup.nodes.Attributes attributes10 = attributes8.clone();
        boolean boolean12 = attributes8.equals((java.lang.Object) (short) -1);
        org.jsoup.parser.Token.EndTag endTag13 = new org.jsoup.parser.Token.EndTag();
        endTag13.appendAttributeValue(" hi!=\"\"");
        java.lang.String str16 = endTag13.normalName;
        endTag13.selfClosing = true;
        boolean boolean19 = attributes8.equals((java.lang.Object) endTag13);
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes23 = attributes20.put("hi!", "");
        org.jsoup.nodes.Attributes attributes26 = attributes23.put(" hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor27 = attributes23.iterator();
        endTag13.attributes = attributes23;
        startTag0.attributes = attributes23;
        org.jsoup.parser.ParseSettings parseSettings31 = org.jsoup.parser.ParseSettings.preserveCase;
        java.lang.String str33 = parseSettings31.normalizeTag("hi!");
        org.jsoup.nodes.Attributes attributes34 = new org.jsoup.nodes.Attributes();
        attributes34.normalize();
        org.jsoup.nodes.Attributes attributes36 = attributes34.clone();
        org.jsoup.nodes.Attributes attributes37 = parseSettings31.normalizeAttributes(attributes36);
        attributes37.normalize();
        org.jsoup.nodes.Attributes attributes39 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes42 = attributes39.put("", false);
        org.jsoup.nodes.Attributes attributes45 = attributes39.put("hi!", "hi!=\"\"");
        org.jsoup.nodes.Attributes attributes48 = attributes45.put("a ", "hi!=\"\"");
        attributes37.addAll(attributes45);
        org.jsoup.parser.Token.CData cData51 = new org.jsoup.parser.Token.CData(" hi!=\"\"");
        boolean boolean52 = attributes37.equals((java.lang.Object) " hi!=\"\"");
        org.jsoup.nodes.Attributes attributes53 = new org.jsoup.nodes.Attributes();
        attributes53.normalize();
        org.jsoup.nodes.Attributes attributes55 = attributes53.clone();
        attributes37.addAll(attributes53);
        boolean boolean58 = attributes37.hasKey("<eof>");
        attributes37.remove("a");
        java.util.List<org.jsoup.nodes.Attribute> attributeList61 = attributes37.asList();
        org.jsoup.parser.Token.StartTag startTag62 = startTag0.nameAttr("<![CDATA[hi!=\"\"]]>", attributes37);
        boolean boolean63 = startTag0.isSelfClosing();
        boolean boolean64 = startTag0.selfClosing;
        startTag0.normalName = "<![cdata[endtag]]>";
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(attributeItor27);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertNotNull(attributes48);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(attributes55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(attributeList61);
        org.junit.Assert.assertNotNull(startTag62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue("hi!");
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes6 = attributes3.put("hi!", "");
        attributes3.removeIgnoreCase("Doctype");
        endTag0.attributes = attributes3;
        endTag0.selfClosing = false;
        endTag0.newAttribute();
        boolean boolean13 = endTag0.isDoctype();
        org.jsoup.parser.Token.Tag tag14 = endTag0.reset();
        org.jsoup.parser.Token.EndTag endTag15 = tag14.asEndTag();
        org.jsoup.nodes.Attributes attributes16 = endTag15.attributes;
        java.lang.String str17 = endTag15.tagName;
        endTag15.appendTagName("hi!=\"hi!=&quot;&quot;\" a =\"hi!=&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(endTag15);
        org.junit.Assert.assertNull(attributes16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean10 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.ParseSettings parseSettings11 = htmlTreeBuilder0.defaultSettings();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(parseSettings11);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(" hi!=\"\"");
        java.lang.String str3 = endTag0.normalName;
        endTag0.setEmptyAttributeValue();
        endTag0.appendTagName('a');
        char[] charArray12 = new char[] { ' ', ' ', '#', ' ', 'a' };
        endTag0.appendAttributeValue(charArray12);
        java.lang.String str14 = endTag0.toString();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ', '#', ' ', 'a' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "</a>" + "'", str14, "</a>");
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(" hi!=\"\"");
        java.lang.String str3 = endTag0.normalName;
        endTag0.setEmptyAttributeValue();
        endTag0.appendTagName('a');
        java.lang.String str7 = endTag0.name();
        endTag0.selfClosing = false;
        boolean boolean10 = endTag0.isComment();
        java.lang.Class<?> wildcardClass11 = endTag0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a" + "'", str7, "a");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData6 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData6);
        org.jsoup.parser.Token.Comment comment8 = new org.jsoup.parser.Token.Comment();
        comment8.bogus = true;
        java.lang.String str11 = comment8.toString();
        xmlTreeBuilder0.insert(comment8);
        org.jsoup.parser.Token.CData cData14 = new org.jsoup.parser.Token.CData("EndTag");
        boolean boolean15 = cData14.isStartTag();
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData14);
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag18 = startTag17.reset();
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes23 = attributes20.put("hi!", "");
        boolean boolean25 = attributes23.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag26 = startTag17.nameAttr("a ", attributes23);
        org.jsoup.nodes.Attributes attributes28 = new org.jsoup.nodes.Attributes();
        attributes28.normalize();
        org.jsoup.nodes.Attributes attributes30 = attributes28.clone();
        boolean boolean32 = attributes28.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes33 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes36 = attributes33.put("hi!", "");
        attributes28.addAll(attributes33);
        org.jsoup.nodes.Attributes attributes38 = new org.jsoup.nodes.Attributes();
        attributes38.normalize();
        org.jsoup.nodes.Attributes attributes40 = attributes38.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList41 = attributes40.asList();
        attributes28.addAll(attributes40);
        org.jsoup.parser.Token.StartTag startTag43 = startTag26.nameAttr("a", attributes28);
        boolean boolean44 = startTag26.isStartTag();
        org.jsoup.nodes.Element element45 = xmlTreeBuilder0.insert(startTag26);
        org.jsoup.parser.Token.Comment comment46 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token47 = comment46.reset();
        java.lang.StringBuilder stringBuilder48 = comment46.data;
        java.lang.StringBuilder stringBuilder49 = comment46.data;
        java.lang.String str50 = comment46.toString();
        boolean boolean51 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment46);
        org.jsoup.parser.Token token52 = comment46.reset();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(startTag26);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(attributes40);
        org.junit.Assert.assertNotNull(attributeList41);
        org.junit.Assert.assertNotNull(startTag43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(token47);
        org.junit.Assert.assertNotNull(stringBuilder48);
        org.junit.Assert.assertEquals(stringBuilder48.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder49);
        org.junit.Assert.assertEquals(stringBuilder49.toString(), "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "<!---->" + "'", str50, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(token52);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement5 = null;
        htmlTreeBuilder0.setFormElement(formElement5);
        org.jsoup.nodes.FormElement formElement7 = null;
        htmlTreeBuilder0.setFormElement(formElement7);
        java.util.List<java.lang.String> strList9 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder10.defaultSettings();
        org.jsoup.nodes.Document document14 = xmlTreeBuilder10.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData16 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder10.insert((org.jsoup.parser.Token.Character) cData16);
        org.jsoup.nodes.Document document20 = xmlTreeBuilder10.parse("<a   hi!=\"\">", "<![CDATA[null]]>");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document20);
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder24 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings25 = xmlTreeBuilder24.defaultSettings();
        org.jsoup.nodes.Document document28 = xmlTreeBuilder24.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData30 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder24.insert((org.jsoup.parser.Token.Character) cData30);
        org.jsoup.nodes.Attributes attributes33 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes36 = attributes33.put("hi!", "");
        org.jsoup.nodes.Attributes attributes39 = attributes36.put(" hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor40 = attributes36.iterator();
        boolean boolean41 = xmlTreeBuilder24.processStartTag("EOF", attributes36);
        org.jsoup.parser.ParseSettings parseSettings42 = xmlTreeBuilder24.defaultSettings();
        org.jsoup.parser.Token.CData cData44 = new org.jsoup.parser.Token.CData("<!---->");
        java.lang.String str45 = cData44.getData();
        org.jsoup.parser.Token.Character character47 = cData44.data("<![CDATA[hi!=\"\"]]>");
        xmlTreeBuilder24.insert((org.jsoup.parser.Token.Character) cData44);
        org.jsoup.parser.Token.CData cData50 = new org.jsoup.parser.Token.CData("<!---->");
        org.jsoup.parser.Token.Character character52 = cData50.data("Doctype");
        java.lang.String str53 = cData50.getData();
        java.lang.String str54 = cData50.getData();
        xmlTreeBuilder24.insert((org.jsoup.parser.Token.Character) cData50);
        org.jsoup.nodes.Document document58 = xmlTreeBuilder24.parse("hi!=\"hi!=&quot;&quot;\" a =\"hi!=&quot;&quot;\"", " =\"</a>\"");
        org.jsoup.parser.Token.StartTag startTag59 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag60 = startTag59.reset();
        org.jsoup.nodes.Attributes attributes62 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes65 = attributes62.put("hi!", "");
        boolean boolean67 = attributes65.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag68 = startTag59.nameAttr("a ", attributes65);
        java.lang.String str69 = startTag59.normalName();
        java.lang.String str70 = startTag59.toString();
        org.jsoup.nodes.Element element71 = xmlTreeBuilder24.insert(startTag59);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.pushActiveFormattingElements(element71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList9);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(parseSettings25);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertNotNull(attributeItor40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(parseSettings42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "<!---->" + "'", str45, "<!---->");
        org.junit.Assert.assertNotNull(character47);
        org.junit.Assert.assertNotNull(character52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Doctype" + "'", str53, "Doctype");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Doctype" + "'", str54, "Doctype");
        org.junit.Assert.assertNotNull(document58);
        org.junit.Assert.assertNotNull(tag60);
        org.junit.Assert.assertNotNull(attributes65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(startTag68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "a " + "'", str69, "a ");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "<a   hi!=\"\">" + "'", str70, "<a   hi!=\"\">");
        org.junit.Assert.assertNotNull(element71);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData6 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData6);
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes12 = attributes9.put("hi!", "");
        org.jsoup.nodes.Attributes attributes15 = attributes12.put(" hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes12.iterator();
        boolean boolean17 = xmlTreeBuilder0.processStartTag("EOF", attributes12);
        org.jsoup.parser.Token.EndTag endTag19 = new org.jsoup.parser.Token.EndTag();
        endTag19.appendAttributeValue(" hi!=\"\"");
        java.lang.String str22 = endTag19.normalName;
        endTag19.setEmptyAttributeValue();
        endTag19.appendTagName('a');
        endTag19.newAttribute();
        org.jsoup.nodes.Attributes attributes27 = endTag19.attributes;
        org.jsoup.parser.Token.Tag tag28 = endTag19.reset();
        org.jsoup.parser.Token.EndTag endTag29 = new org.jsoup.parser.Token.EndTag();
        endTag29.setEmptyAttributeValue();
        endTag29.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes33 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes36 = attributes33.put("hi!", "");
        attributes33.removeIgnoreCase("Doctype");
        endTag29.attributes = attributes33;
        java.lang.String str41 = attributes33.get(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes42 = new org.jsoup.nodes.Attributes();
        attributes42.normalize();
        org.jsoup.nodes.Attributes attributes44 = attributes42.clone();
        boolean boolean46 = attributes42.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes47 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes50 = attributes47.put("hi!", "");
        attributes42.addAll(attributes47);
        attributes33.addAll(attributes47);
        tag28.attributes = attributes33;
        boolean boolean54 = xmlTreeBuilder0.processStartTag("Doctype", attributes33);
        org.jsoup.parser.ParseSettings parseSettings55 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder56 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings57 = xmlTreeBuilder56.defaultSettings();
        org.jsoup.nodes.Document document60 = xmlTreeBuilder56.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.Comment comment61 = new org.jsoup.parser.Token.Comment();
        boolean boolean62 = comment61.bogus;
        org.jsoup.parser.Token token63 = comment61.reset();
        boolean boolean64 = comment61.isEndTag();
        xmlTreeBuilder56.insert(comment61);
        java.lang.String str66 = comment61.getData();
        xmlTreeBuilder0.insert(comment61);
        org.jsoup.parser.Token.Comment comment68 = new org.jsoup.parser.Token.Comment();
        java.lang.String str69 = comment68.getData();
        java.lang.String str70 = comment68.getData();
        xmlTreeBuilder0.insert(comment68);
        org.jsoup.parser.Token token72 = comment68.reset();
        java.lang.String str73 = comment68.getData();
        org.jsoup.parser.Token token74 = comment68.reset();
        org.jsoup.parser.Token token75 = comment68.reset();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(parseSettings55);
        org.junit.Assert.assertNotNull(parseSettings57);
        org.junit.Assert.assertNotNull(document60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(token63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(token72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(token74);
        org.junit.Assert.assertNotNull(token75);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.setFosterInserts(true);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList7 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean9 = htmlTreeBuilder0.framesetOk();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = htmlTreeBuilder0.getFromStack("<![CDATA[EndTag]]>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.originalState();
        java.util.List<java.lang.String> strList8 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.nodes.FormElement formElement9 = htmlTreeBuilder0.getFormElement();
        boolean boolean10 = htmlTreeBuilder0.isFosterInserts();
        boolean boolean11 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings13 = xmlTreeBuilder12.defaultSettings();
        org.jsoup.nodes.Document document16 = xmlTreeBuilder12.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData18 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder12.insert((org.jsoup.parser.Token.Character) cData18);
        org.jsoup.nodes.Attributes attributes21 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes24 = attributes21.put("hi!", "");
        org.jsoup.nodes.Attributes attributes27 = attributes24.put(" hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor28 = attributes24.iterator();
        boolean boolean29 = xmlTreeBuilder12.processStartTag("EOF", attributes24);
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag();
        startTag30.finaliseTag();
        java.lang.String str32 = startTag30.normalName();
        org.jsoup.nodes.Attributes attributes33 = startTag30.getAttributes();
        org.jsoup.nodes.Attributes attributes35 = new org.jsoup.nodes.Attributes();
        attributes35.normalize();
        org.jsoup.nodes.Attributes attributes37 = attributes35.clone();
        org.jsoup.nodes.Attributes attributes40 = attributes37.put("hi!", "Doctype");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator41 = attributes40.spliterator();
        org.jsoup.parser.Token.StartTag startTag42 = startTag30.nameAttr("", attributes40);
        org.jsoup.parser.ParseSettings parseSettings44 = org.jsoup.parser.ParseSettings.htmlDefault;
        java.lang.String str46 = parseSettings44.normalizeAttribute("hi!");
        org.jsoup.nodes.Attributes attributes47 = new org.jsoup.nodes.Attributes();
        attributes47.normalize();
        org.jsoup.nodes.Attributes attributes49 = attributes47.clone();
        org.jsoup.nodes.Attributes attributes50 = parseSettings44.normalizeAttributes(attributes49);
        attributes49.remove("hi!");
        org.jsoup.parser.Token.StartTag startTag53 = startTag42.nameAttr("Doctype", attributes49);
        boolean boolean54 = startTag53.isCharacter();
        java.lang.String str55 = startTag53.normalName();
        org.jsoup.nodes.Element element56 = xmlTreeBuilder12.insert(startTag53);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertInFosterParent((org.jsoup.nodes.Node) element56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertNull(formElement9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(attributeItor28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertNotNull(attributes40);
        org.junit.Assert.assertNotNull(attributeSpliterator41);
        org.junit.Assert.assertNotNull(startTag42);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(attributes49);
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertNotNull(startTag53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "doctype" + "'", str55, "doctype");
        org.junit.Assert.assertNotNull(element56);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.isDoctype();
        java.lang.String str5 = doctype0.getName();
        java.lang.String str6 = doctype0.getName();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        java.lang.String str3 = doctype0.getSystemIdentifier();
        java.lang.String str4 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.error(htmlTreeBuilderState4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        org.jsoup.parser.ParseSettings parseSettings0 = org.jsoup.parser.ParseSettings.htmlDefault;
        java.lang.String str2 = parseSettings0.normalizeAttribute("hi!");
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        attributes3.normalize();
        org.jsoup.nodes.Attributes attributes5 = attributes3.clone();
        org.jsoup.nodes.Attributes attributes6 = parseSettings0.normalizeAttributes(attributes5);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator7 = attributes6.spliterator();
        attributes6.normalize();
        attributes6.normalize();
        org.junit.Assert.assertNotNull(parseSettings0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(attributeSpliterator7);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = null;
        htmlTreeBuilder0.setFormElement(formElement1);
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.Token.Comment comment8 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder9 = comment8.data;
        boolean boolean10 = comment8.bogus;
        org.jsoup.parser.Token token11 = comment8.reset();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(comment8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(token11);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.parser.ParseSettings parseSettings7 = htmlTreeBuilder0.defaultSettings();
        boolean boolean8 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder9.setFosterInserts(false);
        boolean boolean12 = htmlTreeBuilder9.isFosterInserts();
        org.jsoup.nodes.FormElement formElement13 = htmlTreeBuilder9.getFormElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState14 = htmlTreeBuilder9.state();
        org.jsoup.nodes.FormElement formElement15 = null;
        htmlTreeBuilder9.setFormElement(formElement15);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder17.defaultSettings();
        org.jsoup.nodes.Document document21 = xmlTreeBuilder17.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder9.setHeadElement((org.jsoup.nodes.Element) document21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = htmlTreeBuilder0.removeFromStack((org.jsoup.nodes.Element) document21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings4);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(formElement13);
        org.junit.Assert.assertNull(htmlTreeBuilderState14);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(document21);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState7);
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element10 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.FormElement formElement11 = htmlTreeBuilder0.getFormElement();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(parseSettings9);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNull(formElement11);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        startTag0.normalName = "hi!";
        startTag0.appendAttributeValue('a');
        org.jsoup.nodes.Attributes attributes6 = startTag0.attributes;
        org.jsoup.parser.Token.TokenType tokenType7 = startTag0.type;
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        attributes8.normalize();
        org.jsoup.nodes.Attributes attributes10 = attributes8.clone();
        boolean boolean12 = attributes8.equals((java.lang.Object) (short) -1);
        org.jsoup.parser.Token.EndTag endTag13 = new org.jsoup.parser.Token.EndTag();
        endTag13.appendAttributeValue(" hi!=\"\"");
        java.lang.String str16 = endTag13.normalName;
        endTag13.selfClosing = true;
        boolean boolean19 = attributes8.equals((java.lang.Object) endTag13);
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes23 = attributes20.put("hi!", "");
        org.jsoup.nodes.Attributes attributes26 = attributes23.put(" hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor27 = attributes23.iterator();
        endTag13.attributes = attributes23;
        startTag0.attributes = attributes23;
        org.jsoup.parser.ParseSettings parseSettings31 = org.jsoup.parser.ParseSettings.preserveCase;
        java.lang.String str33 = parseSettings31.normalizeTag("hi!");
        org.jsoup.nodes.Attributes attributes34 = new org.jsoup.nodes.Attributes();
        attributes34.normalize();
        org.jsoup.nodes.Attributes attributes36 = attributes34.clone();
        org.jsoup.nodes.Attributes attributes37 = parseSettings31.normalizeAttributes(attributes36);
        attributes37.normalize();
        org.jsoup.nodes.Attributes attributes39 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes42 = attributes39.put("", false);
        org.jsoup.nodes.Attributes attributes45 = attributes39.put("hi!", "hi!=\"\"");
        org.jsoup.nodes.Attributes attributes48 = attributes45.put("a ", "hi!=\"\"");
        attributes37.addAll(attributes45);
        org.jsoup.parser.Token.CData cData51 = new org.jsoup.parser.Token.CData(" hi!=\"\"");
        boolean boolean52 = attributes37.equals((java.lang.Object) " hi!=\"\"");
        org.jsoup.nodes.Attributes attributes53 = new org.jsoup.nodes.Attributes();
        attributes53.normalize();
        org.jsoup.nodes.Attributes attributes55 = attributes53.clone();
        attributes37.addAll(attributes53);
        boolean boolean58 = attributes37.hasKey("<eof>");
        attributes37.remove("a");
        java.util.List<org.jsoup.nodes.Attribute> attributeList61 = attributes37.asList();
        org.jsoup.parser.Token.StartTag startTag62 = startTag0.nameAttr("<![CDATA[hi!=\"\"]]>", attributes37);
        java.lang.String str63 = startTag0.tagName;
        org.jsoup.nodes.Attributes attributes64 = new org.jsoup.nodes.Attributes();
        attributes64.normalize();
        org.jsoup.nodes.Attributes attributes66 = attributes64.clone();
        org.jsoup.nodes.Attributes attributes69 = attributes66.put("hi!", "Doctype");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator70 = attributes69.spliterator();
        java.lang.String str72 = attributes69.get(" hi!=\"hi!=&quot;&quot;\" a =\"hi!=&quot;&quot;\"");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor73 = attributes69.iterator();
        startTag0.attributes = attributes69;
        org.jsoup.parser.Token.StartTag startTag76 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes77 = startTag76.getAttributes();
        org.jsoup.parser.Token.Tag tag78 = startTag76.reset();
        org.jsoup.nodes.Attributes attributes79 = tag78.getAttributes();
        java.util.Map<java.lang.String, java.lang.String> strMap80 = attributes79.dataset();
        org.jsoup.parser.Token.StartTag startTag81 = startTag0.nameAttr("<a  hi!=\"\">", attributes79);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(attributeItor27);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertNotNull(attributes48);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(attributes55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(attributeList61);
        org.junit.Assert.assertNotNull(startTag62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "<![CDATA[hi!=\"\"]]>" + "'", str63, "<![CDATA[hi!=\"\"]]>");
        org.junit.Assert.assertNotNull(attributes66);
        org.junit.Assert.assertNotNull(attributes69);
        org.junit.Assert.assertNotNull(attributeSpliterator70);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(attributeItor73);
        org.junit.Assert.assertNotNull(attributes77);
        org.junit.Assert.assertNotNull(tag78);
        org.junit.Assert.assertNotNull(attributes79);
        org.junit.Assert.assertNotNull(strMap80);
        org.junit.Assert.assertNotNull(startTag81);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement7 = null;
        htmlTreeBuilder0.setFormElement(formElement7);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.nodes.Document document13 = xmlTreeBuilder9.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData15 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder9.insert((org.jsoup.parser.Token.Character) cData15);
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes21 = attributes18.put("hi!", "");
        org.jsoup.nodes.Attributes attributes24 = attributes21.put(" hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor25 = attributes21.iterator();
        boolean boolean26 = xmlTreeBuilder9.processStartTag("EOF", attributes21);
        org.jsoup.parser.Token.EndTag endTag28 = new org.jsoup.parser.Token.EndTag();
        endTag28.appendAttributeValue(" hi!=\"\"");
        java.lang.String str31 = endTag28.normalName;
        endTag28.setEmptyAttributeValue();
        endTag28.appendTagName('a');
        endTag28.newAttribute();
        org.jsoup.nodes.Attributes attributes36 = endTag28.attributes;
        org.jsoup.parser.Token.Tag tag37 = endTag28.reset();
        org.jsoup.parser.Token.EndTag endTag38 = new org.jsoup.parser.Token.EndTag();
        endTag38.setEmptyAttributeValue();
        endTag38.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes42 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes45 = attributes42.put("hi!", "");
        attributes42.removeIgnoreCase("Doctype");
        endTag38.attributes = attributes42;
        java.lang.String str50 = attributes42.get(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes51 = new org.jsoup.nodes.Attributes();
        attributes51.normalize();
        org.jsoup.nodes.Attributes attributes53 = attributes51.clone();
        boolean boolean55 = attributes51.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes56 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes59 = attributes56.put("hi!", "");
        attributes51.addAll(attributes56);
        attributes42.addAll(attributes56);
        tag37.attributes = attributes42;
        boolean boolean63 = xmlTreeBuilder9.processStartTag("Doctype", attributes42);
        org.jsoup.parser.ParseSettings parseSettings64 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings65 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.Token.Comment comment66 = new org.jsoup.parser.Token.Comment();
        java.lang.String str67 = comment66.getData();
        java.lang.String str68 = comment66.getData();
        java.lang.StringBuilder stringBuilder69 = comment66.data;
        xmlTreeBuilder9.insert(comment66);
        org.jsoup.parser.Token.StartTag startTag71 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes72 = startTag71.getAttributes();
        org.jsoup.nodes.Attributes attributes74 = new org.jsoup.nodes.Attributes();
        java.lang.String str75 = attributes74.toString();
        org.jsoup.parser.Token.StartTag startTag76 = startTag71.nameAttr("EOF", attributes74);
        org.jsoup.nodes.Element element77 = xmlTreeBuilder9.insert(startTag76);
        boolean boolean78 = htmlTreeBuilder0.isSpecial(element77);
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState5);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(attributeItor25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(attributes53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(attributes59);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(parseSettings64);
        org.junit.Assert.assertNotNull(parseSettings65);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(stringBuilder69);
        org.junit.Assert.assertEquals(stringBuilder69.toString(), "");
        org.junit.Assert.assertNotNull(attributes72);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(startTag76);
        org.junit.Assert.assertNotNull(element77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.lang.String str5 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean9 = htmlTreeBuilder0.isFosterInserts();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.generateImpliedEndTags("<<!---->>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData6 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData6);
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes12 = attributes9.put("hi!", "");
        org.jsoup.nodes.Attributes attributes15 = attributes12.put(" hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes12.iterator();
        boolean boolean17 = xmlTreeBuilder0.processStartTag("EOF", attributes12);
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        startTag18.finaliseTag();
        java.lang.String str20 = startTag18.normalName();
        org.jsoup.nodes.Attributes attributes21 = startTag18.getAttributes();
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        attributes23.normalize();
        org.jsoup.nodes.Attributes attributes25 = attributes23.clone();
        org.jsoup.nodes.Attributes attributes28 = attributes25.put("hi!", "Doctype");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator29 = attributes28.spliterator();
        org.jsoup.parser.Token.StartTag startTag30 = startTag18.nameAttr("", attributes28);
        org.jsoup.parser.ParseSettings parseSettings32 = org.jsoup.parser.ParseSettings.htmlDefault;
        java.lang.String str34 = parseSettings32.normalizeAttribute("hi!");
        org.jsoup.nodes.Attributes attributes35 = new org.jsoup.nodes.Attributes();
        attributes35.normalize();
        org.jsoup.nodes.Attributes attributes37 = attributes35.clone();
        org.jsoup.nodes.Attributes attributes38 = parseSettings32.normalizeAttributes(attributes37);
        attributes37.remove("hi!");
        org.jsoup.parser.Token.StartTag startTag41 = startTag30.nameAttr("Doctype", attributes37);
        boolean boolean42 = startTag41.isCharacter();
        java.lang.String str43 = startTag41.normalName();
        org.jsoup.nodes.Element element44 = xmlTreeBuilder0.insert(startTag41);
        java.io.Reader reader45 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document47 = xmlTreeBuilder0.parse(reader45, "<hi!=\"\"  hi!=\"\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(attributeSpliterator29);
        org.junit.Assert.assertNotNull(startTag30);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNotNull(startTag41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "doctype" + "'", str43, "doctype");
        org.junit.Assert.assertNotNull(element44);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        boolean boolean5 = doctype0.isDoctype();
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder8 = doctype7.publicIdentifier;
        doctype7.forceQuirks = true;
        org.jsoup.parser.Token.TokenType tokenType11 = doctype7.type;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.Token.Character character10 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(character10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings4);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement5 = null;
        htmlTreeBuilder0.setFormElement(formElement5);
        org.jsoup.nodes.FormElement formElement7 = null;
        htmlTreeBuilder0.setFormElement(formElement7);
        java.util.List<java.lang.String> strList9 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder10.defaultSettings();
        org.jsoup.nodes.Document document14 = xmlTreeBuilder10.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData16 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder10.insert((org.jsoup.parser.Token.Character) cData16);
        org.jsoup.nodes.Document document20 = xmlTreeBuilder10.parse("<a   hi!=\"\">", "<![CDATA[null]]>");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document20);
        htmlTreeBuilder0.newPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element24 = htmlTreeBuilder0.getActiveFormattingElement("</hi!a>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList9);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(document20);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData6 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData6);
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes12 = attributes9.put("hi!", "");
        org.jsoup.nodes.Attributes attributes15 = attributes12.put(" hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes12.iterator();
        boolean boolean17 = xmlTreeBuilder0.processStartTag("EOF", attributes12);
        org.jsoup.parser.Token.EndTag endTag19 = new org.jsoup.parser.Token.EndTag();
        endTag19.appendAttributeValue(" hi!=\"\"");
        java.lang.String str22 = endTag19.normalName;
        endTag19.setEmptyAttributeValue();
        endTag19.appendTagName('a');
        endTag19.newAttribute();
        org.jsoup.nodes.Attributes attributes27 = endTag19.attributes;
        org.jsoup.parser.Token.Tag tag28 = endTag19.reset();
        org.jsoup.parser.Token.EndTag endTag29 = new org.jsoup.parser.Token.EndTag();
        endTag29.setEmptyAttributeValue();
        endTag29.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes33 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes36 = attributes33.put("hi!", "");
        attributes33.removeIgnoreCase("Doctype");
        endTag29.attributes = attributes33;
        java.lang.String str41 = attributes33.get(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes42 = new org.jsoup.nodes.Attributes();
        attributes42.normalize();
        org.jsoup.nodes.Attributes attributes44 = attributes42.clone();
        boolean boolean46 = attributes42.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes47 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes50 = attributes47.put("hi!", "");
        attributes42.addAll(attributes47);
        attributes33.addAll(attributes47);
        tag28.attributes = attributes33;
        boolean boolean54 = xmlTreeBuilder0.processStartTag("Doctype", attributes33);
        org.jsoup.parser.ParseSettings parseSettings55 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder57 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings58 = xmlTreeBuilder57.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings59 = org.jsoup.parser.ParseSettings.preserveCase;
        java.lang.String str61 = parseSettings59.normalizeTag("hi!");
        org.jsoup.nodes.Attributes attributes62 = new org.jsoup.nodes.Attributes();
        attributes62.normalize();
        org.jsoup.nodes.Attributes attributes64 = attributes62.clone();
        org.jsoup.nodes.Attributes attributes65 = parseSettings59.normalizeAttributes(attributes64);
        attributes65.normalize();
        org.jsoup.nodes.Attributes attributes67 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes70 = attributes67.put("", false);
        org.jsoup.nodes.Attributes attributes73 = attributes67.put("hi!", "hi!=\"\"");
        org.jsoup.nodes.Attributes attributes76 = attributes73.put("a ", "hi!=\"\"");
        attributes65.addAll(attributes73);
        org.jsoup.nodes.Attributes attributes78 = parseSettings58.normalizeAttributes(attributes73);
        boolean boolean79 = xmlTreeBuilder0.processStartTag("<![CDATA[<![CDATA[null]]>]]>", attributes73);
        org.jsoup.nodes.Document document82 = xmlTreeBuilder0.parse("<!---->", "<![CDATA[<!---->]]>");
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(parseSettings55);
        org.junit.Assert.assertNotNull(parseSettings58);
        org.junit.Assert.assertNotNull(parseSettings59);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertNotNull(attributes64);
        org.junit.Assert.assertNotNull(attributes65);
        org.junit.Assert.assertNotNull(attributes70);
        org.junit.Assert.assertNotNull(attributes73);
        org.junit.Assert.assertNotNull(attributes76);
        org.junit.Assert.assertNotNull(attributes78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(document82);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        boolean boolean7 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.FormElement formElement8 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.Element element10 = htmlTreeBuilder0.getHeadElement();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList11 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        java.util.List<java.lang.String> strList13 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder14 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings15 = htmlTreeBuilder14.defaultSettings();
        org.jsoup.nodes.FormElement formElement16 = null;
        htmlTreeBuilder14.setFormElement(formElement16);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState18 = htmlTreeBuilder14.state();
        java.util.List<java.lang.String> strList19 = htmlTreeBuilder14.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState20 = htmlTreeBuilder14.state();
        java.util.List<java.lang.String> strList21 = htmlTreeBuilder14.getPendingTableCharacters();
        htmlTreeBuilder14.newPendingTableCharacters();
        java.lang.String str23 = htmlTreeBuilder14.getBaseUri();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState24 = htmlTreeBuilder14.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder25 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings26 = htmlTreeBuilder25.defaultSettings();
        org.jsoup.nodes.FormElement formElement27 = null;
        htmlTreeBuilder25.setFormElement(formElement27);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState29 = htmlTreeBuilder25.state();
        java.util.List<java.lang.String> strList30 = htmlTreeBuilder25.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState31 = htmlTreeBuilder25.state();
        htmlTreeBuilder25.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState34 = htmlTreeBuilder25.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder35 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean36 = htmlTreeBuilder35.isFragmentParsing();
        htmlTreeBuilder35.newPendingTableCharacters();
        htmlTreeBuilder35.framesetOk(false);
        htmlTreeBuilder35.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder41 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder41.setFosterInserts(false);
        org.jsoup.nodes.Document document44 = htmlTreeBuilder41.getDocument();
        org.jsoup.nodes.FormElement formElement45 = htmlTreeBuilder41.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder46 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings47 = xmlTreeBuilder46.defaultSettings();
        org.jsoup.nodes.Document document50 = xmlTreeBuilder46.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder41.maybeSetBaseUri((org.jsoup.nodes.Element) document50);
        htmlTreeBuilder35.maybeSetBaseUri((org.jsoup.nodes.Element) document50);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder53 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean54 = htmlTreeBuilder53.isFragmentParsing();
        htmlTreeBuilder53.newPendingTableCharacters();
        htmlTreeBuilder53.framesetOk(false);
        htmlTreeBuilder53.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder59 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder59.setFosterInserts(false);
        org.jsoup.nodes.Document document62 = htmlTreeBuilder59.getDocument();
        org.jsoup.nodes.FormElement formElement63 = htmlTreeBuilder59.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder64 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings65 = xmlTreeBuilder64.defaultSettings();
        org.jsoup.nodes.Document document68 = xmlTreeBuilder64.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder59.maybeSetBaseUri((org.jsoup.nodes.Element) document68);
        htmlTreeBuilder53.maybeSetBaseUri((org.jsoup.nodes.Element) document68);
        boolean boolean71 = htmlTreeBuilder35.isSpecial((org.jsoup.nodes.Element) document68);
        htmlTreeBuilder25.setHeadElement((org.jsoup.nodes.Element) document68);
        htmlTreeBuilder14.maybeSetBaseUri((org.jsoup.nodes.Element) document68);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element74 = htmlTreeBuilder0.aboveOnStack((org.jsoup.nodes.Element) document68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(formElement8);
        org.junit.Assert.assertNull(htmlTreeBuilderState9);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNull(elementList11);
        org.junit.Assert.assertNull(strList13);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNull(htmlTreeBuilderState18);
        org.junit.Assert.assertNull(strList19);
        org.junit.Assert.assertNull(htmlTreeBuilderState20);
        org.junit.Assert.assertNull(strList21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(htmlTreeBuilderState24);
        org.junit.Assert.assertNotNull(parseSettings26);
        org.junit.Assert.assertNull(htmlTreeBuilderState29);
        org.junit.Assert.assertNull(strList30);
        org.junit.Assert.assertNull(htmlTreeBuilderState31);
        org.junit.Assert.assertNull(htmlTreeBuilderState34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(document44);
        org.junit.Assert.assertNull(formElement45);
        org.junit.Assert.assertNotNull(parseSettings47);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(document62);
        org.junit.Assert.assertNull(formElement63);
        org.junit.Assert.assertNotNull(parseSettings65);
        org.junit.Assert.assertNotNull(document68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }
}

