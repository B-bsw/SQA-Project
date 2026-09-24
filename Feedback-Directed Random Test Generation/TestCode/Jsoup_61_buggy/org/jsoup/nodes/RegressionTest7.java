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
        org.jsoup.nodes.Element element3 = element1.appendText("");
        java.util.Set<java.lang.String> strSet4 = element3.classNames();
        java.lang.Integer int5 = element3.elementSiblingIndex();
        org.jsoup.nodes.Element element8 = element3.attr("<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>", false);
        java.lang.String str9 = element8.toString();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<hi!>\n</hi!>" + "'", str9, "<hi!>\n</hi!>");
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.baseUri();
        org.jsoup.nodes.Element element4 = element1.html("<hi! hi!.hi!.<hi!></hi!>=\"<hi!></hi!>\" class=\"\">\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        java.util.regex.Pattern pattern5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = element1.getElementsMatchingText(pattern5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        java.lang.String str6 = element3.data();
        java.util.Set<java.lang.String> strSet7 = element3.classNames();
        java.lang.String str8 = element3.data();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
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
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element33 = element31.appendText("");
        int int34 = element33.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList35 = element33.textNodes();
        java.lang.String str36 = element33.data();
        org.jsoup.nodes.Element element38 = element33.html("<hi!></hi!>");
        org.jsoup.nodes.Element element40 = element33.removeClass("<hi! class=\"\"></hi!>");
        boolean boolean41 = element8.hasSameValue((java.lang.Object) element33);
        org.jsoup.nodes.Element element42 = element33.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            int int43 = element42.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "<hi!></hi!>", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(textNodeList35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(element42);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.val("<hi!></hi!>");
        org.jsoup.parser.Tag tag4 = element1.tag();
        org.jsoup.nodes.Attributes attributes5 = element1.attributes();
        java.lang.String str6 = element1.data();
        java.util.Set<java.lang.String> strSet7 = element1.classNames();
        org.jsoup.select.Elements elements10 = element1.getElementsByAttributeValueContaining("hi!", "<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element11 = element1.clone();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str14 = element13.id();
        org.jsoup.nodes.Element element16 = element13.removeClass("");
        java.lang.String str18 = element16.absUrl("hi!");
        java.lang.String str19 = element16.cssSelector();
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element("hi!");
        int int23 = element22.childNodeSize();
        boolean boolean25 = element22.hasClass("hi!");
        java.util.regex.Pattern pattern27 = null;
        org.jsoup.select.Elements elements28 = element22.getElementsByAttributeValueMatching("hi!", pattern27);
        org.jsoup.nodes.Element element30 = element22.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element33 = element22.attr("hi!.hi!.<hi!></hi!>", "<hi!></hi!>");
        org.jsoup.select.Elements elements36 = element22.getElementsByAttributeValueStarting("hi!", "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element37 = element16.insertChildren((int) (short) 0, (java.util.Collection<org.jsoup.nodes.Element>) elements36);
        org.jsoup.nodes.Element element39 = element16.prependText("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str42 = element41.id();
        java.lang.Integer int43 = element41.elementSiblingIndex();
        org.jsoup.nodes.Element element44 = element41.empty();
        java.lang.String str45 = element44.outerHtml();
        org.jsoup.nodes.Element element47 = new org.jsoup.nodes.Element("hi!");
        int int48 = element47.childNodeSize();
        java.lang.String str49 = element47.nodeName();
        org.jsoup.nodes.Element element50 = element44.appendChild((org.jsoup.nodes.Node) element47);
        org.jsoup.select.Elements elements51 = element44.siblingElements();
        org.jsoup.nodes.Element element53 = element44.removeClass("");
        org.jsoup.nodes.Element element54 = element53.previousElementSibling();
        boolean boolean55 = element39.hasSameValue((java.lang.Object) element53);
        org.jsoup.nodes.Element element57 = element39.appendElement("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element59 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element61 = element59.appendText("");
        org.jsoup.nodes.Element element63 = element61.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element65 = element61.toggleClass("");
        org.jsoup.nodes.Attributes attributes66 = element65.attributes();
        org.jsoup.nodes.Node node67 = element65.parentNode();
        java.util.Set<java.lang.String> strSet68 = element65.classNames();
        org.jsoup.nodes.Element element69 = element39.classNames(strSet68);
        boolean boolean70 = element11.equals((java.lang.Object) element39);
        org.jsoup.nodes.Element element71 = element39.parent();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "<hi!></hi!>" + "'", str45, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(elements51);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNull(element54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertNotNull(attributes66);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertNotNull(strSet68);
        org.junit.Assert.assertNotNull(element69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(element71);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.val("<hi!></hi!>");
        org.jsoup.parser.Tag tag4 = element1.tag();
        org.jsoup.nodes.Attributes attributes5 = element1.attributes();
        java.lang.String str6 = element1.data();
        java.util.Set<java.lang.String> strSet7 = element1.classNames();
        org.jsoup.select.Elements elements10 = element1.getElementsByAttributeValueContaining("hi!", "<hi!>\n hi!\n</hi!>");
        boolean boolean11 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements13 = element1.getElementsContainingText("<hi!> <hi!></hi!> </hi!>hi!");
        org.jsoup.nodes.Element element14 = element1.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = element14.before("<hi!>\n hi!.hi!.&lt;hi!&gt;&lt;/hi!&gt;\n</hi!>hi!\n<<hi! class=\"\">\n</hi!>></<hi! class=\"\">\n</hi!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Attributes attributes8 = element7.attributes();
        org.jsoup.select.Elements elements11 = element7.getElementsByAttributeValue("<hi!></hi!>", "<hi!></hi!>");
        java.lang.String str12 = element7.nodeName();
        java.lang.String str13 = element7.baseUri();
        java.util.regex.Pattern pattern14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements15 = element7.getElementsMatchingOwnText(pattern14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        org.jsoup.nodes.Element element8 = element4.append("hi!");
        org.jsoup.nodes.Element element10 = element8.addClass("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str13 = element12.id();
        java.lang.Integer int14 = element12.elementSiblingIndex();
        org.jsoup.nodes.Element element15 = element12.empty();
        java.lang.String str16 = element15.outerHtml();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        int int19 = element18.childNodeSize();
        java.lang.String str20 = element18.nodeName();
        org.jsoup.nodes.Element element21 = element15.appendChild((org.jsoup.nodes.Node) element18);
        org.jsoup.nodes.Element element23 = element18.text("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element24 = element8.prependChild((org.jsoup.nodes.Node) element23);
        org.jsoup.nodes.Element element26 = element8.appendElement("<hi! class=\"\">\n</hi!>");
        org.jsoup.nodes.Node node28 = element8.childNode((int) (byte) 1);
        org.jsoup.nodes.Element element30 = element8.toggleClass("&lt;&lt;hi!&gt; &lt;/hi!&gt;&gt;&lt;/&lt;hi!&gt; &lt;/hi!&gt;&gt;");
        org.jsoup.nodes.Element element33 = element30.attr("<hi! class=\"hi!.hi!.<hi!></hi!>\">\n hi!\n</hi!>", "<hi! hi!.hi!.<hi!></hi!>=\"<hi!></hi!>\" class=\"\">\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<hi!></hi!>" + "'", str16, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element33);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        int int8 = element7.childNodeSize();
        java.lang.String str9 = element7.nodeName();
        org.jsoup.nodes.Element element10 = element4.appendChild((org.jsoup.nodes.Node) element7);
        int int11 = element10.childNodeSize();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str14 = element13.id();
        java.lang.Integer int15 = element13.elementSiblingIndex();
        org.jsoup.nodes.Element element16 = element13.empty();
        java.lang.String str17 = element16.outerHtml();
        org.jsoup.parser.Tag tag18 = element16.tag();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element(tag18, "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element(tag18, "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str26 = element25.id();
        org.jsoup.nodes.Element element28 = element25.removeClass("");
        java.lang.String str30 = element28.absUrl("hi!");
        org.jsoup.nodes.Element element32 = element28.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet33 = element32.classNames();
        org.jsoup.nodes.Element element35 = element32.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Attributes attributes36 = element35.attributes();
        org.jsoup.nodes.Element element37 = new org.jsoup.nodes.Element(tag18, "<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>", attributes36);
        org.jsoup.nodes.Element element38 = element10.prependChild((org.jsoup.nodes.Node) element37);
        java.lang.String str39 = element37.className();
        org.jsoup.nodes.Element element41 = element37.html("<hi! <hi! class=\"<hi!></hi!>\"></hi!>=\"<hi! class=&quot;<hi!></hi!>&quot;></hi!>\"></hi!>");
        java.util.Map<java.lang.String, java.lang.String> strMap42 = element41.dataset();
        org.jsoup.nodes.Element element44 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str45 = element44.id();
        java.lang.Integer int46 = element44.elementSiblingIndex();
        java.lang.String str47 = element44.cssSelector();
        org.jsoup.nodes.Element element48 = element41.after((org.jsoup.nodes.Node) element44);
        boolean boolean49 = element41.isBlock();
        int int50 = element41.childNodeSize();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<hi!></hi!>" + "'", str17, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 5 + "'", int50 == 5);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("hi!", pattern6);
        org.jsoup.nodes.Element element9 = element1.appendText("<hi!></hi!>");
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValueNot("<hi!></hi!>", "<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = element9.wrap("&lt;&lt;hi!&gt; &lt;/hi!&gt;&gt;&lt;/&lt;hi!&gt; &lt;/hi!&gt;&gt;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("hi!", pattern6);
        org.jsoup.nodes.Element element9 = element1.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element12 = element1.attr("hi!.hi!.<hi!></hi!>", "<hi!></hi!>");
        org.jsoup.select.Elements elements15 = element1.getElementsByAttributeValueStarting("hi!", "hi!.hi!.<hi!></hi!>");
        java.util.Set<java.lang.String> strSet16 = element1.classNames();
        java.util.regex.Pattern pattern17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements18 = element1.getElementsMatchingText(pattern17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
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
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str32 = element31.id();
        java.lang.Integer int33 = element31.elementSiblingIndex();
        org.jsoup.nodes.Element element34 = element31.empty();
        java.lang.String str35 = element34.outerHtml();
        org.jsoup.nodes.Element element37 = new org.jsoup.nodes.Element("hi!");
        int int38 = element37.childNodeSize();
        java.lang.String str39 = element37.nodeName();
        org.jsoup.nodes.Element element40 = element34.appendChild((org.jsoup.nodes.Node) element37);
        org.jsoup.nodes.Element element42 = element37.addClass("hi!.hi!.<hi!></hi!>");
        org.jsoup.select.Elements elements44 = element37.getElementsContainingOwnText("<hi!>\n</hi!>");
        java.lang.Integer int45 = element37.elementSiblingIndex();
        org.jsoup.nodes.Element element46 = element29.appendChild((org.jsoup.nodes.Node) element37);
        org.jsoup.nodes.Element element48 = element29.prependText("<hi! class=\"hi!.hi!.<hi!></hi!>\">\n hi!\n</hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<hi!></hi!>" + "'", str35, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element48);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        org.jsoup.parser.Tag tag5 = element4.tag();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str9 = element8.id();
        java.lang.Integer int10 = element8.elementSiblingIndex();
        java.lang.String str11 = element8.className();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList12 = element8.dataNodes();
        org.jsoup.nodes.Element element15 = element8.attr("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element17 = element8.appendElement("hi!");
        org.jsoup.nodes.Attributes attributes18 = element17.attributes();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element(tag5, "<hi!>\n <hi!></hi!>\n</hi!>", attributes18);
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str23 = element22.id();
        java.lang.Integer int24 = element22.elementSiblingIndex();
        java.lang.String str25 = element22.className();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList26 = element22.dataNodes();
        org.jsoup.select.Elements elements28 = element22.getElementsByTag("hi!");
        org.jsoup.parser.Tag tag29 = element22.tag();
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element34 = element32.appendText("");
        org.jsoup.nodes.Element element36 = element34.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element38 = element34.toggleClass("");
        org.jsoup.nodes.Attributes attributes39 = element38.attributes();
        org.jsoup.nodes.Element element40 = new org.jsoup.nodes.Element(tag29, "", attributes39);
        org.jsoup.nodes.Element element43 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str44 = element43.id();
        java.lang.Integer int45 = element43.elementSiblingIndex();
        org.jsoup.nodes.Element element46 = element43.empty();
        java.lang.String str47 = element46.outerHtml();
        org.jsoup.parser.Tag tag48 = element46.tag();
        org.jsoup.nodes.Element element50 = new org.jsoup.nodes.Element(tag48, "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element52 = new org.jsoup.nodes.Element(tag48, "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element55 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str56 = element55.id();
        org.jsoup.nodes.Element element58 = element55.removeClass("");
        java.lang.String str60 = element58.absUrl("hi!");
        org.jsoup.nodes.Element element62 = element58.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet63 = element62.classNames();
        org.jsoup.nodes.Element element65 = element62.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Attributes attributes66 = element65.attributes();
        org.jsoup.nodes.Element element67 = new org.jsoup.nodes.Element(tag48, "<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>", attributes66);
        org.jsoup.nodes.Element element68 = new org.jsoup.nodes.Element(tag29, "<hi!>\n <hi!></hi!>\n</hi!>", attributes66);
        org.jsoup.nodes.Element element69 = new org.jsoup.nodes.Element(tag5, "hi!.hi!.hi!.<hi!></hi!>", attributes66);
        org.jsoup.nodes.Element element71 = new org.jsoup.nodes.Element(tag5, "<hi! class=\"\" value=\"hi!.hi!.<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element73 = new org.jsoup.nodes.Element(tag5, "&lt;&lt;hi!&gt; &lt;/hi!&gt;&gt;&lt;/&lt;hi!&gt; &lt;/hi!&gt;&gt;");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(dataNodeList12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(dataNodeList26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "<hi!></hi!>" + "'", str47, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(element62);
        org.junit.Assert.assertNotNull(strSet63);
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertNotNull(attributes66);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet9 = element8.classNames();
        org.jsoup.nodes.Element element11 = element8.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element13 = element11.html("");
        org.jsoup.nodes.Element element15 = element13.removeClass("<hi!>\n</hi!>");
        java.util.regex.Pattern pattern17 = null;
        org.jsoup.select.Elements elements18 = element15.getElementsByAttributeValueMatching("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>", pattern17);
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element22 = element20.appendText("");
        org.jsoup.nodes.Element element24 = element22.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element26 = element22.toggleClass("");
        org.jsoup.nodes.Element element28 = element22.appendElement("hi!");
        org.jsoup.nodes.Element element29 = element15.appendChild((org.jsoup.nodes.Node) element28);
        org.jsoup.select.Elements elements32 = element29.getElementsByAttributeValueStarting("<hi! class=\"\">&lt;hi!&gt; &lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>", "<hi!>\n <hi!>\n  <hi! class=\"\"> \n  </hi!>\n </hi!>\n</hi!>");
        org.jsoup.nodes.Node node33 = element29.previousSibling();
        org.jsoup.nodes.Element element36 = element29.attr("<hi! <hi!></hi!>=\"hi!.<hi!></hi!>\"></hi!>", "<hi! class=\"\">\n <hi!> \n  <hi! class=\"\"></hi!> \n </hi!>hi!.hi!.hi!.\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(element36);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        boolean boolean6 = element4.hasAttr("hi!.hi!.<hi!></hi!>");
        java.lang.String str7 = element4.data();
        java.lang.String str8 = element4.id();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList9 = element4.dataNodes();
        org.jsoup.nodes.Element element11 = element4.appendElement("<hi! class=\"<hi!></hi!>\"></hi!><hi!> </hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(dataNodeList9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
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
        org.jsoup.nodes.Element element18 = element14.after("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        org.jsoup.select.Elements elements20 = element14.getElementsByTag("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element22 = element14.before("<hi! class=\"\">\n hi!\n</hi!>");
        org.jsoup.nodes.Element element23 = element22.firstElementSibling();
        org.jsoup.nodes.Node node25 = element23.removeAttr("<hi! value=\"<hi!></hi!>\">\n <hi! class=\"\">\n </hi!>\n <hi!>\n  <hi!>\n  </hi!>\n  <hi!></hi!>\n </hi!>\n</hi!>");
        boolean boolean26 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element23);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.val("<hi!></hi!>");
        boolean boolean4 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        int int7 = element6.childNodeSize();
        java.lang.String str8 = element6.nodeName();
        java.lang.String str9 = element6.text();
        org.jsoup.nodes.Element element11 = element6.prepend("hi!.hi!.<hi!></hi!>");
        org.jsoup.select.Elements elements14 = element11.getElementsByAttributeValueStarting("<hi! class=\"\">\n hi!\n</hi!>", "hi!.hi!.<hi!></hi!>");
        org.jsoup.select.Elements elements17 = element11.getElementsByAttributeValueNot("hi!", "<hi! class=\"\">\n &lt;hi! class=\"\"&gt; &lt;/hi!&gt;\n</hi!>");
        org.jsoup.select.Elements elements18 = element11.children();
        org.jsoup.nodes.Element element19 = element11.clone();
        boolean boolean20 = element1.hasSameValue((java.lang.Object) element11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements23 = element1.getElementsByAttributeValueEnding("", "<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
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
        java.lang.String str19 = element18.toString();
        org.jsoup.select.Elements elements21 = element18.getElementsMatchingOwnText("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<hi! class=\"\"></hi!>" + "'", str11, "<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<hi! class=\"<hi!></hi!>\" <hi! class=\"\"></hi!>=\"hi!.hi!.\n<hi!></hi!>\"></hi!>" + "'", str19, "<hi! class=\"<hi!></hi!>\" <hi! class=\"\"></hi!>=\"hi!.hi!.\n<hi!></hi!>\"></hi!>");
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        org.jsoup.nodes.Element element6 = element1.append("hi!.hi!.<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element6.siblingNodes();
        element6.setBaseUri("hi!");
        org.jsoup.nodes.Element element11 = element6.appendText("<hi! class=\"\">\n</hi!>");
        org.jsoup.select.Elements elements14 = element6.getElementsByAttributeValueStarting("<hi! class=\"\">\n hi!\n</hi!>", "<hi! class=\"hi!.hi!.<hi!></hi!>\">\n hi!\n</hi!>");
        java.lang.String str15 = element6.id();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        java.lang.String str4 = element1.className();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList5 = element1.dataNodes();
        org.jsoup.nodes.Element element8 = element1.attr("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element10 = element1.appendElement("hi!");
        org.jsoup.nodes.Attributes attributes11 = element10.attributes();
        org.jsoup.nodes.Element element12 = element10.clone();
        element10.setBaseUri("<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>");
        java.lang.String str15 = element10.baseUri();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(dataNodeList5);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>" + "'", str15, "<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>");
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        java.util.Set<java.lang.String> strSet4 = element3.classNames();
        org.jsoup.nodes.Element element6 = element3.appendElement("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element8 = element6.append("<hi! <hi!>\n <hi!></hi!>\n</hi!>=\"<hi!>\n <hi!></hi!>\n</hi!>\"></hi!>");
        org.jsoup.nodes.Node node10 = element8.removeAttr("<hi! class=\"\">\n <hi!>\n  <hi!></hi!>\n </hi!>\n <hi! class=\"\"> \n  <hi!></hi!>&lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt; \n </hi!>\n</hi!>");
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
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
        org.jsoup.nodes.Element element20 = element15.getElementById("hi!.<hi!></hi!>");
        java.lang.String str21 = element15.className();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements24 = element15.getElementsByAttributeValueContaining("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!.<hi!></hi!>" + "'", str17, "hi!.<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<hi!></hi!>" + "'", str21, "<hi!></hi!>");
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
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
        org.jsoup.select.Elements elements28 = element4.parents();
        java.lang.String str29 = element4.html();
        org.jsoup.nodes.Element element30 = element4.empty();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<hi!></hi!>\n<hi! class=\"\">\n</hi!>" + "'", str29, "<hi!></hi!>\n<hi! class=\"\">\n</hi!>");
        org.junit.Assert.assertNotNull(element30);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        java.lang.String str6 = element3.nodeName();
        org.jsoup.nodes.Node node7 = element3.nextSibling();
        org.jsoup.select.Elements elements9 = element3.getElementsMatchingText("<hi!></hi!>");
        java.lang.String str11 = element3.attr("<hi! class=\"\" value=\"\">\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element12 = element3.nextElementSibling();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(element12);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        org.jsoup.select.Elements elements11 = element8.getElementsByAttributeValueStarting("hi!.hi!.<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element13 = element8.append("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        java.lang.String str14 = element8.outerHtml();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<hi! class=\"\">\n <hi!></hi!>\n <hi! class=\"\">\n   hi!.hi!. \n  <hi!></hi!> \n </hi!>\n</hi!>" + "'", str14, "<hi! class=\"\">\n <hi!></hi!>\n <hi! class=\"\">\n   hi!.hi!. \n  <hi!></hi!> \n </hi!>\n</hi!>");
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        org.jsoup.nodes.Node node5 = element1.parentNode();
        org.jsoup.select.Elements elements7 = element1.getElementsMatchingOwnText("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.select.Elements elements8 = element1.siblingElements();
        org.jsoup.nodes.Element element10 = element1.prependText("<hi!>\n hi!\n</hi!>");
        org.jsoup.select.Elements elements12 = element1.getElementsMatchingOwnText("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element16 = element14.appendText("");
        int int17 = element16.siblingIndex();
        org.jsoup.select.Elements elements19 = element16.getElementsContainingOwnText("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element20 = element1.after((org.jsoup.nodes.Node) element16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        org.jsoup.nodes.Node node5 = element1.parentNode();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element1.dataset();
        org.jsoup.nodes.Attributes attributes7 = element1.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = element1.childNodesCopy();
        org.jsoup.nodes.Element element11 = element1.attr("<hi!>\n hi!\n</hi!>", true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        java.lang.String str6 = element3.data();
        org.jsoup.nodes.Element element8 = element3.html("<hi!></hi!>");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str11 = element10.id();
        org.jsoup.nodes.Element element13 = element10.removeClass("");
        java.lang.String str15 = element13.absUrl("hi!");
        org.jsoup.nodes.Element element17 = element13.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet18 = element17.classNames();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str23 = element22.id();
        org.jsoup.nodes.Element element25 = element22.removeClass("");
        java.lang.String str27 = element25.absUrl("hi!");
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "<hi!></hi!>", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        org.jsoup.nodes.Element element34 = element25.classNames((java.util.Set<java.lang.String>) strSet32);
        org.jsoup.nodes.Element element35 = element20.classNames((java.util.Set<java.lang.String>) strSet32);
        org.jsoup.nodes.Element element36 = element17.classNames((java.util.Set<java.lang.String>) strSet32);
        org.jsoup.nodes.Attributes attributes37 = element17.attributes();
        org.jsoup.nodes.Element element38 = element8.prependChild((org.jsoup.nodes.Node) element17);
        java.lang.String str39 = element17.html();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!", "<hi!></hi!>", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<hi!></hi!>" + "'", str39, "<hi!></hi!>");
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList9 = element8.textNodes();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str13 = element12.id();
        java.lang.Integer int14 = element12.elementSiblingIndex();
        org.jsoup.nodes.Element element15 = element12.empty();
        java.lang.String str16 = element15.outerHtml();
        org.jsoup.select.Elements elements19 = element15.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element23 = element21.appendText("");
        java.util.Set<java.lang.String> strSet24 = element23.classNames();
        org.jsoup.nodes.Element element25 = element15.classNames(strSet24);
        org.jsoup.select.Elements elements27 = element25.getElementsByIndexLessThan((int) (byte) 0);
        org.jsoup.select.Elements elements30 = element25.getElementsByAttributeValue("<<hi!>\n</hi!>></<hi!>\n</hi!>>", "<hi! class=\"\">\n</hi!>");
        org.jsoup.nodes.Element element31 = element8.insertChildren((int) (byte) 0, (java.util.Collection<org.jsoup.nodes.Element>) elements30);
        org.jsoup.nodes.Document document32 = element8.ownerDocument();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(textNodeList9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<hi!></hi!>" + "'", str16, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNull(document32);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
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
        org.jsoup.nodes.Element element29 = element4.text("<hi! class=\"<hi!></hi!>\">\n <hi!></hi!> \n <hi! class=\"\"> \n </hi!>\n</hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(element29);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Attributes attributes8 = element7.attributes();
        org.jsoup.select.Elements elements11 = element7.getElementsByAttributeValue("<hi!></hi!>", "<hi!></hi!>");
        java.lang.String str12 = element7.nodeName();
        java.lang.String str13 = element7.baseUri();
        org.jsoup.nodes.Element element15 = element7.getElementById("<hi!>\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = element15.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(element15);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
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
        org.jsoup.nodes.Element element22 = element15.text("hi!.<hi!.class=\"<hi!></hi!>\"></hi!>");
        java.lang.String str24 = element15.attr("<hi!>\n</hi!>\n<hi!></hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Element element9 = element7.toggleClass("<hi!></hi!>");
        java.lang.String str10 = element9.data();
        org.jsoup.nodes.Element element12 = element9.prepend("<hi!> <hi! class=\"\"></hi!> </hi!>");
        // The following exception was thrown during execution in test generation
        try {
            element9.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element1.id();
        org.jsoup.nodes.Element element6 = element1.clone();
        org.jsoup.nodes.Element element9 = element6.attr("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>", "<<hi!>\n</hi!>></<hi!>\n</hi!>>");
        org.jsoup.nodes.Element element11 = element9.prependText("<hi!></hi!>&lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt;");
        org.jsoup.select.Elements elements14 = element9.getElementsByAttributeValue("<hi!>\n &lt;hi! class=\"\"&gt; &lt;/hi!&gt;\n</hi!>", "<hi! class=\"\">\n &lt;hi! class=\"\"&gt; &lt;/hi!&gt;\n</hi!>");
        org.jsoup.parser.Tag tag15 = element9.tag();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(tag15);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("hi!", pattern6);
        org.jsoup.nodes.Element element9 = element1.appendText("<hi!></hi!>");
        org.jsoup.nodes.Document document10 = element1.ownerDocument();
        org.jsoup.nodes.Element element11 = element1.empty();
        java.lang.String str12 = element1.tagName();
        org.jsoup.select.Elements elements14 = element1.getElementsMatchingText("<hi! class=\"\">\n &lt;hi! class=\"\"&gt; &lt;/hi!&gt;\n</hi!>");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Element element9 = element3.appendElement("hi!");
        java.lang.String str11 = element9.absUrl("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element15 = element13.appendText("");
        int int16 = element15.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element15.textNodes();
        java.lang.String str18 = element15.data();
        java.util.Set<java.lang.String> strSet19 = element15.classNames();
        org.jsoup.nodes.Element element21 = element15.html("<hi! class=\"\">\n</hi!>");
        java.lang.String str22 = element15.baseUri();
        java.lang.String str23 = element15.baseUri();
        java.lang.String str24 = element15.ownText();
        int int25 = element15.siblingIndex();
        org.jsoup.nodes.Element element26 = element9.after((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Element element29 = element26.attr("<hi! class=\"\"></hi!>", "<hi! class=\"<hi!></hi!>\">\n</hi!>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element29);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.className();
        org.jsoup.nodes.Element element4 = element1.prependElement("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element5 = element4.empty();
        org.jsoup.select.Elements elements7 = element4.getElementsByIndexGreaterThan((int) (byte) 0);
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element9.val("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = element9.siblingNodes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element16 = element14.appendText("");
        org.jsoup.nodes.Element element18 = element16.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element20 = element16.toggleClass("");
        org.jsoup.nodes.Element element22 = element20.tagName("hi!");
        boolean boolean23 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element22);
        org.jsoup.nodes.Element element24 = element9.appendChild((org.jsoup.nodes.Node) element22);
        java.lang.String str25 = element22.text();
        java.lang.String str26 = element22.outerHtml();
        org.jsoup.select.Elements elements27 = element22.getAllElements();
        boolean boolean28 = element4.hasSameValue((java.lang.Object) elements27);
        org.jsoup.nodes.Node node29 = element4.nextSibling();
        org.jsoup.select.Elements elements31 = element4.getElementsByIndexGreaterThan((int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<hi! class=\"\">\n</hi!>" + "'", str26, "<hi! class=\"\">\n</hi!>");
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(elements31);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.parser.Tag tag6 = element4.tag();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element(tag6, "hi!.hi!.<hi!></hi!>");
        java.util.Set<java.lang.String> strSet9 = element8.classNames();
        org.jsoup.nodes.Element element11 = element8.prependText("hi!");
        org.jsoup.nodes.Element element13 = element8.removeClass("<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>");
        java.lang.String str14 = element13.outerHtml();
        java.util.regex.Pattern pattern16 = null;
        org.jsoup.select.Elements elements17 = element13.getElementsByAttributeValueMatching("<hi! class=\"<hi! <hi! class=&quot;&quot;>\n</hi!>></hi!>\" value=\"hi!.hi!.<hi!></hi!>\">\n <hi!></hi!>\n</hi!>", pattern16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<hi! class=\"\">\n hi!\n</hi!>" + "'", str14, "<hi! class=\"\">\n hi!\n</hi!>");
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.parser.Tag tag6 = element4.tag();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element(tag6, "<hi!></hi!>");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag6, "<hi! class=\"<hi! class=&quot;&quot;>\n hi!.hi!.\n <hi!></hi!>\n</hi!>\">\n</hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("hi!", pattern6);
        boolean boolean9 = element1.hasClass("<hi!></hi!>");
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str12 = element11.id();
        org.jsoup.nodes.Element element14 = element11.removeClass("");
        java.lang.String str16 = element14.absUrl("hi!");
        org.jsoup.nodes.Element element18 = element14.append("<hi!></hi!>");
        boolean boolean19 = element1.equals((java.lang.Object) element14);
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str22 = element21.id();
        java.lang.Integer int23 = element21.elementSiblingIndex();
        org.jsoup.nodes.Element element24 = element21.empty();
        java.lang.String str25 = element24.outerHtml();
        org.jsoup.parser.Tag tag26 = element24.tag();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag26, "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element(tag26, "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element31 = element30.empty();
        org.jsoup.nodes.Element element33 = element30.append("<hi! class=\"\">\n</hi!>");
        boolean boolean34 = element14.hasSameValue((java.lang.Object) element30);
        org.jsoup.nodes.Element element36 = element30.appendElement("<<hi!></hi!>></<hi!></hi!>>");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<hi!></hi!>" + "'", str25, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element36);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexGreaterThan((int) (short) 0);
        org.jsoup.select.Elements elements10 = element3.getElementsByAttributeValueMatching("hi!", "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element11 = element3.empty();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element15 = element13.prepend("hi!");
        org.jsoup.select.Elements elements17 = element13.getElementsByClass("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element19 = element13.html("<hi!></hi!>");
        org.jsoup.nodes.Attributes attributes20 = element19.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element21 = element3.after((org.jsoup.nodes.Node) element19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNodeList5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(attributes20);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element1.nodeName();
        java.util.Set<java.lang.String> strSet6 = element1.classNames();
        java.lang.String str7 = element1.data();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList6 = element3.textNodes();
        org.jsoup.nodes.Element element8 = element3.text("");
        org.jsoup.select.Elements elements10 = element3.getElementsByIndexEquals(0);
        org.jsoup.select.Elements elements12 = element3.getElementsByAttributeStarting("hi!");
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
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element29 = element27.appendText("");
        int int30 = element29.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList31 = element29.textNodes();
        java.lang.String str32 = element29.data();
        org.jsoup.nodes.Element element33 = element23.prependChild((org.jsoup.nodes.Node) element29);
        java.util.Set<java.lang.String> strSet34 = element33.classNames();
        org.jsoup.nodes.Element element36 = element33.tagName("hi!");
        java.util.Set<java.lang.String> strSet37 = element33.classNames();
        org.jsoup.nodes.Element element38 = element3.classNames(strSet37);
        java.lang.String str39 = element38.toString();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(textNodeList6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<hi!></hi!>" + "'", str18, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(textNodeList31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<hi! class=\"\">\n</hi!>" + "'", str39, "<hi! class=\"\">\n</hi!>");
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        int int8 = element7.childNodeSize();
        java.lang.String str9 = element7.nodeName();
        org.jsoup.nodes.Element element10 = element4.appendChild((org.jsoup.nodes.Node) element7);
        org.jsoup.nodes.Element element12 = element10.val("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element13 = element12.previousElementSibling();
        org.jsoup.nodes.Element element14 = element12.parent();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element10 = element4.append("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.select.Elements elements13 = element10.getElementsByAttributeValueNot("<hi! class=\"\"></hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Node node14 = element10.root();
        org.jsoup.select.Elements elements16 = element10.getElementsMatchingText("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.select.Elements elements18 = element10.getElementsContainingText("<<hi!>\n</hi!>></<hi!>\n</hi!>>");
        org.jsoup.nodes.Element element19 = element10.nextElementSibling();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNull(element19);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
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
        org.jsoup.nodes.Element element35 = element31.tagName("<hi!>\n &lt;hi! class=\"\"&gt; &lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element37 = element31.prependElement("<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>");
        org.jsoup.nodes.Element element40 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str41 = element40.id();
        org.jsoup.nodes.Element element43 = element40.removeClass("");
        element43.setBaseUri("hi!");
        org.jsoup.nodes.Element element47 = element43.append("hi!");
        org.jsoup.nodes.Element element49 = element47.addClass("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element52 = element47.attr("<hi!>\n hi!\n</hi!>", true);
        boolean boolean53 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element52);
        org.jsoup.select.Elements elements54 = element52.getAllElements();
        org.jsoup.nodes.Element element55 = element37.insertChildren(0, (java.util.Collection<org.jsoup.nodes.Element>) elements54);
        org.jsoup.select.Elements elements57 = element37.getElementsByAttributeStarting("<hi!>\n</hi!>\n<hi!></hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<hi!></hi!>" + "'", str12, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>" + "'", str32, "<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(elements54);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNotNull(elements57);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element1.id();
        org.jsoup.nodes.Element element6 = element1.clone();
        org.jsoup.nodes.Element element9 = element6.attr("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>", "<<hi!>\n</hi!>></<hi!>\n</hi!>>");
        org.jsoup.nodes.Element element11 = element9.prependText("<hi!></hi!>&lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt;");
        org.jsoup.select.Elements elements14 = element11.getElementsByAttributeValueStarting("<hi!></hi!>\n<hi! class=\"\">\n</hi!>", "hi!.<hi!></hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
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
        org.jsoup.nodes.Element element22 = element16.val("<hi! class=\"<hi! <hi! class=&quot;&quot;>\n</hi!>></hi!>\" value=\"hi!.hi!.<hi!></hi!>\">\n <hi!></hi!>\n</hi!>");
        int int23 = element16.childNodeSize();
        org.jsoup.nodes.Element element25 = element16.html("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(textNodeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(element25);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
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
        org.jsoup.nodes.Node node22 = element14.removeAttr("<hi!></hi!>");
        boolean boolean24 = element14.hasClass("<hi!> \n <hi!></hi!> \n</hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
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
        java.lang.String str17 = element14.text();
        java.lang.String str18 = element14.outerHtml();
        org.jsoup.select.Elements elements19 = element14.getAllElements();
        org.jsoup.select.Elements elements20 = element14.getAllElements();
        org.jsoup.nodes.Element element22 = element14.removeClass("<hi!> <hi! class=\"\"></hi!> </hi!>");
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str25 = element24.id();
        java.lang.Integer int26 = element24.elementSiblingIndex();
        org.jsoup.nodes.Element element27 = element24.empty();
        java.lang.String str28 = element27.outerHtml();
        org.jsoup.select.Elements elements31 = element27.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element35 = element33.appendText("");
        java.util.Set<java.lang.String> strSet36 = element35.classNames();
        org.jsoup.nodes.Element element37 = element27.classNames(strSet36);
        java.lang.String str38 = element37.baseUri();
        org.jsoup.nodes.Element element39 = element37.clone();
        org.jsoup.nodes.Element element41 = element39.removeClass("");
        org.jsoup.nodes.Element element42 = element14.before((org.jsoup.nodes.Node) element39);
        org.jsoup.nodes.Element element44 = element42.before("<hi! class=\"hi!\">\n <hi!>\n </hi!>\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<hi! class=\"\">\n</hi!>" + "'", str18, "<hi! class=\"\">\n</hi!>");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<hi!></hi!>" + "'", str28, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element44);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        boolean boolean4 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element6 = element1.appendElement("hi!");
        org.jsoup.select.Elements elements9 = element6.getElementsByAttributeValueNot("<hi! class=\"\">\n</hi!>", "hi!.hi!.<hi!></hi!>");
        java.lang.String str10 = element6.toString();
        java.lang.String str11 = element6.ownText();
        org.jsoup.nodes.Element element13 = element6.wrap("hi!");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<hi!></hi!>" + "'", str10, "<hi!></hi!>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(element13);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element1.nodeName();
        org.jsoup.nodes.Element element7 = element1.appendText("<hi! class=\"\"></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList8 = element1.dataNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element1.child((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(dataNodeList8);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexGreaterThan((int) (short) 0);
        org.jsoup.nodes.Element element9 = element3.toggleClass("");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element9.childNodesCopy();
        org.jsoup.nodes.Element element12 = element9.append("hi!.hi!.\n<hi!></hi!>");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str15 = element14.id();
        org.jsoup.nodes.Element element17 = element14.removeClass("");
        element17.setBaseUri("hi!");
        org.jsoup.nodes.Element element21 = element17.append("hi!");
        org.jsoup.nodes.Element element23 = element21.addClass("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str26 = element25.id();
        java.lang.Integer int27 = element25.elementSiblingIndex();
        org.jsoup.nodes.Element element28 = element25.empty();
        java.lang.String str29 = element28.outerHtml();
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element("hi!");
        int int32 = element31.childNodeSize();
        java.lang.String str33 = element31.nodeName();
        org.jsoup.nodes.Element element34 = element28.appendChild((org.jsoup.nodes.Node) element31);
        org.jsoup.nodes.Element element36 = element31.text("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element37 = element21.prependChild((org.jsoup.nodes.Node) element36);
        java.lang.String str38 = element37.nodeName();
        org.jsoup.nodes.Element element40 = element37.prependElement("hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element41 = element9.appendChild((org.jsoup.nodes.Node) element40);
        java.lang.String str42 = element41.id();
        java.lang.String str43 = element41.baseUri();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNodeList5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<hi!></hi!>" + "'", str29, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
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
        org.jsoup.nodes.Element element16 = element4.prependElement("<hi! class=\"\">\n hi!\n</hi!>");
        org.jsoup.nodes.Node node17 = element4.parentNode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        java.lang.String str7 = element4.cssSelector();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        int int11 = element10.childNodeSize();
        boolean boolean13 = element10.hasClass("hi!");
        java.util.regex.Pattern pattern15 = null;
        org.jsoup.select.Elements elements16 = element10.getElementsByAttributeValueMatching("hi!", pattern15);
        org.jsoup.nodes.Element element18 = element10.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element21 = element10.attr("hi!.hi!.<hi!></hi!>", "<hi!></hi!>");
        org.jsoup.select.Elements elements24 = element10.getElementsByAttributeValueStarting("hi!", "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element25 = element4.insertChildren((int) (short) 0, (java.util.Collection<org.jsoup.nodes.Element>) elements24);
        java.lang.String str26 = element4.baseUri();
        org.jsoup.nodes.Document document27 = element4.ownerDocument();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(document27);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
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
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str32 = element31.id();
        java.lang.Integer int33 = element31.elementSiblingIndex();
        org.jsoup.nodes.Element element34 = element31.empty();
        java.lang.String str35 = element34.outerHtml();
        org.jsoup.parser.Tag tag36 = element34.tag();
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element(tag36, "hi!.hi!.<hi!></hi!>");
        java.util.Set<java.lang.String> strSet39 = element38.classNames();
        org.jsoup.nodes.Element element41 = element38.prependText("hi!");
        org.jsoup.nodes.Element element43 = element38.removeClass("<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>");
        java.lang.String str44 = element38.baseUri();
        org.jsoup.nodes.Element element46 = element38.prependElement("hi!.hi!.<hi!></hi!>");
        element46.remove();
        boolean boolean48 = element29.hasSameValue((java.lang.Object) element46);
        java.lang.String str49 = element29.cssSelector();
        org.jsoup.nodes.Element element51 = element29.toggleClass("<hi!> <hi!></hi!> </hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node52 = element51.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<hi!></hi!>" + "'", str35, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!.hi!.<hi!></hi!>" + "'", str44, "hi!.hi!.<hi!></hi!>");
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(element51);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
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
        org.jsoup.nodes.Element element18 = element1.prepend("<hi! class=\"hi!.hi!.<hi!></hi!>\"></hi!>");
        java.lang.String str20 = element18.absUrl("<hi!> \n <hi!></hi!> \n</hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dataNodeList15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "<hi!></hi!>", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        org.jsoup.nodes.Element element13 = element4.classNames((java.util.Set<java.lang.String>) strSet11);
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList14 = element13.dataNodes();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element18 = element16.appendText("");
        java.util.Set<java.lang.String> strSet19 = element18.classNames();
        java.lang.Integer int20 = element18.elementSiblingIndex();
        org.jsoup.nodes.Element element21 = element13.appendChild((org.jsoup.nodes.Node) element18);
        org.jsoup.nodes.Element element23 = element18.toggleClass("");
        org.jsoup.nodes.Element element25 = element18.addClass("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.select.Elements elements27 = element18.getElementsByTag("hi!.hi!.");
        org.jsoup.nodes.Node node28 = element18.root();
        java.lang.Integer int29 = element18.elementSiblingIndex();
        org.jsoup.select.Elements elements31 = element18.getElementsMatchingOwnText("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "<hi!></hi!>", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(dataNodeList14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(elements31);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        java.lang.String str6 = element3.nodeName();
        org.jsoup.nodes.Element element8 = element3.text("<hi!></hi!>");
        org.jsoup.select.Elements elements11 = element3.getElementsByAttributeValue("<<hi!>\n</hi!>></<hi!>\n</hi!>>", "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element12 = element3.parent();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNull(element12);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
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
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str19 = element18.id();
        java.lang.Integer int20 = element18.elementSiblingIndex();
        org.jsoup.nodes.Element element21 = element18.empty();
        java.lang.String str22 = element21.outerHtml();
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        int int25 = element24.childNodeSize();
        java.lang.String str26 = element24.nodeName();
        org.jsoup.nodes.Element element27 = element21.appendChild((org.jsoup.nodes.Node) element24);
        org.jsoup.select.Elements elements29 = element27.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element33 = element31.appendText("");
        int int34 = element33.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList35 = element33.textNodes();
        java.lang.String str36 = element33.data();
        org.jsoup.nodes.Element element37 = element27.prependChild((org.jsoup.nodes.Node) element33);
        java.util.Set<java.lang.String> strSet38 = element37.classNames();
        org.jsoup.nodes.Element element39 = element1.appendChild((org.jsoup.nodes.Node) element37);
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str42 = element41.id();
        org.jsoup.nodes.Element element44 = element41.removeClass("");
        element44.setBaseUri("hi!");
        org.jsoup.nodes.Element element47 = element37.after((org.jsoup.nodes.Node) element44);
        java.util.Map<java.lang.String, java.lang.String> strMap48 = element37.dataset();
        org.jsoup.nodes.Element element50 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str51 = element50.id();
        org.jsoup.nodes.Element element53 = element50.removeClass("");
        org.jsoup.nodes.Element element55 = element53.toggleClass("<hi!></hi!>");
        java.lang.String str56 = element55.toString();
        org.jsoup.nodes.Element element58 = element55.prependElement("<hi!></hi!>");
        element55.setBaseUri("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element62 = element55.appendText("");
        org.jsoup.nodes.Element element64 = element55.toggleClass("<<hi!>\n</hi!> value=\"<hi! class=&quot;&quot;></hi!>\">\n <hi! class=\"\">\n   hi!.hi!. \n  <hi!></hi!> \n </hi!>\n</<hi!>\n</hi!>>");
        boolean boolean65 = element37.hasSameValue((java.lang.Object) element64);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<hi!></hi!>" + "'", str22, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(textNodeList35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(strMap48);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "<hi! class=\"<hi!></hi!>\"></hi!>" + "'", str56, "<hi! class=\"<hi!></hi!>\"></hi!>");
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(element62);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexGreaterThan((int) (short) 0);
        org.jsoup.nodes.Element element9 = element3.toggleClass("");
        org.jsoup.nodes.Document document10 = element3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = element3.childNode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNodeList5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.parser.Tag tag6 = element4.tag();
        org.jsoup.select.Elements elements9 = element4.getElementsByAttributeValueMatching("hi!", "hi!.hi!.<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element4.childNodesCopy();
        org.jsoup.nodes.Element element12 = element4.removeClass("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.val("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = element1.siblingNodes();
        org.jsoup.select.Elements elements6 = element1.getElementsByClass("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element8 = element1.appendElement("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.parser.Tag tag9 = element1.tag();
        org.jsoup.select.Elements elements10 = element1.siblingElements();
        org.jsoup.select.Elements elements12 = element1.getElementsContainingText("<hi! <hi! class=\"<hi!></hi!>\"></hi!>=\"<hi! class=&quot;<hi!></hi!>&quot;></hi!>\"></hi!>");
        org.jsoup.nodes.Node node13 = element1.previousSibling();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        boolean boolean4 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element6 = element1.appendElement("hi!");
        org.jsoup.select.Elements elements9 = element6.getElementsByAttributeValueNot("<hi! class=\"\">\n</hi!>", "hi!.hi!.<hi!></hi!>");
        java.lang.String str10 = element6.toString();
        org.jsoup.nodes.Element element13 = element6.attr("<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>", true);
        java.lang.String str14 = element13.tagName();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<hi!></hi!>" + "'", str10, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
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
        org.jsoup.select.Elements elements29 = element7.getElementsByIndexGreaterThan((int) '#');
        java.util.regex.Pattern pattern31 = null;
        org.jsoup.select.Elements elements32 = element7.getElementsByAttributeValueMatching("<hi! <hi!></hi!>=\"hi!.<hi!></hi!>\"></hi!>", pattern31);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(textNodeList27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(elements32);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.parser.Tag tag6 = element4.tag();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str10 = element9.id();
        org.jsoup.nodes.Element element12 = element9.removeClass("");
        java.lang.String str14 = element12.absUrl("hi!");
        org.jsoup.nodes.Element element16 = element12.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet17 = element16.classNames();
        org.jsoup.nodes.Element element19 = element16.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Attributes attributes20 = element19.attributes();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag6, "<hi! class=\"\"></hi!>", attributes20);
        java.util.Set<java.lang.String> strSet22 = element21.classNames();
        java.util.Set<java.lang.String> strSet23 = element21.classNames();
        boolean boolean24 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element21);
        boolean boolean26 = element21.hasAttr("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        java.lang.String str27 = element21.toString();
        org.jsoup.nodes.Node node28 = element21.nextSibling();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<hi! class=\"\" value=\"hi!.hi!.<hi!></hi!>\"></hi!>" + "'", str27, "<hi! class=\"\" value=\"hi!.hi!.<hi!></hi!>\"></hi!>");
        org.junit.Assert.assertNull(node28);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element12 = element10.appendText("");
        org.jsoup.nodes.Element element14 = element12.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element16 = element12.toggleClass("");
        org.jsoup.nodes.Element element18 = element16.toggleClass("<hi!></hi!>");
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element22 = element20.appendText("");
        int int23 = element22.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList24 = element22.textNodes();
        org.jsoup.nodes.Element element25 = element16.prependChild((org.jsoup.nodes.Node) element22);
        boolean boolean26 = element4.hasSameValue((java.lang.Object) element16);
        java.lang.String str27 = element16.text();
        org.jsoup.nodes.Element element29 = element16.text("hi!.hi!.hi!.<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            element16.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(textNodeList24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(element29);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        org.jsoup.nodes.Element element6 = element4.toggleClass("<hi!></hi!>");
        java.lang.String str7 = element6.toString();
        org.jsoup.nodes.Element element9 = element6.prependElement("<hi!></hi!>");
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str12 = element11.id();
        org.jsoup.nodes.Element element14 = element11.removeClass("");
        element14.setBaseUri("hi!");
        org.jsoup.nodes.Element element18 = element14.append("hi!");
        int int19 = element18.siblingIndex();
        org.jsoup.select.Elements elements20 = element18.siblingElements();
        org.jsoup.nodes.Element element22 = element18.val("hi!.<hi!></hi!>");
        java.lang.String str23 = element18.nodeName();
        org.jsoup.nodes.Element element24 = element6.appendChild((org.jsoup.nodes.Node) element18);
        org.jsoup.nodes.Element element25 = element18.nextElementSibling();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<hi! class=\"<hi!></hi!>\"></hi!>" + "'", str7, "<hi! class=\"<hi!></hi!>\"></hi!>");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNull(element25);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
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
        java.lang.Integer int15 = element13.elementSiblingIndex();
        org.jsoup.nodes.Element element16 = element13.empty();
        java.lang.String str17 = element16.outerHtml();
        org.jsoup.parser.Tag tag18 = element16.tag();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str22 = element21.id();
        org.jsoup.nodes.Element element24 = element21.removeClass("");
        java.lang.String str26 = element24.absUrl("hi!");
        org.jsoup.nodes.Element element28 = element24.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet29 = element28.classNames();
        org.jsoup.nodes.Element element31 = element28.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Attributes attributes32 = element31.attributes();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element(tag18, "<hi! class=\"\"></hi!>", attributes32);
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element(tag6, "<hi!></hi!>", attributes32);
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element38 = element36.val("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList39 = element36.siblingNodes();
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element43 = element41.appendText("");
        org.jsoup.nodes.Element element45 = element43.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element47 = element43.toggleClass("");
        org.jsoup.nodes.Element element49 = element47.tagName("hi!");
        boolean boolean50 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element49);
        org.jsoup.nodes.Element element51 = element36.appendChild((org.jsoup.nodes.Node) element49);
        java.lang.String str52 = element49.text();
        boolean boolean53 = element34.equals((java.lang.Object) element49);
        org.jsoup.select.Elements elements55 = element49.getElementsByIndexGreaterThan(4);
        java.util.List<org.jsoup.nodes.Node> nodeList56 = element49.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<hi!></hi!>" + "'", str17, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(elements55);
        org.junit.Assert.assertNotNull(nodeList56);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
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
        org.jsoup.nodes.Element element31 = element30.parent();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = element31.is("<hi!> \n <hi!></hi!> \n</hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(textNodeList15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<hi!>\n</hi!>" + "'", str17, "<hi!>\n</hi!>");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(dataNodeList23);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNull(element31);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        org.jsoup.nodes.Element element8 = element4.append("hi!");
        org.jsoup.nodes.Element element10 = element8.addClass("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str13 = element12.id();
        java.lang.Integer int14 = element12.elementSiblingIndex();
        org.jsoup.nodes.Element element15 = element12.empty();
        java.lang.String str16 = element15.outerHtml();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        int int19 = element18.childNodeSize();
        java.lang.String str20 = element18.nodeName();
        org.jsoup.nodes.Element element21 = element15.appendChild((org.jsoup.nodes.Node) element18);
        org.jsoup.nodes.Element element23 = element18.text("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element24 = element8.prependChild((org.jsoup.nodes.Node) element23);
        org.jsoup.nodes.Element element25 = element23.lastElementSibling();
        org.jsoup.select.Elements elements27 = element23.getElementsMatchingText("<hi!></hi!>\n<hi! class=\"\">\n</hi!>");
        org.jsoup.select.Elements elements28 = element23.parents();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<hi!></hi!>" + "'", str16, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNull(element25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(elements28);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
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
        org.jsoup.nodes.Element element27 = element25.removeClass("");
        java.lang.String str28 = element25.html();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("hi!", pattern6);
        org.jsoup.nodes.Element element8 = element1.empty();
        org.jsoup.select.Elements elements11 = element1.getElementsByAttributeValueNot("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!>\n</hi!>");
        java.util.Set<java.lang.String> strSet12 = element1.classNames();
        org.jsoup.nodes.Element element14 = element1.removeClass("<hi!>\n hi!\n</hi!>");
        java.lang.String str15 = element1.ownText();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element19 = element17.appendText("");
        java.util.Set<java.lang.String> strSet20 = element19.classNames();
        java.lang.Integer int21 = element19.elementSiblingIndex();
        org.jsoup.nodes.Element element24 = element19.attr("<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>", false);
        org.jsoup.nodes.Element element26 = element19.addClass("<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>");
        org.jsoup.nodes.Element element29 = element26.attr("<hi! <hi! class=\"<hi!></hi!>\"></hi!>=\"<hi! class=&quot;<hi!></hi!>&quot;></hi!>\"></hi!>", "hi!.hi!.<hi!></hi!>");
        java.lang.String str30 = element26.html();
        org.jsoup.nodes.Element element31 = element1.appendChild((org.jsoup.nodes.Node) element26);
        org.jsoup.select.Elements elements34 = element1.getElementsByAttributeValueNot("<hi! class=\"\">\n hi!\n</hi!>", "<hi! class=\"\">\n <hi!> \n </hi!>\n</hi!>");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(elements34);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        java.lang.String str6 = element1.absUrl("<hi! class=\"\">\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element8 = element1.toggleClass("<hi! class=\"\">\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Node node9 = element1.nextSibling();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Attributes attributes8 = element7.attributes();
        org.jsoup.nodes.Node node9 = element7.parentNode();
        org.jsoup.select.Elements elements10 = element7.children();
        org.jsoup.nodes.Element element12 = element7.tagName("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Node node13 = element12.parentNode();
        org.jsoup.select.Elements elements14 = element12.children();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "<hi!></hi!>", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        org.jsoup.nodes.Element element13 = element4.classNames((java.util.Set<java.lang.String>) strSet11);
        org.jsoup.select.Elements elements15 = element4.getElementsContainingOwnText("<hi! <hi! class=\"<hi!></hi!>\"></hi!>=\"<hi! class=&quot;<hi!></hi!>&quot;></hi!>\"></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element4.siblingNodes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "<hi!></hi!>", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Element element9 = element7.toggleClass("<hi!></hi!>");
        java.lang.String str10 = element9.data();
        org.jsoup.nodes.Node node11 = element9.previousSibling();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList6 = element3.textNodes();
        org.jsoup.nodes.Element element8 = element3.text("");
        org.jsoup.select.Elements elements10 = element3.getElementsByIndexEquals(0);
        org.jsoup.select.Elements elements12 = element3.getElementsByAttributeStarting("hi!");
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
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element29 = element27.appendText("");
        int int30 = element29.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList31 = element29.textNodes();
        java.lang.String str32 = element29.data();
        org.jsoup.nodes.Element element33 = element23.prependChild((org.jsoup.nodes.Node) element29);
        java.util.Set<java.lang.String> strSet34 = element33.classNames();
        org.jsoup.nodes.Element element36 = element33.tagName("hi!");
        java.util.Set<java.lang.String> strSet37 = element33.classNames();
        org.jsoup.nodes.Element element38 = element3.classNames(strSet37);
        org.jsoup.select.Elements elements40 = element38.getElementsByAttributeStarting("<hi! class=\"<hi!></hi!>\">\n</hi!>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(textNodeList6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<hi!></hi!>" + "'", str18, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(textNodeList31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(elements40);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
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
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element19 = element17.prepend("hi!");
        java.lang.String str20 = element19.data();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList21 = element19.textNodes();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList22 = element19.dataNodes();
        // The following exception was thrown during execution in test generation
        try {
            element7.replaceWith((org.jsoup.nodes.Node) element19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(textNodeList21);
        org.junit.Assert.assertNotNull(dataNodeList22);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        java.lang.String str6 = element3.nodeName();
        org.jsoup.select.Elements elements8 = element3.getElementsByIndexEquals((int) (byte) 0);
        boolean boolean10 = element3.hasClass("<hi! class=\"hi!.hi!.<hi!></hi!>\">\n hi!\n</hi!>");
        boolean boolean11 = element3.hasText();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList6 = element5.dataNodes();
        org.jsoup.nodes.Attributes attributes7 = element5.attributes();
        org.jsoup.nodes.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = element5.after(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(dataNodeList6);
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        java.lang.String str6 = element3.data();
        org.jsoup.nodes.Node node7 = element3.nextSibling();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str10 = element9.id();
        java.lang.Integer int11 = element9.elementSiblingIndex();
        org.jsoup.nodes.Element element12 = element9.empty();
        java.lang.String str13 = element12.outerHtml();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        int int16 = element15.childNodeSize();
        java.lang.String str17 = element15.nodeName();
        org.jsoup.nodes.Element element18 = element12.appendChild((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element22 = element20.appendText("");
        org.jsoup.nodes.Element element23 = element18.appendChild((org.jsoup.nodes.Node) element20);
        org.jsoup.nodes.Element element25 = element18.addClass("");
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element29 = element27.val("<hi!></hi!>");
        boolean boolean30 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element27);
        org.jsoup.nodes.Element element31 = element18.prependChild((org.jsoup.nodes.Node) element27);
        org.jsoup.nodes.Element element33 = element27.wrap("<hi! class=\"\">\n <hi!></hi!>&lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element35 = element33.append("<hi!>\n <hi!>\n  <hi! class=\"\"> \n  </hi!>\n </hi!>\n</hi!>");
        org.jsoup.nodes.Element element36 = element3.appendChild((org.jsoup.nodes.Node) element33);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<hi!></hi!>" + "'", str13, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element36);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        org.jsoup.nodes.Element element6 = element1.append("hi!.hi!.<hi!></hi!>");
        boolean boolean8 = element6.hasClass("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element10 = element6.appendElement("<hi! class=\"\">&lt;hi!&gt; &lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element12 = element6.html("<hi! class=\"\">&lt;hi!&gt; &lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element14 = element12.val("<hi! class=\"\" value=\"<hi!></hi!>\">\n</hi!>");
        org.jsoup.nodes.Element element16 = element14.addClass("<hi! value=\"<hi!></hi!>\"></hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
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
        org.jsoup.nodes.Element element17 = element13.prepend("<hi!> <hi!></hi!> </hi!>hi!");
        boolean boolean18 = element13.isBlock();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "<hi!></hi!>", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!.hi!.<hi!></hi!>" + "'", str14, "hi!.hi!.<hi!></hi!>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.val("<hi!></hi!>");
        org.jsoup.parser.Tag tag4 = element1.tag();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag4, "");
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element(tag4, "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element10 = element8.append("<hi! class=\"hi!.hi!.<hi!></hi!>\">\n hi!\n</hi!>");
        boolean boolean12 = element10.hasClass("<hi! class=\"<hi!></hi!>\">\n</hi!>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
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
        org.jsoup.nodes.Node node14 = element4.root();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<hi! class=\"\"></hi!>" + "'", str9, "<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<hi! class=\"\"></hi!>" + "'", str13, "<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element17 = element10.appendElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        java.lang.String str4 = element1.className();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList5 = element1.dataNodes();
        org.jsoup.nodes.Element element8 = element1.attr("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        java.lang.String str9 = element8.toString();
        org.jsoup.nodes.Element element12 = element8.attr("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>", "<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>");
        org.jsoup.nodes.Element element14 = element12.prependText("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(dataNodeList5);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<hi! <hi!>\n <hi!></hi!>\n</hi!>=\"<hi!>\n <hi!></hi!>\n</hi!>\"></hi!>" + "'", str9, "<hi! <hi!>\n <hi!></hi!>\n</hi!>=\"<hi!>\n <hi!></hi!>\n</hi!>\"></hi!>");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
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
        org.jsoup.nodes.Element element52 = element8.toggleClass("<hi! <hi! class=\"\">\n</hi!>></hi!>");
        org.jsoup.nodes.Element element54 = element52.prependText("<hi! class=\"\">\n</hi!>");
        org.jsoup.select.Elements elements56 = element52.getElementsByAttribute("<hi! <hi! class=\"\">\n</hi!>></hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<hi!></hi!>" + "'", str30, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertNotNull(strSet47);
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(elements56);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
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
        org.jsoup.select.Elements elements13 = element4.getElementsByTag("<hi!></hi!>");
        org.jsoup.nodes.Element element15 = element4.append("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str18 = element17.id();
        java.lang.Integer int19 = element17.elementSiblingIndex();
        org.jsoup.nodes.Element element20 = element17.empty();
        java.lang.String str21 = element20.outerHtml();
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        int int24 = element23.childNodeSize();
        java.lang.String str25 = element23.nodeName();
        org.jsoup.nodes.Element element26 = element20.appendChild((org.jsoup.nodes.Node) element23);
        org.jsoup.select.Elements elements27 = element20.siblingElements();
        java.lang.String str28 = element20.tagName();
        org.jsoup.nodes.Element element30 = element20.val("<hi!>\n hi!\n</hi!>");
        boolean boolean31 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element20);
        java.lang.String str32 = element20.cssSelector();
        org.jsoup.nodes.Element element35 = element20.attr("<hi! class=\"\"></hi!>", "<hi!>\n hi!.hi!. &lt;hi!&gt;&lt;/hi!&gt;&lt;hi! class=\"\"&gt; &lt;/hi!&gt;\n</hi!>");
        java.util.Set<java.lang.String> strSet36 = element20.classNames();
        org.jsoup.nodes.Element element37 = element4.classNames(strSet36);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<hi!></hi!>" + "'", str21, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNotNull(element37);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.parser.Tag tag6 = element4.tag();
        org.jsoup.select.Elements elements9 = element4.getElementsByAttributeValueMatching("hi!", "hi!.hi!.<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element4.childNodesCopy();
        org.jsoup.nodes.Element element11 = element4.empty();
        org.jsoup.select.Elements elements14 = element4.getElementsByAttributeValueNot("<hi! class=\"\">\n <hi!></hi!>\n <hi! class=\"\">\n   hi!.hi!. \n  <hi!></hi!> \n </hi!>\n</hi!>", "<hi!.hi!.\n<hi!></hi!>></hi!.hi!.\n<hi!></hi!>>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
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
        java.lang.String str21 = element3.html();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList22 = element3.textNodes();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<hi!></hi!>" + "'", str12, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<hi!>\n <hi!></hi!>\n</hi!>" + "'", str21, "<hi!>\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(textNodeList22);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        org.jsoup.nodes.Element element6 = element1.append("hi!.hi!.<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element6.siblingNodes();
        java.lang.String str8 = element6.outerHtml();
        org.jsoup.select.Elements elements9 = element6.children();
        java.lang.String str10 = element6.ownText();
        org.jsoup.parser.Tag tag11 = element6.tag();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str15 = element14.id();
        java.lang.Integer int16 = element14.elementSiblingIndex();
        java.lang.String str17 = element14.className();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList18 = element14.dataNodes();
        org.jsoup.nodes.Element element21 = element14.attr("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element23 = element14.appendElement("hi!");
        org.jsoup.nodes.Attributes attributes24 = element23.attributes();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag11, "<hi!.hi!.></hi!.hi!.>", attributes24);
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element(tag11, "<hi!.hi!.></hi!.hi!.>");
        org.jsoup.parser.Tag tag28 = element27.tag();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList29 = element27.dataNodes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>" + "'", str8, "<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!." + "'", str10, "hi!.hi!.");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(dataNodeList18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(dataNodeList29);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("hi!", pattern6);
        boolean boolean9 = element1.hasClass("<hi!></hi!>");
        org.jsoup.select.Elements elements11 = element1.getElementsByAttribute("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        org.jsoup.select.Elements elements13 = element1.getElementsByClass("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element15 = element1.prependElement("hi!");
        org.jsoup.nodes.Element element17 = element15.prependText("<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>");
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str21 = element20.id();
        java.lang.Integer int22 = element20.elementSiblingIndex();
        org.jsoup.nodes.Element element23 = element20.empty();
        java.lang.String str24 = element20.nodeName();
        org.jsoup.nodes.Element element25 = element20.empty();
        org.jsoup.parser.Tag tag26 = element20.tag();
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str30 = element29.id();
        org.jsoup.nodes.Element element32 = element29.removeClass("");
        java.lang.String str34 = element32.absUrl("hi!");
        org.jsoup.nodes.Element element36 = element32.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet37 = element36.classNames();
        org.jsoup.nodes.Element element39 = element36.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element41 = element39.html("");
        org.jsoup.nodes.Element element43 = element41.removeClass("<hi!>\n</hi!>");
        java.util.regex.Pattern pattern45 = null;
        org.jsoup.select.Elements elements46 = element43.getElementsByAttributeValueMatching("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>", pattern45);
        org.jsoup.nodes.Element element48 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element50 = element48.appendText("");
        org.jsoup.nodes.Element element52 = element50.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element54 = element50.toggleClass("");
        org.jsoup.nodes.Element element56 = element50.appendElement("hi!");
        org.jsoup.nodes.Element element57 = element43.appendChild((org.jsoup.nodes.Node) element56);
        org.jsoup.nodes.Attributes attributes58 = element57.attributes();
        org.jsoup.nodes.Element element59 = new org.jsoup.nodes.Element(tag26, "<hi! class=\"\"></hi!>", attributes58);
        org.jsoup.select.Elements elements61 = element59.getElementsMatchingText("<hi! class=\"\" value=\"<hi!></hi!>\">\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element62 = element15.insertChildren(4, (java.util.Collection<org.jsoup.nodes.Element>) elements61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(attributes58);
        org.junit.Assert.assertNotNull(elements61);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
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
        java.lang.String str16 = element15.cssSelector();
        org.jsoup.nodes.Element element18 = element15.html("<hi! class=\"\" value=\"hi!.hi!.<hi!></hi!>\"></hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<hi! class=\"\"></hi!>" + "'", str11, "<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!.<hi!></hi!>" + "'", str16, "hi!.<hi!></hi!>");
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.val("<hi!></hi!>");
        org.jsoup.parser.Tag tag4 = element1.tag();
        org.jsoup.nodes.Attributes attributes5 = element1.attributes();
        java.lang.String str6 = element1.data();
        java.util.Set<java.lang.String> strSet7 = element1.classNames();
        org.jsoup.nodes.Node node8 = element1.root();
        org.jsoup.nodes.Element element9 = element1.empty();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList10 = element1.textNodes();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(textNodeList10);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        java.lang.String str6 = element3.cssSelector();
        org.jsoup.nodes.Element element8 = element3.addClass("<hi! class=\"\">\n</hi!>");
        org.jsoup.parser.Tag tag9 = element8.tag();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str13 = element12.id();
        org.jsoup.nodes.Element element15 = element12.removeClass("");
        element15.setBaseUri("hi!");
        org.jsoup.select.Elements elements19 = element15.getElementsMatchingText("");
        java.lang.String str20 = element15.toString();
        org.jsoup.nodes.Attributes attributes21 = element15.attributes();
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element(tag9, "<hi! class=\"\">\n <hi!></hi!>&lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>", attributes21);
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element27 = element25.appendText("");
        org.jsoup.nodes.Element element29 = element27.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element31 = element27.toggleClass("");
        org.jsoup.nodes.Element element33 = element31.tagName("hi!");
        org.jsoup.select.Elements elements35 = element31.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element40 = element38.appendText("");
        org.jsoup.nodes.Element element42 = element40.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element44 = element40.toggleClass("");
        org.jsoup.nodes.Element element46 = element44.tagName("hi!");
        org.jsoup.select.Elements elements48 = element44.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element49 = element31.insertChildren((int) (byte) -1, (java.util.Collection<org.jsoup.nodes.Element>) elements48);
        org.jsoup.nodes.Node node50 = element31.nextSibling();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList51 = element31.textNodes();
        org.jsoup.nodes.Element element52 = element31.empty();
        boolean boolean53 = element31.hasText();
        org.jsoup.nodes.Attributes attributes54 = element31.attributes();
        org.jsoup.nodes.Element element55 = new org.jsoup.nodes.Element(tag9, "<hi! <hi! class=\"<hi!></hi!>\"></hi!>=\"<hi! class=&quot;<hi!></hi!>&quot;></hi!>\"></hi!>", attributes54);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<hi! class=\"\"></hi!>" + "'", str20, "<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNotNull(textNodeList51);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(attributes54);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.parser.Tag tag6 = element4.tag();
        java.lang.String str7 = element4.html();
        org.jsoup.select.Elements elements9 = element4.getElementsContainingText("<hi!></hi!>");
        org.jsoup.nodes.Element element11 = element4.html("<hi! class=\"hi!.hi!.<hi!></hi!>\"></hi!>");
        org.jsoup.select.Elements elements14 = element4.getElementsByAttributeValueEnding("<hi! class=\"\">\n <hi!>\n  <hi!></hi!>\n </hi!>\n <hi! class=\"\"> \n  <hi!></hi!>&lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt; \n </hi!>\n</hi!>", "hi!.");
        org.jsoup.nodes.Element element16 = element4.prependText("<hi! class=\"hi!\">\n <hi!>\n </hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element18 = element16.appendText("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
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
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str32 = element31.id();
        java.lang.Integer int33 = element31.elementSiblingIndex();
        org.jsoup.nodes.Element element34 = element31.empty();
        java.lang.String str35 = element34.outerHtml();
        org.jsoup.parser.Tag tag36 = element34.tag();
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element(tag36, "hi!.hi!.<hi!></hi!>");
        java.util.Set<java.lang.String> strSet39 = element38.classNames();
        org.jsoup.nodes.Element element41 = element38.prependText("hi!");
        org.jsoup.nodes.Element element43 = element38.removeClass("<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>");
        java.lang.String str44 = element38.baseUri();
        org.jsoup.nodes.Element element46 = element38.prependElement("hi!.hi!.<hi!></hi!>");
        element46.remove();
        boolean boolean48 = element29.hasSameValue((java.lang.Object) element46);
        java.lang.String str49 = element29.cssSelector();
        org.jsoup.nodes.Element element51 = element29.toggleClass("<hi!> <hi!></hi!> </hi!>");
        org.jsoup.nodes.Element element53 = element29.removeClass("<hi! <hi!>\n <hi!></hi!>\n</hi!>=\"<hi!>\n <hi!></hi!>\n</hi!>\"></hi!>");
        org.jsoup.nodes.Element element55 = element53.appendText("<hi! hi!.hi!.<hi!></hi!>=\"<hi!></hi!>\">\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.select.NodeVisitor nodeVisitor56 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node57 = element53.traverse(nodeVisitor56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<hi!></hi!>" + "'", str35, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!.hi!.<hi!></hi!>" + "'", str44, "hi!.hi!.<hi!></hi!>");
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(element55);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
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
        java.util.List<org.jsoup.nodes.Node> nodeList19 = element14.siblingNodes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(nodeList19);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList3 = element1.childNodesCopy();
        org.jsoup.select.Elements elements5 = element1.getElementsByTag("<hi! class=\"\" value=\"\">\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element8 = element1.attr("<hi! class=\"\">\n hi!\n</hi!>", "<hi! class=\"\" value=\"<hi!.hi!.></hi!.hi!.>\"></hi!>");
        org.jsoup.select.Elements elements10 = element8.getElementsByAttributeStarting("<<hi!>\n <hi!></hi!>\n</hi!>></<hi!>\n <hi!></hi!>\n</hi!>>");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
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
        boolean boolean50 = element4.hasAttr("<hi!></hi!>\n<hi! class=\"\">\n</hi!>");
        boolean boolean51 = element4.isBlock();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<hi! class=\"\"></hi!>" + "'", str9, "<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(textNodeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<hi!></hi!>" + "'", str27, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(textNodeList40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.removeClass("hi!");
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(100);
        java.lang.String str6 = element1.text();
        org.jsoup.nodes.Node node7 = element1.nextSibling();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
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
        org.jsoup.nodes.Element element20 = element14.addClass("");
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element("hi!");
        int int23 = element22.childNodeSize();
        boolean boolean25 = element22.hasClass("hi!");
        java.util.regex.Pattern pattern27 = null;
        org.jsoup.select.Elements elements28 = element22.getElementsByAttributeValueMatching("hi!", pattern27);
        org.jsoup.nodes.Element element30 = element22.appendText("<hi!></hi!>");
        org.jsoup.nodes.Document document31 = element22.ownerDocument();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList32 = element22.dataNodes();
        boolean boolean33 = element14.hasSameValue((java.lang.Object) element22);
        java.lang.String str34 = element14.id();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNull(document31);
        org.junit.Assert.assertNotNull(dataNodeList32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.parser.Tag tag6 = element4.tag();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element(tag6, "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag6, "<<hi!>\n</hi!> value=\"<hi! class=&quot;&quot;></hi!>\">\n <hi! class=\"\">\n   hi!.hi!. \n  <hi!></hi!> \n </hi!>\n</<hi!>\n</hi!>>");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag6, "&lt;hi! &lt;hi! class=\"\"&gt; &lt;/hi!&gt;&gt;&lt;/hi!&gt;");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element10 = element4.addClass("");
        org.jsoup.select.Elements elements12 = element4.getElementsByTag("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str15 = element14.id();
        java.lang.Integer int16 = element14.elementSiblingIndex();
        org.jsoup.nodes.Element element17 = element14.empty();
        java.lang.String str18 = element17.outerHtml();
        org.jsoup.select.Elements elements21 = element17.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element23 = element17.addClass("");
        java.lang.String str24 = element23.toString();
        org.jsoup.select.Elements elements26 = element23.getElementsByAttributeStarting("<hi!>\n</hi!>");
        boolean boolean27 = element4.hasSameValue((java.lang.Object) elements26);
        org.jsoup.nodes.Element element29 = element4.addClass("<<hi!>\n</hi!>></<hi!>\n</hi!>>");
        org.jsoup.select.Elements elements30 = element4.children();
        java.util.Set<java.lang.String> strSet31 = element4.classNames();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = element4.childNodesCopy();
        java.lang.String str34 = element4.absUrl("<hi! <hi!>\n <hi!></hi!>\n</hi!>=\"<hi!>\n <hi!></hi!>\n</hi!>\" <hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>=\"<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>\"></hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<hi!></hi!>" + "'", str18, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<hi! class=\"\"></hi!>" + "'", str24, "<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
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
        boolean boolean18 = element15.isBlock();
        org.jsoup.nodes.Element element19 = element3.prependChild((org.jsoup.nodes.Node) element15);
        org.jsoup.select.Elements elements21 = element15.getElementsByTag("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element22 = element15.empty();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList23 = element22.dataNodes();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<hi!></hi!>" + "'", str10, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(dataNodeList23);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        java.lang.String str3 = element1.nodeName();
        java.lang.String str4 = element1.text();
        org.jsoup.nodes.Element element6 = element1.prepend("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element8.appendText("");
        org.jsoup.nodes.Element element12 = element10.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element14 = element10.toggleClass("");
        org.jsoup.nodes.Element element16 = element14.tagName("hi!");
        org.jsoup.select.Elements elements19 = element16.getElementsByAttributeValueStarting("hi!", "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str22 = element21.id();
        java.lang.Integer int23 = element21.elementSiblingIndex();
        org.jsoup.nodes.Element element24 = element21.empty();
        java.lang.String str25 = element24.outerHtml();
        org.jsoup.parser.Tag tag26 = element24.tag();
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str30 = element29.id();
        org.jsoup.nodes.Element element32 = element29.removeClass("");
        java.lang.String str34 = element32.absUrl("hi!");
        org.jsoup.nodes.Element element36 = element32.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet37 = element36.classNames();
        org.jsoup.nodes.Element element39 = element36.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Attributes attributes40 = element39.attributes();
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element(tag26, "<hi! class=\"\"></hi!>", attributes40);
        java.util.Set<java.lang.String> strSet42 = element41.classNames();
        java.util.Set<java.lang.String> strSet43 = element41.classNames();
        org.jsoup.nodes.Element element44 = element16.classNames(strSet43);
        boolean boolean45 = element1.equals((java.lang.Object) strSet43);
        java.util.List<org.jsoup.nodes.Node> nodeList46 = element1.childNodes();
        org.jsoup.nodes.Element element48 = element1.val("hi!.hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Node node49 = element1.nextSibling();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<hi!></hi!>" + "'", str25, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(attributes40);
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNull(node49);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet9 = element8.classNames();
        org.jsoup.nodes.Element element11 = element8.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element13 = element11.html("");
        org.jsoup.nodes.Node node15 = element13.removeAttr("<hi! class=\"<hi!></hi!>\" <hi! class=\"\"></hi!>=\"hi!.hi!.\n<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element17 = element13.toggleClass("<hi!> \n <hi!></hi!> \n</hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
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
        org.jsoup.nodes.Element element18 = element14.after("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        int int21 = element20.childNodeSize();
        boolean boolean23 = element20.hasClass("hi!");
        java.util.regex.Pattern pattern25 = null;
        org.jsoup.select.Elements elements26 = element20.getElementsByAttributeValueMatching("hi!", pattern25);
        org.jsoup.nodes.Element element28 = element20.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element31 = element20.attr("hi!.hi!.<hi!></hi!>", "<hi!></hi!>");
        org.jsoup.select.Elements elements34 = element20.getElementsByAttributeValueStarting("hi!", "hi!.hi!.<hi!></hi!>");
        java.util.Set<java.lang.String> strSet35 = element20.classNames();
        org.jsoup.nodes.Element element36 = element14.classNames(strSet35);
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element("hi!");
        int int39 = element38.childNodeSize();
        boolean boolean41 = element38.hasClass("hi!");
        java.util.regex.Pattern pattern43 = null;
        org.jsoup.select.Elements elements44 = element38.getElementsByAttributeValueMatching("hi!", pattern43);
        org.jsoup.nodes.Element element46 = element38.appendText("<hi!></hi!>");
        org.jsoup.nodes.Document document47 = element38.ownerDocument();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList48 = element38.dataNodes();
        org.jsoup.select.Elements elements51 = element38.getElementsByAttributeValueContaining("<hi! class=\"\">\n</hi!>", "hi!.hi!.\n<hi!></hi!>");
        org.jsoup.nodes.Element element52 = element14.after((org.jsoup.nodes.Node) element38);
        org.jsoup.nodes.Element element54 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str55 = element54.id();
        java.lang.Integer int56 = element54.elementSiblingIndex();
        org.jsoup.nodes.Element element57 = element54.empty();
        java.lang.String str58 = element57.outerHtml();
        org.jsoup.nodes.Element element60 = new org.jsoup.nodes.Element("hi!");
        int int61 = element60.childNodeSize();
        java.lang.String str62 = element60.nodeName();
        org.jsoup.nodes.Element element63 = element57.appendChild((org.jsoup.nodes.Node) element60);
        org.jsoup.nodes.Element element65 = element57.html("<hi!></hi!>");
        org.jsoup.nodes.Element element67 = element65.removeClass("<hi!></hi!>");
        boolean boolean68 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element67);
        org.jsoup.select.Elements elements71 = element67.getElementsByAttributeValueNot("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!>\n</hi!>");
        org.jsoup.nodes.Element element73 = element67.prependElement("hi!");
        org.jsoup.nodes.Element element75 = element73.before("<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>");
        org.jsoup.nodes.Element element77 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str78 = element77.id();
        java.lang.Integer int79 = element77.elementSiblingIndex();
        org.jsoup.nodes.Element element80 = element77.empty();
        java.lang.String str81 = element80.outerHtml();
        org.jsoup.nodes.Element element83 = new org.jsoup.nodes.Element("hi!");
        int int84 = element83.childNodeSize();
        java.lang.String str85 = element83.nodeName();
        org.jsoup.nodes.Element element86 = element80.appendChild((org.jsoup.nodes.Node) element83);
        org.jsoup.select.Elements elements87 = element80.siblingElements();
        org.jsoup.nodes.Node node88 = element80.parentNode();
        boolean boolean90 = element80.hasAttr("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element91 = element73.before((org.jsoup.nodes.Node) element80);
        element80.remove();
        org.jsoup.nodes.Element element93 = element38.before((org.jsoup.nodes.Node) element80);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNull(document47);
        org.junit.Assert.assertNotNull(dataNodeList48);
        org.junit.Assert.assertNotNull(elements51);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "<hi!></hi!>" + "'", str58, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(elements71);
        org.junit.Assert.assertNotNull(element73);
        org.junit.Assert.assertNotNull(element75);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(element80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "<hi!></hi!>" + "'", str81, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
        org.junit.Assert.assertNotNull(element86);
        org.junit.Assert.assertNotNull(elements87);
        org.junit.Assert.assertNull(node88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(element91);
        org.junit.Assert.assertNotNull(element93);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.parser.Tag tag6 = element4.tag();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str10 = element9.id();
        org.jsoup.nodes.Element element12 = element9.removeClass("");
        java.lang.String str14 = element12.absUrl("hi!");
        org.jsoup.nodes.Element element16 = element12.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet17 = element16.classNames();
        org.jsoup.nodes.Element element19 = element16.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Attributes attributes20 = element19.attributes();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag6, "<hi! class=\"\"></hi!>", attributes20);
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str25 = element24.id();
        java.lang.Integer int26 = element24.elementSiblingIndex();
        org.jsoup.nodes.Element element27 = element24.empty();
        org.jsoup.parser.Tag tag28 = element27.tag();
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str32 = element31.id();
        java.lang.Integer int33 = element31.elementSiblingIndex();
        java.lang.String str34 = element31.className();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList35 = element31.dataNodes();
        org.jsoup.nodes.Element element38 = element31.attr("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element40 = element31.appendElement("hi!");
        org.jsoup.nodes.Attributes attributes41 = element40.attributes();
        org.jsoup.nodes.Element element42 = new org.jsoup.nodes.Element(tag28, "<hi!>\n <hi!></hi!>\n</hi!>", attributes41);
        org.jsoup.nodes.Element element43 = new org.jsoup.nodes.Element(tag6, "hi!.hi!.\n<hi!></hi!>", attributes41);
        org.jsoup.nodes.Element element45 = new org.jsoup.nodes.Element(tag6, "<hi! class=\"<hi! <hi! class=&quot;&quot;>\n</hi!>></hi!>\" value=\"hi!.hi!.<hi!></hi!>\">\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element47 = new org.jsoup.nodes.Element(tag6, "<hi!></hi!>&lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt;");
        org.jsoup.nodes.Attributes attributes48 = element47.attributes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(dataNodeList35);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertNotNull(attributes48);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
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
        boolean boolean17 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element13);
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str20 = element19.id();
        org.jsoup.nodes.Element element22 = element19.removeClass("");
        java.lang.String str24 = element22.absUrl("hi!");
        org.jsoup.nodes.Element element26 = element22.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet27 = element26.classNames();
        org.jsoup.nodes.Element element29 = element26.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.select.Elements elements31 = element29.getElementsMatchingText("");
        org.jsoup.nodes.Element element33 = element29.val("");
        org.jsoup.nodes.Element element34 = element13.after((org.jsoup.nodes.Node) element29);
        org.jsoup.nodes.Element element36 = element13.after("<hi! class=\"\">\n <hi!></hi!>&lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element38 = element36.prependElement("<hi! <hi! class=\"\">\n</hi!>></hi!>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(textNodeList15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element38);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Element element9 = element7.prependElement("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str12 = element11.id();
        java.lang.Integer int13 = element11.elementSiblingIndex();
        org.jsoup.nodes.Element element14 = element11.empty();
        java.lang.String str15 = element14.outerHtml();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        int int18 = element17.childNodeSize();
        java.lang.String str19 = element17.nodeName();
        org.jsoup.nodes.Element element20 = element14.appendChild((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Element element22 = element14.html("<hi!></hi!>");
        org.jsoup.nodes.Element element23 = element14.nextElementSibling();
        org.jsoup.nodes.Element element25 = element14.append("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element26 = element9.appendChild((org.jsoup.nodes.Node) element25);
        org.jsoup.nodes.Element element28 = element9.val("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element30 = element9.after("<hi! class=\"\">\n</hi!>");
        org.jsoup.nodes.Element element32 = element30.prepend("<hi! class=\"\">&lt;hi!&gt; &lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element33 = element32.previousElementSibling();
        org.jsoup.nodes.Element element35 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str36 = element35.id();
        org.jsoup.nodes.Element element38 = element35.removeClass("");
        element38.setBaseUri("hi!");
        java.lang.String str41 = element38.tagName();
        java.lang.String str42 = element38.baseUri();
        java.lang.String str44 = element38.attr("<hi! hi!.hi!.<hi!></hi!>=\"<hi!></hi!>\" class=\"\">\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element46 = new org.jsoup.nodes.Element("hi!");
        int int47 = element46.childNodeSize();
        boolean boolean49 = element46.hasClass("hi!");
        java.util.regex.Pattern pattern51 = null;
        org.jsoup.select.Elements elements52 = element46.getElementsByAttributeValueMatching("hi!", pattern51);
        org.jsoup.nodes.Element element53 = element46.empty();
        org.jsoup.select.Elements elements56 = element46.getElementsByAttributeValueNot("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!>\n</hi!>");
        java.util.Set<java.lang.String> strSet57 = element46.classNames();
        org.jsoup.nodes.Element element59 = element46.html("hi!.<hi!></hi!>");
        org.jsoup.select.Elements elements60 = element46.children();
        org.jsoup.nodes.Element element61 = element38.prependChild((org.jsoup.nodes.Node) element46);
        org.jsoup.nodes.Element element62 = element32.before((org.jsoup.nodes.Node) element61);
        org.jsoup.select.Elements elements64 = element62.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.select.Elements elements66 = element62.getElementsByAttributeStarting("<hi! class=\"\" value=\"hi!.hi!.<hi!></hi!>\"></hi!>");
        java.lang.String str68 = element62.absUrl("<hi! class=\"<hi!></hi!>\" <hi! class=\"\"></hi!>=\"hi!.hi!.\n<hi!></hi!>\"></hi!>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<hi!></hi!>" + "'", str15, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNull(element33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(elements52);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(elements56);
        org.junit.Assert.assertNotNull(strSet57);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(elements60);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNotNull(element62);
        org.junit.Assert.assertNotNull(elements64);
        org.junit.Assert.assertNotNull(elements66);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
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
        org.jsoup.nodes.Element element18 = element14.after("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element19 = element14.lastElementSibling();
        org.jsoup.nodes.Element element20 = element19.firstElementSibling();
        org.jsoup.nodes.Node node21 = element20.unwrap();
        org.jsoup.nodes.Node node22 = element20.root();
        org.jsoup.nodes.Element element24 = element20.text("<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>");
        org.jsoup.nodes.Element element26 = element24.getElementById("hi!.");
        org.jsoup.select.NodeVisitor nodeVisitor27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = element24.traverse(nodeVisitor27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNull(element26);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.removeClass("hi!");
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(100);
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str8 = element7.id();
        java.lang.Integer int9 = element7.elementSiblingIndex();
        org.jsoup.nodes.Element element10 = element7.empty();
        java.lang.String str11 = element10.outerHtml();
        org.jsoup.parser.Tag tag12 = element10.tag();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag12, "hi!.hi!.<hi!></hi!>");
        boolean boolean15 = element1.hasSameValue((java.lang.Object) element14);
        org.jsoup.nodes.Element element17 = element1.html("<hi! <hi!>\n <hi!></hi!>\n</hi!>=\"<hi!>\n <hi!></hi!>\n</hi!>\" <hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>=\"<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>\"></hi!>");
        java.lang.String str18 = element17.className();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<hi!></hi!>" + "'", str11, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        java.lang.String str9 = element3.attr("<hi!></hi!>");
        org.jsoup.nodes.Document document10 = element3.ownerDocument();
        java.lang.String str11 = element3.nodeName();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element15 = element13.appendText("");
        org.jsoup.select.Elements elements17 = element15.getElementsMatchingText("");
        int int18 = element15.childNodeSize();
        org.jsoup.nodes.Element element20 = element15.appendElement("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element22 = element15.text("hi!.hi!.\n<hi!></hi!>");
        org.jsoup.nodes.Element element24 = element22.appendText("<hi! class=\"\">\n</hi!>");
        org.jsoup.nodes.Element element25 = element3.prependChild((org.jsoup.nodes.Node) element22);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements27 = element25.select("<hi! class=\"\">\n <hi!> \n </hi!>\n</hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! class=\"\">? <hi!> ? </hi!>?</hi!>': unexpected token at '<hi! class=\"\">? <hi!> ? </hi!>?</hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Node node6 = element3.parentNode();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = element3.dataset();
        org.jsoup.select.Elements elements9 = element3.getElementsByAttributeStarting("<hi! value=\"<hi!></hi!>\">\n <<hi!>\n <hi!></hi!>\n</hi!>></<hi!>\n <hi!></hi!>\n</hi!>>\n</hi!>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
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
        boolean boolean32 = element7.hasAttr("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element34 = element7.appendElement("<hi!>\n</hi!>");
        boolean boolean36 = element7.hasAttr("hi!.&lt;hi!.class=\"&lt;hi!&gt;&lt;/hi!&gt;\"&gt;&lt;/hi!&gt;");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<hi! class=\"\">\n</hi!>" + "'", str29, "<hi! class=\"\">\n</hi!>");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
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
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element15 = element13.appendText("");
        org.jsoup.nodes.Element element17 = element15.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element19 = element15.toggleClass("");
        org.jsoup.nodes.Attributes attributes20 = element19.attributes();
        org.jsoup.nodes.Node node21 = element19.parentNode();
        org.jsoup.nodes.Element element23 = element19.val("hi!");
        boolean boolean24 = element4.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element28 = element26.val("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = element26.siblingNodes();
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element33 = element31.appendText("");
        org.jsoup.nodes.Element element35 = element33.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element37 = element33.toggleClass("");
        org.jsoup.nodes.Element element39 = element37.tagName("hi!");
        boolean boolean40 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element39);
        org.jsoup.nodes.Element element41 = element26.appendChild((org.jsoup.nodes.Node) element39);
        org.jsoup.nodes.Element element43 = element41.removeClass("hi!.hi!.\n<hi!></hi!>");
        java.util.Set<java.lang.String> strSet44 = element43.classNames();
        org.jsoup.nodes.Element element45 = element4.classNames(strSet44);
        org.jsoup.select.Elements elements46 = element4.children();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(elements46);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
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
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element21 = element19.prepend("hi!");
        org.jsoup.select.Elements elements23 = element19.getElementsByIndexEquals((int) (byte) 100);
        org.jsoup.nodes.Element element24 = element1.insertChildren(0, (java.util.Collection<org.jsoup.nodes.Element>) elements23);
        boolean boolean26 = element1.hasClass("&lt;hi!&gt; &lt;hi! class=\"\"&gt;&lt;/hi!&gt; &lt;/hi!&gt;");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dataNodeList15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Element element9 = element7.tagName("hi!");
        org.jsoup.select.Elements elements11 = element7.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element13 = element7.addClass("<hi!></hi!>");
        java.lang.String str14 = element13.nodeName();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        java.lang.String str7 = element4.cssSelector();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        int int11 = element10.childNodeSize();
        boolean boolean13 = element10.hasClass("hi!");
        java.util.regex.Pattern pattern15 = null;
        org.jsoup.select.Elements elements16 = element10.getElementsByAttributeValueMatching("hi!", pattern15);
        org.jsoup.nodes.Element element18 = element10.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element21 = element10.attr("hi!.hi!.<hi!></hi!>", "<hi!></hi!>");
        org.jsoup.select.Elements elements24 = element10.getElementsByAttributeValueStarting("hi!", "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element25 = element4.insertChildren((int) (short) 0, (java.util.Collection<org.jsoup.nodes.Element>) elements24);
        org.jsoup.nodes.Element element27 = element4.prependText("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str30 = element29.id();
        java.lang.Integer int31 = element29.elementSiblingIndex();
        org.jsoup.nodes.Element element32 = element29.empty();
        java.lang.String str33 = element32.outerHtml();
        org.jsoup.nodes.Element element35 = new org.jsoup.nodes.Element("hi!");
        int int36 = element35.childNodeSize();
        java.lang.String str37 = element35.nodeName();
        org.jsoup.nodes.Element element38 = element32.appendChild((org.jsoup.nodes.Node) element35);
        org.jsoup.select.Elements elements39 = element32.siblingElements();
        org.jsoup.nodes.Element element41 = element32.removeClass("");
        org.jsoup.nodes.Element element42 = element41.previousElementSibling();
        boolean boolean43 = element27.hasSameValue((java.lang.Object) element41);
        org.jsoup.nodes.Element element45 = element27.tagName("<hi! class=\"\">&lt;hi!&gt; &lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element47 = element45.prepend("<hi! value=\"hi!\"></hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<hi!></hi!>" + "'", str33, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNull(element42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element47);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        java.lang.String str6 = element3.cssSelector();
        org.jsoup.nodes.Element element8 = element3.addClass("<hi! class=\"\">\n</hi!>");
        org.jsoup.parser.Tag tag9 = element8.tag();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str13 = element12.id();
        org.jsoup.nodes.Element element15 = element12.removeClass("");
        element15.setBaseUri("hi!");
        org.jsoup.select.Elements elements19 = element15.getElementsMatchingText("");
        java.lang.String str20 = element15.toString();
        org.jsoup.nodes.Attributes attributes21 = element15.attributes();
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element(tag9, "<hi! class=\"\">\n <hi!></hi!>&lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>", attributes21);
        org.jsoup.nodes.Element element24 = element22.toggleClass("<hi! class=\"hi!\">\n <hi!>\n </hi!>\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<hi! class=\"\"></hi!>" + "'", str20, "<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
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
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element33 = element31.val("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet34 = element33.classNames();
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str37 = element36.id();
        java.lang.Integer int38 = element36.elementSiblingIndex();
        org.jsoup.nodes.Element element39 = element36.empty();
        java.lang.String str40 = element39.outerHtml();
        org.jsoup.nodes.Element element42 = new org.jsoup.nodes.Element("hi!");
        int int43 = element42.childNodeSize();
        java.lang.String str44 = element42.nodeName();
        org.jsoup.nodes.Element element45 = element39.appendChild((org.jsoup.nodes.Node) element42);
        org.jsoup.select.Elements elements47 = element45.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element49 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element51 = element49.appendText("");
        int int52 = element51.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList53 = element51.textNodes();
        java.lang.String str54 = element51.data();
        org.jsoup.nodes.Element element55 = element45.prependChild((org.jsoup.nodes.Node) element51);
        java.util.List<org.jsoup.nodes.Node> nodeList56 = element45.siblingNodes();
        org.jsoup.nodes.Element element57 = element33.appendChild((org.jsoup.nodes.Node) element45);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element58 = element29.before((org.jsoup.nodes.Node) element33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "<hi!></hi!>" + "'", str40, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(textNodeList53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNotNull(nodeList56);
        org.junit.Assert.assertNotNull(element57);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.val("<hi!></hi!>");
        org.jsoup.nodes.Element element4 = element3.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = element4.after("<hi! class=\"<hi!></hi!>\"></hi!><hi!> </hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNull(element4);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        org.jsoup.nodes.Element element5 = element1.clone();
        org.jsoup.parser.Tag tag6 = element5.tag();
        org.jsoup.nodes.Element element7 = element5.previousElementSibling();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
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
        org.jsoup.nodes.Element element14 = element10.getElementById("<<hi! value=\"<hi!></hi!>\">\n <hi! class=\"\">\n </hi!>\n <hi!>\n  <hi!>\n  </hi!>\n  <hi!></hi!>\n </hi!>\n</hi!>></<hi! value=\"<hi!></hi!>\">\n <hi! class=\"\">\n </hi!>\n <hi!>\n  <hi!>\n  </hi!>\n  <hi!></hi!>\n </hi!>\n</hi!>>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Element element9 = element7.prependElement("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str12 = element11.id();
        java.lang.Integer int13 = element11.elementSiblingIndex();
        org.jsoup.nodes.Element element14 = element11.empty();
        java.lang.String str15 = element14.outerHtml();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        int int18 = element17.childNodeSize();
        java.lang.String str19 = element17.nodeName();
        org.jsoup.nodes.Element element20 = element14.appendChild((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Element element22 = element14.html("<hi!></hi!>");
        org.jsoup.nodes.Element element23 = element14.nextElementSibling();
        org.jsoup.nodes.Element element25 = element14.append("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element26 = element9.appendChild((org.jsoup.nodes.Node) element25);
        org.jsoup.nodes.Element element28 = element26.toggleClass("hi!.<hi!></hi!>");
        org.jsoup.select.Elements elements30 = element28.getElementsByAttribute("<hi! class=\"<hi! class=&quot;&quot;>\n hi!.hi!.\n <hi!></hi!>\n</hi!>\">\n</hi!>");
        org.jsoup.select.Elements elements33 = element28.getElementsByAttributeValue("<hi! class=\"\">\n <hi! class=\"\"></hi!>\n</hi!>", "<hi! value=\"<hi!></hi!>\">\n <hi! class=\"\">\n </hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<hi!></hi!>" + "'", str15, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements33);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        java.lang.String str7 = element4.cssSelector();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        int int11 = element10.childNodeSize();
        boolean boolean13 = element10.hasClass("hi!");
        java.util.regex.Pattern pattern15 = null;
        org.jsoup.select.Elements elements16 = element10.getElementsByAttributeValueMatching("hi!", pattern15);
        org.jsoup.nodes.Element element18 = element10.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element21 = element10.attr("hi!.hi!.<hi!></hi!>", "<hi!></hi!>");
        org.jsoup.select.Elements elements24 = element10.getElementsByAttributeValueStarting("hi!", "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element25 = element4.insertChildren((int) (short) 0, (java.util.Collection<org.jsoup.nodes.Element>) elements24);
        org.jsoup.nodes.Element element27 = element4.prependText("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str30 = element29.id();
        java.lang.Integer int31 = element29.elementSiblingIndex();
        org.jsoup.nodes.Element element32 = element29.empty();
        java.lang.String str33 = element32.outerHtml();
        org.jsoup.nodes.Element element35 = new org.jsoup.nodes.Element("hi!");
        int int36 = element35.childNodeSize();
        java.lang.String str37 = element35.nodeName();
        org.jsoup.nodes.Element element38 = element32.appendChild((org.jsoup.nodes.Node) element35);
        org.jsoup.select.Elements elements39 = element32.siblingElements();
        org.jsoup.nodes.Element element41 = element32.removeClass("");
        org.jsoup.nodes.Element element42 = element41.previousElementSibling();
        boolean boolean43 = element27.hasSameValue((java.lang.Object) element41);
        org.jsoup.nodes.Element element45 = element27.appendElement("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element47 = element27.appendElement("<hi!>\n <hi!>\n  <hi! class=\"\"> \n  </hi!>\n </hi!>\n</hi!>");
        org.jsoup.nodes.Attributes attributes48 = element47.attributes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<hi!></hi!>" + "'", str33, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNull(element42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(attributes48);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        int int8 = element7.childNodeSize();
        java.lang.String str9 = element7.nodeName();
        org.jsoup.nodes.Element element10 = element4.appendChild((org.jsoup.nodes.Node) element7);
        java.lang.String str12 = element10.absUrl("<hi!></hi!>");
        java.lang.String str13 = element10.data();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        int int16 = element15.childNodeSize();
        boolean boolean18 = element15.hasClass("hi!");
        java.util.regex.Pattern pattern20 = null;
        org.jsoup.select.Elements elements21 = element15.getElementsByAttributeValueMatching("hi!", pattern20);
        org.jsoup.nodes.Element element23 = element15.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element26 = element15.attr("hi!.hi!.<hi!></hi!>", "<hi!></hi!>");
        java.lang.String str27 = element15.data();
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str30 = element29.id();
        org.jsoup.nodes.Element element32 = element29.removeClass("");
        java.lang.String str34 = element32.absUrl("hi!");
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "<hi!></hi!>", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        org.jsoup.nodes.Element element41 = element32.classNames((java.util.Set<java.lang.String>) strSet39);
        org.jsoup.nodes.Element element42 = element15.classNames((java.util.Set<java.lang.String>) strSet39);
        org.jsoup.nodes.Element element43 = element10.classNames((java.util.Set<java.lang.String>) strSet39);
        org.jsoup.nodes.Element element46 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element48 = element46.appendText("");
        org.jsoup.nodes.Element element50 = element48.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element52 = element48.toggleClass("");
        org.jsoup.nodes.Element element54 = element52.tagName("hi!");
        org.jsoup.select.Elements elements56 = element52.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element59 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element61 = element59.appendText("");
        org.jsoup.nodes.Element element63 = element61.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element65 = element61.toggleClass("");
        org.jsoup.nodes.Element element67 = element65.tagName("hi!");
        org.jsoup.select.Elements elements69 = element65.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element70 = element52.insertChildren((int) (byte) -1, (java.util.Collection<org.jsoup.nodes.Element>) elements69);
        org.jsoup.nodes.Element element72 = element52.toggleClass("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element73 = element52.clone();
        org.jsoup.select.Elements elements75 = element52.getElementsByAttribute("<hi! class=\"\"></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList76 = element52.textNodes();
        org.jsoup.select.Elements elements78 = element52.getElementsByIndexGreaterThan(2);
        org.jsoup.nodes.Element element79 = element43.insertChildren((int) (short) 0, (java.util.Collection<org.jsoup.nodes.Element>) elements78);
        org.jsoup.nodes.Attributes attributes80 = element79.attributes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "hi!", "<hi!></hi!>", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(elements56);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertNotNull(elements69);
        org.junit.Assert.assertNotNull(element70);
        org.junit.Assert.assertNotNull(element72);
        org.junit.Assert.assertNotNull(element73);
        org.junit.Assert.assertNotNull(elements75);
        org.junit.Assert.assertNotNull(textNodeList76);
        org.junit.Assert.assertNotNull(elements78);
        org.junit.Assert.assertNotNull(element79);
        org.junit.Assert.assertNotNull(attributes80);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.select.Elements elements5 = element3.getElementsMatchingText("");
        org.jsoup.nodes.Element element7 = element3.prependText("hi!");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element9.appendText("");
        int int12 = element11.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList13 = element11.textNodes();
        java.lang.String str14 = element11.data();
        java.util.Set<java.lang.String> strSet15 = element11.classNames();
        org.jsoup.nodes.Element element16 = element7.classNames(strSet15);
        boolean boolean17 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element7);
        org.jsoup.nodes.Document document18 = element7.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements20 = document18.getElementsByIndexGreaterThan((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(textNodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(document18);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList9 = element8.textNodes();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element11.val("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = element11.siblingNodes();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element18 = element16.appendText("");
        org.jsoup.nodes.Element element20 = element18.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element22 = element18.toggleClass("");
        org.jsoup.nodes.Element element24 = element22.tagName("hi!");
        boolean boolean25 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element24);
        org.jsoup.nodes.Element element26 = element11.appendChild((org.jsoup.nodes.Node) element24);
        org.jsoup.select.Elements elements27 = element26.children();
        java.util.Set<java.lang.String> strSet28 = element26.classNames();
        org.jsoup.select.Elements elements30 = element26.getElementsMatchingText("hi!.hi!.<hi!></hi!>");
        boolean boolean32 = element26.hasClass("<hi!></hi!>");
        org.jsoup.select.Elements elements35 = element26.getElementsByAttributeValueStarting("hi!.hi!.<hi!></hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        boolean boolean36 = element8.hasSameValue((java.lang.Object) elements35);
        org.jsoup.nodes.Element element38 = element8.tagName("hi!.hi!.<hi!></hi!>");
        java.lang.String str39 = element38.nodeName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(textNodeList9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!.hi!.<hi!></hi!>" + "'", str39, "hi!.hi!.<hi!></hi!>");
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        org.jsoup.nodes.Element element5 = element1.clone();
        int int6 = element1.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = element1.is("hi!.hi!.hi!.<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'hi!.hi!.hi!.<hi!></hi!>': unexpected token at '!.hi!.hi!.<hi!></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = element4.empty();
        org.jsoup.nodes.Element element11 = element4.prepend("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element13 = element11.prependElement("<<hi!>\n</hi!>></<hi!>\n</hi!>>");
        org.jsoup.parser.Tag tag14 = element11.tag();
        java.util.Set<java.lang.String> strSet15 = element11.classNames();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element19 = element17.val("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = element17.siblingNodes();
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element24 = element22.appendText("");
        org.jsoup.nodes.Element element26 = element24.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element28 = element24.toggleClass("");
        org.jsoup.nodes.Element element30 = element28.tagName("hi!");
        boolean boolean31 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element30);
        org.jsoup.nodes.Element element32 = element17.appendChild((org.jsoup.nodes.Node) element30);
        org.jsoup.nodes.Element element34 = element30.after("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element("hi!");
        int int37 = element36.childNodeSize();
        boolean boolean39 = element36.hasClass("hi!");
        java.util.regex.Pattern pattern41 = null;
        org.jsoup.select.Elements elements42 = element36.getElementsByAttributeValueMatching("hi!", pattern41);
        org.jsoup.nodes.Element element44 = element36.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element47 = element36.attr("hi!.hi!.<hi!></hi!>", "<hi!></hi!>");
        org.jsoup.select.Elements elements50 = element36.getElementsByAttributeValueStarting("hi!", "hi!.hi!.<hi!></hi!>");
        java.util.Set<java.lang.String> strSet51 = element36.classNames();
        org.jsoup.nodes.Element element52 = element30.classNames(strSet51);
        org.jsoup.nodes.Element element53 = element11.appendChild((org.jsoup.nodes.Node) element52);
        org.jsoup.select.Elements elements55 = element52.getElementsContainingText("<hi! class=\"<hi! <hi! class=&quot;&quot;>\n</hi!>></hi!>\" value=\"hi!.hi!.<hi!></hi!>\">\n <hi!></hi!>\n</hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList56 = element52.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(elements50);
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(elements55);
        org.junit.Assert.assertNotNull(nodeList56);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element4.siblingNodes();
        org.jsoup.nodes.Element element8 = element4.prependElement("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.select.Elements elements10 = element8.getElementsContainingOwnText("");
        org.jsoup.nodes.Element element13 = element8.attr("<hi!>\n</hi!>", "<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Document document14 = element8.ownerDocument();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
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
        boolean boolean17 = element13.isBlock();
        java.lang.String str19 = element13.absUrl("<hi!>\n <hi!></hi!>\n</hi!>");
        int int20 = element13.siblingIndex();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "<hi!></hi!>", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        org.jsoup.nodes.Element element13 = element4.classNames((java.util.Set<java.lang.String>) strSet11);
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        int int16 = element15.childNodeSize();
        boolean boolean18 = element15.hasClass("hi!");
        java.util.regex.Pattern pattern20 = null;
        org.jsoup.select.Elements elements21 = element15.getElementsByAttributeValueMatching("hi!", pattern20);
        org.jsoup.nodes.Element element23 = element15.appendText("<hi!></hi!>");
        org.jsoup.select.Elements elements25 = element15.getElementsMatchingOwnText("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element28 = element15.attr("hi!.hi!.<hi!></hi!>", false);
        org.jsoup.nodes.Element element29 = element13.appendChild((org.jsoup.nodes.Node) element15);
        int int30 = element13.siblingIndex();
        java.lang.String str31 = element13.className();
        java.lang.String str32 = element13.data();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "<hi!></hi!>", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi! <hi!></hi!>" + "'", str31, "hi! <hi!></hi!>");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        int int8 = element7.childNodeSize();
        java.lang.String str9 = element7.nodeName();
        org.jsoup.nodes.Element element10 = element4.appendChild((org.jsoup.nodes.Node) element7);
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element10.siblingNodes();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element15 = element13.appendText("");
        int int16 = element15.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element15.textNodes();
        java.lang.String str18 = element15.nodeName();
        org.jsoup.nodes.Node node19 = element15.nextSibling();
        org.jsoup.nodes.Element element21 = element15.prepend("<hi!>\n</hi!>");
        org.jsoup.select.Elements elements23 = element15.getElementsContainingOwnText("");
        java.lang.String str24 = element15.baseUri();
        java.lang.String str25 = element15.className();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element26 = element10.after((org.jsoup.nodes.Node) element15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Element element9 = element7.prependElement("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str12 = element11.id();
        java.lang.Integer int13 = element11.elementSiblingIndex();
        org.jsoup.nodes.Element element14 = element11.empty();
        java.lang.String str15 = element14.outerHtml();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        int int18 = element17.childNodeSize();
        java.lang.String str19 = element17.nodeName();
        org.jsoup.nodes.Element element20 = element14.appendChild((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Element element22 = element14.html("<hi!></hi!>");
        org.jsoup.nodes.Element element23 = element14.nextElementSibling();
        org.jsoup.nodes.Element element25 = element14.append("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element26 = element9.appendChild((org.jsoup.nodes.Node) element25);
        org.jsoup.nodes.Element element28 = element9.val("<hi! class=\"\"></hi!>");
        org.jsoup.select.Elements elements30 = element28.getElementsMatchingOwnText("<hi! <hi! class=\"\">\n</hi!>></hi!>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<hi!></hi!>" + "'", str15, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(elements30);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexGreaterThan((int) (short) 0);
        org.jsoup.nodes.Element element9 = element3.toggleClass("");
        org.jsoup.nodes.Element element11 = element9.prepend("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element15 = element13.appendText("");
        org.jsoup.nodes.Element element17 = element15.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element19 = element15.toggleClass("");
        org.jsoup.nodes.Element element21 = element19.tagName("hi!");
        org.jsoup.select.Elements elements23 = element19.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element28 = element26.appendText("");
        org.jsoup.nodes.Element element30 = element28.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element32 = element28.toggleClass("");
        org.jsoup.nodes.Element element34 = element32.tagName("hi!");
        org.jsoup.select.Elements elements36 = element32.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element37 = element19.insertChildren((int) (byte) -1, (java.util.Collection<org.jsoup.nodes.Element>) elements36);
        org.jsoup.nodes.Node node38 = element19.nextSibling();
        org.jsoup.nodes.Element element40 = element19.appendText("<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>");
        java.lang.String str42 = element19.absUrl("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element43 = element11.appendChild((org.jsoup.nodes.Node) element19);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element45 = element43.before("&lt;hi! class=\"\"&gt;&lt;/hi!&gt;");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNodeList5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(element43);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        java.lang.String str3 = element1.nodeName();
        java.util.Set<java.lang.String> strSet4 = element1.classNames();
        org.jsoup.nodes.Element element6 = element1.appendElement("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Document document7 = element6.ownerDocument();
        org.jsoup.nodes.Element element9 = element6.after("<hi! class=\"\">\n &lt;hi!&gt; &lt;/hi!&gt;\n</hi!>");
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValueEnding("<hi! value=\"<hi!></hi!>\"></hi!>", "<hi!></hi!>");
        java.lang.String str13 = element9.tagName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.hi!.<hi!></hi!>" + "'", str13, "hi!.hi!.<hi!></hi!>");
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element10 = element4.addClass("");
        java.lang.String str11 = element10.toString();
        org.jsoup.nodes.Element element13 = element10.val("<hi!></hi!>");
        boolean boolean15 = element10.equals((java.lang.Object) 10.0f);
        org.jsoup.nodes.Element element17 = element10.prepend("hi!.hi!. <hi!></hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<hi! class=\"\"></hi!>" + "'", str11, "<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        org.jsoup.nodes.Element element6 = element1.appendText("<hi! class=\"<hi!></hi!>\"></hi!><hi!> </hi!>");
        int int7 = element1.childNodeSize();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
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
        boolean boolean51 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element21);
        org.jsoup.select.Elements elements54 = element21.getElementsByAttributeValueMatching("<hi! class=\"\">\n <hi!></hi!>\n</hi!>", "<hi!>\n <hi!>\n  <hi! class=\"\"> \n  </hi!>\n </hi!>\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            element21.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<hi!></hi!>" + "'", str30, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertNotNull(strSet47);
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(elements54);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element10 = element4.append("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.select.Elements elements13 = element10.getElementsByAttributeValueNot("<hi! class=\"\"></hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Node node14 = element10.root();
        org.jsoup.select.Elements elements16 = element10.getElementsMatchingText("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        boolean boolean18 = element10.hasAttr("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements20 = element10.select("hi!.hi!. <hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'hi!.hi!. <hi!></hi!>': unexpected token at '!.hi!. <hi!></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Element element9 = element7.tagName("hi!");
        org.jsoup.select.Elements elements11 = element7.getElementsMatchingText("hi!");
        java.lang.String str13 = element7.absUrl("<hi!>\n hi!.\n <hi!></hi!>\n</hi!>");
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            element7.outerHtmlTail(appendable14, 2, outputSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        boolean boolean4 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements8 = element6.getElementsByIndexGreaterThan((-1));
        boolean boolean9 = element1.equals((java.lang.Object) element6);
        org.jsoup.select.Elements elements12 = element6.getElementsByAttributeValue("<hi!>\n <hi!>\n  <hi! class=\"\"> \n  </hi!>\n </hi!>\n</hi!>", "<hi!></hi!>\n<hi! class=\"\">\n</hi!>");
        org.jsoup.select.Elements elements15 = element6.getElementsByAttributeValueStarting("hi!.hi!.\n<hi!></hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element17 = element6.prependText("");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet9 = element8.classNames();
        org.jsoup.nodes.Element element11 = element8.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.select.Elements elements13 = element11.getElementsMatchingText("");
        org.jsoup.nodes.Element element15 = element11.val("");
        org.jsoup.select.Elements elements17 = element11.getElementsByClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element19 = element11.prependElement("<hi! class=\"<hi!></hi!>\"></hi!>");
        boolean boolean20 = element11.hasText();
        org.jsoup.nodes.Element element22 = element11.text("hi!.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(element22);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        org.jsoup.nodes.Element element6 = element1.append("hi!.hi!.<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element6.siblingNodes();
        org.jsoup.select.Elements elements10 = element6.getElementsByAttributeValueMatching("hi!.hi!.<hi!></hi!>", "<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str13 = element12.id();
        java.lang.Integer int14 = element12.elementSiblingIndex();
        org.jsoup.nodes.Element element15 = element12.empty();
        java.lang.String str16 = element15.outerHtml();
        org.jsoup.parser.Tag tag17 = element15.tag();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element(tag17, "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag17, "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element24 = element21.attr("<hi! class=\"<hi!></hi!>\"></hi!>", "<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.select.Elements elements26 = element21.getElementsMatchingText("hi!.hi!.");
        org.jsoup.nodes.Node node27 = element21.parentNode();
        org.jsoup.nodes.Element element28 = element6.prependChild((org.jsoup.nodes.Node) element21);
        org.jsoup.nodes.Element element29 = element21.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = element29.childNode((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<hi!></hi!>" + "'", str16, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        org.jsoup.nodes.Element element6 = element1.append("hi!.hi!.<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element6.siblingNodes();
        java.lang.String str8 = element6.outerHtml();
        org.jsoup.select.Elements elements9 = element6.children();
        java.lang.String str10 = element6.ownText();
        org.jsoup.parser.Tag tag11 = element6.tag();
        boolean boolean12 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>" + "'", str8, "<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!." + "'", str10, "hi!.hi!.");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
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
        org.jsoup.nodes.Element element18 = element16.removeClass("hi!.hi!.\n<hi!></hi!>");
        org.jsoup.nodes.Element element20 = element18.appendElement("<hi! hi!.hi!.<hi!></hi!>=\"<hi!></hi!>\">\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str23 = element22.id();
        java.lang.Integer int24 = element22.elementSiblingIndex();
        org.jsoup.nodes.Element element25 = element22.empty();
        java.lang.String str26 = element25.outerHtml();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element("hi!");
        int int29 = element28.childNodeSize();
        java.lang.String str30 = element28.nodeName();
        org.jsoup.nodes.Element element31 = element25.appendChild((org.jsoup.nodes.Node) element28);
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element35 = element33.appendText("");
        org.jsoup.nodes.Element element36 = element31.appendChild((org.jsoup.nodes.Node) element33);
        org.jsoup.nodes.Element element38 = element31.addClass("");
        org.jsoup.select.Elements elements39 = element38.getAllElements();
        boolean boolean40 = element38.hasText();
        org.jsoup.nodes.Element element42 = element38.appendElement("<hi! class=\"\">\n <hi!>\n  <hi!></hi!>\n </hi!>\n <hi! class=\"\"> \n  <hi!></hi!>&lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt; \n </hi!>\n</hi!>");
        org.jsoup.nodes.Element element43 = element20.after((org.jsoup.nodes.Node) element38);
        java.lang.String str44 = element43.className();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<hi!></hi!>" + "'", str26, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        int int8 = element7.childNodeSize();
        java.lang.String str9 = element7.nodeName();
        org.jsoup.nodes.Element element10 = element4.appendChild((org.jsoup.nodes.Node) element7);
        java.lang.String str11 = element7.outerHtml();
        org.jsoup.select.Elements elements13 = element7.getElementsByTag("<hi! <hi! class=\"\">\n</hi!>></hi!>");
        boolean boolean14 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element7);
        org.jsoup.nodes.Element element16 = element7.addClass("hi!.<hi!.class=\"<hi!></hi!>\"></hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<hi!></hi!>" + "'", str11, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
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
        org.jsoup.nodes.Element element23 = element20.attr("<hi! class=\"<hi! class=&quot;&quot;>\n hi!.hi!.\n <hi!></hi!>\n</hi!>\">\n</hi!>", false);
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str26 = element25.id();
        java.lang.Integer int27 = element25.elementSiblingIndex();
        java.lang.String str28 = element25.className();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList29 = element25.dataNodes();
        org.jsoup.nodes.Element element32 = element25.attr("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element36 = element34.val("<hi!></hi!>");
        org.jsoup.parser.Tag tag37 = element34.tag();
        org.jsoup.nodes.Attributes attributes38 = element34.attributes();
        java.lang.String str39 = element34.data();
        java.lang.String str40 = element34.ownText();
        org.jsoup.nodes.Element element42 = element34.val("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element43 = element25.prependChild((org.jsoup.nodes.Node) element34);
        java.util.Set<java.lang.String> strSet44 = element43.classNames();
        org.jsoup.nodes.Element element45 = element23.classNames(strSet44);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(textNodeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(dataNodeList29);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertNotNull(element45);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
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
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str37 = element36.id();
        java.lang.Integer int38 = element36.elementSiblingIndex();
        org.jsoup.nodes.Element element39 = element36.empty();
        java.lang.String str40 = element39.outerHtml();
        org.jsoup.select.Elements elements43 = element39.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element45 = element39.append("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.select.Elements elements48 = element45.getElementsByAttributeValueNot("<hi! class=\"\"></hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element50 = element45.tagName("<hi!>\n <hi!>\n  <hi! class=\"\"> \n  </hi!>\n </hi!>\n</hi!>");
        org.jsoup.nodes.Element element51 = element34.prependChild((org.jsoup.nodes.Node) element50);
        java.lang.Integer int52 = element34.elementSiblingIndex();
        org.jsoup.nodes.Element element53 = element34.empty();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<hi!></hi!>" + "'", str12, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>" + "'", str32, "<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "<hi!></hi!>" + "'", str40, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(element53);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
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
        org.jsoup.nodes.Element element18 = element15.append("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element21 = element15.attr("<hi!>\n hi!.\n <hi!></hi!>\n</hi!>", false);
        java.lang.String str22 = element15.html();
        org.jsoup.select.Elements elements24 = element15.getElementsContainingText("<hi! class=\"\">\n <hi!></hi!>&lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<hi!></hi!>" + "'", str16, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<hi!> \n <hi!></hi!> \n</hi!>" + "'", str22, "<hi!> \n <hi!></hi!> \n</hi!>");
        org.junit.Assert.assertNotNull(elements24);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
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
        org.jsoup.nodes.Element element16 = element4.prependElement("<hi! class=\"\">\n hi!\n</hi!>");
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        int int19 = element18.childNodeSize();
        java.lang.String str20 = element18.nodeName();
        java.lang.String str21 = element18.text();
        org.jsoup.nodes.Element element23 = element18.append("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element24 = element16.after((org.jsoup.nodes.Node) element18);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.val("<hi!></hi!>");
        org.jsoup.parser.Tag tag4 = element1.tag();
        org.jsoup.nodes.Attributes attributes5 = element1.attributes();
        java.lang.String str6 = element1.data();
        java.lang.String str7 = element1.id();
        java.lang.String str9 = element1.absUrl("hi!.<hi!.class=\"<hi!></hi!>\"></hi!>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        boolean boolean4 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element6 = element1.appendElement("hi!");
        org.jsoup.select.Elements elements9 = element6.getElementsByAttributeValueNot("<hi! class=\"\">\n</hi!>", "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element11 = element6.after("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element14 = element11.attr("<hi! class=\"\">\n</hi!>", true);
        java.util.Set<java.lang.String> strSet15 = element11.classNames();
        org.jsoup.nodes.Node node16 = element11.unwrap();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        int int19 = element18.childNodeSize();
        boolean boolean21 = element18.hasClass("hi!");
        java.util.regex.Pattern pattern23 = null;
        org.jsoup.select.Elements elements24 = element18.getElementsByAttributeValueMatching("hi!", pattern23);
        org.jsoup.nodes.Element element25 = element18.empty();
        org.jsoup.select.Elements elements28 = element18.getElementsByAttributeValueNot("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!>\n</hi!>");
        java.util.Set<java.lang.String> strSet29 = element18.classNames();
        org.jsoup.nodes.Element element31 = element18.removeClass("<hi!>\n hi!\n</hi!>");
        int int32 = element18.siblingIndex();
        org.jsoup.nodes.Element element35 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str36 = element35.id();
        java.lang.Integer int37 = element35.elementSiblingIndex();
        org.jsoup.nodes.Element element38 = element35.empty();
        java.lang.String str39 = element38.outerHtml();
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element("hi!");
        int int42 = element41.childNodeSize();
        java.lang.String str43 = element41.nodeName();
        org.jsoup.nodes.Element element44 = element38.appendChild((org.jsoup.nodes.Node) element41);
        org.jsoup.nodes.Element element46 = element41.addClass("hi!.hi!.<hi!></hi!>");
        org.jsoup.select.Elements elements48 = element41.getElementsContainingOwnText("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element49 = element18.insertChildren(0, (java.util.Collection<org.jsoup.nodes.Element>) elements48);
        boolean boolean50 = element11.hasSameValue((java.lang.Object) element49);
        org.jsoup.nodes.Element element52 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str53 = element52.id();
        org.jsoup.nodes.Element element55 = element52.removeClass("");
        org.jsoup.nodes.Element element57 = element52.append("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element59 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str60 = element59.id();
        java.lang.Integer int61 = element59.elementSiblingIndex();
        org.jsoup.nodes.Element element62 = element59.empty();
        java.lang.String str63 = element62.outerHtml();
        org.jsoup.parser.Tag tag64 = element62.tag();
        org.jsoup.nodes.Element element67 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str68 = element67.id();
        org.jsoup.nodes.Element element70 = element67.removeClass("");
        java.lang.String str72 = element70.absUrl("hi!");
        org.jsoup.nodes.Element element74 = element70.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet75 = element74.classNames();
        org.jsoup.nodes.Element element77 = element74.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Attributes attributes78 = element77.attributes();
        org.jsoup.nodes.Element element79 = new org.jsoup.nodes.Element(tag64, "<hi! class=\"\"></hi!>", attributes78);
        java.util.Set<java.lang.String> strSet80 = element79.classNames();
        java.util.Set<java.lang.String> strSet81 = element79.classNames();
        org.jsoup.nodes.Element element82 = element57.classNames(strSet81);
        java.lang.String str83 = element82.outerHtml();
        org.jsoup.select.Elements elements85 = element82.getElementsByIndexLessThan((int) (short) 1);
        org.jsoup.nodes.Node node86 = element82.previousSibling();
        org.jsoup.nodes.Element element88 = element82.html("<hi! class=\"<hi!></hi!>\"></hi!>");
        element82.setBaseUri("hi!.hi!.\n<hi!></hi!>");
        boolean boolean91 = element49.hasSameValue((java.lang.Object) element82);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<hi!></hi!>" + "'", str39, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(element62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "<hi!></hi!>" + "'", str63, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag64);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(element70);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(element74);
        org.junit.Assert.assertNotNull(strSet75);
        org.junit.Assert.assertNotNull(element77);
        org.junit.Assert.assertNotNull(attributes78);
        org.junit.Assert.assertNotNull(strSet80);
        org.junit.Assert.assertNotNull(strSet81);
        org.junit.Assert.assertNotNull(element82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>" + "'", str83, "<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(elements85);
        org.junit.Assert.assertNull(node86);
        org.junit.Assert.assertNotNull(element88);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        java.lang.String str4 = element1.className();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList5 = element1.dataNodes();
        org.jsoup.nodes.Element element8 = element1.attr("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element10 = element1.appendElement("hi!");
        org.jsoup.nodes.Attributes attributes11 = element10.attributes();
        org.jsoup.nodes.Element element12 = element10.clone();
        element10.setBaseUri("<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>");
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        int int17 = element16.childNodeSize();
        boolean boolean19 = element16.hasClass("hi!");
        org.jsoup.nodes.Node node20 = element16.parentNode();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = element16.dataset();
        org.jsoup.nodes.Attributes attributes22 = element16.attributes();
        org.jsoup.nodes.Element element23 = element10.before((org.jsoup.nodes.Node) element16);
        org.jsoup.nodes.Element element25 = element16.appendElement("<hi! class=\"\">\n <hi!>\n  <hi!></hi!>\n </hi!>\n <hi! class=\"\"> \n  <hi!></hi!>&lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt; \n </hi!>\n</hi!>");
        java.lang.String str26 = element16.val();
        org.jsoup.select.Elements elements28 = element16.getElementsByIndexGreaterThan((int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(dataNodeList5);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(elements28);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        java.lang.String str3 = element1.nodeName();
        element1.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = element1.toggleClass("hi!.hi!.<hi!></hi!>");
        java.lang.String str8 = element7.tagName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element7.child((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet9 = element8.classNames();
        org.jsoup.nodes.Element element11 = element8.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.select.Elements elements13 = element11.getElementsMatchingText("");
        org.jsoup.nodes.Element element15 = element11.val("");
        org.jsoup.select.Elements elements17 = element11.getElementsByClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element19 = element11.prependElement("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element21 = element19.appendText("");
        java.util.regex.Pattern pattern23 = null;
        org.jsoup.select.Elements elements24 = element19.getElementsByAttributeValueMatching("<hi!></hi!>", pattern23);
        boolean boolean26 = element19.hasAttr("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element28 = element19.addClass("<hi!> \n <hi!></hi!> \n</hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(element28);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
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
        org.jsoup.select.Elements elements18 = element16.getElementsByIndexLessThan((int) (short) 1);
        int int19 = element16.siblingIndex();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
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
        java.util.Map<java.lang.String, java.lang.String> strMap13 = element7.dataset();
        org.jsoup.nodes.Node node14 = element7.parentNode();
        int int15 = element7.childNodeSize();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        java.lang.String str6 = element3.nodeName();
        org.jsoup.select.Elements elements8 = element3.getElementsByIndexEquals((int) (byte) 0);
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element3.siblingNodes();
        org.jsoup.nodes.Element element11 = element3.append("<hi! <hi! class=\"<hi!></hi!>\"></hi!>=\"<hi! class=&quot;<hi!></hi!>&quot;></hi!>\"></hi!>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Element element9 = element7.tagName("hi!");
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValueStarting("hi!", "hi!.hi!.<hi!></hi!>");
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
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element29 = element27.appendText("");
        int int30 = element29.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList31 = element29.textNodes();
        java.lang.String str32 = element29.data();
        org.jsoup.nodes.Element element33 = element23.prependChild((org.jsoup.nodes.Node) element29);
        java.util.Set<java.lang.String> strSet34 = element33.classNames();
        org.jsoup.nodes.Element element35 = element9.classNames(strSet34);
        org.jsoup.select.Elements elements37 = element9.getElementsByIndexGreaterThan(1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<hi!></hi!>" + "'", str18, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(textNodeList31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(elements37);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
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
        java.lang.String str15 = element4.text();
        org.jsoup.nodes.Element element17 = element4.appendText("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element19 = element4.toggleClass("<hi!>\n <hi!>\n  <hi! class=\"\"> \n  </hi!>\n </hi!>\n</hi!>");
        org.jsoup.nodes.Element element22 = element19.attr("<hi! class=\"<hi! <hi! class=&quot;&quot;>\n</hi!>></hi!>\" value=\"hi!.hi!.<hi!></hi!>\">\n <hi!></hi!>\n</hi!>", "hi!.hi!.hi!.<hi!></hi!>");
        boolean boolean23 = element22.hasText();
        java.lang.String str25 = element22.absUrl("<hi! class=\"<hi! class=&quot;&quot;>\n hi!.hi!.\n <hi!></hi!>\n</hi!>\">\n</hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
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
        org.jsoup.select.Elements elements24 = element10.getElementsByAttributeValueStarting("<hi! class=\"<hi!></hi!>\"></hi!><hi!> </hi!>", "<hi! <hi! class=\"<hi!></hi!>\"></hi!>=\"<hi! class=&quot;<hi!></hi!>&quot;></hi!>\"></hi!>");
        org.jsoup.nodes.Attributes attributes25 = element10.attributes();
        org.jsoup.nodes.Document document26 = element10.ownerDocument();
        org.jsoup.nodes.Element element28 = element10.prepend("hi!.<hi!></hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(textNodeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNull(document26);
        org.junit.Assert.assertNotNull(element28);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList3 = element1.childNodesCopy();
        boolean boolean5 = element1.hasClass("<hi!>\n</hi!>");
        org.jsoup.parser.Tag tag6 = element1.tag();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element(tag6, "<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>");
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element11.val("<hi!></hi!>");
        org.jsoup.parser.Tag tag14 = element11.tag();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag14, "");
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element21 = element19.val("<hi!></hi!>");
        org.jsoup.parser.Tag tag22 = element19.tag();
        org.jsoup.nodes.Attributes attributes23 = element19.attributes();
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element(tag14, "hi!", attributes23);
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag6, "hi!", attributes23);
        int int26 = element25.childNodeSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.val("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = element1.siblingNodes();
        java.lang.String str5 = element1.html();
        java.lang.String str7 = element1.absUrl("<hi!>\n <hi! class=\"\">\n   hi! \n </hi!>\n</hi!>");
        java.lang.String str8 = element1.cssSelector();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        java.lang.String str3 = element1.nodeName();
        java.lang.String str4 = element1.text();
        org.jsoup.nodes.Element element6 = element1.append("<hi! class=\"\"></hi!>");
        org.jsoup.select.Elements elements8 = element6.getElementsContainingOwnText("hi!.hi!.hi!.<hi!></hi!>");
        org.jsoup.select.Elements elements10 = element6.getElementsContainingText("<hi!> <hi! class=\"\"></hi!> </hi!>");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
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
        org.jsoup.nodes.Node node21 = element20.parentNode();
        org.jsoup.select.Elements elements24 = element20.getElementsByAttributeValueEnding("<hi! class=\"\"></hi!>", "<hi! class=\"\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements27 = element20.getElementsByAttributeValueNot("", "hi!.hi!.<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(textNodeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(elements24);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
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
        org.jsoup.nodes.Element element51 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str52 = element51.id();
        java.lang.Integer int53 = element51.elementSiblingIndex();
        org.jsoup.nodes.Element element54 = element51.empty();
        java.lang.String str55 = element54.outerHtml();
        org.jsoup.nodes.Element element57 = new org.jsoup.nodes.Element("hi!");
        int int58 = element57.childNodeSize();
        java.lang.String str59 = element57.nodeName();
        org.jsoup.nodes.Element element60 = element54.appendChild((org.jsoup.nodes.Node) element57);
        org.jsoup.nodes.Element element62 = element54.html("<hi!></hi!>");
        org.jsoup.nodes.Element element64 = element62.removeClass("<hi!></hi!>");
        java.lang.String str65 = element62.id();
        org.jsoup.select.Elements elements67 = element62.getElementsByTag("<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>");
        org.jsoup.nodes.Element element68 = element46.prependChild((org.jsoup.nodes.Node) element62);
        org.jsoup.nodes.Attributes attributes69 = element46.attributes();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<hi!></hi!>" + "'", str24, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "<hi!></hi!>" + "'", str55, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertNotNull(element62);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(elements67);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertNotNull(attributes69);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        org.jsoup.nodes.Element element8 = element4.append("hi!");
        org.jsoup.nodes.Element element10 = element8.addClass("hi!.hi!.<hi!></hi!>");
        org.jsoup.select.Elements elements12 = element10.getElementsByTag("<hi!>\n <hi!></hi!>\n</hi!>");
        java.lang.String str13 = element10.baseUri();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str17 = element16.id();
        java.lang.Integer int18 = element16.elementSiblingIndex();
        org.jsoup.nodes.Element element19 = element16.empty();
        java.lang.String str20 = element19.outerHtml();
        org.jsoup.select.Elements elements23 = element19.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element27 = element25.appendText("");
        java.util.Set<java.lang.String> strSet28 = element27.classNames();
        org.jsoup.nodes.Element element29 = element19.classNames(strSet28);
        org.jsoup.select.Elements elements31 = element29.getElementsByIndexLessThan((int) (byte) 0);
        org.jsoup.nodes.Element element32 = element10.insertChildren(0, (java.util.Collection<org.jsoup.nodes.Element>) elements31);
        org.jsoup.select.Elements elements34 = element32.getElementsContainingText("hi!");
        org.jsoup.nodes.Node node35 = element32.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList36 = node35.childNodesCopy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<hi!></hi!>" + "'", str20, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNull(node35);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
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
        java.lang.Integer int15 = element13.elementSiblingIndex();
        org.jsoup.nodes.Element element16 = element13.empty();
        java.lang.String str17 = element16.outerHtml();
        org.jsoup.parser.Tag tag18 = element16.tag();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str22 = element21.id();
        org.jsoup.nodes.Element element24 = element21.removeClass("");
        java.lang.String str26 = element24.absUrl("hi!");
        org.jsoup.nodes.Element element28 = element24.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet29 = element28.classNames();
        org.jsoup.nodes.Element element31 = element28.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Attributes attributes32 = element31.attributes();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element(tag18, "<hi! class=\"\"></hi!>", attributes32);
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element(tag6, "<hi!></hi!>", attributes32);
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element38 = element36.val("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList39 = element36.siblingNodes();
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element43 = element41.appendText("");
        org.jsoup.nodes.Element element45 = element43.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element47 = element43.toggleClass("");
        org.jsoup.nodes.Element element49 = element47.tagName("hi!");
        boolean boolean50 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element49);
        org.jsoup.nodes.Element element51 = element36.appendChild((org.jsoup.nodes.Node) element49);
        java.lang.String str52 = element49.text();
        boolean boolean53 = element34.equals((java.lang.Object) element49);
        org.jsoup.nodes.Element element55 = element49.before("hi!.hi!.\n<hi!></hi!>");
        org.jsoup.nodes.Element element57 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element59 = element57.val("<hi!></hi!>");
        org.jsoup.parser.Tag tag60 = element57.tag();
        org.jsoup.nodes.Attributes attributes61 = element57.attributes();
        java.lang.String str62 = element57.data();
        java.util.Set<java.lang.String> strSet63 = element57.classNames();
        org.jsoup.nodes.Element element64 = element49.classNames(strSet63);
        java.lang.Object obj65 = null;
        boolean boolean66 = element64.hasSameValue(obj65);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<hi!></hi!>" + "'", str17, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(tag60);
        org.junit.Assert.assertNotNull(attributes61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(strSet63);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Element element9 = element7.tagName("hi!");
        boolean boolean10 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element9);
        org.jsoup.select.Elements elements12 = element9.getElementsByIndexEquals((int) '4');
        org.jsoup.select.Elements elements14 = element9.getElementsByAttributeStarting("hi!.hi!.");
        org.jsoup.nodes.Element element15 = element9.previousElementSibling();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(element15);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
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
        org.jsoup.nodes.Element element18 = element14.after("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = element18.dataset();
        org.jsoup.select.Elements elements21 = element18.getElementsMatchingOwnText("<hi! class=\"\">\n hi!\n</hi!>");
        org.jsoup.nodes.Element element23 = element18.prependText("<hi!.hi!.></hi!.hi!.>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = element18.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = element4.empty();
        org.jsoup.nodes.Element element11 = element4.prepend("<hi!>\n</hi!>");
        org.jsoup.select.Elements elements14 = element11.getElementsByAttributeValueEnding("hi!.hi!.<hi!></hi!>", "<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        java.lang.String str15 = element11.ownText();
        boolean boolean17 = element11.hasClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element19 = element11.val("hi!");
        boolean boolean20 = element11.isBlock();
        org.jsoup.select.Elements elements22 = element11.getElementsByIndexGreaterThan((int) (short) 100);
        boolean boolean24 = element11.hasAttr("<hi! class=\"\">&lt;hi!&gt; &lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("hi!", pattern6);
        org.jsoup.nodes.Element element9 = element1.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element12 = element1.attr("hi!.hi!.<hi!></hi!>", "<hi!></hi!>");
        org.jsoup.nodes.Node node13 = element12.nextSibling();
        java.util.regex.Pattern pattern15 = null;
        org.jsoup.select.Elements elements16 = element12.getElementsByAttributeValueMatching("hi!.hi!.\n<hi!></hi!>", pattern15);
        int int17 = element12.childNodeSize();
        org.jsoup.nodes.Element element19 = element12.tagName("hi!.hi!.");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        org.jsoup.nodes.Element element6 = element4.toggleClass("<hi!></hi!>");
        java.lang.String str7 = element6.toString();
        org.jsoup.nodes.Element element9 = element6.prependElement("<hi!></hi!>");
        element6.setBaseUri("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element13 = element6.appendText("");
        org.jsoup.nodes.Element element15 = element6.prepend("hi!.hi!.<hi!></hi!>");
        java.lang.String str16 = element6.val();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<hi! class=\"<hi!></hi!>\"></hi!>" + "'", str7, "<hi! class=\"<hi!></hi!>\"></hi!>");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.parser.Tag tag6 = element4.tag();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element(tag6, "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag6, "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element13 = element10.attr("<hi! class=\"<hi!></hi!>\"></hi!>", "<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.select.Elements elements15 = element10.getElementsByTag("hi!.hi!.");
        org.jsoup.nodes.Element element17 = element10.appendText("<hi! value=\"hi!\"></hi!>");
        java.lang.String str18 = element17.id();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = element17.siblingNodes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(nodeList19);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
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
        org.jsoup.nodes.Node node30 = element29.root();
        java.util.Map<java.lang.String, java.lang.String> strMap31 = element29.dataset();
        org.jsoup.nodes.Element element33 = element29.prepend("hi!.<hi!.class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.select.Elements elements35 = element29.getElementsMatchingText("<hi! <hi!>\n <hi!></hi!>\n</hi!>=\"<hi!>\n <hi!></hi!>\n</hi!>\"></hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(elements35);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        java.lang.String str4 = element1.className();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList5 = element1.dataNodes();
        org.jsoup.select.Elements elements7 = element1.getElementsByTag("hi!");
        org.jsoup.parser.Tag tag8 = element1.tag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element1.before("<<hi!></hi!>></<hi!></hi!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(dataNodeList5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "<hi!></hi!>", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        org.jsoup.nodes.Element element13 = element4.classNames((java.util.Set<java.lang.String>) strSet11);
        java.lang.String str14 = element13.cssSelector();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = element13.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "<hi!></hi!>", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!.hi!.<hi!></hi!>" + "'", str14, "hi!.hi!.<hi!></hi!>");
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList6 = element3.textNodes();
        org.jsoup.nodes.Element element8 = element3.text("");
        org.jsoup.select.Elements elements11 = element3.getElementsByAttributeValueContaining("<hi! class=\"hi!.hi!.<hi!></hi!>\"></hi!>", "<hi! class=\"hi!.hi!.<hi!></hi!>\">\n hi!\n</hi!>");
        java.lang.String str12 = element3.html();
        org.jsoup.select.Elements elements14 = element3.getElementsByTag("hi!.");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(textNodeList6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("hi!", pattern6);
        org.jsoup.nodes.Element element9 = element1.appendText("<hi!></hi!>");
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValueNot("<hi!></hi!>", "<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        java.lang.String str13 = element9.ownText();
        org.jsoup.select.Elements elements16 = element9.getElementsByAttributeValueEnding("<hi!>\n hi!.\n <hi!></hi!>\n</hi!>", "<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        boolean boolean17 = element9.hasText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = element9.before("<<hi! value=\"<hi!></hi!>\">\n <hi! class=\"\">\n </hi!>\n <hi!>\n  <hi!>\n  </hi!>\n  <hi!></hi!>\n </hi!>\n</hi!>></<hi! value=\"<hi!></hi!>\">\n <hi! class=\"\">\n </hi!>\n <hi!>\n  <hi!>\n  </hi!>\n  <hi!></hi!>\n </hi!>\n</hi!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<hi!></hi!>" + "'", str13, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element10 = element4.addClass("");
        org.jsoup.select.Elements elements12 = element4.getElementsByTag("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str15 = element14.id();
        java.lang.Integer int16 = element14.elementSiblingIndex();
        org.jsoup.nodes.Element element17 = element14.empty();
        java.lang.String str18 = element17.outerHtml();
        org.jsoup.select.Elements elements21 = element17.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element23 = element17.addClass("");
        java.lang.String str24 = element23.toString();
        org.jsoup.select.Elements elements26 = element23.getElementsByAttributeStarting("<hi!>\n</hi!>");
        boolean boolean27 = element4.hasSameValue((java.lang.Object) elements26);
        org.jsoup.nodes.Element element29 = element4.addClass("<<hi!>\n</hi!>></<hi!>\n</hi!>>");
        org.jsoup.select.Elements elements30 = element4.children();
        java.util.Set<java.lang.String> strSet31 = element4.classNames();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str34 = element33.id();
        java.lang.Integer int35 = element33.elementSiblingIndex();
        org.jsoup.nodes.Element element36 = element33.empty();
        java.lang.String str37 = element36.outerHtml();
        org.jsoup.nodes.Element element39 = new org.jsoup.nodes.Element("hi!");
        int int40 = element39.childNodeSize();
        java.lang.String str41 = element39.nodeName();
        org.jsoup.nodes.Element element42 = element36.appendChild((org.jsoup.nodes.Node) element39);
        org.jsoup.nodes.Element element44 = element36.html("<hi!></hi!>");
        org.jsoup.select.Elements elements46 = element36.getElementsByClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element48 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element50 = element48.appendText("");
        org.jsoup.nodes.Element element52 = element50.removeClass("<hi!></hi!>");
        org.jsoup.select.Elements elements54 = element52.getElementsByClass("hi!");
        java.lang.String str55 = element52.val();
        boolean boolean57 = element52.hasClass("hi!");
        org.jsoup.nodes.Element element58 = element36.appendChild((org.jsoup.nodes.Node) element52);
        org.jsoup.parser.Tag tag59 = element36.tag();
        org.jsoup.nodes.Element element61 = new org.jsoup.nodes.Element(tag59, "");
        org.jsoup.nodes.Node node62 = element61.root();
        org.jsoup.nodes.Node node63 = element61.root();
        boolean boolean64 = element4.equals((java.lang.Object) element61);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<hi!></hi!>" + "'", str18, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<hi! class=\"\"></hi!>" + "'", str24, "<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<hi!></hi!>" + "'", str37, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(elements54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(tag59);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
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
        java.lang.Integer int15 = element13.elementSiblingIndex();
        java.lang.String str16 = element13.className();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList17 = element13.dataNodes();
        org.jsoup.nodes.Element element20 = element13.attr("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element22 = element13.appendElement("hi!");
        org.jsoup.nodes.Attributes attributes23 = element22.attributes();
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element(tag6, "hi!.hi!.\n<hi!></hi!>", attributes23);
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag6, "<hi! class=\"\"></hi!>");
        org.jsoup.select.Elements elements28 = element26.getElementsByIndexGreaterThan((int) (byte) 10);
        java.lang.String str29 = element26.ownText();
        org.jsoup.select.Elements elements30 = element26.getAllElements();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements32 = element26.select("<hi!>\n &lt;hi! class=\"\"&gt; &lt;/hi!&gt;\n</hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi!>? &lt;hi! class=\"\"&gt; &lt;/hi!&gt;?</hi!>': unexpected token at '<hi!>? &lt;hi! class=\"\"&gt; &lt;/hi!&gt;?</hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(dataNodeList17);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(elements30);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "<hi!></hi!>", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        org.jsoup.nodes.Element element13 = element4.classNames((java.util.Set<java.lang.String>) strSet11);
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList14 = element13.dataNodes();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element18 = element16.appendText("");
        java.util.Set<java.lang.String> strSet19 = element18.classNames();
        java.lang.Integer int20 = element18.elementSiblingIndex();
        org.jsoup.nodes.Element element21 = element13.appendChild((org.jsoup.nodes.Node) element18);
        org.jsoup.nodes.Element element23 = element18.appendElement("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Node node24 = element23.root();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList25 = element23.textNodes();
        org.jsoup.nodes.Element element27 = element23.removeClass("<hi!>\n hi!.hi!. &lt;hi!&gt;&lt;/hi!&gt;&lt;hi! class=\"\"&gt; &lt;/hi!&gt;\n</hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "<hi!></hi!>", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(dataNodeList14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(textNodeList25);
        org.junit.Assert.assertNotNull(element27);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("hi!", pattern6);
        org.jsoup.nodes.Element element9 = element1.appendText("<hi!></hi!>");
        org.jsoup.nodes.Document document10 = element1.ownerDocument();
        org.jsoup.nodes.Element element11 = element1.empty();
        java.lang.String str13 = element1.attr("hi!");
        org.jsoup.nodes.Element element15 = element1.tagName("<hi!></hi!>");
        boolean boolean17 = element15.hasClass("<<hi!>\n</hi!> value=\"<hi! class=&quot;&quot;></hi!>\">\n <hi! class=\"\">\n   hi!.hi!. \n  <hi!></hi!> \n </hi!>\n</<hi!>\n</hi!>>");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
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
        boolean boolean30 = element10.hasAttr("hi!.<hi!></hi!>");
        java.lang.String str31 = element10.outerHtml();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList32 = element10.dataNodes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<hi!></hi!>" + "'", str20, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<hi! <hi! class=\"<hi!></hi!>\"></hi!>=\"<hi! class=&quot;<hi!></hi!>&quot;></hi!>\"></hi!>" + "'", str31, "<hi! <hi! class=\"<hi!></hi!>\"></hi!>=\"<hi! class=&quot;<hi!></hi!>&quot;></hi!>\"></hi!>");
        org.junit.Assert.assertNotNull(dataNodeList32);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element10 = element4.addClass("");
        org.jsoup.select.Elements elements12 = element4.getElementsByTag("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str15 = element14.id();
        java.lang.Integer int16 = element14.elementSiblingIndex();
        org.jsoup.nodes.Element element17 = element14.empty();
        java.lang.String str18 = element17.outerHtml();
        org.jsoup.select.Elements elements21 = element17.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element23 = element17.addClass("");
        java.lang.String str24 = element23.toString();
        org.jsoup.select.Elements elements26 = element23.getElementsByAttributeStarting("<hi!>\n</hi!>");
        boolean boolean27 = element4.hasSameValue((java.lang.Object) elements26);
        org.jsoup.nodes.Element element29 = element4.addClass("<<hi!>\n</hi!>></<hi!>\n</hi!>>");
        org.jsoup.select.Elements elements30 = element4.children();
        org.jsoup.nodes.Element element32 = element4.getElementById("<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<hi!></hi!>" + "'", str18, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<hi! class=\"\"></hi!>" + "'", str24, "<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNull(element32);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
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
        java.lang.String str35 = element34.text();
        org.jsoup.nodes.Element element37 = element34.addClass("<hi!>\n <hi! class=\"\">\n   hi! \n </hi!>\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements39 = element37.select("hi! <hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'hi! <hi!></hi!>': unexpected token at '! <hi!></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<hi!></hi!>" + "'", str12, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>" + "'", str32, "<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!.hi!." + "'", str35, "hi!.hi!.");
        org.junit.Assert.assertNotNull(element37);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
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
        org.jsoup.nodes.Element element22 = element16.val("<hi! class=\"<hi! <hi! class=&quot;&quot;>\n</hi!>></hi!>\" value=\"hi!.hi!.<hi!></hi!>\">\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element24 = element22.before("<hi! value=\"<hi!></hi!>\"></hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(textNodeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.className();
        org.jsoup.nodes.Element element4 = element1.html("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsContainingText("<hi!></hi!>");
        java.lang.String str7 = element4.cssSelector();
        org.jsoup.nodes.Element element9 = element4.val("");
        org.jsoup.nodes.Element element10 = element4.nextElementSibling();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(element10);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.removeClass("hi!");
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(100);
        java.lang.String str6 = element1.id();
        org.jsoup.nodes.Element element8 = element1.prepend("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element10 = element1.appendText("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Attributes attributes11 = element10.attributes();
        org.jsoup.nodes.Element element13 = element10.addClass("<hi! class=\"<hi! <hi! class=&quot;&quot;>\n</hi!>></hi!>\" value=\"hi!.hi!.<hi!></hi!>\">\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Node node15 = element13.removeAttr("hi!.&lt;hi!.class=\"&lt;hi!&gt;&lt;/hi!&gt;\"&gt;&lt;/hi!&gt;");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = element4.empty();
        org.jsoup.nodes.Element element11 = element4.prepend("<hi!>\n</hi!>");
        org.jsoup.select.Elements elements14 = element11.getElementsByAttributeValueEnding("hi!.hi!.<hi!></hi!>", "<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        java.lang.String str15 = element11.ownText();
        java.lang.String str16 = element11.cssSelector();
        org.jsoup.parser.Tag tag17 = element11.tag();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element(tag17, "<hi!>\n hi!\n</hi!>");
        int int20 = element19.siblingIndex();
        org.jsoup.select.Elements elements21 = element19.children();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element10 = element4.addClass("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element10.siblingNodes();
        org.jsoup.select.Elements elements13 = element10.getElementsByClass("<hi!>\n <hi!>\n  <hi! class=\"\"> \n  </hi!>\n </hi!>\n</hi!>");
        org.jsoup.nodes.Element element14 = element10.clone();
        org.jsoup.nodes.Node node15 = element14.previousSibling();
        java.util.regex.Pattern pattern16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements17 = element14.getElementsMatchingOwnText(pattern16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        org.jsoup.parser.Tag tag5 = element4.tag();
        org.jsoup.nodes.Element element7 = element4.tagName("hi!.<hi!></hi!>");
        org.jsoup.select.Elements elements10 = element7.getElementsByAttributeValueNot("<<hi!></hi!>></<hi!></hi!>>", "<hi! class=\"<hi!></hi!>\"></hi!><hi!> </hi!>");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements15 = element12.getElementsByAttributeValueNot("<hi! class=\"<hi!></hi!>\"></hi!>", "<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element17 = element12.prepend("<hi!></hi!>");
        org.jsoup.nodes.Element element19 = element17.append("<hi! class=\"\">\n <hi!> \n </hi!>\n</hi!>");
        org.jsoup.select.Elements elements21 = element17.getElementsContainingText("hi!.<hi!.class=\"<hi!></hi!>\"></hi!>");
        boolean boolean22 = element7.equals((java.lang.Object) "hi!.<hi!.class=\"<hi!></hi!>\"></hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.parser.Tag tag6 = element4.tag();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str10 = element9.id();
        org.jsoup.nodes.Element element12 = element9.removeClass("");
        java.lang.String str14 = element12.absUrl("hi!");
        org.jsoup.nodes.Element element16 = element12.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet17 = element16.classNames();
        org.jsoup.nodes.Element element19 = element16.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Attributes attributes20 = element19.attributes();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag6, "<hi! class=\"\"></hi!>", attributes20);
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str25 = element24.id();
        java.lang.Integer int26 = element24.elementSiblingIndex();
        org.jsoup.nodes.Element element27 = element24.empty();
        org.jsoup.parser.Tag tag28 = element27.tag();
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str32 = element31.id();
        java.lang.Integer int33 = element31.elementSiblingIndex();
        java.lang.String str34 = element31.className();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList35 = element31.dataNodes();
        org.jsoup.nodes.Element element38 = element31.attr("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element40 = element31.appendElement("hi!");
        org.jsoup.nodes.Attributes attributes41 = element40.attributes();
        org.jsoup.nodes.Element element42 = new org.jsoup.nodes.Element(tag28, "<hi!>\n <hi!></hi!>\n</hi!>", attributes41);
        org.jsoup.nodes.Element element43 = new org.jsoup.nodes.Element(tag6, "hi!.hi!.\n<hi!></hi!>", attributes41);
        org.jsoup.nodes.Element element45 = new org.jsoup.nodes.Element(tag6, "<<hi!></hi!>></<hi!></hi!>>");
        org.jsoup.nodes.Element element46 = element45.empty();
        org.jsoup.nodes.Element element47 = element46.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList48 = element46.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element50 = element46.child(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(dataNodeList35);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(nodeList48);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
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
        java.util.Set<java.lang.String> strSet14 = element4.classNames();
        org.jsoup.nodes.Node node15 = element4.parentNode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        java.lang.Integer int7 = element4.elementSiblingIndex();
        org.jsoup.select.Elements elements9 = element4.getElementsByIndexGreaterThan(100);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element4.prependElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        org.jsoup.nodes.Element element6 = element1.append("hi!.hi!.<hi!></hi!>");
        boolean boolean8 = element6.hasClass("<hi!>\n</hi!>");
        java.lang.String str9 = element6.tagName();
        org.jsoup.select.Elements elements11 = element6.getElementsByIndexLessThan(1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        int int8 = element7.childNodeSize();
        java.lang.String str9 = element7.nodeName();
        org.jsoup.nodes.Element element10 = element4.appendChild((org.jsoup.nodes.Node) element7);
        int int11 = element10.childNodeSize();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str14 = element13.id();
        java.lang.Integer int15 = element13.elementSiblingIndex();
        org.jsoup.nodes.Element element16 = element13.empty();
        java.lang.String str17 = element16.outerHtml();
        org.jsoup.parser.Tag tag18 = element16.tag();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element(tag18, "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element(tag18, "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str26 = element25.id();
        org.jsoup.nodes.Element element28 = element25.removeClass("");
        java.lang.String str30 = element28.absUrl("hi!");
        org.jsoup.nodes.Element element32 = element28.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet33 = element32.classNames();
        org.jsoup.nodes.Element element35 = element32.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Attributes attributes36 = element35.attributes();
        org.jsoup.nodes.Element element37 = new org.jsoup.nodes.Element(tag18, "<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>", attributes36);
        org.jsoup.nodes.Element element38 = element10.prependChild((org.jsoup.nodes.Node) element37);
        java.lang.String str39 = element37.className();
        org.jsoup.nodes.Element element41 = element37.html("<hi! <hi! class=\"<hi!></hi!>\"></hi!>=\"<hi! class=&quot;<hi!></hi!>&quot;></hi!>\"></hi!>");
        java.util.Map<java.lang.String, java.lang.String> strMap42 = element41.dataset();
        org.jsoup.nodes.Element element44 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str45 = element44.id();
        java.lang.Integer int46 = element44.elementSiblingIndex();
        java.lang.String str47 = element44.cssSelector();
        org.jsoup.nodes.Element element48 = element41.after((org.jsoup.nodes.Node) element44);
        org.jsoup.select.Elements elements50 = element41.getElementsContainingText("<hi!.hi!.\n<hi!></hi!>></hi!.hi!.\n<hi!></hi!>>");
        boolean boolean51 = element41.isBlock();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<hi!></hi!>" + "'", str17, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(elements50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
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
        int int14 = element13.siblingIndex();
        org.jsoup.nodes.Element element15 = element13.previousElementSibling();
        org.jsoup.nodes.Element element17 = element13.addClass("<hi! <hi!>\n <hi!></hi!>\n</hi!>=\"<hi!>\n <hi!></hi!>\n</hi!>\" <hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>=\"<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>\"></hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(element15);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
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
        java.util.regex.Pattern pattern34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements35 = element33.getElementsMatchingText(pattern34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
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
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element15.childNodes();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element20 = element18.appendText("");
        org.jsoup.nodes.Element element22 = element20.removeClass("<hi!></hi!>");
        org.jsoup.select.Elements elements24 = element22.getElementsContainingText("<hi! class=\"\"></hi!>");
        org.jsoup.select.Elements elements26 = element22.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element27 = element15.prependChild((org.jsoup.nodes.Node) element22);
        java.lang.String str28 = element22.outerHtml();
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str32 = element31.className();
        org.jsoup.nodes.Element element34 = element31.html("hi!");
        java.lang.String str35 = element31.outerHtml();
        org.jsoup.nodes.Element element38 = element31.attr("<hi!>\n hi!\n</hi!>", "<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        org.jsoup.select.Elements elements40 = element31.getElementsMatchingText("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element41 = element22.insertChildren((int) (short) 0, (java.util.Collection<org.jsoup.nodes.Element>) elements40);
        java.util.List<org.jsoup.nodes.Node> nodeList42 = element41.childNodes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<hi! class=\"\">\n</hi!>" + "'", str28, "<hi! class=\"\">\n</hi!>");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<hi!>\n hi!\n</hi!>" + "'", str35, "<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(nodeList42);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = element4.empty();
        org.jsoup.nodes.Element element11 = element4.prepend("<hi!>\n</hi!>");
        org.jsoup.select.Elements elements14 = element11.getElementsByAttributeValueEnding("hi!.hi!.<hi!></hi!>", "<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        java.lang.String str15 = element11.ownText();
        boolean boolean17 = element11.hasClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element19 = element11.val("hi!");
        boolean boolean20 = element11.isBlock();
        org.jsoup.select.Elements elements22 = element11.getElementsByIndexGreaterThan((int) (short) 100);
        org.jsoup.nodes.Element element25 = element11.attr("hi!.&lt;hi!.class=\"&lt;hi!&gt;&lt;/hi!&gt;\"&gt;&lt;/hi!&gt;", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element25);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        java.lang.String str6 = element3.nodeName();
        org.jsoup.nodes.Node node7 = element3.nextSibling();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element9.appendText("");
        org.jsoup.nodes.Element element13 = element11.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element15 = element11.toggleClass("");
        org.jsoup.nodes.Element element17 = element15.tagName("hi!");
        org.jsoup.select.Elements elements19 = element15.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element24 = element22.appendText("");
        org.jsoup.nodes.Element element26 = element24.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element28 = element24.toggleClass("");
        org.jsoup.nodes.Element element30 = element28.tagName("hi!");
        org.jsoup.select.Elements elements32 = element28.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element33 = element15.insertChildren((int) (byte) -1, (java.util.Collection<org.jsoup.nodes.Element>) elements32);
        org.jsoup.nodes.Element element35 = element33.removeClass("<hi!></hi!>");
        boolean boolean36 = element3.hasSameValue((java.lang.Object) element35);
        org.jsoup.select.Elements elements38 = element3.getElementsByClass("<hi! class=\"<hi!></hi!>\">\n</hi!>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(elements38);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList3 = element1.childNodesCopy();
        org.jsoup.nodes.Element element5 = element1.appendElement("<hi!>\n <hi!>\n  <hi! class=\"\"> \n  </hi!>\n </hi!>\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = element5.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
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
        org.jsoup.nodes.Attributes attributes25 = element24.attributes();
        java.lang.String str26 = element24.val();
        java.lang.String str27 = element24.tagName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = element4.empty();
        org.jsoup.nodes.Element element11 = element4.prepend("<hi!>\n</hi!>");
        org.jsoup.select.Elements elements14 = element11.getElementsByAttributeValueEnding("hi!.hi!.<hi!></hi!>", "<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        java.lang.String str15 = element11.ownText();
        java.lang.String str16 = element11.cssSelector();
        org.jsoup.parser.Tag tag17 = element11.tag();
        org.jsoup.nodes.Element element20 = element11.attr("<hi!>\n <hi!></hi!>\n</hi!>", true);
        java.lang.String str21 = element20.id();
        org.jsoup.select.Elements elements23 = element20.getElementsByClass("<hi! <hi!>\n <hi!></hi!>\n</hi!>=\"<hi!>\n <hi!></hi!>\n</hi!>\"></hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
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
        org.jsoup.nodes.Element element39 = element35.after("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element("hi!");
        int int42 = element41.childNodeSize();
        boolean boolean44 = element41.hasClass("hi!");
        java.util.regex.Pattern pattern46 = null;
        org.jsoup.select.Elements elements47 = element41.getElementsByAttributeValueMatching("hi!", pattern46);
        org.jsoup.nodes.Element element49 = element41.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element52 = element41.attr("hi!.hi!.<hi!></hi!>", "<hi!></hi!>");
        org.jsoup.select.Elements elements55 = element41.getElementsByAttributeValueStarting("hi!", "hi!.hi!.<hi!></hi!>");
        java.util.Set<java.lang.String> strSet56 = element41.classNames();
        org.jsoup.nodes.Element element57 = element35.classNames(strSet56);
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList58 = element57.dataNodes();
        org.jsoup.nodes.Element element60 = element57.after("<hi! <hi!>\n <hi!></hi!>\n</hi!>=\"<hi!>\n <hi!></hi!>\n</hi!>\"></hi!>");
        java.util.Map<java.lang.String, java.lang.String> strMap61 = element60.dataset();
        org.jsoup.nodes.Element element62 = element20.after((org.jsoup.nodes.Node) element60);
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList63 = element20.dataNodes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(elements55);
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(dataNodeList58);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertNotNull(strMap61);
        org.junit.Assert.assertNotNull(element62);
        org.junit.Assert.assertNotNull(dataNodeList63);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
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
        org.jsoup.select.Elements elements14 = element12.getElementsByIndexEquals(100);
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str17 = element16.id();
        java.lang.Integer int18 = element16.elementSiblingIndex();
        org.jsoup.nodes.Element element19 = element16.empty();
        java.lang.String str20 = element19.outerHtml();
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element("hi!");
        int int23 = element22.childNodeSize();
        java.lang.String str24 = element22.nodeName();
        org.jsoup.nodes.Element element25 = element19.appendChild((org.jsoup.nodes.Node) element22);
        org.jsoup.nodes.Element element27 = element19.html("<hi!></hi!>");
        org.jsoup.select.Elements elements29 = element19.getElementsByClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element33 = element31.appendText("");
        org.jsoup.nodes.Element element35 = element33.removeClass("<hi!></hi!>");
        org.jsoup.select.Elements elements37 = element35.getElementsByClass("hi!");
        java.lang.String str38 = element35.val();
        boolean boolean40 = element35.hasClass("hi!");
        org.jsoup.nodes.Element element41 = element19.appendChild((org.jsoup.nodes.Node) element35);
        org.jsoup.nodes.Node node42 = element35.unwrap();
        org.jsoup.nodes.Element element43 = element12.prependChild((org.jsoup.nodes.Node) element35);
        org.jsoup.select.Elements elements45 = element12.getElementsContainingText("hi!.&lt;hi!.class=\"&lt;hi!&gt;&lt;/hi!&gt;\"&gt;&lt;/hi!&gt;");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<hi!></hi!>" + "'", str20, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(elements45);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element10 = element4.append("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.select.Elements elements13 = element10.getElementsByAttributeValueNot("<hi! class=\"\"></hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Node node14 = element10.root();
        org.jsoup.select.Elements elements16 = element10.getElementsMatchingText("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Node node17 = element10.parentNode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        java.util.Set<java.lang.String> strSet4 = element3.classNames();
        java.lang.Integer int5 = element3.elementSiblingIndex();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element9 = element7.removeClass("hi!");
        org.jsoup.select.Elements elements11 = element7.getElementsByIndexLessThan(100);
        java.lang.String str12 = element7.id();
        org.jsoup.nodes.Element element14 = element7.prepend("<hi!>\n</hi!>");
        boolean boolean15 = element3.equals((java.lang.Object) element14);
        org.jsoup.parser.Tag tag16 = element14.tag();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str20 = element19.id();
        org.jsoup.nodes.Element element22 = element19.removeClass("");
        java.lang.String str24 = element22.absUrl("hi!");
        org.jsoup.nodes.Element element26 = element22.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet27 = element26.classNames();
        org.jsoup.nodes.Element element29 = element26.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element31 = element29.html("");
        org.jsoup.nodes.Element element33 = element31.removeClass("<hi!>\n</hi!>");
        java.util.regex.Pattern pattern35 = null;
        org.jsoup.select.Elements elements36 = element33.getElementsByAttributeValueMatching("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>", pattern35);
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element40 = element38.appendText("");
        org.jsoup.nodes.Element element42 = element40.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element44 = element40.toggleClass("");
        org.jsoup.nodes.Element element46 = element40.appendElement("hi!");
        org.jsoup.nodes.Element element47 = element33.appendChild((org.jsoup.nodes.Node) element46);
        org.jsoup.nodes.Attributes attributes48 = element47.attributes();
        org.jsoup.nodes.Element element49 = new org.jsoup.nodes.Element(tag16, "<hi! class=\"\">\n <hi!> \n  <hi! class=\"\"></hi!> \n </hi!>hi!.hi!.hi!.\n <hi!></hi!>\n</hi!>", attributes48);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(attributes48);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.parser.Tag tag6 = element4.tag();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element(tag6, "hi!.hi!.<hi!></hi!>");
        java.lang.String str9 = element8.className();
        org.jsoup.nodes.Element element11 = element8.html("hi!.hi!.");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str14 = element13.id();
        java.lang.Integer int15 = element13.elementSiblingIndex();
        org.jsoup.nodes.Element element16 = element13.empty();
        java.lang.String str17 = element16.outerHtml();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        int int20 = element19.childNodeSize();
        java.lang.String str21 = element19.nodeName();
        org.jsoup.nodes.Element element22 = element16.appendChild((org.jsoup.nodes.Node) element19);
        org.jsoup.select.Elements elements23 = element16.siblingElements();
        org.jsoup.nodes.Element element25 = element16.removeClass("");
        boolean boolean26 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element16);
        org.jsoup.select.Elements elements28 = element16.getElementsByIndexEquals((int) (short) 1);
        org.jsoup.nodes.Element element29 = element11.prependChild((org.jsoup.nodes.Node) element16);
        org.jsoup.select.Elements elements30 = element29.children();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<hi!></hi!>" + "'", str17, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements30);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexLessThan((int) (byte) 0);
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element7.childNodes();
        org.jsoup.nodes.Node node11 = element7.previousSibling();
        org.jsoup.nodes.Node node12 = element7.previousSibling();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
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
        org.jsoup.select.Elements elements28 = element4.getElementsByIndexGreaterThan((int) ' ');
        org.jsoup.parser.Tag tag29 = element4.tag();
        boolean boolean30 = element4.hasText();
        org.jsoup.nodes.Element element31 = element4.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = element31.cssSelector();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(element31);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        java.lang.String str4 = element1.className();
        org.jsoup.nodes.Element element7 = element1.attr("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>", false);
        org.jsoup.select.Elements elements9 = element1.getElementsByAttributeStarting("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        org.jsoup.select.Elements elements12 = element1.getElementsByAttributeValueEnding("<hi!>\n <hi! class=\"\">\n   hi! \n </hi!>\n</hi!>", "<hi! <hi!>\n <hi!></hi!>\n</hi!>=\"<hi!>\n <hi!></hi!>\n</hi!>\"></hi!>");
        org.jsoup.select.Elements elements14 = element1.getElementsContainingOwnText("hi!.hi!.\n<hi!></hi!>");
        java.lang.String str15 = element1.tagName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
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
        org.jsoup.nodes.Element element23 = element20.tagName("hi!");
        org.jsoup.nodes.Element element25 = element20.toggleClass("<hi!>\n</hi!>");
        java.lang.String str26 = element25.html();
        int int27 = element25.childNodeSize();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(textNodeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<hi!>\n</hi!>\n<hi!></hi!>" + "'", str26, "<hi!>\n</hi!>\n<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element10 = element4.addClass("");
        java.lang.String str11 = element10.toString();
        org.jsoup.select.Elements elements13 = element10.getElementsByAttributeStarting("<hi!>\n</hi!>");
        java.lang.String str14 = element10.data();
        org.jsoup.nodes.Element element17 = element10.attr("<hi!>\n hi!\n</hi!>", "<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>");
        org.jsoup.nodes.Element element19 = element17.text("");
        java.lang.String str20 = element17.tagName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<hi! class=\"\"></hi!>" + "'", str11, "<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        org.jsoup.select.Elements elements11 = element8.getElementsByAttributeValueStarting("hi!.hi!.<hi!></hi!>", "hi!");
        java.lang.String str12 = element8.data();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str15 = element14.id();
        java.lang.Integer int16 = element14.elementSiblingIndex();
        org.jsoup.select.Elements elements17 = element14.getAllElements();
        org.jsoup.nodes.Element element19 = element14.appendText("<hi! class=\"<hi!></hi!>\"></hi!><hi!> </hi!>");
        org.jsoup.select.Elements elements21 = element14.getElementsByIndexLessThan(0);
        // The following exception was thrown during execution in test generation
        try {
            element8.replaceWith((org.jsoup.nodes.Node) element14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element1.nodeName();
        org.jsoup.nodes.Element element6 = element1.empty();
        org.jsoup.parser.Tag tag7 = element1.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str11 = element10.id();
        java.lang.Integer int12 = element10.elementSiblingIndex();
        java.lang.String str13 = element10.className();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList14 = element10.dataNodes();
        org.jsoup.select.Elements elements16 = element10.getElementsByTag("hi!");
        org.jsoup.parser.Tag tag17 = element10.tag();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element22 = element20.appendText("");
        org.jsoup.nodes.Element element24 = element22.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element26 = element22.toggleClass("");
        org.jsoup.nodes.Attributes attributes27 = element26.attributes();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag17, "", attributes27);
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str32 = element31.id();
        java.lang.Integer int33 = element31.elementSiblingIndex();
        org.jsoup.nodes.Element element34 = element31.empty();
        java.lang.String str35 = element34.outerHtml();
        org.jsoup.parser.Tag tag36 = element34.tag();
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element(tag36, "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element40 = new org.jsoup.nodes.Element(tag36, "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element43 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str44 = element43.id();
        org.jsoup.nodes.Element element46 = element43.removeClass("");
        java.lang.String str48 = element46.absUrl("hi!");
        org.jsoup.nodes.Element element50 = element46.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet51 = element50.classNames();
        org.jsoup.nodes.Element element53 = element50.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Attributes attributes54 = element53.attributes();
        org.jsoup.nodes.Element element55 = new org.jsoup.nodes.Element(tag36, "<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>", attributes54);
        org.jsoup.nodes.Element element56 = new org.jsoup.nodes.Element(tag17, "<hi!>\n <hi!></hi!>\n</hi!>", attributes54);
        org.jsoup.nodes.Element element57 = new org.jsoup.nodes.Element(tag7, "<hi! class=\"<hi!></hi!>\"></hi!>", attributes54);
        boolean boolean59 = element57.hasAttr("<hi! class=\"<hi!></hi!>\" hi!=\"<hi! class=&quot;&quot;>\n <hi!></hi!>\n <hi!>\n </hi!>\n</hi!>\">\n <hi! class=\"hi!.hi!.<hi!></hi!>\"></hi!>&lt;hi! class=\"\"&gt; hi!.hi!. &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(dataNodeList14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<hi!></hi!>" + "'", str35, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(attributes54);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
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
        java.lang.String str15 = element4.text();
        org.jsoup.nodes.Element element17 = element4.appendText("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element19 = element4.toggleClass("<hi!>\n <hi!>\n  <hi! class=\"\"> \n  </hi!>\n </hi!>\n</hi!>");
        org.jsoup.nodes.Element element22 = element19.attr("<hi! class=\"<hi! <hi! class=&quot;&quot;>\n</hi!>></hi!>\" value=\"hi!.hi!.<hi!></hi!>\">\n <hi!></hi!>\n</hi!>", "hi!.hi!.hi!.<hi!></hi!>");
        boolean boolean23 = element22.hasText();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str26 = element25.id();
        java.lang.Integer int27 = element25.elementSiblingIndex();
        org.jsoup.nodes.Element element28 = element25.empty();
        java.lang.String str29 = element28.outerHtml();
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element("hi!");
        int int32 = element31.childNodeSize();
        java.lang.String str33 = element31.nodeName();
        org.jsoup.nodes.Element element34 = element28.appendChild((org.jsoup.nodes.Node) element31);
        org.jsoup.select.Elements elements36 = element34.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element40 = element38.appendText("");
        int int41 = element40.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList42 = element40.textNodes();
        java.lang.String str43 = element40.data();
        org.jsoup.nodes.Element element44 = element34.prependChild((org.jsoup.nodes.Node) element40);
        java.util.Set<java.lang.String> strSet45 = element44.classNames();
        org.jsoup.nodes.Element element47 = element44.tagName("hi!");
        java.lang.String str48 = element44.className();
        org.jsoup.nodes.Element element50 = element44.appendText("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        java.lang.String str51 = element44.val();
        org.jsoup.nodes.Element element53 = element44.prependElement("<<hi!></hi!>></<hi!></hi!>>");
        // The following exception was thrown during execution in test generation
        try {
            element22.replaceWith((org.jsoup.nodes.Node) element53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<hi!></hi!>" + "'", str29, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(textNodeList42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(element53);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.val("<hi!></hi!>");
        org.jsoup.parser.Tag tag4 = element1.tag();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str8 = element7.id();
        java.lang.Integer int9 = element7.elementSiblingIndex();
        org.jsoup.nodes.Element element10 = element7.empty();
        java.lang.String str11 = element10.outerHtml();
        org.jsoup.parser.Tag tag12 = element10.tag();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag12, "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag12, "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str20 = element19.id();
        java.lang.Integer int21 = element19.elementSiblingIndex();
        org.jsoup.nodes.Element element22 = element19.empty();
        java.lang.String str23 = element22.outerHtml();
        org.jsoup.parser.Tag tag24 = element22.tag();
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str28 = element27.id();
        org.jsoup.nodes.Element element30 = element27.removeClass("");
        java.lang.String str32 = element30.absUrl("hi!");
        org.jsoup.nodes.Element element34 = element30.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet35 = element34.classNames();
        org.jsoup.nodes.Element element37 = element34.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Attributes attributes38 = element37.attributes();
        org.jsoup.nodes.Element element39 = new org.jsoup.nodes.Element(tag24, "<hi! class=\"\"></hi!>", attributes38);
        org.jsoup.nodes.Element element40 = new org.jsoup.nodes.Element(tag12, "<hi!></hi!>", attributes38);
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element(tag4, "", attributes38);
        org.jsoup.nodes.Element element43 = new org.jsoup.nodes.Element(tag4, "<hi! value=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element45 = element43.prependText("<<hi!>\n</hi!> value=\"<hi! class=&quot;&quot;></hi!>\">\n <hi! class=\"\">\n   hi!.hi!. \n  <hi!></hi!> \n </hi!>\n</<hi!>\n</hi!>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node46 = element45.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<hi!></hi!>" + "'", str11, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<hi!></hi!>" + "'", str23, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNotNull(element45);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        java.lang.Integer int7 = element4.elementSiblingIndex();
        org.jsoup.select.Elements elements9 = element4.getElementsByIndexGreaterThan(100);
        org.jsoup.nodes.Element element11 = element4.appendText("<<hi!>\n</hi!> value=\"<hi! class=&quot;&quot;></hi!>\">\n <hi! class=\"\">\n   hi!.hi!. \n  <hi!></hi!> \n </hi!>\n</<hi!>\n</hi!>>");
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = element11.traverse(nodeVisitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
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
        java.lang.String str18 = element4.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<hi! value=\"<hi!>\n hi!\n</hi!>\">\n <hi!></hi!>\n</hi!>" + "'", str18, "<hi! value=\"<hi!>\n hi!\n</hi!>\">\n <hi!></hi!>\n</hi!>");
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
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
        org.jsoup.nodes.Element element17 = element13.prepend("<hi!> <hi!></hi!> </hi!>hi!");
        org.jsoup.select.NodeVisitor nodeVisitor18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = element13.traverse(nodeVisitor18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "<hi!></hi!>", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!.hi!.<hi!></hi!>" + "'", str14, "hi!.hi!.<hi!></hi!>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
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
        org.jsoup.nodes.Element element27 = element25.removeClass("<hi!></hi!>");
        org.jsoup.select.Elements elements29 = element25.getElementsByIndexEquals((int) 'a');
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str32 = element31.id();
        java.lang.Integer int33 = element31.elementSiblingIndex();
        org.jsoup.nodes.Element element34 = element31.empty();
        java.lang.String str35 = element31.nodeName();
        java.util.Set<java.lang.String> strSet36 = element31.classNames();
        org.jsoup.nodes.Element element37 = element25.classNames(strSet36);
        int int38 = element37.childNodeSize();
        org.jsoup.nodes.Element element40 = element37.removeClass("<<hi!>\n</hi!> value=\"<hi! class=&quot;&quot;></hi!>\">\n <hi! class=\"\">\n   hi!.hi!. \n  <hi!></hi!> \n </hi!>\n</<hi!>\n</hi!>>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(element40);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = element4.previousElementSibling();
        java.util.regex.Pattern pattern11 = null;
        org.jsoup.select.Elements elements12 = element4.getElementsByAttributeValueMatching("<hi!>\n</hi!>", pattern11);
        org.jsoup.select.Elements elements13 = element4.children();
        boolean boolean15 = element4.hasAttr("<hi! class=\"\" value=\"hi!.hi!.<hi!></hi!>\"></hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
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
        java.lang.Integer int15 = element13.elementSiblingIndex();
        org.jsoup.nodes.Element element16 = element13.empty();
        java.lang.String str17 = element16.outerHtml();
        org.jsoup.parser.Tag tag18 = element16.tag();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str22 = element21.id();
        org.jsoup.nodes.Element element24 = element21.removeClass("");
        java.lang.String str26 = element24.absUrl("hi!");
        org.jsoup.nodes.Element element28 = element24.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet29 = element28.classNames();
        org.jsoup.nodes.Element element31 = element28.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Attributes attributes32 = element31.attributes();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element(tag18, "<hi! class=\"\"></hi!>", attributes32);
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element(tag6, "<hi!></hi!>", attributes32);
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element38 = element36.val("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList39 = element36.siblingNodes();
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element43 = element41.appendText("");
        org.jsoup.nodes.Element element45 = element43.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element47 = element43.toggleClass("");
        org.jsoup.nodes.Element element49 = element47.tagName("hi!");
        boolean boolean50 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element49);
        org.jsoup.nodes.Element element51 = element36.appendChild((org.jsoup.nodes.Node) element49);
        java.lang.String str52 = element49.text();
        boolean boolean53 = element34.equals((java.lang.Object) element49);
        java.util.List<org.jsoup.nodes.Node> nodeList54 = element49.siblingNodes();
        org.jsoup.nodes.Element element56 = element49.html("<hi!></hi!>");
        org.jsoup.nodes.Element element58 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element60 = element58.val("<hi!></hi!>");
        java.util.Map<java.lang.String, java.lang.String> strMap61 = element60.dataset();
        java.util.Set<java.lang.String> strSet62 = element60.classNames();
        org.jsoup.nodes.Element element64 = element60.prepend("<hi! class=\"\" value=\"<hi!.hi!.></hi!.hi!.>\"></hi!>");
        org.jsoup.nodes.Element element65 = element49.appendChild((org.jsoup.nodes.Node) element64);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element67 = element65.child((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<hi!></hi!>" + "'", str17, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(nodeList54);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertNotNull(strMap61);
        org.junit.Assert.assertNotNull(strSet62);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertNotNull(element65);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        org.jsoup.nodes.Element element8 = element4.append("hi!");
        org.jsoup.nodes.Element element10 = element8.addClass("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str13 = element12.id();
        java.lang.Integer int14 = element12.elementSiblingIndex();
        org.jsoup.nodes.Element element15 = element12.empty();
        java.lang.String str16 = element15.outerHtml();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        int int19 = element18.childNodeSize();
        java.lang.String str20 = element18.nodeName();
        org.jsoup.nodes.Element element21 = element15.appendChild((org.jsoup.nodes.Node) element18);
        org.jsoup.nodes.Element element23 = element18.text("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element24 = element8.prependChild((org.jsoup.nodes.Node) element23);
        org.jsoup.nodes.Element element26 = element8.appendElement("<hi! class=\"\">\n</hi!>");
        org.jsoup.select.Elements elements29 = element26.getElementsByAttributeValueContaining("<hi! value=\"<hi!></hi!>\"></hi!>", "<hi!>\n &lt;hi! class=\"\"&gt; &lt;/hi!&gt;\n</hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<hi!></hi!>" + "'", str16, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements29);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        int int8 = element7.childNodeSize();
        java.lang.String str9 = element7.nodeName();
        org.jsoup.nodes.Element element10 = element4.appendChild((org.jsoup.nodes.Node) element7);
        org.jsoup.nodes.Element element11 = element7.nextElementSibling();
        java.lang.String str13 = element7.attr("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element16 = element7.attr("<hi! class=\"<hi!></hi!>\"></hi!>", false);
        java.lang.String str17 = element7.toString();
        org.jsoup.nodes.Element element19 = element7.after("<hi! class=\"\" value=\"<hi!.hi!.></hi!.hi!.>\"></hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<hi!></hi!>" + "'", str17, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
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
        org.jsoup.nodes.Element element17 = element15.val("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element19 = element17.tagName("<hi! class=\"<hi!></hi!>\">\n</hi!>");
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str22 = element21.id();
        java.lang.Integer int23 = element21.elementSiblingIndex();
        org.jsoup.nodes.Element element24 = element21.empty();
        java.lang.String str25 = element24.outerHtml();
        org.jsoup.select.Elements elements28 = element24.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        boolean boolean29 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element24);
        boolean boolean31 = element24.hasAttr("hi!");
        java.lang.String str32 = element24.baseUri();
        org.jsoup.nodes.Element element34 = element24.prependElement("<hi!></hi!>&lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt;");
        org.jsoup.select.Elements elements36 = element34.getElementsMatchingText("hi!.<hi!.class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element37 = element19.appendChild((org.jsoup.nodes.Node) element34);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element39 = element37.before("hi!.<hi!.class=\"<hi!></hi!>\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<hi!></hi!>" + "'", str25, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(element37);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element10 = element4.addClass("");
        java.lang.String str11 = element10.toString();
        org.jsoup.select.Elements elements13 = element10.getElementsByAttributeStarting("<hi!>\n</hi!>");
        java.lang.String str14 = element10.data();
        org.jsoup.nodes.Element element16 = element10.val("<hi!.hi!.></hi!.hi!.>");
        java.lang.String str17 = element10.outerHtml();
        org.jsoup.nodes.Node node18 = element10.previousSibling();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<hi! class=\"\"></hi!>" + "'", str11, "<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<hi! class=\"\" value=\"<hi!.hi!.></hi!.hi!.>\"></hi!>" + "'", str17, "<hi! class=\"\" value=\"<hi!.hi!.></hi!.hi!.>\"></hi!>");
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("hi!", pattern6);
        java.lang.String str8 = element1.tagName();
        org.jsoup.nodes.Element element10 = element1.addClass("<hi!></hi!>");
        org.jsoup.parser.Tag tag11 = element10.tag();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag11, "hi!.hi!. \n<hi!></hi!>");
        org.jsoup.nodes.Element element15 = element13.prepend("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        int int18 = element17.childNodeSize();
        boolean boolean20 = element17.hasClass("hi!");
        java.util.regex.Pattern pattern22 = null;
        org.jsoup.select.Elements elements23 = element17.getElementsByAttributeValueMatching("hi!", pattern22);
        boolean boolean25 = element17.hasClass("<hi!></hi!>");
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str28 = element27.id();
        org.jsoup.nodes.Element element30 = element27.removeClass("");
        java.lang.String str32 = element30.absUrl("hi!");
        org.jsoup.nodes.Element element34 = element30.append("<hi!></hi!>");
        boolean boolean35 = element17.equals((java.lang.Object) element30);
        org.jsoup.select.Elements elements37 = element17.getElementsMatchingText("hi!.hi!.<hi!></hi!>");
        java.lang.String str38 = element17.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList39 = element17.siblingNodes();
        java.lang.String str41 = element17.absUrl("<hi!>\n hi!\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            element13.replaceWith((org.jsoup.nodes.Node) element17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<hi!></hi!>" + "'", str38, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList6 = element3.textNodes();
        org.jsoup.nodes.Element element8 = element3.val("<hi!></hi!>");
        org.jsoup.select.Elements elements10 = element3.getElementsContainingOwnText("<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>");
        org.jsoup.select.Elements elements12 = element3.getElementsByClass("<hi! class=\"\" value=\"<hi!></hi!>\">\n</hi!>");
        java.lang.String str13 = element3.val();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(textNodeList6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<hi!></hi!>" + "'", str13, "<hi!></hi!>");
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
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
        org.jsoup.nodes.Element element14 = element12.after("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Attributes attributes15 = element14.attributes();
        element14.remove();
        java.lang.Integer int17 = element14.elementSiblingIndex();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str20 = element19.id();
        org.jsoup.nodes.Element element22 = element19.removeClass("");
        java.lang.String str24 = element22.absUrl("hi!");
        org.jsoup.nodes.Element element26 = element22.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet27 = element26.classNames();
        org.jsoup.nodes.Element element29 = element26.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element31 = element29.html("");
        org.jsoup.nodes.Element element33 = element31.removeClass("<hi!>\n</hi!>");
        java.util.regex.Pattern pattern35 = null;
        org.jsoup.select.Elements elements36 = element33.getElementsByAttributeValueMatching("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>", pattern35);
        org.jsoup.nodes.Node node37 = element33.root();
        org.jsoup.nodes.Element element39 = new org.jsoup.nodes.Element("hi!");
        int int40 = element39.childNodeSize();
        org.jsoup.nodes.Element element42 = element39.val("hi!");
        java.lang.String str43 = element42.text();
        org.jsoup.nodes.Element element44 = element33.appendChild((org.jsoup.nodes.Node) element42);
        org.jsoup.select.Elements elements47 = element44.getElementsByAttributeValueMatching("<hi! class=\"\">\n <hi!></hi!>&lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>", "<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element48 = element14.after((org.jsoup.nodes.Node) element44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(elements47);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
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
        java.lang.Integer int15 = element13.elementSiblingIndex();
        org.jsoup.nodes.Element element16 = element13.empty();
        java.lang.String str17 = element16.outerHtml();
        org.jsoup.parser.Tag tag18 = element16.tag();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str22 = element21.id();
        org.jsoup.nodes.Element element24 = element21.removeClass("");
        java.lang.String str26 = element24.absUrl("hi!");
        org.jsoup.nodes.Element element28 = element24.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet29 = element28.classNames();
        org.jsoup.nodes.Element element31 = element28.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Attributes attributes32 = element31.attributes();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element(tag18, "<hi! class=\"\"></hi!>", attributes32);
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element(tag6, "<hi!></hi!>", attributes32);
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element38 = element36.val("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList39 = element36.siblingNodes();
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element43 = element41.appendText("");
        org.jsoup.nodes.Element element45 = element43.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element47 = element43.toggleClass("");
        org.jsoup.nodes.Element element49 = element47.tagName("hi!");
        boolean boolean50 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element49);
        org.jsoup.nodes.Element element51 = element36.appendChild((org.jsoup.nodes.Node) element49);
        java.lang.String str52 = element49.text();
        boolean boolean53 = element34.equals((java.lang.Object) element49);
        org.jsoup.nodes.Element element55 = element49.before("hi!.hi!.\n<hi!></hi!>");
        org.jsoup.nodes.Element element57 = new org.jsoup.nodes.Element("hi!");
        int int58 = element57.childNodeSize();
        boolean boolean60 = element57.hasClass("hi!");
        java.util.regex.Pattern pattern62 = null;
        org.jsoup.select.Elements elements63 = element57.getElementsByAttributeValueMatching("hi!", pattern62);
        org.jsoup.nodes.Element element65 = element57.appendText("<hi!></hi!>");
        org.jsoup.select.Elements elements67 = element57.getElementsMatchingOwnText("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element69 = element57.html("<hi! <hi! class=\"\">\n</hi!>></hi!>");
        org.jsoup.nodes.Element element70 = element55.before((org.jsoup.nodes.Node) element69);
        org.jsoup.nodes.Element element72 = element70.appendElement("<hi! class=\"<hi! class=&quot;&quot;>\n hi!.hi!.\n <hi!></hi!>\n</hi!>\">\n</hi!>");
        java.util.Set<java.lang.String> strSet73 = element72.classNames();
        org.jsoup.nodes.Element element75 = element72.prepend("<hi!>\n &lt;hi! class=\"\"&gt; &lt;/hi!&gt;\n</hi!>");
        org.jsoup.select.Elements elements76 = element72.children();
        java.lang.Appendable appendable77 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings79 = null;
        // The following exception was thrown during execution in test generation
        try {
            element72.outerHtmlHead(appendable77, 1, outputSettings79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<hi!></hi!>" + "'", str17, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(elements63);
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertNotNull(elements67);
        org.junit.Assert.assertNotNull(element69);
        org.junit.Assert.assertNotNull(element70);
        org.junit.Assert.assertNotNull(element72);
        org.junit.Assert.assertNotNull(strSet73);
        org.junit.Assert.assertNotNull(element75);
        org.junit.Assert.assertNotNull(elements76);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
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
        org.jsoup.nodes.Element element22 = element15.text("hi!.<hi!.class=\"<hi!></hi!>\"></hi!>");
        java.lang.String str23 = element15.className();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.parser.Tag tag6 = element4.tag();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element(tag6, "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag6, "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Attributes attributes12 = element10.attributes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
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
        java.util.Map<java.lang.String, java.lang.String> strMap21 = element3.dataset();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNodeList5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(textNodeList13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(strMap21);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
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
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str21 = element20.id();
        java.lang.Integer int22 = element20.elementSiblingIndex();
        org.jsoup.nodes.Element element23 = element20.empty();
        java.lang.String str24 = element23.outerHtml();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element("hi!");
        int int27 = element26.childNodeSize();
        java.lang.String str28 = element26.nodeName();
        org.jsoup.nodes.Element element29 = element23.appendChild((org.jsoup.nodes.Node) element26);
        org.jsoup.nodes.Element element31 = element26.addClass("hi!.hi!.<hi!></hi!>");
        java.util.Map<java.lang.String, java.lang.String> strMap32 = element26.dataset();
        org.jsoup.nodes.Element element33 = element15.prependChild((org.jsoup.nodes.Node) element26);
        org.jsoup.nodes.Element element35 = element15.appendText("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element38 = element15.attr("hi!", "<hi! class=\"\">\n <hi!></hi!>\n <hi!>\n </hi!>\n</hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList39 = element38.textNodes();
        java.lang.String str41 = element38.attr("<hi! class=\"\" value=\"hi!.hi!.<hi!></hi!>\"></hi!>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!.<hi!></hi!>" + "'", str17, "hi!.<hi!></hi!>");
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<hi!></hi!>" + "'", str24, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(textNodeList39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.parser.Tag tag6 = element4.tag();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element(tag6, "hi!.hi!.<hi!></hi!>");
        java.util.Set<java.lang.String> strSet9 = element8.classNames();
        org.jsoup.nodes.Element element11 = element8.prependText("hi!");
        org.jsoup.nodes.Element element13 = element8.removeClass("<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>");
        java.lang.String str14 = element8.baseUri();
        org.jsoup.nodes.Element element16 = element8.addClass("<hi!></hi!>&lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt;");
        org.jsoup.select.NodeVisitor nodeVisitor17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = element8.traverse(nodeVisitor17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!.hi!.<hi!></hi!>" + "'", str14, "hi!.hi!.<hi!></hi!>");
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Attributes attributes8 = element7.attributes();
        org.jsoup.nodes.Node node9 = element7.parentNode();
        org.jsoup.select.Elements elements10 = element7.children();
        org.jsoup.nodes.Element element12 = element7.tagName("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        boolean boolean13 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element7);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        java.lang.String str4 = element1.className();
        org.jsoup.nodes.Element element7 = element1.attr("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>", false);
        org.jsoup.nodes.Node node8 = element7.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element7.select("<hi! class=\"<hi! class=&quot;&quot;>\n hi!.hi!.\n <hi!></hi!>\n</hi!>\">\n</hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! class=\"<hi! class=&quot;&quot;>? hi!.hi!.? <hi!></hi!>?</hi!>\">?</hi!>': unexpected token at '<hi! class=\"<hi! class=&quot;&quot;>? hi!.hi!.? <hi!></hi!>?</hi!>\">?</hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = element4.empty();
        org.jsoup.nodes.Element element11 = element4.prepend("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element13 = element11.prependElement("<<hi!>\n</hi!>></<hi!>\n</hi!>>");
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        int int16 = element15.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = element15.childNodesCopy();
        element15.setBaseUri("<hi!></hi!>");
        boolean boolean20 = element11.equals((java.lang.Object) element15);
        java.util.List<org.jsoup.nodes.Node> nodeList21 = element15.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(nodeList21);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Element element9 = element7.prependElement("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str12 = element11.id();
        java.lang.Integer int13 = element11.elementSiblingIndex();
        org.jsoup.nodes.Element element14 = element11.empty();
        java.lang.String str15 = element14.outerHtml();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        int int18 = element17.childNodeSize();
        java.lang.String str19 = element17.nodeName();
        org.jsoup.nodes.Element element20 = element14.appendChild((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Element element22 = element14.html("<hi!></hi!>");
        org.jsoup.nodes.Element element23 = element14.nextElementSibling();
        org.jsoup.nodes.Element element25 = element14.append("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element26 = element9.appendChild((org.jsoup.nodes.Node) element25);
        org.jsoup.select.Elements elements28 = element26.getElementsByIndexLessThan((int) (byte) 10);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<hi!></hi!>" + "'", str15, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements28);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet9 = element8.classNames();
        org.jsoup.nodes.Element element11 = element8.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element13 = element11.html("");
        org.jsoup.nodes.Element element15 = element13.removeClass("<hi!>\n</hi!>");
        org.jsoup.select.Elements elements17 = element13.getElementsByIndexLessThan((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Element element9 = element7.prependElement("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str12 = element11.id();
        java.lang.Integer int13 = element11.elementSiblingIndex();
        org.jsoup.nodes.Element element14 = element11.empty();
        java.lang.String str15 = element14.outerHtml();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        int int18 = element17.childNodeSize();
        java.lang.String str19 = element17.nodeName();
        org.jsoup.nodes.Element element20 = element14.appendChild((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Element element22 = element14.html("<hi!></hi!>");
        org.jsoup.nodes.Element element23 = element14.nextElementSibling();
        org.jsoup.nodes.Element element25 = element14.append("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element26 = element9.appendChild((org.jsoup.nodes.Node) element25);
        org.jsoup.nodes.Element element28 = element26.toggleClass("hi!.<hi!></hi!>");
        java.lang.String str29 = element26.tagName();
        java.lang.String str30 = element26.text();
        org.jsoup.select.Elements elements31 = element26.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = element26.childNodesCopy();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<hi!></hi!>" + "'", str15, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<hi!>\n</hi!>" + "'", str29, "<hi!>\n</hi!>");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(nodeList32);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
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
        org.jsoup.nodes.Element element18 = element16.removeClass("hi!.hi!.\n<hi!></hi!>");
        org.jsoup.select.Elements elements20 = element16.getElementsByIndexEquals((int) '4');
        org.jsoup.nodes.Element element21 = element16.clone();
        org.jsoup.select.Elements elements23 = element16.getElementsByIndexEquals(0);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
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
        org.jsoup.nodes.Element element26 = element3.prependText("<hi! class=\"\" value=\"<hi!></hi!>\">\n</hi!>");
        org.jsoup.nodes.Element element28 = element26.prependText("hi!.<hi!></hi!>");
        org.jsoup.select.NodeVisitor nodeVisitor29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = element26.traverse(nodeVisitor29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNodeList5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(textNodeList13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Element element9 = element7.tagName("hi!");
        org.jsoup.select.Elements elements11 = element7.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element13 = element7.addClass("<hi!></hi!>");
        java.lang.String str14 = element7.ownText();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str17 = element16.id();
        org.jsoup.nodes.Element element19 = element16.removeClass("");
        java.lang.String str21 = element19.absUrl("hi!");
        org.jsoup.nodes.Element element23 = element19.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet24 = element23.classNames();
        org.jsoup.nodes.Element element26 = element23.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element29 = element26.attr("<hi! class=\"\"></hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = element29.siblingNodes();
        org.jsoup.nodes.Element element32 = element29.toggleClass("<hi! class=\"\" value=\"hi!.hi!.<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element34 = element32.text("<hi!>\n hi!.hi!. &lt;hi!&gt;&lt;/hi!&gt;&lt;hi! class=\"\"&gt; &lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element35 = element7.prependChild((org.jsoup.nodes.Node) element34);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element35);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
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
        org.jsoup.select.Elements elements13 = element4.getAllElements();
        int int14 = element4.siblingIndex();
        java.lang.Integer int15 = element4.elementSiblingIndex();
        org.jsoup.nodes.Element element17 = element4.text("hi!");
        org.jsoup.select.Elements elements19 = element17.getElementsByClass("hi!.<hi!.class=\"<hi!></hi!>\"></hi!>");
        java.lang.String str21 = element17.attr("hi!.hi!.<hi!></hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        org.jsoup.nodes.Element element8 = element4.append("hi!");
        org.jsoup.nodes.Element element10 = element8.addClass("hi!.hi!.<hi!></hi!>");
        org.jsoup.select.Elements elements12 = element10.getElementsByTag("<hi!>\n <hi!></hi!>\n</hi!>");
        java.lang.String str13 = element10.baseUri();
        boolean boolean14 = element10.hasText();
        org.jsoup.nodes.Element element16 = element10.prependText("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Node node17 = element16.root();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str20 = element19.id();
        java.lang.Integer int21 = element19.elementSiblingIndex();
        org.jsoup.nodes.Element element22 = element19.empty();
        java.lang.String str23 = element22.outerHtml();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element("hi!");
        int int26 = element25.childNodeSize();
        java.lang.String str27 = element25.nodeName();
        org.jsoup.nodes.Element element28 = element22.appendChild((org.jsoup.nodes.Node) element25);
        org.jsoup.nodes.Element element30 = element25.text("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Node node31 = element25.unwrap();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = node31.childNodesCopy();
        boolean boolean33 = node17.hasSameValue((java.lang.Object) nodeList32);
        boolean boolean34 = org.jsoup.nodes.Element.preserveWhitespace(node17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<hi!></hi!>" + "'", str23, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("hi!", pattern6);
        boolean boolean9 = element1.hasClass("<hi!></hi!>");
        int int10 = element1.siblingIndex();
        org.jsoup.select.Elements elements11 = element1.siblingElements();
        java.lang.String str12 = element1.tagName();
        org.jsoup.nodes.Element element13 = element1.parent();
        org.jsoup.select.Elements elements15 = element1.getElementsMatchingOwnText("<hi! class=\"hi!.hi!.<hi!></hi!>\">\n hi!\n</hi!>");
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element19 = element17.appendText("");
        int int20 = element19.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList21 = element19.textNodes();
        org.jsoup.nodes.Node node22 = element19.parentNode();
        org.jsoup.nodes.Element element24 = element19.text("");
        org.jsoup.select.Elements elements27 = element19.getElementsByAttributeValue("<hi!>\n <hi! class=\"\">\n   hi! \n </hi!>\n</hi!>", "<hi! <hi! class=\"\">\n</hi!>></hi!>");
        int int28 = element19.siblingIndex();
        org.jsoup.nodes.Element element29 = element1.prependChild((org.jsoup.nodes.Node) element19);
        org.jsoup.select.Elements elements31 = element1.getElementsByIndexLessThan(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(textNodeList21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements31);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
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
        java.lang.String str51 = element8.nodeName();
        int int52 = element8.siblingIndex();
        java.util.Map<java.lang.String, java.lang.String> strMap53 = element8.dataset();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<hi!></hi!>" + "'", str30, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertNotNull(strSet47);
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(strMap53);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Element element9 = element7.toggleClass("<hi!></hi!>");
        java.lang.String str10 = element9.data();
        java.lang.String str11 = element9.id();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = element9.childNode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        org.jsoup.nodes.Element element8 = element4.append("hi!");
        org.jsoup.nodes.Element element10 = element8.addClass("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str13 = element12.id();
        java.lang.Integer int14 = element12.elementSiblingIndex();
        org.jsoup.nodes.Element element15 = element12.empty();
        java.lang.String str16 = element15.outerHtml();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        int int19 = element18.childNodeSize();
        java.lang.String str20 = element18.nodeName();
        org.jsoup.nodes.Element element21 = element15.appendChild((org.jsoup.nodes.Node) element18);
        org.jsoup.nodes.Element element23 = element18.text("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element24 = element8.prependChild((org.jsoup.nodes.Node) element23);
        org.jsoup.nodes.Element element26 = element8.appendElement("<hi! class=\"\">\n</hi!>");
        org.jsoup.nodes.Element element28 = element26.prepend("hi!.hi!.");
        java.util.Map<java.lang.String, java.lang.String> strMap29 = element28.dataset();
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str32 = element31.id();
        java.lang.Integer int33 = element31.elementSiblingIndex();
        org.jsoup.nodes.Element element34 = element31.empty();
        java.lang.String str35 = element34.outerHtml();
        org.jsoup.select.Elements elements38 = element34.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element40 = element34.addClass("");
        java.lang.String str41 = element40.toString();
        org.jsoup.select.Elements elements43 = element40.getElementsByAttributeStarting("<hi!>\n</hi!>");
        java.lang.String str44 = element40.data();
        org.jsoup.nodes.Element element47 = element40.attr("<hi!>\n hi!\n</hi!>", "<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>");
        org.jsoup.parser.Tag tag48 = element47.tag();
        org.jsoup.nodes.Element element49 = element47.empty();
        org.jsoup.nodes.Element element51 = element49.appendElement("<hi!></hi!>&lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt;");
        java.util.regex.Pattern pattern53 = null;
        org.jsoup.select.Elements elements54 = element51.getElementsByAttributeValueMatching("&lt;&lt;hi!&gt; &lt;/hi!&gt;&gt;&lt;/&lt;hi!&gt; &lt;/hi!&gt;&gt;", pattern53);
        org.jsoup.nodes.Element element55 = element28.appendChild((org.jsoup.nodes.Node) element51);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<hi!></hi!>" + "'", str16, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<hi!></hi!>" + "'", str35, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<hi! class=\"\"></hi!>" + "'", str41, "<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(elements54);
        org.junit.Assert.assertNotNull(element55);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
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
        org.jsoup.nodes.Element element21 = element17.parent();
        java.lang.Integer int22 = element21.elementSiblingIndex();
        org.jsoup.select.Elements elements24 = element21.getElementsByIndexEquals((int) (byte) 10);
        java.lang.String str25 = element21.tagName();
        org.jsoup.select.Elements elements28 = element21.getElementsByAttributeValueStarting("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>", "<hi! hi!.hi!.<hi!></hi!>=\"<hi!></hi!>\" class=\"\">\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<hi!></hi!>" + "'", str12, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(elements28);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
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
        java.lang.String str16 = element4.cssSelector();
        org.jsoup.select.Elements elements19 = element4.getElementsByAttributeValueMatching("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>", "<hi! class=\"\">\n</hi!>");
        org.jsoup.nodes.Element element21 = element4.prependText("hi!.hi!.");
        boolean boolean22 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element4);
        int int23 = element4.childNodeSize();
        org.jsoup.select.Elements elements25 = element4.getElementsMatchingOwnText("<hi! class=\"\" value=\"<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>\">\n</hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element10 = element4.addClass("");
        org.jsoup.select.Elements elements12 = element4.getElementsByTag("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str15 = element14.id();
        java.lang.Integer int16 = element14.elementSiblingIndex();
        org.jsoup.nodes.Element element17 = element14.empty();
        java.lang.String str18 = element17.outerHtml();
        org.jsoup.select.Elements elements21 = element17.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element23 = element17.addClass("");
        java.lang.String str24 = element23.toString();
        org.jsoup.select.Elements elements26 = element23.getElementsByAttributeStarting("<hi!>\n</hi!>");
        boolean boolean27 = element4.hasSameValue((java.lang.Object) elements26);
        org.jsoup.nodes.Element element29 = element4.addClass("<<hi!>\n</hi!>></<hi!>\n</hi!>>");
        org.jsoup.select.Elements elements30 = element4.children();
        org.jsoup.nodes.Node node31 = element4.root();
        org.jsoup.select.Elements elements34 = element4.getElementsByAttributeValueContaining("<hi! value=\"<hi!></hi!>\">\n <hi! class=\"\">\n </hi!>\n <hi!>\n  <hi!>\n  </hi!>\n  <hi!></hi!>\n </hi!>\n</hi!>", "<hi!.hi!.></hi!.hi!.>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<hi!></hi!>" + "'", str18, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<hi! class=\"\"></hi!>" + "'", str24, "<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(elements34);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
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
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str19 = element18.id();
        java.lang.Integer int20 = element18.elementSiblingIndex();
        org.jsoup.nodes.Element element21 = element18.empty();
        java.lang.String str22 = element21.outerHtml();
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        int int25 = element24.childNodeSize();
        java.lang.String str26 = element24.nodeName();
        org.jsoup.nodes.Element element27 = element21.appendChild((org.jsoup.nodes.Node) element24);
        org.jsoup.select.Elements elements29 = element27.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element33 = element31.appendText("");
        int int34 = element33.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList35 = element33.textNodes();
        java.lang.String str36 = element33.data();
        org.jsoup.nodes.Element element37 = element27.prependChild((org.jsoup.nodes.Node) element33);
        java.util.Set<java.lang.String> strSet38 = element37.classNames();
        org.jsoup.nodes.Element element39 = element1.appendChild((org.jsoup.nodes.Node) element37);
        java.lang.Class<?> wildcardClass40 = element1.getClass();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<hi!></hi!>" + "'", str22, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(textNodeList35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        java.lang.String str3 = element1.nodeName();
        java.lang.String str4 = element1.text();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = element1.siblingNodes();
        java.lang.Integer int6 = element1.elementSiblingIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        org.jsoup.select.Elements elements6 = element3.getElementsContainingOwnText("hi!");
        element3.setBaseUri("");
        org.jsoup.select.Elements elements11 = element3.getElementsByAttributeValueNot("<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>", "<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element13 = element3.text("<hi! class=\"\">&lt;hi!&gt; &lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>");
        boolean boolean14 = element3.isBlock();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
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
        org.jsoup.select.Elements elements15 = element12.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element12.childNodes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        org.jsoup.nodes.Element element8 = element4.append("hi!");
        org.jsoup.nodes.Element element10 = element8.addClass("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str13 = element12.id();
        java.lang.Integer int14 = element12.elementSiblingIndex();
        org.jsoup.nodes.Element element15 = element12.empty();
        java.lang.String str16 = element15.outerHtml();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        int int19 = element18.childNodeSize();
        java.lang.String str20 = element18.nodeName();
        org.jsoup.nodes.Element element21 = element15.appendChild((org.jsoup.nodes.Node) element18);
        org.jsoup.nodes.Element element23 = element18.text("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element24 = element8.prependChild((org.jsoup.nodes.Node) element23);
        org.jsoup.nodes.Element element26 = element8.appendElement("<hi! class=\"\">\n</hi!>");
        java.lang.String str27 = element26.id();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<hi!></hi!>" + "'", str16, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Element element9 = element7.tagName("hi!");
        boolean boolean10 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element9);
        boolean boolean11 = element9.isBlock();
        org.jsoup.nodes.Node node12 = element9.previousSibling();
        java.lang.String str13 = element9.cssSelector();
        org.jsoup.nodes.Node node14 = element9.root();
        org.jsoup.nodes.Node node16 = element9.childNode(0);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        java.lang.String str7 = element4.cssSelector();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        int int11 = element10.childNodeSize();
        boolean boolean13 = element10.hasClass("hi!");
        java.util.regex.Pattern pattern15 = null;
        org.jsoup.select.Elements elements16 = element10.getElementsByAttributeValueMatching("hi!", pattern15);
        org.jsoup.nodes.Element element18 = element10.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element21 = element10.attr("hi!.hi!.<hi!></hi!>", "<hi!></hi!>");
        org.jsoup.select.Elements elements24 = element10.getElementsByAttributeValueStarting("hi!", "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element25 = element4.insertChildren((int) (short) 0, (java.util.Collection<org.jsoup.nodes.Element>) elements24);
        org.jsoup.nodes.Element element27 = element4.prependText("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str30 = element29.id();
        java.lang.Integer int31 = element29.elementSiblingIndex();
        org.jsoup.nodes.Element element32 = element29.empty();
        java.lang.String str33 = element32.outerHtml();
        org.jsoup.nodes.Element element35 = new org.jsoup.nodes.Element("hi!");
        int int36 = element35.childNodeSize();
        java.lang.String str37 = element35.nodeName();
        org.jsoup.nodes.Element element38 = element32.appendChild((org.jsoup.nodes.Node) element35);
        org.jsoup.select.Elements elements39 = element32.siblingElements();
        org.jsoup.nodes.Element element41 = element32.removeClass("");
        org.jsoup.nodes.Element element42 = element41.previousElementSibling();
        boolean boolean43 = element27.hasSameValue((java.lang.Object) element41);
        java.lang.String str44 = element27.data();
        org.jsoup.nodes.Element element46 = element27.prependText("<hi! class=\"\">&lt;hi!&gt; &lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element47 = element46.firstElementSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<hi!></hi!>" + "'", str33, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNull(element42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(element46);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        java.lang.String str3 = element1.nodeName();
        java.lang.String str4 = element1.html();
        org.jsoup.nodes.Element element6 = element1.prepend("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
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
        org.jsoup.nodes.Element element23 = element20.tagName("hi!");
        org.jsoup.nodes.Element element25 = element20.toggleClass("hi!");
        java.lang.String str26 = element25.ownText();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(textNodeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        java.lang.String str6 = element3.nodeName();
        org.jsoup.nodes.Node node7 = element3.nextSibling();
        org.jsoup.nodes.Element element9 = element3.prepend("<hi!>\n</hi!>");
        org.jsoup.select.Elements elements12 = element3.getElementsByAttributeValueContaining("<hi! class=\"\"></hi!>", "<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element13 = element3.previousElementSibling();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNull(element13);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.select.Elements elements5 = element3.getElementsMatchingText("");
        org.jsoup.nodes.Element element7 = element3.prependText("hi!");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element9.appendText("");
        int int12 = element11.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList13 = element11.textNodes();
        java.lang.String str14 = element11.data();
        java.util.Set<java.lang.String> strSet15 = element11.classNames();
        org.jsoup.nodes.Element element16 = element7.classNames(strSet15);
        boolean boolean17 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element7);
        org.jsoup.nodes.Document document18 = element7.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = document18.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(textNodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(document18);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
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
        java.lang.String str21 = element3.html();
        org.jsoup.select.Elements elements23 = element3.getElementsByAttribute("<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>");
        org.jsoup.nodes.Element element25 = element3.prependElement("hi!.hi!.<hi!></hi!>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<hi!></hi!>" + "'", str12, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<hi!>\n <hi!></hi!>\n</hi!>" + "'", str21, "<hi!>\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element25);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element1.nodeName();
        org.jsoup.nodes.Element element6 = element1.empty();
        org.jsoup.nodes.Element element8 = element1.val("<hi!> <hi!></hi!> </hi!>hi!");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element12 = element10.val("<hi!></hi!>");
        org.jsoup.parser.Tag tag13 = element10.tag();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag13, "");
        org.jsoup.select.Elements elements16 = element15.children();
        org.jsoup.nodes.Element element17 = element1.prependChild((org.jsoup.nodes.Node) element15);
        java.util.List<org.jsoup.nodes.Node> nodeList18 = element17.childNodesCopy();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str21 = element20.id();
        org.jsoup.nodes.Element element23 = element20.removeClass("");
        element23.setBaseUri("hi!");
        org.jsoup.select.Elements elements27 = element23.getElementsMatchingText("");
        java.lang.String str28 = element23.toString();
        org.jsoup.nodes.Attributes attributes29 = element23.attributes();
        org.jsoup.select.Elements elements30 = element23.children();
        java.lang.String str31 = element23.cssSelector();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element35 = element33.appendText("");
        int int36 = element35.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList37 = element35.textNodes();
        java.lang.String str38 = element35.nodeName();
        org.jsoup.nodes.Element element40 = element35.text("<hi!></hi!>");
        org.jsoup.nodes.Element element42 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str43 = element42.id();
        java.lang.Integer int44 = element42.elementSiblingIndex();
        org.jsoup.nodes.Element element45 = element42.empty();
        java.lang.String str46 = element45.outerHtml();
        org.jsoup.nodes.Element element48 = new org.jsoup.nodes.Element("hi!");
        int int49 = element48.childNodeSize();
        java.lang.String str50 = element48.nodeName();
        org.jsoup.nodes.Element element51 = element45.appendChild((org.jsoup.nodes.Node) element48);
        org.jsoup.select.Elements elements53 = element51.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element55 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element57 = element55.appendText("");
        int int58 = element57.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList59 = element57.textNodes();
        java.lang.String str60 = element57.data();
        org.jsoup.nodes.Element element61 = element51.prependChild((org.jsoup.nodes.Node) element57);
        java.util.Set<java.lang.String> strSet62 = element61.classNames();
        org.jsoup.nodes.Element element63 = element40.classNames(strSet62);
        org.jsoup.nodes.Element element64 = element23.classNames(strSet62);
        org.jsoup.select.Elements elements66 = element23.getElementsContainingOwnText("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Node node67 = element23.root();
        boolean boolean69 = element23.hasAttr("<hi!></hi!>\n<hi! class=\"\">\n</hi!>");
        org.jsoup.nodes.Element element70 = element17.prependChild((org.jsoup.nodes.Node) element23);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<hi! class=\"\"></hi!>" + "'", str28, "<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(textNodeList37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "<hi!></hi!>" + "'", str46, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(textNodeList59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNotNull(strSet62);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertNotNull(elements66);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(element70);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
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
        org.jsoup.nodes.Node node22 = element14.removeAttr("<hi!></hi!>");
        org.jsoup.nodes.Document document23 = element14.ownerDocument();
        org.jsoup.nodes.Document document24 = element14.ownerDocument();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertNull(document24);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("hi!", pattern6);
        boolean boolean9 = element1.hasClass("<hi!></hi!>");
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str12 = element11.id();
        org.jsoup.nodes.Element element14 = element11.removeClass("");
        java.lang.String str16 = element14.absUrl("hi!");
        org.jsoup.nodes.Element element18 = element14.append("<hi!></hi!>");
        boolean boolean19 = element1.equals((java.lang.Object) element14);
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element23 = element21.val("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = element21.siblingNodes();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element28 = element26.appendText("");
        org.jsoup.nodes.Element element30 = element28.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element32 = element28.toggleClass("");
        org.jsoup.nodes.Element element34 = element32.tagName("hi!");
        boolean boolean35 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element34);
        org.jsoup.nodes.Element element36 = element21.appendChild((org.jsoup.nodes.Node) element34);
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str39 = element38.id();
        java.lang.Integer int40 = element38.elementSiblingIndex();
        org.jsoup.nodes.Element element41 = element38.empty();
        java.lang.String str42 = element41.outerHtml();
        org.jsoup.nodes.Element element44 = new org.jsoup.nodes.Element("hi!");
        int int45 = element44.childNodeSize();
        java.lang.String str46 = element44.nodeName();
        org.jsoup.nodes.Element element47 = element41.appendChild((org.jsoup.nodes.Node) element44);
        org.jsoup.select.Elements elements49 = element47.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element51 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element53 = element51.appendText("");
        int int54 = element53.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList55 = element53.textNodes();
        java.lang.String str56 = element53.data();
        org.jsoup.nodes.Element element57 = element47.prependChild((org.jsoup.nodes.Node) element53);
        java.util.Set<java.lang.String> strSet58 = element57.classNames();
        org.jsoup.nodes.Element element59 = element21.appendChild((org.jsoup.nodes.Node) element57);
        org.jsoup.nodes.Element element60 = element1.appendChild((org.jsoup.nodes.Node) element59);
        org.jsoup.select.Elements elements62 = element59.getElementsByIndexGreaterThan((int) 'a');
        org.jsoup.nodes.Element element64 = element59.after("<hi! <hi! class=\"\">\n</hi!>></hi!>");
        org.jsoup.nodes.Node node65 = element64.parentNode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<hi!></hi!>" + "'", str42, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(textNodeList55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(strSet58);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertNotNull(elements62);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertNotNull(node65);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        int int8 = element7.childNodeSize();
        java.lang.String str9 = element7.nodeName();
        org.jsoup.nodes.Element element10 = element4.appendChild((org.jsoup.nodes.Node) element7);
        int int11 = element10.childNodeSize();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str14 = element13.id();
        java.lang.Integer int15 = element13.elementSiblingIndex();
        org.jsoup.nodes.Element element16 = element13.empty();
        java.lang.String str17 = element16.outerHtml();
        org.jsoup.parser.Tag tag18 = element16.tag();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element(tag18, "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element(tag18, "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str26 = element25.id();
        org.jsoup.nodes.Element element28 = element25.removeClass("");
        java.lang.String str30 = element28.absUrl("hi!");
        org.jsoup.nodes.Element element32 = element28.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet33 = element32.classNames();
        org.jsoup.nodes.Element element35 = element32.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Attributes attributes36 = element35.attributes();
        org.jsoup.nodes.Element element37 = new org.jsoup.nodes.Element(tag18, "<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>", attributes36);
        org.jsoup.nodes.Element element38 = element10.prependChild((org.jsoup.nodes.Node) element37);
        java.lang.String str39 = element37.className();
        org.jsoup.nodes.Element element40 = element37.firstElementSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList41 = element40.siblingNodes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<hi!></hi!>" + "'", str17, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(nodeList41);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element10 = element4.addClass("");
        org.jsoup.select.Elements elements12 = element4.getElementsByTag("hi!.hi!.<hi!></hi!>");
        org.jsoup.select.Elements elements14 = element4.getElementsByIndexEquals((int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("hi!", pattern6);
        org.jsoup.nodes.Element element9 = element1.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str12 = element11.id();
        java.lang.Integer int13 = element11.elementSiblingIndex();
        org.jsoup.nodes.Element element14 = element11.empty();
        java.lang.String str15 = element14.outerHtml();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        int int18 = element17.childNodeSize();
        java.lang.String str19 = element17.nodeName();
        org.jsoup.nodes.Element element20 = element14.appendChild((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Element element22 = element14.html("<hi!></hi!>");
        boolean boolean23 = element9.equals((java.lang.Object) element14);
        boolean boolean24 = element9.isBlock();
        java.lang.String str25 = element9.cssSelector();
        java.lang.String str27 = element9.attr("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element29 = element9.html("<hi! class=\"<hi! <hi! class=&quot;&quot;>\n</hi!>></hi!>\" value=\"hi!.hi!.<hi!></hi!>\">\n <hi!></hi!>\n</hi!>");
        org.jsoup.select.Elements elements31 = element29.getElementsByIndexLessThan((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<hi!></hi!>" + "'", str15, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements31);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Element element9 = element7.prependElement("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str12 = element11.id();
        java.lang.Integer int13 = element11.elementSiblingIndex();
        org.jsoup.nodes.Element element14 = element11.empty();
        java.lang.String str15 = element14.outerHtml();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        int int18 = element17.childNodeSize();
        java.lang.String str19 = element17.nodeName();
        org.jsoup.nodes.Element element20 = element14.appendChild((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Element element22 = element14.html("<hi!></hi!>");
        org.jsoup.nodes.Element element23 = element14.nextElementSibling();
        org.jsoup.nodes.Element element25 = element14.append("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element26 = element9.appendChild((org.jsoup.nodes.Node) element25);
        org.jsoup.nodes.Element element28 = element9.val("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element30 = element9.after("<hi! class=\"\">\n</hi!>");
        org.jsoup.nodes.Element element32 = element30.prepend("<hi! class=\"\">&lt;hi!&gt; &lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element33 = element32.previousElementSibling();
        org.jsoup.nodes.Element element35 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str36 = element35.id();
        org.jsoup.nodes.Element element38 = element35.removeClass("");
        element38.setBaseUri("hi!");
        java.lang.String str41 = element38.tagName();
        java.lang.String str42 = element38.baseUri();
        java.lang.String str44 = element38.attr("<hi! hi!.hi!.<hi!></hi!>=\"<hi!></hi!>\" class=\"\">\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element46 = new org.jsoup.nodes.Element("hi!");
        int int47 = element46.childNodeSize();
        boolean boolean49 = element46.hasClass("hi!");
        java.util.regex.Pattern pattern51 = null;
        org.jsoup.select.Elements elements52 = element46.getElementsByAttributeValueMatching("hi!", pattern51);
        org.jsoup.nodes.Element element53 = element46.empty();
        org.jsoup.select.Elements elements56 = element46.getElementsByAttributeValueNot("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!>\n</hi!>");
        java.util.Set<java.lang.String> strSet57 = element46.classNames();
        org.jsoup.nodes.Element element59 = element46.html("hi!.<hi!></hi!>");
        org.jsoup.select.Elements elements60 = element46.children();
        org.jsoup.nodes.Element element61 = element38.prependChild((org.jsoup.nodes.Node) element46);
        org.jsoup.nodes.Element element62 = element32.before((org.jsoup.nodes.Node) element61);
        org.jsoup.select.Elements elements64 = element62.getElementsByIndexGreaterThan((int) '4');
        boolean boolean66 = element62.hasClass("<hi! class=\"\">\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<hi!></hi!>" + "'", str15, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNull(element33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(elements52);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(elements56);
        org.junit.Assert.assertNotNull(strSet57);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(elements60);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNotNull(element62);
        org.junit.Assert.assertNotNull(elements64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
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
        boolean boolean17 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element13);
        org.jsoup.select.Elements elements19 = element13.getElementsMatchingOwnText("<hi!>\n</hi!>");
        org.jsoup.select.Elements elements20 = element13.siblingElements();
        org.jsoup.select.Elements elements23 = element13.getElementsByAttributeValueMatching("hi! <hi!></hi!>", "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = element13.childNodesCopy();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(textNodeList15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(nodeList24);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi!>\n</hi!>\n<hi!></hi!>");
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
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
        java.lang.Integer int15 = element13.elementSiblingIndex();
        org.jsoup.nodes.Element element16 = element13.empty();
        java.lang.String str17 = element16.outerHtml();
        org.jsoup.parser.Tag tag18 = element16.tag();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str22 = element21.id();
        org.jsoup.nodes.Element element24 = element21.removeClass("");
        java.lang.String str26 = element24.absUrl("hi!");
        org.jsoup.nodes.Element element28 = element24.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet29 = element28.classNames();
        org.jsoup.nodes.Element element31 = element28.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Attributes attributes32 = element31.attributes();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element(tag18, "<hi! class=\"\"></hi!>", attributes32);
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element(tag6, "<hi!></hi!>", attributes32);
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element38 = element36.val("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList39 = element36.siblingNodes();
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element43 = element41.appendText("");
        org.jsoup.nodes.Element element45 = element43.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element47 = element43.toggleClass("");
        org.jsoup.nodes.Element element49 = element47.tagName("hi!");
        boolean boolean50 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element49);
        org.jsoup.nodes.Element element51 = element36.appendChild((org.jsoup.nodes.Node) element49);
        java.lang.String str52 = element49.text();
        boolean boolean53 = element34.equals((java.lang.Object) element49);
        org.jsoup.nodes.Element element55 = element49.before("hi!.hi!.\n<hi!></hi!>");
        org.jsoup.nodes.Element element57 = new org.jsoup.nodes.Element("hi!");
        int int58 = element57.childNodeSize();
        boolean boolean60 = element57.hasClass("hi!");
        java.util.regex.Pattern pattern62 = null;
        org.jsoup.select.Elements elements63 = element57.getElementsByAttributeValueMatching("hi!", pattern62);
        org.jsoup.nodes.Element element65 = element57.appendText("<hi!></hi!>");
        org.jsoup.select.Elements elements67 = element57.getElementsMatchingOwnText("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element69 = element57.html("<hi! <hi! class=\"\">\n</hi!>></hi!>");
        org.jsoup.nodes.Element element70 = element55.before((org.jsoup.nodes.Node) element69);
        org.jsoup.nodes.Element element72 = element70.appendElement("<hi! class=\"<hi! class=&quot;&quot;>\n hi!.hi!.\n <hi!></hi!>\n</hi!>\">\n</hi!>");
        java.util.Set<java.lang.String> strSet73 = element72.classNames();
        java.lang.String str75 = element72.attr("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<hi!></hi!>" + "'", str17, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(elements63);
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertNotNull(elements67);
        org.junit.Assert.assertNotNull(element69);
        org.junit.Assert.assertNotNull(element70);
        org.junit.Assert.assertNotNull(element72);
        org.junit.Assert.assertNotNull(strSet73);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
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
        org.jsoup.nodes.Element element17 = element15.val("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.select.Elements elements19 = element17.getElementsByIndexGreaterThan((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
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
        org.jsoup.nodes.Element element34 = element7.prepend("<hi! class=\"\" value=\"hi!.hi!.<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element35 = element7.empty();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<hi! class=\"\">\n</hi!>" + "'", str29, "<hi! class=\"\">\n</hi!>");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element35);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = element4.empty();
        org.jsoup.nodes.Element element11 = element4.prepend("<hi!>\n</hi!>");
        org.jsoup.select.Elements elements14 = element11.getElementsByAttributeValueEnding("hi!.hi!.<hi!></hi!>", "<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        java.lang.String str15 = element11.ownText();
        java.lang.String str16 = element11.cssSelector();
        org.jsoup.parser.Tag tag17 = element11.tag();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element(tag17, "<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str22 = element21.id();
        java.lang.Integer int23 = element21.elementSiblingIndex();
        org.jsoup.nodes.Element element24 = element21.empty();
        java.lang.String str25 = element24.outerHtml();
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element("hi!");
        int int28 = element27.childNodeSize();
        java.lang.String str29 = element27.nodeName();
        org.jsoup.nodes.Element element30 = element24.appendChild((org.jsoup.nodes.Node) element27);
        org.jsoup.nodes.Element element32 = element24.html("<hi!></hi!>");
        org.jsoup.select.Elements elements34 = element24.getElementsByClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element38 = element36.appendText("");
        org.jsoup.nodes.Element element40 = element38.removeClass("<hi!></hi!>");
        org.jsoup.select.Elements elements42 = element40.getElementsByClass("hi!");
        java.lang.String str43 = element40.val();
        boolean boolean45 = element40.hasClass("hi!");
        org.jsoup.nodes.Element element46 = element24.appendChild((org.jsoup.nodes.Node) element40);
        org.jsoup.select.Elements elements48 = element24.getElementsByIndexGreaterThan((int) ' ');
        org.jsoup.parser.Tag tag49 = element24.tag();
        java.util.Set<java.lang.String> strSet50 = element24.classNames();
        org.jsoup.nodes.Element element51 = element19.classNames(strSet50);
        org.jsoup.nodes.Node node52 = element51.previousSibling();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<hi!></hi!>" + "'", str25, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertNotNull(strSet50);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNull(node52);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet9 = element8.classNames();
        org.jsoup.nodes.Element element11 = element8.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element13 = element11.html("");
        org.jsoup.nodes.Element element15 = element13.removeClass("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element17 = element13.html("<hi! class=\"\">\n</hi!>");
        java.lang.String str19 = element13.absUrl("<hi! value=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Document document20 = element13.ownerDocument();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(document20);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
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
        org.jsoup.nodes.Element element27 = element25.prependText("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Document document28 = element27.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            int int29 = document28.childNodeSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNull(document28);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        java.lang.String str7 = element4.tagName();
        org.jsoup.select.Elements elements9 = element4.getElementsByIndexLessThan((int) (byte) 100);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList10 = element4.textNodes();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = element4.dataset();
        org.jsoup.nodes.Element element13 = element4.appendElement("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        boolean boolean15 = element4.hasClass("<hi!>\n <hi!>\n  <hi! class=\"\"> \n  </hi!>\n </hi!>\n</hi!>");
        boolean boolean16 = element4.isBlock();
        org.jsoup.select.Elements elements18 = element4.getElementsMatchingOwnText("<hi! hi!.hi!.<hi!></hi!>=\"<hi!></hi!>\">\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        java.lang.String str19 = element4.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(textNodeList10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<hi! class=\"\">\n <<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>></<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>>\n</hi!>" + "'", str19, "<hi! class=\"\">\n <<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>></<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>>\n</hi!>");
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        org.jsoup.nodes.Element element8 = element4.append("hi!");
        org.jsoup.nodes.Element element10 = element8.addClass("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element12 = element8.prepend("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element14 = element12.appendElement("<hi! class=\"\"></hi!>");
        java.lang.String str15 = element14.html();
        org.jsoup.nodes.Element element17 = element14.html("<hi! class=\"hi!.hi!.<hi!></hi!>\">\n hi!\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = element17.cssSelector();
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi!': unexpected token at '<hi!'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        java.lang.String str3 = element1.nodeName();
        java.lang.String str4 = element1.text();
        org.jsoup.nodes.Element element5 = element1.empty();
        // The following exception was thrown during execution in test generation
        try {
            element5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        java.lang.String str3 = element1.nodeName();
        java.lang.String str4 = element1.text();
        org.jsoup.nodes.Element element6 = element1.append("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element8 = element1.toggleClass("<hi!>\n hi!.\n <hi!></hi!>\n</hi!>");
        java.lang.String str10 = element8.absUrl("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!.hi!.hi!.<hi!></hi!>");
        java.lang.String str2 = element1.nodeName();
        org.jsoup.select.Elements elements4 = element1.getElementsMatchingOwnText("<hi! class=\"\">\n hi!\n</hi!>");
        java.lang.String str6 = element1.attr("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!.hi!.hi!.<hi!></hi!>" + "'", str2, "hi!.hi!.hi!.<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
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
        org.jsoup.nodes.Element element56 = new org.jsoup.nodes.Element(tag5, "<hi! class=\"\" value=\"<hi!.hi!.></hi!.hi!.>\"></hi!>");
        org.jsoup.nodes.Element element58 = new org.jsoup.nodes.Element(tag5, "<hi! class=\"\">\n <<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>></<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>>\n</hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(dataNodeList19);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<hi!></hi!>" + "'", str34, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(dataNodeList46);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(attributes52);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        java.util.Set<java.lang.String> strSet4 = element3.classNames();
        java.lang.Integer int5 = element3.elementSiblingIndex();
        org.jsoup.nodes.Element element7 = element3.appendElement("<hi!>\n <hi!></hi!>\n</hi!>");
        java.lang.String str8 = element3.data();
        java.lang.String str9 = element3.html();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<<hi!>\n <hi!></hi!>\n</hi!>></<hi!>\n <hi!></hi!>\n</hi!>>" + "'", str9, "<<hi!>\n <hi!></hi!>\n</hi!>></<hi!>\n <hi!></hi!>\n</hi!>>");
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.prepend("hi!");
        org.jsoup.select.Elements elements5 = element1.getElementsByClass("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element9 = element7.appendText("");
        java.util.Set<java.lang.String> strSet10 = element9.classNames();
        org.jsoup.nodes.Element element12 = element9.addClass("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str15 = element14.id();
        org.jsoup.nodes.Element element17 = element14.removeClass("");
        element17.setBaseUri("hi!");
        org.jsoup.select.Elements elements21 = element17.getElementsMatchingText("");
        java.lang.String str22 = element17.toString();
        org.jsoup.nodes.Attributes attributes23 = element17.attributes();
        org.jsoup.select.Elements elements24 = element17.children();
        java.lang.String str25 = element17.cssSelector();
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element29 = element27.appendText("");
        int int30 = element29.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList31 = element29.textNodes();
        java.lang.String str32 = element29.nodeName();
        org.jsoup.nodes.Element element34 = element29.text("<hi!></hi!>");
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str37 = element36.id();
        java.lang.Integer int38 = element36.elementSiblingIndex();
        org.jsoup.nodes.Element element39 = element36.empty();
        java.lang.String str40 = element39.outerHtml();
        org.jsoup.nodes.Element element42 = new org.jsoup.nodes.Element("hi!");
        int int43 = element42.childNodeSize();
        java.lang.String str44 = element42.nodeName();
        org.jsoup.nodes.Element element45 = element39.appendChild((org.jsoup.nodes.Node) element42);
        org.jsoup.select.Elements elements47 = element45.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element49 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element51 = element49.appendText("");
        int int52 = element51.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList53 = element51.textNodes();
        java.lang.String str54 = element51.data();
        org.jsoup.nodes.Element element55 = element45.prependChild((org.jsoup.nodes.Node) element51);
        java.util.Set<java.lang.String> strSet56 = element55.classNames();
        org.jsoup.nodes.Element element57 = element34.classNames(strSet56);
        org.jsoup.nodes.Element element58 = element17.classNames(strSet56);
        org.jsoup.nodes.Element element59 = element12.classNames(strSet56);
        org.jsoup.nodes.Element element60 = element1.classNames(strSet56);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<hi! class=\"\"></hi!>" + "'", str22, "<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(textNodeList31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "<hi!></hi!>" + "'", str40, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(textNodeList53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(element60);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element4.childNodesCopy();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element11.val("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = element11.siblingNodes();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element18 = element16.appendText("");
        org.jsoup.nodes.Element element20 = element18.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element22 = element18.toggleClass("");
        org.jsoup.nodes.Element element24 = element22.tagName("hi!");
        boolean boolean25 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element24);
        org.jsoup.nodes.Element element26 = element11.appendChild((org.jsoup.nodes.Node) element24);
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str29 = element28.id();
        java.lang.Integer int30 = element28.elementSiblingIndex();
        org.jsoup.nodes.Element element31 = element28.empty();
        java.lang.String str32 = element31.outerHtml();
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element("hi!");
        int int35 = element34.childNodeSize();
        java.lang.String str36 = element34.nodeName();
        org.jsoup.nodes.Element element37 = element31.appendChild((org.jsoup.nodes.Node) element34);
        org.jsoup.select.Elements elements39 = element37.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element43 = element41.appendText("");
        int int44 = element43.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList45 = element43.textNodes();
        java.lang.String str46 = element43.data();
        org.jsoup.nodes.Element element47 = element37.prependChild((org.jsoup.nodes.Node) element43);
        java.util.Set<java.lang.String> strSet48 = element47.classNames();
        org.jsoup.nodes.Element element49 = element11.appendChild((org.jsoup.nodes.Node) element47);
        org.jsoup.nodes.Element element50 = element47.lastElementSibling();
        org.jsoup.nodes.Element element51 = element4.prependChild((org.jsoup.nodes.Node) element47);
        org.jsoup.select.Elements elements53 = element4.getElementsMatchingOwnText("<hi! class=\"\">\n <hi!> \n </hi!>\n</hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<hi!></hi!>" + "'", str32, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(textNodeList45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(elements53);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        org.jsoup.nodes.Element element8 = element4.append("hi!");
        org.jsoup.nodes.Element element10 = element8.addClass("hi!.hi!.<hi!></hi!>");
        org.jsoup.select.Elements elements12 = element10.getElementsByTag("<hi!>\n <hi!></hi!>\n</hi!>");
        java.lang.String str13 = element10.baseUri();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str17 = element16.id();
        java.lang.Integer int18 = element16.elementSiblingIndex();
        org.jsoup.nodes.Element element19 = element16.empty();
        java.lang.String str20 = element19.outerHtml();
        org.jsoup.select.Elements elements23 = element19.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element27 = element25.appendText("");
        java.util.Set<java.lang.String> strSet28 = element27.classNames();
        org.jsoup.nodes.Element element29 = element19.classNames(strSet28);
        org.jsoup.select.Elements elements31 = element29.getElementsByIndexLessThan((int) (byte) 0);
        org.jsoup.nodes.Element element32 = element10.insertChildren(0, (java.util.Collection<org.jsoup.nodes.Element>) elements31);
        org.jsoup.select.Elements elements35 = element32.getElementsByAttributeValueContaining("<<hi!>\n</hi!> value=\"<hi! class=&quot;&quot;></hi!>\">\n <hi! class=\"\">\n   hi!.hi!. \n  <hi!></hi!> \n </hi!>\n</<hi!>\n</hi!>>", "<hi! class=\"\">\n &lt;hi!&gt; &lt;/hi!&gt;\n</hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<hi!></hi!>" + "'", str20, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(elements35);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
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
        org.jsoup.select.Elements elements24 = element10.getElementsByAttributeValueStarting("<hi! class=\"<hi!></hi!>\"></hi!><hi!> </hi!>", "<hi! <hi! class=\"<hi!></hi!>\"></hi!>=\"<hi! class=&quot;<hi!></hi!>&quot;></hi!>\"></hi!>");
        org.jsoup.nodes.Attributes attributes25 = element10.attributes();
        org.jsoup.nodes.Element element27 = element10.prependElement("<hi! class=\"<hi!></hi!>\"></hi!><hi!> </hi!>");
        java.lang.String str29 = element27.absUrl("<hi! class=\"\">\n <hi!> \n </hi!>\n</hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(textNodeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Element element9 = element7.prependElement("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str12 = element11.id();
        java.lang.Integer int13 = element11.elementSiblingIndex();
        org.jsoup.nodes.Element element14 = element11.empty();
        java.lang.String str15 = element14.outerHtml();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        int int18 = element17.childNodeSize();
        java.lang.String str19 = element17.nodeName();
        org.jsoup.nodes.Element element20 = element14.appendChild((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Element element22 = element14.html("<hi!></hi!>");
        org.jsoup.nodes.Element element23 = element14.nextElementSibling();
        org.jsoup.nodes.Element element25 = element14.append("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element26 = element9.appendChild((org.jsoup.nodes.Node) element25);
        org.jsoup.nodes.Element element28 = element9.val("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element30 = element9.after("<hi! class=\"\">\n</hi!>");
        org.jsoup.nodes.Element element32 = element9.appendElement("<hi! class=\"\">\n <hi!>\n  <hi!></hi!>\n </hi!>\n <hi! class=\"\"> \n  <hi!></hi!>&lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt; \n </hi!>\n</hi!>");
        org.jsoup.select.Elements elements35 = element9.getElementsByAttributeValueContaining("<hi! class=\"<hi! <hi! class=&quot;&quot;>\n</hi!>></hi!>\" value=\"hi!.hi!.<hi!></hi!>\">\n <hi!></hi!>\n</hi!>", "<hi!>\n &lt;hi! class=\"\"&gt; &lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element37 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element39 = element37.prepend("hi!");
        java.lang.String str40 = element39.data();
        org.jsoup.nodes.Element element42 = element39.tagName("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        element9.replaceWith((org.jsoup.nodes.Node) element39);
        org.jsoup.nodes.Element element45 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element47 = element45.appendText("");
        org.jsoup.nodes.Element element49 = element47.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element51 = element47.toggleClass("");
        org.jsoup.nodes.Element element53 = element51.prependElement("<hi!>\n</hi!>");
        java.lang.String str54 = element53.toString();
        org.jsoup.nodes.Element element56 = element53.appendElement("hi!");
        org.jsoup.nodes.Element element58 = element56.appendText("&lt;hi! class=\"\"&gt;&lt;/hi!&gt;");
        org.jsoup.nodes.Element element59 = element39.prependChild((org.jsoup.nodes.Node) element58);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<hi!></hi!>" + "'", str15, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "<<hi!>\n</hi!>></<hi!>\n</hi!>>" + "'", str54, "<<hi!>\n</hi!>></<hi!>\n</hi!>>");
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(element59);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
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
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str32 = element31.id();
        java.lang.Integer int33 = element31.elementSiblingIndex();
        org.jsoup.nodes.Element element34 = element31.empty();
        java.lang.String str35 = element34.outerHtml();
        org.jsoup.parser.Tag tag36 = element34.tag();
        org.jsoup.nodes.Element element39 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str40 = element39.id();
        org.jsoup.nodes.Element element42 = element39.removeClass("");
        java.lang.String str44 = element42.absUrl("hi!");
        org.jsoup.nodes.Element element46 = element42.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet47 = element46.classNames();
        org.jsoup.nodes.Element element49 = element46.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Attributes attributes50 = element49.attributes();
        org.jsoup.nodes.Element element51 = new org.jsoup.nodes.Element(tag36, "<hi! class=\"\"></hi!>", attributes50);
        java.lang.String str53 = element51.absUrl("<hi!></hi!>");
        org.jsoup.nodes.Element element55 = element51.val("hi!.hi!.");
        org.jsoup.nodes.Element element57 = element51.addClass("<hi! class=\"\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            element29.replaceWith((org.jsoup.nodes.Node) element57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "<hi!></hi!>", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<hi!></hi!>" + "'", str35, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(strSet47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNotNull(element57);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet9 = element8.classNames();
        org.jsoup.nodes.Element element11 = element8.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element13 = element11.html("");
        org.jsoup.nodes.Element element15 = element11.removeClass("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element17 = element15.prependElement("hi!.hi!.");
        org.jsoup.nodes.Element element20 = element17.attr("<hi! class=\"\">\n &lt;hi! class=\"\"&gt; &lt;/hi!&gt;\n</hi!>", "<hi! class=\"\">&lt;hi!&gt; &lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        org.jsoup.nodes.Element element8 = element4.append("hi!");
        int int9 = element8.siblingIndex();
        org.jsoup.select.Elements elements10 = element8.siblingElements();
        org.jsoup.nodes.Element element12 = element8.val("hi!.<hi!></hi!>");
        java.lang.String str13 = element8.nodeName();
        java.lang.String str14 = element8.data();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        org.jsoup.nodes.Node node5 = element1.parentNode();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element1.dataset();
        org.jsoup.nodes.Element element7 = element1.empty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
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
        java.util.List<org.jsoup.nodes.TextNode> textNodeList21 = element15.textNodes();
        org.jsoup.nodes.Element element23 = element15.prependText("<<hi!>\n</hi!>></<hi!>\n</hi!>>");
        org.jsoup.select.Elements elements25 = element23.getElementsByIndexEquals((int) (byte) 0);
        java.lang.String str27 = element23.attr("<<hi!>\n <hi!></hi!>\n</hi!>>\n <<hi! class=\"hi!.hi!.<hi!></hi!>\">\n hi!\n</hi!>></<hi! class=\"hi!.hi!.<hi!></hi!>\">\n hi!\n</hi!>>\n</<hi!>\n <hi!></hi!>\n</hi!>>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(textNodeList21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
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
        org.jsoup.nodes.Element element58 = new org.jsoup.nodes.Element(tag5, "<hi! class=\"\">\n <hi!>\n  <hi!></hi!>\n </hi!>\n <hi! class=\"\"> \n  <hi!></hi!>&lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt; \n </hi!>\n</hi!>");
        org.jsoup.nodes.Element element61 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element63 = element61.appendText("");
        org.jsoup.nodes.Element element65 = element63.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Attributes attributes66 = element63.attributes();
        org.jsoup.nodes.Element element67 = new org.jsoup.nodes.Element(tag5, "", attributes66);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(dataNodeList19);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<hi!></hi!>" + "'", str34, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(dataNodeList46);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(attributes52);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertNotNull(attributes66);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
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
        org.jsoup.select.Elements elements24 = element10.getElementsByAttributeValueStarting("<hi! class=\"<hi!></hi!>\"></hi!><hi!> </hi!>", "<hi! <hi! class=\"<hi!></hi!>\"></hi!>=\"<hi! class=&quot;<hi!></hi!>&quot;></hi!>\"></hi!>");
        org.jsoup.nodes.Attributes attributes25 = element10.attributes();
        org.jsoup.nodes.Document document26 = element10.ownerDocument();
        org.jsoup.nodes.Element element28 = element10.append("<hi! class=\"\"></hi!>");
        java.lang.String str29 = element10.className();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(textNodeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNull(document26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        org.jsoup.nodes.Node node6 = element3.parentNode();
        org.jsoup.nodes.Element element8 = element3.text("");
        org.jsoup.select.Elements elements11 = element3.getElementsByAttributeValue("<hi!>\n <hi! class=\"\">\n   hi! \n </hi!>\n</hi!>", "<hi! <hi! class=\"\">\n</hi!>></hi!>");
        java.lang.String str12 = element3.cssSelector();
        org.jsoup.select.Elements elements15 = element3.getElementsByAttributeValueMatching("<hi! class=\"<hi!></hi!>\">\n</hi!>", "hi!.hi!.");
        org.jsoup.select.Elements elements18 = element3.getElementsByAttributeValueEnding("hi!.hi!. \n<hi!></hi!>", "<hi! class=\"\">\n <<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>></<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>>\n</hi!>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNodeList5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
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
        java.lang.Integer int15 = element13.elementSiblingIndex();
        org.jsoup.nodes.Element element16 = element13.empty();
        java.lang.String str17 = element16.outerHtml();
        org.jsoup.parser.Tag tag18 = element16.tag();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str22 = element21.id();
        org.jsoup.nodes.Element element24 = element21.removeClass("");
        java.lang.String str26 = element24.absUrl("hi!");
        org.jsoup.nodes.Element element28 = element24.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet29 = element28.classNames();
        org.jsoup.nodes.Element element31 = element28.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Attributes attributes32 = element31.attributes();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element(tag18, "<hi! class=\"\"></hi!>", attributes32);
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element(tag6, "<hi!></hi!>", attributes32);
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element38 = element36.val("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList39 = element36.siblingNodes();
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element43 = element41.appendText("");
        org.jsoup.nodes.Element element45 = element43.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element47 = element43.toggleClass("");
        org.jsoup.nodes.Element element49 = element47.tagName("hi!");
        boolean boolean50 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element49);
        org.jsoup.nodes.Element element51 = element36.appendChild((org.jsoup.nodes.Node) element49);
        java.lang.String str52 = element49.text();
        boolean boolean53 = element34.equals((java.lang.Object) element49);
        org.jsoup.nodes.Element element55 = element49.before("hi!.hi!.\n<hi!></hi!>");
        org.jsoup.nodes.Element element57 = new org.jsoup.nodes.Element("hi!");
        int int58 = element57.childNodeSize();
        boolean boolean60 = element57.hasClass("hi!");
        java.util.regex.Pattern pattern62 = null;
        org.jsoup.select.Elements elements63 = element57.getElementsByAttributeValueMatching("hi!", pattern62);
        org.jsoup.nodes.Element element65 = element57.appendText("<hi!></hi!>");
        org.jsoup.select.Elements elements67 = element57.getElementsMatchingOwnText("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element69 = element57.html("<hi! <hi! class=\"\">\n</hi!>></hi!>");
        org.jsoup.nodes.Element element70 = element55.before((org.jsoup.nodes.Node) element69);
        org.jsoup.nodes.Element element72 = element70.appendElement("<hi! class=\"<hi! class=&quot;&quot;>\n hi!.hi!.\n <hi!></hi!>\n</hi!>\">\n</hi!>");
        java.util.Set<java.lang.String> strSet73 = element72.classNames();
        org.jsoup.nodes.Element element76 = element72.attr("<hi! <hi! class=\"\">\n</hi!>></hi!>", "hi!.hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element78 = element76.prepend("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        java.lang.Appendable appendable79 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings81 = null;
        // The following exception was thrown during execution in test generation
        try {
            element78.outerHtmlTail(appendable79, 0, outputSettings81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<hi!></hi!>" + "'", str17, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(elements63);
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertNotNull(elements67);
        org.junit.Assert.assertNotNull(element69);
        org.junit.Assert.assertNotNull(element70);
        org.junit.Assert.assertNotNull(element72);
        org.junit.Assert.assertNotNull(strSet73);
        org.junit.Assert.assertNotNull(element76);
        org.junit.Assert.assertNotNull(element78);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
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
        boolean boolean51 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element21);
        org.jsoup.select.Elements elements54 = element21.getElementsByAttributeValueMatching("<hi! class=\"\">\n <hi!></hi!>\n</hi!>", "<hi!>\n <hi!>\n  <hi! class=\"\"> \n  </hi!>\n </hi!>\n</hi!>");
        org.jsoup.nodes.Element element56 = element21.prepend("hi!.hi!.\n<hi!></hi!>");
        java.lang.String str57 = element21.id();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList58 = element21.dataNodes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<hi!></hi!>" + "'", str30, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertNotNull(strSet47);
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(elements54);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(dataNodeList58);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element4.childNodesCopy();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element11.val("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = element11.siblingNodes();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element18 = element16.appendText("");
        org.jsoup.nodes.Element element20 = element18.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element22 = element18.toggleClass("");
        org.jsoup.nodes.Element element24 = element22.tagName("hi!");
        boolean boolean25 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element24);
        org.jsoup.nodes.Element element26 = element11.appendChild((org.jsoup.nodes.Node) element24);
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str29 = element28.id();
        java.lang.Integer int30 = element28.elementSiblingIndex();
        org.jsoup.nodes.Element element31 = element28.empty();
        java.lang.String str32 = element31.outerHtml();
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element("hi!");
        int int35 = element34.childNodeSize();
        java.lang.String str36 = element34.nodeName();
        org.jsoup.nodes.Element element37 = element31.appendChild((org.jsoup.nodes.Node) element34);
        org.jsoup.select.Elements elements39 = element37.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element43 = element41.appendText("");
        int int44 = element43.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList45 = element43.textNodes();
        java.lang.String str46 = element43.data();
        org.jsoup.nodes.Element element47 = element37.prependChild((org.jsoup.nodes.Node) element43);
        java.util.Set<java.lang.String> strSet48 = element47.classNames();
        org.jsoup.nodes.Element element49 = element11.appendChild((org.jsoup.nodes.Node) element47);
        org.jsoup.nodes.Element element50 = element47.lastElementSibling();
        org.jsoup.nodes.Element element51 = element4.prependChild((org.jsoup.nodes.Node) element47);
        org.jsoup.select.Elements elements53 = element47.getElementsMatchingOwnText("");
        java.util.List<org.jsoup.nodes.Node> nodeList54 = element47.childNodes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<hi!></hi!>" + "'", str32, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(textNodeList45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertNotNull(nodeList54);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = element23.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<hi!></hi!>" + "'", str13, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Element element9 = element3.appendElement("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList10 = element3.textNodes();
        org.jsoup.nodes.Element element12 = element3.text("<hi! class=\"\">\n</hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = element3.siblingNodes();
        org.jsoup.select.Elements elements14 = element3.parents();
        java.lang.String str15 = element3.outerHtml();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(textNodeList10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<hi! class=\"\">\n &lt;hi! class=\"\"&gt; &lt;/hi!&gt;\n</hi!>" + "'", str15, "<hi! class=\"\">\n &lt;hi! class=\"\"&gt; &lt;/hi!&gt;\n</hi!>");
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Element element9 = element7.prependElement("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str12 = element11.id();
        java.lang.Integer int13 = element11.elementSiblingIndex();
        org.jsoup.nodes.Element element14 = element11.empty();
        java.lang.String str15 = element14.outerHtml();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        int int18 = element17.childNodeSize();
        java.lang.String str19 = element17.nodeName();
        org.jsoup.nodes.Element element20 = element14.appendChild((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Element element22 = element14.html("<hi!></hi!>");
        org.jsoup.nodes.Element element23 = element14.nextElementSibling();
        org.jsoup.nodes.Element element25 = element14.append("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element26 = element9.appendChild((org.jsoup.nodes.Node) element25);
        org.jsoup.nodes.Element element28 = element26.toggleClass("hi!.<hi!></hi!>");
        java.lang.String str29 = element26.tagName();
        java.lang.String str30 = element26.text();
        org.jsoup.nodes.Element element32 = element26.removeClass("<hi! class=\"\">\n <<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>></<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>>\n</hi!>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<hi!></hi!>" + "'", str15, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<hi!>\n</hi!>" + "'", str29, "<hi!>\n</hi!>");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(element32);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("hi!", pattern6);
        org.jsoup.nodes.Element element9 = element1.appendText("<hi!></hi!>");
        boolean boolean10 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str13 = element12.id();
        java.lang.Integer int14 = element12.elementSiblingIndex();
        org.jsoup.nodes.Element element15 = element12.empty();
        java.lang.String str16 = element15.outerHtml();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        int int19 = element18.childNodeSize();
        java.lang.String str20 = element18.nodeName();
        org.jsoup.nodes.Element element21 = element15.appendChild((org.jsoup.nodes.Node) element18);
        org.jsoup.nodes.Element element23 = element15.html("<hi!></hi!>");
        org.jsoup.select.Elements elements25 = element15.getElementsByClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element29 = element27.appendText("");
        org.jsoup.nodes.Element element31 = element29.removeClass("<hi!></hi!>");
        org.jsoup.select.Elements elements33 = element31.getElementsByClass("hi!");
        java.lang.String str34 = element31.val();
        boolean boolean36 = element31.hasClass("hi!");
        org.jsoup.nodes.Element element37 = element15.appendChild((org.jsoup.nodes.Node) element31);
        org.jsoup.parser.Tag tag38 = element15.tag();
        org.jsoup.nodes.Element element40 = new org.jsoup.nodes.Element(tag38, "");
        org.jsoup.nodes.Element element42 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str43 = element42.id();
        java.lang.Integer int44 = element42.elementSiblingIndex();
        org.jsoup.nodes.Element element45 = element42.empty();
        java.lang.String str46 = element45.outerHtml();
        org.jsoup.nodes.Element element48 = new org.jsoup.nodes.Element("hi!");
        int int49 = element48.childNodeSize();
        java.lang.String str50 = element48.nodeName();
        org.jsoup.nodes.Element element51 = element45.appendChild((org.jsoup.nodes.Node) element48);
        org.jsoup.nodes.Element element53 = element48.addClass("hi!.hi!.<hi!></hi!>");
        org.jsoup.select.Elements elements55 = element48.getElementsContainingOwnText("<hi!>\n</hi!>");
        java.lang.Integer int56 = element48.elementSiblingIndex();
        org.jsoup.nodes.Element element57 = element40.appendChild((org.jsoup.nodes.Node) element48);
        org.jsoup.nodes.Node node59 = element40.removeAttr("<<hi!>\n</hi!>></<hi!>\n</hi!>>");
        org.jsoup.nodes.Element element61 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str62 = element61.id();
        java.lang.Integer int63 = element61.elementSiblingIndex();
        org.jsoup.nodes.Element element64 = element61.empty();
        java.lang.String str65 = element61.nodeName();
        java.util.Set<java.lang.String> strSet66 = element61.classNames();
        boolean boolean67 = node59.hasSameValue((java.lang.Object) strSet66);
        org.jsoup.nodes.Element element68 = element1.classNames(strSet66);
        java.lang.String str69 = element1.data();
        org.jsoup.nodes.Element element70 = element1.parent();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<hi!></hi!>" + "'", str16, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "<hi!></hi!>" + "'", str46, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(elements55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertNotNull(strSet66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNull(element70);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("hi!", pattern6);
        boolean boolean9 = element1.hasClass("<hi!></hi!>");
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str12 = element11.id();
        org.jsoup.nodes.Element element14 = element11.removeClass("");
        java.lang.String str16 = element14.absUrl("hi!");
        org.jsoup.nodes.Element element18 = element14.append("<hi!></hi!>");
        boolean boolean19 = element1.equals((java.lang.Object) element14);
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element23 = element21.val("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = element21.siblingNodes();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element28 = element26.appendText("");
        org.jsoup.nodes.Element element30 = element28.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element32 = element28.toggleClass("");
        org.jsoup.nodes.Element element34 = element32.tagName("hi!");
        boolean boolean35 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element34);
        org.jsoup.nodes.Element element36 = element21.appendChild((org.jsoup.nodes.Node) element34);
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str39 = element38.id();
        java.lang.Integer int40 = element38.elementSiblingIndex();
        org.jsoup.nodes.Element element41 = element38.empty();
        java.lang.String str42 = element41.outerHtml();
        org.jsoup.nodes.Element element44 = new org.jsoup.nodes.Element("hi!");
        int int45 = element44.childNodeSize();
        java.lang.String str46 = element44.nodeName();
        org.jsoup.nodes.Element element47 = element41.appendChild((org.jsoup.nodes.Node) element44);
        org.jsoup.select.Elements elements49 = element47.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element51 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element53 = element51.appendText("");
        int int54 = element53.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList55 = element53.textNodes();
        java.lang.String str56 = element53.data();
        org.jsoup.nodes.Element element57 = element47.prependChild((org.jsoup.nodes.Node) element53);
        java.util.Set<java.lang.String> strSet58 = element57.classNames();
        org.jsoup.nodes.Element element59 = element21.appendChild((org.jsoup.nodes.Node) element57);
        org.jsoup.nodes.Element element60 = element1.appendChild((org.jsoup.nodes.Node) element59);
        java.lang.String str62 = element59.absUrl("<hi!>\n</hi!>");
        org.jsoup.select.Elements elements65 = element59.getElementsByAttributeValue("<hi! class=\"\">\n</hi!>", "hi!.hi!.<hi!></hi!>");
        org.jsoup.select.Elements elements67 = element59.getElementsByClass("<hi! class=\"<hi!></hi!>\"></hi!><hi!> </hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element69 = element59.child((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<hi!></hi!>" + "'", str42, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(textNodeList55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(strSet58);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(elements65);
        org.junit.Assert.assertNotNull(elements67);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        org.jsoup.nodes.Element element8 = element4.append("hi!");
        int int9 = element8.siblingIndex();
        org.jsoup.select.Elements elements10 = element8.siblingElements();
        java.lang.String str11 = element8.html();
        org.jsoup.nodes.Element element13 = element8.prepend("<hi!></hi!>");
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element17 = element15.appendText("");
        org.jsoup.nodes.Element element19 = element17.removeClass("<hi!></hi!>");
        org.jsoup.select.Elements elements21 = element19.getElementsByClass("hi!");
        java.lang.String str22 = element19.val();
        boolean boolean24 = element19.hasClass("hi!");
        org.jsoup.select.Elements elements25 = element19.children();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList26 = element19.textNodes();
        org.jsoup.nodes.Element element27 = element13.appendChild((org.jsoup.nodes.Node) element19);
        org.jsoup.select.Elements elements30 = element13.getElementsByAttributeValueStarting("<hi!>\n <hi!></hi!>\n</hi!>", "<hi! class=\"\">\n <hi!></hi!>&lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(textNodeList26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements30);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
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
        org.jsoup.select.Elements elements23 = element20.getElementsByIndexGreaterThan(1);
        boolean boolean24 = element20.hasText();
        org.jsoup.nodes.Element element25 = element20.parent();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(textNodeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(element25);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.val("<hi!></hi!>");
        org.jsoup.parser.Tag tag4 = element1.tag();
        org.jsoup.nodes.Attributes attributes5 = element1.attributes();
        java.lang.String str6 = element1.data();
        java.util.Set<java.lang.String> strSet7 = element1.classNames();
        org.jsoup.nodes.Node node8 = element1.root();
        org.jsoup.nodes.Element element9 = element1.empty();
        org.jsoup.select.Elements elements10 = element1.getAllElements();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        java.lang.String str6 = element3.data();
        org.jsoup.nodes.Element element8 = element3.html("<hi!></hi!>");
        org.jsoup.select.Elements elements9 = element3.parents();
        org.jsoup.nodes.Element element11 = element3.tagName("<hi! <hi! class=\"<hi!></hi!>\"></hi!>=\"<hi! class=&quot;<hi!></hi!>&quot;></hi!>\"></hi!>");
        int int12 = element3.siblingIndex();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        org.jsoup.nodes.Element element6 = element1.append("hi!.hi!.<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element6.siblingNodes();
        java.lang.String str8 = element6.outerHtml();
        int int9 = element6.childNodeSize();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>" + "'", str8, "<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        boolean boolean4 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Attributes attributes5 = element1.attributes();
        org.jsoup.select.Elements elements6 = element1.getAllElements();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
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
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str37 = element36.id();
        java.lang.Integer int38 = element36.elementSiblingIndex();
        org.jsoup.nodes.Element element39 = element36.empty();
        java.lang.String str40 = element39.outerHtml();
        org.jsoup.select.Elements elements43 = element39.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element45 = element39.append("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.select.Elements elements48 = element45.getElementsByAttributeValueNot("<hi! class=\"\"></hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element50 = element45.tagName("<hi!>\n <hi!>\n  <hi! class=\"\"> \n  </hi!>\n </hi!>\n</hi!>");
        org.jsoup.nodes.Element element51 = element34.prependChild((org.jsoup.nodes.Node) element50);
        java.lang.Integer int52 = element34.elementSiblingIndex();
        java.lang.String str54 = element34.absUrl("<hi! value=\"<hi!></hi!>\">\n <hi! class=\"\">\n </hi!>\n <hi!>\n  <hi!>\n  </hi!>\n  <hi!></hi!>\n </hi!>\n</hi!>");
        org.jsoup.select.Elements elements56 = element34.getElementsMatchingOwnText("&lt;hi! class=\"\"&gt;&lt;/hi!&gt;");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<hi!></hi!>" + "'", str12, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>" + "'", str32, "<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "<hi!></hi!>" + "'", str40, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(elements56);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "<hi!></hi!>", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        org.jsoup.nodes.Element element13 = element4.classNames((java.util.Set<java.lang.String>) strSet11);
        org.jsoup.select.Elements elements16 = element4.getElementsByAttributeValueNot("<hi!>\n</hi!>", "<hi!>\n</hi!>");
        java.lang.String str17 = element4.className();
        org.jsoup.nodes.Element element18 = element4.empty();
        org.jsoup.select.Elements elements19 = element18.getAllElements();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "<hi!></hi!>", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! <hi!></hi!>" + "'", str17, "hi! <hi!></hi!>");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
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
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str33 = element32.id();
        java.lang.Integer int34 = element32.elementSiblingIndex();
        java.lang.String str35 = element32.className();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList36 = element32.dataNodes();
        org.jsoup.nodes.Element element39 = element32.attr("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element41 = element32.appendElement("hi!");
        org.jsoup.nodes.Attributes attributes42 = element41.attributes();
        org.jsoup.nodes.Element element43 = new org.jsoup.nodes.Element(tag27, "<hi!>\n <hi!></hi!>\n</hi!>", attributes42);
        org.jsoup.nodes.Element element45 = new org.jsoup.nodes.Element(tag27, "");
        org.jsoup.nodes.Node node46 = element45.nextSibling();
        java.lang.String str47 = element45.cssSelector();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(dataNodeList36);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
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
        org.jsoup.nodes.Element element23 = element20.tagName("hi!");
        java.lang.String str24 = element20.className();
        org.jsoup.nodes.Element element26 = element20.appendText("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        java.lang.String str27 = element20.val();
        boolean boolean28 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element20);
        java.util.List<org.jsoup.nodes.Node> nodeList29 = element20.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(textNodeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(nodeList29);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        boolean boolean4 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element5 = element1.previousElementSibling();
        java.lang.String str6 = element1.cssSelector();
        org.jsoup.parser.Tag tag7 = element1.tag();
        org.jsoup.nodes.Element element9 = element1.prepend("<hi!></hi!>\n<hi! class=\"\">\n</hi!>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
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
        org.jsoup.nodes.Element element18 = element14.after("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        java.lang.String str19 = element18.baseUri();
        java.util.Set<java.lang.String> strSet20 = element18.classNames();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsMatchingText("");
        java.lang.String str9 = element4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element4.childNodesCopy();
        org.jsoup.nodes.Element element12 = element4.appendElement("<hi! class=\"<hi!></hi!>\"></hi!>");
        boolean boolean13 = element12.isBlock();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements15 = element12.getElementsByClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<hi! class=\"\"></hi!>" + "'", str9, "<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements4 = element1.getElementsByAttributeValueNot("<hi! class=\"<hi!></hi!>\"></hi!>", "<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        org.jsoup.select.Elements elements5 = element1.parents();
        java.lang.String str6 = element1.cssSelector();
        org.jsoup.select.Elements elements7 = element1.children();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
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
        org.jsoup.nodes.Element element27 = element7.toggleClass("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element30 = element7.attr("<<hi!>\n</hi!> value=\"<hi! class=&quot;&quot;></hi!>\">\n <hi! class=\"\">\n   hi!.hi!. \n  <hi!></hi!> \n </hi!>\n</<hi!>\n</hi!>>", false);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element30);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("hi!", pattern6);
        org.jsoup.nodes.Element element9 = element1.appendText("<hi!></hi!>");
        org.jsoup.nodes.Document document10 = element1.ownerDocument();
        org.jsoup.nodes.Element element11 = element1.empty();
        boolean boolean13 = element11.hasClass("<hi!></hi!>");
        org.jsoup.nodes.Element element15 = element11.removeClass("");
        org.jsoup.nodes.Element element17 = element11.appendText("<hi! class=\"\">\n</hi!>");
        org.jsoup.nodes.Node node18 = element11.nextSibling();
        org.jsoup.select.Elements elements19 = element11.getAllElements();
        java.lang.String str20 = element11.cssSelector();
        java.lang.Appendable appendable21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        // The following exception was thrown during execution in test generation
        try {
            element11.outerHtmlTail(appendable21, (int) (short) 0, outputSettings23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Attributes attributes8 = element7.attributes();
        org.jsoup.nodes.Node node9 = element7.parentNode();
        java.util.Set<java.lang.String> strSet10 = element7.classNames();
        java.lang.String str12 = element7.absUrl("<hi!>\n hi!\n</hi!>");
        org.jsoup.select.Elements elements14 = element7.getElementsByIndexLessThan(4);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.select.Elements elements5 = element3.getElementsMatchingText("");
        org.jsoup.nodes.Element element7 = element3.prependText("hi!");
        org.jsoup.select.Elements elements9 = element7.getElementsByAttribute("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element11 = element7.append("<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>");
        org.jsoup.nodes.Element element12 = element7.nextElementSibling();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNull(element12);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
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
        java.lang.String str51 = element8.nodeName();
        org.jsoup.nodes.Element element53 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element55 = element53.appendText("");
        org.jsoup.nodes.Element element57 = element55.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element59 = element55.toggleClass("");
        org.jsoup.nodes.Element element61 = element55.appendElement("hi!");
        java.util.regex.Pattern pattern63 = null;
        org.jsoup.select.Elements elements64 = element61.getElementsByAttributeValueMatching("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>", pattern63);
        org.jsoup.nodes.Element element65 = element8.appendChild((org.jsoup.nodes.Node) element61);
        org.jsoup.nodes.Node node67 = element8.removeAttr("<hi! value=\"<hi!></hi!>\">\n <<hi!>\n <hi!></hi!>\n</hi!>></<hi!>\n <hi!></hi!>\n</hi!>>\n</hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<hi!></hi!>" + "'", str30, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertNotNull(strSet47);
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNotNull(elements64);
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertNotNull(node67);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.val("<hi!></hi!>");
        org.jsoup.parser.Tag tag4 = element1.tag();
        org.jsoup.nodes.Attributes attributes5 = element1.attributes();
        java.lang.String str6 = element1.data();
        java.util.Set<java.lang.String> strSet7 = element1.classNames();
        org.jsoup.select.Elements elements10 = element1.getElementsByAttributeValueContaining("hi!", "<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element12 = element1.html("<hi! class=\"\">\n</hi!>");
        java.lang.String str13 = element1.nodeName();
        org.jsoup.select.Elements elements15 = element1.getElementsByTag("<hi! class=\"<hi! <hi! class=&quot;&quot;>\n</hi!>></hi!>\" value=\"hi!.hi!.<hi!></hi!>\">\n <hi!></hi!>\n</hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList16 = element1.textNodes();
        org.jsoup.nodes.Element element18 = element1.toggleClass("hi!.<hi!.class=\"<hi!></hi!>\"></hi!>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(textNodeList16);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
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
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element15.childNodes();
        org.jsoup.select.Elements elements17 = element15.children();
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        // The following exception was thrown during execution in test generation
        try {
            element15.outerHtmlHead(appendable18, (int) '4', outputSettings20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        java.util.Set<java.lang.String> strSet4 = element3.classNames();
        java.lang.Integer int5 = element3.elementSiblingIndex();
        org.jsoup.select.Elements elements7 = element3.getElementsMatchingOwnText("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element9 = element3.prepend("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValueMatching("", "<hi! <hi!>\n <hi!></hi!>\n</hi!>=\"<hi!>\n <hi!></hi!>\n</hi!>\"></hi!>");
        org.jsoup.select.Elements elements15 = element9.getElementsByAttributeValueEnding("<hi!>\n</hi!>", "hi!.hi!.");
        org.jsoup.nodes.Element element16 = element9.clone();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        boolean boolean4 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element6 = element1.appendElement("hi!");
        org.jsoup.select.Elements elements9 = element6.getElementsByAttributeValueNot("<hi! class=\"\">\n</hi!>", "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element11 = element6.after("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Node node13 = element6.removeAttr("<hi! class=\"<hi!></hi!>\" hi!=\"<hi! class=&quot;&quot;>\n <hi!></hi!>\n <hi!>\n </hi!>\n</hi!>\">\n <hi! class=\"hi!.hi!.<hi!></hi!>\"></hi!>&lt;hi! class=\"\"&gt; hi!.hi!. &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
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
        int int13 = element12.siblingIndex();
        boolean boolean14 = element12.hasText();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.select.Elements elements5 = element1.getElementsByAttributeStarting("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element7 = element1.tagName("hi!.&lt;hi!.class=\"&lt;hi!&gt;&lt;/hi!&gt;\"&gt;&lt;/hi!&gt;");
        org.jsoup.select.Elements elements9 = element1.getElementsByIndexLessThan((int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
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
        org.jsoup.select.Elements elements56 = element46.getElementsByAttributeValueMatching("<hi!>\n <hi!>\n  <hi! class=\"\"> \n  </hi!>\n </hi!>\n</hi!>", "<hi! class=\"<hi! <hi! class=&quot;&quot;>\n</hi!>></hi!>\" value=\"hi!.hi!.<hi!></hi!>\">\n <hi!></hi!>\n</hi!>");
        org.jsoup.parser.Tag tag57 = element46.tag();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<hi!></hi!>" + "'", str24, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(elements56);
        org.junit.Assert.assertNotNull(tag57);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
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
        org.jsoup.nodes.Node node30 = element29.root();
        java.util.Map<java.lang.String, java.lang.String> strMap31 = element29.dataset();
        org.jsoup.nodes.Element element34 = element29.attr("hi!.hi!.<hi!></hi!>", true);
        org.jsoup.nodes.Element element36 = element34.appendText("<hi! class=\"\" value=\"<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>\">\n</hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
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
        org.jsoup.nodes.Element element18 = element14.after("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element19 = element14.lastElementSibling();
        org.jsoup.nodes.Document document20 = element19.ownerDocument();
        org.jsoup.nodes.Element element21 = element19.parent();
        org.jsoup.nodes.Element element22 = element21.nextElementSibling();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNull(document20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNull(element22);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element10 = element4.addClass("");
        java.lang.String str11 = element10.toString();
        org.jsoup.nodes.Element element13 = element10.val("<hi!></hi!>");
        java.lang.String str15 = element10.absUrl("<hi! class=\"\"></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element10.childNodes();
        org.jsoup.nodes.Element element18 = element10.prependElement("<hi!>\n hi!\n <hi! class=\"hi!.hi!.<hi!></hi!>\"></hi!>\n</hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<hi! class=\"\"></hi!>" + "'", str11, "<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueStarting("<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>", "<hi!></hi!>");
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element8.appendText("");
        int int11 = element10.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element10.textNodes();
        org.jsoup.select.Elements elements14 = element10.getElementsByIndexGreaterThan((int) (short) 0);
        org.jsoup.select.Elements elements17 = element10.getElementsByAttributeValueMatching("hi!", "hi!.hi!.<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList18 = element10.textNodes();
        boolean boolean19 = element1.hasSameValue((java.lang.Object) element10);
        java.lang.Class<?> wildcardClass20 = element1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(textNodeList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.parser.Tag tag6 = element4.tag();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element(tag6, "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag6, "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element13 = element10.attr("<hi! class=\"<hi!></hi!>\"></hi!>", "<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.select.Elements elements15 = element10.getElementsByTag("hi!.hi!.");
        java.lang.Integer int16 = element10.elementSiblingIndex();
        org.jsoup.nodes.Element element18 = element10.appendText("hi!.hi!.<hi!></hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(element18);
    }
}

