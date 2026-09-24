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
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = documentType4.wrap("SYSTEM");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "", "", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = documentType4.wrap("hi!");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "SYSTEM", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = documentType4.wrap("PUBLIC");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = node19.wrap("4");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        java.lang.String str9 = documentType4.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = documentType4.wrap("4");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str2 = startTag1.normalName;
        startTag1.newAttribute();
        startTag1.finaliseTag();
        startTag1.appendTagName('#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "SYSTEM", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("<SYSTEM>", "Doctype");
        java.lang.String str9 = node7.absUrl("<!---->");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = node7.wrap("SYSTEM");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node8 = documentType4.attr("hi!", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = node8.wrap("<SYSTEM>");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node23 = node21.wrap("#doctype");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        java.lang.String str7 = documentType4.baseUri();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = node8.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = node8.wrap("EOF");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.DocumentType documentType6 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str7 = documentType6.nodeName();
        org.jsoup.parser.Token.Doctype doctype8 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str9 = doctype8.getName();
        boolean boolean10 = doctype8.forceQuirks;
        org.jsoup.parser.Token token11 = doctype8.reset();
        org.jsoup.parser.Token.TokenType tokenType12 = doctype8.type;
        boolean boolean13 = doctype8.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType14 = doctype8.type;
        boolean boolean15 = documentType6.hasSameValue((java.lang.Object) doctype8);
        java.lang.StringBuilder stringBuilder16 = doctype8.publicIdentifier;
        boolean boolean17 = doctype8.isForceQuirks();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        xmlTreeBuilder0.insert(doctype8);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        int int8 = documentType4.childNodeSize();
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node10 = documentType4.clone();
        org.jsoup.nodes.Node node11 = node10.parentNode();
        org.jsoup.nodes.Node node12 = node10.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = node10.wrap("SYSTEM");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = documentType4.clone();
        org.jsoup.nodes.Node node8 = node7.nextSibling();
        org.jsoup.nodes.Node node9 = node7.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = node7.wrap("4a");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        java.lang.String str8 = documentType4.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = documentType4.wrap("<4>");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        int int8 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("<!---->4");
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("<!---->4");
        org.jsoup.nodes.Attributes attributes13 = node12.attributes();
        org.jsoup.nodes.Node node14 = node12.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = node14.wrap("doctype");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        boolean boolean7 = documentType4.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = documentType4.wrap("<Doctype>");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        boolean boolean7 = documentType4.hasAttr("");
        java.lang.String str8 = documentType4.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = documentType4.wrap("<SYSTEM>");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.nodes.Attributes attributes4 = document3.attributes();
        org.jsoup.nodes.Document document5 = document3.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = document3.wrap("hi!");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        java.lang.String str9 = documentType4.attr("StartTag");
        org.jsoup.nodes.Node node10 = documentType4.parent();
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("Comment");
        org.jsoup.nodes.Node node14 = node12.removeAttr("<<SYSTEM>>");
        int int15 = node14.childNodeSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = node14.wrap("#doctype");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("SYSTEM", "SYSTEM", "SYSTEM", "SYSTEM");
        java.lang.String str5 = documentType4.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = documentType4.wrap("4");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        int int8 = documentType4.childNodeSize();
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node10 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodesCopy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = documentType4.wrap("<<SYSTEM>></<SYSTEM>>");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node31 = documentType4.wrap("<SYSTEM>");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        boolean boolean7 = documentType4.hasAttr("");
        org.jsoup.parser.Token.Doctype doctype8 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str9 = doctype8.getName();
        java.lang.String str10 = doctype8.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder11 = doctype8.systemIdentifier;
        java.lang.StringBuilder stringBuilder12 = documentType4.html(stringBuilder11);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = documentType4.wrap("public");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        boolean boolean7 = documentType4.hasAttr("");
        org.jsoup.nodes.Node node8 = documentType4.parentNode();
        java.lang.String str9 = documentType4.nodeName();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("4doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node11.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = node11.wrap("<Doctype>");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        java.lang.String str7 = documentType4.baseUri();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = node8.clone();
        int int10 = node9.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = node9.wrap(" ");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("SYSTEM", "SYSTEM", "#doctype", "SYSTEM");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("PUBLIC");
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("StartTag");
        java.lang.String str10 = documentType4.attr("<Doctype>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = documentType4.wrap(" ");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<system>", "<<SYSTEM>></<SYSTEM>>", "<<!---->  name=\"\" publicId=\"hi!\" systemId=\"hi!\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = documentType4.wrap("starttag");
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<<SYSTEM>>", "<SYSTEM>", "4", "StartTag");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = node5.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = node5.wrap("starttag");
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType(" ", "<!DOCTYPE #doctype PUBLIC \"4\" \"PUBLIC\">", "Character", "4");
        org.jsoup.nodes.Node node7 = documentType4.attr("4", "<system>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = documentType4.wrap("<<!---->4  name=\"\" publicId=\"hi!\" systemId=\"hi!\">");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean9 = documentType4.equals(obj8);
        java.lang.String str10 = documentType4.toString();
        java.lang.String str11 = documentType4.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = documentType4.wrap("<system>");
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "EOF", "Doctype");
        java.lang.String str5 = documentType4.toString();
        java.lang.String str6 = documentType4.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = documentType4.wrap("<SYSTEM>");
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "EOF", "Doctype");
        java.lang.String str5 = documentType4.toString();
        java.lang.String str6 = documentType4.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = documentType4.wrap("EOF");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        boolean boolean5 = document3.hasAttr("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        boolean boolean7 = document3.hasAttr("PUBLIC");
        org.jsoup.nodes.Node node8 = document3.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = node8.wrap("EOF");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        java.lang.String str7 = documentType4.baseUri();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node11 = documentType4.attr("<<SYSTEM>>", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        boolean boolean13 = node11.hasAttr("<<!---->#doctype  name=\"\" publicId=\"hi!\" systemId=\"hi!\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = node11.wrap("Character");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "SYSTEM", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("<SYSTEM>", "Doctype");
        java.lang.String str8 = documentType4.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = documentType4.wrap("< >");
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes8 = node7.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = node7.wrap("Doctype");
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE <!DOCTYPE PUBLIC> PUBLIC \"#doctype\" \"4\">", "< >", "<SYSTEM>", "<SYSTEM>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = documentType4.wrap("<PUBLICa>");
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = documentType4.wrap("#doctype");
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "SYSTEM", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("<SYSTEM>", "Doctype");
        org.jsoup.nodes.Node node8 = node7.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = node7.wrap("4");
    }
}

