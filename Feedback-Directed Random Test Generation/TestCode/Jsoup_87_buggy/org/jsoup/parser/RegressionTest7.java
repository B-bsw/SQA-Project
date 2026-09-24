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
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.canContainBlock();
        boolean boolean3 = tag1.isInline();
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "hi!", attributes5);
        org.jsoup.select.Elements elements8 = element6.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element11 = element6.attr("", "");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element6.textNodes();
        org.jsoup.nodes.Element element14 = element6.tagName("hi!");
        org.jsoup.select.Elements elements15 = element6.siblingElements();
        java.lang.String str17 = element6.attr("<hi!>\n <hi!></hi!>\n</hi!>");
        int int18 = element6.elementSiblingIndex();
        org.jsoup.nodes.Element element20 = element6.toggleClass("<hi! =\"\"></hi!>");
        org.jsoup.nodes.Node node21 = element20.root();
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.canContainBlock();
        boolean boolean25 = tag23.isInline();
        org.jsoup.nodes.Attributes attributes27 = null;
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "hi!", attributes27);
        org.jsoup.select.Elements elements30 = element28.getElementsByAttribute("hi!");
        org.jsoup.nodes.Node node31 = element28.parentNode();
        org.jsoup.select.Elements elements33 = element28.getElementsByIndexEquals((int) '#');
        boolean boolean35 = element28.hasAttr("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element37 = element28.toggleClass("<hi! class=\"\">\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element40 = element28.attr("<hi! =\"<hi!></hi!>\">\n <<hi! class=\"\">\n <hi!></hi!>\n</hi!>></<hi! class=\"\">\n <hi!></hi!>\n</hi!>>\n <hi!></hi!>\n</hi!>", "hi!.hi!");
        org.jsoup.nodes.Element element42 = element40.appendText("<hi! class=\"\"> \n <hi!></hi!> \n</hi!>");
        org.jsoup.nodes.Element element43 = element20.prependChild((org.jsoup.nodes.Node) element40);
        boolean boolean45 = element43.hasAttr("<hi!>\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.canContainBlock();
        boolean boolean3 = tag1.isInline();
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "hi!", attributes5);
        org.jsoup.select.Elements elements8 = element6.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element11 = element6.attr("", "");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element6.textNodes();
        org.jsoup.nodes.Element element14 = element6.tagName("hi!");
        org.jsoup.select.Elements elements16 = element14.getElementsMatchingOwnText("");
        int int17 = element14.elementSiblingIndex();
        org.jsoup.nodes.Node node18 = element14.root();
        org.jsoup.select.Elements elements20 = element14.getElementsMatchingText("hi!");
        org.jsoup.parser.Tag tag22 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean23 = tag22.canContainBlock();
        boolean boolean24 = tag22.isInline();
        org.jsoup.nodes.Attributes attributes26 = null;
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element(tag22, "hi!", attributes26);
        org.jsoup.select.Elements elements29 = element27.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element32 = element27.attr("", "");
        org.jsoup.nodes.Element element34 = element27.addClass("");
        org.jsoup.nodes.Node node35 = element27.nextSibling();
        org.jsoup.nodes.Element element37 = element27.prependText("hi!");
        int int38 = element27.childNodeSize();
        java.lang.String str40 = element27.attr("<hi!></hi!>");
        org.jsoup.nodes.Element element42 = element27.appendText("");
        java.lang.String str43 = element42.nodeName();
        java.lang.String str44 = element42.ownText();
        org.jsoup.nodes.Element element45 = element14.prependChild((org.jsoup.nodes.Node) element42);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder46 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean47 = htmlTreeBuilder46.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder48 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement49 = htmlTreeBuilder48.getFormElement();
        htmlTreeBuilder48.setFosterInserts(true);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState52 = htmlTreeBuilder48.originalState();
        java.util.List<java.lang.String> strList53 = htmlTreeBuilder48.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState54 = org.jsoup.parser.HtmlTreeBuilderState.InCell;
        htmlTreeBuilder48.transition(htmlTreeBuilderState54);
        htmlTreeBuilder46.transition(htmlTreeBuilderState54);
        boolean boolean57 = htmlTreeBuilder46.isFosterInserts();
        boolean boolean58 = htmlTreeBuilder46.isFragmentParsing();
        org.jsoup.nodes.Element element59 = htmlTreeBuilder46.getHeadElement();
        org.jsoup.parser.Tag tag61 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean62 = tag61.canContainBlock();
        boolean boolean63 = tag61.isInline();
        org.jsoup.nodes.Attributes attributes65 = null;
        org.jsoup.nodes.Element element66 = new org.jsoup.nodes.Element(tag61, "hi!", attributes65);
        org.jsoup.select.Elements elements68 = element66.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element71 = element66.attr("", "");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList72 = element66.textNodes();
        org.jsoup.nodes.Element element74 = element66.tagName("hi!");
        org.jsoup.select.Elements elements75 = element66.siblingElements();
        java.lang.String str77 = element66.attr("<hi!>\n <hi!></hi!>\n</hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList78 = element66.childNodesCopy();
        htmlTreeBuilder46.setHeadElement(element66);
        org.jsoup.nodes.Element element80 = element45.appendChild((org.jsoup.nodes.Node) element66);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList81 = element80.textNodes();
        java.lang.String str82 = element80.cssSelector();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(formElement49);
        org.junit.Assert.assertNull(htmlTreeBuilderState52);
        org.junit.Assert.assertNull(strList53);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(element59);
        org.junit.Assert.assertNotNull(tag61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(elements68);
        org.junit.Assert.assertNotNull(element71);
        org.junit.Assert.assertNotNull(textNodeList72);
        org.junit.Assert.assertNotNull(element74);
        org.junit.Assert.assertNotNull(elements75);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(nodeList78);
        org.junit.Assert.assertNotNull(element80);
        org.junit.Assert.assertNotNull(textNodeList81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.canContainBlock();
        boolean boolean3 = tag1.isInline();
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "hi!", attributes5);
        org.jsoup.select.Elements elements8 = element6.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element11 = element6.attr("", "");
        org.jsoup.nodes.Element element13 = element6.addClass("");
        org.jsoup.nodes.Node node14 = element6.nextSibling();
        org.jsoup.nodes.Element element16 = element6.prependText("hi!");
        int int17 = element6.childNodeSize();
        java.lang.String str19 = element6.attr("<hi!></hi!>");
        org.jsoup.nodes.Element element21 = element6.appendText("");
        org.jsoup.nodes.Element element24 = element6.attr("<hi!></hi!>", true);
        java.lang.String str25 = element6.baseUri();
        org.jsoup.parser.Tag tag27 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean28 = tag27.canContainBlock();
        boolean boolean29 = tag27.isInline();
        org.jsoup.nodes.Attributes attributes31 = null;
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element(tag27, "hi!", attributes31);
        org.jsoup.select.Elements elements34 = element32.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element37 = element32.attr("", "");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList38 = element32.textNodes();
        java.lang.String str39 = element32.id();
        org.jsoup.select.Elements elements41 = element32.getElementsByIndexLessThan(1);
        org.jsoup.nodes.Element element42 = element6.appendTo(element32);
        org.jsoup.nodes.Element element43 = element42.shallowClone();
        org.jsoup.parser.Tag tag45 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean46 = tag45.canContainBlock();
        boolean boolean47 = tag45.isInline();
        org.jsoup.nodes.Attributes attributes49 = null;
        org.jsoup.nodes.Element element50 = new org.jsoup.nodes.Element(tag45, "hi!", attributes49);
        org.jsoup.select.Elements elements52 = element50.getElementsMatchingText("");
        org.jsoup.nodes.Element element54 = element50.prependElement("hi!");
        org.jsoup.nodes.Element element56 = element50.text("hi!");
        org.jsoup.nodes.Element element59 = element50.attr("<hi! class=\"\">\n <hi!></hi!>\n</hi!>", false);
        org.jsoup.parser.Tag tag61 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean62 = tag61.canContainBlock();
        boolean boolean63 = tag61.isInline();
        org.jsoup.nodes.Attributes attributes65 = null;
        org.jsoup.nodes.Element element66 = new org.jsoup.nodes.Element(tag61, "hi!", attributes65);
        org.jsoup.select.Elements elements68 = element66.getElementsMatchingText("");
        java.lang.String str69 = element66.data();
        java.lang.String str71 = element66.attr("hi!");
        org.jsoup.select.Elements elements73 = element66.getElementsContainingText("<hi!>\n <hi!></hi!>\n</hi!>");
        java.lang.String str74 = element66.nodeName();
        org.jsoup.nodes.Element element76 = element66.val("\n \n");
        boolean boolean77 = element59.hasSameValue((java.lang.Object) "\n \n");
        org.jsoup.select.Elements elements78 = element59.getAllElements();
        java.lang.String str79 = element59.toString();
        org.jsoup.nodes.Element element80 = element43.prependChild((org.jsoup.nodes.Node) element59);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(textNodeList38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(elements52);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(tag61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(elements68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(elements73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertNotNull(element76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(elements78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "<hi!>\n hi!\n</hi!>" + "'", str79, "<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertNotNull(element80);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.canContainBlock();
        boolean boolean3 = tag1.isInline();
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "hi!", attributes5);
        org.jsoup.select.Elements elements8 = element6.getElementsMatchingText("");
        org.jsoup.nodes.Element element10 = element6.prependElement("hi!");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        org.jsoup.nodes.Element element15 = element6.classNames((java.util.Set<java.lang.String>) strSet13);
        org.jsoup.select.Elements elements17 = element15.getElementsByIndexEquals((int) (short) 100);
        java.lang.String str19 = element15.attr("");
        org.jsoup.nodes.Element element20 = element15.empty();
        int int21 = element15.childNodeSize();
        org.jsoup.nodes.Element element24 = element15.attr("hi!.hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            element15.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.removeFromStack(element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.canContainBlock();
        boolean boolean3 = tag1.isInline();
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "hi!", attributes5);
        org.jsoup.select.Elements elements8 = element6.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element11 = element6.attr("", "");
        org.jsoup.nodes.Element element13 = element6.addClass("");
        org.jsoup.parser.Tag tag15 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean16 = tag15.canContainBlock();
        boolean boolean17 = tag15.isInline();
        org.jsoup.nodes.Attributes attributes19 = null;
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element(tag15, "hi!", attributes19);
        org.jsoup.select.Elements elements22 = element20.getElementsMatchingText("");
        org.jsoup.nodes.Element element23 = element20.parent();
        org.jsoup.nodes.Element element25 = element20.val("hi!");
        org.jsoup.nodes.Element element26 = element13.appendChild((org.jsoup.nodes.Node) element20);
        org.jsoup.nodes.Element element27 = element20.empty();
        org.jsoup.select.Elements elements28 = element20.getAllElements();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements28);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = htmlTreeBuilder0.getFormElement();
        htmlTreeBuilder0.setFosterInserts(true);
        htmlTreeBuilder0.framesetOk(true);
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.canContainBlock();
        boolean boolean10 = tag8.isInline();
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "hi!", attributes12);
        org.jsoup.select.Elements elements15 = element13.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element18 = element13.attr("", "");
        org.jsoup.nodes.Element element20 = element18.getElementById("hi!");
        htmlTreeBuilder0.setHeadElement(element20);
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.generateImpliedEndTags();
        java.lang.String[] strArray24 = org.jsoup.parser.HtmlTreeBuilder.TagSearchList;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose(strArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(formElement1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(element20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "ol", "ul" });
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.canContainBlock();
        boolean boolean3 = tag1.isInline();
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "hi!", attributes5);
        org.jsoup.select.Elements elements8 = element6.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element11 = element6.attr("", "");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element6.textNodes();
        org.jsoup.nodes.Element element14 = element6.tagName("hi!");
        org.jsoup.select.Elements elements16 = element14.getElementsMatchingOwnText("");
        int int17 = element14.elementSiblingIndex();
        org.jsoup.nodes.Node node18 = element14.root();
        org.jsoup.nodes.Node node19 = element14.root();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element21 = element14.wrap("<hi! =\"\" class=\"<hi! =&quot;&quot;></hi!>\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.canContainBlock();
        java.lang.String str3 = tag1.getName();
        boolean boolean4 = tag1.isFormListed();
        boolean boolean5 = tag1.isKnownTag();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = htmlTreeBuilder0.getFormElement();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.canContainBlock();
        boolean boolean10 = tag8.isInline();
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "hi!", attributes12);
        org.jsoup.select.Elements elements15 = element13.getElementsMatchingText("");
        org.jsoup.nodes.Element element17 = element13.prependElement("hi!");
        boolean boolean18 = htmlTreeBuilder0.isSpecial(element17);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.reconstructFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(formElement1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = htmlTreeBuilder0.getFormElement();
        htmlTreeBuilder0.setFosterInserts(true);
        htmlTreeBuilder0.framesetOk(true);
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.canContainBlock();
        boolean boolean10 = tag8.isInline();
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "hi!", attributes12);
        org.jsoup.select.Elements elements15 = element13.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element18 = element13.attr("", "");
        org.jsoup.nodes.Element element20 = element18.getElementById("hi!");
        htmlTreeBuilder0.setHeadElement(element20);
        boolean boolean22 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.FormElement formElement23 = null;
        htmlTreeBuilder0.setFormElement(formElement23);
        java.util.List<java.lang.String> strList25 = htmlTreeBuilder0.getPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToBefore("<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(formElement1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(element20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(strList25);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = htmlTreeBuilder0.getFormElement();
        java.lang.String str2 = htmlTreeBuilder0.getBaseUri();
        boolean boolean3 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.Tag tag5 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean6 = tag5.canContainBlock();
        boolean boolean7 = tag5.isInline();
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag5, "hi!", attributes9);
        org.jsoup.select.Elements elements12 = element10.getElementsMatchingText("");
        org.jsoup.nodes.Element element14 = element10.prependElement("hi!");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.jsoup.nodes.Element element19 = element10.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState20 = org.jsoup.parser.HtmlTreeBuilderState.InCaption;
        boolean boolean21 = element10.hasSameValue((java.lang.Object) htmlTreeBuilderState20);
        boolean boolean22 = htmlTreeBuilder0.isSpecial(element10);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder23 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement24 = htmlTreeBuilder23.getFormElement();
        htmlTreeBuilder23.setFosterInserts(true);
        htmlTreeBuilder23.framesetOk(true);
        boolean boolean29 = htmlTreeBuilder23.isFragmentParsing();
        htmlTreeBuilder23.markInsertionMode();
        org.jsoup.parser.Tag tag32 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean33 = tag32.canContainBlock();
        boolean boolean34 = tag32.isInline();
        org.jsoup.nodes.Attributes attributes36 = null;
        org.jsoup.nodes.Element element37 = new org.jsoup.nodes.Element(tag32, "hi!", attributes36);
        boolean boolean39 = element37.hasClass("");
        boolean boolean40 = htmlTreeBuilder23.isSpecial(element37);
        org.jsoup.parser.Tag tag42 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean43 = tag42.canContainBlock();
        boolean boolean44 = tag42.isInline();
        org.jsoup.nodes.Attributes attributes46 = null;
        org.jsoup.nodes.Element element47 = new org.jsoup.nodes.Element(tag42, "hi!", attributes46);
        org.jsoup.select.Elements elements49 = element47.getElementsMatchingText("");
        org.jsoup.nodes.Element element51 = element47.prependElement("hi!");
        java.lang.String str52 = element47.outerHtml();
        org.jsoup.nodes.Element element54 = element47.append("");
        java.lang.String str56 = element54.attr("hi!");
        org.jsoup.nodes.Attributes attributes57 = element54.attributes();
        org.jsoup.select.Elements elements59 = element54.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements60 = element54.siblingElements();
        org.jsoup.nodes.Element element62 = element54.getElementById("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Document document63 = element54.ownerDocument();
        boolean boolean64 = htmlTreeBuilder23.isSpecial(element54);
        org.jsoup.nodes.Element element66 = new org.jsoup.nodes.Element("<hi!></hi!>");
        org.jsoup.nodes.Element element68 = element66.tagName("<hi! =\"\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertOnStackAfter(element54, element66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(formElement1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(formElement24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "<hi!>\n <hi!></hi!>\n</hi!>" + "'", str52, "<hi!>\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(attributes57);
        org.junit.Assert.assertNotNull(elements59);
        org.junit.Assert.assertNotNull(elements60);
        org.junit.Assert.assertNull(element62);
        org.junit.Assert.assertNull(document63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(element68);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.canContainBlock();
        boolean boolean3 = tag1.isInline();
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "hi!", attributes5);
        java.lang.String str7 = element6.cssSelector();
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean10 = tag9.canContainBlock();
        boolean boolean11 = tag9.isInline();
        org.jsoup.nodes.Attributes attributes13 = null;
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag9, "hi!", attributes13);
        org.jsoup.select.Elements elements16 = element14.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element18 = element14.tagName("hi!");
        org.jsoup.parser.Tag tag19 = element18.tag();
        org.jsoup.parser.Tag tag22 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean23 = tag22.canContainBlock();
        boolean boolean24 = tag22.isInline();
        org.jsoup.nodes.Attributes attributes26 = null;
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element(tag22, "hi!", attributes26);
        org.jsoup.select.Elements elements29 = element27.getElementsMatchingText("");
        org.jsoup.nodes.Element element31 = element27.prependElement("hi!");
        org.jsoup.select.Elements elements33 = element27.getElementsByIndexGreaterThan((int) (byte) -1);
        java.lang.String str34 = element27.text();
        org.jsoup.nodes.Attributes attributes35 = element27.attributes();
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element(tag19, "\n \n", attributes35);
        boolean boolean37 = element6.equals((java.lang.Object) element36);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder38 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement39 = htmlTreeBuilder38.getFormElement();
        htmlTreeBuilder38.setFosterInserts(true);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState42 = htmlTreeBuilder38.originalState();
        htmlTreeBuilder38.framesetOk(false);
        org.jsoup.parser.Tag tag46 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean47 = tag46.canContainBlock();
        boolean boolean48 = tag46.isInline();
        org.jsoup.nodes.Attributes attributes50 = null;
        org.jsoup.nodes.Element element51 = new org.jsoup.nodes.Element(tag46, "hi!", attributes50);
        org.jsoup.select.Elements elements53 = element51.getElementsMatchingText("");
        java.lang.String str54 = element51.data();
        java.lang.String str56 = element51.attr("hi!");
        org.jsoup.select.Elements elements57 = element51.siblingElements();
        org.jsoup.parser.Tag tag60 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean61 = tag60.canContainBlock();
        boolean boolean62 = tag60.isInline();
        org.jsoup.nodes.Attributes attributes64 = null;
        org.jsoup.nodes.Element element65 = new org.jsoup.nodes.Element(tag60, "hi!", attributes64);
        org.jsoup.select.Elements elements67 = element65.getElementsMatchingText("");
        java.lang.String str68 = element65.data();
        java.lang.String str70 = element65.attr("hi!");
        org.jsoup.select.Elements elements71 = element65.siblingElements();
        org.jsoup.nodes.Node[] nodeArray72 = new org.jsoup.nodes.Node[] { element65 };
        org.jsoup.nodes.Element element73 = element51.insertChildren((int) (short) 0, nodeArray72);
        org.jsoup.select.Elements elements76 = element51.getElementsByAttributeValueContaining("<hi!></hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element78 = element51.addClass("");
        org.jsoup.nodes.Element element79 = element51.empty();
        org.jsoup.select.Elements elements80 = element51.parents();
        org.jsoup.select.Elements elements82 = element51.getElementsByIndexEquals((int) (short) 1);
        org.jsoup.nodes.Node node83 = element51.nextSibling();
        htmlTreeBuilder38.maybeSetBaseUri(element51);
        org.jsoup.nodes.Element element85 = element6.prependChild((org.jsoup.nodes.Node) element51);
        org.jsoup.select.Elements elements88 = element6.getElementsByAttributeValueNot("<hi! =\"\" class=\"<hi!>\n <hi!></hi!>\n</hi!>\"></hi!>", "hi!.hi!");
        boolean boolean89 = element6.hasText();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(formElement39);
        org.junit.Assert.assertNull(htmlTreeBuilderState42);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(elements57);
        org.junit.Assert.assertNotNull(tag60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(elements67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(elements71);
        org.junit.Assert.assertNotNull(nodeArray72);
        org.junit.Assert.assertNotNull(element73);
        org.junit.Assert.assertNotNull(elements76);
        org.junit.Assert.assertNotNull(element78);
        org.junit.Assert.assertNotNull(element79);
        org.junit.Assert.assertNotNull(elements80);
        org.junit.Assert.assertNotNull(elements82);
        org.junit.Assert.assertNull(node83);
        org.junit.Assert.assertNotNull(element85);
        org.junit.Assert.assertNotNull(elements88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.canContainBlock();
        boolean boolean3 = tag1.isInline();
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "hi!", attributes5);
        org.jsoup.select.Elements elements8 = element6.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element11 = element6.attr("", "");
        org.jsoup.nodes.Element element13 = element6.addClass("");
        org.jsoup.select.Elements elements15 = element6.getElementsContainingOwnText("");
        java.lang.String str16 = element6.ownText();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.canContainBlock();
        boolean boolean3 = tag1.isInline();
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "hi!", attributes5);
        org.jsoup.select.Elements elements8 = element6.getElementsMatchingText("");
        java.lang.String str9 = element6.data();
        java.lang.String str11 = element6.attr("hi!");
        org.jsoup.select.Elements elements13 = element6.getElementsContainingText("<hi!>\n <hi!></hi!>\n</hi!>");
        java.lang.String str14 = element6.nodeName();
        org.jsoup.nodes.Element element16 = element6.html("hi!");
        java.lang.String str17 = element16.val();
        org.jsoup.nodes.Element element19 = element16.addClass("<hi! =\"<hi!></hi!>\">\n <<hi! class=\"\">\n <hi!></hi!>\n</hi!>></<hi! class=\"\">\n <hi!></hi!>\n</hi!>>\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element19);
    }
}

