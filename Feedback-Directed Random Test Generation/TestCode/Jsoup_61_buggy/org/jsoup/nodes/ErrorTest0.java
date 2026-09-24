package org.jsoup.nodes;

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = element1.lastElementSibling();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "<hi!></hi!>", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        org.jsoup.nodes.Element element13 = element4.classNames((java.util.Set<java.lang.String>) strSet11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element4.firstElementSibling();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        int int8 = element7.childNodeSize();
        java.lang.String str9 = element7.nodeName();
        org.jsoup.nodes.Element element10 = element4.appendChild((org.jsoup.nodes.Node) element7);
        org.jsoup.select.Elements elements11 = element4.siblingElements();
        org.jsoup.nodes.Element element13 = element4.removeClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element13.lastElementSibling();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        org.jsoup.nodes.Element element6 = element1.append("hi!.hi!.<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element1.lastElementSibling();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        int int8 = element7.childNodeSize();
        java.lang.String str9 = element7.nodeName();
        org.jsoup.nodes.Element element10 = element4.appendChild((org.jsoup.nodes.Node) element7);
        org.jsoup.select.Elements elements12 = element10.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element16 = element14.appendText("");
        int int17 = element16.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList18 = element16.textNodes();
        java.lang.String str19 = element16.data();
        org.jsoup.nodes.Element element20 = element10.prependChild((org.jsoup.nodes.Node) element16);
        java.util.List<org.jsoup.nodes.Node> nodeList21 = element10.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = element10.lastElementSibling();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        int int8 = element7.childNodeSize();
        java.lang.String str9 = element7.nodeName();
        org.jsoup.nodes.Element element10 = element4.appendChild((org.jsoup.nodes.Node) element7);
        org.jsoup.select.Elements elements12 = element10.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element16 = element14.appendText("");
        int int17 = element16.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList18 = element16.textNodes();
        java.lang.String str19 = element16.data();
        org.jsoup.nodes.Element element20 = element10.prependChild((org.jsoup.nodes.Node) element16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element20.firstElementSibling();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        org.jsoup.nodes.Element element8 = element4.append("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element8.wrap("<hi!></hi!>");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.prepend("hi!");
        java.lang.String str4 = element3.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = element3.firstElementSibling();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element10 = element4.addClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element4.wrap("hi!");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        int int8 = element7.childNodeSize();
        java.lang.String str9 = element7.nodeName();
        org.jsoup.nodes.Element element10 = element4.appendChild((org.jsoup.nodes.Node) element7);
        org.jsoup.select.Elements elements12 = element10.getElementsContainingOwnText("hi!");
        org.jsoup.select.Elements elements13 = element10.getAllElements();
        org.jsoup.select.Elements elements15 = element10.getElementsByAttribute("<hi!>\n <hi!></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element10.wrap("<hi!>\n</hi!>");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.removeClass("hi!");
        org.jsoup.nodes.Element element5 = element1.getElementById("hi!.hi!.<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element1.wrap("<hi!>\n <hi!></hi!>\n</hi!>");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet9 = element8.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element8.lastElementSibling();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.removeClass("hi!");
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = element1.lastElementSibling();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element7.firstElementSibling();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet9 = element8.classNames();
        org.jsoup.nodes.Element element11 = element8.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element13 = element11.html("");
        org.jsoup.nodes.Element element15 = element13.removeClass("<hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element13.firstElementSibling();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList6 = element3.textNodes();
        org.jsoup.nodes.Element element8 = element3.text("");
        org.jsoup.select.Elements elements10 = element3.getElementsByIndexEquals(0);
        java.lang.String str11 = element3.ownText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element3.firstElementSibling();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        org.jsoup.nodes.Element element8 = element4.append("hi!");
        org.jsoup.nodes.Element element10 = element8.addClass("hi!.hi!.<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element10.lastElementSibling();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet9 = element8.classNames();
        org.jsoup.nodes.Element element11 = element8.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element13 = element11.html("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element11.lastElementSibling();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        int int8 = element7.childNodeSize();
        java.lang.String str9 = element7.nodeName();
        org.jsoup.nodes.Element element10 = element4.appendChild((org.jsoup.nodes.Node) element7);
        org.jsoup.nodes.Element element12 = element4.html("<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element12.lastElementSibling();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet9 = element8.classNames();
        org.jsoup.nodes.Element element11 = element8.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element13 = element11.html("");
        org.jsoup.nodes.Element element15 = element11.addClass("<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element11.firstElementSibling();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str4 = element3.id();
        org.jsoup.nodes.Element element6 = element3.removeClass("");
        java.lang.String str8 = element6.absUrl("hi!");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "<hi!></hi!>", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        org.jsoup.nodes.Element element15 = element6.classNames((java.util.Set<java.lang.String>) strSet13);
        org.jsoup.nodes.Element element16 = element1.classNames((java.util.Set<java.lang.String>) strSet13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element16.wrap("<hi! class=\"\">\n</hi!>");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.parser.Tag tag6 = element4.tag();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element(tag6, "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag6, "<hi!>\n <hi!></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element10.wrap("<hi!>\n</hi!>");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element10 = element4.addClass("");
        org.jsoup.select.Elements elements12 = element4.getElementsByTag("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element14 = element4.text("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element4.lastElementSibling();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        org.jsoup.parser.Tag tag5 = element4.tag();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str9 = element8.id();
        java.lang.Integer int10 = element8.elementSiblingIndex();
        org.jsoup.nodes.Element element11 = element8.empty();
        org.jsoup.parser.Tag tag12 = element11.tag();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str16 = element15.id();
        java.lang.Integer int17 = element15.elementSiblingIndex();
        java.lang.String str18 = element15.className();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList19 = element15.dataNodes();
        org.jsoup.nodes.Element element22 = element15.attr("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element24 = element15.appendElement("hi!");
        org.jsoup.nodes.Attributes attributes25 = element24.attributes();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag12, "<hi!>\n <hi!></hi!>\n</hi!>", attributes25);
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element(tag5, "hi!.hi!.<hi!></hi!>", attributes25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element28 = element27.firstElementSibling();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Element element9 = element7.tagName("hi!");
        org.jsoup.select.Elements elements11 = element7.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element13 = element7.addClass("<hi!></hi!>");
        org.jsoup.nodes.Element element15 = element7.addClass("<hi!></hi!>");
        java.lang.String str16 = element15.val();
        java.lang.String str17 = element15.cssSelector();
        org.jsoup.nodes.Attributes attributes18 = element15.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element15.lastElementSibling();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexGreaterThan((int) (short) 0);
        org.jsoup.nodes.Element element9 = element3.toggleClass("");
        org.jsoup.nodes.Element element11 = element3.appendText("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element3.lastElementSibling();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Element element9 = element7.tagName("hi!");
        boolean boolean10 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element9.wrap("hi!.hi!.<hi!></hi!>");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        org.jsoup.nodes.Element element6 = element1.append("hi!.hi!.<hi!></hi!>");
        boolean boolean8 = element6.hasClass("<hi!>\n</hi!>");
        org.jsoup.select.Elements elements10 = element6.getElementsByIndexLessThan(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element6.firstElementSibling();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsMatchingText("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element4.firstElementSibling();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        org.jsoup.nodes.Node node6 = element3.parentNode();
        org.jsoup.nodes.Element element8 = element3.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element8.firstElementSibling();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexGreaterThan((int) (short) 0);
        java.lang.String str8 = element3.outerHtml();
        org.jsoup.nodes.Node node9 = element3.root();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element3.lastElementSibling();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        int int8 = element7.childNodeSize();
        java.lang.String str9 = element7.nodeName();
        org.jsoup.nodes.Element element10 = element4.appendChild((org.jsoup.nodes.Node) element7);
        org.jsoup.nodes.Element element12 = element4.html("<hi!></hi!>");
        org.jsoup.select.Elements elements14 = element4.getElementsByClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element18 = element16.appendText("");
        org.jsoup.nodes.Element element20 = element18.removeClass("<hi!></hi!>");
        org.jsoup.select.Elements elements22 = element20.getElementsByClass("hi!");
        java.lang.String str23 = element20.val();
        boolean boolean25 = element20.hasClass("hi!");
        org.jsoup.nodes.Element element26 = element4.appendChild((org.jsoup.nodes.Node) element20);
        org.jsoup.nodes.Node node27 = element20.unwrap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element29 = element20.wrap("hi!");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        org.jsoup.nodes.Element element6 = element4.toggleClass("<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element6.firstElementSibling();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element1.nodeName();
        org.jsoup.nodes.Element element6 = element1.empty();
        org.jsoup.parser.Tag tag7 = element1.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element1.wrap("<hi!>\n <hi!></hi!>\n</hi!>");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        org.jsoup.nodes.Element element6 = element1.toggleClass("<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element1.lastElementSibling();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Attributes attributes8 = element7.attributes();
        org.jsoup.nodes.Node node9 = element7.parentNode();
        org.jsoup.select.Elements elements10 = element7.children();
        org.jsoup.nodes.Element element12 = element7.prependElement("<hi! class=\"\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element7.firstElementSibling();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.select.Elements elements7 = element5.getElementsByClass("hi!");
        java.lang.String str8 = element5.val();
        boolean boolean10 = element5.hasClass("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element5.wrap("<hi! class=\"<hi!></hi!>\"></hi!>");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Element element9 = element7.tagName("hi!");
        org.jsoup.select.Elements elements11 = element7.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element16 = element14.appendText("");
        org.jsoup.nodes.Element element18 = element16.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element20 = element16.toggleClass("");
        org.jsoup.nodes.Element element22 = element20.tagName("hi!");
        org.jsoup.select.Elements elements24 = element20.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element25 = element7.insertChildren((int) (byte) -1, (java.util.Collection<org.jsoup.nodes.Element>) elements24);
        org.jsoup.nodes.Node node26 = element7.nextSibling();
        org.jsoup.nodes.Element element28 = element7.appendText("<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element29 = element28.lastElementSibling();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        org.jsoup.nodes.Element element8 = element4.append("hi!");
        int int9 = element8.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element8.lastElementSibling();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        org.jsoup.select.Elements elements6 = element3.getElementsContainingOwnText("hi!");
        element3.setBaseUri("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element3.wrap("hi!");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        java.lang.String str3 = element1.nodeName();
        java.lang.String str4 = element1.text();
        int int5 = element1.childNodeSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element1.wrap("<hi!>\n <hi!></hi!>\n</hi!>");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        java.lang.String str7 = element4.tagName();
        org.jsoup.select.Elements elements9 = element4.getElementsByIndexLessThan((int) (byte) 100);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList10 = element4.textNodes();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = element4.dataset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element4.lastElementSibling();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.val("<hi!></hi!>");
        org.jsoup.parser.Tag tag4 = element1.tag();
        org.jsoup.nodes.Attributes attributes5 = element1.attributes();
        java.lang.String str6 = element1.data();
        java.lang.String str7 = element1.ownText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element1.wrap("<hi!>\n</hi!>");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet9 = element8.classNames();
        org.jsoup.nodes.Element element11 = element8.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element15 = element13.appendText("");
        org.jsoup.nodes.Element element17 = element15.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element19 = element15.toggleClass("");
        org.jsoup.nodes.Element element21 = element19.tagName("hi!");
        org.jsoup.select.Elements elements24 = element21.getElementsByAttributeValueStarting("hi!", "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str27 = element26.id();
        java.lang.Integer int28 = element26.elementSiblingIndex();
        org.jsoup.nodes.Element element29 = element26.empty();
        java.lang.String str30 = element29.outerHtml();
        org.jsoup.parser.Tag tag31 = element29.tag();
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str35 = element34.id();
        org.jsoup.nodes.Element element37 = element34.removeClass("");
        java.lang.String str39 = element37.absUrl("hi!");
        org.jsoup.nodes.Element element41 = element37.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet42 = element41.classNames();
        org.jsoup.nodes.Element element44 = element41.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Attributes attributes45 = element44.attributes();
        org.jsoup.nodes.Element element46 = new org.jsoup.nodes.Element(tag31, "<hi! class=\"\"></hi!>", attributes45);
        java.util.Set<java.lang.String> strSet47 = element46.classNames();
        java.util.Set<java.lang.String> strSet48 = element46.classNames();
        org.jsoup.nodes.Element element49 = element21.classNames(strSet48);
        boolean boolean50 = element8.hasSameValue((java.lang.Object) element21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element52 = element8.wrap("<hi!>\n hi!\n</hi!>");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet9 = element8.classNames();
        org.jsoup.nodes.Element element11 = element8.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.select.Elements elements13 = element11.getElementsMatchingText("");
        org.jsoup.nodes.Element element15 = element11.val("");
        org.jsoup.select.Elements elements17 = element15.getElementsMatchingOwnText("hi!");
        org.jsoup.nodes.Element element19 = element15.removeClass("<hi! class=\"\">\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element15.lastElementSibling();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element12 = element10.appendText("");
        java.util.Set<java.lang.String> strSet13 = element12.classNames();
        org.jsoup.nodes.Element element14 = element4.classNames(strSet13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element14.lastElementSibling();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        int int8 = element7.childNodeSize();
        java.lang.String str9 = element7.nodeName();
        org.jsoup.nodes.Element element10 = element4.appendChild((org.jsoup.nodes.Node) element7);
        org.jsoup.select.Elements elements12 = element10.getElementsContainingOwnText("hi!");
        org.jsoup.select.Elements elements13 = element10.getAllElements();
        java.lang.String str14 = element10.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element10.wrap("<hi! class=\"\">\n hi!\n</hi!>");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet9 = element8.classNames();
        org.jsoup.nodes.Element element11 = element8.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.select.Elements elements13 = element11.getElementsMatchingText("");
        org.jsoup.nodes.Element element15 = element11.val("");
        org.jsoup.select.Elements elements17 = element15.getElementsMatchingOwnText("hi!");
        org.jsoup.nodes.Element element19 = element15.removeClass("<hi! class=\"\">\n</hi!>");
        boolean boolean20 = element15.isBlock();
        element15.setBaseUri("<hi! class=\"\"></hi!>");
        java.lang.String str23 = element15.val();
        org.jsoup.select.Elements elements25 = element15.getElementsContainingText("<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element26 = element15.lastElementSibling();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        java.util.Set<java.lang.String> strSet4 = element3.classNames();
        java.lang.Integer int5 = element3.elementSiblingIndex();
        org.jsoup.nodes.Element element7 = element3.appendElement("<hi!>\n <hi!></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element3.wrap("<hi! class=\"<hi!></hi!>\"></hi!><hi!> </hi!>");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexGreaterThan((int) (short) 0);
        org.jsoup.select.Elements elements10 = element3.getElementsByAttributeValueMatching("hi!", "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element11 = element3.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element3.firstElementSibling();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        java.util.Set<java.lang.String> strSet4 = element3.classNames();
        java.lang.Integer int5 = element3.elementSiblingIndex();
        org.jsoup.nodes.Element element8 = element3.attr("<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>", false);
        org.jsoup.nodes.Element element10 = element3.addClass("<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>");
        org.jsoup.nodes.Element element13 = element10.attr("<hi! <hi! class=\"<hi!></hi!>\"></hi!>=\"<hi! class=&quot;<hi!></hi!>&quot;></hi!>\"></hi!>", "hi!.hi!.<hi!></hi!>");
        java.lang.String str14 = element10.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element10.lastElementSibling();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        java.lang.String str6 = element3.data();
        java.util.Set<java.lang.String> strSet7 = element3.classNames();
        org.jsoup.nodes.Element element9 = element3.prepend("hi!.hi!.<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element3.wrap("<hi! <hi! class=\"<hi!></hi!>\"></hi!>=\"<hi! class=&quot;<hi!></hi!>&quot;></hi!>\"></hi!>");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element1.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = element1.lastElementSibling();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList6 = element3.textNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element3.wrap("<hi!>\n <hi!>\n  <hi! class=\"\"> \n  </hi!>\n </hi!>\n</hi!>");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.parser.Tag tag6 = element4.tag();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element(tag6, "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag6, "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str14 = element13.id();
        org.jsoup.nodes.Element element16 = element13.removeClass("");
        java.lang.String str18 = element16.absUrl("hi!");
        org.jsoup.nodes.Element element20 = element16.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet21 = element20.classNames();
        org.jsoup.nodes.Element element23 = element20.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Attributes attributes24 = element23.attributes();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag6, "<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>", attributes24);
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element(tag6, "<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element(tag6, "<hi! class=\"\">\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element30 = element29.firstElementSibling();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Attributes attributes8 = element7.attributes();
        org.jsoup.select.Elements elements11 = element7.getElementsByAttributeValue("<hi!></hi!>", "<hi!></hi!>");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str14 = element13.id();
        org.jsoup.nodes.Element element16 = element13.removeClass("");
        org.jsoup.nodes.Element element18 = element13.append("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str21 = element20.id();
        java.lang.Integer int22 = element20.elementSiblingIndex();
        org.jsoup.nodes.Element element23 = element20.empty();
        java.lang.String str24 = element23.outerHtml();
        org.jsoup.parser.Tag tag25 = element23.tag();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str29 = element28.id();
        org.jsoup.nodes.Element element31 = element28.removeClass("");
        java.lang.String str33 = element31.absUrl("hi!");
        org.jsoup.nodes.Element element35 = element31.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet36 = element35.classNames();
        org.jsoup.nodes.Element element38 = element35.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Attributes attributes39 = element38.attributes();
        org.jsoup.nodes.Element element40 = new org.jsoup.nodes.Element(tag25, "<hi! class=\"\"></hi!>", attributes39);
        java.util.Set<java.lang.String> strSet41 = element40.classNames();
        java.util.Set<java.lang.String> strSet42 = element40.classNames();
        org.jsoup.nodes.Element element43 = element18.classNames(strSet42);
        org.jsoup.nodes.Element element44 = element7.classNames(strSet42);
        org.jsoup.select.Elements elements46 = element7.getElementsByAttributeStarting("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element48 = element7.removeClass("<hi!>\n hi!\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element50 = element48.wrap("<hi!>\n <hi!>\n  <hi! class=\"\"> \n  </hi!>\n </hi!>\n</hi!>");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexGreaterThan((int) (short) 0);
        org.jsoup.nodes.Element element9 = element3.toggleClass("");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element9.childNodesCopy();
        org.jsoup.nodes.Element element12 = element9.append("hi!.hi!.\n<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element12.wrap("hi!.<hi!></hi!>");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element4.wrap("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.val("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = element1.siblingNodes();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element8 = element6.appendText("");
        org.jsoup.nodes.Element element10 = element8.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element12 = element8.toggleClass("");
        org.jsoup.nodes.Element element14 = element12.tagName("hi!");
        boolean boolean15 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element14);
        org.jsoup.nodes.Element element16 = element1.appendChild((org.jsoup.nodes.Node) element14);
        java.util.List<org.jsoup.nodes.Node> nodeList17 = element1.siblingNodes();
        java.lang.String str18 = element1.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element1.wrap("<hi! class=\"\">\n</hi!>");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingText("hi!");
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = element1.firstElementSibling();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        int int8 = element7.childNodeSize();
        java.lang.String str9 = element7.nodeName();
        org.jsoup.nodes.Element element10 = element4.appendChild((org.jsoup.nodes.Node) element7);
        org.jsoup.select.Elements elements12 = element10.getElementsContainingOwnText("hi!");
        org.jsoup.select.Elements elements13 = element10.getAllElements();
        org.jsoup.select.Elements elements15 = element10.getElementsByAttribute("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element16 = element10.parent();
        org.jsoup.select.Elements elements19 = element10.getElementsByAttributeValueEnding("<hi! class=\"\">&lt;hi!&gt; &lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.select.Elements elements21 = element10.getElementsMatchingText("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = element10.lastElementSibling();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.parser.Tag tag6 = element4.tag();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element(tag6, "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag6, "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element13 = element10.attr("<hi! class=\"<hi!></hi!>\"></hi!>", "<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str17 = element16.id();
        java.lang.Integer int18 = element16.elementSiblingIndex();
        org.jsoup.nodes.Element element19 = element16.empty();
        java.lang.String str20 = element19.outerHtml();
        org.jsoup.select.Elements elements23 = element19.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element25 = element19.addClass("");
        org.jsoup.select.Elements elements27 = element19.getElementsByTag("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element28 = element10.insertChildren((int) (byte) 0, (java.util.Collection<org.jsoup.nodes.Element>) elements27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element29 = element28.firstElementSibling();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element10 = element4.addClass("");
        org.jsoup.select.Elements elements12 = element4.getElementsByTag("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element14 = element4.text("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element4.wrap("hi!.<hi!.class=\"<hi!></hi!>\"></hi!>");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element1.id();
        org.jsoup.nodes.Element element6 = element1.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element6.firstElementSibling();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        boolean boolean4 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element5 = element1.previousElementSibling();
        java.lang.String str6 = element1.cssSelector();
        org.jsoup.parser.Tag tag7 = element1.tag();
        java.lang.String str8 = element1.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element1.wrap("<hi! <hi!>\n <hi!></hi!>\n</hi!>=\"<hi!>\n <hi!></hi!>\n</hi!>\"></hi!>");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet9 = element8.classNames();
        org.jsoup.nodes.Element element11 = element8.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.select.Elements elements13 = element11.getElementsMatchingText("");
        org.jsoup.nodes.Element element15 = element11.val("");
        org.jsoup.select.Elements elements17 = element15.getElementsMatchingOwnText("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element15.wrap("<hi! class=\"\">\n <hi!></hi!>\n</hi!>");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet9 = element8.classNames();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str14 = element13.id();
        org.jsoup.nodes.Element element16 = element13.removeClass("");
        java.lang.String str18 = element16.absUrl("hi!");
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "<hi!></hi!>", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        org.jsoup.nodes.Element element25 = element16.classNames((java.util.Set<java.lang.String>) strSet23);
        org.jsoup.nodes.Element element26 = element11.classNames((java.util.Set<java.lang.String>) strSet23);
        org.jsoup.nodes.Element element27 = element8.classNames((java.util.Set<java.lang.String>) strSet23);
        org.jsoup.nodes.Element element29 = element8.removeClass("<<hi!>\n</hi!>></<hi!>\n</hi!>>");
        boolean boolean30 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element31 = element8.firstElementSibling();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        java.lang.String str3 = element1.nodeName();
        element1.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = element1.toggleClass("hi!.hi!.<hi!></hi!>");
        java.lang.String str8 = element7.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element7.wrap("<hi!>\n <hi!>\n  <hi! class=\"\"> \n  </hi!>\n </hi!>\n</hi!>");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Attributes attributes8 = element7.attributes();
        org.jsoup.nodes.Node node9 = element7.parentNode();
        org.jsoup.select.Elements elements10 = element7.children();
        org.jsoup.nodes.Element element12 = element7.tagName("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element7.wrap("<hi! class=\"<hi! class=&quot;&quot;>\n hi!.hi!.\n <hi!></hi!>\n</hi!>\">\n</hi!>");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet9 = element8.classNames();
        org.jsoup.nodes.Element element11 = element8.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element13 = element11.html("");
        org.jsoup.nodes.Element element15 = element11.addClass("<hi!></hi!>");
        java.lang.String str16 = element15.className();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = element15.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element15.lastElementSibling();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        int int8 = element7.childNodeSize();
        java.lang.String str9 = element7.nodeName();
        org.jsoup.nodes.Element element10 = element4.appendChild((org.jsoup.nodes.Node) element7);
        org.jsoup.select.Elements elements11 = element4.siblingElements();
        java.lang.String str12 = element4.tagName();
        org.jsoup.nodes.Element element14 = element4.val("<hi!>\n hi!\n</hi!>");
        boolean boolean15 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element4);
        org.jsoup.select.Elements elements17 = element4.getElementsByAttribute("<hi! class=\"\" value=\"<hi!></hi!>\">\n</hi!>");
        org.jsoup.nodes.Element element19 = element4.prependElement("hi!.hi!.hi!.<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element4.firstElementSibling();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        org.jsoup.nodes.Element element8 = element4.append("hi!");
        int int9 = element8.siblingIndex();
        org.jsoup.select.Elements elements10 = element8.siblingElements();
        org.jsoup.nodes.Element element12 = element8.val("hi!.<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element12.lastElementSibling();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Element element9 = element7.tagName("hi!");
        org.jsoup.select.Elements elements11 = element7.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element13 = element7.addClass("<hi!></hi!>");
        org.jsoup.nodes.Element element15 = element7.addClass("<hi!></hi!>");
        java.lang.String str16 = element15.val();
        java.lang.String str17 = element15.cssSelector();
        org.jsoup.nodes.Node node18 = element15.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element15.firstElementSibling();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        org.jsoup.nodes.Element element6 = element1.append("hi!.hi!.<hi!></hi!>");
        java.lang.String str7 = element1.cssSelector();
        org.jsoup.select.Elements elements10 = element1.getElementsByAttributeValueMatching("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>", "<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element1.lastElementSibling();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        org.jsoup.nodes.Element element4 = element1.val("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = element1.childNodesCopy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element1.wrap("hi!.<hi!.class=\"<hi!></hi!>\"></hi!>");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        int int8 = element7.childNodeSize();
        java.lang.String str9 = element7.nodeName();
        org.jsoup.nodes.Element element10 = element4.appendChild((org.jsoup.nodes.Node) element7);
        org.jsoup.select.Elements elements11 = element4.siblingElements();
        org.jsoup.nodes.Element element13 = element4.removeClass("");
        org.jsoup.nodes.Element element14 = element13.previousElementSibling();
        org.jsoup.nodes.Element element16 = element13.appendText("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.select.Elements elements19 = element16.getElementsByAttributeValue("<hi! class=\"\">\n</hi!>", "<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element20 = element16.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element16.lastElementSibling();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element1.nodeName();
        org.jsoup.nodes.Element element6 = element1.empty();
        org.jsoup.nodes.Element element8 = element1.removeClass("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element8.lastElementSibling();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Element element9 = element7.tagName("hi!");
        org.jsoup.select.Elements elements11 = element7.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element16 = element14.appendText("");
        org.jsoup.nodes.Element element18 = element16.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element20 = element16.toggleClass("");
        org.jsoup.nodes.Element element22 = element20.tagName("hi!");
        org.jsoup.select.Elements elements24 = element20.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element25 = element7.insertChildren((int) (byte) -1, (java.util.Collection<org.jsoup.nodes.Element>) elements24);
        org.jsoup.nodes.Node node26 = element7.nextSibling();
        org.jsoup.select.Elements elements28 = element7.getElementsByAttributeStarting("<hi!>\n <hi!></hi!>\n</hi!>");
        java.lang.String str29 = element7.toString();
        java.util.Set<java.lang.String> strSet30 = element7.classNames();
        org.jsoup.nodes.Element element32 = element7.text("hi!.hi!.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element33 = element7.firstElementSibling();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        org.jsoup.parser.Tag tag5 = element3.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element3.wrap("<hi! class=\"\" value=\"hi!.hi!.<hi!></hi!>\"></hi!>");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Element element9 = element7.toggleClass("<hi!></hi!>");
        org.jsoup.nodes.Node node11 = element7.childNode(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element7.lastElementSibling();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        int int8 = element7.childNodeSize();
        java.lang.String str9 = element7.nodeName();
        org.jsoup.nodes.Element element10 = element4.appendChild((org.jsoup.nodes.Node) element7);
        org.jsoup.select.Elements elements12 = element10.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element16 = element14.appendText("");
        int int17 = element16.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList18 = element16.textNodes();
        java.lang.String str19 = element16.data();
        org.jsoup.nodes.Element element20 = element10.prependChild((org.jsoup.nodes.Node) element16);
        java.util.Set<java.lang.String> strSet21 = element20.classNames();
        org.jsoup.nodes.Element element23 = element20.text("<hi! class=\"\">\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element24 = element20.firstElementSibling();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.className();
        org.jsoup.select.Elements elements4 = element1.getElementsMatchingOwnText("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = element1.lastElementSibling();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList9 = element8.textNodes();
        org.jsoup.nodes.Element element11 = element8.appendText("<hi! class=\"\">\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element11.firstElementSibling();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        int int8 = element7.childNodeSize();
        java.lang.String str9 = element7.nodeName();
        org.jsoup.nodes.Element element10 = element4.appendChild((org.jsoup.nodes.Node) element7);
        org.jsoup.nodes.Element element12 = element7.text("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Node node13 = element7.unwrap();
        org.jsoup.nodes.Element element15 = element7.appendText("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element15.wrap("<hi!.hi!.></hi!.hi!.>");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Attributes attributes8 = element7.attributes();
        org.jsoup.nodes.Node node9 = element7.parentNode();
        java.util.Set<java.lang.String> strSet10 = element7.classNames();
        org.jsoup.select.Elements elements13 = element7.getElementsByAttributeValueStarting("<hi! <hi!>\n <hi!></hi!>\n</hi!>=\"<hi!>\n <hi!></hi!>\n</hi!>\"></hi!>", "<hi!>\n hi!\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element7.wrap("<hi! class=\"\">&lt;hi!&gt; &lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexGreaterThan((int) (short) 0);
        org.jsoup.nodes.Element element9 = element3.toggleClass("");
        org.jsoup.nodes.Element element11 = element3.appendText("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element3.wrap("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        java.lang.String str6 = element3.nodeName();
        org.jsoup.nodes.Node node7 = element3.nextSibling();
        org.jsoup.nodes.Element element9 = element3.prependElement("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element11 = element3.prepend("<hi! class=\"\">\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element11.firstElementSibling();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.val("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet4 = element3.classNames();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str7 = element6.id();
        java.lang.Integer int8 = element6.elementSiblingIndex();
        org.jsoup.nodes.Element element9 = element6.empty();
        java.lang.String str10 = element9.outerHtml();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        int int13 = element12.childNodeSize();
        java.lang.String str14 = element12.nodeName();
        org.jsoup.nodes.Element element15 = element9.appendChild((org.jsoup.nodes.Node) element12);
        org.jsoup.select.Elements elements17 = element15.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element21 = element19.appendText("");
        int int22 = element21.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList23 = element21.textNodes();
        java.lang.String str24 = element21.data();
        org.jsoup.nodes.Element element25 = element15.prependChild((org.jsoup.nodes.Node) element21);
        java.util.List<org.jsoup.nodes.Node> nodeList26 = element15.siblingNodes();
        org.jsoup.nodes.Element element27 = element3.appendChild((org.jsoup.nodes.Node) element15);
        java.lang.String str28 = element27.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element29 = element27.firstElementSibling();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.parser.Tag tag6 = element4.tag();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element(tag6, "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag6, "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element13 = element11.append("<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element13.wrap("<hi! <hi!>\n <hi!></hi!>\n</hi!>=\"<hi!>\n <hi!></hi!>\n</hi!>\"></hi!>");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        int int8 = element7.childNodeSize();
        java.lang.String str9 = element7.nodeName();
        org.jsoup.nodes.Element element10 = element4.appendChild((org.jsoup.nodes.Node) element7);
        org.jsoup.select.Elements elements11 = element4.siblingElements();
        org.jsoup.nodes.Node node12 = element4.parentNode();
        boolean boolean14 = element4.hasAttr("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element16 = element4.prependText("<hi! class=\"\" value=\"<hi!></hi!>\">\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element4.lastElementSibling();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList6 = element3.textNodes();
        org.jsoup.nodes.Element element8 = element3.text("");
        org.jsoup.select.Elements elements10 = element3.getElementsByIndexEquals(0);
        java.lang.String str11 = element3.ownText();
        java.lang.String str12 = element3.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element3.firstElementSibling();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        java.lang.String str3 = element1.nodeName();
        java.lang.String str4 = element1.text();
        org.jsoup.nodes.Element element6 = element1.prepend("hi!.hi!.<hi!></hi!>");
        java.lang.String str7 = element6.ownText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element6.firstElementSibling();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        org.jsoup.nodes.Element element8 = element4.append("hi!");
        int int9 = element8.siblingIndex();
        org.jsoup.select.Elements elements10 = element8.siblingElements();
        org.jsoup.nodes.Element element12 = element8.val("hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element14 = element12.val("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str17 = element16.id();
        org.jsoup.nodes.Element element19 = element16.removeClass("");
        java.lang.String str21 = element19.absUrl("hi!");
        org.jsoup.nodes.Element element23 = element19.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet24 = element23.classNames();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str29 = element28.id();
        org.jsoup.nodes.Element element31 = element28.removeClass("");
        java.lang.String str33 = element31.absUrl("hi!");
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "<hi!></hi!>", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        org.jsoup.nodes.Element element40 = element31.classNames((java.util.Set<java.lang.String>) strSet38);
        org.jsoup.nodes.Element element41 = element26.classNames((java.util.Set<java.lang.String>) strSet38);
        org.jsoup.nodes.Element element42 = element23.classNames((java.util.Set<java.lang.String>) strSet38);
        org.jsoup.nodes.Element element43 = element14.classNames((java.util.Set<java.lang.String>) strSet38);
        org.jsoup.nodes.Element element45 = element43.removeClass("<hi!>\n <hi!>\n  <hi! class=\"\"> \n  </hi!>\n </hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element46 = element45.lastElementSibling();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element8 = element6.appendText("");
        org.jsoup.nodes.Element element10 = element8.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element12 = element8.toggleClass("");
        boolean boolean14 = element12.hasAttr("<hi!>\n <hi!></hi!>\n</hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList15 = element12.dataNodes();
        org.jsoup.nodes.Element element16 = element1.appendChild((org.jsoup.nodes.Node) element12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element1.firstElementSibling();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        int int8 = element7.childNodeSize();
        java.lang.String str9 = element7.nodeName();
        org.jsoup.nodes.Element element10 = element4.appendChild((org.jsoup.nodes.Node) element7);
        org.jsoup.nodes.Element element12 = element4.html("<hi!></hi!>");
        org.jsoup.nodes.Element element13 = element4.nextElementSibling();
        java.lang.String str14 = element4.id();
        org.jsoup.nodes.Node node16 = element4.removeAttr("hi!");
        org.jsoup.select.Elements elements18 = element4.getElementsByTag("hi!.<hi!.class=\"<hi!></hi!>\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element4.lastElementSibling();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "<hi!></hi!>", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        org.jsoup.nodes.Element element13 = element4.classNames((java.util.Set<java.lang.String>) strSet11);
        java.lang.String str14 = element13.cssSelector();
        java.lang.String str15 = element13.html();
        org.jsoup.select.Elements elements16 = element13.parents();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element13.firstElementSibling();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList3 = element1.childNodesCopy();
        org.jsoup.nodes.Element element5 = element1.appendElement("<hi!>\n <hi!>\n  <hi! class=\"\"> \n  </hi!>\n </hi!>\n</hi!>");
        org.jsoup.nodes.Element element7 = element1.child(0);
        org.jsoup.select.Elements elements9 = element1.getElementsMatchingOwnText("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element1.lastElementSibling();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.select.Elements elements5 = element3.getElementsMatchingText("");
        java.lang.String str6 = element3.val();
        org.jsoup.nodes.Element element8 = element3.html("<hi! class=\"\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element3.lastElementSibling();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList6 = element3.textNodes();
        org.jsoup.nodes.Element element8 = element3.text("");
        org.jsoup.select.Elements elements10 = element3.getElementsByIndexEquals(0);
        org.jsoup.select.Elements elements12 = element3.getElementsByAttributeStarting("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element3.wrap("hi!.hi!.hi!.<hi!></hi!>");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str4 = element3.id();
        org.jsoup.nodes.Element element6 = element3.removeClass("");
        java.lang.String str8 = element6.absUrl("hi!");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "<hi!></hi!>", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        org.jsoup.nodes.Element element15 = element6.classNames((java.util.Set<java.lang.String>) strSet13);
        org.jsoup.nodes.Element element16 = element1.classNames((java.util.Set<java.lang.String>) strSet13);
        boolean boolean18 = element16.hasClass("hi!.<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element16.wrap("<hi! class=\"\"></hi!>");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        int int8 = element7.childNodeSize();
        java.lang.String str9 = element7.nodeName();
        org.jsoup.nodes.Element element10 = element4.appendChild((org.jsoup.nodes.Node) element7);
        org.jsoup.nodes.Element element12 = element4.html("<hi!></hi!>");
        org.jsoup.select.Elements elements14 = element4.getElementsByClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element18 = element16.appendText("");
        org.jsoup.nodes.Element element20 = element18.removeClass("<hi!></hi!>");
        org.jsoup.select.Elements elements22 = element20.getElementsByClass("hi!");
        java.lang.String str23 = element20.val();
        boolean boolean25 = element20.hasClass("hi!");
        org.jsoup.nodes.Element element26 = element4.appendChild((org.jsoup.nodes.Node) element20);
        org.jsoup.parser.Tag tag27 = element4.tag();
        boolean boolean28 = element4.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element30 = element4.wrap("<hi! <hi! class=\"\">\n</hi!>></hi!>");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Element element9 = element7.tagName("hi!");
        org.jsoup.select.Elements elements11 = element7.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element16 = element14.appendText("");
        org.jsoup.nodes.Element element18 = element16.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element20 = element16.toggleClass("");
        org.jsoup.nodes.Element element22 = element20.tagName("hi!");
        org.jsoup.select.Elements elements24 = element20.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element25 = element7.insertChildren((int) (byte) -1, (java.util.Collection<org.jsoup.nodes.Element>) elements24);
        org.jsoup.nodes.Node node26 = element7.nextSibling();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList27 = element7.textNodes();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList28 = element7.dataNodes();
        org.jsoup.select.Elements elements31 = element7.getElementsByAttributeValueMatching("<hi! class=\"<hi!></hi!>\"></hi!>", "<hi!.hi!.></hi!.hi!.>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element32 = element7.lastElementSibling();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        org.jsoup.nodes.Element element8 = element4.append("hi!");
        org.jsoup.nodes.Element element10 = element8.addClass("hi!.hi!.<hi!></hi!>");
        org.jsoup.select.Elements elements12 = element10.getElementsByTag("<hi!>\n <hi!></hi!>\n</hi!>");
        java.lang.String str13 = element10.baseUri();
        boolean boolean14 = element10.hasText();
        java.util.Set<java.lang.String> strSet15 = element10.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element10.lastElementSibling();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element1.nodeName();
        org.jsoup.nodes.Element element7 = element1.appendText("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str10 = element9.id();
        java.lang.Integer int11 = element9.elementSiblingIndex();
        org.jsoup.nodes.Element element12 = element9.empty();
        java.lang.String str13 = element12.outerHtml();
        org.jsoup.select.Elements elements16 = element12.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element20 = element18.appendText("");
        java.util.Set<java.lang.String> strSet21 = element20.classNames();
        org.jsoup.nodes.Element element22 = element12.classNames(strSet21);
        org.jsoup.nodes.Element element23 = element1.classNames(strSet21);
        org.jsoup.select.Elements elements26 = element23.getElementsByAttributeValueNot("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>", "hi!.hi!.<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element27 = element23.lastElementSibling();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.parser.Tag tag6 = element4.tag();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element(tag6, "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag6, "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element13 = element10.attr("<hi! class=\"<hi!></hi!>\"></hi!>", "<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.select.Elements elements15 = element10.getElementsMatchingText("hi!.hi!.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element10.wrap("<hi!>\n <hi!>\n  <hi! class=\"\"> \n  </hi!>\n </hi!>\n</hi!>");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsMatchingText("");
        java.lang.String str9 = element4.toString();
        org.jsoup.nodes.Attributes attributes10 = element4.attributes();
        org.jsoup.select.Elements elements11 = element4.children();
        java.lang.String str12 = element4.cssSelector();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element16 = element14.appendText("");
        int int17 = element16.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList18 = element16.textNodes();
        java.lang.String str19 = element16.nodeName();
        org.jsoup.nodes.Element element21 = element16.text("<hi!></hi!>");
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str24 = element23.id();
        java.lang.Integer int25 = element23.elementSiblingIndex();
        org.jsoup.nodes.Element element26 = element23.empty();
        java.lang.String str27 = element26.outerHtml();
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element("hi!");
        int int30 = element29.childNodeSize();
        java.lang.String str31 = element29.nodeName();
        org.jsoup.nodes.Element element32 = element26.appendChild((org.jsoup.nodes.Node) element29);
        org.jsoup.select.Elements elements34 = element32.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element38 = element36.appendText("");
        int int39 = element38.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList40 = element38.textNodes();
        java.lang.String str41 = element38.data();
        org.jsoup.nodes.Element element42 = element32.prependChild((org.jsoup.nodes.Node) element38);
        java.util.Set<java.lang.String> strSet43 = element42.classNames();
        org.jsoup.nodes.Element element44 = element21.classNames(strSet43);
        org.jsoup.nodes.Element element45 = element4.classNames(strSet43);
        org.jsoup.select.Elements elements47 = element4.getElementsContainingOwnText("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Node node48 = element4.root();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element49 = element4.lastElementSibling();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        int int8 = element7.childNodeSize();
        java.lang.String str9 = element7.nodeName();
        org.jsoup.nodes.Element element10 = element4.appendChild((org.jsoup.nodes.Node) element7);
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element14 = element12.appendText("");
        org.jsoup.nodes.Element element15 = element10.appendChild((org.jsoup.nodes.Node) element12);
        org.jsoup.nodes.Element element17 = element10.addClass("");
        org.jsoup.select.Elements elements18 = element17.getAllElements();
        boolean boolean19 = element17.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element17.wrap("<hi! class=\"\">\n &lt;hi!&gt; &lt;/hi!&gt;\n</hi!>");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Element element9 = element7.tagName("hi!");
        org.jsoup.select.Elements elements11 = element7.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element16 = element14.appendText("");
        org.jsoup.nodes.Element element18 = element16.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element20 = element16.toggleClass("");
        org.jsoup.nodes.Element element22 = element20.tagName("hi!");
        org.jsoup.select.Elements elements24 = element20.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element25 = element7.insertChildren((int) (byte) -1, (java.util.Collection<org.jsoup.nodes.Element>) elements24);
        org.jsoup.nodes.Node node26 = element7.nextSibling();
        org.jsoup.select.Elements elements28 = element7.getElementsByAttributeStarting("<hi!>\n <hi!></hi!>\n</hi!>");
        java.lang.String str29 = element7.toString();
        org.jsoup.nodes.Element element30 = element7.empty();
        org.jsoup.select.Elements elements33 = element30.getElementsByAttributeValueEnding("hi!.hi!.", "<hi! class=\"\">\n</hi!>");
        org.jsoup.nodes.Element element36 = element30.attr("<hi!>\n</hi!>", "<hi! class=\"<hi!></hi!>\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element38 = element30.wrap("<<hi!>\n</hi!> value=\"<hi! class=&quot;&quot;></hi!>\">\n <hi! class=\"\">\n   hi!.hi!. \n  <hi!></hi!> \n </hi!>\n</<hi!>\n</hi!>>");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Element element9 = element7.tagName("hi!");
        org.jsoup.select.Elements elements11 = element7.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element13 = element7.addClass("<hi!></hi!>");
        org.jsoup.select.Elements elements15 = element7.getElementsByIndexEquals((-1));
        org.jsoup.nodes.Element element17 = element7.tagName("<hi! class=\"\">\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element7.firstElementSibling();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element10 = element4.addClass("");
        java.lang.String str11 = element10.toString();
        org.jsoup.select.Elements elements13 = element10.getElementsByAttributeStarting("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element15 = element10.addClass("<hi!></hi!>");
        org.jsoup.nodes.Element element18 = element15.attr("<hi! class=\"\"></hi!>", "hi!.hi!.\n<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element18.wrap("<hi! class=\"\">\n <hi!></hi!>&lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        int int8 = element7.childNodeSize();
        java.lang.String str9 = element7.nodeName();
        org.jsoup.nodes.Element element10 = element4.appendChild((org.jsoup.nodes.Node) element7);
        org.jsoup.nodes.Element element12 = element7.addClass("hi!.hi!.<hi!></hi!>");
        org.jsoup.select.Elements elements14 = element7.getElementsContainingOwnText("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element16 = element7.before("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element19 = element7.attr("<hi! class=\"\"></hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.parser.Tag tag20 = element19.tag();
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str23 = element22.id();
        java.lang.Integer int24 = element22.elementSiblingIndex();
        org.jsoup.nodes.Element element25 = element22.empty();
        java.lang.String str26 = element25.outerHtml();
        org.jsoup.parser.Tag tag27 = element25.tag();
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element(tag27, "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element(tag27, "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element34 = element31.attr("<hi! class=\"<hi!></hi!>\"></hi!>", "<hi! class=\"<hi!></hi!>\"></hi!>");
        element19.replaceWith((org.jsoup.nodes.Node) element34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element37 = element19.wrap("hi!.hi!.\n<hi!></hi!>");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        int int8 = element7.childNodeSize();
        java.lang.String str9 = element7.nodeName();
        org.jsoup.nodes.Element element10 = element4.appendChild((org.jsoup.nodes.Node) element7);
        org.jsoup.select.Elements elements11 = element4.siblingElements();
        java.lang.String str12 = element4.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element4.firstElementSibling();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        org.jsoup.nodes.Element element6 = element4.toggleClass("<hi!></hi!>");
        org.jsoup.select.Elements elements7 = element6.getAllElements();
        org.jsoup.nodes.Element element9 = element6.toggleClass("<<hi!>\n</hi!>></<hi!>\n</hi!>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element6.firstElementSibling();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        int int8 = element7.childNodeSize();
        java.lang.String str9 = element7.nodeName();
        org.jsoup.nodes.Element element10 = element4.appendChild((org.jsoup.nodes.Node) element7);
        org.jsoup.select.Elements elements12 = element10.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element16 = element14.appendText("");
        int int17 = element16.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList18 = element16.textNodes();
        java.lang.String str19 = element16.data();
        org.jsoup.nodes.Element element20 = element10.prependChild((org.jsoup.nodes.Node) element16);
        java.util.Map<java.lang.String, java.lang.String> strMap21 = element20.dataset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = element20.lastElementSibling();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingText("hi!");
        boolean boolean4 = element1.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = element1.wrap("<hi! class=\"<hi! class=&quot;&quot;>\n hi!.hi!.\n <hi!></hi!>\n</hi!>\">\n</hi!>");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        int int8 = element7.childNodeSize();
        java.lang.String str9 = element7.nodeName();
        org.jsoup.nodes.Element element10 = element4.appendChild((org.jsoup.nodes.Node) element7);
        org.jsoup.select.Elements elements11 = element4.siblingElements();
        org.jsoup.nodes.Element element12 = element4.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element12.lastElementSibling();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexGreaterThan((int) (short) 0);
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element9.appendText("");
        int int12 = element11.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList13 = element11.textNodes();
        org.jsoup.select.Elements elements15 = element11.getElementsByIndexGreaterThan((int) (short) 0);
        org.jsoup.nodes.Element element17 = element11.toggleClass("");
        boolean boolean18 = element3.hasSameValue((java.lang.Object) "");
        org.jsoup.nodes.Element element20 = element3.addClass("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        java.util.Set<java.lang.String> strSet21 = element3.classNames();
        org.jsoup.select.Elements elements23 = element3.getElementsContainingOwnText("<<hi!>\n</hi!>></<hi!>\n</hi!>>");
        java.lang.String str24 = element3.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = element3.firstElementSibling();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        boolean boolean4 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements6 = element1.getElementsByIndexEquals((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element1.lastElementSibling();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element12 = element10.appendText("");
        java.util.Set<java.lang.String> strSet13 = element12.classNames();
        org.jsoup.nodes.Element element14 = element4.classNames(strSet13);
        org.jsoup.select.Elements elements16 = element14.getElementsByIndexLessThan((int) (byte) 0);
        org.jsoup.select.Elements elements19 = element14.getElementsByAttributeValue("<<hi!>\n</hi!>></<hi!>\n</hi!>>", "<hi! class=\"\">\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element14.lastElementSibling();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        java.lang.String str3 = element1.nodeName();
        element1.setBaseUri("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element1.wrap("<hi! hi!.hi!.<hi!></hi!>=\"<hi!></hi!>\" class=\"\">\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element10 = element4.addClass("");
        org.jsoup.select.Elements elements12 = element4.getElementsByTag("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element14 = element4.text("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        boolean boolean15 = element14.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element14.lastElementSibling();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsMatchingText("");
        java.lang.String str9 = element4.toString();
        org.jsoup.nodes.Attributes attributes10 = element4.attributes();
        org.jsoup.select.Elements elements11 = element4.children();
        java.lang.String str12 = element4.cssSelector();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element16 = element14.appendText("");
        int int17 = element16.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList18 = element16.textNodes();
        java.lang.String str19 = element16.nodeName();
        org.jsoup.nodes.Element element21 = element16.text("<hi!></hi!>");
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str24 = element23.id();
        java.lang.Integer int25 = element23.elementSiblingIndex();
        org.jsoup.nodes.Element element26 = element23.empty();
        java.lang.String str27 = element26.outerHtml();
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element("hi!");
        int int30 = element29.childNodeSize();
        java.lang.String str31 = element29.nodeName();
        org.jsoup.nodes.Element element32 = element26.appendChild((org.jsoup.nodes.Node) element29);
        org.jsoup.select.Elements elements34 = element32.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element38 = element36.appendText("");
        int int39 = element38.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList40 = element38.textNodes();
        java.lang.String str41 = element38.data();
        org.jsoup.nodes.Element element42 = element32.prependChild((org.jsoup.nodes.Node) element38);
        java.util.Set<java.lang.String> strSet43 = element42.classNames();
        org.jsoup.nodes.Element element44 = element21.classNames(strSet43);
        org.jsoup.nodes.Element element45 = element4.classNames(strSet43);
        org.jsoup.select.Elements elements47 = element4.getElementsContainingOwnText("<hi!>\n <hi!></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element48 = element4.lastElementSibling();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Element element9 = element7.tagName("hi!");
        org.jsoup.select.Elements elements11 = element7.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element13 = element7.addClass("<hi!></hi!>");
        org.jsoup.select.Elements elements15 = element7.getElementsMatchingText("hi!");
        java.util.Set<java.lang.String> strSet16 = element7.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element7.wrap("<hi!> <hi!></hi!> </hi!>");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element1.nodeName();
        org.jsoup.nodes.Element element7 = element1.appendText("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str10 = element9.id();
        java.lang.Integer int11 = element9.elementSiblingIndex();
        org.jsoup.nodes.Element element12 = element9.empty();
        java.lang.String str13 = element12.outerHtml();
        org.jsoup.select.Elements elements16 = element12.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element20 = element18.appendText("");
        java.util.Set<java.lang.String> strSet21 = element20.classNames();
        org.jsoup.nodes.Element element22 = element12.classNames(strSet21);
        org.jsoup.nodes.Element element23 = element1.classNames(strSet21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = element23.wrap("<hi! class=\"\"></hi!>");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        int int8 = element7.childNodeSize();
        java.lang.String str9 = element7.nodeName();
        org.jsoup.nodes.Element element10 = element4.appendChild((org.jsoup.nodes.Node) element7);
        org.jsoup.nodes.Element element12 = element4.html("<hi!></hi!>");
        org.jsoup.select.Elements elements14 = element4.getElementsByClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element18 = element16.appendText("");
        org.jsoup.nodes.Element element20 = element18.removeClass("<hi!></hi!>");
        org.jsoup.select.Elements elements22 = element20.getElementsByClass("hi!");
        java.lang.String str23 = element20.val();
        boolean boolean25 = element20.hasClass("hi!");
        org.jsoup.nodes.Element element26 = element4.appendChild((org.jsoup.nodes.Node) element20);
        org.jsoup.parser.Tag tag27 = element4.tag();
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element(tag27, "");
        org.jsoup.nodes.Element element31 = element29.prepend("hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element33 = element29.appendText("<hi!>\n hi!\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element34 = element29.firstElementSibling();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Attributes attributes8 = element7.attributes();
        org.jsoup.nodes.Node node9 = element7.parentNode();
        java.util.Set<java.lang.String> strSet10 = element7.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element7.wrap("<hi!> \n <hi!></hi!> \n</hi!>");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        java.lang.String str4 = element1.className();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList5 = element1.dataNodes();
        org.jsoup.nodes.Element element8 = element1.attr("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        java.lang.String str9 = element8.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element8.wrap("<hi! value=\"<hi!></hi!>\">\n <hi! class=\"\">\n </hi!>\n <hi!>\n  <hi!>\n  </hi!>\n  <hi!></hi!>\n </hi!>\n</hi!>");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexGreaterThan((int) (short) 0);
        org.jsoup.select.Elements elements10 = element3.getElementsByAttributeValueMatching("hi!", "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element11 = element3.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element11.wrap("<hi! class=\"\">&lt;hi!&gt; &lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        java.lang.String str3 = element1.nodeName();
        java.util.Set<java.lang.String> strSet4 = element1.classNames();
        org.jsoup.nodes.Element element6 = element1.removeClass("hi!.hi!.\n<hi!></hi!>");
        org.jsoup.select.Elements elements8 = element1.getElementsByClass("hi!.hi!.\n<hi!></hi!>");
        java.lang.String str9 = element1.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element1.wrap("<hi! class=\"\">&lt;hi!&gt; &lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        boolean boolean6 = element4.hasAttr("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element8 = element4.removeClass("<hi!>\n <hi!></hi!>\n</hi!>");
        java.lang.String str9 = element8.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element8.lastElementSibling();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.className();
        org.jsoup.nodes.Element element4 = element1.html("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsContainingText("<hi!></hi!>");
        org.jsoup.nodes.Node node8 = element4.removeAttr("<hi!>\n</hi!>");
        java.lang.String str9 = element4.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element4.lastElementSibling();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.val("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = element1.siblingNodes();
        java.lang.String str5 = element1.html();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element9 = element7.appendText("");
        org.jsoup.nodes.Element element11 = element9.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Node node12 = element9.parentNode();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str15 = element14.id();
        java.lang.Integer int16 = element14.elementSiblingIndex();
        org.jsoup.nodes.Element element17 = element14.empty();
        java.lang.String str18 = element17.outerHtml();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        int int21 = element20.childNodeSize();
        java.lang.String str22 = element20.nodeName();
        org.jsoup.nodes.Element element23 = element17.appendChild((org.jsoup.nodes.Node) element20);
        org.jsoup.select.Elements elements25 = element23.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element26 = element9.prependChild((org.jsoup.nodes.Node) element23);
        org.jsoup.nodes.Node node28 = element26.childNode((int) (short) 0);
        org.jsoup.nodes.Element element29 = element1.prependChild(node28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element30 = element29.lastElementSibling();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet9 = element8.classNames();
        org.jsoup.nodes.Element element11 = element8.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.select.Elements elements13 = element11.getElementsMatchingText("");
        org.jsoup.nodes.Element element15 = element11.val("");
        org.jsoup.select.Elements elements17 = element15.getElementsMatchingOwnText("hi!");
        org.jsoup.nodes.Element element19 = element15.removeClass("<hi! class=\"\">\n</hi!>");
        boolean boolean20 = element15.isBlock();
        element15.setBaseUri("<hi! class=\"\"></hi!>");
        int int23 = element15.childNodeSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element24 = element15.firstElementSibling();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Element element9 = element7.tagName("hi!");
        org.jsoup.select.Elements elements11 = element7.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element13 = element7.addClass("<hi!></hi!>");
        org.jsoup.nodes.Element element15 = element7.addClass("<hi!></hi!>");
        java.lang.String str16 = element15.val();
        java.lang.String str17 = element15.cssSelector();
        org.jsoup.nodes.Attributes attributes18 = element15.attributes();
        java.lang.String str19 = element15.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element15.firstElementSibling();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        int int8 = element7.childNodeSize();
        java.lang.String str9 = element7.nodeName();
        org.jsoup.nodes.Element element10 = element4.appendChild((org.jsoup.nodes.Node) element7);
        org.jsoup.select.Elements elements11 = element4.siblingElements();
        org.jsoup.nodes.Document document12 = element4.ownerDocument();
        org.jsoup.nodes.Node node14 = element4.childNode((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element4.wrap("<hi! <hi! class=\"\">\n</hi!>></hi!>");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet9 = element8.classNames();
        org.jsoup.nodes.Element element11 = element8.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element13 = element11.html("");
        org.jsoup.nodes.Element element15 = element11.removeClass("<hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element15.wrap("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        boolean boolean4 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element6 = element1.appendElement("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element1.lastElementSibling();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        org.jsoup.parser.Tag tag5 = element4.tag();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str9 = element8.id();
        java.lang.Integer int10 = element8.elementSiblingIndex();
        org.jsoup.nodes.Element element11 = element8.empty();
        org.jsoup.parser.Tag tag12 = element11.tag();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str16 = element15.id();
        java.lang.Integer int17 = element15.elementSiblingIndex();
        java.lang.String str18 = element15.className();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList19 = element15.dataNodes();
        org.jsoup.nodes.Element element22 = element15.attr("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element24 = element15.appendElement("hi!");
        org.jsoup.nodes.Attributes attributes25 = element24.attributes();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag12, "<hi!>\n <hi!></hi!>\n</hi!>", attributes25);
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element(tag5, "hi!.hi!.<hi!></hi!>", attributes25);
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str31 = element30.id();
        java.lang.Integer int32 = element30.elementSiblingIndex();
        org.jsoup.nodes.Element element33 = element30.empty();
        java.lang.String str34 = element33.outerHtml();
        org.jsoup.parser.Tag tag35 = element33.tag();
        org.jsoup.nodes.Element element37 = new org.jsoup.nodes.Element(tag35, "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element39 = new org.jsoup.nodes.Element(tag35, "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element42 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str43 = element42.id();
        java.lang.Integer int44 = element42.elementSiblingIndex();
        java.lang.String str45 = element42.className();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList46 = element42.dataNodes();
        org.jsoup.nodes.Element element49 = element42.attr("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element51 = element42.appendElement("hi!");
        org.jsoup.nodes.Attributes attributes52 = element51.attributes();
        org.jsoup.nodes.Element element53 = new org.jsoup.nodes.Element(tag35, "hi!.hi!.\n<hi!></hi!>", attributes52);
        org.jsoup.nodes.Element element54 = new org.jsoup.nodes.Element(tag5, "hi!.hi!.\n<hi!></hi!>", attributes52);
        org.jsoup.nodes.Element element56 = new org.jsoup.nodes.Element(tag5, "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element58 = element56.wrap("<hi! class=\"<hi!></hi!>\"></hi!><hi!> </hi!>");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Element element9 = element7.toggleClass("<hi!></hi!>");
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element11.appendText("");
        int int14 = element13.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList15 = element13.textNodes();
        org.jsoup.nodes.Element element16 = element7.prependChild((org.jsoup.nodes.Node) element13);
        java.lang.String str17 = element7.html();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str20 = element19.id();
        java.lang.Integer int21 = element19.elementSiblingIndex();
        java.lang.String str22 = element19.className();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList23 = element19.dataNodes();
        org.jsoup.nodes.Element element26 = element19.attr("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element28 = element19.appendElement("hi!");
        org.jsoup.nodes.Attributes attributes29 = element28.attributes();
        org.jsoup.nodes.Element element30 = element7.appendChild((org.jsoup.nodes.Node) element28);
        java.lang.String str31 = element30.ownText();
        java.lang.String str32 = element30.ownText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element33 = element30.lastElementSibling();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        org.jsoup.nodes.Element element6 = element1.append("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str9 = element8.id();
        java.lang.Integer int10 = element8.elementSiblingIndex();
        org.jsoup.nodes.Element element11 = element8.empty();
        java.lang.String str12 = element11.outerHtml();
        org.jsoup.parser.Tag tag13 = element11.tag();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str17 = element16.id();
        org.jsoup.nodes.Element element19 = element16.removeClass("");
        java.lang.String str21 = element19.absUrl("hi!");
        org.jsoup.nodes.Element element23 = element19.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet24 = element23.classNames();
        org.jsoup.nodes.Element element26 = element23.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Attributes attributes27 = element26.attributes();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag13, "<hi! class=\"\"></hi!>", attributes27);
        java.util.Set<java.lang.String> strSet29 = element28.classNames();
        java.util.Set<java.lang.String> strSet30 = element28.classNames();
        org.jsoup.nodes.Element element31 = element6.classNames(strSet30);
        java.lang.String str32 = element31.outerHtml();
        org.jsoup.nodes.Element element34 = element31.val("<hi!>\n hi!\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element35 = element31.lastElementSibling();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList3 = element1.childNodesCopy();
        boolean boolean5 = element1.hasClass("<hi!>\n</hi!>");
        org.jsoup.parser.Tag tag6 = element1.tag();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element(tag6, "<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element8.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element8.lastElementSibling();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        java.lang.String str6 = element3.nodeName();
        org.jsoup.nodes.Element element8 = element3.text("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList9 = element8.dataNodes();
        org.jsoup.nodes.Element element10 = element8.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element10.lastElementSibling();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        org.jsoup.nodes.Element element5 = element1.clone();
        org.jsoup.parser.Tag tag6 = element5.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element5.lastElementSibling();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Element element9 = element7.tagName("hi!");
        org.jsoup.select.Elements elements11 = element7.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element13 = element7.addClass("<hi!></hi!>");
        org.jsoup.nodes.Element element15 = element7.addClass("<hi!></hi!>");
        java.lang.String str16 = element15.val();
        java.lang.String str17 = element15.cssSelector();
        org.jsoup.select.Elements elements18 = element15.parents();
        org.jsoup.nodes.Element element21 = element15.attr("<hi! class=\"\">\n</hi!>", true);
        org.jsoup.nodes.Element element23 = element15.prepend("<hi! class=\"\" value=\"\">\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element25 = element15.removeClass("<hi!></hi!>\n<hi! class=\"\">\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element26 = element25.lastElementSibling();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = element4.empty();
        java.lang.String str10 = element9.data();
        org.jsoup.nodes.Element element12 = element9.appendText("<hi!>\n <hi!></hi!>\n</hi!>");
        java.lang.String str13 = element12.baseUri();
        boolean boolean14 = element12.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element12.lastElementSibling();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        java.lang.String str3 = element1.nodeName();
        element1.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = element1.toggleClass("hi!.hi!.<hi!></hi!>");
        element1.setBaseUri("");
        org.jsoup.nodes.Element element12 = element1.attr("hi!", "<hi! <hi! class=\"\">\n</hi!>></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element12.wrap("<hi!.hi!.></hi!.hi!.>");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.select.Elements elements10 = element7.getElementsByAttributeValueMatching("<hi!></hi!>", "hi!.<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element7.wrap("&lt;hi! class=\"\"&gt;&amp;lt;hi!&amp;gt; &amp;lt;hi!&amp;gt; &amp;lt;hi!&amp;gt;&amp;lt;/hi!&amp;gt; &amp;lt;/hi!&amp;gt; &amp;lt;/hi!&amp;gt; &lt;/hi!&gt;&lt;hi!&gt; &lt;/hi!&gt;");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        java.lang.String str3 = element1.nodeName();
        org.jsoup.nodes.Node node4 = element1.root();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str7 = element6.id();
        java.lang.Integer int8 = element6.elementSiblingIndex();
        org.jsoup.nodes.Element element9 = element6.empty();
        java.lang.String str10 = element9.outerHtml();
        org.jsoup.parser.Tag tag11 = element9.tag();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag11, "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag11, "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element16 = element15.empty();
        org.jsoup.nodes.Element element18 = element15.append("<hi! class=\"\">\n</hi!>");
        org.jsoup.nodes.Element element19 = element1.appendChild((org.jsoup.nodes.Node) element15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element19.wrap("<hi! class=\"<hi!></hi!>\"></hi!><hi!> </hi!>");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.parser.Tag tag6 = element4.tag();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element(tag6, "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag6, "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str14 = element13.id();
        org.jsoup.nodes.Element element16 = element13.removeClass("");
        java.lang.String str18 = element16.absUrl("hi!");
        org.jsoup.nodes.Element element20 = element16.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet21 = element20.classNames();
        org.jsoup.nodes.Element element23 = element20.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Attributes attributes24 = element23.attributes();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag6, "<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>", attributes24);
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element(tag6, "<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element(tag6, "<hi! class=\"\">\n</hi!>");
        java.lang.String str30 = element29.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element32 = element29.wrap("hi!.hi!.hi!.<hi!></hi!>");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element12 = element10.appendText("");
        java.util.Set<java.lang.String> strSet13 = element12.classNames();
        org.jsoup.nodes.Element element14 = element4.classNames(strSet13);
        org.jsoup.select.Elements elements16 = element14.getElementsByIndexLessThan((int) (byte) 0);
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList17 = element14.dataNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element14.firstElementSibling();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Node node6 = element3.parentNode();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str9 = element8.id();
        java.lang.Integer int10 = element8.elementSiblingIndex();
        org.jsoup.nodes.Element element11 = element8.empty();
        java.lang.String str12 = element11.outerHtml();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        int int15 = element14.childNodeSize();
        java.lang.String str16 = element14.nodeName();
        org.jsoup.nodes.Element element17 = element11.appendChild((org.jsoup.nodes.Node) element14);
        org.jsoup.select.Elements elements19 = element17.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element20 = element3.prependChild((org.jsoup.nodes.Node) element17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element3.firstElementSibling();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element1.nodeName();
        org.jsoup.nodes.Element element7 = element1.appendText("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str10 = element9.id();
        java.lang.Integer int11 = element9.elementSiblingIndex();
        org.jsoup.nodes.Element element12 = element9.empty();
        java.lang.String str13 = element12.outerHtml();
        org.jsoup.select.Elements elements16 = element12.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element20 = element18.appendText("");
        java.util.Set<java.lang.String> strSet21 = element20.classNames();
        org.jsoup.nodes.Element element22 = element12.classNames(strSet21);
        org.jsoup.nodes.Element element23 = element1.classNames(strSet21);
        org.jsoup.select.Elements elements26 = element23.getElementsByAttributeValueNot("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>", "hi!.hi!.<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = element23.childNodesCopy();
        org.jsoup.nodes.Element element29 = element23.appendElement("<hi! class=\"<hi!></hi!>\"></hi!>");
        int int30 = element23.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element32 = element23.wrap("hi!.hi!.");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.val("<hi!></hi!>");
        java.lang.String str5 = element1.attr("hi!.hi!.");
        java.lang.String str7 = element1.absUrl("<hi! class=\"\">\n</hi!>");
        boolean boolean9 = element1.hasAttr("<hi! class=\"\">\n hi!\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element1.firstElementSibling();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        int int8 = element7.childNodeSize();
        java.lang.String str9 = element7.nodeName();
        org.jsoup.nodes.Element element10 = element4.appendChild((org.jsoup.nodes.Node) element7);
        org.jsoup.select.Elements elements11 = element4.siblingElements();
        org.jsoup.nodes.Element element13 = element4.removeClass("");
        org.jsoup.nodes.Element element14 = element13.previousElementSibling();
        org.jsoup.nodes.Element element16 = element13.appendText("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.select.Elements elements19 = element16.getElementsByAttributeValue("<hi! class=\"\">\n</hi!>", "<hi! class=\"\"></hi!>");
        org.jsoup.select.Elements elements22 = element16.getElementsByAttributeValueMatching("<hi! class=\"<hi!></hi!>\"></hi!>", "<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element24 = element16.prepend("<hi!>\n <hi!></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = element16.firstElementSibling();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        org.jsoup.parser.Tag tag5 = element4.tag();
        org.jsoup.nodes.Element element7 = element4.tagName("hi!.<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element4.lastElementSibling();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        int int8 = element7.childNodeSize();
        java.lang.String str9 = element7.nodeName();
        org.jsoup.nodes.Element element10 = element4.appendChild((org.jsoup.nodes.Node) element7);
        org.jsoup.select.Elements elements12 = element10.getElementsContainingOwnText("hi!");
        java.lang.String str13 = element10.ownText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element10.lastElementSibling();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList9 = element8.textNodes();
        element8.setBaseUri("<hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element8.lastElementSibling();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        org.jsoup.nodes.Element element6 = element1.append("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str9 = element8.id();
        java.lang.Integer int10 = element8.elementSiblingIndex();
        org.jsoup.nodes.Element element11 = element8.empty();
        java.lang.String str12 = element11.outerHtml();
        org.jsoup.parser.Tag tag13 = element11.tag();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str17 = element16.id();
        org.jsoup.nodes.Element element19 = element16.removeClass("");
        java.lang.String str21 = element19.absUrl("hi!");
        org.jsoup.nodes.Element element23 = element19.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet24 = element23.classNames();
        org.jsoup.nodes.Element element26 = element23.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Attributes attributes27 = element26.attributes();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag13, "<hi! class=\"\"></hi!>", attributes27);
        java.util.Set<java.lang.String> strSet29 = element28.classNames();
        java.util.Set<java.lang.String> strSet30 = element28.classNames();
        org.jsoup.nodes.Element element31 = element6.classNames(strSet30);
        java.lang.String str32 = element31.outerHtml();
        java.lang.String str33 = element31.val();
        java.lang.String str34 = element31.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element35 = element31.lastElementSibling();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Attributes attributes8 = element7.attributes();
        org.jsoup.select.Elements elements11 = element7.getElementsByAttributeValue("<hi!></hi!>", "<hi!></hi!>");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str14 = element13.id();
        org.jsoup.nodes.Element element16 = element13.removeClass("");
        org.jsoup.nodes.Element element18 = element13.append("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str21 = element20.id();
        java.lang.Integer int22 = element20.elementSiblingIndex();
        org.jsoup.nodes.Element element23 = element20.empty();
        java.lang.String str24 = element23.outerHtml();
        org.jsoup.parser.Tag tag25 = element23.tag();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str29 = element28.id();
        org.jsoup.nodes.Element element31 = element28.removeClass("");
        java.lang.String str33 = element31.absUrl("hi!");
        org.jsoup.nodes.Element element35 = element31.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet36 = element35.classNames();
        org.jsoup.nodes.Element element38 = element35.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Attributes attributes39 = element38.attributes();
        org.jsoup.nodes.Element element40 = new org.jsoup.nodes.Element(tag25, "<hi! class=\"\"></hi!>", attributes39);
        java.util.Set<java.lang.String> strSet41 = element40.classNames();
        java.util.Set<java.lang.String> strSet42 = element40.classNames();
        org.jsoup.nodes.Element element43 = element18.classNames(strSet42);
        org.jsoup.nodes.Element element44 = element7.classNames(strSet42);
        org.jsoup.nodes.Element element46 = element7.addClass("hi!.hi!.<hi!></hi!>");
        org.jsoup.select.Elements elements49 = element46.getElementsByAttributeValue("<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>", "<hi!></hi!>");
        boolean boolean51 = element46.hasClass("hi!.hi!.");
        boolean boolean53 = element46.hasClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element54 = element46.lastElementSibling();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.select.Elements elements5 = element3.getElementsMatchingText("<hi! class=\"\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element3.wrap("<hi!> \n <hi!></hi!> \n</hi!>");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsMatchingText("");
        java.lang.String str9 = element4.toString();
        org.jsoup.nodes.Attributes attributes10 = element4.attributes();
        org.jsoup.select.Elements elements11 = element4.children();
        org.jsoup.nodes.Element element12 = element4.empty();
        java.lang.String str13 = element4.outerHtml();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList14 = element4.dataNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element4.lastElementSibling();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        int int8 = element7.childNodeSize();
        java.lang.String str9 = element7.nodeName();
        org.jsoup.nodes.Element element10 = element4.appendChild((org.jsoup.nodes.Node) element7);
        org.jsoup.nodes.Element element12 = element4.html("<hi!></hi!>");
        org.jsoup.nodes.Element element14 = element12.removeClass("<hi!></hi!>");
        boolean boolean15 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element14);
        org.jsoup.select.Elements elements18 = element14.getElementsByAttributeValueNot("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!>\n</hi!>");
        org.jsoup.nodes.Element element20 = element14.prependElement("hi!");
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element24 = element22.val("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = element22.siblingNodes();
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element29 = element27.appendText("");
        org.jsoup.nodes.Element element31 = element29.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element33 = element29.toggleClass("");
        org.jsoup.nodes.Element element35 = element33.tagName("hi!");
        boolean boolean36 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element35);
        org.jsoup.nodes.Element element37 = element22.appendChild((org.jsoup.nodes.Node) element35);
        java.lang.String str38 = element35.val();
        org.jsoup.select.Elements elements39 = element35.siblingElements();
        element20.replaceWith((org.jsoup.nodes.Node) element35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element41 = element20.lastElementSibling();
    }
}

