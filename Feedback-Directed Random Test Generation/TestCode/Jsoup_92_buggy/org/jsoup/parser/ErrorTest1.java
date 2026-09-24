package org.jsoup.parser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

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
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test501");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertMarkerToFormattingElements();
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.Token.Comment comment10 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token11 = comment10.reset();
        java.lang.String str12 = comment10.toString();
        comment10.bogus = false;
        java.lang.StringBuilder stringBuilder15 = comment10.data;
        java.lang.String str16 = comment10.getData();
        java.lang.String str17 = comment10.getData();
        boolean boolean18 = comment10.isEndTag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert(comment10);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.markInsertionMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags("<a   hi!=\"\">");
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
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
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState19 = htmlTreeBuilder0.state();
        org.jsoup.parser.ParseSettings parseSettings20 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.markInsertionMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableContext();
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder5.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData11 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder5.insert((org.jsoup.parser.Token.Character) cData11);
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes17 = attributes14.put("hi!", "");
        org.jsoup.nodes.Attributes attributes20 = attributes17.put(" hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor21 = attributes17.iterator();
        boolean boolean22 = xmlTreeBuilder5.processStartTag("EOF", attributes17);
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        startTag23.finaliseTag();
        java.lang.String str25 = startTag23.normalName();
        org.jsoup.nodes.Attributes attributes26 = startTag23.getAttributes();
        org.jsoup.nodes.Attributes attributes28 = new org.jsoup.nodes.Attributes();
        attributes28.normalize();
        org.jsoup.nodes.Attributes attributes30 = attributes28.clone();
        org.jsoup.nodes.Attributes attributes33 = attributes30.put("hi!", "Doctype");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator34 = attributes33.spliterator();
        org.jsoup.parser.Token.StartTag startTag35 = startTag23.nameAttr("", attributes33);
        org.jsoup.parser.ParseSettings parseSettings37 = org.jsoup.parser.ParseSettings.htmlDefault;
        java.lang.String str39 = parseSettings37.normalizeAttribute("hi!");
        org.jsoup.nodes.Attributes attributes40 = new org.jsoup.nodes.Attributes();
        attributes40.normalize();
        org.jsoup.nodes.Attributes attributes42 = attributes40.clone();
        org.jsoup.nodes.Attributes attributes43 = parseSettings37.normalizeAttributes(attributes42);
        attributes42.remove("hi!");
        org.jsoup.parser.Token.StartTag startTag46 = startTag35.nameAttr("Doctype", attributes42);
        boolean boolean47 = startTag46.isCharacter();
        java.lang.String str48 = startTag46.normalName();
        org.jsoup.nodes.Element element49 = xmlTreeBuilder5.insert(startTag46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean50 = htmlTreeBuilder0.isInActiveFormattingElements(element49);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.markInsertionMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
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
        java.lang.StringBuilder stringBuilder65 = doctype62.systemIdentifier;
        java.lang.StringBuilder stringBuilder66 = doctype62.publicIdentifier;
        boolean boolean67 = doctype62.isDoctype();
        java.lang.String str68 = doctype62.getName();
        boolean boolean69 = doctype62.forceQuirks;
        org.jsoup.parser.Token token70 = doctype62.reset();
        xmlTreeBuilder0.insert(doctype62);
        org.jsoup.parser.Token.CData cData73 = new org.jsoup.parser.Token.CData(" hi!=\"\"");
        org.jsoup.parser.Token.Character character75 = cData73.data("hi!=\"\"");
        java.lang.String str76 = cData73.toString();
        org.jsoup.parser.Token.Character character78 = cData73.data("a");
        xmlTreeBuilder0.insert(character78);
        org.jsoup.parser.Token.EndTag endTag80 = new org.jsoup.parser.Token.EndTag();
        endTag80.appendAttributeValue("hi!");
        boolean boolean83 = endTag80.isStartTag();
        endTag80.newAttribute();
        java.lang.String str85 = endTag80.tagName;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean86 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag80);
    }
}

