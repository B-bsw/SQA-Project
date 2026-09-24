package org.jsoup.nodes;

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
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.select.Elements elements7 = element4.getElementsByAttributeValueNot("hi!", "hi!");
        java.lang.String str8 = element4.nodeName();
        boolean boolean9 = element4.hasParent();
        org.jsoup.nodes.Element element11 = element4.wrap("<hi!>\n <hi!></hi!>&lt;hi!&gt; hi! &lt;hi! class=\"\"&gt; &lt;&lt;hi!&gt;&lt;/hi!&gt;&gt;&lt;/&lt;hi!&gt;&lt;/hi!&gt;&gt; &lt;/hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element13 = element11.val("<hi!> hi! <hi! class=\"\"> <<hi!></hi!>></<hi!></hi!>> </hi!> <hi!></hi!> </hi!>");
        org.jsoup.nodes.Element element15 = element11.appendElement("<hi! class=\"<hi!></hi!> hi!\"></hi!>");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
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
        org.jsoup.nodes.Element element32 = element30.getElementById("<hi! class=\"<hi!></hi!> hi!\"></hi!>");
        java.lang.String str33 = element30.tagName();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(dataNodeList20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(textNodeList24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNull(element32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi!></hi!>");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("<hi!></hi!>");
        org.jsoup.nodes.Element element5 = element1.prependElement("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node8 = element7.nextSibling();
        org.jsoup.nodes.Element element10 = element7.prependElement("hi!");
        org.jsoup.nodes.Attributes attributes11 = element10.attributes();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node14 = element13.nextSibling();
        org.jsoup.nodes.Element element16 = element13.prependElement("hi!");
        org.jsoup.nodes.Element element18 = element16.removeClass("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList19 = element18.dataNodes();
        org.jsoup.nodes.Element element20 = element10.appendTo(element18);
        org.jsoup.nodes.Element element22 = element20.addClass("");
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node25 = element24.nextSibling();
        org.jsoup.nodes.Element element27 = element24.prependElement("hi!");
        org.jsoup.nodes.Attributes attributes28 = element27.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = element27.siblingNodes();
        org.jsoup.nodes.Element element31 = element27.prependText("");
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node34 = element33.nextSibling();
        org.jsoup.nodes.Element element36 = element33.prependElement("hi!");
        org.jsoup.nodes.Element element38 = element36.removeClass("");
        org.jsoup.select.Elements elements40 = element36.getElementsContainingOwnText("hi!");
        element36.remove();
        org.jsoup.nodes.Element element43 = element36.appendText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList44 = element36.ensureChildNodes();
        boolean boolean45 = element31.hasSameValue((java.lang.Object) element36);
        org.jsoup.nodes.Element element46 = element20.doClone((org.jsoup.nodes.Node) element36);
        java.lang.String str47 = element46.className();
        org.jsoup.nodes.Element element48 = element5.doClone((org.jsoup.nodes.Node) element46);
        org.jsoup.nodes.Element element50 = element48.removeClass("<hi! class=\"\">\n <<hi!></hi!>></<hi!></hi!>>\n</hi!>");
        org.jsoup.select.Elements elements52 = element50.getElementsMatchingText("<hi! class=\"\">\n <<hi!></hi!>></<hi!></hi!>>\n</hi!>");
        boolean boolean53 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element50);
        java.util.Collection<org.jsoup.nodes.Element> elementCollection55 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element56 = element50.insertChildren((int) (byte) -1, elementCollection55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Children collection to be inserted must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(dataNodeList19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(elements52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
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
        org.jsoup.nodes.Element element42 = element40.wrap("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element44 = element40.removeClass("");
        element40.setBaseUri("<hi! value=\"<hi!></hi!>\" class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element48 = element40.appendElement("<<hi!></hi!>></<hi!></hi!>>");
        org.jsoup.nodes.Element element50 = element48.removeClass("<hi!>\n hi!\n <hi! class=\"\">\n  <<hi!></hi!>></<hi!></hi!>>\n </hi!>\n <hi!></hi!>\n</hi!>");
        int int51 = element50.childNodeSize();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(dataNodeList13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
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
        org.jsoup.nodes.Element element27 = element23.removeClass("<<hi!></hi!>></<hi!></hi!>>&lt;hi!&gt; hi! &lt;/hi!&gt;");
        org.jsoup.nodes.Element element29 = element23.val("<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(dataNodeList20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(textNodeList24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
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
        org.jsoup.nodes.Element element45 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node46 = element45.nextSibling();
        org.jsoup.nodes.Element element48 = element45.prependElement("hi!");
        org.jsoup.nodes.Element element50 = element48.removeClass("");
        org.jsoup.nodes.Element element52 = element48.html("");
        boolean boolean53 = element30.equals((java.lang.Object) "");
        org.jsoup.nodes.Node node54 = element30.parentNode();
        boolean boolean55 = element30.hasText();
        element30.nodelistChanged();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList57 = element30.textNodes();
        boolean boolean58 = element30.hasText();
        org.jsoup.nodes.Element element59 = element30.empty();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(dataNodeList13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<hi!></hi!>" + "'", str41, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(textNodeList57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(element59);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.appendTo(element3);
        java.lang.String str5 = element3.text();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element7.appendTo(element9);
        org.jsoup.nodes.Attributes attributes11 = element10.attributes();
        org.jsoup.nodes.Element element12 = element3.prependChild((org.jsoup.nodes.Node) element10);
        org.jsoup.select.Elements elements14 = element12.getElementsMatchingOwnText("<hi!></hi!>");
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element19 = element16.appendTo(element18);
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node22 = element21.nextSibling();
        org.jsoup.nodes.Element element24 = element21.prependElement("hi!");
        int int25 = element21.elementSiblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = element21.siblingNodes();
        org.jsoup.nodes.Element element28 = element21.html("");
        boolean boolean29 = element19.equals((java.lang.Object) element28);
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node32 = element31.nextSibling();
        org.jsoup.nodes.Element element34 = element31.prependElement("hi!");
        org.jsoup.nodes.Attributes attributes35 = element34.attributes();
        org.jsoup.nodes.Element element37 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node38 = element37.nextSibling();
        org.jsoup.nodes.Element element40 = element37.prependElement("hi!");
        org.jsoup.nodes.Element element42 = element40.removeClass("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList43 = element42.dataNodes();
        org.jsoup.nodes.Element element44 = element34.appendTo(element42);
        org.jsoup.nodes.Element element46 = element44.addClass("");
        org.jsoup.nodes.Element element48 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node49 = element48.nextSibling();
        org.jsoup.nodes.Element element51 = element48.prependElement("hi!");
        org.jsoup.nodes.Attributes attributes52 = element51.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList53 = element51.siblingNodes();
        org.jsoup.nodes.Element element55 = element51.prependText("");
        org.jsoup.nodes.Element element57 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node58 = element57.nextSibling();
        org.jsoup.nodes.Element element60 = element57.prependElement("hi!");
        org.jsoup.nodes.Element element62 = element60.removeClass("");
        org.jsoup.select.Elements elements64 = element60.getElementsContainingOwnText("hi!");
        element60.remove();
        org.jsoup.nodes.Element element67 = element60.appendText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList68 = element60.ensureChildNodes();
        boolean boolean69 = element55.hasSameValue((java.lang.Object) element60);
        org.jsoup.nodes.Element element70 = element44.doClone((org.jsoup.nodes.Node) element60);
        java.lang.String[] strArray74 = new java.lang.String[] { "<hi!></hi!>", "<hi!></hi!>", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet75 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet75, strArray74);
        org.jsoup.nodes.Element element77 = element60.classNames((java.util.Set<java.lang.String>) strSet75);
        org.jsoup.nodes.Element element78 = element28.classNames((java.util.Set<java.lang.String>) strSet75);
        org.jsoup.nodes.Element element79 = element12.classNames((java.util.Set<java.lang.String>) strSet75);
        org.jsoup.nodes.Element element81 = element12.append("<&lt;hi!&gt;&lt;/hi!&gt;></&lt;hi!&gt;&lt;/hi!&gt;>");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(dataNodeList43);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(attributes52);
        org.junit.Assert.assertNotNull(nodeList53);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertNotNull(element62);
        org.junit.Assert.assertNotNull(elements64);
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertNotNull(nodeList68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(element70);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "<hi!></hi!>", "<hi!></hi!>", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(element77);
        org.junit.Assert.assertNotNull(element78);
        org.junit.Assert.assertNotNull(element79);
        org.junit.Assert.assertNotNull(element81);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
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
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        org.jsoup.nodes.Element element19 = element16.append("");
        org.jsoup.nodes.Element element21 = element16.html("<hi!></hi!>");
        org.jsoup.select.Elements elements22 = element21.getAllElements();
        org.jsoup.nodes.Element element24 = element21.prependText("<hi!></hi!>");
        boolean boolean25 = element21.isBlock();
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node28 = element27.nextSibling();
        org.jsoup.nodes.Element element30 = element27.prependElement("hi!");
        org.jsoup.nodes.Element element32 = element30.removeClass("");
        java.lang.String str34 = element32.absUrl("<hi!></hi!>");
        org.jsoup.nodes.Element element36 = element32.prependText("hi!");
        org.jsoup.nodes.Element element38 = element36.toggleClass("<hi!></hi!>");
        org.jsoup.nodes.Element element40 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node41 = element40.nextSibling();
        org.jsoup.nodes.Element element43 = element40.prependElement("hi!");
        org.jsoup.nodes.Element element45 = element43.removeClass("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList46 = element45.dataNodes();
        org.jsoup.nodes.Element element47 = element45.nextElementSibling();
        org.jsoup.nodes.Element element50 = element45.attr("", false);
        org.jsoup.select.Elements elements52 = element45.getElementsByAttributeStarting("<hi!></hi!>");
        org.jsoup.select.Elements elements54 = element45.getElementsByIndexGreaterThan((int) (short) 0);
        element45.nodelistChanged();
        org.jsoup.nodes.Element element57 = element45.appendElement("hi!");
        org.jsoup.nodes.Element element58 = element36.before((org.jsoup.nodes.Node) element45);
        org.jsoup.select.Elements elements61 = element45.getElementsByAttributeValueNot("<hi!>\n</hi!>", "<hi!></hi!>");
        boolean boolean62 = element21.equals((java.lang.Object) elements61);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(dataNodeList13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(dataNodeList46);
        org.junit.Assert.assertNull(element47);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(elements52);
        org.junit.Assert.assertNotNull(elements54);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(elements61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
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
        org.jsoup.nodes.Element element19 = element17.before("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element20 = element17.empty();
        org.jsoup.nodes.Element element22 = element17.addClass("<hi! ></hi!>");
        element22.remove();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element("<hi!></hi!>");
        org.jsoup.select.Elements elements27 = element25.getElementsByClass("<hi!></hi!>");
        org.jsoup.nodes.Element element29 = element25.prependElement("<hi!>\n</hi!>");
        boolean boolean30 = element22.hasSameValue((java.lang.Object) element25);
        java.lang.Appendable appendable31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = null;
        // The following exception was thrown during execution in test generation
        try {
            element22.outerHtmlHead(appendable31, (int) (short) 10, outputSettings33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.removeClass("");
        java.lang.String str8 = element6.absUrl("<hi!></hi!>");
        org.jsoup.nodes.Element element10 = element6.prependText("hi!");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element15 = element12.appendTo(element14);
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node18 = element17.nextSibling();
        org.jsoup.nodes.Element element20 = element17.prependElement("hi!");
        int int21 = element17.elementSiblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = element17.siblingNodes();
        org.jsoup.nodes.Element element24 = element17.html("");
        boolean boolean25 = element15.equals((java.lang.Object) element24);
        org.jsoup.nodes.Element element26 = element24.clone();
        org.jsoup.nodes.Element element27 = element10.after((org.jsoup.nodes.Node) element26);
        org.jsoup.nodes.Element element29 = element10.after("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node32 = element31.nextSibling();
        org.jsoup.nodes.Element element34 = element31.prependElement("hi!");
        org.jsoup.nodes.Attributes attributes35 = element34.attributes();
        org.jsoup.nodes.Element element37 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node38 = element37.nextSibling();
        org.jsoup.nodes.Element element40 = element37.prependElement("hi!");
        org.jsoup.nodes.Element element42 = element40.removeClass("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList43 = element42.dataNodes();
        org.jsoup.nodes.Element element44 = element34.appendTo(element42);
        org.jsoup.select.Elements elements45 = element34.getAllElements();
        org.jsoup.select.Elements elements47 = element34.getElementsMatchingOwnText("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList48 = element34.childNodesCopy();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList49 = element34.textNodes();
        org.jsoup.nodes.Element element50 = element10.before((org.jsoup.nodes.Node) element34);
        org.jsoup.select.Elements elements53 = element34.getElementsByAttributeValueNot("<hi!>\n</hi!>", "<hi!></hi!>&lt;hi!&gt; hi! &lt;/hi!&gt;");
        org.jsoup.nodes.Element element55 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node56 = element55.nextSibling();
        org.jsoup.nodes.Element element58 = element55.prependElement("hi!");
        org.jsoup.nodes.Node node60 = element55.removeAttr("<hi!></hi!>");
        org.jsoup.select.Elements elements62 = element55.getElementsByAttribute("<hi!></hi!>");
        org.jsoup.nodes.Element element63 = element55.shallowClone();
        org.jsoup.nodes.Element element65 = element55.prependElement("<hi!></hi!>");
        org.jsoup.nodes.Element element66 = element34.before((org.jsoup.nodes.Node) element65);
        org.jsoup.nodes.Element element68 = element34.prependElement("&lt;hi!&gt;&lt;/hi!&gt;");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(dataNodeList43);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNotNull(nodeList48);
        org.junit.Assert.assertNotNull(textNodeList49);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(elements62);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertNotNull(element66);
        org.junit.Assert.assertNotNull(element68);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.removeClass("");
        org.jsoup.select.Elements elements7 = element4.parents();
        org.jsoup.select.Elements elements8 = element4.parents();
        org.jsoup.nodes.Element element10 = element4.toggleClass("<hi!></hi!>");
        org.jsoup.select.Elements elements12 = element4.getElementsByIndexEquals((int) (byte) 100);
        org.jsoup.nodes.Element element14 = element4.after("<hi!> hi! </hi!>");
        org.jsoup.nodes.Element element16 = element14.before("<hi! class=\"<hi!></hi!> hi!\"></hi!>");
        org.jsoup.select.Elements elements18 = element16.getElementsContainingOwnText("<hi! <hi!>\n <<hi!>\n</hi!>></<hi!>\n</hi!>>\n</hi!>>\n &lt;hi!&gt; hi! &lt;hi! class=\"\"&gt; &lt;&lt;hi!&gt;&lt;/hi!&gt;&gt;&lt;/&lt;hi!&gt;&lt;/hi!&gt;&gt; &lt;/hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>");
        element16.nodelistChanged();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.removeClass("");
        org.jsoup.select.Elements elements7 = element4.parents();
        org.jsoup.select.Elements elements8 = element4.parents();
        org.jsoup.nodes.Element element10 = element4.toggleClass("<hi!></hi!>");
        boolean boolean11 = element4.hasAttributes();
        org.jsoup.nodes.Element element13 = element4.prepend("<hi! ></hi!>");
        org.jsoup.select.Evaluator evaluator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = element4.is(evaluator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.removeClass("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element6.dataNodes();
        org.jsoup.select.Elements elements10 = element6.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.parser.Tag tag11 = element6.tag();
        java.lang.String str12 = element6.tagName();
        org.jsoup.select.Elements elements15 = element6.getElementsByAttributeValueMatching("<hi!>\n</hi!>", "<hi!></hi!>");
        java.lang.String str16 = element6.ownText();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            element6.outerHtmlHead(appendable17, (int) (short) 1, outputSettings19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi!></hi!>");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("<hi!></hi!>");
        org.jsoup.nodes.Element element5 = element1.prependElement("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node8 = element7.nextSibling();
        org.jsoup.nodes.Element element10 = element7.prependElement("hi!");
        org.jsoup.nodes.Attributes attributes11 = element10.attributes();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node14 = element13.nextSibling();
        org.jsoup.nodes.Element element16 = element13.prependElement("hi!");
        org.jsoup.nodes.Element element18 = element16.removeClass("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList19 = element18.dataNodes();
        org.jsoup.nodes.Element element20 = element10.appendTo(element18);
        org.jsoup.nodes.Element element22 = element20.addClass("");
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node25 = element24.nextSibling();
        org.jsoup.nodes.Element element27 = element24.prependElement("hi!");
        org.jsoup.nodes.Attributes attributes28 = element27.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = element27.siblingNodes();
        org.jsoup.nodes.Element element31 = element27.prependText("");
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node34 = element33.nextSibling();
        org.jsoup.nodes.Element element36 = element33.prependElement("hi!");
        org.jsoup.nodes.Element element38 = element36.removeClass("");
        org.jsoup.select.Elements elements40 = element36.getElementsContainingOwnText("hi!");
        element36.remove();
        org.jsoup.nodes.Element element43 = element36.appendText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList44 = element36.ensureChildNodes();
        boolean boolean45 = element31.hasSameValue((java.lang.Object) element36);
        org.jsoup.nodes.Element element46 = element20.doClone((org.jsoup.nodes.Node) element36);
        java.lang.String str47 = element46.className();
        org.jsoup.nodes.Element element48 = element5.doClone((org.jsoup.nodes.Node) element46);
        org.jsoup.nodes.Element element50 = element48.val("<hi!>\n</hi!>");
        org.jsoup.select.Elements elements52 = element48.getElementsByIndexGreaterThan((int) (short) 10);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(dataNodeList19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(elements52);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
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
        org.jsoup.select.Elements elements49 = element47.getElementsByIndexEquals((-1));
        org.jsoup.nodes.Element element51 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node52 = element51.nextSibling();
        org.jsoup.nodes.Element element54 = element51.prependElement("hi!");
        org.jsoup.nodes.Element element56 = element54.removeClass("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList57 = element56.dataNodes();
        org.jsoup.select.Elements elements60 = element56.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.parser.Tag tag61 = element56.tag();
        java.lang.String str62 = element56.tagName();
        org.jsoup.nodes.Element element64 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node65 = element64.nextSibling();
        org.jsoup.nodes.Element element67 = element64.prependElement("hi!");
        int int68 = element64.elementSiblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList69 = element64.siblingNodes();
        org.jsoup.nodes.Element element70 = element56.appendChild((org.jsoup.nodes.Node) element64);
        java.util.List<org.jsoup.nodes.Node> nodeList71 = element56.childNodes();
        element47.childNodes = nodeList71;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element74 = element47.appendText("<hi!>\n <<hi!>\n</hi!>></<hi!>\n</hi!>>\n</hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(dataNodeList13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "<hi!></hi!>", "<hi!></hi!>", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(dataNodeList57);
        org.junit.Assert.assertNotNull(elements60);
        org.junit.Assert.assertNotNull(tag61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(nodeList69);
        org.junit.Assert.assertNotNull(element70);
        org.junit.Assert.assertNotNull(nodeList71);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element4 = element2.addClass("");
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node7 = element6.nextSibling();
        org.jsoup.nodes.Element element9 = element6.prependElement("hi!");
        org.jsoup.nodes.Attributes attributes10 = element9.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element9.siblingNodes();
        org.jsoup.nodes.Element element13 = element9.prependText("");
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node16 = element15.nextSibling();
        org.jsoup.nodes.Element element18 = element15.prependElement("hi!");
        org.jsoup.nodes.Element element20 = element18.removeClass("");
        org.jsoup.select.Elements elements22 = element18.getElementsContainingOwnText("hi!");
        element18.remove();
        org.jsoup.nodes.Element element25 = element18.appendText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = element18.ensureChildNodes();
        boolean boolean27 = element13.hasSameValue((java.lang.Object) element18);
        org.jsoup.nodes.Element element28 = element2.doClone((org.jsoup.nodes.Node) element18);
        java.lang.String str29 = element18.nodeName();
        org.jsoup.select.Elements elements31 = element18.getElementsByIndexEquals(1);
        boolean boolean32 = element18.hasText();
        boolean boolean33 = element18.isBlock();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi! class=\"<hi!></hi!>\">\n <hi! class=\"\" value=\"<hi!></hi!>\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element3 = element1.prepend("<hi!>\n hi!\n</hi!>");
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan((int) (short) 100);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.appendTo(element3);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = element1.dataset();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element7.appendTo(element9);
        org.jsoup.select.Elements elements12 = element7.getElementsByIndexEquals(100);
        int int13 = element7.siblingIndex();
        org.jsoup.select.Elements elements15 = element7.getElementsByIndexEquals((int) (short) 1);
        java.lang.String str16 = element7.text();
        java.lang.String str17 = element7.nodeName();
        org.jsoup.nodes.Element element18 = element1.after((org.jsoup.nodes.Node) element7);
        org.jsoup.select.Elements elements19 = element1.children();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = element1.dataset();
        java.util.Set<java.lang.String> strSet21 = element1.classNames();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.html("hi!");
        java.lang.String str7 = element4.data();
        org.jsoup.nodes.Node node8 = element4.clearAttributes();
        org.jsoup.nodes.Element element10 = element4.after("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element12 = element10.append("<hi!>\n hi!\n <<hi!>\n</hi!>></<hi!>\n</hi!>>\n</hi!>");
        org.jsoup.nodes.Node node13 = element12.clearAttributes();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
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
        org.jsoup.nodes.Attributes attributes17 = element14.attributes();
        java.lang.String str19 = element14.attr("hi!");
        org.jsoup.nodes.Element element21 = element14.appendElement("<hi!></hi!>");
        org.jsoup.nodes.Element element23 = element14.appendText("");
        org.jsoup.nodes.Element element25 = element23.tagName("<hi!></hi!>");
        java.lang.String str26 = element23.toString();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(dataNodeList13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<<hi!></hi!> class=\"\">\n <<hi!></hi!>></<hi!></hi!>>\n</<hi!></hi!>>" + "'", str26, "<<hi!></hi!> class=\"\">\n <<hi!></hi!>></<hi!></hi!>>\n</<hi!></hi!>>");
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
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
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList17 = element16.dataNodes();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(dataNodeList13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(dataNodeList17);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.appendTo(element3);
        org.jsoup.nodes.Element element5 = element1.shallowClone();
        org.jsoup.nodes.Element element7 = element5.val("<hi!>\n hi!\n <hi! class=\"\">\n  <<hi!></hi!>></<hi!></hi!>>\n </hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element8 = element5.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = element8.val();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.appendTo(element3);
        org.jsoup.nodes.Element element6 = element3.prependText("");
        java.lang.String str7 = element3.val();
        org.jsoup.nodes.Element element10 = element3.attr("<hi!>\n</hi!>", "hi!");
        org.jsoup.select.Elements elements13 = element3.getElementsByAttributeValue("<hi!>\n hi!\n</hi!>", "hi!");
        int int14 = element3.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements16 = element3.select("&lt;hi!&gt;&lt;/hi!&gt;");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '&lt;hi!&gt;&lt;/hi!&gt;': unexpected token at '&lt;hi!&gt;&lt;/hi!&gt;'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.removeClass("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element6.dataNodes();
        org.jsoup.nodes.Element element8 = element6.nextElementSibling();
        org.jsoup.nodes.Element element11 = element6.attr("", false);
        org.jsoup.select.Elements elements13 = element6.getElementsByAttributeStarting("<hi!></hi!>");
        org.jsoup.select.Elements elements15 = element6.getElementsByIndexGreaterThan((int) (short) 0);
        element6.nodelistChanged();
        org.jsoup.nodes.Element element18 = element6.appendElement("hi!");
        org.jsoup.nodes.Element element20 = element18.after("<hi! class=\"hi!\">\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.appendTo(element3);
        org.jsoup.nodes.Element element6 = element3.prependText("");
        org.jsoup.nodes.Element element7 = element3.shallowClone();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList8 = element3.textNodes();
        org.jsoup.nodes.Element element10 = element3.text("<hi!>\n hi!\n <hi! class=\"\">\n  <<hi!></hi!>></<hi!></hi!>>\n </hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element11 = element3.parent();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(textNodeList8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(element11);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements4 = element1.getElementsByAttribute("hi!");
        boolean boolean6 = element1.hasAttr("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element1.previousElementSibling();
        org.jsoup.select.Elements elements9 = element1.getElementsByAttribute("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Node node10 = element1.clearAttributes();
        org.jsoup.nodes.Node node11 = element1.previousSibling();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.removeClass("");
        java.lang.String str8 = element6.absUrl("<hi!></hi!>");
        org.jsoup.nodes.Element element10 = element6.prependText("hi!");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node13 = element12.nextSibling();
        org.jsoup.nodes.Element element15 = element12.prependElement("hi!");
        org.jsoup.nodes.Attributes attributes16 = element15.attributes();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node19 = element18.nextSibling();
        org.jsoup.nodes.Element element21 = element18.prependElement("hi!");
        org.jsoup.nodes.Element element23 = element21.removeClass("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList24 = element23.dataNodes();
        org.jsoup.nodes.Element element25 = element15.appendTo(element23);
        org.jsoup.nodes.Element element27 = element25.addClass("");
        org.jsoup.nodes.Attributes attributes28 = element25.attributes();
        java.lang.String str30 = element25.attr("hi!");
        org.jsoup.nodes.Element element32 = element25.appendElement("<hi!></hi!>");
        org.jsoup.nodes.Element element33 = element10.appendChild((org.jsoup.nodes.Node) element25);
        java.lang.String str34 = element33.val();
        org.jsoup.select.Elements elements36 = element33.getElementsByClass("<hi! class=\"\">\n <<hi!></hi!>></<hi!></hi!>>\n</hi!>");
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node39 = element38.nextSibling();
        org.jsoup.nodes.Element element41 = element38.prependElement("hi!");
        org.jsoup.nodes.Attributes attributes42 = element41.attributes();
        boolean boolean44 = element41.hasAttr("<hi!></hi!>");
        org.jsoup.select.Elements elements45 = element41.siblingElements();
        org.jsoup.nodes.Element element46 = element41.nextElementSibling();
        org.jsoup.select.Elements elements48 = element41.getElementsContainingOwnText("");
        boolean boolean49 = element41.hasParent();
        org.jsoup.nodes.Element element50 = element33.appendChild((org.jsoup.nodes.Node) element41);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(dataNodeList24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertNull(element46);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(element50);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        element2.setBaseUri("");
        element2.setBaseUri("");
        org.jsoup.nodes.Element element7 = element2.clone();
        org.jsoup.nodes.Node node9 = element7.removeAttr("hi!");
        org.jsoup.nodes.Element element11 = element7.appendText("hi!");
        org.jsoup.parser.Tag tag12 = element7.tag();
        org.jsoup.nodes.Element element14 = element7.prependElement("<hi!>\n hi!\n <hi! class=\"\">\n  <<hi!></hi!>></<hi!></hi!>>\n </hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element16 = element14.text("<hi! ></hi!>");
        java.lang.String str18 = element16.absUrl("<hi! class=\"\" value=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Attributes attributes19 = element16.attributes();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes19);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.removeClass("");
        org.jsoup.select.Elements elements7 = element4.parents();
        org.jsoup.select.Elements elements9 = element4.getElementsByAttributeStarting("<hi!></hi!>");
        boolean boolean10 = element4.hasAttributes();
        org.jsoup.nodes.Element element12 = element4.val("&lt;hi!&gt;&lt;/hi!&gt;");
        org.jsoup.nodes.Node node13 = element4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node13.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element4 = element2.addClass("");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = element4.childNodes;
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(nodeList5);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.appendTo(element3);
        org.jsoup.nodes.Element element5 = element1.shallowClone();
        boolean boolean6 = element1.isBlock();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = element1.dataset();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.removeClass("");
        java.lang.String str8 = element6.absUrl("<hi!></hi!>");
        org.jsoup.nodes.Element element10 = element6.prependText("hi!");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node13 = element12.nextSibling();
        org.jsoup.nodes.Element element15 = element12.prependElement("hi!");
        org.jsoup.nodes.Attributes attributes16 = element15.attributes();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node19 = element18.nextSibling();
        org.jsoup.nodes.Element element21 = element18.prependElement("hi!");
        org.jsoup.nodes.Element element23 = element21.removeClass("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList24 = element23.dataNodes();
        org.jsoup.nodes.Element element25 = element15.appendTo(element23);
        org.jsoup.nodes.Element element27 = element25.addClass("");
        org.jsoup.nodes.Attributes attributes28 = element25.attributes();
        java.lang.String str30 = element25.attr("hi!");
        org.jsoup.nodes.Element element32 = element25.appendElement("<hi!></hi!>");
        org.jsoup.nodes.Element element33 = element10.appendChild((org.jsoup.nodes.Node) element25);
        org.jsoup.nodes.Element element35 = element33.addClass("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element37 = element35.addClass("<hi! ></hi!>");
        org.jsoup.select.Elements elements40 = element37.getElementsByAttributeValueMatching("<hi!> hi! </hi!>", "<hi!></hi!>&lt;hi!&gt; hi! &lt;/hi!&gt;");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(dataNodeList24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements40);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.nodes.Attributes attributes5 = element4.attributes();
        boolean boolean7 = element4.hasAttr("<hi!></hi!>");
        org.jsoup.select.Elements elements8 = element4.siblingElements();
        org.jsoup.nodes.Element element9 = element4.nextElementSibling();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element14 = element11.appendTo(element13);
        org.jsoup.nodes.Element element16 = element13.prependText("");
        java.lang.String str17 = element13.val();
        org.jsoup.nodes.Element element20 = element13.attr("<hi!>\n</hi!>", "hi!");
        org.jsoup.nodes.Element element22 = element13.prepend("<hi! ></hi!>");
        org.jsoup.select.Elements elements25 = element13.getElementsByAttributeValueStarting("<hi! value=\"<hi! value=&quot;<hi!></hi!>&quot; class=&quot;<hi!></hi!>&quot;></hi!>\">\n <hi!></hi!>\n</hi!>", "<hi!>\n</hi!>");
        org.jsoup.nodes.Element element26 = element4.after((org.jsoup.nodes.Node) element13);
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node29 = element28.nextSibling();
        org.jsoup.nodes.Element element31 = element28.prependElement("hi!");
        org.jsoup.nodes.Element element33 = element31.removeClass("");
        org.jsoup.select.Elements elements34 = element31.parents();
        org.jsoup.select.Elements elements35 = element31.parents();
        org.jsoup.nodes.Element element37 = element31.toggleClass("<hi!></hi!>");
        org.jsoup.nodes.Element element39 = element31.wrap("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList40 = element39.childNodes();
        java.lang.String str41 = element39.ownText();
        org.jsoup.nodes.Element element43 = element39.removeClass("<hi!>\n &lt;hi!&gt; &lt;/hi!&gt;\n <hi!></hi!>\n</hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList44 = element43.ensureChildNodes();
        element13.childNodes = nodeList44;
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(nodeList44);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.appendTo(element3);
        org.jsoup.select.Elements elements6 = element3.getElementsByAttribute("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element3.childNodes();
        element3.doSetBaseUri("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element12 = element3.attr("<hi! ></hi!>", "<hi! class=\"\"> <<hi!></hi!>></<hi!></hi!>> </hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = element3.childNodes;
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.removeClass("");
        java.lang.String str8 = element6.absUrl("<hi!></hi!>");
        org.jsoup.nodes.Element element10 = element6.prependText("hi!");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element15 = element12.appendTo(element14);
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node18 = element17.nextSibling();
        org.jsoup.nodes.Element element20 = element17.prependElement("hi!");
        int int21 = element17.elementSiblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = element17.siblingNodes();
        org.jsoup.nodes.Element element24 = element17.html("");
        boolean boolean25 = element15.equals((java.lang.Object) element24);
        org.jsoup.nodes.Element element26 = element24.clone();
        org.jsoup.nodes.Element element27 = element10.after((org.jsoup.nodes.Node) element26);
        org.jsoup.nodes.Element element29 = element10.after("<hi!>\n hi!\n</hi!>");
        org.jsoup.select.Elements elements31 = element10.getElementsByTag("hi!");
        element10.nodelistChanged();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements31);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.removeClass("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element6.dataNodes();
        org.jsoup.nodes.Node node8 = element6.parentNode();
        org.jsoup.select.Elements elements10 = element6.getElementsContainingText("hi!");
        org.jsoup.select.Elements elements13 = element6.getElementsByAttributeValueNot("<hi!>\n <hi!></hi!>\n</hi!>", "<hi! class=\"<hi!></hi!>\"></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = element6.ensureChildNodes();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
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
        java.lang.String str26 = element3.nodeName();
        java.lang.String str27 = element3.outerHtml();
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node30 = element29.nextSibling();
        org.jsoup.nodes.Element element32 = element29.prependElement("hi!");
        org.jsoup.nodes.Element element33 = element3.appendTo(element29);
        org.jsoup.nodes.Element element35 = element29.prependElement("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element37 = element35.after("<hi! class=\"\">\n <<hi!></hi!>></<hi!></hi!>>\n</hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList38 = element37.siblingNodes();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(dataNodeList18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<hi!>\n <hi!></hi!>\n</hi!>" + "'", str27, "<hi!>\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(nodeList38);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.nodes.Node node6 = element1.removeAttr("<hi!></hi!>");
        org.jsoup.select.Elements elements8 = element1.getElementsByAttribute("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = element1.shallowClone();
        org.jsoup.nodes.Element element11 = element1.prependElement("<hi!></hi!>");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element16 = element13.appendTo(element15);
        org.jsoup.nodes.Element element18 = element15.prependText("");
        java.lang.String str19 = element15.val();
        org.jsoup.nodes.Node node20 = element15.nextSibling();
        boolean boolean21 = element15.hasAttributes();
        java.util.regex.Pattern pattern23 = null;
        org.jsoup.select.Elements elements24 = element15.getElementsByAttributeValueMatching("<hi!> hi! </hi!>", pattern23);
        org.jsoup.nodes.Element element25 = element11.appendTo(element15);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element25);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.removeClass("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element6.dataNodes();
        org.jsoup.nodes.Element element8 = element6.nextElementSibling();
        org.jsoup.nodes.Node node9 = element6.root();
        boolean boolean10 = element6.hasAttributes();
        org.jsoup.nodes.Element element12 = element6.addClass("<hi! class=\"\" value=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Node node13 = element6.previousSibling();
        org.jsoup.select.Evaluator evaluator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = element6.is(evaluator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
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
        org.jsoup.nodes.Element element19 = element17.before("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element20 = element17.empty();
        org.jsoup.nodes.Element element22 = element17.addClass("<hi! ></hi!>");
        org.jsoup.nodes.Element element24 = element22.prependElement("<hi! class=\"\"></hi!>");
        org.jsoup.select.Elements elements27 = element24.getElementsByAttributeValueMatching("<hi!>\n <hi! class=\"\" value=\"<hi!></hi!>\"></hi!>\n</hi!>", "<hi! class=\"\" value=\"<hi!></hi!>\"></hi!>");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements27);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.removeClass("");
        org.jsoup.nodes.Element element8 = element4.html("");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element10.empty();
        java.lang.String str12 = element11.toString();
        org.jsoup.nodes.Node node13 = element11.parentNode();
        org.jsoup.parser.Tag tag14 = element11.tag();
        org.jsoup.nodes.Element element15 = element8.prependChild((org.jsoup.nodes.Node) element11);
        org.jsoup.select.Elements elements16 = element11.parents();
        java.lang.String str17 = element11.val();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList18 = element11.dataNodes();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<hi!></hi!>" + "'", str12, "<hi!></hi!>");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(dataNodeList18);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.removeClass("");
        java.lang.String str8 = element6.absUrl("<hi!></hi!>");
        org.jsoup.nodes.Element element10 = element6.prependText("hi!");
        org.jsoup.nodes.Element element12 = element10.toggleClass("<hi!></hi!>");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element17 = element14.appendTo(element16);
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element21 = element20.empty();
        org.jsoup.select.Elements elements23 = element20.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element24 = element17.insertChildren((int) (byte) -1, (java.util.Collection<org.jsoup.nodes.Element>) elements23);
        java.lang.String str25 = element17.text();
        org.jsoup.nodes.Element element27 = element17.before("");
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element32 = element29.appendTo(element31);
        java.lang.String str33 = element32.nodeName();
        org.jsoup.nodes.Element element34 = element27.prependChild((org.jsoup.nodes.Node) element32);
        java.util.List<org.jsoup.nodes.Node> nodeList35 = element34.childNodes();
        boolean boolean36 = element12.equals((java.lang.Object) nodeList35);
        org.jsoup.nodes.Element element37 = element12.parent();
        org.jsoup.nodes.Element element39 = element37.removeClass("<hi! class=\"\">\n <<hi!></hi!>></<hi!></hi!>>\n</hi!>");
        org.jsoup.nodes.Node node40 = element39.previousSibling();
        java.lang.Appendable appendable41 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = null;
        // The following exception was thrown during execution in test generation
        try {
            element39.outerHtmlHead(appendable41, (int) '#', outputSettings43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNull(node40);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
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
        org.jsoup.nodes.Element element17 = element15.toggleClass("");
        org.jsoup.nodes.Attributes attributes18 = element17.attributes();
        org.jsoup.select.Elements elements20 = element17.getElementsByAttribute("<hi!>\n <<hi!>\n</hi!>></<hi!>\n</hi!>>\n</hi!>");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        int int5 = element1.elementSiblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.siblingNodes();
        org.jsoup.nodes.Element element8 = element1.html("");
        org.jsoup.nodes.Node node9 = element8.root();
        java.lang.String str11 = element8.absUrl("<hi! class=\"\">\n <<hi!></hi!>></<hi!></hi!>>\n</hi!>");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node14 = element13.nextSibling();
        org.jsoup.nodes.Element element16 = element13.prependElement("hi!");
        org.jsoup.nodes.Element element18 = element16.removeClass("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList19 = element18.dataNodes();
        org.jsoup.nodes.Element element20 = element18.nextElementSibling();
        org.jsoup.nodes.Element element23 = element18.attr("", false);
        org.jsoup.select.Elements elements25 = element18.getElementsByAttributeStarting("<hi!></hi!>");
        java.lang.String str27 = element18.absUrl("<hi!></hi!>");
        org.jsoup.nodes.Element element28 = element8.appendChild((org.jsoup.nodes.Node) element18);
        org.jsoup.nodes.Element element30 = element28.removeClass("");
        int int31 = element30.elementSiblingIndex();
        java.lang.String str32 = element30.data();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(dataNodeList19);
        org.junit.Assert.assertNull(element20);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.appendTo(element3);
        org.jsoup.nodes.Attributes attributes5 = element4.attributes();
        boolean boolean7 = element4.hasAttr("<hi!>\n</hi!>");
        org.jsoup.nodes.Node node9 = element4.removeAttr("<hi! class=\"\"> <<hi!></hi!>></<hi!></hi!>> </hi!>");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.removeClass("");
        org.jsoup.nodes.Element element8 = element4.html("");
        int int9 = element8.childNodeSize();
        org.jsoup.nodes.Element element11 = element8.tagName("<hi! <hi!>\n <<hi!>\n</hi!>></<hi!>\n</hi!>>\n</hi!>>\n &lt;hi!&gt; hi! &lt;hi! class=\"\"&gt; &lt;&lt;hi!&gt;&lt;/hi!&gt;&gt;&lt;/&lt;hi!&gt;&lt;/hi!&gt;&gt; &lt;/hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
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
        java.util.List<org.jsoup.nodes.Node> nodeList83 = element82.siblingNodes();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(dataNodeList20);
        org.junit.Assert.assertNull(element21);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(nodeList63);
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertNotNull(element69);
        org.junit.Assert.assertNotNull(strMap70);
        org.junit.Assert.assertNotNull(element71);
        org.junit.Assert.assertNotNull(element73);
        org.junit.Assert.assertNotNull(element76);
        org.junit.Assert.assertNotNull(elements78);
        org.junit.Assert.assertNotNull(elements81);
        org.junit.Assert.assertNotNull(element82);
        org.junit.Assert.assertNotNull(nodeList83);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.removeClass("");
        java.lang.String str8 = element6.absUrl("<hi!></hi!>");
        org.jsoup.nodes.Element element10 = element6.prependText("hi!");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element15 = element12.appendTo(element14);
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node18 = element17.nextSibling();
        org.jsoup.nodes.Element element20 = element17.prependElement("hi!");
        int int21 = element17.elementSiblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = element17.siblingNodes();
        org.jsoup.nodes.Element element24 = element17.html("");
        boolean boolean25 = element15.equals((java.lang.Object) element24);
        org.jsoup.nodes.Element element26 = element24.clone();
        org.jsoup.nodes.Element element27 = element10.after((org.jsoup.nodes.Node) element26);
        org.jsoup.nodes.Element element28 = element27.firstElementSibling();
        org.jsoup.nodes.Node node29 = element28.parentNode();
        org.jsoup.parser.Tag tag30 = element28.tag();
        java.util.regex.Pattern pattern31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements32 = element28.getElementsMatchingOwnText(pattern31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(tag30);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        element2.setBaseUri("");
        element2.setBaseUri("");
        org.jsoup.nodes.Element element7 = element2.clone();
        org.jsoup.nodes.Node node9 = element7.removeAttr("hi!");
        org.jsoup.nodes.Element element11 = element7.appendText("hi!");
        org.jsoup.parser.Tag tag12 = element7.tag();
        org.jsoup.nodes.Element element14 = element7.prependElement("<hi!>\n hi!\n <hi! class=\"\">\n  <<hi!></hi!>></<hi!></hi!>>\n </hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element16 = element14.text("<hi! ></hi!>");
        element14.doSetBaseUri("<hi! class=\"<hi!></hi!>\">\n <hi! class=\"\" value=\"<hi!></hi!>\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element23 = element20.appendTo(element22);
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node26 = element25.nextSibling();
        org.jsoup.nodes.Element element28 = element25.prependElement("hi!");
        int int29 = element25.elementSiblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = element25.siblingNodes();
        org.jsoup.nodes.Element element32 = element25.html("");
        boolean boolean33 = element23.equals((java.lang.Object) element32);
        org.jsoup.select.Elements elements35 = element23.getElementsByAttributeStarting("hi!");
        org.jsoup.parser.Tag tag36 = element23.tag();
        org.jsoup.nodes.Element element37 = element14.prependChild((org.jsoup.nodes.Node) element23);
        java.lang.String str39 = element23.absUrl("<hi!>\n <<hi!>\n</hi!>></<hi!>\n</hi!>>\n</hi!>");
        org.jsoup.nodes.Element element41 = element23.toggleClass("<hi!></hi!>");
        org.jsoup.nodes.Element element43 = element23.text("<hi!> hi! </hi!>");
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element43);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        element2.setBaseUri("");
        element2.setBaseUri("");
        org.jsoup.nodes.Element element7 = element2.clone();
        org.jsoup.nodes.Node node9 = element7.removeAttr("hi!");
        org.jsoup.nodes.Node node10 = element7.previousSibling();
        org.jsoup.select.Elements elements12 = element7.getElementsByAttributeStarting("<hi! class=\"<hi!></hi!> hi!\"></hi!>");
        boolean boolean13 = element7.hasParent();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.removeClass("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element6.dataNodes();
        org.jsoup.nodes.Element element8 = element6.nextElementSibling();
        org.jsoup.nodes.Element element11 = element6.attr("", false);
        org.jsoup.select.Elements elements13 = element6.getElementsByAttributeStarting("<hi!></hi!>");
        org.jsoup.select.Elements elements15 = element6.getElementsByIndexGreaterThan((int) (short) 0);
        element6.nodelistChanged();
        java.lang.String str18 = element6.attr("");
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node21 = element20.nextSibling();
        org.jsoup.nodes.Element element23 = element20.prependElement("hi!");
        org.jsoup.nodes.Node node25 = element20.removeAttr("<hi!></hi!>");
        org.jsoup.nodes.Element element26 = element6.appendChild(node25);
        org.jsoup.nodes.Element element27 = element6.shallowClone();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = element6.siblingNodes();
        org.jsoup.nodes.Element element30 = element6.appendText("<hi! value=\"<hi! value=&quot;<hi!></hi!>&quot; class=&quot;<hi!></hi!>&quot;></hi!>\">\n <hi!></hi!>\n</hi!>");
        org.jsoup.select.Elements elements33 = element30.getElementsByAttributeValueContaining("<hi!></hi!>", "<hi!>\n</hi!>");
        org.jsoup.nodes.Element element35 = element30.appendText("<hi! class=\"<hi!></hi!>\">\n hi!\n</hi!>");
        java.lang.String str36 = element30.val();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
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
        org.jsoup.select.Elements elements18 = element15.getElementsByAttributeValueNot("hi!", "hi!");
        org.jsoup.nodes.Node node20 = element15.removeAttr("hi!");
        boolean boolean21 = element10.hasSameValue((java.lang.Object) "hi!");
        boolean boolean22 = element10.hasText();
        org.jsoup.select.Elements elements24 = element10.getElementsByClass("<hi!> hi! </hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList25 = element10.dataNodes();
        org.jsoup.select.Elements elements27 = element10.getElementsContainingOwnText("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.nodes.Node node28 = element10.nextSibling();
        org.jsoup.select.Evaluator evaluator29 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = element10.is(evaluator29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(dataNodeList25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNull(node28);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.removeClass("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element6.dataNodes();
        org.jsoup.select.Elements elements10 = element6.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element12 = element6.tagName("hi!");
        org.jsoup.select.Elements elements13 = element12.siblingElements();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList14 = element12.dataNodes();
        java.util.Set<java.lang.String> strSet15 = element12.classNames();
        org.jsoup.nodes.Element element17 = element12.before("hi!");
        java.util.regex.Pattern pattern18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements19 = element12.getElementsMatchingText(pattern18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(dataNodeList14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.removeClass("");
        org.jsoup.select.Elements elements8 = element4.getElementsContainingOwnText("hi!");
        element4.remove();
        org.jsoup.nodes.Element element11 = element4.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element14 = element4.attr("<hi!>\n hi!\n</hi!>", "hi!");
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node17 = element16.nextSibling();
        org.jsoup.nodes.Element element19 = element16.prependElement("hi!");
        org.jsoup.nodes.Element element21 = element19.removeClass("");
        java.lang.String str23 = element21.absUrl("<hi!></hi!>");
        org.jsoup.nodes.Element element25 = element21.appendText("<hi!></hi!>");
        java.lang.String[] strArray28 = new java.lang.String[] { "", "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        org.jsoup.nodes.Element element31 = element21.classNames((java.util.Set<java.lang.String>) strSet29);
        org.jsoup.nodes.Element element32 = element14.classNames((java.util.Set<java.lang.String>) strSet29);
        org.jsoup.nodes.Element element34 = element32.toggleClass("<hi!>\n <hi! class=\"\" value=\"<hi!></hi!>\"></hi!>\n</hi!>");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "", "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi!>\n hi!\n <hi!></hi!>\n</hi!>");
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.removeClass("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element6.dataNodes();
        org.jsoup.nodes.Element element8 = element6.nextElementSibling();
        org.jsoup.nodes.Element element11 = element6.attr("", false);
        org.jsoup.select.Elements elements13 = element6.getElementsByAttributeStarting("<hi!></hi!>");
        org.jsoup.select.Elements elements15 = element6.getElementsByIndexGreaterThan((int) (short) 0);
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node18 = element17.nextSibling();
        org.jsoup.nodes.Element element20 = element17.prependElement("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList21 = element20.textNodes();
        org.jsoup.nodes.Element element22 = element20.lastElementSibling();
        org.jsoup.nodes.Element element24 = element20.prepend("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element25 = element6.after((org.jsoup.nodes.Node) element20);
        int int26 = element6.childNodeSize();
        boolean boolean27 = element6.isBlock();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(textNodeList21);
        org.junit.Assert.assertNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.removeClass("");
        java.lang.String str8 = element6.absUrl("<hi!></hi!>");
        java.lang.String str9 = element6.baseUri();
        boolean boolean10 = element6.hasParent();
        int int11 = element6.siblingIndex();
        boolean boolean13 = element6.hasClass("");
        org.jsoup.nodes.Element element15 = element6.removeClass("<hi!>\n <hi!></hi!> \n <hi!></hi!>\n</hi!>");
        org.jsoup.select.Elements elements18 = element15.getElementsByAttributeValueStarting("<<hi!>\n <hi! class=\"\" value=\"<hi!></hi!>\"></hi!>\n</hi!>></<hi!>\n <hi! class=\"\" value=\"<hi!></hi!>\"></hi!>\n</hi!>>&lt;hi!&gt;&lt;/hi!&gt;", "<hi!>\n</hi!>");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
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
        org.jsoup.nodes.Element element19 = element15.addClass("<hi!></hi!>");
        java.lang.String str20 = element15.toString();
        org.jsoup.nodes.Element element22 = element15.appendElement("<<hi!></hi!>></<hi!></hi!>>&lt;hi!&gt; hi! &lt;/hi!&gt;");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<hi! value=\"<hi!></hi!>\" class=\"<hi!></hi!>\"></hi!>" + "'", str20, "<hi! value=\"<hi!></hi!>\" class=\"<hi!></hi!>\"></hi!>");
        org.junit.Assert.assertNotNull(element22);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.removeClass("");
        java.lang.String str8 = element6.absUrl("<hi!></hi!>");
        org.jsoup.nodes.Element element10 = element6.prependText("hi!");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node13 = element12.nextSibling();
        org.jsoup.nodes.Element element15 = element12.prependElement("hi!");
        org.jsoup.nodes.Attributes attributes16 = element15.attributes();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node19 = element18.nextSibling();
        org.jsoup.nodes.Element element21 = element18.prependElement("hi!");
        org.jsoup.nodes.Element element23 = element21.removeClass("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList24 = element23.dataNodes();
        org.jsoup.nodes.Element element25 = element15.appendTo(element23);
        org.jsoup.nodes.Element element27 = element25.addClass("");
        org.jsoup.nodes.Attributes attributes28 = element25.attributes();
        java.lang.String str30 = element25.attr("hi!");
        org.jsoup.nodes.Element element32 = element25.appendElement("<hi!></hi!>");
        org.jsoup.nodes.Element element33 = element10.appendChild((org.jsoup.nodes.Node) element25);
        org.jsoup.nodes.Element element35 = element10.append("<hi!></hi!>");
        org.jsoup.select.Elements elements37 = element35.getElementsByClass("<hi!></hi!>");
        java.lang.String str38 = element35.outerHtml();
        org.jsoup.nodes.Element element40 = new org.jsoup.nodes.Element("<hi!>\n hi!\n <<hi!>\n</hi!>></<hi!>\n</hi!>>\n</hi!>");
        org.jsoup.nodes.Element element41 = element35.appendTo(element40);
        boolean boolean42 = element40.isBlock();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements44 = element40.select("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(dataNodeList24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<hi!>\n hi!\n <hi! class=\"\">\n  <<hi!></hi!>></<hi!></hi!>>\n </hi!>\n <hi!></hi!>\n</hi!>" + "'", str38, "<hi!>\n hi!\n <hi! class=\"\">\n  <<hi!></hi!>></<hi!></hi!>>\n </hi!>\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.removeClass("");
        java.lang.String str8 = element6.absUrl("<hi!></hi!>");
        org.jsoup.nodes.Element element10 = element6.prependText("hi!");
        org.jsoup.nodes.Node node11 = element6.nextSibling();
        org.jsoup.select.Elements elements14 = element6.getElementsByAttributeValueMatching("hi!", "");
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node17 = element16.nextSibling();
        org.jsoup.nodes.Element element19 = element16.prependElement("hi!");
        org.jsoup.nodes.Element element21 = element19.html("hi!");
        java.lang.String str22 = element19.data();
        org.jsoup.nodes.Node node23 = element19.clearAttributes();
        org.jsoup.nodes.Element element24 = element6.doClone((org.jsoup.nodes.Node) element19);
        java.lang.String str25 = element6.data();
        int int26 = element6.elementSiblingIndex();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        int int5 = element1.elementSiblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.siblingNodes();
        org.jsoup.nodes.Element element8 = element1.html("");
        boolean boolean9 = element8.isBlock();
        java.lang.String str10 = element8.nodeName();
        org.jsoup.select.Elements elements12 = element8.getElementsMatchingText("<hi! class=\"\" value=\"<hi!></hi!>\"></hi!>");
        java.lang.String str13 = element8.id();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = element8.dataset();
        org.jsoup.select.Elements elements16 = element8.getElementsByAttribute("<hi! class=\"\"> <<hi!></hi!>></<hi!></hi!>> </hi!>");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node2 = element1.nextSibling();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.nodes.Node node6 = element1.removeAttr("<hi!></hi!>");
        org.jsoup.select.Elements elements8 = element1.getElementsByAttribute("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = element1.shallowClone();
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValueMatching("<hi! class=\"<hi!>\n hi!\n <<hi!>\n</hi!>></<hi!>\n</hi!>>\n</hi!>\">\n hi!\n <<hi!>\n</hi!>></<hi!>\n</hi!>>\n</hi!>", "<hi! ></hi!>");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
    }
}

