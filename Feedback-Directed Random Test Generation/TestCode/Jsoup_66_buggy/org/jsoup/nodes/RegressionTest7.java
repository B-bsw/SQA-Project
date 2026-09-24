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
        boolean boolean3 = element1.hasAttr("hi!");
        int int4 = element1.siblingIndex();
        element1.setBaseUri("");
        org.jsoup.nodes.Element element8 = element1.prependText("");
        org.jsoup.nodes.Element element10 = element1.append("");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        boolean boolean15 = element13.hasAttr("hi!");
        boolean boolean16 = element13.isBlock();
        int int17 = element13.elementSiblingIndex();
        org.jsoup.nodes.Element element20 = element13.attr("", false);
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        boolean boolean25 = element23.hasAttr("hi!");
        boolean boolean26 = element23.isBlock();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element("hi!");
        boolean boolean30 = element28.hasAttr("hi!");
        org.jsoup.nodes.Element element32 = element28.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList33 = element28.textNodes();
        org.jsoup.nodes.Element element34 = element23.prependChild((org.jsoup.nodes.Node) element28);
        org.jsoup.select.Elements elements36 = element23.getElementsMatchingText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList37 = element23.textNodes();
        org.jsoup.nodes.Element element38 = element13.insertChildren((int) (byte) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList37);
        org.jsoup.nodes.Element element39 = element10.insertChildren((int) (byte) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList37);
        element39.setBaseUri("<hi!></hi!>");
        org.jsoup.select.Elements elements44 = element39.getElementsByAttributeValueNot("<hi! class=\"\"></hi!>", "<hi! class=\"\"></hi!>");
        org.jsoup.select.Elements elements47 = element39.getElementsByAttributeValueMatching("<hi!></hi!>", "");
        org.jsoup.nodes.Element element49 = element39.getElementById("<hi!>\n <hi!>\n </hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList50 = element39.textNodes();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(textNodeList33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(textNodeList37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNull(element49);
        org.junit.Assert.assertNotNull(textNodeList50);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        boolean boolean4 = element1.isBlock();
        int int5 = element1.elementSiblingIndex();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element1.dataset();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        boolean boolean10 = element8.hasAttr("hi!");
        org.jsoup.nodes.Element element12 = element8.removeClass("");
        java.util.regex.Pattern pattern14 = null;
        org.jsoup.select.Elements elements15 = element12.getElementsByAttributeValueMatching("", pattern14);
        org.jsoup.nodes.Element element17 = element12.prependElement("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element22 = element19.attr("", true);
        java.util.List<org.jsoup.nodes.Node> nodeList23 = element22.childNodes;
        java.lang.String str24 = element22.baseUri();
        org.jsoup.nodes.Element element26 = element22.prependElement("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element27 = element17.appendTo(element22);
        org.jsoup.nodes.Element element28 = element1.doClone((org.jsoup.nodes.Node) element27);
        boolean boolean29 = element27.isBlock();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = element27.childNodes();
        java.lang.String str32 = element27.absUrl("hi!");
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element("hi!");
        boolean boolean36 = element34.hasAttr("hi!");
        int int37 = element34.siblingIndex();
        boolean boolean39 = element34.hasClass("<hi! class=\"\"></hi!>");
        int int40 = element34.childNodeSize();
        org.jsoup.nodes.Element element42 = new org.jsoup.nodes.Element("hi!");
        boolean boolean44 = element42.hasAttr("hi!");
        boolean boolean45 = element42.isBlock();
        org.jsoup.nodes.Element element47 = new org.jsoup.nodes.Element("hi!");
        boolean boolean49 = element47.hasAttr("hi!");
        org.jsoup.nodes.Element element51 = element47.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList52 = element47.textNodes();
        org.jsoup.nodes.Element element53 = element42.prependChild((org.jsoup.nodes.Node) element47);
        boolean boolean55 = element47.hasAttr("hi!");
        org.jsoup.nodes.Element element57 = element47.addClass("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element58 = element34.prependChild((org.jsoup.nodes.Node) element47);
        org.jsoup.select.Elements elements60 = element34.getElementsByTag("<hi!>\n <hi!>\n </hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        java.util.Set<java.lang.String> strSet61 = element34.classNames();
        org.jsoup.nodes.Element element62 = element27.doClone((org.jsoup.nodes.Node) element34);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(textNodeList52);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(elements60);
        org.junit.Assert.assertNotNull(strSet61);
        org.junit.Assert.assertNotNull(element62);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        boolean boolean4 = element1.isBlock();
        int int5 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element8 = element1.attr("", false);
        org.jsoup.nodes.Element element9 = element1.parent();
        java.lang.String str10 = element1.nodeName();
        org.jsoup.nodes.Element element12 = element1.addClass("");
        java.lang.String str13 = element1.cssSelector();
        org.jsoup.nodes.Element element15 = element1.toggleClass("<hi! class=\"\">\n &lt;&lt;hi!&gt; &lt;hi! class=\"\"&gt;&lt;/hi!&gt; &lt;/hi!&gt; class=\"\"&gt; &lt;&lt;hi!&gt; &lt;hi! class=\"\"&gt;&lt;/hi!&gt; &lt;/hi!&gt; class=\"&lt;hi!&gt;&lt;/hi!&gt;\"&gt;&lt;/&lt;hi!&gt; &lt;hi! class=\"\"&gt;&lt;/hi!&gt; &lt;/hi!&gt;&gt; &lt;/&lt;hi!&gt; &lt;hi! class=\"\"&gt;&lt;/hi!&gt; &lt;/hi!&gt;&gt;\n</hi!>");
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        boolean boolean19 = element17.hasAttr("hi!");
        int int20 = element17.siblingIndex();
        org.jsoup.nodes.Node node21 = element17.root();
        java.lang.String str22 = element17.id();
        org.jsoup.select.Elements elements25 = element17.getElementsByAttributeValueNot("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap26 = element17.dataset();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = element17.childNodesCopy();
        element1.childNodes = nodeList27;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(nodeList27);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
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
        org.jsoup.nodes.Element element17 = element1.prependElement("<hi!>\n <hi!></hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element19 = element17.before("<hi! >\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        boolean boolean21 = element19.hasAttr("<hi!>\n &lt;hi!&gt; &lt;hi!&gt; &lt;/hi!&gt; &lt;hi! class=\"\"&gt;&lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element5 = element1.removeClass("");
        java.util.regex.Pattern pattern7 = null;
        org.jsoup.select.Elements elements8 = element5.getElementsByAttributeValueMatching("", pattern7);
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        boolean boolean12 = element10.hasAttr("hi!");
        int int13 = element10.siblingIndex();
        boolean boolean15 = element10.hasClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element17 = element10.prependElement("<hi!></hi!>");
        org.jsoup.nodes.Node node18 = element17.root();
        org.jsoup.nodes.Element element19 = element5.doClone((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Element element20 = element5.clone();
        org.jsoup.nodes.Element element22 = element5.appendText("<hi! class=\"\">\n &lt;hi!&gt; &lt;hi! class=\"\"&gt;&lt;/hi!&gt; &lt;hi!&gt; &lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>");
        org.jsoup.select.Elements elements25 = element22.getElementsByAttributeValueNot("<hi! class=\"<<hi!></hi!>>\n <hi!  value=&quot;hi!&quot;>\n  &amp;lt;hi!&amp;gt;&amp;lt;/hi!&amp;gt;\n </hi!>\n</<hi!></hi!>> <hi! class=&quot;&quot;></hi!> <hi!>\n hi!\n</hi!> <<hi!>\n <hi! class=&quot;&quot;></hi!>\n</hi!>></<hi!>\n <hi! class=&quot;&quot;></hi!>\n</hi!>> <hi!>\n <hi! class=&quot;&quot;></hi!>\n</hi!>\">\n <hi!></hi!>\n</hi!>", "&lt;hi!&gt;&lt;/hi!&gt;");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
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
        org.jsoup.select.Elements elements31 = element10.getElementsByAttributeValueMatching("hi!.<hi!></hi!>", "<hi! class=\"\">\n <hi!></hi!>&lt;hi!&gt; &lt;hi! class=\"\"&gt;&lt;/hi!&gt; &lt;hi!&gt; &lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>");
        java.lang.String str32 = element10.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(textNodeList20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(textNodeList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>" + "'", str25, "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<hi!>\n <hi! class=\"\"></hi!>\n <hi!>\n </hi!>\n</hi!>" + "'", str32, "<hi!>\n <hi! class=\"\"></hi!>\n <hi!>\n </hi!>\n</hi!>");
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        java.lang.String str4 = element1.toString();
        org.jsoup.select.Elements elements5 = element1.siblingElements();
        org.jsoup.nodes.Node node6 = element1.root();
        org.jsoup.nodes.Element element7 = element1.clone();
        int int8 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element11 = element1.attr("<hi!>\n <hi!>\n </hi!>\n <hi! class=\"\"></hi!>\n</hi!>", "<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>");
        java.lang.String str12 = element1.nodeName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<hi!></hi!>" + "'", str4, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        boolean boolean4 = element1.isBlock();
        int int5 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element8 = element1.attr("", false);
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        boolean boolean13 = element11.hasAttr("hi!");
        boolean boolean14 = element11.isBlock();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        boolean boolean18 = element16.hasAttr("hi!");
        org.jsoup.nodes.Element element20 = element16.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList21 = element16.textNodes();
        org.jsoup.nodes.Element element22 = element11.prependChild((org.jsoup.nodes.Node) element16);
        org.jsoup.select.Elements elements24 = element11.getElementsMatchingText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList25 = element11.textNodes();
        org.jsoup.nodes.Element element26 = element1.insertChildren((int) (byte) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList25);
        org.jsoup.select.Elements elements27 = element1.children();
        org.jsoup.select.Elements elements29 = element1.getElementsByIndexEquals(0);
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element("hi!");
        boolean boolean33 = element31.hasAttr("hi!");
        boolean boolean34 = element31.isBlock();
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element("hi!");
        boolean boolean38 = element36.hasAttr("hi!");
        org.jsoup.nodes.Element element40 = element36.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList41 = element36.textNodes();
        org.jsoup.nodes.Element element42 = element31.prependChild((org.jsoup.nodes.Node) element36);
        org.jsoup.nodes.Element element45 = element36.attr("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>", true);
        org.jsoup.nodes.Element element46 = element1.appendChild((org.jsoup.nodes.Node) element45);
        int int47 = element46.siblingIndex();
        java.util.Map<java.lang.String, java.lang.String> strMap48 = element46.dataset();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(textNodeList21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(textNodeList25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(textNodeList41);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(strMap48);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        int int4 = element1.siblingIndex();
        boolean boolean6 = element1.hasClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element8 = element1.prependElement("<hi!></hi!>");
        org.jsoup.nodes.Element element10 = element8.prependText("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Node node11 = element10.clearAttributes();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        int int4 = element1.siblingIndex();
        element1.setBaseUri("");
        org.jsoup.nodes.Element element8 = element1.prependText("");
        org.jsoup.nodes.Element element10 = element1.html("<hi!></hi!>");
        boolean boolean12 = element1.equals((java.lang.Object) (-1));
        java.util.List<org.jsoup.nodes.TextNode> textNodeList13 = element1.textNodes();
        org.jsoup.nodes.Element element15 = element1.prepend("&lt;hi! class=\"&lt;hi!&gt;&lt;/hi!&gt;\"&gt;&lt;/hi!&gt;");
        element15.doSetBaseUri("hi!.<hi!></hi!>");
        java.lang.String str18 = element15.val();
        org.jsoup.nodes.Element element20 = element15.html("<hi! class=\"\">\n <hi! class=\"\"></hi!>\n</hi!>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(textNodeList13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.attr("", true);
        java.lang.String str5 = element1.tagName();
        boolean boolean6 = element1.hasParent();
        boolean boolean7 = element1.hasAttributes();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.attr("", true);
        org.jsoup.nodes.Element element6 = element1.appendText("<hi!></hi!>");
        boolean boolean8 = element1.hasClass("<hi!></hi!>");
        org.jsoup.nodes.Element element10 = element1.append("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element10.siblingNodes();
        org.jsoup.nodes.Element element14 = element10.attr("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>", true);
        java.util.Set<java.lang.String> strSet15 = element10.classNames();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node3 = element1.removeAttr("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        boolean boolean9 = element7.hasAttr("hi!");
        boolean boolean10 = element7.isBlock();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        boolean boolean14 = element12.hasAttr("hi!");
        org.jsoup.nodes.Element element16 = element12.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element12.textNodes();
        org.jsoup.nodes.Element element18 = element7.prependChild((org.jsoup.nodes.Node) element12);
        org.jsoup.nodes.Element element21 = element12.attr("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>", true);
        java.lang.String str22 = element12.val();
        org.jsoup.nodes.Element element23 = element5.appendTo(element12);
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element("hi!");
        boolean boolean27 = element25.hasAttr("hi!");
        int int28 = element25.siblingIndex();
        element25.setBaseUri("");
        org.jsoup.nodes.Element element32 = element25.prependText("");
        org.jsoup.select.Elements elements34 = element25.getElementsByIndexGreaterThan((int) (byte) 10);
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList35 = element25.dataNodes();
        org.jsoup.select.Elements elements38 = element25.getElementsByAttributeValueNot("<hi!></hi!>", "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element40 = new org.jsoup.nodes.Element("hi!");
        boolean boolean42 = element40.hasAttr("hi!");
        java.lang.String str43 = element40.toString();
        org.jsoup.nodes.Element element44 = element25.appendTo(element40);
        org.jsoup.nodes.Element element45 = element5.doClone((org.jsoup.nodes.Node) element25);
        org.jsoup.select.Elements elements47 = element25.getElementsMatchingOwnText("<hi! class=\"\">\n <<hi!>\n hi!\n</hi!>></<hi!>\n hi!\n</hi!>>\n</hi!>");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(dataNodeList35);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<hi!></hi!>" + "'", str43, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(elements47);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
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
        java.util.List<org.jsoup.nodes.Node> nodeList19 = element1.ensureChildNodes();
        java.lang.String str20 = element1.id();
        element1.doSetBaseUri("hi!.<hi!></hi!>");
        element1.doSetBaseUri("<<hi!>\n &lt;hi!&gt; &lt;hi!&gt; &lt;/hi!&gt; &lt;hi! class=\"\"&gt;&lt;/hi!&gt; &lt;/hi!&gt;\n <hi! class=\"\"> \n  <hi! class=\"\"></hi!> \n </hi!>\n</hi!> class=\"\"></<hi!>\n &lt;hi!&gt; &lt;hi!&gt; &lt;/hi!&gt; &lt;hi! class=\"\"&gt;&lt;/hi!&gt; &lt;/hi!&gt;\n <hi! class=\"\"> \n  <hi! class=\"\"></hi!> \n </hi!>\n</hi!>>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(textNodeList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>" + "'", str16, "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element4 = element1.parent();
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("", pattern6);
        int int8 = element1.elementSiblingIndex();
        org.jsoup.select.Elements elements10 = element1.getElementsMatchingOwnText("<hi!></hi!>");
        boolean boolean12 = element1.hasClass("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element15 = element1.attr("<hi!  value=\"hi!\" <hi!></hi!>=\"<<hi!>\n <hi! class=&quot;&quot;></hi!>\n</hi!> class=&quot;&quot;>\n <<hi!>\n <hi! class=&quot;&quot;></hi!>\n</hi!> class=&quot;<hi!></hi!>&quot;></<hi!>\n <hi! class=&quot;&quot;></hi!>\n</hi!>>\n</<hi!>\n <hi! class=&quot;&quot;></hi!>\n</hi!>>\">\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>", "<hi! class=\"hi! <hi!>\n hi!\n</hi!>\">\n <hi! class=\"\"></hi!>\n</hi!>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
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
        java.lang.String str46 = element15.outerHtml();
        org.jsoup.select.Elements elements49 = element15.getElementsByAttributeValueEnding("<hi! class=\"<hi!></hi!>\"></hi!>", "<hi! class=\"<hi!></hi!>\"></hi!>");
        java.util.regex.Pattern pattern51 = null;
        org.jsoup.select.Elements elements52 = element15.getElementsByAttributeValueMatching("<hi!></hi!>", pattern51);
        org.jsoup.nodes.Element element54 = element15.child((int) (byte) 1);
        org.jsoup.select.Elements elements57 = element54.getElementsByAttributeValueEnding("<<hi!>\n <hi! class=\"\"></hi!>\n <hi!>\n </hi!>\n</hi!> class=\"\"></<hi!>\n <hi! class=\"\"></hi!>\n <hi!>\n </hi!>\n</hi!>>", "<<hi!> \n <hi!></hi!> \n <hi! class=\"\"></hi!> \n</hi!>\n<<hi!>\n <hi! class=\"\"></hi!>\n</hi!>></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>></<hi!> \n <hi!></hi!> \n <hi! class=\"\"></hi!> \n</hi!>\n<<hi!>\n <hi! class=\"\"></hi!>\n</hi!>></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(textNodeList25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(textNodeList29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>" + "'", str30, "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<hi!></hi!>" + "'", str39, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "<hi!>\n <hi!></hi!>\n <hi! class=\"\"></hi!>\n</hi!>" + "'", str46, "<hi!>\n <hi!></hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertNotNull(elements52);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(elements57);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        boolean boolean4 = element1.isBlock();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        boolean boolean8 = element6.hasAttr("hi!");
        org.jsoup.nodes.Element element10 = element6.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element6.textNodes();
        org.jsoup.nodes.Element element12 = element1.prependChild((org.jsoup.nodes.Node) element6);
        org.jsoup.select.Elements elements14 = element1.getElementsMatchingText("<hi!></hi!>");
        java.util.regex.Pattern pattern16 = null;
        org.jsoup.select.Elements elements17 = element1.getElementsByAttributeValueMatching("<hi!></hi!>", pattern16);
        org.jsoup.nodes.Node node18 = element1.clearAttributes();
        int int19 = element1.siblingIndex();
        org.jsoup.select.Elements elements21 = element1.getElementsByTag("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = element1.siblingNodes();
        java.lang.String str23 = element1.ownText();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        java.lang.String str4 = element1.toString();
        org.jsoup.select.Elements elements5 = element1.siblingElements();
        boolean boolean6 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        java.lang.String str9 = element1.text();
        org.jsoup.select.Elements elements11 = element1.getElementsByClass("<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi! class=&quot;&quot;></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<hi!></hi!>" + "'", str4, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Node node5 = element1.root();
        org.jsoup.nodes.Element element7 = element1.appendText("hi!");
        java.lang.String str8 = element7.toString();
        boolean boolean9 = element7.hasParent();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = element7.dataset();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<hi!>\n hi!\n</hi!>" + "'", str8, "<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        boolean boolean4 = element1.isBlock();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        boolean boolean8 = element6.hasAttr("hi!");
        org.jsoup.nodes.Element element10 = element6.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element6.textNodes();
        org.jsoup.nodes.Element element12 = element1.prependChild((org.jsoup.nodes.Node) element6);
        org.jsoup.nodes.Element element14 = element6.wrap("<hi!></hi!>");
        org.jsoup.nodes.Element element16 = element14.wrap("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        boolean boolean20 = element18.hasAttr("hi!");
        boolean boolean21 = element18.isBlock();
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        boolean boolean25 = element23.hasAttr("hi!");
        org.jsoup.nodes.Element element27 = element23.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList28 = element23.textNodes();
        org.jsoup.nodes.Element element29 = element18.prependChild((org.jsoup.nodes.Node) element23);
        org.jsoup.parser.Tag tag30 = element29.tag();
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element("hi!");
        boolean boolean34 = element32.hasAttr("hi!");
        boolean boolean35 = element32.isBlock();
        org.jsoup.nodes.Element element37 = new org.jsoup.nodes.Element("hi!");
        boolean boolean39 = element37.hasAttr("hi!");
        org.jsoup.nodes.Element element41 = element37.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList42 = element37.textNodes();
        org.jsoup.nodes.Element element43 = element32.prependChild((org.jsoup.nodes.Node) element37);
        org.jsoup.select.Elements elements45 = element32.getElementsMatchingText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList46 = element32.textNodes();
        java.lang.String str47 = element32.outerHtml();
        java.lang.String str48 = element32.cssSelector();
        org.jsoup.nodes.Element element49 = element29.appendChild((org.jsoup.nodes.Node) element32);
        org.jsoup.select.Elements elements51 = element32.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element53 = new org.jsoup.nodes.Element("hi!");
        boolean boolean55 = element53.hasAttr("hi!");
        java.lang.String str56 = element53.toString();
        org.jsoup.select.Elements elements57 = element53.siblingElements();
        org.jsoup.nodes.Node node58 = element53.root();
        org.jsoup.nodes.Element element59 = element53.clone();
        boolean boolean61 = element53.hasClass("hi!");
        org.jsoup.nodes.Element element62 = element32.prependChild((org.jsoup.nodes.Node) element53);
        org.jsoup.nodes.Element element63 = element62.empty();
        org.jsoup.nodes.Element element65 = element63.removeClass("");
        org.jsoup.nodes.Element element66 = element14.prependChild((org.jsoup.nodes.Node) element63);
        org.jsoup.nodes.Element element68 = element14.prependElement("<hi! class=\"\">\n <hi! class=\"\"></hi!>\n</hi!>");
        boolean boolean69 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(textNodeList28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(textNodeList42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertNotNull(textNodeList46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>" + "'", str47, "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(elements51);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "<hi!></hi!>" + "'", str56, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements57);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(element62);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertNotNull(element66);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
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
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        boolean boolean26 = element24.hasAttr("hi!");
        org.jsoup.nodes.Element element28 = element24.removeClass("");
        java.util.regex.Pattern pattern30 = null;
        org.jsoup.select.Elements elements31 = element28.getElementsByAttributeValueMatching("", pattern30);
        boolean boolean32 = element28.hasText();
        java.util.List<org.jsoup.nodes.Node> nodeList33 = element28.childNodes;
        org.jsoup.nodes.Element element34 = element21.appendTo(element28);
        org.jsoup.nodes.Element element36 = element28.toggleClass("<<hi!>\n <hi! class=\"\"></hi!>\n</hi!>></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>");
        org.jsoup.select.Elements elements38 = element28.getElementsByClass("<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi! class=&quot;&quot;></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(textNodeList15);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>" + "'", str19, "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(elements38);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        boolean boolean4 = element1.isBlock();
        int int5 = element1.elementSiblingIndex();
        org.jsoup.select.Elements elements7 = element1.getElementsByIndexGreaterThan((int) (byte) 0);
        org.jsoup.nodes.Element element9 = element1.text("<hi! class=\"<hi!></hi!>\"></hi!>");
        int int10 = element1.elementSiblingIndex();
        org.jsoup.select.Elements elements11 = element1.children();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = element1.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = element1.childNodes;
        org.jsoup.nodes.Element element15 = element1.prependText("<hi!>\n <hi!> \n  <hi! class=\"\"></hi!> \n </hi!>&lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.attr("", true);
        org.jsoup.nodes.Element element6 = element1.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element8.attr("", true);
        org.jsoup.nodes.Element element13 = element8.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element14 = element1.appendTo(element13);
        boolean boolean15 = element1.hasAttributes();
        org.jsoup.nodes.Element element17 = element1.tagName("hi!");
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        boolean boolean21 = element19.hasAttr("hi!");
        java.lang.String str22 = element19.toString();
        org.jsoup.select.Elements elements23 = element19.siblingElements();
        org.jsoup.nodes.Node node24 = element19.root();
        org.jsoup.nodes.Element element25 = element19.clone();
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element("hi!");
        boolean boolean29 = element27.hasAttr("hi!");
        boolean boolean30 = element27.isBlock();
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element("hi!");
        boolean boolean34 = element32.hasAttr("hi!");
        org.jsoup.nodes.Element element36 = element32.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList37 = element32.textNodes();
        org.jsoup.nodes.Element element38 = element27.prependChild((org.jsoup.nodes.Node) element32);
        org.jsoup.nodes.Element element39 = element19.appendTo(element27);
        org.jsoup.nodes.Element element40 = element17.appendTo(element39);
        boolean boolean42 = element39.hasAttr("<hi! class=\"\">\n &lt;hi!&gt; &lt;hi! class=\"\"&gt;&lt;/hi!&gt; &lt;hi!&gt; &lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>");
        java.lang.String str43 = element39.toString();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<hi!></hi!>" + "'", str22, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(textNodeList37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<hi!>\n <hi! >\n  &lt;hi!&gt;&lt;/hi!&gt;\n </hi!>\n</hi!>" + "'", str43, "<hi!>\n <hi! >\n  &lt;hi!&gt;&lt;/hi!&gt;\n </hi!>\n</hi!>");
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        int int4 = element1.siblingIndex();
        boolean boolean6 = element1.hasClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element8 = element1.prependElement("<hi!></hi!>");
        org.jsoup.nodes.Node node9 = element8.root();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element8.childNodes();
        java.lang.String str11 = element8.ownText();
        boolean boolean12 = element8.hasAttributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element17 = element14.attr("", true);
        org.jsoup.nodes.Element element19 = element14.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element24 = element21.attr("", true);
        org.jsoup.nodes.Element element26 = element21.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element27 = element14.appendTo(element26);
        org.jsoup.nodes.Element element29 = element27.val("hi!");
        java.lang.String str30 = element29.data();
        org.jsoup.nodes.Element element31 = element8.appendChild((org.jsoup.nodes.Node) element29);
        java.util.List<org.jsoup.nodes.Node> nodeList32 = element8.siblingNodes();
        org.jsoup.select.Elements elements35 = element8.getElementsByAttributeValueNot("<<hi!>\n <hi! class=\"\"></hi!>\n</hi!>></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>", "<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>");
        org.jsoup.nodes.Element element37 = new org.jsoup.nodes.Element("hi!");
        boolean boolean39 = element37.hasAttr("hi!");
        java.lang.String str40 = element37.toString();
        org.jsoup.select.Elements elements41 = element37.siblingElements();
        org.jsoup.select.Elements elements42 = element37.getAllElements();
        org.jsoup.nodes.Element element44 = element37.html("");
        java.lang.String str45 = element44.tagName();
        java.util.Set<java.lang.String> strSet46 = element44.classNames();
        org.jsoup.nodes.Element element47 = element8.classNames(strSet46);
        org.jsoup.nodes.Element element48 = element47.firstElementSibling();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "<hi!></hi!>" + "'", str40, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNull(element48);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element5 = element1.removeClass("");
        org.jsoup.nodes.Element element7 = element1.text("hi!");
        org.jsoup.nodes.Element element9 = element1.removeClass("<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>");
        org.jsoup.nodes.Element element12 = element9.attr("<<hi!>\n <hi! class=\"\"></hi!>\n</hi!>></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>", true);
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        boolean boolean16 = element14.hasAttr("hi!");
        java.lang.String str17 = element14.toString();
        org.jsoup.select.Elements elements18 = element14.siblingElements();
        boolean boolean19 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element14);
        org.jsoup.select.Elements elements21 = element14.getElementsByAttribute("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        boolean boolean25 = element23.hasAttr("hi!");
        boolean boolean26 = element23.isBlock();
        int int27 = element23.elementSiblingIndex();
        org.jsoup.nodes.Element element30 = element23.attr("", false);
        org.jsoup.nodes.Element element31 = element23.parent();
        java.lang.String str32 = element23.nodeName();
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node36 = element34.removeAttr("hi!");
        org.jsoup.nodes.Element element38 = element34.tagName("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element40 = new org.jsoup.nodes.Element("hi!");
        boolean boolean42 = element40.hasAttr("hi!");
        boolean boolean43 = element40.isBlock();
        org.jsoup.nodes.Element element45 = new org.jsoup.nodes.Element("hi!");
        boolean boolean47 = element45.hasAttr("hi!");
        org.jsoup.nodes.Element element49 = element45.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList50 = element45.textNodes();
        org.jsoup.nodes.Element element51 = element40.prependChild((org.jsoup.nodes.Node) element45);
        org.jsoup.select.Elements elements53 = element40.getElementsMatchingText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList54 = element40.textNodes();
        java.lang.String str55 = element40.outerHtml();
        java.util.Set<java.lang.String> strSet56 = element40.classNames();
        org.jsoup.nodes.Element element57 = element38.classNames(strSet56);
        boolean boolean58 = element23.hasSameValue((java.lang.Object) element57);
        org.jsoup.nodes.Element element59 = element14.appendChild((org.jsoup.nodes.Node) element57);
        org.jsoup.select.Elements elements62 = element14.getElementsByAttributeValueStarting("<hi! class=\"<hi! class=&quot;<hi!></hi!>&quot;></hi!> <<hi!>\n <hi! class=&quot;&quot;></hi!>\n</hi!> class=&quot;&quot;>\n <<hi!>\n <hi! class=&quot;&quot;></hi!>\n</hi!> class=&quot;<hi!></hi!>&quot;></<hi!>\n <hi! class=&quot;&quot;></hi!>\n</hi!>>\n</<hi!>\n <hi! class=&quot;&quot;></hi!>\n</hi!>> <hi!></hi!>\">\n &lt;hi!&gt; &lt;hi! class=\"\"&gt;&lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>", "<hi! class=\"\">\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element64 = element14.addClass("<hi!> <hi! class=\"\"></hi!> </hi!>");
        org.jsoup.nodes.Element element65 = element9.appendChild((org.jsoup.nodes.Node) element64);
        boolean boolean67 = element65.hasAttr("<<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>> class=\"\"></<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>>");
        org.jsoup.nodes.Element element69 = new org.jsoup.nodes.Element("hi!");
        boolean boolean71 = element69.hasAttr("hi!");
        org.jsoup.nodes.Element element73 = element69.removeClass("");
        boolean boolean74 = element73.hasParent();
        org.jsoup.nodes.Element element76 = element73.append("hi!");
        org.jsoup.parser.Tag tag77 = element76.tag();
        org.jsoup.nodes.Element element79 = new org.jsoup.nodes.Element("hi!");
        boolean boolean81 = element79.hasAttr("hi!");
        org.jsoup.nodes.Element element83 = element79.removeClass("");
        java.util.regex.Pattern pattern85 = null;
        org.jsoup.select.Elements elements86 = element83.getElementsByAttributeValueMatching("", pattern85);
        org.jsoup.nodes.Element element88 = element83.prependElement("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element90 = element83.prepend("<hi!>\n <hi!></hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element91 = element76.appendChild((org.jsoup.nodes.Node) element90);
        org.jsoup.select.Elements elements93 = element76.getElementsByAttributeStarting("hi!");
        org.jsoup.nodes.Element element94 = element65.appendTo(element76);
        org.jsoup.nodes.Element element96 = element94.toggleClass("<hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<hi!></hi!>" + "'", str17, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(textNodeList50);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertNotNull(textNodeList54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>" + "'", str55, "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(elements62);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(element73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(element76);
        org.junit.Assert.assertNotNull(tag77);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(element83);
        org.junit.Assert.assertNotNull(elements86);
        org.junit.Assert.assertNotNull(element88);
        org.junit.Assert.assertNotNull(element90);
        org.junit.Assert.assertNotNull(element91);
        org.junit.Assert.assertNotNull(elements93);
        org.junit.Assert.assertNotNull(element94);
        org.junit.Assert.assertNotNull(element96);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element5 = element1.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList6 = element1.textNodes();
        java.lang.String str7 = element1.tagName();
        org.jsoup.nodes.Element element9 = element1.appendText("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        boolean boolean13 = element11.hasAttr("hi!");
        int int14 = element11.siblingIndex();
        boolean boolean15 = element11.isBlock();
        org.jsoup.nodes.Element element16 = element11.empty();
        org.jsoup.nodes.Element element18 = element11.tagName("hi!");
        org.jsoup.nodes.Node node19 = element11.previousSibling();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        boolean boolean23 = element21.hasAttr("hi!");
        int int24 = element21.siblingIndex();
        boolean boolean25 = element21.isBlock();
        org.jsoup.nodes.Element element26 = element21.empty();
        org.jsoup.nodes.Element element28 = element21.tagName("hi!");
        int int29 = element28.childNodeSize();
        org.jsoup.nodes.Element element30 = element11.prependChild((org.jsoup.nodes.Node) element28);
        element11.setBaseUri("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element35 = new org.jsoup.nodes.Element("hi!");
        boolean boolean37 = element35.hasAttr("hi!");
        org.jsoup.nodes.Element element38 = element35.parent();
        java.util.regex.Pattern pattern40 = null;
        org.jsoup.select.Elements elements41 = element35.getElementsByAttributeValueMatching("", pattern40);
        java.util.List<org.jsoup.nodes.Node> nodeList42 = element35.siblingNodes();
        org.jsoup.select.Elements elements44 = element35.getElementsMatchingOwnText("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element46 = element35.appendText("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element48 = element46.prependElement("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Node[] nodeArray50 = new org.jsoup.nodes.Node[] {};
        org.jsoup.nodes.Element element51 = element46.insertChildren((int) (byte) 0, nodeArray50);
        org.jsoup.nodes.Element element52 = element11.insertChildren(0, nodeArray50);
        boolean boolean53 = element1.hasSameValue((java.lang.Object) nodeArray50);
        org.jsoup.select.Elements elements55 = element1.getElementsByIndexGreaterThan((int) (byte) -1);
        org.jsoup.nodes.Node node56 = element1.clearAttributes();
        org.jsoup.select.Elements elements59 = element1.getElementsByAttributeValueContaining("<hi! >\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>", "<hi!>\n <hi! class=\"\"></hi!>\n <hi!>\n </hi!>\n</hi!>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(textNodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(element38);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(nodeArray50);
        org.junit.Assert.assertArrayEquals(nodeArray50, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(elements55);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(elements59);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        int int4 = element1.siblingIndex();
        element1.setBaseUri("");
        org.jsoup.nodes.Element element8 = element1.prependText("");
        org.jsoup.select.Elements elements10 = element8.getElementsByIndexEquals(10);
        org.jsoup.nodes.Element element12 = element8.addClass("");
        java.lang.String str13 = element8.id();
        org.jsoup.nodes.Element element15 = element8.prepend("<<hi!></hi!>>\n <hi!  value=\"hi!\">\n  &lt;hi!&gt;&lt;/hi!&gt;\n </hi!>\n</<hi!></hi!>>");
        org.jsoup.nodes.Element element17 = element15.tagName("<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> <hi!>\n hi!\n</hi!>></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>");
        org.jsoup.nodes.Node node18 = element15.root();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.attr("", true);
        org.jsoup.nodes.Element element6 = element1.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element8.attr("", true);
        org.jsoup.nodes.Element element13 = element8.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element14 = element1.appendTo(element13);
        element14.doSetBaseUri("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.select.Elements elements18 = element14.getElementsByIndexEquals((int) 'a');
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        int int4 = element1.siblingIndex();
        element1.setBaseUri("");
        org.jsoup.nodes.Element element8 = element1.prependText("");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element1.childNodes;
        org.jsoup.select.Elements elements11 = element1.getElementsMatchingOwnText("");
        org.jsoup.nodes.Document document12 = element1.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = document12.before("<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi! class=&quot;&quot;></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNull(document12);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        java.lang.String str4 = element1.toString();
        org.jsoup.select.Elements elements5 = element1.siblingElements();
        boolean boolean6 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        org.jsoup.select.Elements elements9 = element8.siblingElements();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<hi!></hi!>" + "'", str4, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element5 = element1.removeClass("");
        boolean boolean6 = element5.hasParent();
        org.jsoup.nodes.Node node7 = element5.previousSibling();
        org.jsoup.select.Elements elements8 = element5.siblingElements();
        org.jsoup.nodes.Element element10 = element5.appendText("<hi!>\n <hi! class=\"\"></hi!>\n <hi!>\n </hi!>\n</hi!>");
        org.jsoup.nodes.Document document11 = element10.ownerDocument();
        java.lang.String str12 = element10.id();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        boolean boolean16 = element14.hasAttr("hi!");
        boolean boolean17 = element14.isBlock();
        int int18 = element14.elementSiblingIndex();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = element14.dataset();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        boolean boolean23 = element21.hasAttr("hi!");
        org.jsoup.nodes.Element element25 = element21.removeClass("");
        java.util.regex.Pattern pattern27 = null;
        org.jsoup.select.Elements elements28 = element25.getElementsByAttributeValueMatching("", pattern27);
        org.jsoup.nodes.Element element30 = element25.prependElement("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element35 = element32.attr("", true);
        java.util.List<org.jsoup.nodes.Node> nodeList36 = element35.childNodes;
        java.lang.String str37 = element35.baseUri();
        org.jsoup.nodes.Element element39 = element35.prependElement("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element40 = element30.appendTo(element35);
        org.jsoup.nodes.Element element41 = element14.doClone((org.jsoup.nodes.Node) element40);
        org.jsoup.nodes.Element element43 = element40.prependElement("hi!");
        org.jsoup.nodes.Element element44 = element10.appendTo(element43);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element44);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        boolean boolean4 = element1.isBlock();
        int int5 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element8 = element1.attr("", false);
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        boolean boolean13 = element11.hasAttr("hi!");
        boolean boolean14 = element11.isBlock();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        boolean boolean18 = element16.hasAttr("hi!");
        org.jsoup.nodes.Element element20 = element16.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList21 = element16.textNodes();
        org.jsoup.nodes.Element element22 = element11.prependChild((org.jsoup.nodes.Node) element16);
        org.jsoup.select.Elements elements24 = element11.getElementsMatchingText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList25 = element11.textNodes();
        org.jsoup.nodes.Element element26 = element1.insertChildren((int) (byte) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList25);
        org.jsoup.select.Elements elements27 = element1.children();
        org.jsoup.select.Elements elements29 = element1.getElementsByIndexEquals(0);
        boolean boolean30 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element("hi!");
        boolean boolean34 = element32.hasAttr("hi!");
        int int35 = element32.siblingIndex();
        org.jsoup.nodes.Node node36 = element32.root();
        java.lang.String str37 = element32.id();
        java.lang.String str38 = element32.toString();
        org.jsoup.nodes.Element element40 = element32.appendText("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        java.lang.String[] strArray45 = new java.lang.String[] { "<hi! class=\"<hi!></hi!>\"></hi!>", "<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>", "<hi!></hi!>", "<hi! class=\"<hi!></hi!>\"></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        org.jsoup.nodes.Element element48 = element32.classNames((java.util.Set<java.lang.String>) strSet46);
        org.jsoup.nodes.Element element49 = element1.classNames((java.util.Set<java.lang.String>) strSet46);
        org.jsoup.nodes.Element element52 = element49.attr("<hi!>\n <hi!> \n  <hi! class=\"\"></hi!> \n  <hi!> \n  </hi!> \n </hi!>\n</hi!>", "<hi!> <hi! class=\"\"></hi!> <hi!> </hi!> </hi!>");
        org.jsoup.select.Elements elements54 = element52.getElementsByAttribute("<hi!> <hi! class=\"\"></hi!> </hi!>");
        org.jsoup.nodes.Element element57 = element52.attr("<hi! class=\"<hi! class=&quot;<hi!></hi!>&quot;></hi!> <<hi!>\n <hi! class=&quot;&quot;></hi!>\n</hi!> class=&quot;&quot;>\n <<hi!>\n <hi! class=&quot;&quot;></hi!>\n</hi!> class=&quot;<hi!></hi!>&quot;></<hi!>\n <hi! class=&quot;&quot;></hi!>\n</hi!>>\n</<hi!>\n <hi! class=&quot;&quot;></hi!>\n</hi!>> <hi!></hi!>\"></hi!>", "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element59 = element57.text("<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi! class=&quot;&quot;></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>");
        java.lang.Appendable appendable60 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = null;
        // The following exception was thrown during execution in test generation
        try {
            element57.outerHtmlTail(appendable60, (int) '4', outputSettings62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(textNodeList21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(textNodeList25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<hi!></hi!>" + "'", str38, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "<hi! class=\"<hi!></hi!>\"></hi!>", "<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>", "<hi!></hi!>", "<hi! class=\"<hi!></hi!>\"></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(elements54);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(element59);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.attr("", true);
        org.jsoup.nodes.Element element6 = element1.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element8.attr("", true);
        org.jsoup.nodes.Element element13 = element8.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element14 = element1.appendTo(element13);
        boolean boolean15 = element1.hasText();
        boolean boolean16 = element1.hasText();
        element1.nodelistChanged();
        org.jsoup.nodes.Element element19 = element1.val("");
        boolean boolean20 = element1.hasText();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        java.lang.String str4 = element1.toString();
        org.jsoup.select.Elements elements5 = element1.siblingElements();
        org.jsoup.nodes.Node node6 = element1.root();
        org.jsoup.nodes.Element element7 = element1.clone();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        boolean boolean11 = element9.hasAttr("hi!");
        boolean boolean12 = element9.isBlock();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        boolean boolean16 = element14.hasAttr("hi!");
        org.jsoup.nodes.Element element18 = element14.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList19 = element14.textNodes();
        org.jsoup.nodes.Element element20 = element9.prependChild((org.jsoup.nodes.Node) element14);
        org.jsoup.nodes.Element element21 = element1.appendTo(element9);
        org.jsoup.select.Elements elements23 = element1.getElementsMatchingText("<hi!>\n <hi!></hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element24 = element1.clone();
        org.jsoup.nodes.Element element26 = element24.toggleClass("&lt;hi! class=\"&lt;hi!&gt;&lt;/hi!&gt;\"&gt;&lt;/hi!&gt;");
        org.jsoup.nodes.Element element28 = element24.removeClass("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<hi!></hi!>" + "'", str4, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(textNodeList19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.attr("", true);
        org.jsoup.nodes.Element element6 = element1.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element8.attr("", true);
        org.jsoup.nodes.Element element13 = element8.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element14 = element1.appendTo(element13);
        boolean boolean16 = element1.hasClass("");
        org.jsoup.nodes.Element element17 = element1.empty();
        org.jsoup.nodes.Element element19 = element17.after("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet20 = element17.classNames();
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element("hi!");
        boolean boolean24 = element22.hasAttr("hi!");
        int int25 = element22.siblingIndex();
        org.jsoup.nodes.Node node26 = element22.root();
        boolean boolean27 = element17.hasSameValue((java.lang.Object) element22);
        org.jsoup.nodes.Element element29 = element17.after("hi!");
        org.jsoup.select.Elements elements31 = element17.getElementsMatchingOwnText("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element34 = element17.attr("<<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>></<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>>", "<hi!>\n <hi!></hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Node node35 = element34.previousSibling();
        org.jsoup.nodes.Node node36 = element34.unwrap();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(node36);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Node node5 = element1.root();
        java.lang.String str6 = element1.data();
        org.jsoup.nodes.Element element8 = element1.appendElement("<hi! <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        int int4 = element1.siblingIndex();
        boolean boolean5 = element1.isBlock();
        org.jsoup.nodes.Element element6 = element1.empty();
        org.jsoup.nodes.Element element8 = element1.tagName("hi!");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        boolean boolean12 = element10.hasAttr("hi!");
        org.jsoup.nodes.Element element14 = element10.removeClass("");
        boolean boolean15 = element14.hasParent();
        org.jsoup.nodes.Node node16 = element14.previousSibling();
        org.jsoup.nodes.Node node17 = element14.nextSibling();
        org.jsoup.nodes.Element element18 = element1.doClone(node17);
        org.jsoup.nodes.Element element20 = element1.removeClass("");
        int int21 = element1.siblingIndex();
        org.jsoup.nodes.Element element22 = element1.clone();
        java.util.regex.Pattern pattern23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements24 = element22.getElementsMatchingText(pattern23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(element22);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
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
        java.util.List<org.jsoup.nodes.Node> nodeList19 = element1.ensureChildNodes();
        java.lang.String str20 = element1.id();
        java.lang.String str21 = element1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = element1.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(textNodeList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>" + "'", str16, "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>" + "'", str21, "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
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
        java.lang.String str20 = element1.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element22 = element1.before("<hi!> \n <hi!></hi!> \n <hi! class=\"\"></hi!> \n</hi!>\n<<hi!>\n <hi! class=\"\"></hi!>\n</hi!>></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>" + "'", str20, "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.attr("", true);
        org.jsoup.nodes.Element element6 = element1.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element8.attr("", true);
        org.jsoup.nodes.Element element13 = element8.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element14 = element1.appendTo(element13);
        boolean boolean15 = element1.hasAttributes();
        org.jsoup.nodes.Element element17 = element1.tagName("hi!");
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        boolean boolean21 = element19.hasAttr("hi!");
        java.lang.String str22 = element19.toString();
        org.jsoup.select.Elements elements23 = element19.siblingElements();
        org.jsoup.nodes.Node node24 = element19.root();
        org.jsoup.nodes.Element element25 = element19.clone();
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element("hi!");
        boolean boolean29 = element27.hasAttr("hi!");
        boolean boolean30 = element27.isBlock();
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element("hi!");
        boolean boolean34 = element32.hasAttr("hi!");
        org.jsoup.nodes.Element element36 = element32.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList37 = element32.textNodes();
        org.jsoup.nodes.Element element38 = element27.prependChild((org.jsoup.nodes.Node) element32);
        org.jsoup.nodes.Element element39 = element19.appendTo(element27);
        org.jsoup.nodes.Element element40 = element17.appendTo(element39);
        boolean boolean42 = element39.hasClass("<hi!>\n <hi!>\n </hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element44 = element39.prependText("<hi!></hi!>");
        boolean boolean45 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element39);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<hi!></hi!>" + "'", str22, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(textNodeList37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        boolean boolean4 = element1.isBlock();
        int int5 = element1.elementSiblingIndex();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element1.dataset();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        boolean boolean10 = element8.hasAttr("hi!");
        org.jsoup.nodes.Element element12 = element8.removeClass("");
        java.util.regex.Pattern pattern14 = null;
        org.jsoup.select.Elements elements15 = element12.getElementsByAttributeValueMatching("", pattern14);
        org.jsoup.nodes.Element element17 = element12.prependElement("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element22 = element19.attr("", true);
        java.util.List<org.jsoup.nodes.Node> nodeList23 = element22.childNodes;
        java.lang.String str24 = element22.baseUri();
        org.jsoup.nodes.Element element26 = element22.prependElement("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element27 = element17.appendTo(element22);
        org.jsoup.nodes.Element element28 = element1.doClone((org.jsoup.nodes.Node) element27);
        org.jsoup.nodes.Element element30 = element27.prependElement("hi!");
        org.jsoup.nodes.Element element31 = element30.empty();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element("hi!");
        boolean boolean35 = element33.hasAttr("hi!");
        org.jsoup.nodes.Element element37 = element33.removeClass("");
        java.util.regex.Pattern pattern39 = null;
        org.jsoup.select.Elements elements40 = element37.getElementsByAttributeValueMatching("", pattern39);
        java.util.Set<java.lang.String> strSet41 = element37.classNames();
        org.jsoup.nodes.Element element42 = element30.classNames(strSet41);
        boolean boolean43 = element42.hasParent();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
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
        element23.nodelistChanged();
        java.util.List<org.jsoup.nodes.Node> nodeList54 = element23.ensureChildNodes();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(textNodeList46);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertNotNull(textNodeList50);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(nodeList54);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.attr("", true);
        org.jsoup.nodes.Element element6 = element1.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element8.attr("", true);
        org.jsoup.nodes.Element element13 = element8.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element14 = element1.appendTo(element13);
        boolean boolean15 = element1.hasAttributes();
        org.jsoup.nodes.Element element17 = element1.tagName("hi!");
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        boolean boolean21 = element19.hasAttr("hi!");
        java.lang.String str22 = element19.toString();
        org.jsoup.select.Elements elements23 = element19.siblingElements();
        org.jsoup.nodes.Node node24 = element19.root();
        org.jsoup.nodes.Element element25 = element19.clone();
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element("hi!");
        boolean boolean29 = element27.hasAttr("hi!");
        boolean boolean30 = element27.isBlock();
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element("hi!");
        boolean boolean34 = element32.hasAttr("hi!");
        org.jsoup.nodes.Element element36 = element32.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList37 = element32.textNodes();
        org.jsoup.nodes.Element element38 = element27.prependChild((org.jsoup.nodes.Node) element32);
        org.jsoup.nodes.Element element39 = element19.appendTo(element27);
        org.jsoup.nodes.Element element40 = element17.appendTo(element39);
        java.lang.String str41 = element40.val();
        org.jsoup.select.Elements elements43 = element40.getElementsMatchingOwnText("<hi!  <<hi!>\n <hi! class=\"\"></hi!>\n</hi!>></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>></hi!>");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<hi!></hi!>" + "'", str22, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(textNodeList37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(elements43);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
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
        java.lang.String str24 = element1.tagName();
        java.util.regex.Pattern pattern26 = null;
        org.jsoup.select.Elements elements27 = element1.getElementsByAttributeValueMatching("<<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>></<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>>", pattern26);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = element1.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>" + "'", str24, "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(elements27);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
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
        org.jsoup.nodes.Element element20 = element1.text("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        java.lang.String str21 = element1.toString();
        java.lang.String str22 = element1.baseUri();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(textNodeList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>" + "'", str16, "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<hi!>\n &lt;hi!&gt; &lt;hi! class=\"\"&gt;&lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>" + "'", str21, "<hi!>\n &lt;hi!&gt; &lt;hi! class=\"\"&gt;&lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        java.lang.String str4 = element1.toString();
        org.jsoup.select.Elements elements5 = element1.siblingElements();
        boolean boolean6 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element9 = element1.attr("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>", true);
        org.jsoup.nodes.Element element11 = element9.prepend("<<hi!>\n <hi! class=\"\"></hi!>\n</hi!>></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        boolean boolean15 = element13.hasAttr("hi!");
        boolean boolean16 = element13.isBlock();
        int int17 = element13.elementSiblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = element13.childNodes;
        org.jsoup.select.Elements elements19 = element13.siblingElements();
        org.jsoup.nodes.Element element20 = element11.prependChild((org.jsoup.nodes.Node) element13);
        org.jsoup.select.Elements elements21 = element13.children();
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        boolean boolean25 = element23.hasAttr("hi!");
        org.jsoup.nodes.Element element27 = element23.removeClass("");
        org.jsoup.nodes.Node node28 = element23.previousSibling();
        org.jsoup.nodes.Element element30 = element23.text("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element32 = element23.prepend("hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element("hi!");
        boolean boolean36 = element34.hasAttr("hi!");
        int int37 = element34.siblingIndex();
        org.jsoup.nodes.Node node38 = element34.root();
        java.lang.String str39 = element34.id();
        org.jsoup.select.Elements elements42 = element34.getElementsByAttributeValueNot("hi!", "hi!");
        org.jsoup.nodes.Element element44 = element34.html("");
        org.jsoup.parser.Tag tag45 = element44.tag();
        java.lang.String str46 = element44.nodeName();
        boolean boolean48 = element44.hasClass("<<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>></<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>>");
        org.jsoup.nodes.Element element49 = element23.doClone((org.jsoup.nodes.Node) element44);
        // The following exception was thrown during execution in test generation
        try {
            element13.replaceWith((org.jsoup.nodes.Node) element49);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<hi!></hi!>" + "'", str4, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(element49);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.attr("", true);
        java.util.List<org.jsoup.nodes.Node> nodeList5 = element4.childNodes;
        java.lang.String str6 = element4.baseUri();
        org.jsoup.nodes.Element element8 = element4.prependElement("<hi! class=\"\"></hi!>");
        org.jsoup.select.Elements elements10 = element8.getElementsContainingOwnText("<hi!></hi!>");
        org.jsoup.nodes.Element element11 = element8.nextElementSibling();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNull(element11);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element4 = element1.parent();
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("", pattern6);
        java.util.List<org.jsoup.nodes.Node> nodeList8 = element1.siblingNodes();
        org.jsoup.select.Elements elements10 = element1.getElementsMatchingOwnText("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element12 = element1.appendText("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element14 = element12.prependElement("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Node[] nodeArray16 = new org.jsoup.nodes.Node[] {};
        org.jsoup.nodes.Element element17 = element12.insertChildren((int) (byte) 0, nodeArray16);
        org.jsoup.nodes.Element element19 = element12.html("<<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>></<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>>");
        element19.nodelistChanged();
        org.jsoup.parser.Tag tag21 = element19.tag();
        org.jsoup.nodes.Element element23 = element19.prepend("<hi!>\n hi!\n</hi!>");
        boolean boolean24 = element19.hasParent();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(nodeArray16);
        org.junit.Assert.assertArrayEquals(nodeArray16, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element5 = element1.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList6 = element1.textNodes();
        java.lang.String str7 = element1.tagName();
        org.jsoup.nodes.Element element9 = element1.appendText("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        boolean boolean13 = element11.hasAttr("hi!");
        int int14 = element11.siblingIndex();
        boolean boolean16 = element11.hasClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element18 = element11.prependElement("<hi!></hi!>");
        org.jsoup.nodes.Node node19 = element18.root();
        org.jsoup.nodes.Element element20 = element1.appendChild(node19);
        org.jsoup.select.Elements elements22 = element1.getElementsContainingOwnText("<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>");
        org.jsoup.nodes.Element element23 = element1.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element25 = element1.before("<hi! class=\"<<hi!></hi!>>\n <hi!  value=&quot;hi!&quot;>\n  &amp;lt;hi!&amp;gt;&amp;lt;/hi!&amp;gt;\n </hi!>\n</<hi!></hi!>> <hi! class=&quot;&quot;></hi!> <hi!>\n hi!\n</hi!> <<hi!>\n <hi! class=&quot;&quot;></hi!>\n</hi!>></<hi!>\n <hi! class=&quot;&quot;></hi!>\n</hi!>> <hi!>\n <hi! class=&quot;&quot;></hi!>\n</hi!>\">\n <hi!></hi!>\n</hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(textNodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.attr("", true);
        org.jsoup.nodes.Element element6 = element1.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element8.attr("", true);
        org.jsoup.nodes.Element element13 = element8.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element14 = element1.appendTo(element13);
        boolean boolean16 = element1.hasClass("");
        org.jsoup.nodes.Element element17 = element1.empty();
        org.jsoup.select.Elements elements18 = element17.siblingElements();
        org.jsoup.nodes.Element element20 = element17.text("<hi! >\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element25 = element22.attr("", true);
        org.jsoup.nodes.Element element27 = element22.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element32 = element29.attr("", true);
        org.jsoup.nodes.Element element34 = element29.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element35 = element22.appendTo(element34);
        boolean boolean36 = element22.hasAttributes();
        org.jsoup.nodes.Element element38 = element22.text("<hi!></hi!>");
        org.jsoup.nodes.Element element39 = element22.clone();
        java.lang.String str40 = element39.text();
        org.jsoup.nodes.Element element42 = new org.jsoup.nodes.Element("hi!");
        boolean boolean44 = element42.hasAttr("hi!");
        org.jsoup.nodes.Element element46 = element42.removeClass("");
        org.jsoup.nodes.Element element48 = element42.tagName("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        java.lang.String[] strArray64 = new java.lang.String[] { "<hi!>\n hi!\n</hi!>", "<hi!></hi!>", "<hi! class=\"\"></hi!>", "", "<hi! class=\"<hi!></hi!>\"></hi!>", "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>", "<<hi!></hi!>>\n <hi!  value=\"hi!\">\n  &lt;hi!&gt;&lt;/hi!&gt;\n </hi!>\n</<hi!></hi!>>", "<hi!>\n <hi!>\n </hi!>\n <hi! class=\"\"></hi!>\n</hi!>", "hi!", "<hi! class=\"<hi!></hi!>\"></hi!>", "hi!.<hi!></hi!>", "", "<hi! class=\"\"></hi!>", "<<hi!></hi!>>\n <hi!  value=\"hi!\">\n  &lt;hi!&gt;&lt;/hi!&gt;\n </hi!>\n</<hi!></hi!>>", "<hi!>\n hi!\n</hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet65 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet65, strArray64);
        org.jsoup.nodes.Element element67 = element48.classNames((java.util.Set<java.lang.String>) strSet65);
        org.jsoup.nodes.Element element68 = element39.prependChild((org.jsoup.nodes.Node) element67);
        org.jsoup.nodes.Element element69 = element20.before((org.jsoup.nodes.Node) element68);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "<hi!></hi!>" + "'", str40, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "<hi!>\n hi!\n</hi!>", "<hi!></hi!>", "<hi! class=\"\"></hi!>", "", "<hi! class=\"<hi!></hi!>\"></hi!>", "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>", "<<hi!></hi!>>\n <hi!  value=\"hi!\">\n  &lt;hi!&gt;&lt;/hi!&gt;\n </hi!>\n</<hi!></hi!>>", "<hi!>\n <hi!>\n </hi!>\n <hi! class=\"\"></hi!>\n</hi!>", "hi!", "<hi! class=\"<hi!></hi!>\"></hi!>", "hi!.<hi!></hi!>", "", "<hi! class=\"\"></hi!>", "<<hi!></hi!>>\n <hi!  value=\"hi!\">\n  &lt;hi!&gt;&lt;/hi!&gt;\n </hi!>\n</<hi!></hi!>>", "<hi!>\n hi!\n</hi!>" });
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertNotNull(element69);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element5 = element1.removeClass("");
        boolean boolean6 = element5.hasParent();
        org.jsoup.nodes.Node node7 = element5.previousSibling();
        org.jsoup.select.Elements elements8 = element5.siblingElements();
        boolean boolean9 = element5.hasAttributes();
        element5.doSetBaseUri("<hi!>\n hi!\n</hi!>");
        org.jsoup.parser.Tag tag12 = element5.tag();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        int int4 = element1.siblingIndex();
        boolean boolean5 = element1.isBlock();
        org.jsoup.nodes.Element element6 = element1.empty();
        org.jsoup.nodes.Element element8 = element1.tagName("hi!");
        org.jsoup.select.Elements elements11 = element8.getElementsByAttributeValueNot("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>", "<hi!></hi!>");
        boolean boolean13 = element8.hasAttr("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        java.lang.String str14 = element8.data();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexEquals((int) (byte) 100);
        org.jsoup.nodes.Element element7 = element1.prependText("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element9 = element1.prepend("&lt;hi! class=\"&lt;hi!&gt;&lt;/hi!&gt;\"&gt;&lt;/hi!&gt;");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element1.childNodes();
        org.jsoup.select.Elements elements12 = element1.getElementsByIndexGreaterThan(1);
        boolean boolean14 = element1.hasAttr("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node3 = element1.removeAttr("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
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
        org.jsoup.nodes.Element element24 = element5.classNames(strSet23);
        org.jsoup.select.Elements elements26 = element5.getElementsByAttribute("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        java.lang.String str28 = element5.attr("<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>");
        java.lang.String str29 = element5.baseUri();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(textNodeList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>" + "'", str22, "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element5 = element1.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList6 = element1.textNodes();
        java.lang.String str7 = element1.tagName();
        boolean boolean8 = element1.hasAttributes();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList9 = element1.dataNodes();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        boolean boolean13 = element11.hasAttr("hi!");
        org.jsoup.nodes.Element element15 = element11.removeClass("");
        org.jsoup.nodes.Element element17 = element11.tagName("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        boolean boolean19 = element11.hasAttr("hi!");
        java.lang.String str20 = element11.cssSelector();
        org.jsoup.nodes.Element element21 = element1.prependChild((org.jsoup.nodes.Node) element11);
        java.util.Set<java.lang.String> strSet22 = element11.classNames();
        element11.setBaseUri("<hi!>\n <hi!> \n  <hi! class=\"\"></hi!> \n </hi!>&lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(textNodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dataNodeList9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>" + "'", str20, "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(strSet22);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
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
        java.lang.String str46 = element15.outerHtml();
        org.jsoup.select.Elements elements49 = element15.getElementsByAttributeValueEnding("<hi! class=\"<hi!></hi!>\"></hi!>", "<hi! class=\"<hi!></hi!>\"></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList50 = element15.siblingNodes();
        org.jsoup.nodes.Element element51 = element15.lastElementSibling();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(textNodeList25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(textNodeList29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>" + "'", str30, "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<hi!></hi!>" + "'", str39, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "<hi!>\n <hi!></hi!>\n <hi! class=\"\"></hi!>\n</hi!>" + "'", str46, "<hi!>\n <hi!></hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertNotNull(element51);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        int int4 = element1.siblingIndex();
        boolean boolean5 = element1.isBlock();
        org.jsoup.nodes.Element element6 = element1.empty();
        org.jsoup.nodes.Element element8 = element1.tagName("hi!");
        org.jsoup.nodes.Node node9 = element1.previousSibling();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        boolean boolean13 = element11.hasAttr("hi!");
        int int14 = element11.siblingIndex();
        boolean boolean15 = element11.isBlock();
        org.jsoup.nodes.Element element16 = element11.empty();
        org.jsoup.nodes.Element element18 = element11.tagName("hi!");
        int int19 = element18.childNodeSize();
        org.jsoup.nodes.Element element20 = element1.prependChild((org.jsoup.nodes.Node) element18);
        int int21 = element20.elementSiblingIndex();
        org.jsoup.select.Elements elements22 = element20.getAllElements();
        org.jsoup.nodes.Node node23 = element20.parentNode();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node3 = element1.removeAttr("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        boolean boolean9 = element7.hasAttr("hi!");
        boolean boolean10 = element7.isBlock();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        boolean boolean14 = element12.hasAttr("hi!");
        org.jsoup.nodes.Element element16 = element12.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element12.textNodes();
        org.jsoup.nodes.Element element18 = element7.prependChild((org.jsoup.nodes.Node) element12);
        org.jsoup.nodes.Element element21 = element12.attr("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>", true);
        java.lang.String str22 = element12.val();
        org.jsoup.nodes.Element element23 = element5.appendTo(element12);
        org.jsoup.nodes.Element element24 = element5.parent();
        java.lang.String str26 = element24.absUrl("<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi! class=&quot;&quot;></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
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
        java.lang.String str24 = element1.tagName();
        java.util.regex.Pattern pattern26 = null;
        org.jsoup.select.Elements elements27 = element1.getElementsByAttributeValueMatching("<<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>></<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>>", pattern26);
        org.jsoup.select.NodeVisitor nodeVisitor28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = element1.traverse(nodeVisitor28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>" + "'", str24, "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(elements27);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        java.lang.String str4 = element1.toString();
        org.jsoup.select.Elements elements5 = element1.siblingElements();
        org.jsoup.nodes.Element element6 = element1.empty();
        org.jsoup.nodes.Element element9 = element6.attr("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>", "<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.select.Elements elements11 = element6.getElementsByClass("<hi!>\n <hi!>\n </hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element12 = element6.nextElementSibling();
        java.lang.String str13 = element6.nodeName();
        org.jsoup.nodes.Element element15 = element6.append("<hi! ></hi!>");
        org.jsoup.nodes.Element element16 = element6.parent();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<hi!></hi!>" + "'", str4, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNull(element16);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        int int4 = element1.siblingIndex();
        element1.setBaseUri("");
        org.jsoup.nodes.Element element8 = element1.prependText("");
        org.jsoup.select.Elements elements10 = element1.getElementsByIndexGreaterThan((int) (byte) 10);
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList11 = element1.dataNodes();
        org.jsoup.select.Elements elements14 = element1.getElementsByAttributeValueNot("<hi!></hi!>", "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        boolean boolean18 = element16.hasAttr("hi!");
        java.lang.String str19 = element16.toString();
        org.jsoup.nodes.Element element20 = element1.appendTo(element16);
        java.lang.String str21 = element1.ownText();
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        boolean boolean25 = element23.hasAttr("hi!");
        int int26 = element23.siblingIndex();
        boolean boolean27 = element23.isBlock();
        org.jsoup.nodes.Element element28 = element23.empty();
        org.jsoup.nodes.Element element29 = element1.doClone((org.jsoup.nodes.Node) element28);
        boolean boolean30 = element1.hasAttributes();
        int int31 = element1.elementSiblingIndex();
        boolean boolean32 = element1.hasText();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(dataNodeList11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<hi!></hi!>" + "'", str19, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        java.lang.String str4 = element1.toString();
        org.jsoup.select.Elements elements5 = element1.siblingElements();
        boolean boolean6 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements8 = element1.getElementsByAttribute("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        boolean boolean12 = element10.hasAttr("hi!");
        boolean boolean13 = element10.isBlock();
        int int14 = element10.elementSiblingIndex();
        org.jsoup.nodes.Element element17 = element10.attr("", false);
        org.jsoup.nodes.Element element18 = element10.parent();
        java.lang.String str19 = element10.nodeName();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node23 = element21.removeAttr("hi!");
        org.jsoup.nodes.Element element25 = element21.tagName("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element("hi!");
        boolean boolean29 = element27.hasAttr("hi!");
        boolean boolean30 = element27.isBlock();
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element("hi!");
        boolean boolean34 = element32.hasAttr("hi!");
        org.jsoup.nodes.Element element36 = element32.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList37 = element32.textNodes();
        org.jsoup.nodes.Element element38 = element27.prependChild((org.jsoup.nodes.Node) element32);
        org.jsoup.select.Elements elements40 = element27.getElementsMatchingText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList41 = element27.textNodes();
        java.lang.String str42 = element27.outerHtml();
        java.util.Set<java.lang.String> strSet43 = element27.classNames();
        org.jsoup.nodes.Element element44 = element25.classNames(strSet43);
        boolean boolean45 = element10.hasSameValue((java.lang.Object) element44);
        org.jsoup.nodes.Element element46 = element1.appendChild((org.jsoup.nodes.Node) element44);
        org.jsoup.select.Elements elements47 = element44.children();
        java.lang.String str48 = element44.className();
        org.jsoup.select.Elements elements50 = element44.getElementsByClass("<hi! >\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<hi!></hi!>" + "'", str4, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(textNodeList37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(textNodeList41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>" + "'", str42, "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(elements50);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        int int4 = element1.siblingIndex();
        boolean boolean5 = element1.isBlock();
        org.jsoup.nodes.Element element6 = element1.empty();
        org.jsoup.nodes.Element element8 = element1.tagName("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsByIndexGreaterThan((int) '4');
        org.jsoup.select.Elements elements11 = element8.siblingElements();
        org.jsoup.select.Elements elements14 = element8.getElementsByAttributeValue("<hi!> <hi! class=\"\"></hi!> </hi!>", "<hi!>\n <hi! class=\"\"></hi!>\n <hi!>\n </hi!>\n</hi!>");
        java.lang.String str15 = element8.nodeName();
        element8.nodelistChanged();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
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
        java.util.List<org.jsoup.nodes.Node> nodeList62 = element1.ensureChildNodes();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(textNodeList29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(textNodeList33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>" + "'", str34, "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(strSet52);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(nodeList56);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(elements61);
        org.junit.Assert.assertNotNull(nodeList62);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element5 = element1.removeClass("");
        org.jsoup.nodes.Node node6 = element1.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element1.childNodes;
        java.lang.String str9 = element1.absUrl("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        boolean boolean13 = element11.hasAttr("hi!");
        org.jsoup.nodes.Element element15 = element11.removeClass("");
        boolean boolean16 = element15.hasParent();
        org.jsoup.nodes.Element element18 = element15.append("hi!");
        org.jsoup.parser.Tag tag19 = element18.tag();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        boolean boolean23 = element21.hasAttr("hi!");
        org.jsoup.nodes.Element element25 = element21.removeClass("");
        java.util.regex.Pattern pattern27 = null;
        org.jsoup.select.Elements elements28 = element25.getElementsByAttributeValueMatching("", pattern27);
        org.jsoup.nodes.Element element30 = element25.prependElement("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element32 = element25.prepend("<hi!>\n <hi!></hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element33 = element18.appendChild((org.jsoup.nodes.Node) element32);
        org.jsoup.nodes.Element element34 = element1.appendTo(element32);
        org.jsoup.nodes.Node node35 = element32.root();
        org.jsoup.nodes.Node node36 = element32.nextSibling();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(node36);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element5 = element1.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList6 = element1.textNodes();
        java.lang.String str7 = element1.tagName();
        boolean boolean8 = element1.hasAttributes();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList9 = element1.dataNodes();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        boolean boolean13 = element11.hasAttr("hi!");
        org.jsoup.nodes.Element element15 = element11.removeClass("");
        org.jsoup.nodes.Element element17 = element11.tagName("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        boolean boolean19 = element11.hasAttr("hi!");
        java.lang.String str20 = element11.cssSelector();
        org.jsoup.nodes.Element element21 = element1.prependChild((org.jsoup.nodes.Node) element11);
        java.lang.String str22 = element21.baseUri();
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element26 = element24.prependElement("<hi!>\n <hi!>\n </hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element("hi!");
        boolean boolean30 = element28.hasAttr("hi!");
        java.lang.String str31 = element28.toString();
        org.jsoup.select.Elements elements32 = element28.siblingElements();
        org.jsoup.nodes.Element element33 = element28.empty();
        org.jsoup.parser.Tag tag34 = element28.tag();
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element(tag34, "<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.select.Elements elements38 = element36.getElementsByIndexEquals((int) (byte) 100);
        org.jsoup.nodes.Node node39 = element36.nextSibling();
        java.util.Map<java.lang.String, java.lang.String> strMap40 = element36.dataset();
        element36.doSetBaseUri("<hi!>\n <hi!>\n </hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element43 = element24.appendTo(element36);
        org.jsoup.nodes.Node node44 = element43.unwrap();
        org.jsoup.nodes.Element element45 = element21.doClone((org.jsoup.nodes.Node) element43);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(textNodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dataNodeList9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>" + "'", str20, "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<hi!></hi!>" + "'", str31, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(element45);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        boolean boolean4 = element1.isBlock();
        int int5 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element8 = element1.attr("", false);
        org.jsoup.nodes.Element element9 = element1.parent();
        org.jsoup.select.Elements elements11 = element1.getElementsByTag("<hi!>\n <hi!>\n </hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        element1.nodelistChanged();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        int int4 = element1.siblingIndex();
        element1.setBaseUri("");
        org.jsoup.nodes.Element element8 = element1.prependText("");
        org.jsoup.select.Elements elements10 = element1.getElementsByIndexGreaterThan((int) (byte) 10);
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList11 = element1.dataNodes();
        org.jsoup.select.Elements elements14 = element1.getElementsByAttributeValueNot("<hi!></hi!>", "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        boolean boolean18 = element16.hasAttr("hi!");
        java.lang.String str19 = element16.toString();
        org.jsoup.nodes.Element element20 = element1.appendTo(element16);
        java.util.List<org.jsoup.nodes.Node> nodeList21 = element16.childNodes;
        java.lang.String str22 = element16.ownText();
        java.lang.String str23 = element16.id();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(dataNodeList11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<hi!></hi!>" + "'", str19, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element5 = element1.removeClass("");
        java.util.regex.Pattern pattern7 = null;
        org.jsoup.select.Elements elements8 = element5.getElementsByAttributeValueMatching("", pattern7);
        boolean boolean9 = element5.hasText();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element5.childNodes;
        org.jsoup.select.Elements elements12 = element5.getElementsMatchingOwnText("<hi!> \n <hi!></hi!> \n <hi! class=\"\"></hi!> \n</hi!>\n<<hi!>\n <hi! class=\"\"></hi!>\n</hi!>></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = element5.ensureChildNodes();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
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
        java.lang.String str17 = element1.cssSelector();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList18 = element1.textNodes();
        org.jsoup.nodes.Element element20 = element1.removeClass("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        java.util.regex.Pattern pattern21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements22 = element1.getElementsMatchingText(pattern21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(textNodeList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>" + "'", str16, "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(textNodeList18);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
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
        org.jsoup.nodes.Element element18 = element16.removeClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        boolean boolean22 = element20.hasAttr("hi!");
        boolean boolean23 = element20.isBlock();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element("hi!");
        boolean boolean27 = element25.hasAttr("hi!");
        org.jsoup.nodes.Element element29 = element25.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList30 = element25.textNodes();
        org.jsoup.nodes.Element element31 = element20.prependChild((org.jsoup.nodes.Node) element25);
        org.jsoup.nodes.Element element33 = element25.wrap("<hi!></hi!>");
        org.jsoup.nodes.Element element35 = new org.jsoup.nodes.Element("hi!");
        boolean boolean37 = element35.hasAttr("hi!");
        boolean boolean38 = element35.isBlock();
        int int39 = element35.elementSiblingIndex();
        org.jsoup.select.Elements elements41 = element35.getElementsByIndexGreaterThan((int) (byte) 0);
        element25.replaceWith((org.jsoup.nodes.Node) element35);
        org.jsoup.nodes.Element element44 = element35.text("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element46 = element35.prependElement("<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>");
        org.jsoup.nodes.Node node47 = element46.previousSibling();
        java.lang.String str48 = element46.toString();
        org.jsoup.nodes.Element element50 = element46.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element52 = new org.jsoup.nodes.Element("hi!");
        boolean boolean54 = element52.hasAttr("hi!");
        org.jsoup.nodes.Element element56 = element52.removeClass("");
        boolean boolean57 = element56.hasParent();
        boolean boolean58 = element56.isBlock();
        java.lang.String str59 = element56.tagName();
        java.lang.String[] strArray66 = new java.lang.String[] { "<<hi!></hi!>>\n <hi!  value=\"hi!\">\n  &lt;hi!&gt;&lt;/hi!&gt;\n </hi!>\n</<hi!></hi!>>", "<hi! class=\"\"></hi!>", "<<hi!></hi!>>\n <hi!  value=\"hi!\">\n  &lt;hi!&gt;&lt;/hi!&gt;\n </hi!>\n</<hi!></hi!>>", "<hi!>\n hi!\n</hi!>", "<<hi!>\n <hi! class=\"\"></hi!>\n</hi!>></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>", "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet67 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet67, strArray66);
        org.jsoup.nodes.Element element69 = element56.classNames((java.util.Set<java.lang.String>) strSet67);
        org.jsoup.nodes.Element element70 = element50.classNames((java.util.Set<java.lang.String>) strSet67);
        org.jsoup.nodes.Node node71 = element70.root();
        boolean boolean72 = element18.equals((java.lang.Object) element70);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(textNodeList30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "<<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>></<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>>" + "'", str48, "<<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>></<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>>");
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "<<hi!></hi!>>\n <hi!  value=\"hi!\">\n  &lt;hi!&gt;&lt;/hi!&gt;\n </hi!>\n</<hi!></hi!>>", "<hi! class=\"\"></hi!>", "<<hi!></hi!>>\n <hi!  value=\"hi!\">\n  &lt;hi!&gt;&lt;/hi!&gt;\n </hi!>\n</<hi!></hi!>>", "<hi!>\n hi!\n</hi!>", "<<hi!>\n <hi! class=\"\"></hi!>\n</hi!>></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>", "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>" });
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(element69);
        org.junit.Assert.assertNotNull(element70);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        boolean boolean4 = element1.isBlock();
        int int5 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element8 = element1.attr("", false);
        element1.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element1.childNodesCopy();
        org.jsoup.nodes.Element element13 = element1.prependText("hi!");
        org.jsoup.nodes.Node node14 = element1.parentNode();
        org.jsoup.nodes.Element element15 = element1.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements16 = element15.parents();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(element15);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
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
        org.jsoup.nodes.Element element57 = element1.empty();
        org.jsoup.nodes.Node node58 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element59 = element1.appendChild(node58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(textNodeList29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(textNodeList33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>" + "'", str34, "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(strSet52);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(nodeList56);
        org.junit.Assert.assertNotNull(element57);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        java.lang.String str4 = element1.toString();
        org.jsoup.select.Elements elements5 = element1.siblingElements();
        org.jsoup.nodes.Element element6 = element1.empty();
        org.jsoup.nodes.Element element9 = element6.attr("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>", "<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.select.Elements elements11 = element6.getElementsByClass("<hi!>\n <hi!>\n </hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        element6.nodelistChanged();
        org.jsoup.nodes.Element element14 = element6.appendElement("<<hi!>\n <hi! class=\"\"></hi!>\n <hi!>\n </hi!>\n</hi!> class=\"\"></<hi!>\n <hi! class=\"\"></hi!>\n <hi!>\n </hi!>\n</hi!>>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<hi!></hi!>" + "'", str4, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element5 = element1.removeClass("");
        java.lang.String str6 = element5.toString();
        org.jsoup.select.Elements elements8 = element5.getElementsByIndexLessThan((int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<hi! class=\"\"></hi!>" + "'", str6, "<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element5 = element1.removeClass("");
        org.jsoup.nodes.Element element7 = element1.tagName("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        boolean boolean9 = element1.hasAttr("hi!");
        org.jsoup.nodes.Node node11 = element1.removeAttr("");
        org.jsoup.nodes.Element element13 = element1.prepend("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element15 = element13.prependText("<hi! class=\"\">\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.select.Elements elements18 = element15.getElementsByAttributeValueMatching("<hi! class=\"<hi! class=&quot;<hi!></hi!>&quot;></hi!> <<hi!>\n <hi! class=&quot;&quot;></hi!>\n</hi!> class=&quot;&quot;>\n <<hi!>\n <hi! class=&quot;&quot;></hi!>\n</hi!> class=&quot;<hi!></hi!>&quot;></<hi!>\n <hi! class=&quot;&quot;></hi!>\n</hi!>>\n</<hi!>\n <hi! class=&quot;&quot;></hi!>\n</hi!>> <hi!></hi!>\">\n &lt;hi!&gt; &lt;hi! class=\"\"&gt;&lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>", "<hi! <hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>=\"hi!\"></hi!>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Node node3 = element1.removeAttr("hi!");
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        boolean boolean7 = element5.hasAttr("hi!");
        int int8 = element5.siblingIndex();
        org.jsoup.nodes.Node node9 = element5.root();
        org.jsoup.nodes.Element element10 = element5.parent();
        org.jsoup.select.Elements elements12 = element5.getElementsByIndexGreaterThan((int) (byte) -1);
        org.jsoup.nodes.Element element13 = element1.doClone((org.jsoup.nodes.Node) element5);
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        boolean boolean17 = element15.hasAttr("hi!");
        int int18 = element15.siblingIndex();
        org.jsoup.nodes.Node node19 = element15.root();
        org.jsoup.nodes.Element element20 = element15.parent();
        org.jsoup.select.Elements elements22 = element15.getElementsByIndexGreaterThan((int) (byte) -1);
        java.util.List<org.jsoup.nodes.Node> nodeList23 = element15.childNodesCopy();
        boolean boolean25 = element15.hasClass("");
        org.jsoup.nodes.Element element26 = element1.doClone((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element("hi!");
        boolean boolean30 = element28.hasAttr("hi!");
        org.jsoup.nodes.Element element32 = element28.removeClass("");
        java.lang.String str33 = element32.html();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = element32.ensureChildNodes();
        java.util.Set<java.lang.String> strSet35 = element32.classNames();
        org.jsoup.nodes.Element element36 = element1.classNames(strSet35);
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element("hi!");
        boolean boolean40 = element38.hasAttr("hi!");
        int int41 = element38.siblingIndex();
        element38.setBaseUri("");
        org.jsoup.select.Elements elements44 = element38.parents();
        org.jsoup.nodes.Element element46 = element38.text("");
        org.jsoup.nodes.Element element47 = element36.doClone((org.jsoup.nodes.Node) element46);
        java.lang.String str48 = element46.toString();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(element20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "<hi!>\n</hi!>" + "'", str48, "<hi!>\n</hi!>");
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
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
        boolean boolean15 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element12);
        java.lang.String str16 = element12.cssSelector();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Attributes attributes5 = element1.attributes();
        java.lang.String str6 = element1.val();
        java.lang.String str7 = element1.cssSelector();
        org.jsoup.parser.Tag tag8 = element1.tag();
        java.lang.String str9 = element1.ownText();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        java.lang.String str4 = element1.toString();
        org.jsoup.nodes.Node node5 = element1.previousSibling();
        org.jsoup.select.Elements elements6 = element1.getAllElements();
        org.jsoup.nodes.Element element8 = element1.prepend("");
        org.jsoup.select.Elements elements11 = element1.getElementsByAttributeValueEnding("<hi! class=\"\"></hi!>", "<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        boolean boolean15 = element13.hasAttr("hi!");
        org.jsoup.nodes.Element element17 = element13.removeClass("");
        org.jsoup.nodes.Element element19 = element13.text("hi!");
        java.lang.String str20 = element19.id();
        org.jsoup.nodes.Element element21 = element1.prependChild((org.jsoup.nodes.Node) element19);
        org.jsoup.select.Elements elements22 = element21.siblingElements();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<hi!></hi!>" + "'", str4, "<hi!></hi!>");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        boolean boolean4 = element1.isBlock();
        int int5 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element8 = element1.attr("", false);
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        boolean boolean13 = element11.hasAttr("hi!");
        boolean boolean14 = element11.isBlock();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        boolean boolean18 = element16.hasAttr("hi!");
        org.jsoup.nodes.Element element20 = element16.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList21 = element16.textNodes();
        org.jsoup.nodes.Element element22 = element11.prependChild((org.jsoup.nodes.Node) element16);
        org.jsoup.select.Elements elements24 = element11.getElementsMatchingText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList25 = element11.textNodes();
        org.jsoup.nodes.Element element26 = element1.insertChildren((int) (byte) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList25);
        org.jsoup.select.Elements elements27 = element1.children();
        org.jsoup.nodes.Element element29 = element1.text("<hi! class=\"\"></hi!>");
        org.jsoup.select.Elements elements31 = element1.getElementsByTag("<hi! class=\"\"></hi!>");
        java.lang.String str32 = element1.text();
        boolean boolean33 = element1.hasText();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(textNodeList21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(textNodeList25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<hi! class=\"\"></hi!>" + "'", str32, "<hi! class=\"\"></hi!>");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Node node5 = element1.root();
        java.lang.String str6 = element1.id();
        org.jsoup.select.Elements elements9 = element1.getElementsByAttributeValueNot("hi!", "hi!");
        org.jsoup.nodes.Node node10 = element1.clearAttributes();
        java.lang.String str11 = element1.outerHtml();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        boolean boolean15 = element13.hasAttr("hi!");
        boolean boolean16 = element13.isBlock();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        boolean boolean20 = element18.hasAttr("hi!");
        org.jsoup.nodes.Element element22 = element18.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList23 = element18.textNodes();
        org.jsoup.nodes.Element element24 = element13.prependChild((org.jsoup.nodes.Node) element18);
        org.jsoup.parser.Tag tag25 = element24.tag();
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element("hi!");
        boolean boolean29 = element27.hasAttr("hi!");
        boolean boolean30 = element27.isBlock();
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element("hi!");
        boolean boolean34 = element32.hasAttr("hi!");
        org.jsoup.nodes.Element element36 = element32.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList37 = element32.textNodes();
        org.jsoup.nodes.Element element38 = element27.prependChild((org.jsoup.nodes.Node) element32);
        org.jsoup.select.Elements elements40 = element27.getElementsMatchingText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList41 = element27.textNodes();
        java.lang.String str42 = element27.outerHtml();
        java.lang.String str43 = element27.cssSelector();
        org.jsoup.nodes.Element element44 = element24.appendChild((org.jsoup.nodes.Node) element27);
        org.jsoup.select.Elements elements46 = element24.getElementsMatchingText("<hi!></hi!>");
        boolean boolean47 = element1.equals((java.lang.Object) "<hi!></hi!>");
        org.jsoup.nodes.Element element50 = element1.attr("<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <hi!>\n  <hi! class=\"\"></hi!>\n </hi!>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>", "<<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>> class=\"\"></<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>>");
        org.jsoup.nodes.Element element52 = new org.jsoup.nodes.Element("hi!");
        boolean boolean54 = element52.hasAttr("hi!");
        org.jsoup.nodes.Element element56 = element52.removeClass("");
        boolean boolean57 = element56.hasParent();
        org.jsoup.nodes.Node node58 = element56.previousSibling();
        org.jsoup.select.Elements elements59 = element56.siblingElements();
        org.jsoup.nodes.Element element61 = element56.appendText("<hi!>\n <hi! class=\"\"></hi!>\n <hi!>\n </hi!>\n</hi!>");
        org.jsoup.nodes.Document document62 = element61.ownerDocument();
        org.jsoup.nodes.Element element64 = element61.prepend("<hi!> <hi! class=\"\"></hi!> </hi!>");
        org.jsoup.nodes.Element element65 = element1.prependChild((org.jsoup.nodes.Node) element64);
        org.jsoup.nodes.Element element67 = element1.appendText("<hi! >\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element69 = new org.jsoup.nodes.Element("<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>");
        org.jsoup.nodes.Node node70 = element69.previousSibling();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList71 = element69.dataNodes();
        // The following exception was thrown during execution in test generation
        try {
            element67.replaceWith((org.jsoup.nodes.Node) element69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<hi!></hi!>" + "'", str11, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(textNodeList23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(textNodeList37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(textNodeList41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>" + "'", str42, "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNotNull(elements59);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNull(document62);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertNotNull(dataNodeList71);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        boolean boolean7 = element5.hasAttr("hi!");
        int int8 = element5.siblingIndex();
        org.jsoup.nodes.Node node9 = element5.root();
        java.lang.String str10 = element5.id();
        java.lang.String str11 = element5.toString();
        org.jsoup.nodes.Element element13 = element5.appendText("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element14 = element1.appendChild((org.jsoup.nodes.Node) element13);
        org.jsoup.nodes.Element element15 = element13.parent();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList16 = element13.textNodes();
        org.jsoup.select.Elements elements18 = element13.getElementsByAttribute("<hi! class=\"<hi! class=&quot;<hi!></hi!>&quot;></hi!> <<hi!>\n <hi! class=&quot;&quot;></hi!>\n</hi!> class=&quot;&quot;>\n <<hi!>\n <hi! class=&quot;&quot;></hi!>\n</hi!> class=&quot;<hi!></hi!>&quot;></<hi!>\n <hi! class=&quot;&quot;></hi!>\n</hi!>>\n</<hi!>\n <hi! class=&quot;&quot;></hi!>\n</hi!>> <hi!></hi!>\">\n &lt;hi!&gt; &lt;hi! class=\"\"&gt;&lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element19 = element13.lastElementSibling();
        org.jsoup.nodes.Element element21 = element13.prependText("<<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>></<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<hi!></hi!>" + "'", str11, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(textNodeList16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element5 = element1.removeClass("");
        java.util.regex.Pattern pattern7 = null;
        org.jsoup.select.Elements elements8 = element5.getElementsByAttributeValueMatching("", pattern7);
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        boolean boolean12 = element10.hasAttr("hi!");
        int int13 = element10.siblingIndex();
        boolean boolean15 = element10.hasClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element17 = element10.prependElement("<hi!></hi!>");
        org.jsoup.nodes.Node node18 = element17.root();
        org.jsoup.nodes.Element element19 = element5.doClone((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Element element20 = element5.clone();
        boolean boolean21 = element5.hasParent();
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element26 = element23.attr("", true);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList27 = element23.textNodes();
        org.jsoup.nodes.Element element29 = element23.prependText("<hi!>\n <hi! class=\"\"></hi!>\n <hi!>\n </hi!>\n</hi!>");
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element34 = element31.attr("", true);
        org.jsoup.nodes.Element element36 = element31.appendText("<hi!></hi!>");
        boolean boolean38 = element31.hasClass("<hi!></hi!>");
        org.jsoup.nodes.Element element40 = element31.text("");
        boolean boolean41 = element31.isBlock();
        boolean boolean42 = element29.hasSameValue((java.lang.Object) boolean41);
        org.jsoup.nodes.Element element43 = element5.doClone((org.jsoup.nodes.Node) element29);
        org.jsoup.nodes.Element element45 = element29.appendElement("<hi! class=\"<hi!> <hi! class=&quot;&quot;></hi!> </hi!>\">\n <hi!>\n </hi!>\n</hi!>");
        org.jsoup.select.Elements elements47 = element45.getElementsContainingOwnText("<hi! class=\"\">\n &lt;hi! class=\"&lt;hi!&gt;&lt;/hi!&gt;\"&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.select.Elements elements50 = element45.getElementsByAttributeValueStarting("<hi! <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>>\n <hi! class=\"\"></hi!>\n</hi!>", "<hi! <hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>=\"hi!\"></hi!>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(textNodeList27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNotNull(elements50);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element5 = element1.removeClass("");
        java.util.regex.Pattern pattern7 = null;
        org.jsoup.select.Elements elements8 = element5.getElementsByAttributeValueMatching("", pattern7);
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        boolean boolean12 = element10.hasAttr("hi!");
        int int13 = element10.siblingIndex();
        boolean boolean15 = element10.hasClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element17 = element10.prependElement("<hi!></hi!>");
        org.jsoup.nodes.Node node18 = element17.root();
        org.jsoup.nodes.Element element19 = element5.doClone((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Element element20 = element5.clone();
        org.jsoup.nodes.Element element22 = element5.getElementById("<hi!>\n <hi!>\n </hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        boolean boolean26 = element24.hasAttr("hi!");
        boolean boolean27 = element24.isBlock();
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element("hi!");
        boolean boolean31 = element29.hasAttr("hi!");
        org.jsoup.nodes.Element element33 = element29.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList34 = element29.textNodes();
        org.jsoup.nodes.Element element35 = element24.prependChild((org.jsoup.nodes.Node) element29);
        org.jsoup.select.Elements elements37 = element24.getElementsMatchingText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList38 = element24.textNodes();
        java.lang.String str39 = element24.outerHtml();
        java.util.Set<java.lang.String> strSet40 = element24.classNames();
        org.jsoup.nodes.Element element41 = element5.classNames(strSet40);
        java.util.List<org.jsoup.nodes.Node> nodeList42 = element41.childNodesCopy();
        org.jsoup.nodes.Element element44 = element41.tagName("<<hi! class=\"<hi!></hi!>\"></hi!>></<hi! class=\"<hi!></hi!>\"></hi!>>");
        org.jsoup.nodes.Element element46 = element41.appendText("<<hi!>\n <hi! class=\"\"></hi!>\n</hi!>></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>");
        java.lang.String str47 = element41.ownText();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNull(element22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(textNodeList34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(textNodeList38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>" + "'", str39, "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "<<hi!> <hi! class=\"\"></hi!> </hi!>></<hi!> <hi! class=\"\"></hi!> </hi!>>" + "'", str47, "<<hi!> <hi! class=\"\"></hi!> </hi!>></<hi!> <hi! class=\"\"></hi!> </hi!>>");
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
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
        org.jsoup.nodes.Element element27 = element16.tagName("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element29 = element16.text("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element("hi!");
        boolean boolean33 = element31.hasAttr("hi!");
        org.jsoup.nodes.Element element35 = element31.removeClass("");
        boolean boolean36 = element35.hasParent();
        org.jsoup.nodes.Element element38 = element35.append("hi!");
        org.jsoup.parser.Tag tag39 = element38.tag();
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element("hi!");
        boolean boolean43 = element41.hasAttr("hi!");
        org.jsoup.nodes.Element element45 = element41.removeClass("");
        java.util.regex.Pattern pattern47 = null;
        org.jsoup.select.Elements elements48 = element45.getElementsByAttributeValueMatching("", pattern47);
        org.jsoup.nodes.Element element50 = element45.prependElement("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element52 = element45.prepend("<hi!>\n <hi!></hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element53 = element38.appendChild((org.jsoup.nodes.Node) element52);
        org.jsoup.select.Elements elements55 = element53.getElementsByAttributeStarting("<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>");
        org.jsoup.nodes.Element element56 = element16.appendChild((org.jsoup.nodes.Node) element53);
        org.jsoup.nodes.Element element58 = element56.html("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(elements55);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(element58);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element5 = element1.removeClass("");
        boolean boolean6 = element5.hasParent();
        org.jsoup.nodes.Node node7 = element5.previousSibling();
        org.jsoup.select.Elements elements8 = element5.siblingElements();
        org.jsoup.nodes.Element element10 = element5.appendText("<hi!>\n <hi! class=\"\"></hi!>\n <hi!>\n </hi!>\n</hi!>");
        org.jsoup.select.Elements elements13 = element10.getElementsByAttributeValueNot("&lt;hi!&gt;&lt;/hi!&gt;", "<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>");
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        boolean boolean17 = element15.hasAttr("hi!");
        java.lang.String str18 = element15.toString();
        org.jsoup.nodes.Node node19 = element15.previousSibling();
        org.jsoup.select.Elements elements20 = element15.getAllElements();
        org.jsoup.nodes.Element element22 = element15.prepend("");
        java.util.Set<java.lang.String> strSet23 = element22.classNames();
        org.jsoup.nodes.Element element24 = element10.appendTo(element22);
        org.jsoup.nodes.Element element26 = element24.appendText("<hi!>&lt;&lt;\n <hi!> \n  <hi! class=\"\"></hi!> \n </hi!> class=\"\"&gt; &lt;\n <hi!> \n  <hi! class=\"\"></hi!> \n </hi!> class=\"\n <hi!></hi!>\"&gt;\n <!--<hi!--> \n <hi! class=\"\"></hi!> &gt; \n <!--<hi!--> \n <hi! class=\"\"></hi!> &gt;&gt;\n <!--<<hi!--> \n <hi! class=\"\"></hi!>  class=\"\"&gt; &lt;\n <hi!> \n  <hi! class=\"\"></hi!> \n </hi!> class=\"\n <hi!></hi!>\"&gt;\n <!--<hi!--> \n <hi! class=\"\"></hi!> &gt; \n <!--<hi!--> \n <hi! class=\"\"></hi!> &gt;&gt;\n</hi!>");
        org.jsoup.nodes.Element element27 = element24.clone();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<hi!></hi!>" + "'", str18, "<hi!></hi!>");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        java.lang.String str4 = element1.toString();
        org.jsoup.select.Elements elements5 = element1.siblingElements();
        org.jsoup.nodes.Element element6 = element1.empty();
        org.jsoup.parser.Tag tag7 = element1.tag();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag7, "<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.select.Elements elements11 = element9.getElementsByIndexEquals((int) (byte) 100);
        org.jsoup.nodes.Node node12 = element9.nextSibling();
        org.jsoup.nodes.Attributes attributes13 = element9.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = element9.childNodes;
        org.jsoup.nodes.Node node15 = element9.clearAttributes();
        org.jsoup.select.Elements elements16 = element9.getAllElements();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<hi!></hi!>" + "'", str4, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.attr("", true);
        java.util.List<org.jsoup.nodes.Node> nodeList5 = element4.childNodes;
        java.lang.String str6 = element4.baseUri();
        element4.nodelistChanged();
        org.jsoup.nodes.Element element8 = element4.previousElementSibling();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        java.lang.String str4 = element1.toString();
        org.jsoup.select.Elements elements5 = element1.siblingElements();
        org.jsoup.select.Elements elements6 = element1.getAllElements();
        org.jsoup.nodes.Element element8 = element1.prependText("hi!");
        java.lang.String str9 = element8.className();
        org.jsoup.nodes.Element element11 = element8.val("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Node node12 = element8.clearAttributes();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<hi!></hi!>" + "'", str4, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
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
        org.jsoup.nodes.Element element26 = element22.attr("<hi!>\n <hi!>\n </hi!>\n <hi! class=\"\"></hi!>\n</hi!>", "<hi!>\n <hi!>\n </hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = element22.childNodes();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(nodeList27);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
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
        java.lang.String str19 = element1.attr("<hi! class=\"\"></hi!>");
        int int20 = element1.elementSiblingIndex();
        org.jsoup.select.Elements elements22 = element1.getElementsByIndexEquals(2);
        boolean boolean23 = element1.isBlock();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(textNodeList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>" + "'", str16, "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element5 = element1.removeClass("");
        java.util.regex.Pattern pattern7 = null;
        org.jsoup.select.Elements elements8 = element5.getElementsByAttributeValueMatching("", pattern7);
        java.util.Set<java.lang.String> strSet9 = element5.classNames();
        org.jsoup.nodes.Element element10 = element5.clone();
        org.jsoup.select.Elements elements12 = element10.getElementsByIndexEquals(100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.attr("", true);
        org.jsoup.nodes.Element element6 = element1.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element8.attr("", true);
        org.jsoup.nodes.Element element13 = element8.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element14 = element1.appendTo(element13);
        boolean boolean15 = element1.hasAttributes();
        org.jsoup.nodes.Element element17 = element1.text("<hi!></hi!>");
        org.jsoup.nodes.Element element18 = element1.clone();
        java.lang.String str19 = element1.id();
        org.jsoup.nodes.Element element21 = element1.toggleClass("<hi! class=\"<hi! class=&quot;<hi!></hi!>&quot;></hi!> <<hi!>\n <hi! class=&quot;&quot;></hi!>\n</hi!> class=&quot;&quot;>\n <<hi!>\n <hi! class=&quot;&quot;></hi!>\n</hi!> class=&quot;<hi!></hi!>&quot;></<hi!>\n <hi! class=&quot;&quot;></hi!>\n</hi!>>\n</<hi!>\n <hi! class=&quot;&quot;></hi!>\n</hi!>> <hi!></hi!>\">\n &lt;hi!&gt; &lt;hi! class=\"\"&gt;&lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>");
        boolean boolean22 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements23 = element1.children();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        boolean boolean4 = element1.isBlock();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        boolean boolean8 = element6.hasAttr("hi!");
        org.jsoup.nodes.Element element10 = element6.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element6.textNodes();
        org.jsoup.nodes.Element element12 = element1.prependChild((org.jsoup.nodes.Node) element6);
        org.jsoup.select.Elements elements14 = element1.getElementsMatchingText("<hi!></hi!>");
        java.util.regex.Pattern pattern16 = null;
        org.jsoup.select.Elements elements17 = element1.getElementsByAttributeValueMatching("<hi!></hi!>", pattern16);
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        boolean boolean21 = element19.hasAttr("hi!");
        int int22 = element19.siblingIndex();
        org.jsoup.nodes.Node node23 = element19.root();
        java.lang.String str24 = element19.id();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = element19.childNodes;
        org.jsoup.nodes.Element element26 = element1.appendChild((org.jsoup.nodes.Node) element19);
        element19.doSetBaseUri("<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>");
        org.jsoup.nodes.Element element31 = element19.attr("<hi!> <hi! class=\"\"></hi!> <hi!> </hi!> </hi!>", "");
        org.jsoup.select.Elements elements33 = element31.getElementsContainingOwnText("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(elements33);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        java.lang.String str4 = element1.toString();
        org.jsoup.select.Elements elements5 = element1.siblingElements();
        org.jsoup.nodes.Node node6 = element1.root();
        java.lang.String str7 = element1.className();
        element1.setBaseUri("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        boolean boolean13 = element11.hasAttr("hi!");
        int int14 = element11.siblingIndex();
        element11.setBaseUri("");
        org.jsoup.nodes.Element element18 = element11.prependText("");
        org.jsoup.select.Elements elements20 = element18.getElementsByIndexEquals(10);
        org.jsoup.nodes.Element element21 = element1.doClone((org.jsoup.nodes.Node) element18);
        org.jsoup.nodes.Element element23 = element18.text("hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element24 = element18.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = element18.childNodes;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<hi!></hi!>" + "'", str4, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(nodeList25);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
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
        boolean boolean19 = element16.isBlock();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        boolean boolean23 = element21.hasAttr("hi!");
        org.jsoup.nodes.Element element25 = element21.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList26 = element21.textNodes();
        org.jsoup.nodes.Element element27 = element16.prependChild((org.jsoup.nodes.Node) element21);
        org.jsoup.parser.Tag tag28 = element27.tag();
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element("hi!");
        boolean boolean32 = element30.hasAttr("hi!");
        boolean boolean33 = element30.isBlock();
        org.jsoup.nodes.Element element35 = new org.jsoup.nodes.Element("hi!");
        boolean boolean37 = element35.hasAttr("hi!");
        org.jsoup.nodes.Element element39 = element35.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList40 = element35.textNodes();
        org.jsoup.nodes.Element element41 = element30.prependChild((org.jsoup.nodes.Node) element35);
        org.jsoup.select.Elements elements43 = element30.getElementsMatchingText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList44 = element30.textNodes();
        java.lang.String str45 = element30.outerHtml();
        java.lang.String str46 = element30.cssSelector();
        org.jsoup.nodes.Element element47 = element27.appendChild((org.jsoup.nodes.Node) element30);
        org.jsoup.select.Elements elements49 = element30.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element51 = new org.jsoup.nodes.Element("hi!");
        boolean boolean53 = element51.hasAttr("hi!");
        java.lang.String str54 = element51.toString();
        org.jsoup.select.Elements elements55 = element51.siblingElements();
        org.jsoup.nodes.Node node56 = element51.root();
        org.jsoup.nodes.Element element57 = element51.clone();
        boolean boolean59 = element51.hasClass("hi!");
        org.jsoup.nodes.Element element60 = element30.prependChild((org.jsoup.nodes.Node) element51);
        org.jsoup.nodes.Element element61 = element60.empty();
        org.jsoup.nodes.Attributes attributes62 = element61.attributes();
        org.jsoup.nodes.Element element63 = new org.jsoup.nodes.Element(tag13, "<hi! class=\"\"></hi!>", attributes62);
        org.jsoup.nodes.Element element65 = new org.jsoup.nodes.Element(tag13, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(textNodeList26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(textNodeList40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(textNodeList44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>" + "'", str45, "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "<hi!></hi!>" + "'", str54, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements55);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNotNull(attributes62);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element4 = element1.parent();
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("", pattern6);
        java.util.List<org.jsoup.nodes.Node> nodeList8 = element1.siblingNodes();
        org.jsoup.select.Elements elements10 = element1.getElementsMatchingOwnText("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element12 = element1.appendText("<hi! class=\"\"></hi!>");
        org.jsoup.select.Elements elements14 = element1.getElementsByClass("<hi!> <hi! class=\"\"></hi!> <hi!> </hi!> </hi!>");
        org.jsoup.nodes.Element element16 = element1.text("<hi!>\n <hi!> \n  <hi! class=\"\"></hi!> \n  <hi!> \n  </hi!> \n </hi!>\n</hi!>");
        java.lang.String str18 = element1.absUrl("<hi! ></hi!>");
        java.util.Set<java.lang.String> strSet19 = element1.classNames();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strSet19);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        boolean boolean4 = element1.isBlock();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        boolean boolean8 = element6.hasAttr("hi!");
        org.jsoup.nodes.Element element10 = element6.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element6.textNodes();
        org.jsoup.nodes.Element element12 = element1.prependChild((org.jsoup.nodes.Node) element6);
        org.jsoup.nodes.Element element15 = element6.attr("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>", true);
        java.lang.String str16 = element6.id();
        org.jsoup.nodes.Node node18 = element6.removeAttr("");
        int int19 = element6.childNodeSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.attr("", true);
        org.jsoup.nodes.Element element6 = element1.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element8.attr("", true);
        org.jsoup.nodes.Element element13 = element8.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element14 = element1.appendTo(element13);
        boolean boolean16 = element1.hasClass("");
        org.jsoup.nodes.Element element17 = element1.empty();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element22 = element19.attr("", true);
        org.jsoup.nodes.Element element24 = element19.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element29 = element26.attr("", true);
        org.jsoup.nodes.Element element31 = element26.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element32 = element19.appendTo(element31);
        boolean boolean34 = element19.hasClass("");
        org.jsoup.nodes.Element element35 = element19.empty();
        org.jsoup.nodes.Element element37 = element35.after("<hi!></hi!>");
        org.jsoup.nodes.Element element38 = element17.appendChild((org.jsoup.nodes.Node) element37);
        org.jsoup.select.Elements elements41 = element17.getElementsByAttributeValueMatching("<hi!>\n <hi!>\n </hi!>\n <hi! class=\"\"></hi!>\n</hi!>", "<hi! class=\"<hi!></hi!>\"></hi!>");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(elements41);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
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
        java.util.List<org.jsoup.nodes.Node> nodeList24 = element1.siblingNodes();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element("hi!");
        boolean boolean28 = element26.hasAttr("hi!");
        int int29 = element26.siblingIndex();
        element26.setBaseUri("");
        org.jsoup.nodes.Element element33 = element26.prependText("");
        org.jsoup.nodes.Element element35 = new org.jsoup.nodes.Element("hi!");
        boolean boolean37 = element35.hasAttr("hi!");
        boolean boolean38 = element35.isBlock();
        org.jsoup.nodes.Element element40 = new org.jsoup.nodes.Element("hi!");
        boolean boolean42 = element40.hasAttr("hi!");
        org.jsoup.nodes.Element element44 = element40.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList45 = element40.textNodes();
        org.jsoup.nodes.Element element46 = element35.prependChild((org.jsoup.nodes.Node) element40);
        org.jsoup.select.Elements elements48 = element35.getElementsMatchingText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList49 = element35.textNodes();
        java.lang.String str50 = element35.outerHtml();
        java.util.Set<java.lang.String> strSet51 = element35.classNames();
        java.util.List<org.jsoup.nodes.Node> nodeList52 = element35.childNodes();
        org.jsoup.nodes.Element element53 = element26.appendTo(element35);
        org.jsoup.nodes.Element element55 = new org.jsoup.nodes.Element("hi!");
        boolean boolean57 = element55.hasAttr("hi!");
        org.jsoup.nodes.Element element59 = element55.removeClass("");
        boolean boolean60 = element59.hasParent();
        org.jsoup.nodes.Node node61 = element59.previousSibling();
        org.jsoup.nodes.Node node62 = element59.nextSibling();
        org.jsoup.select.Elements elements65 = element59.getElementsByAttributeValueNot("hi!", "<hi!></hi!>");
        org.jsoup.nodes.Element element67 = element59.html("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element68 = element26.after((org.jsoup.nodes.Node) element67);
        java.lang.String str69 = element68.val();
        org.jsoup.nodes.Element element71 = element68.removeClass("hi!.<hi!></hi!>");
        boolean boolean72 = element1.hasSameValue((java.lang.Object) element68);
        org.jsoup.nodes.Element element74 = element68.before("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(textNodeList45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertNotNull(textNodeList49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>" + "'", str50, "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertNotNull(nodeList52);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNotNull(elements65);
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(element71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(element74);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
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
        java.lang.String str40 = element35.html();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(textNodeList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>" + "'", str16, "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "<hi! class=\"\"></hi!>" + "'", str40, "<hi! class=\"\"></hi!>");
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.attr("", true);
        org.jsoup.nodes.Element element6 = element1.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element8.attr("", true);
        org.jsoup.nodes.Element element13 = element8.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element14 = element1.appendTo(element13);
        boolean boolean15 = element1.hasAttributes();
        org.jsoup.nodes.Element element17 = element1.text("<hi!></hi!>");
        org.jsoup.nodes.Element element18 = element1.clone();
        java.lang.String str19 = element1.id();
        org.jsoup.nodes.Element element21 = element1.append("<hi!> <hi! class=\"\"></hi!> </hi!>");
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element27 = element24.attr("", true);
        org.jsoup.nodes.Element element29 = element24.appendText("<hi!></hi!>");
        boolean boolean31 = element24.hasClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList32 = element24.childNodes();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList33 = element24.textNodes();
        org.jsoup.nodes.Element element34 = element21.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList33);
        org.jsoup.nodes.Element element35 = element21.lastElementSibling();
        java.lang.Appendable appendable36 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = null;
        // The following exception was thrown during execution in test generation
        try {
            element21.outerHtmlHead(appendable36, (int) (short) 10, outputSettings38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(textNodeList33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNull(element35);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Node node5 = element1.root();
        org.jsoup.select.Elements elements6 = element1.getAllElements();
        org.jsoup.nodes.Element element7 = element1.parent();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        boolean boolean11 = element9.hasAttr("hi!");
        int int12 = element9.siblingIndex();
        element9.setBaseUri("");
        org.jsoup.nodes.Element element16 = element9.prependText("");
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        boolean boolean20 = element18.hasAttr("hi!");
        boolean boolean21 = element18.isBlock();
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        boolean boolean25 = element23.hasAttr("hi!");
        org.jsoup.nodes.Element element27 = element23.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList28 = element23.textNodes();
        org.jsoup.nodes.Element element29 = element18.prependChild((org.jsoup.nodes.Node) element23);
        org.jsoup.select.Elements elements31 = element18.getElementsMatchingText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList32 = element18.textNodes();
        java.lang.String str33 = element18.outerHtml();
        java.util.Set<java.lang.String> strSet34 = element18.classNames();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = element18.childNodes();
        org.jsoup.nodes.Element element36 = element9.appendTo(element18);
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element("hi!");
        boolean boolean40 = element38.hasAttr("hi!");
        org.jsoup.nodes.Element element42 = element38.removeClass("");
        boolean boolean43 = element42.hasParent();
        org.jsoup.nodes.Node node44 = element42.previousSibling();
        org.jsoup.nodes.Node node45 = element42.nextSibling();
        org.jsoup.select.Elements elements48 = element42.getElementsByAttributeValueNot("hi!", "<hi!></hi!>");
        org.jsoup.nodes.Element element50 = element42.html("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element51 = element9.after((org.jsoup.nodes.Node) element50);
        boolean boolean52 = element1.equals((java.lang.Object) element50);
        org.jsoup.nodes.Element element54 = element50.prependText("<hi!>\n <hi!> \n  <hi! class=\"\"></hi!> \n  <hi!> \n  </hi!> \n </hi!>\n</hi!>");
        org.jsoup.nodes.Element element55 = element50.clone();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(textNodeList28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(textNodeList32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>" + "'", str33, "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(element55);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.attr("", true);
        org.jsoup.nodes.Element element6 = element1.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element8.attr("", true);
        org.jsoup.nodes.Element element13 = element8.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element14 = element1.appendTo(element13);
        org.jsoup.nodes.Element element16 = element14.val("hi!");
        org.jsoup.nodes.Element element17 = element16.previousElementSibling();
        org.jsoup.nodes.Element element19 = element16.appendText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList20 = element16.dataNodes();
        org.jsoup.select.Elements elements22 = element16.getElementsContainingText("");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(dataNodeList20);
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.attr("", true);
        org.jsoup.nodes.Node node5 = element1.parentNode();
        org.jsoup.select.Elements elements7 = element1.getElementsByAttribute("<hi!>\n <hi!>\n </hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element8 = element1.clone();
        org.jsoup.nodes.Element element10 = element8.toggleClass("<hi!>\n <hi!>\n </hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.select.Elements elements13 = element8.getElementsByAttributeValueStarting("<hi! class=\"\">\n <hi!></hi!>&lt;hi!&gt; &lt;hi! class=\"\"&gt;&lt;/hi!&gt; &lt;hi!&gt; &lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>", "<hi! class=\"\">\n &lt;&lt;hi!&gt; &lt;hi! class=\"\"&gt;&lt;/hi!&gt; &lt;/hi!&gt; class=\"\"&gt; &lt;&lt;hi!&gt; &lt;hi! class=\"\"&gt;&lt;/hi!&gt; &lt;/hi!&gt; class=\"&lt;hi!&gt;&lt;/hi!&gt;\"&gt;&lt;/&lt;hi!&gt; &lt;hi! class=\"\"&gt;&lt;/hi!&gt; &lt;/hi!&gt;&gt; &lt;/&lt;hi!&gt; &lt;hi! class=\"\"&gt;&lt;/hi!&gt; &lt;/hi!&gt;&gt;\n</hi!>");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
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
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element("hi!");
        boolean boolean36 = element34.hasAttr("hi!");
        org.jsoup.nodes.Element element38 = element34.removeClass("");
        org.jsoup.nodes.Element element40 = element34.tagName("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        boolean boolean42 = element34.hasAttr("hi!");
        org.jsoup.nodes.Node node44 = element34.removeAttr("");
        org.jsoup.nodes.Attributes attributes45 = element34.attributes();
        org.jsoup.parser.Tag tag46 = element34.tag();
        org.jsoup.nodes.Element element49 = new org.jsoup.nodes.Element("hi!");
        boolean boolean51 = element49.hasAttr("hi!");
        org.jsoup.nodes.Element element53 = element49.removeClass("");
        org.jsoup.nodes.Element element55 = element49.tagName("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        boolean boolean57 = element49.hasAttr("hi!");
        org.jsoup.nodes.Node node59 = element49.removeAttr("");
        org.jsoup.nodes.Attributes attributes60 = element49.attributes();
        org.jsoup.nodes.Element element61 = new org.jsoup.nodes.Element(tag46, "<hi!></hi!>", attributes60);
        org.jsoup.nodes.Element element63 = element61.addClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element65 = new org.jsoup.nodes.Element("hi!");
        boolean boolean67 = element65.hasAttr("hi!");
        java.lang.String str68 = element65.toString();
        org.jsoup.nodes.Element element70 = element65.html("hi!");
        org.jsoup.select.Elements elements73 = element70.getElementsByAttributeValueStarting("hi!", "<hi! class=\"\"></hi!>");
        boolean boolean74 = element63.equals((java.lang.Object) "<hi! class=\"\"></hi!>");
        boolean boolean75 = element32.equals((java.lang.Object) "<hi! class=\"\"></hi!>");
        org.jsoup.select.Elements elements76 = element32.siblingElements();
        element32.setBaseUri("<hi! class=\"<hi!> <hi! class=&quot;&quot;></hi!> </hi!>\">\n <hi!>\n </hi!>\n</hi!>");
        org.jsoup.nodes.Element element80 = new org.jsoup.nodes.Element("hi!");
        boolean boolean82 = element80.hasAttr("hi!");
        int int83 = element80.siblingIndex();
        org.jsoup.nodes.Node node84 = element80.root();
        org.jsoup.nodes.Element element85 = element80.parent();
        org.jsoup.select.Elements elements87 = element80.getElementsMatchingText("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        boolean boolean89 = element80.hasClass("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.select.Elements elements91 = element80.getElementsContainingText("");
        org.jsoup.nodes.Element element92 = element80.clone();
        java.lang.String str93 = element80.html();
        org.jsoup.nodes.Element element95 = element80.prepend("hi!");
        boolean boolean96 = element32.equals((java.lang.Object) element80);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(textNodeList25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(textNodeList29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>" + "'", str30, "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(attributes60);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "<hi!></hi!>" + "'", str68, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(element70);
        org.junit.Assert.assertNotNull(elements73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(elements76);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertNull(element85);
        org.junit.Assert.assertNotNull(elements87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(elements91);
        org.junit.Assert.assertNotNull(element92);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertNotNull(element95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        java.lang.String str4 = element1.toString();
        org.jsoup.nodes.Element element6 = element1.html("hi!");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.select.Elements elements8 = element1.children();
        boolean boolean9 = element1.hasParent();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<hi!></hi!>" + "'", str4, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        boolean boolean4 = element1.isBlock();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        boolean boolean8 = element6.hasAttr("hi!");
        org.jsoup.nodes.Element element10 = element6.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element6.textNodes();
        org.jsoup.nodes.Element element12 = element1.prependChild((org.jsoup.nodes.Node) element6);
        org.jsoup.select.Elements elements15 = element12.getElementsByAttributeValueEnding("<hi! >\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>", "<hi! class=\"<hi! class=&quot;<hi!></hi!>&quot;></hi!> <<hi!>\n <hi! class=&quot;&quot;></hi!>\n</hi!> class=&quot;&quot;>\n <<hi!>\n <hi! class=&quot;&quot;></hi!>\n</hi!> class=&quot;<hi!></hi!>&quot;></<hi!>\n <hi! class=&quot;&quot;></hi!>\n</hi!>>\n</<hi!>\n <hi! class=&quot;&quot;></hi!>\n</hi!>> <hi!></hi!>\">\n <hi! class=\"\"></hi!>\n</hi!>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Node node5 = element1.root();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.ensureChildNodes();
        org.jsoup.select.Elements elements8 = element1.getElementsByIndexLessThan((int) (byte) 100);
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        boolean boolean12 = element10.hasAttr("hi!");
        java.lang.String str13 = element10.toString();
        org.jsoup.nodes.Node node14 = element10.previousSibling();
        org.jsoup.select.Elements elements15 = element10.getAllElements();
        org.jsoup.nodes.Element element17 = element10.prepend("");
        org.jsoup.nodes.Node node18 = element17.clearAttributes();
        org.jsoup.nodes.Document document19 = node18.ownerDocument();
        org.jsoup.nodes.Element element20 = element1.doClone(node18);
        boolean boolean21 = element20.hasParent();
        org.jsoup.select.Elements elements23 = element20.getElementsContainingText("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<hi!></hi!>" + "'", str13, "<hi!></hi!>");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(document19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.attr("", true);
        org.jsoup.nodes.Element element6 = element1.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element1.parent();
        org.jsoup.select.Elements elements8 = element1.children();
        org.jsoup.nodes.Element element10 = element1.prependElement("&lt;hi! class=\"&lt;hi!&gt;&lt;/hi!&gt;\"&gt;&lt;/hi!&gt;");
        java.lang.String str11 = element10.val();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
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
        org.jsoup.nodes.Element element24 = element14.text("<hi!>\n <hi!></hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Node node25 = element24.unwrap();
        java.lang.String str26 = element24.text();
        java.util.regex.Pattern pattern27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements28 = element24.getElementsMatchingText(pattern27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<hi! class=\"<hi!></hi!>\"></hi!>" + "'", str21, "<hi! class=\"<hi!></hi!>\"></hi!>");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
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
        org.jsoup.select.Elements elements34 = element12.getElementsMatchingText("<hi!></hi!>");
        int int35 = element12.childNodeSize();
        java.lang.String str36 = element12.nodeName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(textNodeList25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(textNodeList29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>" + "'", str30, "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
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
        java.util.Set<java.lang.String> strSet15 = element12.classNames();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<hi! class=\"\"></hi!>" + "'", str14, "<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element5 = element1.removeClass("");
        java.util.regex.Pattern pattern7 = null;
        org.jsoup.select.Elements elements8 = element5.getElementsByAttributeValueMatching("", pattern7);
        org.jsoup.nodes.Element element10 = element5.prependElement("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element15 = element12.attr("", true);
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element15.childNodes;
        java.lang.String str17 = element15.baseUri();
        org.jsoup.nodes.Element element19 = element15.prependElement("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element20 = element10.appendTo(element15);
        org.jsoup.nodes.Element element22 = element20.prepend("<hi! ></hi!>");
        java.lang.String str23 = element20.text();
        org.jsoup.nodes.Node node24 = element20.unwrap();
        org.jsoup.select.Elements elements27 = element20.getElementsByAttributeValue("<hi! >\n &lt;hi!&gt;&lt;/hi!&gt;\n <hi! ></hi!>\n <hi!></hi!>\n</hi!>", "<hi! class=\"\">\n <<hi!>\n hi!\n</hi!>></<hi!>\n hi!\n</hi!>>\n</hi!>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(elements27);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        boolean boolean4 = element1.isBlock();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("<hi!>\n <hi!></hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        int int7 = element1.siblingIndex();
        org.jsoup.select.Evaluator evaluator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = element1.is(evaluator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.attr("", true);
        org.jsoup.nodes.Element element6 = element1.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element8.attr("", true);
        org.jsoup.nodes.Element element13 = element8.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element14 = element1.appendTo(element13);
        boolean boolean16 = element1.hasClass("");
        org.jsoup.nodes.Element element17 = element1.empty();
        org.jsoup.select.Elements elements19 = element17.getElementsByIndexGreaterThan((int) 'a');
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        boolean boolean23 = element21.hasAttr("hi!");
        boolean boolean24 = element21.isBlock();
        int int25 = element21.elementSiblingIndex();
        org.jsoup.nodes.Element element28 = element21.attr("", false);
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element("hi!");
        boolean boolean33 = element31.hasAttr("hi!");
        boolean boolean34 = element31.isBlock();
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element("hi!");
        boolean boolean38 = element36.hasAttr("hi!");
        org.jsoup.nodes.Element element40 = element36.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList41 = element36.textNodes();
        org.jsoup.nodes.Element element42 = element31.prependChild((org.jsoup.nodes.Node) element36);
        org.jsoup.select.Elements elements44 = element31.getElementsMatchingText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList45 = element31.textNodes();
        org.jsoup.nodes.Element element46 = element21.insertChildren((int) (byte) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList45);
        org.jsoup.select.Elements elements47 = element21.children();
        org.jsoup.select.Elements elements49 = element21.getElementsByIndexEquals(0);
        org.jsoup.nodes.Element element51 = new org.jsoup.nodes.Element("hi!");
        boolean boolean53 = element51.hasAttr("hi!");
        boolean boolean54 = element51.isBlock();
        org.jsoup.nodes.Element element56 = new org.jsoup.nodes.Element("hi!");
        boolean boolean58 = element56.hasAttr("hi!");
        org.jsoup.nodes.Element element60 = element56.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList61 = element56.textNodes();
        org.jsoup.nodes.Element element62 = element51.prependChild((org.jsoup.nodes.Node) element56);
        org.jsoup.nodes.Element element65 = element56.attr("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>", true);
        org.jsoup.nodes.Element element66 = element21.appendChild((org.jsoup.nodes.Node) element65);
        org.jsoup.nodes.Element element68 = element65.before("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.select.Elements elements70 = element65.getElementsByClass("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element71 = element17.doClone((org.jsoup.nodes.Node) element65);
        java.util.List<org.jsoup.nodes.Node> nodeList72 = element17.childNodes;
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(textNodeList41);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(textNodeList45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertNotNull(textNodeList61);
        org.junit.Assert.assertNotNull(element62);
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertNotNull(element66);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertNotNull(elements70);
        org.junit.Assert.assertNotNull(element71);
        org.junit.Assert.assertNotNull(nodeList72);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
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
        org.jsoup.select.Elements elements53 = element52.children();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(textNodeList46);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertNotNull(textNodeList50);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(elements53);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        boolean boolean4 = element1.isBlock();
        int int5 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element8 = element1.attr("", false);
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        boolean boolean13 = element11.hasAttr("hi!");
        boolean boolean14 = element11.isBlock();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        boolean boolean18 = element16.hasAttr("hi!");
        org.jsoup.nodes.Element element20 = element16.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList21 = element16.textNodes();
        org.jsoup.nodes.Element element22 = element11.prependChild((org.jsoup.nodes.Node) element16);
        org.jsoup.select.Elements elements24 = element11.getElementsMatchingText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList25 = element11.textNodes();
        org.jsoup.nodes.Element element26 = element1.insertChildren((int) (byte) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList25);
        org.jsoup.select.Elements elements27 = element1.children();
        org.jsoup.select.Elements elements29 = element1.getElementsByIndexEquals(0);
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element("hi!");
        boolean boolean33 = element31.hasAttr("hi!");
        boolean boolean34 = element31.isBlock();
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element("hi!");
        boolean boolean38 = element36.hasAttr("hi!");
        org.jsoup.nodes.Element element40 = element36.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList41 = element36.textNodes();
        org.jsoup.nodes.Element element42 = element31.prependChild((org.jsoup.nodes.Node) element36);
        org.jsoup.nodes.Element element45 = element36.attr("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>", true);
        org.jsoup.nodes.Element element46 = element1.appendChild((org.jsoup.nodes.Node) element45);
        boolean boolean48 = element45.hasClass("<hi!>\n &lt;hi!&gt; &lt;hi! class=\"\"&gt;&lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(textNodeList21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(textNodeList25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(textNodeList41);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element5 = element1.removeClass("");
        java.util.regex.Pattern pattern7 = null;
        org.jsoup.select.Elements elements8 = element5.getElementsByAttributeValueMatching("", pattern7);
        org.jsoup.nodes.Element element10 = element5.prependElement("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element15 = element12.attr("", true);
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element15.childNodes;
        java.lang.String str17 = element15.baseUri();
        org.jsoup.nodes.Element element19 = element15.prependElement("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element20 = element10.appendTo(element15);
        org.jsoup.nodes.Element element22 = element20.prepend("<hi! ></hi!>");
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        boolean boolean26 = element24.hasAttr("hi!");
        int int27 = element24.siblingIndex();
        boolean boolean28 = element24.isBlock();
        org.jsoup.nodes.Element element29 = element24.empty();
        org.jsoup.nodes.Element element31 = element24.tagName("hi!");
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element("hi!");
        boolean boolean35 = element33.hasAttr("hi!");
        org.jsoup.nodes.Element element37 = element33.removeClass("");
        boolean boolean38 = element37.hasParent();
        org.jsoup.nodes.Node node39 = element37.previousSibling();
        org.jsoup.nodes.Node node40 = element37.nextSibling();
        org.jsoup.nodes.Element element41 = element24.doClone(node40);
        org.jsoup.nodes.Element element43 = element24.removeClass("");
        java.util.regex.Pattern pattern45 = null;
        org.jsoup.select.Elements elements46 = element43.getElementsByAttributeValueMatching("<hi!>\n <hi!>\n </hi!>\n <hi! class=\"\"></hi!>\n</hi!>", pattern45);
        org.jsoup.parser.Tag tag47 = element43.tag();
        org.jsoup.nodes.Element element50 = new org.jsoup.nodes.Element("hi!");
        boolean boolean52 = element50.hasAttr("hi!");
        int int53 = element50.siblingIndex();
        org.jsoup.nodes.Node node54 = element50.root();
        org.jsoup.nodes.Element element55 = element50.parent();
        org.jsoup.select.Elements elements57 = element50.getElementsByIndexGreaterThan((int) (byte) -1);
        org.jsoup.select.Elements elements60 = element50.getElementsByAttributeValueNot("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Attributes attributes61 = element50.attributes();
        org.jsoup.nodes.Element element62 = new org.jsoup.nodes.Element(tag47, "", attributes61);
        org.jsoup.select.Elements elements64 = element62.getElementsMatchingText("");
        org.jsoup.nodes.Element element65 = element20.before((org.jsoup.nodes.Node) element62);
        org.jsoup.nodes.Element element67 = element20.toggleClass("hi!");
        org.jsoup.select.NodeFilter nodeFilter68 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node69 = element20.filter(nodeFilter68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNull(element55);
        org.junit.Assert.assertNotNull(elements57);
        org.junit.Assert.assertNotNull(elements60);
        org.junit.Assert.assertNotNull(attributes61);
        org.junit.Assert.assertNotNull(elements64);
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertNotNull(element67);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.attr("", true);
        org.jsoup.nodes.Element element6 = element1.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element8.attr("", true);
        org.jsoup.nodes.Element element13 = element8.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element14 = element1.appendTo(element13);
        boolean boolean16 = element1.hasClass("");
        org.jsoup.nodes.Element element17 = element1.empty();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        boolean boolean21 = element19.hasAttr("hi!");
        int int22 = element19.siblingIndex();
        org.jsoup.nodes.Node node23 = element19.root();
        java.lang.String str24 = element19.id();
        org.jsoup.select.Elements elements27 = element19.getElementsByAttributeValueNot("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = element19.childNodes();
        element17.childNodes = nodeList28;
        element17.nodelistChanged();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(nodeList28);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        boolean boolean4 = element1.isBlock();
        int int5 = element1.elementSiblingIndex();
        java.util.regex.Pattern pattern7 = null;
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("<hi!>\n &lt;\n <hi!></hi!>&gt; \n <hi! value=\"hi!\">\n   &lt;hi!&gt;&lt;/hi!&gt; \n </hi!> \n <!--<hi!-->&gt;\n</hi!>", pattern7);
        boolean boolean9 = element1.hasAttributes();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        int int4 = element1.siblingIndex();
        boolean boolean6 = element1.hasClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element8 = element1.prependElement("<hi!></hi!>");
        org.jsoup.nodes.Node node9 = element8.root();
        org.jsoup.nodes.Element element11 = element8.append("<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>");
        org.jsoup.nodes.Element element12 = element11.parent();
        org.jsoup.nodes.Element element14 = element11.prependElement("<<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>> class=\"\"></<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>>");
        org.jsoup.nodes.Element element16 = element11.prepend("<hi!> <hi! class=\"\"></hi!> <hi!> </hi!> </hi!>");
        java.lang.String str17 = element11.val();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
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
        org.jsoup.select.Elements elements25 = element1.getElementsByAttribute("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.select.Elements elements27 = element1.getElementsByAttribute("<hi!>\n hi!\n</hi!>");
        java.util.regex.Pattern pattern29 = null;
        org.jsoup.select.Elements elements30 = element1.getElementsByAttributeValueMatching("<hi!> <hi! class=\"\"></hi!> <hi!> </hi!> </hi!>", pattern29);
        org.jsoup.nodes.Element element32 = element1.appendText("<hi!></hi!>");
        org.jsoup.select.Elements elements34 = element32.getElementsByIndexGreaterThan((int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(elements34);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
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
        java.lang.String str17 = element1.cssSelector();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList18 = element1.textNodes();
        org.jsoup.nodes.Element element20 = element1.removeClass("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element("hi!");
        boolean boolean24 = element22.hasAttr("hi!");
        int int25 = element22.siblingIndex();
        boolean boolean26 = element22.isBlock();
        org.jsoup.nodes.Element element27 = element22.empty();
        org.jsoup.nodes.Element element29 = element22.tagName("hi!");
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element("hi!");
        boolean boolean33 = element31.hasAttr("hi!");
        org.jsoup.nodes.Element element35 = element31.removeClass("");
        boolean boolean36 = element35.hasParent();
        org.jsoup.nodes.Node node37 = element35.previousSibling();
        org.jsoup.nodes.Node node38 = element35.nextSibling();
        org.jsoup.nodes.Element element39 = element22.doClone(node38);
        org.jsoup.nodes.Element element41 = element22.removeClass("");
        boolean boolean42 = element1.hasSameValue((java.lang.Object) element41);
        boolean boolean43 = element1.hasText();
        org.jsoup.select.Elements elements45 = element1.getElementsMatchingText("<hi!>\n <hi!> \n  <hi! class=\"\"></hi!> \n </hi!>&lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(textNodeList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>" + "'", str16, "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(textNodeList18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(elements45);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
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
        java.lang.String str17 = element1.cssSelector();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList18 = element1.textNodes();
        org.jsoup.nodes.Element element20 = element1.removeClass("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element("hi!");
        boolean boolean24 = element22.hasAttr("hi!");
        int int25 = element22.siblingIndex();
        boolean boolean26 = element22.isBlock();
        org.jsoup.nodes.Element element27 = element22.empty();
        org.jsoup.nodes.Element element29 = element22.tagName("hi!");
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element("hi!");
        boolean boolean33 = element31.hasAttr("hi!");
        org.jsoup.nodes.Element element35 = element31.removeClass("");
        boolean boolean36 = element35.hasParent();
        org.jsoup.nodes.Node node37 = element35.previousSibling();
        org.jsoup.nodes.Node node38 = element35.nextSibling();
        org.jsoup.nodes.Element element39 = element22.doClone(node38);
        org.jsoup.nodes.Element element41 = element22.removeClass("");
        boolean boolean42 = element1.hasSameValue((java.lang.Object) element41);
        java.util.List<org.jsoup.nodes.Node> nodeList43 = element1.siblingNodes();
        java.util.Map<java.lang.String, java.lang.String> strMap44 = element1.dataset();
        org.jsoup.nodes.Element element45 = element1.empty();
        org.jsoup.select.NodeVisitor nodeVisitor46 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node47 = element1.traverse(nodeVisitor46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(textNodeList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>" + "'", str16, "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(textNodeList18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertNotNull(element45);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        int int4 = element1.siblingIndex();
        boolean boolean5 = element1.isBlock();
        org.jsoup.nodes.Element element6 = element1.empty();
        org.jsoup.nodes.Element element8 = element1.tagName("hi!");
        org.jsoup.nodes.Node node9 = element1.previousSibling();
        boolean boolean10 = element1.hasAttributes();
        org.jsoup.nodes.Element element12 = element1.prependElement("hi!");
        org.jsoup.nodes.Element element14 = element12.prepend("&lt;hi! class=\"&lt;hi!&gt;&lt;/hi!&gt;\"&gt;&lt;/hi!&gt;");
        org.jsoup.select.Elements elements16 = element14.getElementsByIndexGreaterThan((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        int int4 = element1.siblingIndex();
        boolean boolean6 = element1.hasClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element8 = element1.prependElement("<hi!></hi!>");
        org.jsoup.nodes.Node node9 = element8.root();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element8.childNodes();
        java.lang.String str11 = element8.ownText();
        boolean boolean12 = element8.hasAttributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element17 = element14.attr("", true);
        org.jsoup.nodes.Element element19 = element14.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element24 = element21.attr("", true);
        org.jsoup.nodes.Element element26 = element21.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element27 = element14.appendTo(element26);
        org.jsoup.nodes.Element element29 = element27.val("hi!");
        java.lang.String str30 = element29.data();
        org.jsoup.nodes.Element element31 = element8.appendChild((org.jsoup.nodes.Node) element29);
        java.util.List<org.jsoup.nodes.Node> nodeList32 = element8.siblingNodes();
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element37 = element34.attr("", true);
        org.jsoup.nodes.Element element39 = element34.appendText("<hi!></hi!>");
        boolean boolean41 = element34.hasClass("<hi!></hi!>");
        org.jsoup.nodes.Element element43 = element34.text("");
        boolean boolean45 = element43.hasClass("<hi! class=\"\"></hi!>");
        java.lang.String str46 = element43.data();
        java.lang.String str47 = element43.data();
        org.jsoup.nodes.Element element48 = element8.appendTo(element43);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(element48);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element1.attr("", true);
        org.jsoup.nodes.Element element6 = element1.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element8.attr("", true);
        org.jsoup.nodes.Element element13 = element8.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element14 = element1.appendTo(element13);
        java.lang.String str15 = element1.outerHtml();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element20 = element17.attr("", true);
        org.jsoup.nodes.Element element22 = element17.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element27 = element24.attr("", true);
        org.jsoup.nodes.Element element29 = element24.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element30 = element17.appendTo(element29);
        boolean boolean31 = element17.hasAttributes();
        org.jsoup.nodes.Element element33 = element17.text("<hi!></hi!>");
        org.jsoup.nodes.Element element35 = new org.jsoup.nodes.Element("hi!");
        boolean boolean37 = element35.hasAttr("hi!");
        boolean boolean38 = element35.isBlock();
        org.jsoup.nodes.Element element40 = new org.jsoup.nodes.Element("hi!");
        boolean boolean42 = element40.hasAttr("hi!");
        org.jsoup.nodes.Element element44 = element40.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList45 = element40.textNodes();
        org.jsoup.nodes.Element element46 = element35.prependChild((org.jsoup.nodes.Node) element40);
        org.jsoup.select.Elements elements48 = element35.getElementsMatchingText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList49 = element35.textNodes();
        java.lang.String str50 = element35.outerHtml();
        java.util.Set<java.lang.String> strSet51 = element35.classNames();
        boolean boolean53 = element35.hasClass("");
        org.jsoup.nodes.Element element55 = new org.jsoup.nodes.Element("hi!");
        boolean boolean57 = element55.hasAttr("hi!");
        boolean boolean58 = element55.isBlock();
        int int59 = element55.elementSiblingIndex();
        org.jsoup.nodes.Element element62 = element55.attr("", false);
        java.lang.String[] strArray64 = new java.lang.String[] { "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet65 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet65, strArray64);
        org.jsoup.nodes.Element element67 = element62.classNames((java.util.Set<java.lang.String>) strSet65);
        java.util.Set<java.lang.String> strSet68 = element62.classNames();
        org.jsoup.nodes.Element element69 = element35.classNames(strSet68);
        org.jsoup.nodes.Element element70 = element17.classNames(strSet68);
        org.jsoup.nodes.Element element71 = element1.classNames(strSet68);
        java.lang.String str72 = element71.className();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<hi! >\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>" + "'", str15, "<hi! >\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(textNodeList45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertNotNull(textNodeList49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>" + "'", str50, "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(element62);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertNotNull(strSet68);
        org.junit.Assert.assertNotNull(element69);
        org.junit.Assert.assertNotNull(element70);
        org.junit.Assert.assertNotNull(element71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "<hi!></hi!>" + "'", str72, "<hi!></hi!>");
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
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
        boolean boolean19 = element16.isBlock();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        boolean boolean23 = element21.hasAttr("hi!");
        org.jsoup.nodes.Element element25 = element21.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList26 = element21.textNodes();
        org.jsoup.nodes.Element element27 = element16.prependChild((org.jsoup.nodes.Node) element21);
        org.jsoup.parser.Tag tag28 = element27.tag();
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element("hi!");
        boolean boolean32 = element30.hasAttr("hi!");
        boolean boolean33 = element30.isBlock();
        org.jsoup.nodes.Element element35 = new org.jsoup.nodes.Element("hi!");
        boolean boolean37 = element35.hasAttr("hi!");
        org.jsoup.nodes.Element element39 = element35.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList40 = element35.textNodes();
        org.jsoup.nodes.Element element41 = element30.prependChild((org.jsoup.nodes.Node) element35);
        org.jsoup.select.Elements elements43 = element30.getElementsMatchingText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList44 = element30.textNodes();
        java.lang.String str45 = element30.outerHtml();
        java.lang.String str46 = element30.cssSelector();
        org.jsoup.nodes.Element element47 = element27.appendChild((org.jsoup.nodes.Node) element30);
        org.jsoup.select.Elements elements49 = element30.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element51 = new org.jsoup.nodes.Element("hi!");
        boolean boolean53 = element51.hasAttr("hi!");
        java.lang.String str54 = element51.toString();
        org.jsoup.select.Elements elements55 = element51.siblingElements();
        org.jsoup.nodes.Node node56 = element51.root();
        org.jsoup.nodes.Element element57 = element51.clone();
        boolean boolean59 = element51.hasClass("hi!");
        org.jsoup.nodes.Element element60 = element30.prependChild((org.jsoup.nodes.Node) element51);
        org.jsoup.nodes.Element element61 = element60.empty();
        org.jsoup.nodes.Attributes attributes62 = element61.attributes();
        org.jsoup.nodes.Element element63 = new org.jsoup.nodes.Element(tag13, "<hi! class=\"\"></hi!>", attributes62);
        boolean boolean64 = element63.hasText();
        org.jsoup.nodes.Element element66 = new org.jsoup.nodes.Element("hi!");
        boolean boolean68 = element66.hasAttr("hi!");
        int int69 = element66.siblingIndex();
        org.jsoup.nodes.Node node70 = element66.root();
        java.lang.String str71 = element66.id();
        java.util.List<org.jsoup.nodes.Node> nodeList72 = element66.childNodes;
        element63.childNodes = nodeList72;
        org.jsoup.select.Elements elements75 = element63.getElementsByAttributeStarting("<hi! ></hi!>");
        org.jsoup.nodes.Element element77 = element63.addClass("&lt;&lt;\n<hi!> \n <hi! class=\"\"></hi!> \n</hi!> class=\"\"&gt; &lt;\n<hi!> \n <hi! class=\"\"></hi!> \n</hi!> class=\"\n<hi!></hi!>\"&gt;\n<!--<hi!--> \n<hi! class=\"\"></hi!> &gt; \n<!--<hi!--> \n<hi! class=\"\"></hi!> &gt;&gt;\n<!--<<hi!--> \n<hi! class=\"\"></hi!>  class=\"\"&gt; &lt;\n<hi!> \n <hi! class=\"\"></hi!> \n</hi!> class=\"\n<hi!></hi!>\"&gt;\n<!--<hi!--> \n<hi! class=\"\"></hi!> &gt; \n<!--<hi!--> \n<hi! class=\"\"></hi!> &gt;&gt;");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(textNodeList26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(textNodeList40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(textNodeList44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>" + "'", str45, "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "<hi!></hi!>" + "'", str54, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements55);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNotNull(attributes62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(nodeList72);
        org.junit.Assert.assertNotNull(elements75);
        org.junit.Assert.assertNotNull(element77);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
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
        org.jsoup.nodes.Element element26 = element22.attr("<hi!>\n <hi!>\n </hi!>\n <hi! class=\"\"></hi!>\n</hi!>", "<hi!>\n <hi!>\n </hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        element22.setBaseUri("<hi! class=\"\">\n &lt;\n <hi!></hi!>&gt; \n <hi! value=\"hi!\">\n   &lt;hi!&gt;&lt;/hi!&gt; \n </hi!> \n <!--<hi!-->&gt;\n</hi!>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element26);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element5 = element1.removeClass("");
        org.jsoup.nodes.Element element7 = element1.tagName("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Node node8 = element7.parentNode();
        int int9 = element7.childNodeSize();
        org.jsoup.select.NodeFilter nodeFilter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = element7.filter(nodeFilter10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
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
        org.jsoup.nodes.Element element57 = element1.empty();
        org.jsoup.nodes.Node node58 = element57.parentNode();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(textNodeList29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(textNodeList33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>" + "'", str34, "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(strSet52);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(nodeList56);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNull(node58);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.select.Elements elements3 = element1.getElementsMatchingText("<hi!>\n <hi! class=\"\"></hi!>\n <hi!>\n </hi!>\n</hi!>");
        java.lang.String str4 = element1.val();
        org.jsoup.select.Elements elements5 = element1.getAllElements();
        java.lang.String str6 = element1.text();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        boolean boolean4 = element1.isBlock();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        boolean boolean8 = element6.hasAttr("hi!");
        org.jsoup.nodes.Element element10 = element6.removeClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element6.textNodes();
        org.jsoup.nodes.Element element12 = element1.prependChild((org.jsoup.nodes.Node) element6);
        boolean boolean14 = element6.hasAttr("hi!");
        org.jsoup.parser.Tag tag15 = element6.tag();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element(tag15, "<hi!>\n</hi!>");
        org.jsoup.select.Elements elements19 = element17.getElementsByClass("&lt;hi! class=\"&lt;hi!&gt;&lt;/hi!&gt;\"&gt;&lt;/hi!&gt;");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean3 = element1.hasAttr("hi!");
        org.jsoup.nodes.Element element5 = element1.removeClass("");
        java.util.regex.Pattern pattern7 = null;
        org.jsoup.select.Elements elements8 = element5.getElementsByAttributeValueMatching("", pattern7);
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        boolean boolean12 = element10.hasAttr("hi!");
        int int13 = element10.siblingIndex();
        boolean boolean15 = element10.hasClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element17 = element10.prependElement("<hi!></hi!>");
        org.jsoup.nodes.Node node18 = element17.root();
        org.jsoup.nodes.Element element19 = element5.doClone((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Element element21 = element19.addClass("<hi!>\n <hi! class=\"\"></hi!>\n <hi!>\n </hi!>\n</hi!>");
        org.jsoup.nodes.Element element23 = element19.appendElement("<hi!>\n <hi!> \n  <hi! class=\"\"></hi!> \n  <hi!> \n  </hi!> \n </hi!>\n</hi!>");
        org.jsoup.nodes.Element element25 = element19.prependText("<hi! <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
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
        boolean boolean64 = element63.hasParent();
        org.jsoup.nodes.Attributes attributes65 = element63.attributes();
        org.jsoup.select.Elements elements68 = element63.getElementsByAttributeValueEnding("<hi!> <hi!></hi!> <hi! class=\"\"></hi!> </hi!>", "<<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"\">\n <<hi!>\n <hi! class=\"\"></hi!>\n</hi!> class=\"<hi!></hi!>\"></<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>\n</<hi!>\n <hi! class=\"\"></hi!>\n</hi!>>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<hi!></hi!>" + "'", str4, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(textNodeList18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(textNodeList32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(textNodeList36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>" + "'", str37, "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "<hi!></hi!>" + "'", str46, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(attributes65);
        org.junit.Assert.assertNotNull(elements68);
    }
}

