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
        org.jsoup.nodes.Element element2 = element1.empty();
        element2.setBaseUri("");
        element2.setBaseUri("");
        org.jsoup.nodes.Element element7 = element2.clone();
        org.jsoup.nodes.Node node9 = element7.removeAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element7.wrap("<hi!></hi!>");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        int int5 = element1.elementSiblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element1.firstElementSibling();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.appendTo(element3);
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node7 = element6.nextSibling();
        org.jsoup.nodes.Element element9 = element6.prependElement("hi!");
        org.jsoup.nodes.Attributes attributes10 = element9.attributes();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node13 = element12.nextSibling();
        org.jsoup.nodes.Element element15 = element12.prependElement("hi!");
        org.jsoup.nodes.Element element17 = element15.removeClass("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList18 = element17.dataNodes();
        org.jsoup.nodes.Element element19 = element9.appendTo(element17);
        org.jsoup.nodes.Element element21 = element19.addClass("");
        org.jsoup.select.Elements elements24 = element19.getElementsByAttributeValueStarting("hi!", "<hi!></hi!>");
        boolean boolean25 = element3.equals((java.lang.Object) elements24);
        org.jsoup.select.Elements elements27 = element3.getElementsByAttribute("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element28 = element3.firstElementSibling();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements5 = element1.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        int int6 = element1.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element1.lastElementSibling();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.appendTo(element3);
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node7 = element6.nextSibling();
        org.jsoup.nodes.Element element9 = element6.prependElement("hi!");
        int int10 = element6.elementSiblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element6.siblingNodes();
        org.jsoup.nodes.Element element13 = element6.html("");
        boolean boolean14 = element4.equals((java.lang.Object) element13);
        org.jsoup.nodes.Element element15 = element13.clone();
        org.jsoup.nodes.Element element17 = element15.val("<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element17.wrap("hi!");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = element1.wrap("<hi!></hi!>");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.removeClass("");
        org.jsoup.select.Elements elements8 = element4.getElementsContainingOwnText("hi!");
        element4.remove();
        org.jsoup.nodes.Element element11 = element4.appendText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = element4.ensureChildNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element4.lastElementSibling();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        int int5 = element1.elementSiblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.siblingNodes();
        org.jsoup.nodes.Element element8 = element1.html("");
        boolean boolean9 = element8.isBlock();
        java.lang.String str10 = element8.ownText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element8.wrap("<hi!>\n hi!\n</hi!>");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        int int5 = element1.elementSiblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.siblingNodes();
        org.jsoup.nodes.Element element8 = element1.html("");
        java.lang.String str9 = element8.outerHtml();
        org.jsoup.nodes.Element element12 = element8.attr("", true);
        org.jsoup.select.Elements elements14 = element8.getElementsByIndexLessThan(0);
        java.lang.String str15 = element8.outerHtml();
        org.jsoup.nodes.Element element16 = element8.nextElementSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element8.lastElementSibling();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = element1.lastElementSibling();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.html("hi!");
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node9 = element8.nextSibling();
        org.jsoup.nodes.Element element11 = element8.prependElement("hi!");
        org.jsoup.nodes.Attributes attributes12 = element11.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node15 = element14.nextSibling();
        org.jsoup.nodes.Element element17 = element14.prependElement("hi!");
        org.jsoup.nodes.Element element19 = element17.removeClass("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList20 = element19.dataNodes();
        org.jsoup.nodes.Element element21 = element11.appendTo(element19);
        org.jsoup.nodes.Element element23 = element21.addClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList24 = element23.textNodes();
        boolean boolean25 = element6.hasSameValue((java.lang.Object) element23);
        java.lang.String str26 = element6.ownText();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element29 = element28.empty();
        org.jsoup.nodes.Element element30 = element6.doClone((org.jsoup.nodes.Node) element28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element31 = element28.lastElementSibling();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.removeClass("");
        org.jsoup.select.Elements elements7 = element4.parents();
        org.jsoup.select.Elements elements8 = element4.parents();
        org.jsoup.nodes.Element element10 = element4.toggleClass("<hi!></hi!>");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node13 = element12.nextSibling();
        org.jsoup.nodes.Element element15 = element12.prependElement("hi!");
        int int16 = element12.elementSiblingIndex();
        org.jsoup.nodes.Element element17 = element4.prependChild((org.jsoup.nodes.Node) element12);
        element12.remove();
        org.jsoup.nodes.Element element20 = element12.appendText("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element25 = element22.appendTo(element24);
        org.jsoup.select.Elements elements27 = element24.getElementsByAttribute("hi!");
        boolean boolean28 = element20.equals((java.lang.Object) element24);
        org.jsoup.nodes.Element element31 = element24.attr("<hi! class=\"\">\n <<hi!></hi!>></<hi!></hi!>>\n</hi!>", "<hi! class=\"<hi!></hi!>\">\n <hi! class=\"\" value=\"<hi!></hi!>\"></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element32 = element31.firstElementSibling();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.appendTo(element3);
        org.jsoup.select.Elements elements6 = element3.getElementsByAttribute("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element3.childNodesCopy();
        boolean boolean8 = element3.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element3.firstElementSibling();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.appendTo(element3);
        org.jsoup.select.Elements elements6 = element4.getElementsContainingText("");
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element9 = element8.empty();
        element9.setBaseUri("");
        element9.setBaseUri("");
        org.jsoup.nodes.Element element14 = element9.clone();
        org.jsoup.nodes.Node node16 = element14.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList17 = element14.dataNodes();
        element4.replaceWith((org.jsoup.nodes.Node) element14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element4.firstElementSibling();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.removeClass("");
        java.lang.String str8 = element6.absUrl("<hi!></hi!>");
        java.lang.String str9 = element6.baseUri();
        boolean boolean10 = element6.hasParent();
        int int11 = element6.siblingIndex();
        boolean boolean13 = element6.hasClass("");
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element16 = element15.empty();
        org.jsoup.select.Elements elements19 = element15.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element21 = element15.val("hi!");
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element24 = element23.empty();
        org.jsoup.select.Elements elements26 = element23.getElementsByAttribute("hi!");
        element23.setBaseUri("hi!");
        org.jsoup.nodes.Element element29 = element15.appendChild((org.jsoup.nodes.Node) element23);
        org.jsoup.nodes.Element element30 = element6.doClone((org.jsoup.nodes.Node) element29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element31 = element29.firstElementSibling();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.nodes.Attributes attributes5 = element4.attributes();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node8 = element7.nextSibling();
        org.jsoup.nodes.Element element10 = element7.prependElement("hi!");
        org.jsoup.nodes.Element element12 = element10.removeClass("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList13 = element12.dataNodes();
        org.jsoup.nodes.Element element14 = element4.appendTo(element12);
        org.jsoup.nodes.Element element16 = element14.addClass("");
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node19 = element18.nextSibling();
        org.jsoup.nodes.Element element21 = element18.prependElement("hi!");
        org.jsoup.nodes.Attributes attributes22 = element21.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = element21.siblingNodes();
        org.jsoup.nodes.Element element25 = element21.prependText("");
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node28 = element27.nextSibling();
        org.jsoup.nodes.Element element30 = element27.prependElement("hi!");
        org.jsoup.nodes.Element element32 = element30.removeClass("");
        org.jsoup.select.Elements elements34 = element30.getElementsContainingOwnText("hi!");
        element30.remove();
        org.jsoup.nodes.Element element37 = element30.appendText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList38 = element30.ensureChildNodes();
        boolean boolean39 = element25.hasSameValue((java.lang.Object) element30);
        org.jsoup.nodes.Element element40 = element14.doClone((org.jsoup.nodes.Node) element30);
        java.lang.String str41 = element30.ownText();
        boolean boolean42 = element30.isBlock();
        org.jsoup.select.Elements elements44 = element30.getElementsByIndexLessThan((-1));
        boolean boolean45 = element30.hasParent();
        java.lang.String str46 = element30.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element47 = element30.firstElementSibling();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        int int5 = element1.elementSiblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.siblingNodes();
        org.jsoup.nodes.Element element8 = element1.html("");
        java.lang.String str9 = element8.outerHtml();
        org.jsoup.nodes.Element element12 = element8.attr("", true);
        org.jsoup.select.Elements elements14 = element8.getElementsByIndexLessThan(0);
        java.lang.String str15 = element8.outerHtml();
        org.jsoup.nodes.Element element16 = element8.nextElementSibling();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList17 = element8.dataNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element8.wrap("<hi! ></hi!>");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.nodes.Attributes attributes5 = element4.attributes();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node8 = element7.nextSibling();
        org.jsoup.nodes.Element element10 = element7.prependElement("hi!");
        org.jsoup.nodes.Element element12 = element10.removeClass("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList13 = element12.dataNodes();
        org.jsoup.nodes.Element element14 = element4.appendTo(element12);
        org.jsoup.nodes.Element element16 = element14.addClass("");
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node19 = element18.nextSibling();
        org.jsoup.nodes.Element element21 = element18.prependElement("hi!");
        org.jsoup.nodes.Attributes attributes22 = element21.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = element21.siblingNodes();
        org.jsoup.nodes.Element element25 = element21.prependText("");
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node28 = element27.nextSibling();
        org.jsoup.nodes.Element element30 = element27.prependElement("hi!");
        org.jsoup.nodes.Element element32 = element30.removeClass("");
        org.jsoup.select.Elements elements34 = element30.getElementsContainingOwnText("hi!");
        element30.remove();
        org.jsoup.nodes.Element element37 = element30.appendText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList38 = element30.ensureChildNodes();
        boolean boolean39 = element25.hasSameValue((java.lang.Object) element30);
        org.jsoup.nodes.Element element40 = element14.doClone((org.jsoup.nodes.Node) element30);
        java.lang.String[] strArray44 = new java.lang.String[] { "<hi!></hi!>", "<hi!></hi!>", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet45 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet45, strArray44);
        org.jsoup.nodes.Element element47 = element30.classNames((java.util.Set<java.lang.String>) strSet45);
        org.jsoup.nodes.Element element49 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element50 = element49.empty();
        boolean boolean51 = element47.hasSameValue((java.lang.Object) element50);
        org.jsoup.select.Elements elements52 = element50.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element53 = element50.lastElementSibling();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.nodes.Attributes attributes5 = element4.attributes();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node8 = element7.nextSibling();
        org.jsoup.nodes.Element element10 = element7.prependElement("hi!");
        org.jsoup.nodes.Element element12 = element10.removeClass("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList13 = element12.dataNodes();
        org.jsoup.nodes.Element element14 = element4.appendTo(element12);
        org.jsoup.nodes.Element element15 = element4.clone();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList16 = element15.textNodes();
        org.jsoup.nodes.Element element19 = element15.attr("<hi!></hi!>", true);
        org.jsoup.select.Elements elements21 = element15.getElementsMatchingOwnText("<hi! class=\"\">\n <<hi!></hi!>></<hi!></hi!>>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = element15.wrap("<hi!></hi!>\n<hi!></hi!>");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.appendTo(element3);
        org.jsoup.nodes.Element element6 = element3.prependText("");
        org.jsoup.nodes.Element element7 = element3.shallowClone();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList8 = element3.textNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element3.firstElementSibling();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        element2.setBaseUri("");
        element2.setBaseUri("");
        org.jsoup.nodes.Element element7 = element2.clone();
        org.jsoup.nodes.Node node9 = element7.removeAttr("hi!");
        org.jsoup.nodes.Element element11 = element7.appendText("hi!");
        boolean boolean13 = element7.hasClass("<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element7.firstElementSibling();
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        element2.setBaseUri("");
        element2.setBaseUri("");
        element2.setBaseUri("<hi!></hi!>");
        boolean boolean10 = element2.equals((java.lang.Object) 1.0f);
        element2.doSetBaseUri("<hi! value=\"<hi!></hi!>\" class=\"<hi!></hi!>\"></hi!>");
        java.lang.String str13 = element2.outerHtml();
        org.jsoup.nodes.Element element15 = element2.addClass("<hi! value=\"<hi!></hi!>\" class=\"<hi!></hi!>\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element15.lastElementSibling();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.removeClass("");
        java.lang.String str8 = element6.absUrl("<hi!></hi!>");
        org.jsoup.nodes.Element element10 = element6.prependText("hi!");
        org.jsoup.nodes.Element element12 = element10.toggleClass("<hi!></hi!>");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node15 = element14.nextSibling();
        org.jsoup.nodes.Element element17 = element14.prependElement("hi!");
        org.jsoup.nodes.Element element19 = element17.removeClass("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList20 = element19.dataNodes();
        org.jsoup.nodes.Element element21 = element19.nextElementSibling();
        org.jsoup.nodes.Element element24 = element19.attr("", false);
        org.jsoup.select.Elements elements26 = element19.getElementsByAttributeStarting("<hi!></hi!>");
        org.jsoup.select.Elements elements28 = element19.getElementsByIndexGreaterThan((int) (short) 0);
        element19.nodelistChanged();
        org.jsoup.nodes.Element element31 = element19.appendElement("hi!");
        org.jsoup.nodes.Element element32 = element10.before((org.jsoup.nodes.Node) element19);
        org.jsoup.select.Elements elements33 = element32.children();
        org.jsoup.select.Elements elements34 = element32.children();
        boolean boolean36 = element32.hasAttr("<hi!>\n hi!\n <hi! class=\"\">\n  <<hi!></hi!>></<hi!></hi!>>\n </hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node39 = element38.nextSibling();
        org.jsoup.nodes.Element element41 = element38.prependElement("hi!");
        org.jsoup.nodes.Node node43 = element38.removeAttr("<hi!></hi!>");
        org.jsoup.select.Elements elements45 = element38.getElementsByAttribute("<hi!></hi!>");
        org.jsoup.nodes.Element element46 = element38.shallowClone();
        org.jsoup.nodes.Element element48 = element38.prependElement("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList49 = element38.childNodesCopy();
        element32.childNodes = nodeList49;
        boolean boolean51 = element32.hasAttributes();
        org.jsoup.nodes.Element element53 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element55 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element56 = element53.appendTo(element55);
        org.jsoup.nodes.Element element58 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node59 = element58.nextSibling();
        org.jsoup.nodes.Element element61 = element58.prependElement("hi!");
        int int62 = element58.elementSiblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList63 = element58.siblingNodes();
        org.jsoup.nodes.Element element65 = element58.html("");
        boolean boolean66 = element56.equals((java.lang.Object) element65);
        org.jsoup.nodes.Element element67 = element65.clone();
        org.jsoup.nodes.Element element69 = element67.toggleClass("");
        java.util.Map<java.lang.String, java.lang.String> strMap70 = element67.dataset();
        org.jsoup.nodes.Element element71 = element32.appendTo(element67);
        org.jsoup.nodes.Element element73 = element67.val("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element75 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element76 = element75.empty();
        org.jsoup.select.Elements elements78 = element75.getElementsByAttribute("hi!");
        element75.setBaseUri("hi!");
        org.jsoup.select.Elements elements81 = element75.siblingElements();
        org.jsoup.nodes.Element element82 = element67.prependChild((org.jsoup.nodes.Node) element75);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements84 = element67.getElementsContainingText("<<hi!></hi!>>\n <<hi!>\n</hi!>></<hi!>\n</hi!>>\n</<hi!></hi!>>");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.nodes.Attributes attributes5 = element4.attributes();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node8 = element7.nextSibling();
        org.jsoup.nodes.Element element10 = element7.prependElement("hi!");
        org.jsoup.nodes.Element element12 = element10.removeClass("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList13 = element12.dataNodes();
        org.jsoup.nodes.Element element14 = element4.appendTo(element12);
        org.jsoup.nodes.Element element15 = element4.clone();
        int int16 = element15.childNodeSize();
        org.jsoup.nodes.Element element18 = element15.getElementById("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element20 = element15.html("<hi! class=\"<hi!></hi!>\">\n <hi! class=\"\" value=\"<hi!></hi!>\"></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element20.firstElementSibling();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element4 = element2.addClass("");
        org.jsoup.nodes.Element element6 = element2.val("<hi!></hi!>");
        org.jsoup.nodes.Node node7 = element2.root();
        java.lang.String str8 = element2.cssSelector();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element2.lastElementSibling();
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.appendTo(element3);
        org.jsoup.nodes.Element element6 = element3.prependText("");
        java.lang.String str7 = element3.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element3.firstElementSibling();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element4 = element2.addClass("");
        element2.nodelistChanged();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = element2.firstElementSibling();
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.select.Elements elements4 = element1.getElementsMatchingOwnText("hi!");
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element9 = element6.appendTo(element8);
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node12 = element11.nextSibling();
        org.jsoup.nodes.Element element14 = element11.prependElement("hi!");
        org.jsoup.nodes.Attributes attributes15 = element14.attributes();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node18 = element17.nextSibling();
        org.jsoup.nodes.Element element20 = element17.prependElement("hi!");
        org.jsoup.nodes.Element element22 = element20.removeClass("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList23 = element22.dataNodes();
        org.jsoup.nodes.Element element24 = element14.appendTo(element22);
        org.jsoup.nodes.Element element26 = element24.addClass("");
        org.jsoup.select.Elements elements29 = element24.getElementsByAttributeValueStarting("hi!", "<hi!></hi!>");
        boolean boolean30 = element8.equals((java.lang.Object) elements29);
        org.jsoup.select.Elements elements32 = element8.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node35 = element34.nextSibling();
        org.jsoup.nodes.Element element37 = element34.prependElement("hi!");
        org.jsoup.nodes.Element element39 = element37.removeClass("");
        org.jsoup.nodes.Element element41 = element37.html("");
        org.jsoup.nodes.Node node42 = element41.clearAttributes();
        org.jsoup.nodes.Element element44 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node45 = element44.nextSibling();
        org.jsoup.nodes.Element element47 = element44.prependElement("hi!");
        org.jsoup.nodes.Element element49 = element47.removeClass("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList50 = element49.dataNodes();
        org.jsoup.nodes.Element element51 = element49.nextElementSibling();
        org.jsoup.nodes.Element element54 = element49.attr("", false);
        org.jsoup.select.Elements elements56 = element49.getElementsByAttributeStarting("<hi!></hi!>");
        org.jsoup.select.Elements elements58 = element49.getElementsByIndexGreaterThan((int) (short) 0);
        element49.nodelistChanged();
        java.lang.String str61 = element49.attr("");
        org.jsoup.nodes.Element element62 = element41.appendTo(element49);
        org.jsoup.nodes.Element element64 = element49.prepend("");
        org.jsoup.nodes.Element element66 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node67 = element66.nextSibling();
        org.jsoup.nodes.Element element69 = element66.prependElement("hi!");
        org.jsoup.nodes.Attributes attributes70 = element69.attributes();
        org.jsoup.nodes.Element element72 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node73 = element72.nextSibling();
        org.jsoup.nodes.Element element75 = element72.prependElement("hi!");
        org.jsoup.nodes.Element element77 = element75.removeClass("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList78 = element77.dataNodes();
        org.jsoup.nodes.Element element79 = element69.appendTo(element77);
        org.jsoup.nodes.Element element80 = element69.clone();
        org.jsoup.nodes.Element element82 = element69.tagName("hi!");
        org.jsoup.select.Elements elements84 = element82.getElementsMatchingText("");
        org.jsoup.nodes.Element element85 = element49.appendChild((org.jsoup.nodes.Node) element82);
        org.jsoup.nodes.Element element86 = element8.appendChild((org.jsoup.nodes.Node) element82);
        org.jsoup.nodes.Element element87 = element1.prependChild((org.jsoup.nodes.Node) element8);
        org.jsoup.nodes.Node node88 = element87.clearAttributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element89 = element87.lastElementSibling();
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.nodes.Attributes attributes5 = element4.attributes();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node8 = element7.nextSibling();
        org.jsoup.nodes.Element element10 = element7.prependElement("hi!");
        org.jsoup.nodes.Element element12 = element10.removeClass("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList13 = element12.dataNodes();
        org.jsoup.nodes.Element element14 = element4.appendTo(element12);
        org.jsoup.nodes.Element element16 = element14.addClass("");
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node19 = element18.nextSibling();
        org.jsoup.nodes.Element element21 = element18.prependElement("hi!");
        org.jsoup.nodes.Attributes attributes22 = element21.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = element21.siblingNodes();
        org.jsoup.nodes.Element element25 = element21.prependText("");
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node28 = element27.nextSibling();
        org.jsoup.nodes.Element element30 = element27.prependElement("hi!");
        org.jsoup.nodes.Element element32 = element30.removeClass("");
        org.jsoup.select.Elements elements34 = element30.getElementsContainingOwnText("hi!");
        element30.remove();
        org.jsoup.nodes.Element element37 = element30.appendText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList38 = element30.ensureChildNodes();
        boolean boolean39 = element25.hasSameValue((java.lang.Object) element30);
        org.jsoup.nodes.Element element40 = element14.doClone((org.jsoup.nodes.Node) element30);
        java.lang.String str41 = element30.ownText();
        boolean boolean42 = element30.isBlock();
        java.lang.String str43 = element30.val();
        org.jsoup.nodes.Element element45 = element30.removeClass("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element47 = element30.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element49 = element47.wrap("<hi!></hi!>\n<hi!></hi!>");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.nodes.Attributes attributes5 = element4.attributes();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node8 = element7.nextSibling();
        org.jsoup.nodes.Element element10 = element7.prependElement("hi!");
        org.jsoup.nodes.Element element12 = element10.removeClass("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList13 = element12.dataNodes();
        org.jsoup.nodes.Element element14 = element4.appendTo(element12);
        org.jsoup.nodes.Element element16 = element14.addClass("");
        org.jsoup.select.Elements elements19 = element14.getElementsByAttributeValueStarting("hi!", "<hi!></hi!>");
        org.jsoup.parser.Tag tag20 = element14.tag();
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element(tag20, "<hi! ></hi!>");
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element(tag20, "<hi!>\n <hi! class=\"hi!\"></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = element24.lastElementSibling();
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.appendTo(element3);
        org.jsoup.select.Elements elements6 = element1.getElementsByIndexEquals(100);
        int int7 = element1.siblingIndex();
        org.jsoup.select.Elements elements9 = element1.getElementsByIndexGreaterThan((int) (byte) 100);
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element14 = element11.appendTo(element13);
        org.jsoup.select.Elements elements16 = element13.getElementsByAttribute("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = element13.childNodes();
        element13.doSetBaseUri("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element22 = element13.attr("<hi! ></hi!>", "<hi! class=\"\"> <<hi!></hi!>></<hi!></hi!>> </hi!>");
        org.jsoup.nodes.Element element23 = element1.doClone((org.jsoup.nodes.Node) element22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element24 = element22.firstElementSibling();
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.nodes.Attributes attributes5 = element4.attributes();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node8 = element7.nextSibling();
        org.jsoup.nodes.Element element10 = element7.prependElement("hi!");
        org.jsoup.nodes.Element element12 = element10.removeClass("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList13 = element12.dataNodes();
        org.jsoup.nodes.Element element14 = element4.appendTo(element12);
        org.jsoup.nodes.Element element16 = element14.addClass("");
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node19 = element18.nextSibling();
        org.jsoup.nodes.Element element21 = element18.prependElement("hi!");
        org.jsoup.nodes.Attributes attributes22 = element21.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = element21.siblingNodes();
        org.jsoup.nodes.Element element25 = element21.prependText("");
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node28 = element27.nextSibling();
        org.jsoup.nodes.Element element30 = element27.prependElement("hi!");
        org.jsoup.nodes.Element element32 = element30.removeClass("");
        org.jsoup.select.Elements elements34 = element30.getElementsContainingOwnText("hi!");
        element30.remove();
        org.jsoup.nodes.Element element37 = element30.appendText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList38 = element30.ensureChildNodes();
        boolean boolean39 = element25.hasSameValue((java.lang.Object) element30);
        org.jsoup.nodes.Element element40 = element14.doClone((org.jsoup.nodes.Node) element30);
        java.lang.String str41 = element30.ownText();
        boolean boolean42 = element30.isBlock();
        java.lang.String str43 = element30.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element45 = element30.wrap("<hi! class=\"<hi!></hi!>\">\n <hi! class=\"\" value=\"<hi!></hi!>\"></hi!>\n</hi!>");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        java.util.List<org.jsoup.nodes.Node> nodeList3 = element2.childNodes;
        org.jsoup.nodes.Element element5 = element2.html("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element2.removeClass("hi!");
        org.jsoup.nodes.Element element10 = element7.attr("<hi!>\n hi!\n <<hi!>\n</hi!>></<hi!>\n</hi!>>\n</hi!>", "");
        org.jsoup.nodes.Element element12 = element10.addClass("<hi! value=\"<hi! value=&quot;<hi!></hi!>&quot; class=&quot;<hi!></hi!>&quot;></hi!>\">\n <hi!></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element10.lastElementSibling();
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        int int5 = element1.elementSiblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.siblingNodes();
        org.jsoup.nodes.Element element8 = element1.html("");
        org.jsoup.nodes.Element element10 = element1.toggleClass("hi!");
        org.jsoup.nodes.Node node11 = element1.root();
        element1.doSetBaseUri("");
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node16 = element15.nextSibling();
        org.jsoup.nodes.Element element18 = element15.prependElement("hi!");
        org.jsoup.nodes.Attributes attributes19 = element18.attributes();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node22 = element21.nextSibling();
        org.jsoup.nodes.Element element24 = element21.prependElement("hi!");
        org.jsoup.nodes.Element element26 = element24.removeClass("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList27 = element26.dataNodes();
        org.jsoup.nodes.Element element28 = element18.appendTo(element26);
        org.jsoup.nodes.Element element30 = element28.addClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList31 = element30.textNodes();
        org.jsoup.nodes.Element element33 = element30.append("");
        org.jsoup.nodes.Element element35 = element30.html("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet36 = element30.classNames();
        org.jsoup.nodes.Element element37 = element1.classNames(strSet36);
        org.jsoup.select.Elements elements40 = element37.getElementsByAttributeValueStarting("<<hi!></hi!>></<hi!></hi!>>", "<hi!>\n <<hi!>\n</hi!>></<hi!>\n</hi!>>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element41 = element37.firstElementSibling();
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.appendTo(element3);
        org.jsoup.nodes.Element element6 = element3.prependText("");
        java.lang.String str7 = element3.val();
        org.jsoup.nodes.Element element10 = element3.attr("<hi!>\n</hi!>", "hi!");
        org.jsoup.select.Elements elements12 = element10.getElementsByIndexLessThan((int) (short) 0);
        boolean boolean13 = element10.hasAttributes();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList14 = element10.textNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element10.firstElementSibling();
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements4 = element1.getElementsByAttribute("hi!");
        boolean boolean6 = element1.hasAttr("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element1.previousElementSibling();
        int int8 = element1.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element1.firstElementSibling();
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.appendTo(element3);
        org.jsoup.select.Elements elements6 = element3.getElementsByAttribute("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element3.childNodesCopy();
        org.jsoup.nodes.Element element9 = element3.toggleClass("<hi!>\n</hi!>");
        org.jsoup.select.Elements elements11 = element9.getElementsContainingText("<hi! class=\"\">\n <<hi!></hi!>></<hi!></hi!>>\n</hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = element9.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element9.wrap("<hi! value=\"<hi!></hi!>\" class=\"<hi!></hi!>\"></hi!>");
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        int int5 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element7 = element1.appendText("<hi!>\n hi!\n <hi! class=\"\">\n  <<hi!></hi!>></<hi!></hi!>>\n </hi!>\n <hi!></hi!>\n</hi!>");
        java.lang.String str8 = element7.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element7.lastElementSibling();
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.appendTo(element3);
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node7 = element6.nextSibling();
        org.jsoup.nodes.Element element9 = element6.prependElement("hi!");
        int int10 = element6.elementSiblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element6.siblingNodes();
        org.jsoup.nodes.Element element13 = element6.html("");
        boolean boolean14 = element4.equals((java.lang.Object) element13);
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node17 = element16.nextSibling();
        org.jsoup.nodes.Element element19 = element16.prependElement("hi!");
        org.jsoup.nodes.Attributes attributes20 = element19.attributes();
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node23 = element22.nextSibling();
        org.jsoup.nodes.Element element25 = element22.prependElement("hi!");
        org.jsoup.nodes.Element element27 = element25.removeClass("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList28 = element27.dataNodes();
        org.jsoup.nodes.Element element29 = element19.appendTo(element27);
        org.jsoup.nodes.Element element31 = element29.addClass("");
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node34 = element33.nextSibling();
        org.jsoup.nodes.Element element36 = element33.prependElement("hi!");
        org.jsoup.nodes.Attributes attributes37 = element36.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList38 = element36.siblingNodes();
        org.jsoup.nodes.Element element40 = element36.prependText("");
        org.jsoup.nodes.Element element42 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node43 = element42.nextSibling();
        org.jsoup.nodes.Element element45 = element42.prependElement("hi!");
        org.jsoup.nodes.Element element47 = element45.removeClass("");
        org.jsoup.select.Elements elements49 = element45.getElementsContainingOwnText("hi!");
        element45.remove();
        org.jsoup.nodes.Element element52 = element45.appendText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList53 = element45.ensureChildNodes();
        boolean boolean54 = element40.hasSameValue((java.lang.Object) element45);
        org.jsoup.nodes.Element element55 = element29.doClone((org.jsoup.nodes.Node) element45);
        java.lang.String[] strArray59 = new java.lang.String[] { "<hi!></hi!>", "<hi!></hi!>", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet60 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet60, strArray59);
        org.jsoup.nodes.Element element62 = element45.classNames((java.util.Set<java.lang.String>) strSet60);
        org.jsoup.nodes.Element element63 = element13.classNames((java.util.Set<java.lang.String>) strSet60);
        org.jsoup.parser.Tag tag64 = element13.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element66 = element13.wrap("<hi! class=\"<hi!></hi!>\">\n hi!\n</hi!>");
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.removeClass("");
        java.lang.String str8 = element6.absUrl("<hi!></hi!>");
        org.jsoup.nodes.Element element10 = element6.prependText("hi!");
        org.jsoup.nodes.Element element12 = element10.toggleClass("<hi!></hi!>");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node15 = element14.nextSibling();
        org.jsoup.nodes.Element element17 = element14.prependElement("hi!");
        org.jsoup.nodes.Element element19 = element17.removeClass("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList20 = element19.dataNodes();
        org.jsoup.nodes.Element element21 = element19.nextElementSibling();
        org.jsoup.nodes.Element element24 = element19.attr("", false);
        org.jsoup.select.Elements elements26 = element19.getElementsByAttributeStarting("<hi!></hi!>");
        org.jsoup.select.Elements elements28 = element19.getElementsByIndexGreaterThan((int) (short) 0);
        element19.nodelistChanged();
        org.jsoup.nodes.Element element31 = element19.appendElement("hi!");
        org.jsoup.nodes.Element element32 = element10.before((org.jsoup.nodes.Node) element19);
        org.jsoup.select.Elements elements33 = element32.children();
        org.jsoup.select.Elements elements34 = element32.children();
        boolean boolean36 = element32.hasAttr("<hi!>\n hi!\n <hi! class=\"\">\n  <<hi!></hi!>></<hi!></hi!>>\n </hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node39 = element38.nextSibling();
        org.jsoup.nodes.Element element41 = element38.prependElement("hi!");
        org.jsoup.nodes.Node node43 = element38.removeAttr("<hi!></hi!>");
        org.jsoup.select.Elements elements45 = element38.getElementsByAttribute("<hi!></hi!>");
        org.jsoup.nodes.Element element46 = element38.shallowClone();
        org.jsoup.nodes.Element element48 = element38.prependElement("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList49 = element38.childNodesCopy();
        element32.childNodes = nodeList49;
        boolean boolean51 = element32.hasAttributes();
        org.jsoup.nodes.Element element53 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element55 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element56 = element53.appendTo(element55);
        org.jsoup.nodes.Element element58 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node59 = element58.nextSibling();
        org.jsoup.nodes.Element element61 = element58.prependElement("hi!");
        int int62 = element58.elementSiblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList63 = element58.siblingNodes();
        org.jsoup.nodes.Element element65 = element58.html("");
        boolean boolean66 = element56.equals((java.lang.Object) element65);
        org.jsoup.nodes.Element element67 = element65.clone();
        org.jsoup.nodes.Element element69 = element67.toggleClass("");
        java.util.Map<java.lang.String, java.lang.String> strMap70 = element67.dataset();
        org.jsoup.nodes.Element element71 = element32.appendTo(element67);
        org.jsoup.nodes.Element element73 = element67.val("<hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements75 = element67.getElementsMatchingText("<<hi!></hi!>></<hi!></hi!>>&lt;hi!&gt; hi! &lt;/hi!&gt;");
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.removeClass("");
        org.jsoup.select.Elements elements8 = element4.getElementsContainingOwnText("hi!");
        element4.remove();
        org.jsoup.nodes.Element element11 = element4.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element14 = element4.attr("<hi!>\n hi!\n</hi!>", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element14.wrap("<<hi!></hi!>>\n <<hi!>\n</hi!>></<hi!>\n</hi!>>\n</<hi!></hi!>>");
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        element2.setBaseUri("");
        element2.setBaseUri("");
        element2.setBaseUri("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element2.ensureChildNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element2.firstElementSibling();
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        int int5 = element1.elementSiblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.siblingNodes();
        org.jsoup.nodes.Element element8 = element1.html("");
        java.lang.String str9 = element8.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element8.wrap("<hi!>\n hi!\n</hi!>");
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.removeClass("");
        java.lang.String str8 = element6.absUrl("<hi!></hi!>");
        org.jsoup.nodes.Element element10 = element6.prependText("hi!");
        org.jsoup.nodes.Element element12 = element10.toggleClass("<hi!></hi!>");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node15 = element14.nextSibling();
        org.jsoup.nodes.Element element17 = element14.prependElement("hi!");
        org.jsoup.nodes.Element element19 = element17.removeClass("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList20 = element19.dataNodes();
        org.jsoup.nodes.Element element21 = element19.nextElementSibling();
        org.jsoup.nodes.Element element24 = element19.attr("", false);
        org.jsoup.select.Elements elements26 = element19.getElementsByAttributeStarting("<hi!></hi!>");
        org.jsoup.select.Elements elements28 = element19.getElementsByIndexGreaterThan((int) (short) 0);
        element19.nodelistChanged();
        org.jsoup.nodes.Element element31 = element19.appendElement("hi!");
        org.jsoup.nodes.Element element32 = element10.before((org.jsoup.nodes.Node) element19);
        org.jsoup.select.Elements elements33 = element32.children();
        org.jsoup.select.Elements elements34 = element32.children();
        boolean boolean36 = element32.hasAttr("<hi!>\n hi!\n <hi! class=\"\">\n  <<hi!></hi!>></<hi!></hi!>>\n </hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node39 = element38.nextSibling();
        org.jsoup.nodes.Element element41 = element38.prependElement("hi!");
        org.jsoup.nodes.Node node43 = element38.removeAttr("<hi!></hi!>");
        org.jsoup.select.Elements elements45 = element38.getElementsByAttribute("<hi!></hi!>");
        org.jsoup.nodes.Element element46 = element38.shallowClone();
        org.jsoup.nodes.Element element48 = element38.prependElement("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList49 = element38.childNodesCopy();
        element32.childNodes = nodeList49;
        boolean boolean51 = element32.hasAttributes();
        org.jsoup.nodes.Element element53 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element55 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element56 = element53.appendTo(element55);
        org.jsoup.nodes.Element element58 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node59 = element58.nextSibling();
        org.jsoup.nodes.Element element61 = element58.prependElement("hi!");
        int int62 = element58.elementSiblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList63 = element58.siblingNodes();
        org.jsoup.nodes.Element element65 = element58.html("");
        boolean boolean66 = element56.equals((java.lang.Object) element65);
        org.jsoup.nodes.Element element67 = element65.clone();
        org.jsoup.nodes.Element element69 = element67.toggleClass("");
        java.util.Map<java.lang.String, java.lang.String> strMap70 = element67.dataset();
        org.jsoup.nodes.Element element71 = element32.appendTo(element67);
        org.jsoup.nodes.Element element73 = element67.val("<hi!>\n</hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList74 = element73.childNodesCopy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements76 = element73.getElementsContainingOwnText("<hi! class=\"<hi! class=&quot;&quot; value=&quot;<hi!></hi!>&quot;></hi!>\"></hi!>");
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        element2.setBaseUri("");
        element2.setBaseUri("");
        org.jsoup.nodes.Element element7 = element2.clone();
        org.jsoup.nodes.Node node9 = element7.removeAttr("hi!");
        org.jsoup.nodes.Element element11 = element7.appendText("hi!");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node14 = element13.nextSibling();
        org.jsoup.nodes.Element element16 = element13.prependElement("hi!");
        org.jsoup.nodes.Attributes attributes17 = element16.attributes();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node20 = element19.nextSibling();
        org.jsoup.nodes.Element element22 = element19.prependElement("hi!");
        org.jsoup.nodes.Element element24 = element22.removeClass("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList25 = element24.dataNodes();
        org.jsoup.nodes.Element element26 = element16.appendTo(element24);
        boolean boolean27 = element16.isBlock();
        org.jsoup.nodes.Element element28 = element11.appendTo(element16);
        org.jsoup.nodes.Element element29 = element11.shallowClone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element31 = element29.wrap("<hi!>\n &lt;hi!&gt; &lt;/hi!&gt;\n <hi!></hi!>\n</hi!>");
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.removeClass("");
        org.jsoup.select.Elements elements7 = element4.parents();
        org.jsoup.nodes.Element element8 = element4.lastElementSibling();
        org.jsoup.nodes.Element element9 = element4.shallowClone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element9.wrap("<hi! class=\"<hi! class=&quot;&quot; value=&quot;<hi!></hi!>&quot;></hi!>\"></hi!>");
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.removeClass("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element6.dataNodes();
        org.jsoup.select.Elements elements10 = element6.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element12 = element6.tagName("hi!");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node15 = element14.nextSibling();
        org.jsoup.select.Elements elements17 = element14.getElementsMatchingOwnText("hi!");
        element6.replaceWith((org.jsoup.nodes.Node) element14);
        int int19 = element6.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element6.firstElementSibling();
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.nodes.Attributes attributes5 = element4.attributes();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node8 = element7.nextSibling();
        org.jsoup.nodes.Element element10 = element7.prependElement("hi!");
        org.jsoup.nodes.Element element12 = element10.removeClass("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList13 = element12.dataNodes();
        org.jsoup.nodes.Element element14 = element4.appendTo(element12);
        org.jsoup.nodes.Element element16 = element14.addClass("");
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node19 = element18.nextSibling();
        org.jsoup.nodes.Element element21 = element18.prependElement("hi!");
        org.jsoup.nodes.Attributes attributes22 = element21.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = element21.siblingNodes();
        org.jsoup.nodes.Element element25 = element21.prependText("");
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node28 = element27.nextSibling();
        org.jsoup.nodes.Element element30 = element27.prependElement("hi!");
        org.jsoup.nodes.Element element32 = element30.removeClass("");
        org.jsoup.select.Elements elements34 = element30.getElementsContainingOwnText("hi!");
        element30.remove();
        org.jsoup.nodes.Element element37 = element30.appendText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList38 = element30.ensureChildNodes();
        boolean boolean39 = element25.hasSameValue((java.lang.Object) element30);
        org.jsoup.nodes.Element element40 = element14.doClone((org.jsoup.nodes.Node) element30);
        java.lang.String str41 = element30.ownText();
        boolean boolean42 = element30.isBlock();
        org.jsoup.select.Elements elements44 = element30.getElementsByIndexLessThan((-1));
        boolean boolean45 = element30.hasParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element47 = element30.wrap("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.appendTo(element3);
        java.lang.String str5 = element3.text();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element7.appendTo(element9);
        org.jsoup.nodes.Attributes attributes11 = element10.attributes();
        org.jsoup.nodes.Element element12 = element3.prependChild((org.jsoup.nodes.Node) element10);
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node15 = element14.nextSibling();
        org.jsoup.nodes.Element element17 = element14.prependElement("hi!");
        org.jsoup.nodes.Attributes attributes18 = element17.attributes();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node21 = element20.nextSibling();
        org.jsoup.nodes.Element element23 = element20.prependElement("hi!");
        org.jsoup.nodes.Element element25 = element23.removeClass("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList26 = element25.dataNodes();
        org.jsoup.nodes.Element element27 = element17.appendTo(element25);
        org.jsoup.nodes.Element element29 = element27.addClass("");
        org.jsoup.nodes.Attributes attributes30 = element27.attributes();
        java.lang.String str32 = element27.attr("hi!");
        org.jsoup.nodes.Element element34 = element27.appendElement("<hi!></hi!>");
        org.jsoup.nodes.Element element37 = element34.attr("", "hi!");
        boolean boolean38 = element12.equals((java.lang.Object) element37);
        org.jsoup.nodes.Element element41 = element12.attr("<hi! class=\"\">\n <<hi!></hi!>></<hi!></hi!>>\n</hi!>", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element42 = element12.lastElementSibling();
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.nodes.Attributes attributes5 = element4.attributes();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node8 = element7.nextSibling();
        org.jsoup.nodes.Element element10 = element7.prependElement("hi!");
        org.jsoup.nodes.Element element12 = element10.removeClass("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList13 = element12.dataNodes();
        org.jsoup.nodes.Element element14 = element4.appendTo(element12);
        org.jsoup.nodes.Element element16 = element12.appendText("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element17 = element12.shallowClone();
        java.lang.String str18 = element17.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element17.lastElementSibling();
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.select.Elements elements7 = element4.getElementsByAttributeValueNot("hi!", "hi!");
        org.jsoup.nodes.Node node9 = element4.removeAttr("hi!");
        org.jsoup.nodes.Element element11 = element4.toggleClass("");
        java.lang.String str12 = element11.baseUri();
        org.jsoup.select.Elements elements15 = element11.getElementsByAttributeValueContaining("<hi!>\n hi!\n</hi!>", "<hi!>\n hi!\n</hi!>");
        org.jsoup.select.Elements elements17 = element11.getElementsMatchingOwnText("<hi!>\n hi!\n <hi! class=\"\">\n  <<hi!></hi!>></<hi!></hi!>>\n </hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node20 = element19.nextSibling();
        org.jsoup.nodes.Element element22 = element19.prependElement("hi!");
        org.jsoup.nodes.Attributes attributes23 = element22.attributes();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node26 = element25.nextSibling();
        org.jsoup.nodes.Element element28 = element25.prependElement("hi!");
        org.jsoup.nodes.Element element30 = element28.removeClass("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList31 = element30.dataNodes();
        org.jsoup.nodes.Element element32 = element22.appendTo(element30);
        org.jsoup.nodes.Element element33 = element22.clone();
        int int34 = element33.childNodeSize();
        org.jsoup.select.Elements elements36 = element33.getElementsByIndexGreaterThan((int) ' ');
        org.jsoup.nodes.Element element37 = element11.appendTo(element33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element38 = element33.firstElementSibling();
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.nodes.Attributes attributes5 = element4.attributes();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node8 = element7.nextSibling();
        org.jsoup.nodes.Element element10 = element7.prependElement("hi!");
        org.jsoup.nodes.Element element12 = element10.removeClass("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList13 = element12.dataNodes();
        org.jsoup.nodes.Element element14 = element4.appendTo(element12);
        org.jsoup.nodes.Element element16 = element14.addClass("");
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node19 = element18.nextSibling();
        org.jsoup.nodes.Element element21 = element18.prependElement("hi!");
        org.jsoup.nodes.Attributes attributes22 = element21.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = element21.siblingNodes();
        org.jsoup.nodes.Element element25 = element21.prependText("");
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node28 = element27.nextSibling();
        org.jsoup.nodes.Element element30 = element27.prependElement("hi!");
        org.jsoup.nodes.Element element32 = element30.removeClass("");
        org.jsoup.select.Elements elements34 = element30.getElementsContainingOwnText("hi!");
        element30.remove();
        org.jsoup.nodes.Element element37 = element30.appendText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList38 = element30.ensureChildNodes();
        boolean boolean39 = element25.hasSameValue((java.lang.Object) element30);
        org.jsoup.nodes.Element element40 = element14.doClone((org.jsoup.nodes.Node) element30);
        java.lang.String str41 = element30.ownText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element42 = element30.lastElementSibling();
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements4 = element1.getElementsByAttribute("hi!");
        element1.setBaseUri("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element1.firstElementSibling();
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.appendTo(element3);
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node7 = element6.nextSibling();
        org.jsoup.nodes.Element element9 = element6.prependElement("hi!");
        int int10 = element6.elementSiblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element6.siblingNodes();
        org.jsoup.nodes.Element element13 = element6.html("");
        boolean boolean14 = element4.equals((java.lang.Object) element13);
        org.jsoup.select.Elements elements16 = element4.getElementsByAttributeStarting("hi!");
        org.jsoup.nodes.Node node17 = element4.unwrap();
        org.jsoup.nodes.Element element19 = element4.removeClass("<hi! class=\"\" value=\"<hi!></hi!>\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element4.lastElementSibling();
    }
}

