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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        boolean boolean4 = element1.isBlock();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        boolean boolean8 = element6.hasAttr("hi!");
        org.jsoup.nodes.Element element10 = element6.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element6.textNodes();
        org.jsoup.nodes.Element element12 = element1.prependChild((org.jsoup.nodes.Node) element6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element1.firstElementSibling();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element5 = element1.removeClass("");
        boolean boolean6 = element5.hasParent();
        org.jsoup.nodes.Node node7 = element5.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element5.firstElementSibling();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element5 = element1.removeClass("");
        boolean boolean6 = element5.hasParent();
        org.jsoup.nodes.Node node7 = element5.previousSibling();
        org.jsoup.nodes.Node node8 = element5.nextSibling();
        org.jsoup.select.Elements elements11 = element5.getElementsByAttributeValueNot("hi!", "<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element5.firstElementSibling();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        int int4 = element1.siblingIndex();
        element1.setBaseUri("");
        org.jsoup.nodes.Element element8 = element1.prependText("");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        boolean boolean12 = element10.hasAttr("hi!");
        boolean boolean13 = element10.isBlock();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        boolean boolean17 = element15.hasAttr("hi!");
        org.jsoup.nodes.Element element19 = element15.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList20 = element15.textNodes();
        org.jsoup.nodes.Element element21 = element10.prependChild((org.jsoup.nodes.Node) element15);
        org.jsoup.select.Elements elements23 = element10.getElementsMatchingText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList24 = element10.textNodes();
        java.lang.String str25 = element10.outerHtml();
        java.util.Set<java.lang.String> strSet26 = element10.classNames();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = element10.childNodes();
        org.jsoup.nodes.Element element28 = element1.appendTo(element10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element29 = element10.firstElementSibling();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.attr("", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = element1.firstElementSibling();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node3 = element1.removeAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = element1.firstElementSibling();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Node node5 = element1.root();
        java.lang.String str6 = element1.id();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element1.childNodes;
        java.util.List<org.jsoup.nodes.Node> nodeList8 = element1.ensureChildNodes();
        boolean boolean9 = element1.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element1.lastElementSibling();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element5 = element1.removeClass("");
        boolean boolean6 = element5.hasParent();
        org.jsoup.nodes.Node node7 = element5.previousSibling();
        org.jsoup.select.Elements elements8 = element5.siblingElements();
        boolean boolean9 = element5.hasAttributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element5.firstElementSibling();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element5 = element1.removeClass("");
        org.jsoup.nodes.Element element7 = element1.tagName("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        boolean boolean9 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element11 = element1.addClass("<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element11.firstElementSibling();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        boolean boolean4 = element1.isBlock();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        boolean boolean8 = element6.hasAttr("hi!");
        org.jsoup.nodes.Element element10 = element6.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element6.textNodes();
        org.jsoup.nodes.Element element12 = element1.prependChild((org.jsoup.nodes.Node) element6);
        java.lang.String str13 = element1.text();
        org.jsoup.select.Elements elements15 = element1.getElementsByAttributeStarting("<hi! class=\"<hi!></hi!>\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element1.wrap("hi!");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        java.lang.String str4 = element1.toString();
        org.jsoup.select.Elements elements5 = element1.siblingElements();
        boolean boolean6 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        int int9 = element8.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element8.wrap("<hi! class=\"\"></hi!>");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element5 = element1.removeClass("");
        java.lang.String str6 = element5.html();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element5.ensureChildNodes();
        java.lang.String str9 = element5.absUrl("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element5.lastElementSibling();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        java.lang.String str4 = element1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = element1.lastElementSibling();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element5 = element1.removeClass("");
        boolean boolean6 = element5.hasParent();
        org.jsoup.nodes.Node node7 = element5.previousSibling();
        org.jsoup.nodes.Node node8 = element5.nextSibling();
        org.jsoup.select.Elements elements11 = element5.getElementsByAttributeValueNot("hi!", "<hi!></hi!>");
        org.jsoup.nodes.Element element13 = element5.html("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element5.lastElementSibling();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element5 = element1.removeClass("");
        org.jsoup.nodes.Element element7 = element1.tagName("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        boolean boolean9 = element1.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element1.childNodesCopy();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        boolean boolean14 = element12.hasAttr("hi!");
        org.jsoup.nodes.Element element16 = element12.removeClass("");
        org.jsoup.nodes.Element element18 = element12.tagName("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        boolean boolean20 = element12.hasAttr("hi!");
        org.jsoup.nodes.Element element22 = element12.addClass("<hi!></hi!>");
        org.jsoup.nodes.Element element23 = element1.prependChild((org.jsoup.nodes.Node) element22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element24 = element23.firstElementSibling();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        java.lang.String str4 = element1.toString();
        org.jsoup.nodes.Node node5 = element1.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = element1.lastElementSibling();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        java.lang.String str4 = element1.toString();
        org.jsoup.select.Elements elements5 = element1.siblingElements();
        org.jsoup.nodes.Element element6 = element1.empty();
        org.jsoup.nodes.Element element9 = element6.attr("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>", "<hi! class=\"<hi!></hi!>\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element6.wrap("<hi!>\n <hi!>\n </hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Node node5 = element1.root();
        java.lang.String str6 = element1.id();
        org.jsoup.select.Elements elements9 = element1.getElementsByAttributeValueNot("hi!", "hi!");
        org.jsoup.nodes.Element element11 = element1.html("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element1.lastElementSibling();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        boolean boolean4 = element1.isBlock();
        int int5 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element8 = element1.attr("", false);
        java.lang.String[] strArray10 = new java.lang.String[] { "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        org.jsoup.nodes.Element element13 = element8.classNames((java.util.Set<java.lang.String>) strSet11);
        boolean boolean14 = element8.hasParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element8.wrap("<hi!>\n <hi!>\n </hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        java.lang.String str4 = element1.toString();
        org.jsoup.select.Elements elements5 = element1.siblingElements();
        boolean boolean6 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        java.lang.String str9 = element1.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element1.lastElementSibling();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        java.lang.String str4 = element1.toString();
        org.jsoup.nodes.Node node5 = element1.previousSibling();
        org.jsoup.select.Elements elements6 = element1.getAllElements();
        org.jsoup.nodes.Element element8 = element1.prepend("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element8.firstElementSibling();
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element5 = element1.removeClass("");
        org.jsoup.nodes.Element element7 = element1.tagName("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        boolean boolean9 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element11 = element1.addClass("<hi!></hi!>");
        org.jsoup.select.Elements elements13 = element11.getElementsMatchingText("<hi!>\n <hi!></hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element11.lastElementSibling();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Node node5 = element1.root();
        org.jsoup.nodes.Element element6 = element1.parent();
        org.jsoup.select.Elements elements8 = element1.getElementsByIndexGreaterThan((int) (byte) -1);
        org.jsoup.select.Elements elements11 = element1.getElementsByAttributeValueNot("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Attributes attributes12 = element1.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element1.firstElementSibling();
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        java.lang.String str4 = element1.toString();
        org.jsoup.select.Elements elements5 = element1.siblingElements();
        boolean boolean6 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        int int9 = element8.elementSiblingIndex();
        org.jsoup.nodes.Element element10 = element8.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element10.lastElementSibling();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        int int4 = element1.siblingIndex();
        element1.setBaseUri("");
        org.jsoup.nodes.Element element8 = element1.prependText("");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element1.childNodes;
        org.jsoup.select.Elements elements11 = element1.getElementsMatchingOwnText("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element1.lastElementSibling();
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element5 = element1.removeClass("");
        org.jsoup.nodes.Element element7 = element1.tagName("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Document document8 = element7.ownerDocument();
        org.jsoup.nodes.Element element10 = element7.prepend("<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element10.wrap("<hi!>\n <hi!>\n </hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Node node5 = element1.root();
        org.jsoup.nodes.Element element6 = element1.parent();
        org.jsoup.select.Elements elements8 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements10 = element1.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        boolean boolean14 = element12.hasAttr("hi!");
        int int15 = element12.siblingIndex();
        boolean boolean16 = element12.isBlock();
        org.jsoup.nodes.Element element17 = element12.empty();
        org.jsoup.nodes.Element element19 = element12.tagName("hi!");
        org.jsoup.nodes.Node node20 = element12.previousSibling();
        boolean boolean21 = element12.hasAttributes();
        org.jsoup.nodes.Element element23 = element12.prependElement("hi!");
        org.jsoup.nodes.Element element24 = element1.doClone((org.jsoup.nodes.Node) element23);
        org.jsoup.nodes.Element element26 = element1.appendElement("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element27 = element1.lastElementSibling();
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        java.lang.String str4 = element1.toString();
        org.jsoup.select.Elements elements5 = element1.siblingElements();
        org.jsoup.nodes.Element element7 = element1.getElementById("<hi!></hi!>");
        java.lang.String str8 = element1.ownText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element1.lastElementSibling();
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        java.lang.String str4 = element1.toString();
        org.jsoup.select.Elements elements5 = element1.siblingElements();
        boolean boolean6 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        boolean boolean10 = element8.hasAttr("hi!");
        boolean boolean11 = element8.isBlock();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        boolean boolean15 = element13.hasAttr("hi!");
        org.jsoup.nodes.Element element17 = element13.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList18 = element13.textNodes();
        org.jsoup.nodes.Element element19 = element8.prependChild((org.jsoup.nodes.Node) element13);
        org.jsoup.parser.Tag tag20 = element19.tag();
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element("hi!");
        boolean boolean24 = element22.hasAttr("hi!");
        boolean boolean25 = element22.isBlock();
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element("hi!");
        boolean boolean29 = element27.hasAttr("hi!");
        org.jsoup.nodes.Element element31 = element27.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList32 = element27.textNodes();
        org.jsoup.nodes.Element element33 = element22.prependChild((org.jsoup.nodes.Node) element27);
        org.jsoup.select.Elements elements35 = element22.getElementsMatchingText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList36 = element22.textNodes();
        java.lang.String str37 = element22.outerHtml();
        java.lang.String str38 = element22.cssSelector();
        org.jsoup.nodes.Element element39 = element19.appendChild((org.jsoup.nodes.Node) element22);
        org.jsoup.select.Elements elements41 = element22.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element43 = new org.jsoup.nodes.Element("hi!");
        boolean boolean45 = element43.hasAttr("hi!");
        java.lang.String str46 = element43.toString();
        org.jsoup.select.Elements elements47 = element43.siblingElements();
        org.jsoup.nodes.Node node48 = element43.root();
        org.jsoup.nodes.Element element49 = element43.clone();
        boolean boolean51 = element43.hasClass("hi!");
        org.jsoup.nodes.Element element52 = element22.prependChild((org.jsoup.nodes.Node) element43);
        org.jsoup.nodes.Element element53 = element52.empty();
        org.jsoup.nodes.Element element54 = element1.doClone((org.jsoup.nodes.Node) element52);
        org.jsoup.nodes.Element element56 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node58 = element56.removeAttr("hi!");
        org.jsoup.nodes.Element element60 = element56.tagName("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element61 = element52.before((org.jsoup.nodes.Node) element56);
        org.jsoup.nodes.Element element63 = element61.after("hi!");
        org.jsoup.nodes.Element element65 = new org.jsoup.nodes.Element("hi!");
        boolean boolean67 = element65.hasAttr("hi!");
        org.jsoup.nodes.Element element69 = element65.removeClass("");
        boolean boolean70 = element69.hasParent();
        org.jsoup.nodes.Element element72 = element69.append("hi!");
        org.jsoup.parser.Tag tag73 = element72.tag();
        boolean boolean74 = element63.equals((java.lang.Object) tag73);
        org.jsoup.parser.Tag tag75 = element63.tag();
        org.jsoup.nodes.Element element77 = new org.jsoup.nodes.Element(tag75, "<hi!>\n hi!\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element79 = element77.wrap("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        int int4 = element1.siblingIndex();
        boolean boolean5 = element1.isBlock();
        org.jsoup.nodes.Element element6 = element1.empty();
        org.jsoup.nodes.Element element8 = element1.tagName("hi!");
        org.jsoup.select.Elements elements11 = element1.getElementsByAttributeValueEnding("<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>", "<hi!>\n <hi! class=\"\"></hi!>\n <hi!>\n </hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element1.wrap("<hi! class=\"<hi!></hi!>\"></hi!>");
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element5 = element1.removeClass("");
        org.jsoup.nodes.Element element7 = element1.tagName("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Node node8 = element7.parentNode();
        int int9 = element7.childNodeSize();
        element7.setBaseUri("<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element7.firstElementSibling();
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = element1.firstElementSibling();
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element5 = element1.removeClass("");
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        boolean boolean9 = element7.hasAttr("hi!");
        boolean boolean10 = element7.isBlock();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        boolean boolean14 = element12.hasAttr("hi!");
        org.jsoup.nodes.Element element16 = element12.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element12.textNodes();
        org.jsoup.nodes.Element element18 = element7.prependChild((org.jsoup.nodes.Node) element12);
        org.jsoup.select.Elements elements20 = element7.getElementsMatchingText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList21 = element7.textNodes();
        java.lang.String str22 = element7.outerHtml();
        java.util.Set<java.lang.String> strSet23 = element7.classNames();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = element7.childNodes();
        element5.childNodes = nodeList24;
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList26 = element5.dataNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element27 = element5.lastElementSibling();
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element5 = element1.removeClass("");
        org.jsoup.nodes.Element element7 = element1.tagName("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        boolean boolean9 = element1.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element1.childNodesCopy();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        boolean boolean14 = element12.hasAttr("hi!");
        org.jsoup.nodes.Element element16 = element12.removeClass("");
        org.jsoup.nodes.Element element18 = element12.tagName("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        boolean boolean20 = element12.hasAttr("hi!");
        org.jsoup.nodes.Element element22 = element12.addClass("<hi!></hi!>");
        org.jsoup.nodes.Element element23 = element1.prependChild((org.jsoup.nodes.Node) element22);
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element("hi!");
        boolean boolean28 = element26.hasAttr("hi!");
        boolean boolean29 = element26.isBlock();
        int int30 = element26.elementSiblingIndex();
        org.jsoup.nodes.Element element33 = element26.attr("", false);
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element("hi!");
        boolean boolean38 = element36.hasAttr("hi!");
        boolean boolean39 = element36.isBlock();
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element("hi!");
        boolean boolean43 = element41.hasAttr("hi!");
        org.jsoup.nodes.Element element45 = element41.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList46 = element41.textNodes();
        org.jsoup.nodes.Element element47 = element36.prependChild((org.jsoup.nodes.Node) element41);
        org.jsoup.select.Elements elements49 = element36.getElementsMatchingText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList50 = element36.textNodes();
        org.jsoup.nodes.Element element51 = element26.insertChildren((int) (byte) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList50);
        org.jsoup.nodes.Element element52 = element23.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList50);
        org.jsoup.nodes.Node node53 = element52.parentNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element54 = element52.firstElementSibling();
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        boolean boolean4 = element1.isBlock();
        int int5 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element8 = element1.attr("", false);
        java.lang.String[] strArray10 = new java.lang.String[] { "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        org.jsoup.nodes.Element element13 = element8.classNames((java.util.Set<java.lang.String>) strSet11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element8.lastElementSibling();
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element5 = element1.removeClass("");
        boolean boolean6 = element5.hasParent();
        org.jsoup.nodes.Node node7 = element5.previousSibling();
        org.jsoup.nodes.Node node8 = element5.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element5.ensureChildNodes();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        boolean boolean13 = element11.hasAttr("hi!");
        org.jsoup.nodes.Element element15 = element11.removeClass("");
        boolean boolean16 = element15.hasParent();
        org.jsoup.nodes.Node node17 = element15.previousSibling();
        org.jsoup.nodes.Node node18 = element15.nextSibling();
        org.jsoup.select.Elements elements21 = element15.getElementsByAttributeValueNot("hi!", "<hi!></hi!>");
        org.jsoup.nodes.Element element22 = element5.prependChild((org.jsoup.nodes.Node) element15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = element5.firstElementSibling();
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Node node5 = element1.root();
        org.jsoup.select.Elements elements6 = element1.getAllElements();
        java.lang.String str7 = element1.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element1.lastElementSibling();
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.attr("", true);
        org.jsoup.nodes.Element element6 = element1.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element8.attr("", true);
        org.jsoup.nodes.Element element13 = element8.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element14 = element1.appendTo(element13);
        boolean boolean15 = element1.hasAttributes();
        org.jsoup.nodes.Element element17 = element1.text("<hi!></hi!>");
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        boolean boolean21 = element19.hasAttr("hi!");
        boolean boolean22 = element19.isBlock();
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        boolean boolean26 = element24.hasAttr("hi!");
        org.jsoup.nodes.Element element28 = element24.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList29 = element24.textNodes();
        org.jsoup.nodes.Element element30 = element19.prependChild((org.jsoup.nodes.Node) element24);
        org.jsoup.select.Elements elements32 = element19.getElementsMatchingText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList33 = element19.textNodes();
        java.lang.String str34 = element19.outerHtml();
        java.util.Set<java.lang.String> strSet35 = element19.classNames();
        boolean boolean37 = element19.hasClass("");
        org.jsoup.nodes.Element element39 = new org.jsoup.nodes.Element("hi!");
        boolean boolean41 = element39.hasAttr("hi!");
        boolean boolean42 = element39.isBlock();
        int int43 = element39.elementSiblingIndex();
        org.jsoup.nodes.Element element46 = element39.attr("", false);
        java.lang.String[] strArray48 = new java.lang.String[] { "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet49 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet49, strArray48);
        org.jsoup.nodes.Element element51 = element46.classNames((java.util.Set<java.lang.String>) strSet49);
        java.util.Set<java.lang.String> strSet52 = element46.classNames();
        org.jsoup.nodes.Element element53 = element19.classNames(strSet52);
        org.jsoup.nodes.Element element54 = element1.classNames(strSet52);
        element1.remove();
        java.util.List<org.jsoup.nodes.Node> nodeList56 = element1.childNodes;
        org.jsoup.nodes.Element element58 = element1.appendText("<hi! class=\"\"></hi!>");
        org.jsoup.select.Elements elements61 = element1.getElementsByAttributeValueEnding("<hi!></hi!>", "<hi! class=\"<hi!></hi!>\"></hi!>");
        java.lang.String str63 = element1.attr("<<hi!>\n <hi! class=\"\"></hi!>\n</hi!>></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element64 = element1.lastElementSibling();
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.attr("", true);
        org.jsoup.nodes.Node node5 = element1.parentNode();
        org.jsoup.select.Elements elements7 = element1.getElementsByAttribute("<hi!>\n <hi!>\n </hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element8 = element1.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element8.wrap("<<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>></<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>>");
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        boolean boolean4 = element1.isBlock();
        int int5 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element8 = element1.attr("", false);
        org.jsoup.select.Elements elements11 = element1.getElementsByAttributeValue("<hi! class=\"\"></hi!>", "<hi!>\n hi!\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element1.firstElementSibling();
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        java.lang.String str4 = element1.toString();
        org.jsoup.select.Elements elements5 = element1.siblingElements();
        org.jsoup.nodes.Node node6 = element1.root();
        org.jsoup.nodes.Element element7 = element1.clone();
        int int8 = element1.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element1.firstElementSibling();
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Node node5 = element1.root();
        org.jsoup.nodes.Element element6 = element1.parent();
        org.jsoup.select.Elements elements8 = element1.getElementsByIndexEquals((int) ' ');
        org.jsoup.nodes.Element element10 = element1.html("<hi! class=\"<hi!></hi!>\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element10.wrap("<hi! class=\"<hi!></hi!>\"></hi!>");
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        boolean boolean4 = element1.isBlock();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        boolean boolean8 = element6.hasAttr("hi!");
        org.jsoup.nodes.Element element10 = element6.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element6.textNodes();
        org.jsoup.nodes.Element element12 = element1.prependChild((org.jsoup.nodes.Node) element6);
        org.jsoup.select.Elements elements14 = element1.getElementsMatchingText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList15 = element1.textNodes();
        java.lang.String str16 = element1.outerHtml();
        java.util.Set<java.lang.String> strSet17 = element1.classNames();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = element1.childNodes();
        org.jsoup.nodes.Element element20 = element1.append("");
        org.jsoup.nodes.Element element22 = element20.tagName("<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = element22.firstElementSibling();
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        boolean boolean4 = element1.isBlock();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        boolean boolean8 = element6.hasAttr("hi!");
        org.jsoup.nodes.Element element10 = element6.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element6.textNodes();
        org.jsoup.nodes.Element element12 = element1.prependChild((org.jsoup.nodes.Node) element6);
        java.lang.String str13 = element1.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element1.firstElementSibling();
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Node node5 = element1.root();
        java.lang.String str6 = element1.id();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element1.childNodes;
        org.jsoup.nodes.Element element9 = element1.appendText("<<hi!>\n <hi! class=\"\"></hi!>\n</hi!>></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element9.firstElementSibling();
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element5 = element1.removeClass("");
        boolean boolean6 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element5);
        org.jsoup.select.Elements elements9 = element5.getElementsByAttributeValueContaining("hi!", "<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element5.firstElementSibling();
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element5 = element1.removeClass("");
        org.jsoup.nodes.Element element7 = element1.tagName("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        boolean boolean9 = element1.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element1.childNodesCopy();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        boolean boolean14 = element12.hasAttr("hi!");
        org.jsoup.nodes.Element element16 = element12.removeClass("");
        org.jsoup.nodes.Element element18 = element12.tagName("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        boolean boolean20 = element12.hasAttr("hi!");
        org.jsoup.nodes.Element element22 = element12.addClass("<hi!></hi!>");
        org.jsoup.nodes.Element element23 = element1.prependChild((org.jsoup.nodes.Node) element22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = element23.wrap("<hi! class=\"\">\n <hi! class=\"\"></hi!>\n</hi!>");
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.attr("", true);
        org.jsoup.nodes.Node node5 = element1.parentNode();
        org.jsoup.select.Elements elements7 = element1.getElementsByAttribute("<hi!>\n <hi!>\n </hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element1.lastElementSibling();
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Node node5 = element1.root();
        java.lang.String str6 = element1.id();
        org.jsoup.select.Elements elements9 = element1.getElementsByAttributeValueNot("hi!", "hi!");
        org.jsoup.nodes.Element element11 = element1.html("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element11.firstElementSibling();
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element5 = element1.removeClass("");
        org.jsoup.nodes.Element element7 = element1.tagName("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        boolean boolean9 = element1.hasAttr("hi!");
        org.jsoup.nodes.Node node11 = element1.removeAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element1.firstElementSibling();
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element5 = element1.removeClass("");
        org.jsoup.nodes.Element element7 = element1.tagName("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element1.wrap("<hi! class=\"\">\n <hi! class=\"\"></hi!>\n</hi!>");
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        java.lang.String str4 = element1.toString();
        org.jsoup.select.Elements elements5 = element1.siblingElements();
        boolean boolean6 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsContainingOwnText("");
        element8.setBaseUri("<hi!>\n <hi! class=\"\"></hi!>\n <hi!>\n </hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element8.firstElementSibling();
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        java.lang.String str4 = element1.toString();
        org.jsoup.select.Elements elements5 = element1.siblingElements();
        boolean boolean6 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element8.lastElementSibling();
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi! class=\"<hi!></hi!>\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = element1.lastElementSibling();
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Node node5 = element1.root();
        java.lang.String str6 = element1.id();
        org.jsoup.select.Elements elements9 = element1.getElementsByAttributeValueNot("hi!", "hi!");
        org.jsoup.nodes.Node node10 = element1.clearAttributes();
        org.jsoup.nodes.Element element12 = element1.appendElement("<hi!>\n <hi!></hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element1.firstElementSibling();
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element5 = element1.removeClass("");
        org.jsoup.nodes.Element element7 = element1.text("hi!");
        org.jsoup.nodes.Element element9 = element1.removeClass("<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>");
        org.jsoup.nodes.Element element11 = element1.html("<hi! >\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element1.lastElementSibling();
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element5 = element1.removeClass("");
        boolean boolean6 = element5.hasParent();
        org.jsoup.nodes.Element element8 = element5.append("hi!");
        boolean boolean9 = element5.hasParent();
        boolean boolean11 = element5.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element5.wrap("<hi!>\n <hi!>\n </hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        boolean boolean4 = element1.isBlock();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        boolean boolean8 = element6.hasAttr("hi!");
        org.jsoup.nodes.Element element10 = element6.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element6.textNodes();
        org.jsoup.nodes.Element element12 = element1.prependChild((org.jsoup.nodes.Node) element6);
        org.jsoup.nodes.Element element14 = element6.wrap("<hi!></hi!>");
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        boolean boolean18 = element16.hasAttr("hi!");
        boolean boolean19 = element16.isBlock();
        int int20 = element16.elementSiblingIndex();
        org.jsoup.select.Elements elements22 = element16.getElementsByIndexGreaterThan((int) (byte) 0);
        element6.replaceWith((org.jsoup.nodes.Node) element16);
        org.jsoup.nodes.Element element25 = element16.text("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element27 = element25.val("<hi!>\n hi!\n</hi!>");
        org.jsoup.select.Elements elements29 = element27.getElementsByIndexEquals((int) '#');
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element("hi!");
        boolean boolean33 = element31.hasAttr("hi!");
        int int34 = element31.siblingIndex();
        element31.setBaseUri("");
        org.jsoup.nodes.Element element38 = element31.prependText("");
        org.jsoup.nodes.Element element40 = element31.append("");
        java.util.List<org.jsoup.nodes.Node> nodeList41 = element40.ensureChildNodes();
        element27.replaceWith((org.jsoup.nodes.Node) element40);
        java.lang.String str44 = element27.attr("<hi!>\n <hi! class=\"\"></hi!>\n <hi!>\n </hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element46 = element27.wrap("<hi! class=\"\">\n &lt;\n <hi!></hi!>&gt; \n <hi! value=\"hi!\">\n   &lt;hi!&gt;&lt;/hi!&gt; \n </hi!> \n <!--<hi!-->&gt;\n</hi!>");
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        boolean boolean4 = element1.isBlock();
        int int5 = element1.elementSiblingIndex();
        org.jsoup.select.Elements elements7 = element1.getElementsByIndexGreaterThan((int) (byte) 0);
        org.jsoup.nodes.Element element9 = element1.text("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.select.Elements elements12 = element1.getElementsByAttributeValueStarting("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element1.firstElementSibling();
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element5 = element1.removeClass("");
        org.jsoup.nodes.Element element7 = element1.tagName("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        boolean boolean9 = element1.hasAttr("hi!");
        org.jsoup.nodes.Node node11 = element1.removeAttr("");
        org.jsoup.nodes.Attributes attributes12 = element1.attributes();
        org.jsoup.parser.Tag tag13 = element1.tag();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        boolean boolean18 = element16.hasAttr("hi!");
        org.jsoup.nodes.Element element20 = element16.removeClass("");
        org.jsoup.nodes.Element element22 = element16.tagName("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        boolean boolean24 = element16.hasAttr("hi!");
        org.jsoup.nodes.Node node26 = element16.removeAttr("");
        org.jsoup.nodes.Attributes attributes27 = element16.attributes();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag13, "<hi!></hi!>", attributes27);
        org.jsoup.nodes.Element element30 = element28.addClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element("hi!");
        boolean boolean34 = element32.hasAttr("hi!");
        java.lang.String str35 = element32.toString();
        org.jsoup.nodes.Element element37 = element32.html("hi!");
        org.jsoup.select.Elements elements40 = element37.getElementsByAttributeValueStarting("hi!", "<hi! class=\"\"></hi!>");
        boolean boolean41 = element30.equals((java.lang.Object) "<hi! class=\"\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element43 = element30.wrap("<hi!>\n <hi! class=\"\"></hi!>\n <hi!>\n </hi!>\n</hi!>");
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        boolean boolean4 = element1.isBlock();
        int int5 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element8 = element1.attr("", false);
        java.lang.String[] strArray10 = new java.lang.String[] { "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        org.jsoup.nodes.Element element13 = element8.classNames((java.util.Set<java.lang.String>) strSet11);
        java.util.Set<java.lang.String> strSet14 = element8.classNames();
        boolean boolean16 = element8.hasAttr("");
        org.jsoup.select.Elements elements19 = element8.getElementsByAttributeValueStarting("<hi! class=\"<hi!></hi!>\"></hi!>", "<hi! class=\"<hi!></hi!>\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element8.firstElementSibling();
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        boolean boolean4 = element1.isBlock();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        boolean boolean8 = element6.hasAttr("hi!");
        org.jsoup.nodes.Element element10 = element6.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element6.textNodes();
        org.jsoup.nodes.Element element12 = element1.prependChild((org.jsoup.nodes.Node) element6);
        org.jsoup.select.Elements elements14 = element1.getElementsMatchingText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList15 = element1.textNodes();
        java.lang.String str16 = element1.outerHtml();
        java.util.Set<java.lang.String> strSet17 = element1.classNames();
        boolean boolean19 = element1.hasClass("");
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        boolean boolean23 = element21.hasAttr("hi!");
        boolean boolean24 = element21.isBlock();
        int int25 = element21.elementSiblingIndex();
        org.jsoup.nodes.Element element28 = element21.attr("", false);
        java.lang.String[] strArray30 = new java.lang.String[] { "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        org.jsoup.nodes.Element element33 = element28.classNames((java.util.Set<java.lang.String>) strSet31);
        java.util.Set<java.lang.String> strSet34 = element28.classNames();
        org.jsoup.nodes.Element element35 = element1.classNames(strSet34);
        org.jsoup.select.Elements elements37 = element35.getElementsByAttribute("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element39 = element35.val("<<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>></<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element40 = element39.firstElementSibling();
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        boolean boolean4 = element1.isBlock();
        int int5 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element8 = element1.attr("", false);
        org.jsoup.nodes.Element element9 = element1.parent();
        java.lang.String str10 = element1.nodeName();
        org.jsoup.nodes.Element element12 = element1.addClass("");
        java.lang.String str13 = element12.val();
        java.lang.String str14 = element12.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element12.wrap("&lt;hi! class=\"&lt;hi!&gt;&lt;/hi!&gt;\"&gt;&lt;/hi!&gt;");
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.attr("", true);
        org.jsoup.nodes.Element element6 = element1.appendText("<hi!></hi!>");
        boolean boolean8 = element1.hasClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element1.childNodes();
        java.lang.String str10 = element1.ownText();
        java.lang.String str11 = element1.html();
        java.lang.String str12 = element1.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element1.firstElementSibling();
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.attr("", true);
        java.util.List<org.jsoup.nodes.Node> nodeList5 = element4.childNodes;
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        boolean boolean9 = element7.hasAttr("hi!");
        boolean boolean10 = element7.isBlock();
        int int11 = element7.elementSiblingIndex();
        org.jsoup.nodes.Element element14 = element7.attr("", false);
        java.lang.String[] strArray16 = new java.lang.String[] { "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.jsoup.nodes.Element element19 = element14.classNames((java.util.Set<java.lang.String>) strSet17);
        java.util.List<org.jsoup.nodes.Node> nodeList20 = element14.childNodes();
        java.lang.String str21 = element14.toString();
        org.jsoup.nodes.Element element22 = element4.prependChild((org.jsoup.nodes.Node) element14);
        org.jsoup.nodes.Element element24 = element4.tagName("<hi!>\n <hi!>\n </hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Node node25 = element4.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element26 = element4.firstElementSibling();
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Node node5 = element1.root();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.ensureChildNodes();
        org.jsoup.nodes.Element element8 = element1.text("<<hi! class=\"<hi!></hi!>\"></hi!>></<hi! class=\"<hi!></hi!>\"></hi!>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element1.lastElementSibling();
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi! class=\"\">\n <hi! class=\"\"></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = element1.firstElementSibling();
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        int int4 = element1.siblingIndex();
        boolean boolean5 = element1.isBlock();
        org.jsoup.nodes.Element element6 = element1.empty();
        org.jsoup.nodes.Element element8 = element1.tagName("hi!");
        org.jsoup.nodes.Node node9 = element1.previousSibling();
        boolean boolean10 = element1.hasAttributes();
        org.jsoup.nodes.Element element12 = element1.prependElement("hi!");
        org.jsoup.parser.Tag tag13 = element1.tag();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag13, "<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>");
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element(tag13, "<hi!>\n &lt;hi!&gt; &lt;hi!&gt; &lt;/hi!&gt; &lt;hi! class=\"\"&gt;&lt;/hi!&gt; &lt;/hi!&gt;\n <hi! class=\"\"> \n  <hi! class=\"\"></hi!> \n </hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element17.firstElementSibling();
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Node node5 = element1.root();
        org.jsoup.nodes.Element element6 = element1.parent();
        org.jsoup.select.Elements elements8 = element1.getElementsMatchingText("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element1.lastElementSibling();
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        java.lang.String str4 = element1.toString();
        org.jsoup.select.Elements elements5 = element1.siblingElements();
        boolean boolean6 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsContainingOwnText("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element8.firstElementSibling();
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        boolean boolean4 = element1.isBlock();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        boolean boolean8 = element6.hasAttr("hi!");
        org.jsoup.nodes.Element element10 = element6.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element6.textNodes();
        org.jsoup.nodes.Element element12 = element1.prependChild((org.jsoup.nodes.Node) element6);
        org.jsoup.select.Elements elements14 = element1.getElementsMatchingText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = element1.siblingNodes();
        org.jsoup.nodes.Node node16 = element1.nextSibling();
        element1.setBaseUri("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element20 = element1.html("<hi!>\n <hi!></hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Node node21 = element20.root();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = element20.childNodes();
        boolean boolean24 = element20.hasClass("<hi!>\n &lt;\n <hi!></hi!>&gt; \n <hi! value=\"hi!\">\n   &lt;hi!&gt;&lt;/hi!&gt; \n </hi!> \n <!--<hi!-->&gt;\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = element20.firstElementSibling();
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Node node5 = element1.root();
        org.jsoup.nodes.Element element6 = element1.parent();
        org.jsoup.select.Elements elements8 = element1.getElementsMatchingText("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        boolean boolean10 = element1.hasClass("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.select.Elements elements12 = element1.getElementsContainingText("");
        org.jsoup.nodes.Element element13 = element1.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element1.lastElementSibling();
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        java.lang.String str4 = element1.toString();
        org.jsoup.select.Elements elements5 = element1.siblingElements();
        boolean boolean6 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element9 = element1.attr("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>", true);
        org.jsoup.nodes.Element element11 = element9.prepend("<<hi!>\n <hi! class=\"\"></hi!>\n</hi!>></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element11.wrap("<hi!>\n <hi!> \n  <hi! class=\"\"></hi!> \n  <hi!> \n  </hi!> \n </hi!>\n</hi!>");
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        boolean boolean4 = element1.isBlock();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        boolean boolean8 = element6.hasAttr("hi!");
        org.jsoup.nodes.Element element10 = element6.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element6.textNodes();
        org.jsoup.nodes.Element element12 = element1.prependChild((org.jsoup.nodes.Node) element6);
        org.jsoup.select.Elements elements14 = element1.getElementsMatchingText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList15 = element1.textNodes();
        org.jsoup.select.Elements elements18 = element1.getElementsByAttributeValueMatching("", "<hi!>\n <hi!>\n </hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        java.lang.String str19 = element1.outerHtml();
        org.jsoup.nodes.Element element21 = element1.removeClass("");
        java.lang.String str22 = element21.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = element21.firstElementSibling();
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test75");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        boolean boolean4 = element1.isBlock();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        boolean boolean8 = element6.hasAttr("hi!");
        org.jsoup.nodes.Element element10 = element6.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element6.textNodes();
        org.jsoup.nodes.Element element12 = element1.prependChild((org.jsoup.nodes.Node) element6);
        org.jsoup.parser.Tag tag13 = element12.tag();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        boolean boolean17 = element15.hasAttr("hi!");
        boolean boolean18 = element15.isBlock();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        boolean boolean22 = element20.hasAttr("hi!");
        org.jsoup.nodes.Element element24 = element20.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList25 = element20.textNodes();
        org.jsoup.nodes.Element element26 = element15.prependChild((org.jsoup.nodes.Node) element20);
        org.jsoup.select.Elements elements28 = element15.getElementsMatchingText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList29 = element15.textNodes();
        java.lang.String str30 = element15.outerHtml();
        java.lang.String str31 = element15.cssSelector();
        org.jsoup.nodes.Element element32 = element12.appendChild((org.jsoup.nodes.Node) element15);
        element32.nodelistChanged();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element35 = element32.wrap("<hi!>\n <hi! class=\"\"></hi!>\n <hi!>\n </hi!>\n</hi!>");
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test76");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        java.lang.String str4 = element1.toString();
        org.jsoup.nodes.Node node5 = element1.previousSibling();
        org.jsoup.select.Elements elements6 = element1.getAllElements();
        org.jsoup.nodes.Element element8 = element1.prepend("");
        org.jsoup.nodes.Element element10 = element1.append("hi!");
        java.lang.String str11 = element10.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element10.firstElementSibling();
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test77");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element5 = element1.removeClass("");
        boolean boolean6 = element5.hasParent();
        org.jsoup.nodes.Node node7 = element5.previousSibling();
        org.jsoup.select.Elements elements8 = element5.siblingElements();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element5.childNodes;
        org.jsoup.nodes.Element element10 = element5.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element10.wrap("<hi!>\n &lt;hi!&gt; &lt;hi!&gt; &lt;/hi!&gt; &lt;hi! class=\"\"&gt;&lt;/hi!&gt; &lt;/hi!&gt;\n <hi! class=\"\"> \n  <hi! class=\"\"></hi!> \n </hi!>\n</hi!>");
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test78");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element5 = element1.removeClass("");
        boolean boolean6 = element5.hasParent();
        org.jsoup.nodes.Node node7 = element5.previousSibling();
        org.jsoup.nodes.Node node8 = element5.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element5.ensureChildNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element5.firstElementSibling();
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test79");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Node node5 = element1.root();
        java.lang.String str6 = element1.id();
        org.jsoup.select.Elements elements9 = element1.getElementsByAttributeValueNot("hi!", "hi!");
        org.jsoup.nodes.Element element11 = element1.html("");
        org.jsoup.nodes.Element element13 = element1.toggleClass("<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>");
        java.lang.String str14 = element13.ownText();
        org.jsoup.nodes.Element element16 = element13.prependText("<hi! <hi! class=\"<hi!></hi!>\"></hi!>=\"<hi!>\n <hi!>\n </hi!>\n <hi! class=&quot;&quot;></hi!>\n</hi!>\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element16.lastElementSibling();
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test80");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        boolean boolean4 = element1.isBlock();
        int int5 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element8 = element1.attr("", false);
        java.lang.String[] strArray10 = new java.lang.String[] { "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        org.jsoup.nodes.Element element13 = element8.classNames((java.util.Set<java.lang.String>) strSet11);
        java.lang.String str14 = element8.data();
        org.jsoup.nodes.Element element16 = element8.prependElement("<hi! class=\"\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element8.firstElementSibling();
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test81");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Node node5 = element1.root();
        java.lang.String str6 = element1.id();
        org.jsoup.select.Elements elements9 = element1.getElementsByAttributeValueNot("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element1.childNodes();
        int int11 = element1.childNodeSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element1.lastElementSibling();
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test82");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.attr("", true);
        boolean boolean6 = element4.hasAttr("");
        org.jsoup.nodes.Element element9 = element4.attr("<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>", "");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList10 = element9.textNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element9.wrap("<hi!></hi!>");
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test83");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.attr("", true);
        org.jsoup.nodes.Element element6 = element1.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element1.parent();
        org.jsoup.select.Elements elements8 = element1.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element1.lastElementSibling();
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test84");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        boolean boolean4 = element1.isBlock();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        boolean boolean8 = element6.hasAttr("hi!");
        org.jsoup.nodes.Element element10 = element6.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element6.textNodes();
        org.jsoup.nodes.Element element12 = element1.prependChild((org.jsoup.nodes.Node) element6);
        org.jsoup.select.Elements elements14 = element1.getElementsMatchingText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = element1.siblingNodes();
        org.jsoup.nodes.Node node16 = element1.nextSibling();
        element1.setBaseUri("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Node node19 = element1.parentNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element1.firstElementSibling();
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test85");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element5 = element1.removeClass("");
        java.lang.String str6 = element5.html();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element5.ensureChildNodes();
        java.lang.String str9 = element5.absUrl("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        boolean boolean10 = element5.isBlock();
        org.jsoup.nodes.Element element12 = element5.tagName("<hi!>\n <hi! class=\"\"></hi!>\n <hi!>\n </hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element12.wrap("<hi! class=\"\"></hi!>");
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test86");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        boolean boolean4 = element1.isBlock();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        boolean boolean8 = element6.hasAttr("hi!");
        org.jsoup.nodes.Element element10 = element6.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element6.textNodes();
        org.jsoup.nodes.Element element12 = element1.prependChild((org.jsoup.nodes.Node) element6);
        org.jsoup.parser.Tag tag13 = element12.tag();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        boolean boolean17 = element15.hasAttr("hi!");
        boolean boolean18 = element15.isBlock();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        boolean boolean22 = element20.hasAttr("hi!");
        org.jsoup.nodes.Element element24 = element20.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList25 = element20.textNodes();
        org.jsoup.nodes.Element element26 = element15.prependChild((org.jsoup.nodes.Node) element20);
        org.jsoup.select.Elements elements28 = element15.getElementsMatchingText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList29 = element15.textNodes();
        java.lang.String str30 = element15.outerHtml();
        java.lang.String str31 = element15.cssSelector();
        org.jsoup.nodes.Element element32 = element12.appendChild((org.jsoup.nodes.Node) element15);
        org.jsoup.select.Elements elements34 = element15.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element("hi!");
        boolean boolean38 = element36.hasAttr("hi!");
        java.lang.String str39 = element36.toString();
        org.jsoup.select.Elements elements40 = element36.siblingElements();
        org.jsoup.nodes.Node node41 = element36.root();
        org.jsoup.nodes.Element element42 = element36.clone();
        boolean boolean44 = element36.hasClass("hi!");
        org.jsoup.nodes.Element element45 = element15.prependChild((org.jsoup.nodes.Node) element36);
        org.jsoup.nodes.Element element46 = element45.empty();
        org.jsoup.nodes.Attributes attributes47 = element46.attributes();
        org.jsoup.select.Elements elements49 = element46.getElementsByIndexGreaterThan((int) (short) 100);
        org.jsoup.nodes.Element element50 = element46.clone();
        org.jsoup.parser.Tag tag51 = element50.tag();
        element50.doSetBaseUri("<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element54 = element50.lastElementSibling();
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test87");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        boolean boolean4 = element1.isBlock();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        boolean boolean8 = element6.hasAttr("hi!");
        org.jsoup.nodes.Element element10 = element6.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element6.textNodes();
        org.jsoup.nodes.Element element12 = element1.prependChild((org.jsoup.nodes.Node) element6);
        org.jsoup.parser.Tag tag13 = element12.tag();
        boolean boolean14 = element12.isBlock();
        org.jsoup.nodes.Element element16 = element12.addClass("<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <hi!>\n  <hi! class=\"\"></hi!>\n </hi!>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>");
        org.jsoup.parser.Tag tag17 = element16.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element16.wrap("<hi!>\n <hi!></hi!>&lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test88");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Node node5 = element1.root();
        java.lang.String str6 = element1.id();
        org.jsoup.select.Elements elements9 = element1.getElementsByAttributeValueNot("hi!", "hi!");
        org.jsoup.nodes.Element element11 = element1.html("");
        org.jsoup.parser.Tag tag12 = element11.tag();
        java.lang.String str13 = element11.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element11.lastElementSibling();
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test89");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        boolean boolean4 = element1.isBlock();
        int int5 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element8 = element1.attr("", false);
        org.jsoup.nodes.Element element9 = element1.parent();
        java.lang.String str10 = element1.nodeName();
        org.jsoup.nodes.Element element12 = element1.addClass("");
        java.lang.String str13 = element12.val();
        java.lang.String str14 = element12.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element12.firstElementSibling();
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test90");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        boolean boolean4 = element1.isBlock();
        int int5 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element8 = element1.attr("", false);
        element1.setBaseUri("hi!");
        org.jsoup.select.Elements elements11 = element1.parents();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element1.wrap("<hi! >\n &lt;hi!&gt; &lt;/hi!&gt;\n</hi!>");
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test91");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Node node5 = element1.root();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.ensureChildNodes();
        org.jsoup.nodes.Element element8 = element1.text("<<hi! class=\"<hi!></hi!>\"></hi!>></<hi! class=\"<hi!></hi!>\"></hi!>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element8.lastElementSibling();
    }

    @Test
    public void test92() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test92");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        java.lang.String str4 = element1.toString();
        org.jsoup.select.Elements elements5 = element1.siblingElements();
        org.jsoup.select.Elements elements6 = element1.getAllElements();
        org.jsoup.nodes.Element element8 = element1.html("");
        org.jsoup.nodes.Node node10 = element8.removeAttr("<hi! class=\"\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element8.firstElementSibling();
    }
}

