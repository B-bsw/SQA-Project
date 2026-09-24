package org.jsoup.nodes;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

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
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        org.jsoup.nodes.Element element9 = element5.removeClass("");
        org.jsoup.parser.Tag tag10 = element9.tag();
        org.jsoup.nodes.Attributes attributes11 = element9.attributes();
        org.jsoup.nodes.Node node12 = element9.nextSibling();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet9 = document8.classNames();
        org.jsoup.nodes.Element element10 = element5.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.select.Elements elements12 = document8.getElementsByIndexGreaterThan(100);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueStarting("#document", "hi!  #document");
        java.lang.Integer int12 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document13 = document1.normalise();
        java.lang.String str14 = document13.title();
        java.lang.Integer int15 = document13.siblingIndex();
        java.lang.String str16 = document13.nodeName();
        org.jsoup.select.Elements elements19 = document13.getElementsByAttributeValueEnding("#document", " hi!");
        org.jsoup.nodes.Element element21 = document13.prepend("hi!  #document");
        java.util.regex.Pattern pattern22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements23 = element21.getElementsMatchingOwnText(pattern22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#document" + "'", str16, "#document");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("hi!");
        java.lang.String str4 = document1.val();
        boolean boolean6 = document1.hasAttr("hi!");
        org.jsoup.nodes.Element element8 = document1.wrap("hi!");
        document1.setBaseUri("\n<body></body>");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.append("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements5 = element3.getElementsContainingOwnText(" #document");
        org.jsoup.select.Elements elements7 = element3.getElementsByAttribute("hi!  #document");
        boolean boolean9 = element3.hasClass("\n<#root <html> <head></head> <body></body> </html>></#root <html> <head></head> <body></body> </html>>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.html("hi!");
        org.jsoup.select.Elements elements11 = element3.getElementsContainingOwnText("#document");
        java.lang.Integer int12 = element3.elementSiblingIndex();
        java.lang.Integer int13 = element3.elementSiblingIndex();
        org.jsoup.select.Elements elements15 = element3.getElementsMatchingOwnText("#root");
        org.jsoup.select.Elements elements17 = element3.getElementsContainingText("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element20 = element3.attr("", "<#root hi! #document=\"#document\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        document1.setBaseUri("");
        boolean boolean11 = document1.hasClass("");
        org.jsoup.nodes.Element element12 = document1.empty();
        java.lang.String str14 = element12.attr(" hi!#root");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        boolean boolean9 = element7.hasAttr("hi!  #document");
        java.lang.String str10 = element7.tagName();
        org.jsoup.select.Elements elements12 = element7.getElementsByClass("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.regex.Pattern pattern14 = null;
        org.jsoup.select.Elements elements15 = element7.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body></body>\n</html>", pattern14);
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element19 = document17.html("");
        java.lang.String str20 = element19.className();
        org.jsoup.nodes.Element element21 = element19.empty();
        java.lang.String str22 = element21.className();
        org.jsoup.nodes.Element element23 = element7.appendChild((org.jsoup.nodes.Node) element21);
        java.util.regex.Pattern pattern25 = null;
        org.jsoup.select.Elements elements26 = element7.getElementsByAttributeValueMatching("#document", pattern25);
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements26);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Node node6 = document1.removeAttr("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element8 = document1.addClass("");
        org.jsoup.nodes.Element element10 = document1.prepend("<html>\n <head>\n  <title> hi!</title>\n </head>\n <body>\n  #document\n </body>\n</html>");
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str13 = document12.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = document12.outputSettings();
        document12.title("hi!  #document");
        java.lang.String str17 = document12.title();
        org.jsoup.nodes.Element element18 = document12.body();
        org.jsoup.parser.Tag tag19 = element18.tag();
        org.jsoup.nodes.Element element20 = element10.appendChild((org.jsoup.nodes.Node) element18);
        org.jsoup.nodes.Element element21 = element20.empty();
        java.util.regex.Pattern pattern23 = null;
        org.jsoup.select.Elements elements24 = element21.getElementsByAttributeValueMatching("<body></body>\n<html> \n <head></head> \n <body> \n </body>\n</html><#root #root=\"\"></#root>", pattern23);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#document" + "'", str13, "#document");
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!  #document" + "'", str17, "hi!  #document");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements24);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueStarting("#document", "hi!  #document");
        org.jsoup.nodes.Document document12 = document1.normalise();
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element16 = document14.html("");
        org.jsoup.nodes.Element element18 = element16.html("#document");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element22 = document20.html("");
        java.lang.String str23 = element22.className();
        org.jsoup.nodes.Element element24 = element22.empty();
        org.jsoup.select.Elements elements26 = element22.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element28 = element22.html("hi!");
        boolean boolean30 = element28.hasAttr("hi!");
        java.util.Set<java.lang.String> strSet31 = element28.classNames();
        org.jsoup.nodes.Element element32 = element18.classNames(strSet31);
        org.jsoup.nodes.Element element33 = document1.classNames(strSet31);
        org.jsoup.nodes.Element element35 = document1.append("<html>\n <head></head>\n <body></body>\n</html><#root></#root>");
        java.lang.String str36 = document1.className();
        org.jsoup.select.Elements elements38 = document1.getElementsByIndexGreaterThan(0);
        org.jsoup.nodes.Document document40 = new org.jsoup.nodes.Document("");
        boolean boolean42 = document40.hasClass("");
        org.jsoup.nodes.Document document44 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element46 = document44.html("");
        java.lang.String str47 = element46.className();
        org.jsoup.nodes.Element element48 = element46.empty();
        org.jsoup.select.Elements elements50 = element46.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element52 = element46.html("hi!");
        boolean boolean53 = document40.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Document document55 = new org.jsoup.nodes.Document("hi!  #document");
        org.jsoup.nodes.Element element56 = document40.appendChild((org.jsoup.nodes.Node) document55);
        java.lang.String str58 = document40.absUrl("hi!  #document");
        org.jsoup.select.Elements elements60 = document40.getElementsByIndexEquals((int) ' ');
        org.jsoup.nodes.Element element61 = document40.body();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element62 = document1.appendChild((org.jsoup.nodes.Node) element61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(elements50);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(elements60);
        org.junit.Assert.assertNull(element61);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        java.lang.String str8 = element5.className();
        org.jsoup.select.Elements elements9 = element5.getAllElements();
        org.jsoup.nodes.Element element11 = element5.prependText("<html>\n <head></head>\n <body></body>\n</html>");
        boolean boolean12 = element5.hasText();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.jsoup.nodes.Element element14 = document7.classNames((java.util.Set<java.lang.String>) strSet12);
        org.jsoup.nodes.Element element15 = document1.classNames((java.util.Set<java.lang.String>) strSet12);
        java.lang.String str16 = document1.className();
        org.jsoup.nodes.Element element17 = document1.empty();
        java.lang.String str18 = document1.ownText();
        org.jsoup.select.Elements elements21 = document1.getElementsByAttributeValueContaining("hi!", "hi!  #document");
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = document1.outputSettings();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings22.charset("\n<<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ?<<html>? <head></head>? <body></body>?</html>></<html>? <head></head>? <body></body>?</html>>");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!  #document" + "'", str16, "hi!  #document");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(outputSettings22);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!  #document");
        java.lang.String str2 = document1.title();
        org.jsoup.nodes.Element element3 = document1.empty();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element8 = document5.attr("hi!  #document", "#document");
        org.jsoup.select.Elements elements10 = document5.getElementsContainingText("hi!  #document");
        boolean boolean12 = document5.hasAttr("#document");
        org.jsoup.nodes.Element element13 = element3.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.select.Elements elements15 = element3.getElementsMatchingOwnText("#documenthi!");
        org.jsoup.nodes.Element element17 = element3.html("#root #document");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!  #document", "#document");
        org.jsoup.select.Elements elements6 = document1.getElementsContainingText("hi!  #document");
        java.lang.String str7 = document1.text();
        java.lang.String str9 = document1.absUrl("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element11 = document1.createElement(" #document");
        org.jsoup.select.Elements elements13 = document1.getElementsByIndexLessThan(0);
        org.jsoup.nodes.Document document14 = document1.normalise();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(document14);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependText("hi!");
        org.jsoup.nodes.Element element12 = element10.prependText("#document");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = element10.childNodes();
        java.lang.String str14 = element10.text();
        org.jsoup.nodes.Node node15 = element10.nextSibling();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#documenthi!" + "'", str14, "#documenthi!");
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Element element4 = document1.head();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.createElement(" #document");
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.select.Elements elements10 = document1.getElementsMatchingOwnText("<html>\n <head>\n  <title> hi!</title>\n </head>\n <body>\n  #document\n </body>\n</html>");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element14 = document12.html("");
        java.lang.String str15 = element14.className();
        org.jsoup.nodes.Element element16 = element14.empty();
        boolean boolean18 = element16.hasClass("");
        java.lang.String str19 = element16.html();
        java.lang.String str20 = element16.text();
        org.jsoup.select.Elements elements23 = element16.getElementsByAttributeValueMatching("hi!", "hi!  #document");
        java.lang.String str25 = element16.attr("#root");
        org.jsoup.nodes.Document document27 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element29 = document27.html("");
        org.jsoup.nodes.Element element31 = element29.html("#document");
        org.jsoup.nodes.Element element33 = element31.appendElement("hi!");
        org.jsoup.nodes.Element element34 = element16.appendChild((org.jsoup.nodes.Node) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) element16);
        org.jsoup.nodes.Document document37 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element38 = document37.head();
        java.lang.String str39 = document37.outerHtml();
        java.lang.Integer int40 = document37.elementSiblingIndex();
        java.lang.String str41 = document37.nodeName();
        org.jsoup.select.Elements elements44 = document37.getElementsByAttributeValueNot("hi!  #document", "hi!");
        boolean boolean46 = document37.hasClass("");
        org.jsoup.nodes.Element element47 = document37.head();
        org.jsoup.select.Elements elements49 = document37.getElementsByIndexLessThan(0);
        org.jsoup.nodes.Element element51 = document37.prepend("#root");
        org.jsoup.nodes.Element element52 = element35.prependChild((org.jsoup.nodes.Node) element51);
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNull(element38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "#document" + "'", str41, "#document");
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(element47);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(element52);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        document1.setBaseUri("");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.html("");
        java.lang.String str14 = element13.className();
        org.jsoup.nodes.Element element15 = element13.empty();
        java.lang.String str16 = element15.className();
        org.jsoup.nodes.Node node17 = element15.nextSibling();
        java.lang.String str18 = element15.className();
        org.jsoup.select.Elements elements19 = element15.getAllElements();
        org.jsoup.nodes.Element element20 = document1.prependChild((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Element element23 = element20.appendChild((org.jsoup.nodes.Node) document22);
        org.jsoup.nodes.Node node24 = document22.nextSibling();
        java.lang.String str25 = document22.className();
        org.jsoup.nodes.Document document27 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element29 = document27.removeClass("");
        org.jsoup.nodes.Element element31 = element29.toggleClass("hi!");
        org.jsoup.nodes.Element element32 = document22.appendChild((org.jsoup.nodes.Node) element31);
        org.jsoup.nodes.Document document34 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element36 = document34.html("");
        java.lang.String str37 = element36.className();
        org.jsoup.select.Elements elements39 = element36.getElementsByIndexLessThan((int) (short) 10);
        java.lang.String str40 = element36.data();
        org.jsoup.nodes.Document document41 = element36.ownerDocument();
        document22.replaceWith((org.jsoup.nodes.Node) document41);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node44 = document41.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(document41);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttribute("hi!  #document");
        org.jsoup.nodes.Element element12 = document1.val("");
        org.jsoup.select.Elements elements14 = document1.getElementsMatchingText("hi!  #document");
        org.jsoup.nodes.Element element16 = document1.html("#root");
        java.lang.String str17 = element16.data();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Node node6 = document1.removeAttr("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element8 = document1.addClass("");
        org.jsoup.nodes.Element element10 = document1.val("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element12 = document1.createElement("hi!#root <html> <head></head> <body></body> </html>");
        org.jsoup.nodes.Document document13 = document1.normalise();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements15 = document1.select("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(document13);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        org.jsoup.select.Elements elements4 = document1.getElementsByTag("#document");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element8 = document7.head();
        java.lang.String str9 = document7.outerHtml();
        java.lang.Integer int10 = document7.elementSiblingIndex();
        java.lang.String str11 = document7.nodeName();
        org.jsoup.parser.Tag tag12 = document7.tag();
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet15 = document14.classNames();
        java.util.Set<java.lang.String> strSet16 = document14.classNames();
        org.jsoup.nodes.Element element17 = document7.classNames(strSet16);
        org.jsoup.nodes.Element element18 = document1.classNames(strSet16);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("#document", "hi!");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element9 = document1.head();
        org.jsoup.select.Elements elements11 = element9.getElementsByClass("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str12 = element9.text();
        org.jsoup.nodes.Element element14 = element9.prependElement("hi!#root");
        org.jsoup.nodes.Element element15 = element14.nextElementSibling();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNull(element15);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.select.Elements elements5 = document1.children();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        org.jsoup.nodes.Element element7 = document1.parent();
        java.lang.String str8 = document1.html();
        org.jsoup.nodes.Element element10 = document1.val("");
        org.jsoup.select.Elements elements12 = document1.select("#root");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        boolean boolean7 = element5.hasClass("");
        java.lang.String str8 = element5.html();
        java.lang.String str9 = element5.text();
        org.jsoup.select.Elements elements12 = element5.getElementsByAttributeValueMatching("hi!", "hi!  #document");
        java.lang.String str14 = element5.attr("#root");
        org.jsoup.nodes.Element element16 = element5.toggleClass("");
        org.jsoup.select.Elements elements18 = element5.getElementsContainingText("<#root hi! #document=\"#document\">");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("");
        org.jsoup.parser.Tag tag4 = document1.tag();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.parser.Tag tag6 = document1.tag();
        org.jsoup.nodes.Element element8 = document1.createElement("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements10 = document1.getElementsByClass("#document");
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = document1.outputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings11.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode13 = outputSettings11.escapeMode();
        int int14 = outputSettings11.indentAmount();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings11.charset("#root <html> <head></head> <body></body> </html>");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: #root <html> <head></head> <body></body> </html>");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode13 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode13.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = document1.outputSettings();
        java.lang.String str6 = document1.title();
        org.jsoup.select.Elements elements7 = document1.children();
        org.jsoup.nodes.Element element8 = document1.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = element8.empty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.val("<html>\n <head></head>\n <body></body>\n</html>");
        element3.setBaseUri("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element8 = document7.head();
        java.lang.String str9 = document7.outerHtml();
        java.lang.Integer int10 = document7.elementSiblingIndex();
        java.lang.String str11 = document7.nodeName();
        org.jsoup.nodes.Element element13 = document7.removeClass("");
        boolean boolean15 = element13.hasAttr("hi!  #document");
        org.jsoup.nodes.Node node16 = element13.nextSibling();
        org.jsoup.select.Elements elements18 = element13.getElementsByTag("hi!");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element22 = document20.html("");
        boolean boolean24 = element22.hasClass("#document");
        org.jsoup.select.Elements elements25 = element22.parents();
        org.jsoup.select.Elements elements28 = element22.getElementsByAttributeValueMatching("#document", "hi!");
        org.jsoup.nodes.Document document30 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element32 = document30.html("");
        java.lang.String str33 = element32.className();
        org.jsoup.nodes.Element element34 = element22.prependChild((org.jsoup.nodes.Node) element32);
        org.jsoup.nodes.Element element35 = element13.prependChild((org.jsoup.nodes.Node) element34);
        org.jsoup.nodes.Document document37 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str38 = document37.nodeName();
        org.jsoup.nodes.Document document40 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element42 = document40.html("");
        java.lang.String str43 = element42.className();
        org.jsoup.nodes.Element element44 = element42.empty();
        org.jsoup.select.Elements elements46 = element42.getElementsMatchingOwnText("");
        org.jsoup.nodes.Document document48 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element49 = document48.head();
        java.lang.String str50 = document48.outerHtml();
        java.lang.Integer int51 = document48.elementSiblingIndex();
        org.jsoup.nodes.Element element53 = document48.addClass("#document");
        java.util.Set<java.lang.String> strSet54 = element53.classNames();
        org.jsoup.nodes.Element element55 = element42.classNames(strSet54);
        org.jsoup.nodes.Element element56 = document37.classNames(strSet54);
        org.jsoup.nodes.Element element57 = element35.classNames(strSet54);
        org.jsoup.nodes.Element element58 = element3.classNames(strSet54);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "#document" + "'", str38, "#document");
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNull(element49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(strSet54);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(element58);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueStarting("#document", "hi!  #document");
        java.lang.String str12 = document1.outerHtml();
        org.jsoup.nodes.Element element14 = document1.appendText("hi!  #document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        boolean boolean3 = document1.isBlock();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str6 = document1.attr("hi!");
        java.lang.Integer int7 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element10 = document9.head();
        java.lang.String str11 = document9.outerHtml();
        java.lang.Integer int12 = document9.siblingIndex();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = document9.outputSettings();
        java.lang.String str14 = document9.toString();
        java.util.Set<java.lang.String> strSet15 = document9.classNames();
        org.jsoup.nodes.Element element16 = document1.classNames(strSet15);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueNot("hi!  #document", "hi!");
        org.jsoup.select.Elements elements10 = document1.getElementsByTag("hi!");
        org.jsoup.nodes.Element element12 = document1.append("#root");
        org.jsoup.select.Elements elements13 = document1.parents();
        org.jsoup.nodes.Element element14 = document1.empty();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.html("");
        java.lang.String str19 = element18.className();
        org.jsoup.nodes.Element element20 = element18.empty();
        boolean boolean22 = element20.hasClass("");
        java.lang.String str23 = element20.html();
        java.lang.String str24 = element20.text();
        org.jsoup.select.Elements elements27 = element20.getElementsByAttributeValueMatching("hi!", "hi!  #document");
        org.jsoup.nodes.Element element30 = element20.attr("#root", "");
        org.jsoup.nodes.Element element32 = element20.toggleClass("hi!");
        org.jsoup.nodes.Element element34 = element20.prepend("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document36 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element38 = document36.html("");
        boolean boolean40 = element38.hasClass("#document");
        org.jsoup.select.Elements elements41 = element38.parents();
        java.lang.String str42 = element38.toString();
        java.util.regex.Pattern pattern44 = null;
        org.jsoup.select.Elements elements45 = element38.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body></body>\n</html>", pattern44);
        org.jsoup.select.Elements elements47 = element38.getElementsByClass("hi!  #document");
        java.util.Set<java.lang.String> strSet48 = element38.classNames();
        org.jsoup.nodes.Element element49 = element34.classNames(strSet48);
        org.jsoup.nodes.Element element50 = document1.classNames(strSet48);
        org.jsoup.nodes.Document document51 = element50.ownerDocument();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(document51);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.jsoup.nodes.Element element14 = document7.classNames((java.util.Set<java.lang.String>) strSet12);
        org.jsoup.nodes.Element element15 = document1.classNames((java.util.Set<java.lang.String>) strSet12);
        java.lang.String str16 = document1.className();
        org.jsoup.nodes.Document document17 = document1.ownerDocument();
        org.jsoup.nodes.Element element19 = document1.prepend("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element21 = document1.text("#root");
        java.lang.String str22 = document1.text();
        java.util.regex.Pattern pattern24 = null;
        org.jsoup.select.Elements elements25 = document1.getElementsByAttributeValueMatching("#document hi! #document", pattern24);
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!  #document" + "'", str16, "hi!  #document");
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#root" + "'", str22, "#root");
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        boolean boolean3 = document1.isBlock();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str6 = document1.attr("hi!");
        java.lang.Integer int7 = document1.elementSiblingIndex();
        org.jsoup.select.Elements elements9 = document1.getElementsMatchingText("");
        boolean boolean10 = document1.isBlock();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        document1.setBaseUri("");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.html("");
        java.lang.String str14 = element13.className();
        org.jsoup.nodes.Element element15 = element13.empty();
        java.lang.String str16 = element15.className();
        org.jsoup.nodes.Node node17 = element15.nextSibling();
        java.lang.String str18 = element15.className();
        org.jsoup.select.Elements elements19 = element15.getAllElements();
        org.jsoup.nodes.Element element20 = document1.prependChild((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Element element21 = element15.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList22 = element21.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNull(element21);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element7 = document1.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Attributes attributes8 = document1.attributes();
        org.jsoup.nodes.Element element10 = document1.append("<html> <head></head> <body></body> </html>");
        java.lang.String str11 = document1.val();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependElement("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = element10.dataset();
        org.jsoup.nodes.Element element13 = element10.after("hi!  #document");
        org.jsoup.select.Elements elements15 = element13.getElementsByIndexGreaterThan((int) ' ');
        java.lang.String str17 = element13.attr("#documenthi!hi!");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        boolean boolean5 = element3.hasClass("#document");
        org.jsoup.select.Elements elements6 = element3.parents();
        org.jsoup.select.Elements elements9 = element3.getElementsByAttributeValueMatching("#document", "hi!");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.html("");
        java.lang.String str14 = element13.className();
        org.jsoup.nodes.Element element15 = element3.prependChild((org.jsoup.nodes.Node) element13);
        java.lang.Integer int16 = element13.siblingIndex();
        org.jsoup.select.Elements elements17 = element13.parents();
        org.jsoup.nodes.Document document18 = element13.ownerDocument();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(document18);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        java.lang.String str8 = element3.className();
        org.jsoup.nodes.Element element11 = element3.attr("hi!  #document", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements13 = element3.getElementsByIndexLessThan(100);
        org.jsoup.nodes.Element element14 = element3.empty();
        org.jsoup.nodes.Element element16 = element14.appendText("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element20 = document18.html("");
        java.lang.String str21 = element20.className();
        org.jsoup.nodes.Element element22 = element20.empty();
        java.lang.String str23 = element22.className();
        org.jsoup.nodes.Node node24 = element22.nextSibling();
        java.lang.String str25 = element22.className();
        org.jsoup.select.Elements elements26 = element22.getAllElements();
        org.jsoup.nodes.Element element28 = element22.prepend(" #document");
        // The following exception was thrown during execution in test generation
        try {
            element16.replaceWith((org.jsoup.nodes.Node) element28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element28);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.wrap("hi!");
        org.jsoup.nodes.Element element4 = document1.body();
        boolean boolean6 = document1.hasClass("hi!");
        java.lang.String str7 = document1.data();
        java.lang.String str8 = document1.outerHtml();
        org.jsoup.select.Elements elements10 = document1.getElementsByIndexEquals((int) (short) 1);
        java.lang.Integer int11 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        org.jsoup.nodes.Element element20 = document13.classNames((java.util.Set<java.lang.String>) strSet18);
        org.jsoup.nodes.Element element22 = element20.html("hi!");
        org.jsoup.select.Elements elements25 = element20.getElementsByAttributeValueMatching("<#root hi!  #document=\"#document\"></#root>", " #document");
        boolean boolean26 = document1.equals((java.lang.Object) element20);
        java.lang.String str27 = element20.toString();
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Node node5 = document1.nextSibling();
        java.lang.String str6 = document1.html();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element10 = document8.html("");
        boolean boolean12 = element10.hasClass("#document");
        org.jsoup.select.Elements elements13 = element10.parents();
        org.jsoup.select.Elements elements16 = element10.getElementsByAttributeValueMatching("#document", "hi!");
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element20 = document18.html("");
        java.lang.String str21 = element20.className();
        org.jsoup.nodes.Element element22 = element10.prependChild((org.jsoup.nodes.Node) element20);
        org.jsoup.nodes.Element element24 = element20.prependText("#document");
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element28 = document26.html("");
        boolean boolean30 = element28.hasClass("#document");
        org.jsoup.select.Elements elements31 = element28.parents();
        org.jsoup.select.Elements elements34 = element28.getElementsByAttributeValueMatching("#document", "hi!");
        org.jsoup.nodes.Document document36 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element38 = document36.html("");
        java.lang.String str39 = element38.className();
        org.jsoup.nodes.Element element40 = element28.prependChild((org.jsoup.nodes.Node) element38);
        org.jsoup.nodes.Element element41 = element38.previousElementSibling();
        org.jsoup.nodes.Element element43 = element38.toggleClass("hi!  #document");
        element24.replaceWith((org.jsoup.nodes.Node) element38);
        org.jsoup.nodes.Document document46 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements49 = document46.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.select.Elements elements51 = document46.getElementsMatchingText("");
        org.jsoup.nodes.Element element53 = document46.html("hi!  #document");
        org.jsoup.nodes.Document document55 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element57 = document55.html("");
        org.jsoup.nodes.Element element59 = element57.html("#document");
        org.jsoup.nodes.Element element61 = element59.appendElement("hi!");
        org.jsoup.nodes.Element element62 = document46.appendChild((org.jsoup.nodes.Node) element59);
        element38.replaceWith((org.jsoup.nodes.Node) element62);
        org.jsoup.nodes.Element element64 = document1.appendChild((org.jsoup.nodes.Node) element38);
        org.jsoup.nodes.Element element66 = element64.toggleClass("<#root> #root <html> <head></head> <body></body> </html>");
        org.jsoup.select.Elements elements67 = element66.parents();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNull(element41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertNotNull(elements51);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNotNull(element62);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertNotNull(element66);
        org.junit.Assert.assertNotNull(elements67);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Element element4 = document1.head();
        java.lang.String str5 = document1.nodeName();
        java.lang.String str6 = document1.id();
        java.lang.String str7 = document1.nodeName();
        org.jsoup.select.Elements elements9 = document1.getElementsByAttribute("hi!  #document");
        org.jsoup.select.Elements elements10 = document1.getAllElements();
        org.jsoup.nodes.Element element12 = document1.prependText("<html>\n <head></head>\n <body></body>\n</html><#document></#document>");
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = document1.outputSettings();
        java.lang.Integer int14 = document1.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = document1.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependText("hi!");
        org.jsoup.nodes.Element element12 = element10.prependText("#document");
        java.lang.String str13 = element12.tagName();
        org.jsoup.nodes.Element element15 = element12.toggleClass("hi!");
        boolean boolean17 = element15.hasClass("#document <head></head>");
        org.jsoup.nodes.Document document18 = element15.ownerDocument();
        java.lang.String str19 = document18.title();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#root" + "'", str13, "#root");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.html("hi!");
        boolean boolean11 = element9.hasAttr("hi!");
        java.util.Set<java.lang.String> strSet12 = element9.classNames();
        org.jsoup.select.Elements elements14 = element9.getElementsByAttribute("#root");
        org.jsoup.select.Elements elements16 = element9.getElementsByClass("#root <html> <head></head> <body></body> </html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = element9.after("\n<<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        boolean boolean9 = element7.hasAttr("hi!  #document");
        java.lang.String str10 = element7.tagName();
        org.jsoup.nodes.Element element12 = element7.toggleClass("");
        java.lang.String str13 = element12.id();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.select.Elements elements6 = element4.getElementsByAttributeStarting("#root");
        java.util.regex.Pattern pattern7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = element4.getElementsMatchingOwnText(pattern7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueNot("hi!  #document", "hi!");
        boolean boolean10 = document1.hasClass("");
        org.jsoup.nodes.Element element11 = document1.head();
        org.jsoup.nodes.Element element13 = document1.prependElement("#documenthi!");
        boolean boolean14 = document1.hasText();
        org.jsoup.nodes.Element element15 = document1.head();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(element15);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element9 = element3.empty();
        java.lang.String str11 = element3.absUrl("#document");
        java.lang.Integer int12 = element3.siblingIndex();
        org.jsoup.select.Elements elements14 = element3.getElementsByIndexEquals((int) (short) 100);
        org.jsoup.nodes.Element element16 = element3.removeClass("#document");
        org.jsoup.nodes.Element element18 = element3.toggleClass("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document19 = element18.ownerDocument();
        org.jsoup.select.Elements elements22 = document19.getElementsByAttributeValueContaining("<html>\n <head></head>\n <body>\n </body>\n</html><<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>", "#document<#root>\n hi!\n</#root>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("head");
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.html("#document");
        org.jsoup.nodes.Element element7 = element5.appendElement("hi!");
        org.jsoup.nodes.Element element9 = element7.addClass("");
        java.lang.Integer int10 = element7.elementSiblingIndex();
        org.jsoup.nodes.Element element12 = element7.prependText("<html>\n <head></head>\n <body></body>\n</html><#root></#root>");
        java.lang.String str13 = element7.val();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element7 = document1.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.select.Elements elements9 = document1.getElementsByClass("#document");
        java.lang.String str10 = document1.title();
        org.jsoup.nodes.Element element12 = document1.createElement("\n<head></head>");
        org.jsoup.select.Elements elements14 = document1.getElementsByTag("#root <html> <head></head> <body></body> </html>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Node node6 = document1.removeAttr("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element8 = document1.addClass("");
        org.jsoup.nodes.Element element10 = document1.prepend("<html>\n <head>\n  <title> hi!</title>\n </head>\n <body>\n  #document\n </body>\n</html>");
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str13 = document12.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = document12.outputSettings();
        document12.title("hi!  #document");
        java.lang.String str17 = document12.title();
        org.jsoup.nodes.Element element18 = document12.body();
        org.jsoup.parser.Tag tag19 = element18.tag();
        org.jsoup.nodes.Element element20 = element10.appendChild((org.jsoup.nodes.Node) element18);
        org.jsoup.nodes.Element element21 = element10.parent();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#document" + "'", str13, "#document");
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!  #document" + "'", str17, "hi!  #document");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNull(element21);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("hi!");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingOwnText("#document");
        org.jsoup.select.Elements elements7 = document1.getElementsByIndexEquals(0);
        java.lang.String str8 = document1.title();
        java.lang.String str9 = document1.tagName();
        java.lang.String str11 = document1.attr("#documenthi!");
        java.lang.String str12 = document1.nodeName();
        org.jsoup.nodes.Element element14 = document1.addClass("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            element14.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#root" + "'", str9, "#root");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.html("hi!");
        java.lang.Integer int11 = element10.elementSiblingIndex();
        org.jsoup.select.Elements elements13 = element10.getElementsMatchingText("body");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.nodes.Document document5 = document1.ownerDocument();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.select.Elements elements9 = document1.getElementsByIndexLessThan((int) (short) 1);
        org.jsoup.nodes.Element element11 = document1.html("<#root></#root>hi!");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        boolean boolean9 = element7.hasAttr("hi!  #document");
        java.lang.String str10 = element7.tagName();
        org.jsoup.select.Elements elements12 = element7.getElementsByClass("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.regex.Pattern pattern14 = null;
        org.jsoup.select.Elements elements15 = element7.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body></body>\n</html>", pattern14);
        boolean boolean17 = element7.hasAttr("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element19 = element7.prependElement("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        java.lang.String str20 = element7.toString();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>></<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>>" + "'", str20, "<<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>></<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>>");
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependText("hi!");
        org.jsoup.nodes.Element element12 = element10.prependText("#document");
        java.lang.String str13 = element12.tagName();
        org.jsoup.nodes.Element element15 = element12.toggleClass("hi!");
        boolean boolean17 = element15.hasClass("#document <head></head>");
        org.jsoup.nodes.Document document18 = element15.ownerDocument();
        org.jsoup.select.Elements elements20 = document18.getElementsByIndexEquals(100);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#root" + "'", str13, "#root");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.append("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements5 = document1.getElementsByAttributeStarting("<#root></#root>hi!");
        org.jsoup.nodes.Element element7 = document1.append("#document hi! #document");
        org.jsoup.select.Elements elements10 = element7.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body></body>\n</html><<html>\n <head></head>\n <body>\n </body>\n</html><<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>></<html>\n <head></head>\n <body>\n </body>\n</html><<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>>", "hi! #document<#root>\n #document<hi!></hi!>\n</#root>");
        java.lang.Class<?> wildcardClass11 = elements10.getClass();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        java.lang.Integer int5 = document1.siblingIndex();
        org.jsoup.nodes.Element element6 = document1.body();
        org.jsoup.nodes.Element element7 = document1.body();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element10 = document9.head();
        java.lang.String str11 = document9.outerHtml();
        java.lang.Integer int12 = document9.elementSiblingIndex();
        java.lang.String str13 = document9.nodeName();
        org.jsoup.select.Elements elements16 = document9.getElementsByAttributeValueNot("hi!  #document", "hi!");
        org.jsoup.select.Elements elements18 = document9.getElementsByTag("hi!");
        org.jsoup.nodes.Element element20 = document9.append("#root");
        org.jsoup.select.Elements elements21 = document9.parents();
        org.jsoup.nodes.Element element22 = document9.empty();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element26 = document24.html("");
        java.lang.String str27 = element26.className();
        org.jsoup.nodes.Element element28 = element26.empty();
        boolean boolean30 = element28.hasClass("");
        java.lang.String str31 = element28.html();
        java.lang.String str32 = element28.text();
        org.jsoup.select.Elements elements35 = element28.getElementsByAttributeValueMatching("hi!", "hi!  #document");
        org.jsoup.nodes.Element element38 = element28.attr("#root", "");
        org.jsoup.nodes.Element element40 = element28.toggleClass("hi!");
        org.jsoup.nodes.Element element42 = element28.prepend("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document44 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element46 = document44.html("");
        boolean boolean48 = element46.hasClass("#document");
        org.jsoup.select.Elements elements49 = element46.parents();
        java.lang.String str50 = element46.toString();
        java.util.regex.Pattern pattern52 = null;
        org.jsoup.select.Elements elements53 = element46.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body></body>\n</html>", pattern52);
        org.jsoup.select.Elements elements55 = element46.getElementsByClass("hi!  #document");
        java.util.Set<java.lang.String> strSet56 = element46.classNames();
        org.jsoup.nodes.Element element57 = element42.classNames(strSet56);
        org.jsoup.nodes.Element element58 = document9.classNames(strSet56);
        org.jsoup.nodes.Element element59 = document1.classNames(strSet56);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element60 = element59.nextElementSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#document" + "'", str13, "#document");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertNotNull(elements55);
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(element59);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = document1.nodeName();
        org.jsoup.select.Elements elements6 = document1.select("body");
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = document1.outputSettings();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element10 = document9.head();
        java.lang.String str11 = document9.outerHtml();
        java.lang.Integer int12 = document9.elementSiblingIndex();
        java.lang.String str13 = document9.nodeName();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Element element16 = document9.createElement("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements18 = document9.getElementsByClass("#document");
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = document9.outputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings19.escapeMode();
        java.nio.charset.Charset charset21 = outputSettings19.charset();
        java.nio.charset.Charset charset22 = outputSettings19.charset();
        java.nio.charset.CharsetEncoder charsetEncoder23 = outputSettings19.encoder();
        int int24 = outputSettings19.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings19.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings7.escapeMode(escapeMode25);
        java.nio.charset.CharsetEncoder charsetEncoder27 = outputSettings26.encoder();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#document" + "'", str13, "#document");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset21);
        org.junit.Assert.assertNotNull(charset22);
        org.junit.Assert.assertNotNull(charsetEncoder23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode25 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode25.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(charsetEncoder27);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("#document", "hi!");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueNot("#document", "#document");
        org.jsoup.nodes.Element element11 = document1.text("#document");
        java.lang.String str12 = document1.title();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        boolean boolean7 = element5.hasClass("");
        java.lang.String str8 = element5.html();
        java.lang.String str9 = element5.text();
        org.jsoup.select.Elements elements12 = element5.getElementsByAttributeValueMatching("hi!", "hi!  #document");
        org.jsoup.nodes.Element element15 = element5.attr("#root", "");
        org.jsoup.nodes.Element element17 = element5.toggleClass("hi!");
        org.jsoup.select.Elements elements20 = element5.getElementsByAttributeValueNot("hi!  #document", "#root");
        org.jsoup.nodes.Element element22 = element5.val("<#root class=\"\"></#root>");
        boolean boolean23 = element22.isBlock();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        java.lang.String str8 = document1.html();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Node node5 = document1.nextSibling();
        java.lang.String str6 = document1.html();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = document1.outputSettings();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element10 = document9.head();
        java.lang.String str11 = document9.outerHtml();
        java.lang.Integer int12 = document9.elementSiblingIndex();
        java.lang.String str13 = document9.nodeName();
        org.jsoup.nodes.Element element15 = document9.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = document9.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.indentAmount(10);
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings18.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings7.escapeMode(escapeMode19);
        boolean boolean21 = outputSettings20.prettyPrint();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#document" + "'", str13, "#document");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.nodes.Document document5 = document1.ownerDocument();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = document9.classNames((java.util.Set<java.lang.String>) strSet14);
        org.jsoup.select.Elements elements19 = document9.getElementsByAttributeValueStarting("#document", "hi!  #document");
        org.jsoup.nodes.Document document20 = document9.normalise();
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element24 = document22.html("");
        org.jsoup.nodes.Element element26 = element24.html("#document");
        org.jsoup.nodes.Document document28 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element30 = document28.html("");
        java.lang.String str31 = element30.className();
        org.jsoup.nodes.Element element32 = element30.empty();
        org.jsoup.select.Elements elements34 = element30.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element36 = element30.html("hi!");
        boolean boolean38 = element36.hasAttr("hi!");
        java.util.Set<java.lang.String> strSet39 = element36.classNames();
        org.jsoup.nodes.Element element40 = element26.classNames(strSet39);
        org.jsoup.nodes.Element element41 = document9.classNames(strSet39);
        org.jsoup.nodes.Element element43 = element41.prependText("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.Integer int44 = element43.elementSiblingIndex();
        java.lang.String str45 = element43.id();
        org.jsoup.select.Elements elements47 = element43.getElementsByIndexEquals(100);
        org.jsoup.nodes.Element element49 = element43.appendText("<#root></#root>");
        org.jsoup.select.Elements elements51 = element43.getElementsByIndexEquals((int) (short) 10);
        org.jsoup.nodes.Element element52 = document1.appendChild((org.jsoup.nodes.Node) element43);
        java.lang.String str54 = element52.absUrl("head");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(elements51);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        boolean boolean7 = element5.hasClass("");
        java.lang.String str8 = element5.html();
        java.lang.String str9 = element5.text();
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.html("");
        java.lang.String str14 = element13.className();
        org.jsoup.nodes.Element element15 = element13.empty();
        boolean boolean17 = element15.hasClass("");
        java.lang.String str18 = element15.html();
        java.lang.String str19 = element15.text();
        org.jsoup.select.Elements elements22 = element15.getElementsByAttributeValueMatching("hi!", "hi!  #document");
        org.jsoup.select.Elements elements25 = element15.getElementsByAttributeValue("hi!", "#document");
        org.jsoup.nodes.Element element27 = element15.appendElement("hi!  #document");
        org.jsoup.nodes.Element element28 = element5.appendChild((org.jsoup.nodes.Node) element27);
        java.lang.String str29 = element28.ownText();
        org.jsoup.nodes.Attributes attributes30 = element28.attributes();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(attributes30);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Node node6 = document1.removeAttr("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element8 = document1.addClass("");
        org.jsoup.nodes.Element element10 = document1.val("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element11 = document1.body();
        org.jsoup.nodes.Node node13 = element11.removeAttr("hi!  #document");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document document4 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element6 = document4.html("");
        java.lang.String str7 = element6.className();
        org.jsoup.nodes.Element element8 = element6.empty();
        org.jsoup.select.Elements elements10 = element6.getElementsMatchingOwnText("");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document12.head();
        java.lang.String str14 = document12.outerHtml();
        java.lang.Integer int15 = document12.elementSiblingIndex();
        org.jsoup.nodes.Element element17 = document12.addClass("#document");
        java.util.Set<java.lang.String> strSet18 = element17.classNames();
        org.jsoup.nodes.Element element19 = element6.classNames(strSet18);
        org.jsoup.nodes.Element element20 = document1.classNames(strSet18);
        java.lang.String str21 = element20.id();
        org.jsoup.select.Elements elements24 = element20.getElementsByAttributeValueStarting("hi!  #document", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements25 = element20.parents();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element7 = document1.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element9 = document6.text("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element11 = document6.prependText("#root");
        org.jsoup.select.Elements elements13 = element11.getElementsByAttribute("#document");
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements18 = document15.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Node node19 = document15.nextSibling();
        java.lang.String str20 = document15.html();
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element24 = document22.html("");
        boolean boolean26 = element24.hasClass("#document");
        org.jsoup.select.Elements elements27 = element24.parents();
        org.jsoup.select.Elements elements30 = element24.getElementsByAttributeValueMatching("#document", "hi!");
        org.jsoup.nodes.Document document32 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element34 = document32.html("");
        java.lang.String str35 = element34.className();
        org.jsoup.nodes.Element element36 = element24.prependChild((org.jsoup.nodes.Node) element34);
        org.jsoup.nodes.Element element38 = element34.prependText("#document");
        org.jsoup.nodes.Document document40 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element42 = document40.html("");
        boolean boolean44 = element42.hasClass("#document");
        org.jsoup.select.Elements elements45 = element42.parents();
        org.jsoup.select.Elements elements48 = element42.getElementsByAttributeValueMatching("#document", "hi!");
        org.jsoup.nodes.Document document50 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element52 = document50.html("");
        java.lang.String str53 = element52.className();
        org.jsoup.nodes.Element element54 = element42.prependChild((org.jsoup.nodes.Node) element52);
        org.jsoup.nodes.Element element55 = element52.previousElementSibling();
        org.jsoup.nodes.Element element57 = element52.toggleClass("hi!  #document");
        element38.replaceWith((org.jsoup.nodes.Node) element52);
        org.jsoup.nodes.Document document60 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements63 = document60.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.select.Elements elements65 = document60.getElementsMatchingText("");
        org.jsoup.nodes.Element element67 = document60.html("hi!  #document");
        org.jsoup.nodes.Document document69 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element71 = document69.html("");
        org.jsoup.nodes.Element element73 = element71.html("#document");
        org.jsoup.nodes.Element element75 = element73.appendElement("hi!");
        org.jsoup.nodes.Element element76 = document60.appendChild((org.jsoup.nodes.Node) element73);
        element52.replaceWith((org.jsoup.nodes.Node) element76);
        org.jsoup.nodes.Element element78 = document15.appendChild((org.jsoup.nodes.Node) element52);
        org.jsoup.nodes.Document document79 = element78.ownerDocument();
        boolean boolean81 = element78.hasClass("body");
        org.jsoup.nodes.Element element82 = element11.prependChild((org.jsoup.nodes.Node) element78);
        org.jsoup.select.Elements elements84 = element78.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element85 = element78.firstElementSibling();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNull(element55);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(elements63);
        org.junit.Assert.assertNotNull(elements65);
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertNotNull(element71);
        org.junit.Assert.assertNotNull(element73);
        org.junit.Assert.assertNotNull(element75);
        org.junit.Assert.assertNotNull(element76);
        org.junit.Assert.assertNotNull(element78);
        org.junit.Assert.assertNotNull(document79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(element82);
        org.junit.Assert.assertNotNull(elements84);
        org.junit.Assert.assertNotNull(element85);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        boolean boolean9 = element7.hasAttr("hi!  #document");
        java.lang.String str10 = element7.tagName();
        org.jsoup.select.Elements elements12 = element7.getElementsByClass("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.regex.Pattern pattern14 = null;
        org.jsoup.select.Elements elements15 = element7.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body></body>\n</html>", pattern14);
        org.jsoup.select.Elements elements17 = element7.getElementsContainingText("");
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element21 = document19.html("");
        org.jsoup.nodes.Element element23 = element21.appendText("hi!");
        java.lang.String str24 = element21.data();
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element28 = document26.html("");
        java.lang.String str29 = element28.className();
        org.jsoup.nodes.Element element30 = element28.empty();
        java.lang.String str31 = element30.className();
        org.jsoup.nodes.Node node32 = element30.nextSibling();
        java.lang.String str33 = element30.className();
        org.jsoup.parser.Tag tag34 = element30.tag();
        org.jsoup.nodes.Document document36 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element37 = document36.head();
        org.jsoup.nodes.Element element38 = element30.prependChild((org.jsoup.nodes.Node) document36);
        boolean boolean39 = element21.equals((java.lang.Object) element30);
        org.jsoup.nodes.Element element40 = element7.prependChild((org.jsoup.nodes.Node) element30);
        boolean boolean41 = element30.hasText();
        org.jsoup.nodes.Element element43 = element30.removeClass("<#root>\n #root\n <html>\n  <head></head>\n  <body>\n   &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n  </body>\n </html>\n</#root>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNull(element37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(element43);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.removeClass("");
        java.lang.String str4 = document1.text();
        org.jsoup.nodes.Element element6 = document1.prependElement("<#root>\n #root\n <html>\n  <head></head>\n  <body>\n   &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n  </body>\n </html>\n</#root>");
        org.jsoup.nodes.Element element8 = document1.append("<html> <head> <title>#root</title> </head> <body></body> </html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element5 = document1.createElement("<#root></#root>");
        org.jsoup.nodes.Element element8 = document1.attr("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>", "#root");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node12 = document10.removeAttr("#document");
        org.jsoup.nodes.Element element13 = document10.body();
        org.jsoup.nodes.Node node15 = document10.removeAttr("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element17 = document10.addClass("");
        org.jsoup.select.Elements elements19 = document10.getElementsByAttribute("#root");
        org.jsoup.nodes.Element element21 = document10.prependElement("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element22 = document1.appendChild((org.jsoup.nodes.Node) element21);
        // The following exception was thrown during execution in test generation
        try {
            element22.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.html("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = element10.dataset();
        org.jsoup.nodes.Element element13 = element10.prepend("<#root hi!  #document=\"#document\"></#root>");
        boolean boolean14 = element10.hasText();
        org.jsoup.select.Elements elements17 = element10.getElementsByAttributeValueContaining(" hi!", "#root #document");
        java.lang.String str19 = element10.absUrl("<html> \n <head></head> \n <body> \n </body>\n</html>");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueStarting("#document", "hi!  #document");
        org.jsoup.nodes.Document document12 = document1.normalise();
        org.jsoup.select.Elements elements14 = document12.getElementsByClass("#documenthi!hi!");
        java.lang.Integer int15 = document12.siblingIndex();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.nodes.Attributes attributes6 = element5.attributes();
        org.jsoup.select.Elements elements9 = element5.getElementsByAttributeValueContaining("#document", "#root");
        org.jsoup.select.Elements elements12 = element5.getElementsByAttributeValueEnding("#document", "#document");
        org.jsoup.select.Elements elements14 = element5.getElementsMatchingText("<hi!  #document></hi!  #document>");
        org.jsoup.nodes.Element element16 = element5.toggleClass("#root #document");
        org.jsoup.nodes.Node node17 = element5.nextSibling();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.select.Elements elements6 = document1.getElementsMatchingText("");
        org.jsoup.nodes.Element element8 = document1.html("hi!  #document");
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element12 = document10.html("");
        org.jsoup.nodes.Element element14 = element12.html("#document");
        org.jsoup.nodes.Element element16 = element14.appendElement("hi!");
        org.jsoup.nodes.Element element17 = document1.appendChild((org.jsoup.nodes.Node) element14);
        java.lang.String str19 = element17.absUrl("#root");
        org.jsoup.select.Elements elements20 = element17.children();
        java.lang.String str21 = element17.ownText();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! #document" + "'", str21, "hi! #document");
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueStarting("#document", "hi!  #document");
        boolean boolean13 = document1.hasClass("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element15 = document1.appendText("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = document1.new OutputSettings();
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet19 = document18.classNames();
        boolean boolean20 = document18.isBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = document18.new OutputSettings();
        java.nio.charset.Charset charset22 = outputSettings21.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings16.charset(charset22);
        java.nio.charset.Charset charset24 = outputSettings23.charset();
        boolean boolean25 = outputSettings23.prettyPrint();
        boolean boolean26 = outputSettings23.prettyPrint();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(charset22);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(charset24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        org.jsoup.select.Elements elements8 = element3.getElementsByAttribute("<html>\n <head>\n  <title> hi!</title>\n </head>\n <body>\n  #document\n </body>\n</html>");
        org.jsoup.nodes.Element element10 = element3.prepend("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.parser.Tag tag11 = element3.tag();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        boolean boolean7 = element5.hasClass("");
        java.lang.String str8 = element5.html();
        java.util.regex.Pattern pattern10 = null;
        org.jsoup.select.Elements elements11 = element5.getElementsByAttributeValueMatching("", pattern10);
        java.lang.Integer int12 = element5.elementSiblingIndex();
        org.jsoup.nodes.Element element15 = element5.attr("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>", "&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element17 = element15.val("<html>\n <head></head>\n <body>\n  #documenthi!\n </body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = element17.after("<html> <head> <title>#root</title> </head> <body></body> </html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element3.childNodes();
        org.jsoup.nodes.Node node9 = element3.removeAttr("<html>\n <head></head>\n <body></body>\n</html><#document></#document>");
        org.jsoup.select.Elements elements11 = element3.getElementsByClass("#document hi! #document");
        java.util.regex.Pattern pattern12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = element3.getElementsMatchingText(pattern12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexGreaterThan((int) (byte) -1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.nodes.Attributes attributes6 = element5.attributes();
        org.jsoup.select.Elements elements9 = element5.getElementsByAttributeValueContaining("#document", "#root");
        org.jsoup.select.Elements elements10 = element5.children();
        java.lang.String str11 = element5.tagName();
        org.jsoup.select.Elements elements12 = element5.children();
        org.jsoup.select.Elements elements14 = element5.getElementsByIndexEquals(0);
        org.jsoup.nodes.Element element16 = element5.toggleClass("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements18 = element16.select("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.head();
        org.jsoup.nodes.Node node5 = document1.nextSibling();
        org.jsoup.nodes.Document document6 = document1.normalise();
        org.jsoup.nodes.Element element8 = document1.text("hi! #document");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root <html> <head></head> <body></body> </html>");
        org.jsoup.select.Elements elements3 = document1.getElementsByIndexEquals((int) (byte) 1);
        java.lang.String str4 = document1.html();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.jsoup.nodes.Element element14 = document7.classNames((java.util.Set<java.lang.String>) strSet12);
        org.jsoup.nodes.Element element15 = document1.classNames((java.util.Set<java.lang.String>) strSet12);
        java.lang.String str16 = document1.className();
        org.jsoup.nodes.Document document17 = document1.ownerDocument();
        org.jsoup.nodes.Element element19 = document1.prepend("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements21 = element19.getElementsContainingText("<hi!  #document></hi!  #document>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!  #document" + "'", str16, "hi!  #document");
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        boolean boolean5 = element3.hasClass("#document");
        org.jsoup.select.Elements elements6 = element3.parents();
        org.jsoup.select.Elements elements9 = element3.getElementsByAttributeValueMatching("#document", "hi!");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.html("");
        java.lang.String str14 = element13.className();
        org.jsoup.nodes.Element element15 = element3.prependChild((org.jsoup.nodes.Node) element13);
        org.jsoup.nodes.Element element16 = element13.previousElementSibling();
        org.jsoup.nodes.Element element18 = element13.toggleClass("hi!  #document");
        org.jsoup.nodes.Element element20 = element13.removeClass("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element21 = element13.parent();
        org.jsoup.nodes.Document document22 = element13.ownerDocument();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(document22);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.appendText("hi!");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element9 = document7.html("");
        java.lang.String str10 = element9.className();
        org.jsoup.nodes.Element element11 = element9.empty();
        org.jsoup.select.Elements elements13 = element9.getElementsByIndexLessThan((int) (short) 100);
        java.lang.String str14 = element9.className();
        org.jsoup.nodes.Element element17 = element9.attr("hi!  #document", "<html>\n <head></head>\n <body></body>\n</html>");
        java.util.Set<java.lang.String> strSet18 = element9.classNames();
        java.lang.String str19 = element9.baseUri();
        org.jsoup.nodes.Element element20 = element5.appendChild((org.jsoup.nodes.Node) element9);
        org.jsoup.nodes.Element element22 = element5.prependText("head");
        java.util.regex.Pattern pattern23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements24 = element22.getElementsMatchingOwnText(pattern23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element9 = element3.empty();
        java.lang.String str11 = element3.absUrl("#document");
        java.lang.Integer int12 = element3.siblingIndex();
        org.jsoup.select.Elements elements14 = element3.getElementsByIndexEquals((int) (short) 100);
        java.util.regex.Pattern pattern16 = null;
        org.jsoup.select.Elements elements17 = element3.getElementsByAttributeValueMatching("hi!", pattern16);
        org.jsoup.nodes.Attributes attributes18 = element3.attributes();
        org.jsoup.select.Elements elements21 = element3.getElementsByAttributeValue("<html>\n <head>\n  <title> hi!</title>\n </head>\n <body>\n  #document\n </body>\n</html>", "<#root></#root>hi!");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependText("hi!");
        org.jsoup.nodes.Element element12 = element10.prependText("#document");
        java.lang.String str13 = element12.tagName();
        org.jsoup.nodes.Element element15 = element12.toggleClass("hi!");
        org.jsoup.nodes.Element element17 = element12.prepend("\n<head></head>");
        java.lang.String str18 = element12.val();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#root" + "'", str13, "#root");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.html("#document");
        org.jsoup.nodes.Element element7 = element5.appendElement("hi!");
        element7.setBaseUri("#document");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element7.siblingNodes();
        boolean boolean11 = element7.hasText();
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element15 = document13.html("");
        org.jsoup.select.Elements elements17 = document13.getElementsContainingText("");
        org.jsoup.nodes.Element element19 = document13.prependText("hi!");
        document13.setBaseUri("");
        boolean boolean23 = document13.hasClass("");
        org.jsoup.nodes.Document document24 = document13.ownerDocument();
        org.jsoup.nodes.Element element25 = element7.appendChild((org.jsoup.nodes.Node) document13);
        org.jsoup.select.Elements elements27 = document13.getElementsByIndexEquals((int) '4');
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document1.addClass("#document");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document1.childNodes();
        java.lang.String str8 = document1.title();
        java.lang.String str9 = document1.val();
        java.util.Set<java.lang.String> strSet10 = document1.classNames();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueStarting("#document", "hi!  #document");
        org.jsoup.nodes.Document document12 = document1.normalise();
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element16 = document14.html("");
        org.jsoup.nodes.Element element18 = element16.html("#document");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element22 = document20.html("");
        java.lang.String str23 = element22.className();
        org.jsoup.nodes.Element element24 = element22.empty();
        org.jsoup.select.Elements elements26 = element22.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element28 = element22.html("hi!");
        boolean boolean30 = element28.hasAttr("hi!");
        java.util.Set<java.lang.String> strSet31 = element28.classNames();
        org.jsoup.nodes.Element element32 = element18.classNames(strSet31);
        org.jsoup.nodes.Element element33 = document1.classNames(strSet31);
        org.jsoup.nodes.Element element35 = element33.prependText("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.Integer int36 = element35.elementSiblingIndex();
        java.lang.String str37 = element35.id();
        org.jsoup.nodes.Element element39 = element35.html("hi!#root");
        org.jsoup.select.Elements elements41 = element35.getElementsMatchingText("<html>\n <head></head>\n <body>\n </body>\n</html><<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(elements41);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element9 = element3.empty();
        java.lang.String str11 = element3.absUrl("#document");
        java.lang.Integer int12 = element3.siblingIndex();
        org.jsoup.select.Elements elements14 = element3.getElementsByIndexEquals((int) (short) 100);
        java.util.regex.Pattern pattern16 = null;
        org.jsoup.select.Elements elements17 = element3.getElementsByAttributeValueMatching("hi!", pattern16);
        org.jsoup.nodes.Attributes attributes18 = element3.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element20 = element3.after("<body></body>\n<html> \n <head></head> \n <body> \n </body>\n</html><#root #root=\"\"></#root>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!  #document", "#document");
        org.jsoup.select.Elements elements6 = document1.getElementsContainingText("hi!  #document");
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = document1.outputSettings();
        java.lang.String str8 = document1.val();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element9 = document7.html("");
        java.lang.String str10 = element9.className();
        org.jsoup.nodes.Element element11 = element9.empty();
        org.jsoup.select.Elements elements13 = element9.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element15 = element9.html("hi!");
        boolean boolean17 = element15.hasAttr("hi!");
        java.util.Set<java.lang.String> strSet18 = element15.classNames();
        org.jsoup.nodes.Element element19 = document1.appendChild((org.jsoup.nodes.Node) element15);
        java.lang.String str21 = element19.attr("<html>\n <head></head>\n <body>\n  #documenthi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n <hi!  #document></hi!  #document>\n</#root>\n<html>\n <head></head>\n <body>\n  hi! #document\n </body>\n</html>");
        boolean boolean2 = document1.isBlock();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        boolean boolean9 = element7.hasAttr("hi!  #document");
        java.lang.String str10 = element7.tagName();
        org.jsoup.select.Elements elements12 = element7.getElementsByClass("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.regex.Pattern pattern14 = null;
        org.jsoup.select.Elements elements15 = element7.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body></body>\n</html>", pattern14);
        org.jsoup.select.Elements elements17 = element7.getElementsContainingText("");
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element21 = document19.html("");
        org.jsoup.nodes.Element element23 = element21.appendText("hi!");
        java.lang.String str24 = element21.data();
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element28 = document26.html("");
        java.lang.String str29 = element28.className();
        org.jsoup.nodes.Element element30 = element28.empty();
        java.lang.String str31 = element30.className();
        org.jsoup.nodes.Node node32 = element30.nextSibling();
        java.lang.String str33 = element30.className();
        org.jsoup.parser.Tag tag34 = element30.tag();
        org.jsoup.nodes.Document document36 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element37 = document36.head();
        org.jsoup.nodes.Element element38 = element30.prependChild((org.jsoup.nodes.Node) document36);
        boolean boolean39 = element21.equals((java.lang.Object) element30);
        org.jsoup.nodes.Element element40 = element7.prependChild((org.jsoup.nodes.Node) element30);
        org.jsoup.select.Elements elements41 = element30.getAllElements();
        java.lang.Class<?> wildcardClass42 = elements41.getClass();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNull(element37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document1.append("#document");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = document1.childNodes();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element9 = document8.head();
        java.lang.String str10 = document8.outerHtml();
        java.lang.Integer int11 = document8.siblingIndex();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = document8.outputSettings();
        java.lang.String str13 = document8.title();
        org.jsoup.select.Elements elements14 = document8.getAllElements();
        boolean boolean15 = document1.equals((java.lang.Object) elements14);
        document1.title("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element19 = document1.append(" #document");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = element19.childNodes();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(nodeList20);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        boolean boolean5 = element3.hasClass("#document");
        org.jsoup.select.Elements elements6 = element3.parents();
        java.lang.String str7 = element3.toString();
        org.jsoup.nodes.Element element9 = element3.prepend("#root");
        org.jsoup.nodes.Element element11 = element3.val("");
        java.lang.String str12 = element3.val();
        java.lang.String str14 = element3.attr("hi!#root");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("hi!");
        java.lang.String str4 = document1.val();
        boolean boolean6 = document1.hasAttr("hi!");
        boolean boolean8 = document1.hasAttr("#root");
        java.lang.String str9 = document1.title();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element9 = element3.empty();
        java.lang.String str11 = element3.absUrl("#document");
        org.jsoup.select.Elements elements13 = element3.getElementsMatchingText(" #document");
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element17 = document15.html("");
        java.lang.String str18 = element17.className();
        boolean boolean20 = element17.hasClass("hi!");
        boolean boolean22 = element17.hasAttr("#document");
        java.lang.String str23 = element17.baseUri();
        org.jsoup.select.Elements elements26 = element17.getElementsByAttributeValueContaining("hi!  #document", "#root");
        java.util.Set<java.lang.String> strSet27 = element17.classNames();
        org.jsoup.nodes.Element element28 = element3.classNames(strSet27);
        org.jsoup.nodes.Element element30 = element3.appendText("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements32 = element30.select(" #document");
        java.lang.String str33 = element30.toString();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;" + "'", str33, "&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;");
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        boolean boolean9 = element7.hasAttr("hi!  #document");
        java.lang.String str10 = element7.tagName();
        org.jsoup.select.Elements elements12 = element7.getElementsByClass("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.regex.Pattern pattern14 = null;
        org.jsoup.select.Elements elements15 = element7.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body></body>\n</html>", pattern14);
        java.lang.String str16 = element7.tagName();
        org.jsoup.select.Elements elements18 = element7.getElementsContainingOwnText("<#root></#root>hi!");
        java.lang.String str20 = element7.attr("#root");
        org.jsoup.nodes.Element element22 = element7.prependText("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements25 = element7.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body>\n </body>\n</html><<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>", "&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        org.jsoup.select.Elements elements2 = document1.children();
        java.lang.String str3 = document1.html();
        org.jsoup.nodes.Element element4 = document1.head();
        org.jsoup.select.Elements elements7 = element4.getElementsByAttributeValueNot("<#root>\n <hi!  #document></hi!  #document>\n</#root>\n<html>\n <head></head>\n <body>\n  hi! #document\n </body>\n</html>", "<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str3, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueStarting("#document", "hi!  #document");
        java.lang.Integer int12 = document1.elementSiblingIndex();
        org.jsoup.select.Elements elements14 = document1.getElementsByAttribute("\n<head></head>");
        java.lang.Integer int15 = document1.siblingIndex();
        org.jsoup.nodes.Element element16 = document1.body();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(element16);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element7 = document1.prependChild((org.jsoup.nodes.Node) document6);
        java.lang.Integer int8 = document1.siblingIndex();
        java.lang.String str9 = document1.text();
        org.jsoup.nodes.Element element12 = document1.attr("#root", "hi!  #document");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document1.childNodes();
        org.jsoup.nodes.Element element15 = document1.createElement("<html>\n <head>\n  <title> hi!</title>\n </head>\n <body>\n  #document\n </body>\n</html>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document1.addClass("#document");
        java.util.Set<java.lang.String> strSet7 = element6.classNames();
        java.lang.Integer int8 = element6.elementSiblingIndex();
        org.jsoup.nodes.Document document9 = element6.ownerDocument();
        java.lang.String str10 = document9.text();
        org.jsoup.nodes.Attributes attributes11 = document9.attributes();
        java.lang.String str12 = document9.html();
        org.jsoup.nodes.Element element14 = document9.addClass("<hi!  #document></hi!  #document>");
        java.lang.String str15 = document9.val();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements17 = document9.getElementsByTag("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.indentAmount(10);
        boolean boolean11 = outputSettings10.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings10.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings13.indentAmount((int) 'a');
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str18 = document17.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = document17.new OutputSettings();
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element22 = document21.head();
        java.lang.String str23 = document21.outerHtml();
        java.lang.Integer int24 = document21.elementSiblingIndex();
        java.lang.String str25 = document21.nodeName();
        org.jsoup.nodes.Element element27 = document21.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = document21.outputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = outputSettings28.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings19.escapeMode(escapeMode29);
        boolean boolean31 = outputSettings19.prettyPrint();
        java.nio.charset.Charset charset32 = outputSettings19.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings15.charset(charset32);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings15.prettyPrint(true);
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#document" + "'", str18, "#document");
        org.junit.Assert.assertNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#document" + "'", str25, "#document");
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertTrue("'" + escapeMode29 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode29.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(charset32);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertNotNull(outputSettings35);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        org.jsoup.nodes.Element element9 = document1.html("");
        org.jsoup.nodes.Document document10 = document1.normalise();
        org.jsoup.nodes.Element element12 = document10.text("hi!  #document");
        org.jsoup.nodes.Element element14 = element12.prepend(" #document");
        org.jsoup.select.Elements elements15 = element12.children();
        org.jsoup.nodes.Element element17 = element12.wrap("<#root hi! #document=\"#document\">");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNull(element17);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependElement("hi!");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element14 = document12.html("");
        java.lang.String str15 = element14.className();
        org.jsoup.nodes.Element element16 = element14.empty();
        boolean boolean18 = element16.hasClass("");
        java.lang.String str19 = element16.html();
        java.lang.String str20 = element16.text();
        boolean boolean21 = element10.equals((java.lang.Object) str20);
        element10.setBaseUri("hi!  #document");
        org.jsoup.select.Elements elements24 = element10.siblingElements();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(elements24);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String str5 = document1.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = document1.createElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.indentAmount(10);
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings8.prettyPrint(true);
        boolean boolean13 = outputSettings12.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings12.indentAmount((int) ' ');
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements20 = document17.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Node node21 = document17.nextSibling();
        java.lang.String str22 = document17.html();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = document17.outputSettings();
        org.jsoup.nodes.Document document25 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element26 = document25.head();
        java.lang.String str27 = document25.outerHtml();
        java.lang.Integer int28 = document25.elementSiblingIndex();
        java.lang.String str29 = document25.nodeName();
        org.jsoup.nodes.Element element31 = document25.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = document25.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings32.indentAmount(10);
        org.jsoup.nodes.Entities.EscapeMode escapeMode35 = outputSettings34.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings23.escapeMode(escapeMode35);
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings12.escapeMode(escapeMode35);
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = outputSettings37.escapeMode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings37.indentAmount((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be true");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#document" + "'", str29, "#document");
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertTrue("'" + escapeMode35 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode35.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.wrap("hi!");
        org.jsoup.nodes.Element element4 = document1.body();
        boolean boolean6 = document1.hasClass("hi!");
        java.lang.String str7 = document1.data();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueContaining("#root", "#root");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document12.head();
        java.lang.String str14 = document12.outerHtml();
        java.lang.Integer int15 = document12.siblingIndex();
        org.jsoup.select.Elements elements17 = document12.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element18 = document1.prependChild((org.jsoup.nodes.Node) document12);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = document1.dataset();
        org.jsoup.select.Elements elements21 = document1.getElementsByTag("<#root></#root>hi!");
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        document1.setBaseUri("");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.html("");
        java.lang.String str14 = element13.className();
        org.jsoup.nodes.Element element15 = element13.empty();
        java.lang.String str16 = element15.className();
        org.jsoup.nodes.Node node17 = element15.nextSibling();
        java.lang.String str18 = element15.className();
        org.jsoup.select.Elements elements19 = element15.getAllElements();
        org.jsoup.nodes.Element element20 = document1.prependChild((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Element element23 = element20.appendChild((org.jsoup.nodes.Node) document22);
        org.jsoup.nodes.Node node24 = document22.nextSibling();
        java.lang.String str25 = document22.toString();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str25, "<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.wrap("hi!");
        org.jsoup.nodes.Element element4 = document1.body();
        boolean boolean6 = document1.hasClass("hi!");
        java.lang.String str7 = document1.data();
        org.jsoup.nodes.Element element8 = document1.empty();
        java.lang.String str9 = element8.toString();
        org.jsoup.nodes.Element element11 = element8.removeClass("<html> \n <head></head> \n <body> \n </body>\n</html>\n<html>\n <head></head>\n <body></body>\n</html>");
        boolean boolean13 = element8.hasAttr("<#root></#root>hi!");
        java.lang.String str14 = element8.ownText();
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element7 = document1.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element9 = document6.text("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str10 = element9.data();
        java.util.regex.Pattern pattern12 = null;
        org.jsoup.select.Elements elements13 = element9.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body></body>\n</html>", pattern12);
        java.lang.Integer int14 = element9.elementSiblingIndex();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        org.jsoup.nodes.Element element23 = document16.classNames((java.util.Set<java.lang.String>) strSet21);
        org.jsoup.select.Elements elements26 = document16.getElementsByAttributeValueStarting("#document", "hi!  #document");
        org.jsoup.nodes.Document document27 = document16.normalise();
        org.jsoup.nodes.Document document29 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element31 = document29.html("");
        org.jsoup.nodes.Element element33 = element31.html("#document");
        org.jsoup.nodes.Document document35 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element37 = document35.html("");
        java.lang.String str38 = element37.className();
        org.jsoup.nodes.Element element39 = element37.empty();
        org.jsoup.select.Elements elements41 = element37.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element43 = element37.html("hi!");
        boolean boolean45 = element43.hasAttr("hi!");
        java.util.Set<java.lang.String> strSet46 = element43.classNames();
        org.jsoup.nodes.Element element47 = element33.classNames(strSet46);
        org.jsoup.nodes.Element element48 = document16.classNames(strSet46);
        org.jsoup.nodes.Element element50 = element48.prependText("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.Integer int51 = element50.elementSiblingIndex();
        org.jsoup.nodes.Element element52 = element9.appendChild((org.jsoup.nodes.Node) element50);
        org.jsoup.select.Elements elements54 = element50.getElementsByIndexEquals((int) (byte) 10);
        java.lang.String str55 = element50.data();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(elements54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueStarting("#document", "hi!  #document");
        org.jsoup.nodes.Document document12 = document1.normalise();
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element16 = document14.html("");
        org.jsoup.nodes.Element element18 = element16.html("#document");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element22 = document20.html("");
        java.lang.String str23 = element22.className();
        org.jsoup.nodes.Element element24 = element22.empty();
        org.jsoup.select.Elements elements26 = element22.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element28 = element22.html("hi!");
        boolean boolean30 = element28.hasAttr("hi!");
        java.util.Set<java.lang.String> strSet31 = element28.classNames();
        org.jsoup.nodes.Element element32 = element18.classNames(strSet31);
        org.jsoup.nodes.Element element33 = document1.classNames(strSet31);
        org.jsoup.nodes.Element element35 = element33.prependText("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.Integer int36 = element35.elementSiblingIndex();
        org.jsoup.nodes.Element element38 = element35.prependElement("<#root></#root>");
        java.util.Set<java.lang.String> strSet39 = element35.classNames();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(strSet39);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueNot("hi!  #document", "hi!");
        boolean boolean10 = document1.hasClass("");
        org.jsoup.nodes.Element element11 = document1.head();
        org.jsoup.nodes.Element element13 = document1.prependElement("#documenthi!");
        org.jsoup.nodes.Element element14 = document1.head();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = element14.val("hi!  #document");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<html> <head></head> <body></body> </html> <#root></#root>");
        java.lang.String str2 = document1.title();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element7 = document1.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element9 = document6.text("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element11 = document6.prependText("#root");
        org.jsoup.nodes.Element element12 = document6.parent();
        org.jsoup.nodes.Element element14 = document6.val("#root");
        org.jsoup.select.Elements elements17 = document6.getElementsByAttributeValueMatching("hi!", "<#root></#root>");
        boolean boolean19 = document6.hasClass("hi! #document");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        org.jsoup.select.Elements elements4 = document1.getElementsByTag("#document");
        org.jsoup.nodes.Element element6 = document1.html("hi!");
        org.jsoup.nodes.Element element8 = element6.removeClass("hi!#root <html> <head></head> <body></body> </html>");
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element12 = document10.val("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements15 = element12.getElementsByAttributeValueStarting("hi!", "hi!#root");
        org.jsoup.nodes.Attributes attributes16 = element12.attributes();
        boolean boolean17 = element6.equals((java.lang.Object) attributes16);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.nodes.Document document5 = document1.ownerDocument();
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueContaining("<html>\n <head></head>\n <body></body>\n</html>", "hi!");
        java.util.regex.Pattern pattern9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = document5.getElementsMatchingOwnText(pattern9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Element element4 = document1.appendElement("#document");
        java.lang.String str5 = document1.title();
        org.jsoup.select.Elements elements7 = document1.getElementsByIndexLessThan((int) '#');
        java.lang.String str8 = document1.html();
        org.jsoup.nodes.Element element9 = document1.body();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html><#document></#document>" + "'", str8, "<html>\n <head></head>\n <body></body>\n</html><#document></#document>");
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.new OutputSettings();
        java.lang.String str4 = document1.id();
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("#document");
        java.util.Set<java.lang.String> strSet8 = document7.classNames();
        org.jsoup.nodes.Element element9 = document1.classNames(strSet8);
        org.jsoup.nodes.Element element11 = document1.val("#document");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = element11.dataset();
        java.lang.String str13 = element11.className();
        org.jsoup.parser.Tag tag14 = element11.tag();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = document1.outputSettings();
        java.lang.String str6 = document1.toString();
        org.jsoup.parser.Tag tag7 = document1.tag();
        document1.setBaseUri("#root");
        org.jsoup.nodes.Element element11 = document1.getElementById("#document");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(element11);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        boolean boolean5 = element3.hasClass("#document");
        org.jsoup.select.Elements elements6 = element3.parents();
        org.jsoup.select.Elements elements9 = element3.getElementsByAttributeValueMatching("#document", "hi!");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.html("");
        java.lang.String str14 = element13.className();
        org.jsoup.nodes.Element element15 = element3.prependChild((org.jsoup.nodes.Node) element13);
        org.jsoup.nodes.Element element17 = element13.appendText("#document");
        org.jsoup.select.Elements elements20 = element17.getElementsByAttributeValueNot("<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str21 = element17.tagName();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#root" + "'", str21, "#root");
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.outputSettings();
        org.jsoup.select.Elements elements8 = document1.getElementsByIndexGreaterThan(0);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document1.outputSettings();
        org.jsoup.select.Elements elements12 = document1.getElementsByAttributeValueMatching("hi!  #document", "#root");
        java.lang.String str14 = document1.absUrl("hi!");
        org.jsoup.nodes.Element element15 = document1.body();
        org.jsoup.nodes.Document document16 = document1.normalise();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(element15);
        org.junit.Assert.assertNotNull(document16);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.jsoup.nodes.Element element14 = document7.classNames((java.util.Set<java.lang.String>) strSet12);
        org.jsoup.nodes.Element element15 = document1.classNames((java.util.Set<java.lang.String>) strSet12);
        java.lang.String str16 = document1.className();
        org.jsoup.nodes.Element element17 = document1.empty();
        java.lang.String str18 = document1.ownText();
        org.jsoup.select.Elements elements21 = document1.getElementsByAttributeValueContaining("hi!", "hi!  #document");
        org.jsoup.nodes.Document document22 = document1.normalise();
        document22.title("<#root hi!  #document=\"#document\"></#root>");
        boolean boolean26 = document22.hasClass("");
        org.jsoup.select.Elements elements28 = document22.getElementsByClass("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document30 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element32 = document30.html("");
        java.lang.String str33 = element32.className();
        org.jsoup.nodes.Element element34 = element32.empty();
        org.jsoup.select.Elements elements36 = element32.getElementsByIndexLessThan((int) (short) 100);
        java.lang.String str37 = element32.className();
        org.jsoup.nodes.Element element40 = element32.attr("hi!  #document", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements42 = element32.getElementsByIndexLessThan(100);
        org.jsoup.nodes.Element element43 = element32.empty();
        org.jsoup.nodes.Element element45 = element43.appendText("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element47 = element45.prependText("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements49 = element47.getElementsByAttributeStarting("#document");
        org.jsoup.nodes.Element element51 = element47.prependText("<html> \n <head> \n  <title>#root</title> \n </head> \n <body> \n </body>\n</html>hi!");
        org.jsoup.nodes.Element element52 = document22.prependChild((org.jsoup.nodes.Node) element51);
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!  #document" + "'", str16, "hi!  #document");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(element52);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.jsoup.nodes.Element element14 = document7.classNames((java.util.Set<java.lang.String>) strSet12);
        org.jsoup.nodes.Element element15 = document1.classNames((java.util.Set<java.lang.String>) strSet12);
        java.lang.String str16 = document1.className();
        org.jsoup.nodes.Element element17 = document1.empty();
        java.lang.String str18 = document1.title();
        java.lang.String str19 = document1.title();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!  #document" + "'", str16, "hi!  #document");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Node node6 = document1.removeAttr("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element8 = document1.addClass("");
        org.jsoup.nodes.Element element10 = document1.val("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements12 = element10.getElementsMatchingText("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str13 = element10.id();
        org.jsoup.select.Elements elements15 = element10.getElementsMatchingText(" #document");
        org.jsoup.select.Elements elements17 = element10.getElementsMatchingText("\n<head></head>");
        java.lang.String str18 = element10.ownText();
        org.jsoup.nodes.Document document19 = element10.ownerDocument();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(document19);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!  #document");
        org.jsoup.nodes.Element element2 = document1.head();
        org.jsoup.nodes.Document document3 = element2.ownerDocument();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element6 = document5.head();
        java.lang.String str7 = document5.outerHtml();
        java.lang.Integer int8 = document5.elementSiblingIndex();
        java.lang.String str9 = document5.nodeName();
        org.jsoup.nodes.Element element11 = document5.removeClass("");
        boolean boolean13 = element11.hasAttr("hi!  #document");
        java.lang.String str14 = element11.tagName();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element17 = document16.head();
        java.lang.String str18 = document16.outerHtml();
        java.lang.Integer int19 = document16.elementSiblingIndex();
        org.jsoup.nodes.Element element21 = document16.addClass("#document");
        boolean boolean23 = element21.hasClass("hi!");
        org.jsoup.nodes.Document document25 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        org.jsoup.nodes.Element element32 = document25.classNames((java.util.Set<java.lang.String>) strSet30);
        org.jsoup.select.Elements elements35 = document25.getElementsByAttributeValueStarting("#document", "hi!  #document");
        org.jsoup.nodes.Document document36 = document25.normalise();
        org.jsoup.nodes.Document document38 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element40 = document38.html("");
        org.jsoup.nodes.Element element42 = element40.html("#document");
        org.jsoup.nodes.Document document44 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element46 = document44.html("");
        java.lang.String str47 = element46.className();
        org.jsoup.nodes.Element element48 = element46.empty();
        org.jsoup.select.Elements elements50 = element46.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element52 = element46.html("hi!");
        boolean boolean54 = element52.hasAttr("hi!");
        java.util.Set<java.lang.String> strSet55 = element52.classNames();
        org.jsoup.nodes.Element element56 = element42.classNames(strSet55);
        org.jsoup.nodes.Element element57 = document25.classNames(strSet55);
        org.jsoup.nodes.Element element58 = element21.classNames(strSet55);
        org.jsoup.nodes.Element element59 = element11.classNames(strSet55);
        java.lang.String str60 = element59.id();
        org.jsoup.nodes.Element element61 = element2.prependChild((org.jsoup.nodes.Node) element59);
        org.jsoup.select.Elements elements63 = element2.getElementsByAttributeStarting("#root");
        org.jsoup.select.Elements elements65 = element2.getElementsByClass(" hi!");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#root" + "'", str14, "#root");
        org.junit.Assert.assertNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(elements50);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNotNull(elements63);
        org.junit.Assert.assertNotNull(elements65);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.jsoup.nodes.Element element14 = document7.classNames((java.util.Set<java.lang.String>) strSet12);
        org.jsoup.nodes.Element element15 = document1.classNames((java.util.Set<java.lang.String>) strSet12);
        org.jsoup.select.Elements elements16 = element15.parents();
        java.util.regex.Pattern pattern18 = null;
        org.jsoup.select.Elements elements19 = element15.getElementsByAttributeValueMatching(" #document", pattern18);
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.Integer int3 = document1.elementSiblingIndex();
        org.jsoup.select.Elements elements5 = document1.getElementsByAttribute("#root");
        java.lang.String str6 = document1.title();
        org.jsoup.nodes.Element element8 = document1.createElement("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements10 = element8.getElementsByAttribute("hi!  #document");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("hi!");
        java.lang.String str4 = document1.val();
        boolean boolean6 = document1.hasAttr("hi!");
        org.jsoup.nodes.Element element8 = document1.wrap("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = element8.hasText();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.outputSettings();
        document1.title("hi!  #document");
        org.jsoup.nodes.Document document6 = document1.normalise();
        java.lang.String str7 = document1.title();
        org.jsoup.nodes.Element element8 = document1.head();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!  #document" + "'", str7, "hi!  #document");
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!  #document");
        java.lang.String str2 = document1.title();
        org.jsoup.nodes.Element element3 = document1.empty();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element8 = document5.attr("hi!  #document", "#document");
        org.jsoup.select.Elements elements10 = document5.getElementsContainingText("hi!  #document");
        boolean boolean12 = document5.hasAttr("#document");
        org.jsoup.nodes.Element element13 = element3.appendChild((org.jsoup.nodes.Node) document5);
        java.lang.String str14 = element13.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<#root hi!  #document=\"#document\"></#root>" + "'", str14, "<#root hi!  #document=\"#document\"></#root>");
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        document1.setBaseUri("");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.html("");
        java.lang.String str14 = element13.className();
        org.jsoup.nodes.Element element15 = element13.empty();
        java.lang.String str16 = element15.className();
        org.jsoup.nodes.Node node17 = element15.nextSibling();
        java.lang.String str18 = element15.className();
        org.jsoup.select.Elements elements19 = element15.getAllElements();
        org.jsoup.nodes.Element element20 = document1.prependChild((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Element element23 = element20.appendChild((org.jsoup.nodes.Node) document22);
        org.jsoup.nodes.Node node24 = document22.nextSibling();
        java.lang.String str25 = document22.className();
        org.jsoup.nodes.Element element27 = document22.prependText("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements30 = element27.getElementsByAttributeValueMatching("<html> <head></head> <body></body> </html>", "<html>\n <head></head>\n <body></body>\n</html><<html>\n <head></head>\n <body>\n </body>\n</html><<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>></<html>\n <head></head>\n <body>\n </body>\n</html><<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>>");
        org.jsoup.nodes.Element element32 = element27.getElementById("<#root class=\"\"></#root>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNull(element32);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependElement("hi!");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element14 = document12.html("");
        java.lang.String str15 = element14.className();
        org.jsoup.nodes.Element element16 = element14.empty();
        boolean boolean18 = element16.hasClass("");
        java.lang.String str19 = element16.html();
        java.lang.String str20 = element16.text();
        boolean boolean21 = element10.equals((java.lang.Object) str20);
        org.jsoup.select.Elements elements24 = element10.getElementsByAttributeValueNot("#document", "<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str25 = element10.val();
        java.util.Set<java.lang.String> strSet26 = element10.classNames();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strSet26);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element6 = document5.head();
        java.lang.String str7 = document5.outerHtml();
        java.lang.Integer int8 = document5.elementSiblingIndex();
        java.lang.String str9 = document5.nodeName();
        org.jsoup.nodes.Element element11 = document5.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = document5.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings12.indentAmount(10);
        boolean boolean15 = document1.equals((java.lang.Object) outputSettings14);
        java.lang.String str16 = document1.nodeName();
        org.jsoup.nodes.Element element18 = document1.createElement("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements21 = element18.getElementsByAttributeValueNot("#document", "<#root>\n #root\n <html>\n  <head></head>\n  <body>\n   &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n  </body>\n </html>\n</#root>");
        org.jsoup.select.Elements elements23 = element18.getElementsByIndexGreaterThan((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#document" + "'", str16, "#document");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.val("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements6 = element3.getElementsByAttributeValueStarting("hi!", "hi!#root");
        org.jsoup.nodes.Attributes attributes7 = element3.attributes();
        java.lang.String str8 = element3.ownText();
        org.jsoup.nodes.Element element9 = element3.parent();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueNot("hi!  #document", "hi!");
        org.jsoup.select.Elements elements10 = document1.getElementsByTag("hi!");
        org.jsoup.nodes.Element element12 = document1.append("#root");
        org.jsoup.nodes.Element element15 = document1.attr("hi!", "#root");
        org.jsoup.nodes.Element element17 = element15.toggleClass("");
        org.jsoup.select.Elements elements20 = element17.getElementsByAttributeValueNot("<#root hi!  #document=\"#document\"></#root>", "<html>\n <head></head>\n <body></body>\n</html><#document></#document>");
        java.lang.Integer int21 = element17.siblingIndex();
        org.jsoup.nodes.Document document23 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element24 = document23.head();
        java.lang.String str25 = document23.outerHtml();
        java.lang.Integer int26 = document23.elementSiblingIndex();
        java.lang.String str27 = document23.nodeName();
        org.jsoup.parser.Tag tag28 = document23.tag();
        org.jsoup.nodes.Element element30 = document23.createElement("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements32 = document23.getElementsByClass("#document");
        org.jsoup.nodes.Attributes attributes33 = document23.attributes();
        java.lang.String str34 = document23.title();
        // The following exception was thrown during execution in test generation
        try {
            element17.replaceWith((org.jsoup.nodes.Node) document23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#document" + "'", str27, "#document");
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("#document", "hi!");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element9 = document1.body();
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element13 = document11.removeClass("");
        org.jsoup.nodes.Element element15 = element13.toggleClass("hi!");
        org.jsoup.nodes.Document document16 = element15.ownerDocument();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = document16.new OutputSettings();
        org.jsoup.nodes.Element element19 = document16.createElement(" hi!#root");
        org.jsoup.nodes.Element element20 = document1.appendChild((org.jsoup.nodes.Node) element19);
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element23 = document22.head();
        java.lang.String str24 = document22.outerHtml();
        java.lang.Integer int25 = document22.elementSiblingIndex();
        java.lang.String str26 = document22.nodeName();
        org.jsoup.nodes.Element element28 = document22.removeClass("");
        boolean boolean30 = element28.hasAttr("hi!  #document");
        java.lang.String str31 = element28.tagName();
        org.jsoup.select.Elements elements33 = element28.getElementsByClass("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.regex.Pattern pattern35 = null;
        org.jsoup.select.Elements elements36 = element28.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body></body>\n</html>", pattern35);
        org.jsoup.select.Elements elements38 = element28.getElementsContainingText("");
        org.jsoup.nodes.Document document40 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element42 = document40.html("");
        org.jsoup.nodes.Element element44 = element42.appendText("hi!");
        java.lang.String str45 = element42.data();
        org.jsoup.nodes.Document document47 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element49 = document47.html("");
        java.lang.String str50 = element49.className();
        org.jsoup.nodes.Element element51 = element49.empty();
        java.lang.String str52 = element51.className();
        org.jsoup.nodes.Node node53 = element51.nextSibling();
        java.lang.String str54 = element51.className();
        org.jsoup.parser.Tag tag55 = element51.tag();
        org.jsoup.nodes.Document document57 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element58 = document57.head();
        org.jsoup.nodes.Element element59 = element51.prependChild((org.jsoup.nodes.Node) document57);
        boolean boolean60 = element42.equals((java.lang.Object) element51);
        org.jsoup.nodes.Element element61 = element28.prependChild((org.jsoup.nodes.Node) element51);
        org.jsoup.nodes.Element element63 = element28.val("#documenthi!");
        org.jsoup.nodes.Element element64 = element19.appendChild((org.jsoup.nodes.Node) element63);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#document" + "'", str26, "#document");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#root" + "'", str31, "#root");
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertNull(element58);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertNotNull(element64);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("#document", "hi!");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element9 = document1.head();
        java.lang.String str11 = document1.absUrl("hi!");
        org.jsoup.select.Elements elements12 = document1.getAllElements();
        org.jsoup.nodes.Element element14 = document1.text("hi!#root");
        org.jsoup.nodes.Element element16 = document1.getElementById("<#root></#root>hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = element16.html("<html>\n <head></head>\n <body></body>\n</html><#root></#root>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNull(element16);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.select.Elements elements9 = element5.getElementsByAttributeValueMatching("#root", "#document");
        org.jsoup.select.Elements elements11 = element5.getElementsContainingText("&lt;&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&gt;&lt;/&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&gt;");
        org.jsoup.select.Elements elements13 = element5.getElementsByIndexGreaterThan((int) (short) -1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#document<#root>\n hi!\n</#root>");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttributeStarting("hi!  #document");
        org.junit.Assert.assertNotNull(elements3);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueStarting("#document", "hi!  #document");
        boolean boolean13 = document1.hasClass("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = document1.new OutputSettings();
        java.lang.String str15 = document1.title();
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element19 = document17.html("");
        java.lang.String str20 = element19.className();
        org.jsoup.nodes.Element element21 = element19.empty();
        boolean boolean23 = element21.hasClass("");
        java.lang.String str24 = element21.html();
        java.lang.String str25 = element21.text();
        boolean boolean26 = element21.hasText();
        java.util.regex.Pattern pattern28 = null;
        org.jsoup.select.Elements elements29 = element21.getElementsByAttributeValueMatching("body", pattern28);
        org.jsoup.nodes.Element element30 = document1.prependChild((org.jsoup.nodes.Node) element21);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element31 = document1.firstElementSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element30);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueNot("hi!  #document", "hi!");
        boolean boolean10 = document1.hasClass("");
        org.jsoup.nodes.Element element11 = document1.head();
        org.jsoup.nodes.Element element13 = document1.prependElement("#documenthi!");
        document1.setBaseUri("<html> <head> <title>#root</title> </head> <body></body> </html>");
        java.util.regex.Pattern pattern16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements17 = document1.getElementsMatchingText(pattern16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.removeClass("");
        org.jsoup.nodes.Element element5 = element3.toggleClass("hi!");
        org.jsoup.select.Elements elements8 = element3.getElementsByAttributeValueMatching("hi!  #document", "hi!");
        java.lang.String str10 = element3.absUrl("<html>\n <head></head>\n <body></body>\n</html><#document></#document>");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element14 = document12.html("");
        java.lang.String str15 = element14.className();
        org.jsoup.nodes.Element element16 = element14.empty();
        org.jsoup.select.Elements elements18 = element14.getElementsByIndexLessThan((int) (short) 100);
        java.lang.String str19 = element14.className();
        org.jsoup.select.Elements elements21 = element14.getElementsByIndexEquals((int) (byte) 1);
        boolean boolean22 = element3.equals((java.lang.Object) element14);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.jsoup.nodes.Element element14 = document7.classNames((java.util.Set<java.lang.String>) strSet12);
        org.jsoup.nodes.Element element15 = document1.classNames((java.util.Set<java.lang.String>) strSet12);
        java.lang.String str16 = document1.className();
        org.jsoup.nodes.Document document17 = document1.ownerDocument();
        org.jsoup.nodes.Element element19 = document1.toggleClass("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element21 = element19.before("<html>\n <head></head>\n <body>\n  #documenthi!\n </body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!  #document" + "'", str16, "hi!  #document");
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.outputSettings();
        org.jsoup.select.Elements elements5 = document1.getElementsMatchingOwnText("#root");
        java.lang.String str6 = document1.outerHtml();
        org.jsoup.nodes.Element element8 = document1.appendText("<hi!  #document></hi!  #document>");
        org.jsoup.select.Elements elements9 = element8.getAllElements();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.parser.Tag tag2 = document1.tag();
        java.lang.String str3 = document1.outerHtml();
        document1.title("#document <head></head>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str3, "<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        boolean boolean3 = document1.isBlock();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str6 = document1.attr("hi!");
        java.lang.Integer int7 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.nodes.Element element10 = document8.toggleClass("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements12 = document8.getElementsByIndexGreaterThan(0);
        java.lang.Integer int13 = document8.siblingIndex();
        org.jsoup.nodes.Document document14 = document8.ownerDocument();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(document14);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        document1.setBaseUri("");
        boolean boolean11 = document1.hasClass("");
        org.jsoup.nodes.Element element12 = document1.empty();
        org.jsoup.select.Elements elements14 = document1.getElementsByAttributeStarting("#root");
        org.jsoup.nodes.Element element15 = document1.body();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(element15);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        boolean boolean9 = element7.hasAttr("hi!  #document");
        java.util.Set<java.lang.String> strSet10 = element7.classNames();
        org.jsoup.nodes.Element element12 = element7.val("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements15 = element12.getElementsByAttributeValueMatching(" #document", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element17 = element12.prependElement("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        boolean boolean18 = element12.hasText();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueStarting("#document", "hi!  #document");
        boolean boolean13 = document1.hasClass("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.Set<java.lang.String> strSet14 = document1.classNames();
        org.jsoup.nodes.Document document15 = document1.normalise();
        org.jsoup.nodes.Element element17 = document1.text(" hi!");
        org.jsoup.nodes.Element element18 = element17.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = element18.firstElementSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNull(element18);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.nodes.Element element9 = document1.head();
        org.jsoup.nodes.Element element11 = document1.prepend("#document");
        org.jsoup.parser.Tag tag12 = document1.tag();
        boolean boolean13 = document1.hasText();
        org.jsoup.select.Elements elements15 = document1.getElementsByAttribute("<html>\n <head></head>\n <body></body>\n</html><#root></#root>");
        java.lang.String str16 = document1.title();
        org.jsoup.nodes.Element element18 = document1.prepend("hi! #document");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        java.lang.String str5 = element3.ownText();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexEquals((int) (short) 100);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document1.addClass("#document");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document1.childNodes();
        java.lang.String str8 = document1.title();
        java.lang.String str9 = document1.val();
        java.lang.String str10 = document1.title();
        org.jsoup.nodes.Element element12 = document1.append("\n<#root <html> <head></head> <body></body> </html>></#root <html> <head></head> <body></body> </html>>");
        java.lang.String str13 = element12.id();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.wrap("hi!");
        org.jsoup.nodes.Element element4 = document1.body();
        boolean boolean6 = document1.hasClass("hi!");
        java.lang.String str7 = document1.data();
        org.jsoup.nodes.Element element8 = document1.empty();
        java.lang.String str9 = element8.toString();
        org.jsoup.nodes.Element element11 = element8.removeClass("<html> \n <head></head> \n <body> \n </body>\n</html>\n<html>\n <head></head>\n <body></body>\n</html>");
        boolean boolean13 = element8.hasAttr("<#root></#root>hi!");
        org.jsoup.select.Elements elements15 = element8.getElementsMatchingText("<html>\n <head></head>\n <body></body>\n</html><#root></#root>");
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        document1.title("#root");
        org.jsoup.nodes.Document document7 = document1.ownerDocument();
        java.lang.String str8 = document7.className();
        java.lang.String str9 = document7.outerHtml();
        java.lang.String str10 = document7.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = document7.outputSettings();
        org.jsoup.select.Elements elements13 = document7.getElementsByTag("#root #document");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document" + "'", str10, "#document");
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = document1.outputSettings();
        java.lang.String str6 = document1.title();
        org.jsoup.select.Elements elements7 = document1.children();
        boolean boolean9 = document1.hasClass(" hi!");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        boolean boolean5 = element3.hasClass("#document");
        org.jsoup.select.Elements elements6 = element3.parents();
        java.lang.String str7 = element3.toString();
        java.util.regex.Pattern pattern9 = null;
        org.jsoup.select.Elements elements10 = element3.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body></body>\n</html>", pattern9);
        org.jsoup.select.Elements elements12 = element3.getElementsByClass("hi!  #document");
        java.util.Set<java.lang.String> strSet13 = element3.classNames();
        org.jsoup.select.Elements elements16 = element3.getElementsByAttributeValueMatching("", "&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements17 = element3.parents();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!  #document");
        org.jsoup.nodes.Element element2 = document1.head();
        org.jsoup.select.Elements elements4 = element2.getElementsMatchingOwnText("");
        org.jsoup.nodes.Element element6 = element2.before("hi!  #document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element2.child((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.Integer int4 = document1.siblingIndex();
        java.lang.String str5 = document1.ownText();
        boolean boolean7 = document1.hasClass("hi! #document");
        java.lang.Integer int8 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document1.new OutputSettings();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Element element8 = element5.removeClass("hi!");
        org.jsoup.nodes.Element element10 = element8.appendText("hi!");
        org.jsoup.select.Elements elements12 = element8.getElementsContainingOwnText("hi!  #document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = element8.child(97);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependElement("hi!");
        org.jsoup.nodes.Element element12 = element10.appendElement("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element13 = element10.parent();
        boolean boolean14 = element13.isBlock();
        org.jsoup.select.Elements elements17 = element13.getElementsByAttributeValue("head", "<#root> #root <html> <head></head> <body></body> </html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        boolean boolean5 = element3.hasClass("#document");
        org.jsoup.select.Elements elements6 = element3.parents();
        org.jsoup.select.Elements elements9 = element3.getElementsByAttributeValueMatching("#document", "hi!");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.html("");
        java.lang.String str14 = element13.className();
        org.jsoup.nodes.Element element15 = element3.prependChild((org.jsoup.nodes.Node) element13);
        org.jsoup.nodes.Element element16 = element13.previousElementSibling();
        org.jsoup.nodes.Element element18 = element13.toggleClass("hi!  #document");
        org.jsoup.nodes.Element element20 = element13.removeClass("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element21 = element13.nextElementSibling();
        org.jsoup.select.Elements elements23 = element13.getElementsMatchingText("#root");
        java.lang.String str24 = element13.text();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        boolean boolean9 = element7.hasAttr("hi!  #document");
        org.jsoup.nodes.Node node10 = element7.nextSibling();
        org.jsoup.nodes.Element element12 = element7.prependElement(" #document");
        boolean boolean13 = element12.hasText();
        org.jsoup.nodes.Element element14 = element12.previousElementSibling();
        org.jsoup.nodes.Element element16 = element12.toggleClass("<html>\n <head></head>\n <body></body>\n</html><#root class=\"\"></#root>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.wrap("hi!");
        org.jsoup.nodes.Element element4 = document1.body();
        boolean boolean6 = document1.hasClass("hi!");
        java.lang.String str7 = document1.data();
        org.jsoup.nodes.Element element8 = document1.empty();
        org.jsoup.select.Elements elements9 = document1.getAllElements();
        org.jsoup.select.Elements elements11 = document1.getElementsMatchingText("<#root>\n #root\n <html>\n  <head></head>\n  <body>\n   &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n  </body>\n </html>\n</#root>");
        boolean boolean12 = document1.hasText();
        java.lang.String str13 = document1.nodeName();
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#document" + "'", str13, "#document");
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByIndexEquals((int) (short) 100);
        org.jsoup.nodes.Document document4 = document1.ownerDocument();
        java.lang.String str5 = document4.data();
        org.jsoup.nodes.Document document6 = document4.normalise();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = document6.appendElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(document6);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document document4 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element6 = document4.html("");
        java.lang.String str7 = element6.className();
        org.jsoup.nodes.Element element8 = element6.empty();
        org.jsoup.select.Elements elements10 = element6.getElementsMatchingOwnText("");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document12.head();
        java.lang.String str14 = document12.outerHtml();
        java.lang.Integer int15 = document12.elementSiblingIndex();
        org.jsoup.nodes.Element element17 = document12.addClass("#document");
        java.util.Set<java.lang.String> strSet18 = element17.classNames();
        org.jsoup.nodes.Element element19 = element6.classNames(strSet18);
        org.jsoup.nodes.Element element20 = document1.classNames(strSet18);
        org.jsoup.nodes.Element element22 = document1.removeClass("hi!");
        boolean boolean24 = element22.hasClass(" #document");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.removeClass("");
        org.jsoup.nodes.Element element5 = element3.toggleClass("hi!");
        org.jsoup.nodes.Document document6 = element5.ownerDocument();
        org.jsoup.select.Elements elements8 = element5.getElementsByIndexGreaterThan(0);
        org.jsoup.select.Elements elements11 = element5.getElementsByAttributeValueContaining("<html>\n <head>\n  <title> hi!</title>\n </head>\n <body>\n  #document\n </body>\n</html>", "\n<head></head>");
        org.jsoup.select.Elements elements13 = element5.getElementsByAttribute("<html> <head></head> <body></body> </html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.select.Elements elements4 = element2.getElementsByIndexLessThan(1);
        org.jsoup.select.Elements elements7 = element2.getElementsByAttributeValueContaining("<html>\n <head>\n  <title>&lt;html&gt;\n &lt;head&gt;\n  &lt;title&gt;#root&lt;/title&gt;\n &lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title>\n </head>\n <body></body>\n</html>#document", "#document<#root>\n hi!\n</#root>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("#document", "hi!");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element9 = document1.head();
        org.jsoup.select.Elements elements11 = element9.getElementsByClass("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str12 = element9.text();
        org.jsoup.nodes.Element element14 = element9.prependElement("hi!#root");
        org.jsoup.select.Elements elements17 = element9.getElementsByAttributeValueMatching("hi!", "<#root>\n <hi!  #document></hi!  #document>\n</#root>\n<html>\n <head></head>\n <body>\n  hi! #document\n </body>\n</html>");
        org.jsoup.nodes.Element element19 = element9.val("\n<<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        org.jsoup.nodes.Element element4 = document1.createElement("#root");
        org.jsoup.select.Elements elements7 = element4.getElementsByAttributeValueMatching(" #document", "<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        java.lang.String str8 = element4.val();
        java.lang.String str10 = element4.absUrl("#document");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("#document", "hi!");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element9 = document1.head();
        java.lang.String str11 = document1.absUrl("hi!");
        org.jsoup.select.Elements elements12 = document1.getAllElements();
        org.jsoup.select.Elements elements14 = document1.getElementsByIndexGreaterThan((int) ' ');
        org.jsoup.nodes.Attributes attributes15 = document1.attributes();
        org.jsoup.select.Elements elements17 = document1.getElementsByClass("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element18 = document1.body();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.select.Elements elements6 = element3.getElementsByIndexLessThan((int) (short) 10);
        java.lang.String str7 = element3.data();
        org.jsoup.nodes.Document document8 = element3.ownerDocument();
        org.jsoup.select.Elements elements10 = document8.getElementsByClass("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements12 = document8.getElementsByIndexEquals((int) '#');
        org.jsoup.nodes.Element element14 = document8.toggleClass(" #document");
        org.jsoup.select.Elements elements16 = document8.getElementsByIndexGreaterThan((int) (byte) 0);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        org.jsoup.nodes.Element element2 = document1.empty();
        java.lang.Integer int3 = element2.siblingIndex();
        org.jsoup.nodes.Element element6 = element2.attr("#root <html> <head></head> <body></body> </html>", "");
        org.jsoup.nodes.Element element8 = element6.appendText("<#root> #root <html> <head></head> <body></body> </html>");
        org.jsoup.nodes.Element element10 = element8.prepend("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.select.Elements elements11 = element3.getElementsByAttributeValueMatching("", "#document");
        element3.setBaseUri("#document");
        java.util.regex.Pattern pattern15 = null;
        org.jsoup.select.Elements elements16 = element3.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body>\n  #document\n </body>\n</html>", pattern15);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Node node5 = document1.nextSibling();
        java.lang.String str6 = document1.html();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = document1.outputSettings();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element11 = document9.html("");
        java.lang.String str12 = element11.className();
        org.jsoup.nodes.Element element13 = element11.empty();
        java.lang.String str14 = element13.className();
        org.jsoup.nodes.Node node15 = element13.nextSibling();
        java.lang.String str16 = element13.className();
        org.jsoup.parser.Tag tag17 = element13.tag();
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element20 = document19.head();
        org.jsoup.nodes.Element element21 = element13.prependChild((org.jsoup.nodes.Node) document19);
        org.jsoup.nodes.Element element22 = document1.prependChild((org.jsoup.nodes.Node) element21);
        java.util.regex.Pattern pattern24 = null;
        org.jsoup.select.Elements elements25 = element21.getElementsByAttributeValueMatching("", pattern24);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        java.lang.String str8 = document1.data();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!  #document");
        org.jsoup.nodes.Element element2 = document1.head();
        boolean boolean3 = element2.hasText();
        java.lang.String str4 = element2.baseUri();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!  #document" + "'", str4, "hi!  #document");
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.appendText("hi!");
        java.lang.String str6 = element5.html();
        org.jsoup.nodes.Element element9 = element5.attr("<html>\n <head></head>\n <body></body>\n</html>", "hi!");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("hi!  #document");
        java.lang.String str12 = document11.title();
        org.jsoup.nodes.Element element13 = element5.appendChild((org.jsoup.nodes.Node) document11);
        org.jsoup.nodes.Element element14 = document11.firstElementSibling();
        org.jsoup.nodes.Element element15 = document11.head();
        java.lang.String str16 = document11.outerHtml();
        java.lang.String str17 = document11.val();
        org.jsoup.select.Elements elements20 = document11.getElementsByAttributeValue("hi!#root <html> <head></head> <body></body> </html>", "<html> \n <head></head> \n <body> \n </body>\n</html>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element21 = document11.body();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNull(element21);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Node node6 = document1.removeAttr("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element8 = document1.addClass("");
        org.jsoup.nodes.Element element10 = document1.val("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str11 = document1.outerHtml();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str11, "<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Element element4 = document1.appendElement("#document");
        java.lang.String str5 = document1.title();
        org.jsoup.nodes.Element element7 = document1.text("<#root></#root>hi!");
        org.jsoup.parser.Tag tag8 = element7.tag();
        element7.setBaseUri("#root");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.select.Elements elements5 = document3.getElementsMatchingText("#document");
        java.util.regex.Pattern pattern7 = null;
        org.jsoup.select.Elements elements8 = document3.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body></body>\n</html>", pattern7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = document3.siblingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("#document", "hi!");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element9 = document1.head();
        org.jsoup.select.Elements elements11 = element9.getElementsByClass("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str12 = element9.text();
        java.util.Set<java.lang.String> strSet13 = element9.classNames();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!  #document");
        org.jsoup.nodes.Element element2 = document1.head();
        org.jsoup.nodes.Document document3 = element2.ownerDocument();
        org.jsoup.select.Elements elements6 = document3.getElementsByAttributeValueNot("<#root hi!  #document=\"#document\"></#root>", "<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        java.lang.String str7 = document3.title();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.nodes.Document document5 = document1.ownerDocument();
        java.util.Set<java.lang.String> strSet6 = document5.classNames();
        java.lang.String str7 = document5.text();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element6 = element3.toggleClass("#document");
        java.lang.String str7 = element6.data();
        java.util.regex.Pattern pattern9 = null;
        org.jsoup.select.Elements elements10 = element6.getElementsByAttributeValueMatching("<#root> #root <html> <head></head> <body></body> </html>", pattern9);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.select.Elements elements6 = document1.getElementsByIndexLessThan((int) (short) 100);
        java.lang.String str7 = document1.nodeName();
        java.lang.String str8 = document1.outerHtml();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element6 = document5.head();
        java.lang.String str7 = document5.outerHtml();
        java.lang.Integer int8 = document5.elementSiblingIndex();
        java.lang.String str9 = document5.nodeName();
        org.jsoup.nodes.Element element11 = document5.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = document5.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings12.indentAmount(10);
        boolean boolean15 = document1.equals((java.lang.Object) outputSettings14);
        java.lang.String str16 = document1.nodeName();
        org.jsoup.nodes.Element element18 = document1.createElement("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element22 = document20.html("");
        java.lang.String str23 = element22.className();
        org.jsoup.nodes.Element element24 = element22.empty();
        org.jsoup.select.Elements elements26 = element22.getElementsMatchingOwnText("");
        org.jsoup.nodes.Document document28 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element29 = document28.head();
        java.lang.String str30 = document28.outerHtml();
        java.lang.Integer int31 = document28.elementSiblingIndex();
        org.jsoup.nodes.Element element33 = document28.addClass("#document");
        java.util.Set<java.lang.String> strSet34 = element33.classNames();
        org.jsoup.nodes.Element element35 = element22.classNames(strSet34);
        org.jsoup.select.Elements elements37 = element35.getElementsMatchingText("#document");
        org.jsoup.nodes.Element element38 = element35.empty();
        org.jsoup.select.Elements elements40 = element35.getElementsByIndexGreaterThan((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            document1.replaceWith((org.jsoup.nodes.Node) element35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#document" + "'", str16, "#document");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(elements40);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        boolean boolean5 = element3.hasClass("#document");
        org.jsoup.select.Elements elements6 = element3.parents();
        org.jsoup.select.Elements elements9 = element3.getElementsByAttributeValueMatching("#document", "hi!");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.html("");
        java.lang.String str14 = element13.className();
        org.jsoup.nodes.Element element15 = element3.prependChild((org.jsoup.nodes.Node) element13);
        org.jsoup.select.Elements elements16 = element13.children();
        org.jsoup.select.Elements elements18 = element13.getElementsByIndexGreaterThan((int) 'a');
        org.jsoup.select.Elements elements20 = element13.getElementsContainingOwnText("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str21 = element13.id();
        boolean boolean23 = element13.hasAttr("&lt;&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&gt;&lt;/&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&gt;");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        java.lang.Integer int5 = document1.siblingIndex();
        org.jsoup.nodes.Element element6 = document1.body();
        org.jsoup.nodes.Element element7 = document1.body();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element10 = document9.head();
        java.lang.String str11 = document9.outerHtml();
        java.lang.Integer int12 = document9.elementSiblingIndex();
        java.lang.String str13 = document9.nodeName();
        org.jsoup.select.Elements elements16 = document9.getElementsByAttributeValueNot("hi!  #document", "hi!");
        org.jsoup.select.Elements elements18 = document9.getElementsByTag("hi!");
        org.jsoup.nodes.Element element20 = document9.append("#root");
        org.jsoup.select.Elements elements21 = document9.parents();
        org.jsoup.nodes.Element element22 = document9.empty();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element26 = document24.html("");
        java.lang.String str27 = element26.className();
        org.jsoup.nodes.Element element28 = element26.empty();
        boolean boolean30 = element28.hasClass("");
        java.lang.String str31 = element28.html();
        java.lang.String str32 = element28.text();
        org.jsoup.select.Elements elements35 = element28.getElementsByAttributeValueMatching("hi!", "hi!  #document");
        org.jsoup.nodes.Element element38 = element28.attr("#root", "");
        org.jsoup.nodes.Element element40 = element28.toggleClass("hi!");
        org.jsoup.nodes.Element element42 = element28.prepend("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document44 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element46 = document44.html("");
        boolean boolean48 = element46.hasClass("#document");
        org.jsoup.select.Elements elements49 = element46.parents();
        java.lang.String str50 = element46.toString();
        java.util.regex.Pattern pattern52 = null;
        org.jsoup.select.Elements elements53 = element46.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body></body>\n</html>", pattern52);
        org.jsoup.select.Elements elements55 = element46.getElementsByClass("hi!  #document");
        java.util.Set<java.lang.String> strSet56 = element46.classNames();
        org.jsoup.nodes.Element element57 = element42.classNames(strSet56);
        org.jsoup.nodes.Element element58 = document9.classNames(strSet56);
        org.jsoup.nodes.Element element59 = document1.classNames(strSet56);
        org.jsoup.select.Elements elements61 = document1.getElementsContainingText("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element63 = document1.appendText("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#document" + "'", str13, "#document");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertNotNull(elements55);
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(elements61);
        org.junit.Assert.assertNotNull(element63);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.appendText("hi!");
        java.lang.String str6 = element3.data();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element10 = document8.html("");
        java.lang.String str11 = element10.className();
        org.jsoup.nodes.Element element12 = element10.empty();
        java.lang.String str13 = element12.className();
        org.jsoup.nodes.Node node14 = element12.nextSibling();
        java.lang.String str15 = element12.className();
        org.jsoup.parser.Tag tag16 = element12.tag();
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element19 = document18.head();
        org.jsoup.nodes.Element element20 = element12.prependChild((org.jsoup.nodes.Node) document18);
        boolean boolean21 = element3.equals((java.lang.Object) element12);
        java.util.Set<java.lang.String> strSet22 = element3.classNames();
        org.jsoup.select.Elements elements23 = element3.getAllElements();
        org.jsoup.nodes.Element element25 = element3.prependText("#document");
        org.jsoup.nodes.Element element27 = element3.val("<html>\n <head></head>\n <body>\n  #document\n </body>\n</html>");
        boolean boolean29 = element27.hasClass("hi! #document<#root>\n #document<hi!></hi!>\n</#root>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.html("hi!");
        org.jsoup.nodes.Element element11 = element9.addClass("hi!  #document");
        java.lang.String str12 = element9.id();
        org.jsoup.nodes.Element element14 = element9.prepend("<#root></#root>");
        org.jsoup.select.Elements elements15 = element9.getAllElements();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element6 = document5.head();
        java.lang.String str7 = document5.outerHtml();
        java.lang.Integer int8 = document5.elementSiblingIndex();
        java.lang.String str9 = document5.nodeName();
        org.jsoup.nodes.Element element11 = document5.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = document5.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings12.indentAmount(10);
        boolean boolean15 = document1.equals((java.lang.Object) outputSettings14);
        java.lang.String str16 = document1.nodeName();
        org.jsoup.nodes.Element element18 = document1.createElement("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements21 = element18.getElementsByAttributeValueNot("#document", "<#root>\n #root\n <html>\n  <head></head>\n  <body>\n   &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n  </body>\n </html>\n</#root>");
        org.jsoup.select.Elements elements24 = element18.getElementsByAttributeValueMatching("<body></body>\n<html> \n <head></head> \n <body> \n </body>\n</html><#root #root=\"\"></#root>", "<html> <head></head> <body></body> </html> <#root></#root>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#document" + "'", str16, "#document");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elements24);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.html("hi!");
        org.jsoup.nodes.Element element11 = element9.addClass("hi!  #document");
        java.lang.String str12 = element9.id();
        org.jsoup.nodes.Element element14 = element9.appendElement("#root");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByIndexEquals((int) (short) 100);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = document1.new OutputSettings();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element7 = document6.head();
        java.lang.String str8 = document6.outerHtml();
        java.lang.Integer int9 = document6.elementSiblingIndex();
        java.lang.String str10 = document6.nodeName();
        org.jsoup.parser.Tag tag11 = document6.tag();
        org.jsoup.nodes.Element element13 = document6.createElement("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements15 = document6.getElementsByClass("#document");
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = document6.outputSettings();
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str19 = document18.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = document18.outputSettings();
        boolean boolean21 = outputSettings20.prettyPrint();
        org.jsoup.nodes.Document document23 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element24 = document23.head();
        java.lang.String str25 = document23.outerHtml();
        java.lang.Integer int26 = document23.elementSiblingIndex();
        java.lang.String str27 = document23.nodeName();
        org.jsoup.nodes.Element element29 = document23.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = document23.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings30.indentAmount(10);
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings30.prettyPrint(true);
        boolean boolean35 = outputSettings34.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode36 = outputSettings34.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings20.escapeMode(escapeMode36);
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings16.escapeMode(escapeMode36);
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings4.escapeMode(escapeMode36);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document" + "'", str10, "#document");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#document" + "'", str19, "#document");
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#document" + "'", str27, "#document");
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + escapeMode36 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode36.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertNotNull(outputSettings39);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.outputSettings();
        org.jsoup.select.Elements elements8 = document1.getElementsByIndexGreaterThan(0);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document1.outputSettings();
        org.jsoup.select.Elements elements12 = document1.getElementsByAttributeValueMatching("hi!  #document", "#root");
        java.lang.String str14 = document1.absUrl("hi!");
        java.lang.String str15 = document1.html();
        org.jsoup.select.Elements elements17 = document1.getElementsByIndexLessThan((-1));
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = document1.outputSettings();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings4.charset("hi!#root");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!#root");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(outputSettings4);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.parser.Tag tag6 = document1.tag();
        org.jsoup.nodes.Element element8 = document1.createElement("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document1.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = document1.outputSettings();
        org.jsoup.select.Elements elements12 = document1.getElementsContainingOwnText("<#root>\n #root\n <html>\n  <head></head>\n  <body>\n   &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n  </body>\n </html>\n</#root>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        java.lang.String str8 = element5.className();
        org.jsoup.parser.Tag tag9 = element5.tag();
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element12 = document11.head();
        org.jsoup.nodes.Element element13 = element5.prependChild((org.jsoup.nodes.Node) document11);
        java.lang.String str14 = element5.className();
        element5.setBaseUri("hi!  #document");
        org.jsoup.nodes.Element element17 = element5.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = element17.firstElementSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(element17);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.outputSettings();
        java.nio.charset.Charset charset4 = outputSettings3.charset();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str7 = document6.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document6.outputSettings();
        boolean boolean9 = outputSettings8.prettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder10 = outputSettings8.encoder();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document12.head();
        java.lang.String str14 = document12.outerHtml();
        java.lang.Integer int15 = document12.elementSiblingIndex();
        java.lang.String str16 = document12.nodeName();
        org.jsoup.nodes.Element element18 = document12.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = document12.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings19.indentAmount(10);
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = outputSettings21.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings8.escapeMode(escapeMode22);
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings8.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings3.escapeMode(escapeMode24);
        boolean boolean26 = outputSettings25.prettyPrint();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charsetEncoder10);
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#document" + "'", str16, "#document");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.nodes.Element element9 = document1.head();
        org.jsoup.nodes.Element element11 = document1.prepend("#document");
        org.jsoup.parser.Tag tag12 = document1.tag();
        boolean boolean13 = document1.hasText();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = document1.new OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.indentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings14.escapeMode();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root #document");
        boolean boolean2 = document1.isBlock();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.Integer int4 = document1.siblingIndex();
        java.lang.String str5 = document1.data();
        org.jsoup.nodes.Element element7 = document1.prependElement("#documenthi!");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.select.Elements elements5 = document1.children();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        org.jsoup.nodes.Element element7 = document1.parent();
        org.jsoup.nodes.Document document8 = document1.normalise();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = document8.after("<#root class=\"\"></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertNotNull(document8);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document1.addClass("#document");
        java.util.Set<java.lang.String> strSet7 = element6.classNames();
        java.lang.Integer int8 = element6.elementSiblingIndex();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element12 = document10.html("");
        java.lang.String str13 = element12.className();
        org.jsoup.nodes.Element element14 = element12.empty();
        org.jsoup.select.Elements elements16 = element12.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element18 = element12.html("hi!");
        boolean boolean20 = element18.hasAttr("hi!");
        java.util.Set<java.lang.String> strSet21 = element18.classNames();
        org.jsoup.nodes.Element element22 = element6.classNames(strSet21);
        boolean boolean23 = element6.isBlock();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.nodes.Document document5 = document1.ownerDocument();
        boolean boolean6 = document5.isBlock();
        java.lang.String str7 = document5.tagName();
        org.jsoup.nodes.Element element8 = document5.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = document5.select("#documenthi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '#documenthi!': unexpected token at '!'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#root" + "'", str7, "#root");
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        boolean boolean5 = element3.hasClass("#document");
        java.lang.String str6 = element3.html();
        org.jsoup.select.Elements elements8 = element3.getElementsMatchingText("");
        org.jsoup.nodes.Node node9 = element3.nextSibling();
        java.util.Set<java.lang.String> strSet10 = element3.classNames();
        org.jsoup.nodes.Element element12 = element3.prependElement("<html>\n <head></head>\n <body></body>\n</html><#root class=\"\"></#root>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        java.lang.String str8 = element5.absUrl("#document");
        org.jsoup.nodes.Element element10 = element5.val("<#root hi! #document=\"#document\">");
        org.jsoup.select.Elements elements13 = element5.getElementsByAttributeValueContaining("&lt;&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&gt;&lt;/&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&gt;", "<#root>\n #root\n <html>\n  <head></head>\n  <body>\n   &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n  </body>\n </html>\n</#root>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        boolean boolean5 = element3.hasClass("#document");
        org.jsoup.select.Elements elements6 = element3.parents();
        org.jsoup.select.Elements elements9 = element3.getElementsByAttributeValueMatching("#document", "hi!");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.html("");
        java.lang.String str14 = element13.className();
        org.jsoup.nodes.Element element15 = element3.prependChild((org.jsoup.nodes.Node) element13);
        org.jsoup.nodes.Element element17 = element13.prependText("#document");
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element21 = document19.html("");
        boolean boolean23 = element21.hasClass("#document");
        org.jsoup.select.Elements elements24 = element21.parents();
        org.jsoup.select.Elements elements27 = element21.getElementsByAttributeValueMatching("#document", "hi!");
        org.jsoup.nodes.Document document29 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element31 = document29.html("");
        java.lang.String str32 = element31.className();
        org.jsoup.nodes.Element element33 = element21.prependChild((org.jsoup.nodes.Node) element31);
        org.jsoup.nodes.Element element34 = element31.previousElementSibling();
        org.jsoup.nodes.Element element36 = element31.toggleClass("hi!  #document");
        element17.replaceWith((org.jsoup.nodes.Node) element31);
        java.lang.String str39 = element17.absUrl("hi!#root");
        org.jsoup.nodes.Element element41 = element17.val("<hi!  #document></hi!  #document>");
        org.jsoup.select.Elements elements43 = element17.getElementsContainingOwnText("hi!#root <html> <head></head> <body></body> </html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNull(element34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(elements43);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document1.addClass("#document");
        java.util.Set<java.lang.String> strSet7 = element6.classNames();
        java.lang.Integer int8 = element6.elementSiblingIndex();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element12 = document10.html("");
        java.lang.String str13 = element12.className();
        org.jsoup.nodes.Element element14 = element12.empty();
        org.jsoup.select.Elements elements16 = element12.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element18 = element12.html("hi!");
        boolean boolean20 = element18.hasAttr("hi!");
        java.util.Set<java.lang.String> strSet21 = element18.classNames();
        org.jsoup.nodes.Element element22 = element6.classNames(strSet21);
        org.jsoup.select.Elements elements23 = element6.children();
        org.jsoup.nodes.Element element25 = element6.addClass("hi!#root");
        org.jsoup.nodes.Element element27 = element25.prependText("hi!#root\n<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html>");
        boolean boolean29 = element27.hasClass("");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        java.lang.String str8 = element5.className();
        org.jsoup.parser.Tag tag9 = element5.tag();
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element12 = document11.head();
        org.jsoup.nodes.Element element13 = element5.prependChild((org.jsoup.nodes.Node) document11);
        org.jsoup.nodes.Element element14 = document11.empty();
        java.lang.String str15 = document11.ownText();
        java.lang.String str16 = document11.id();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("hi!");
        java.lang.String str4 = document1.nodeName();
        org.jsoup.nodes.Element element5 = document1.body();
        org.jsoup.nodes.Element element7 = document1.createElement("#root <html> <head></head> <body></body> </html>");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = element7.childNodes();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        boolean boolean5 = element3.hasClass("#document");
        org.jsoup.select.Elements elements6 = element3.parents();
        org.jsoup.select.Elements elements9 = element3.getElementsByAttributeValueMatching("#document", "hi!");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.html("");
        java.lang.String str14 = element13.className();
        org.jsoup.nodes.Element element15 = element3.prependChild((org.jsoup.nodes.Node) element13);
        org.jsoup.nodes.Element element17 = element13.prependText("#document");
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element21 = document19.html("");
        org.jsoup.nodes.Element element23 = element21.appendText("hi!");
        java.lang.String str24 = element23.html();
        java.lang.String str25 = element23.text();
        org.jsoup.nodes.Element element26 = element13.appendChild((org.jsoup.nodes.Node) element23);
        org.jsoup.nodes.Element element28 = element23.prependElement("\n<body></body>");
        java.lang.String str30 = element23.attr("<html>\n <head></head>\n <body>\n  #document\n </body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.appendText("hi!");
        java.lang.String str6 = element5.html();
        org.jsoup.nodes.Element element9 = element5.attr("<html>\n <head></head>\n <body></body>\n</html>", "hi!");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("hi!  #document");
        java.lang.String str12 = document11.title();
        org.jsoup.nodes.Element element13 = element5.appendChild((org.jsoup.nodes.Node) document11);
        org.jsoup.nodes.Element element15 = element5.html("");
        org.jsoup.select.Elements elements16 = element15.children();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        boolean boolean7 = element5.hasClass("");
        java.lang.String str8 = element5.html();
        java.lang.String str9 = element5.text();
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.html("");
        java.lang.String str14 = element13.className();
        org.jsoup.nodes.Element element15 = element13.empty();
        boolean boolean17 = element15.hasClass("");
        java.lang.String str18 = element15.html();
        java.lang.String str19 = element15.text();
        org.jsoup.select.Elements elements22 = element15.getElementsByAttributeValueMatching("hi!", "hi!  #document");
        org.jsoup.select.Elements elements25 = element15.getElementsByAttributeValue("hi!", "#document");
        org.jsoup.nodes.Element element27 = element15.appendElement("hi!  #document");
        org.jsoup.nodes.Element element28 = element5.appendChild((org.jsoup.nodes.Node) element27);
        org.jsoup.parser.Tag tag29 = element5.tag();
        org.jsoup.select.Elements elements30 = element5.children();
        java.lang.String str32 = element5.absUrl("#document <head></head>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        java.lang.String str8 = element7.val();
        org.jsoup.select.Elements elements11 = element7.getElementsByAttributeValue("hi!  #document", "#document");
        org.jsoup.select.Elements elements13 = element7.getElementsByIndexEquals(100);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("#document", "hi!");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document1.new OutputSettings();
        org.jsoup.nodes.Element element11 = document1.text("<html>\n <head></head>\n <body>\n  #documenthi!\n </body>\n</html>");
        org.jsoup.nodes.Element element12 = document1.head();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        document1.setBaseUri("");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.html("");
        java.lang.String str14 = element13.className();
        org.jsoup.nodes.Element element15 = element13.empty();
        java.lang.String str16 = element15.className();
        org.jsoup.nodes.Node node17 = element15.nextSibling();
        java.lang.String str18 = element15.className();
        org.jsoup.select.Elements elements19 = element15.getAllElements();
        org.jsoup.nodes.Element element20 = document1.prependChild((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Element element23 = element20.appendChild((org.jsoup.nodes.Node) document22);
        org.jsoup.nodes.Node node24 = document22.nextSibling();
        java.lang.String str25 = document22.className();
        org.jsoup.nodes.Element element27 = document22.text("<#root hi!  #document=\"#document\"></#root>");
        org.jsoup.nodes.Element element28 = document22.empty();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = document22.outputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = outputSettings29.escapeMode();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertTrue("'" + escapeMode30 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode30.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.select.Elements elements9 = element3.getElementsMatchingOwnText("hi!  #document");
        boolean boolean10 = element3.hasText();
        org.jsoup.nodes.Element element12 = element3.prependText("hi!#root");
        java.lang.String str13 = element3.baseUri();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Node node6 = document1.removeAttr("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element8 = document1.addClass("");
        org.jsoup.nodes.Element element10 = document1.val("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = document1.dataset();
        org.jsoup.nodes.Element element12 = document1.body();
        boolean boolean14 = document1.hasAttr(" hi!");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        java.lang.String str5 = document1.outerHtml();
        document1.setBaseUri("#document");
        org.jsoup.nodes.Attributes attributes8 = document1.attributes();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.select.Elements elements5 = document1.children();
        org.jsoup.nodes.Element element7 = document1.createElement("#root");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element11 = document9.html("");
        org.jsoup.nodes.Element element13 = element11.appendText("hi!");
        java.lang.String str14 = element11.data();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.html("");
        java.lang.String str19 = element18.className();
        org.jsoup.nodes.Element element20 = element18.empty();
        java.lang.String str21 = element20.className();
        org.jsoup.nodes.Node node22 = element20.nextSibling();
        java.lang.String str23 = element20.className();
        org.jsoup.parser.Tag tag24 = element20.tag();
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element27 = document26.head();
        org.jsoup.nodes.Element element28 = element20.prependChild((org.jsoup.nodes.Node) document26);
        boolean boolean29 = element11.equals((java.lang.Object) element20);
        org.jsoup.nodes.Element element32 = element20.attr("<html>\n <head></head>\n <body></body>\n</html>", "<#root></#root>");
        org.jsoup.nodes.Element element33 = element7.prependChild((org.jsoup.nodes.Node) element20);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNull(element27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element33);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        org.jsoup.nodes.Element element3 = document1.parent();
        java.lang.String str4 = document1.nodeName();
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueMatching("<#root></#root>", pattern6);
        java.lang.String str8 = document1.id();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeStarting("hi!#root <html> <head></head> <body></body> </html>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        boolean boolean5 = element3.hasClass("#document");
        org.jsoup.select.Elements elements6 = element3.parents();
        java.lang.String str7 = element3.toString();
        java.lang.String str8 = element3.ownText();
        org.jsoup.select.Elements elements9 = element3.parents();
        org.jsoup.select.Elements elements11 = element3.getElementsByAttributeStarting("#documenthi!");
        org.jsoup.select.Elements elements14 = element3.getElementsByAttributeValue(" hi!#root", " hi!");
        element3.setBaseUri("");
        org.jsoup.select.Elements elements18 = element3.getElementsByAttribute("<html> <head></head> <body></body> </html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        document1.setBaseUri("");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.html("");
        java.lang.String str14 = element13.className();
        org.jsoup.nodes.Element element15 = element13.empty();
        java.lang.String str16 = element15.className();
        org.jsoup.nodes.Node node17 = element15.nextSibling();
        java.lang.String str18 = element15.className();
        org.jsoup.select.Elements elements19 = element15.getAllElements();
        org.jsoup.nodes.Element element20 = document1.prependChild((org.jsoup.nodes.Node) element15);
        org.jsoup.select.Elements elements22 = element15.getElementsMatchingOwnText("<html>\n <head></head>\n <body></body>\n</html><#root></#root>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Node node6 = document1.removeAttr("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element8 = document1.addClass("");
        org.jsoup.nodes.Element element10 = document1.val("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = document1.dataset();
        org.jsoup.nodes.Element element12 = document1.body();
        java.lang.String str13 = element12.tagName();
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str16 = document15.val();
        java.lang.String[] strArray27 = new java.lang.String[] { "<#root></#root>", "<#root></#root>", "<#root hi!  #document=\"#document\"></#root>", "#document", "<#root hi!  #document=\"#document\"></#root>", "<#root hi!  #document=\"#document\"></#root>", "#document", "#root", "hi!  #document", "<html>\n <head></head>\n <body></body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        org.jsoup.nodes.Element element30 = document15.classNames((java.util.Set<java.lang.String>) strSet28);
        org.jsoup.nodes.Element element32 = document15.prependElement("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element33 = element12.appendChild((org.jsoup.nodes.Node) element32);
        org.jsoup.parser.Tag tag34 = element32.tag();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "body" + "'", str13, "body");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "<#root></#root>", "<#root></#root>", "<#root hi!  #document=\"#document\"></#root>", "#document", "<#root hi!  #document=\"#document\"></#root>", "<#root hi!  #document=\"#document\"></#root>", "#document", "#root", "hi!  #document", "<html>\n <head></head>\n <body></body>\n</html>" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(tag34);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        document1.setBaseUri("");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.html("");
        java.lang.String str14 = element13.className();
        org.jsoup.nodes.Element element15 = element13.empty();
        java.lang.String str16 = element15.className();
        org.jsoup.nodes.Node node17 = element15.nextSibling();
        java.lang.String str18 = element15.className();
        org.jsoup.select.Elements elements19 = element15.getAllElements();
        org.jsoup.nodes.Element element20 = document1.prependChild((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Element element23 = element20.appendChild((org.jsoup.nodes.Node) document22);
        org.jsoup.nodes.Node node24 = document22.nextSibling();
        java.lang.String str25 = document22.className();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = document22.new OutputSettings();
        org.jsoup.nodes.Element element28 = document22.removeClass("");
        org.jsoup.nodes.Element element29 = element28.empty();
        boolean boolean31 = element29.hasAttr("");
        org.jsoup.nodes.Element element33 = element29.html("#root #document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements35 = element33.getElementsByAttributeStarting("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(element33);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        boolean boolean5 = element3.hasClass("#document");
        org.jsoup.select.Elements elements6 = element3.parents();
        org.jsoup.select.Elements elements9 = element3.getElementsByAttributeValueMatching("#document", "hi!");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.html("");
        java.lang.String str14 = element13.className();
        org.jsoup.nodes.Element element15 = element3.prependChild((org.jsoup.nodes.Node) element13);
        java.lang.Integer int16 = element13.siblingIndex();
        org.jsoup.nodes.Element element17 = element13.parent();
        java.util.regex.Pattern pattern19 = null;
        org.jsoup.select.Elements elements20 = element17.getElementsByAttributeValueMatching("&lt;&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&gt;&lt;/&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&gt;", pattern19);
        org.jsoup.nodes.Element element22 = element17.prependElement("hi!#root\n<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html>");
        org.jsoup.select.Elements elements24 = element17.getElementsMatchingOwnText("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element25 = element17.firstElementSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        boolean boolean3 = document1.isBlock();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str6 = document1.attr("hi!");
        java.lang.Integer int7 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element9 = document1.wrap("hi!");
        org.jsoup.nodes.Document document10 = document1.normalise();
        org.jsoup.nodes.Element element12 = document10.appendText("");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = document10.dataset();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<html>\n <head></head>\n <body></body>\n</html><#root class=\"\"></#root>");
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("\n<head></head>");
        java.lang.String str2 = document1.className();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.appendText("hi!");
        java.lang.String str6 = element3.data();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element10 = document8.html("");
        java.lang.String str11 = element10.className();
        org.jsoup.nodes.Element element12 = element10.empty();
        java.lang.String str13 = element12.className();
        org.jsoup.nodes.Node node14 = element12.nextSibling();
        java.lang.String str15 = element12.className();
        org.jsoup.parser.Tag tag16 = element12.tag();
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element19 = document18.head();
        org.jsoup.nodes.Element element20 = element12.prependChild((org.jsoup.nodes.Node) document18);
        boolean boolean21 = element3.equals((java.lang.Object) element12);
        java.util.Set<java.lang.String> strSet22 = element3.classNames();
        org.jsoup.select.Elements elements24 = element3.getElementsByClass("hi!");
        org.jsoup.nodes.Element element25 = element3.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element27 = element3.child(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element25);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Element element4 = document1.head();
        java.lang.String str5 = document1.nodeName();
        java.lang.String str6 = document1.id();
        org.jsoup.nodes.Element element8 = document1.prependText("<html><head></head><body></body></html>&lt;#root&gt;&lt;/#root&gt;hi!");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.jsoup.nodes.Element element14 = document7.classNames((java.util.Set<java.lang.String>) strSet12);
        org.jsoup.nodes.Element element15 = document1.classNames((java.util.Set<java.lang.String>) strSet12);
        java.lang.String str16 = document1.className();
        org.jsoup.nodes.Document document17 = document1.ownerDocument();
        org.jsoup.nodes.Element element18 = document1.head();
        org.jsoup.nodes.Element element20 = document1.prependElement("<#root></#root>hi!");
        org.jsoup.select.Elements elements22 = document1.getElementsByIndexLessThan(97);
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!  #document" + "'", str16, "hi!  #document");
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.outerHtml();
        java.lang.String str3 = document1.className();
        java.lang.String str5 = document1.absUrl("hi!");
        org.jsoup.nodes.Attributes attributes6 = document1.attributes();
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Element element9 = document1.text("hi! #document");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = element9.dataset();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = document1.createElement("hi!");
        java.util.Set<java.lang.String> strSet6 = document1.classNames();
        org.jsoup.nodes.Element element8 = document1.appendText("#document");
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document1.new OutputSettings();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.jsoup.nodes.Element element14 = document7.classNames((java.util.Set<java.lang.String>) strSet12);
        org.jsoup.nodes.Element element15 = document1.classNames((java.util.Set<java.lang.String>) strSet12);
        java.lang.String str16 = document1.className();
        org.jsoup.nodes.Document document17 = document1.ownerDocument();
        org.jsoup.nodes.Element element19 = document1.prepend("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str20 = element19.val();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!  #document" + "'", str16, "hi!  #document");
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.outputSettings();
        boolean boolean4 = outputSettings3.prettyPrint();
        int int5 = outputSettings3.indentAmount();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element8 = document7.head();
        java.lang.String str9 = document7.outerHtml();
        java.lang.Integer int10 = document7.elementSiblingIndex();
        java.lang.String str11 = document7.nodeName();
        org.jsoup.nodes.Element element13 = document7.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = document7.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.indentAmount(10);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings14.prettyPrint(true);
        boolean boolean19 = outputSettings18.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings18.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings3.escapeMode(escapeMode20);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings3.prettyPrint(false);
        boolean boolean24 = outputSettings3.prettyPrint();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.html("#document");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element9 = document7.html("");
        java.lang.String str10 = element9.className();
        org.jsoup.nodes.Element element11 = element9.empty();
        org.jsoup.select.Elements elements13 = element9.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element15 = element9.html("hi!");
        boolean boolean17 = element15.hasAttr("hi!");
        java.util.Set<java.lang.String> strSet18 = element15.classNames();
        org.jsoup.nodes.Element element19 = element5.classNames(strSet18);
        org.jsoup.nodes.Element element21 = element19.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap22 = element21.dataset();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element3.childNodes();
        org.jsoup.nodes.Element element9 = element3.toggleClass("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        java.lang.String str10 = element9.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element9.childNodes();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        java.lang.String str8 = element5.absUrl("#document");
        java.lang.String str9 = element5.ownText();
        org.jsoup.nodes.Document document10 = element5.ownerDocument();
        org.jsoup.select.Elements elements13 = document10.getElementsByAttributeValue("<#root></#root>hi!", "<#root hi!  #document=\"#document\"></#root>");
        boolean boolean15 = document10.hasAttr("<#root>\n #root\n <html>\n  <head></head>\n  <body>\n   &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n  </body>\n </html>\n</#root>");
        org.jsoup.nodes.Element element16 = document10.body();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(element16);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document1.append("#document");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = document1.childNodes();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element9 = document8.head();
        java.lang.String str10 = document8.outerHtml();
        java.lang.Integer int11 = document8.siblingIndex();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = document8.outputSettings();
        java.lang.String str13 = document8.title();
        org.jsoup.select.Elements elements14 = document8.getAllElements();
        boolean boolean15 = document1.equals((java.lang.Object) elements14);
        boolean boolean16 = document1.isBlock();
        org.jsoup.nodes.Attributes attributes17 = document1.attributes();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependElement("hi!");
        org.jsoup.select.Elements elements11 = element3.parents();
        org.jsoup.nodes.Element element12 = element3.empty();
        java.util.regex.Pattern pattern14 = null;
        org.jsoup.select.Elements elements15 = element3.getElementsByAttributeValueMatching("<html><head></head><body></body></html>&lt;#root&gt;&lt;/#root&gt;hi!", pattern14);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<hi!></hi!>");
        org.jsoup.nodes.Node node2 = document1.nextSibling();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNull(node2);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Element element4 = document1.head();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.createElement(" #document");
        java.lang.String str8 = document1.ownText();
        java.lang.String str9 = document1.id();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.append("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements5 = document1.getElementsByAttributeStarting("<#root></#root>hi!");
        org.jsoup.nodes.Element element7 = document1.append("#document hi! #document");
        org.jsoup.nodes.Element element9 = document1.prepend("hi! #document<#root>\n #document<hi!></hi!>\n</#root>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueStarting("#document", "hi!  #document");
        java.lang.Integer int12 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document13 = document1.normalise();
        document1.setBaseUri("");
        org.jsoup.nodes.Element element17 = document1.appendText("<html><head></head><body></body></html>&lt;#root&gt;&lt;/#root&gt;hi!");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        boolean boolean7 = element5.hasClass("");
        java.lang.String str8 = element5.html();
        java.lang.String str9 = element5.text();
        java.lang.String str10 = element5.className();
        org.jsoup.select.Elements elements12 = element5.getElementsContainingText("<hi!  #document></hi!  #document>");
        org.jsoup.select.Elements elements15 = element5.getElementsByAttributeValue("<html> \n <head> \n  <title>#root</title> \n </head> \n <body> \n </body>\n</html>hi!", "<hi!  #document></hi!  #document>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Node node6 = document1.removeAttr("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element8 = document1.addClass("");
        boolean boolean10 = document1.hasClass("<html>\n <head></head>\n <body></body>\n</html><#root></#root>");
        org.jsoup.select.Elements elements12 = document1.getElementsByIndexGreaterThan((-1));
        java.lang.String str13 = document1.html();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str13, "<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.outputSettings();
        document1.title("hi!  #document");
        java.lang.String str6 = document1.title();
        org.jsoup.nodes.Element element7 = document1.body();
        org.jsoup.parser.Tag tag8 = element7.tag();
        org.jsoup.select.Elements elements10 = element7.select("#root #document");
        java.util.regex.Pattern pattern11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element7.getElementsMatchingText(pattern11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!  #document" + "'", str6, "hi!  #document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        boolean boolean5 = element3.hasClass("#document");
        org.jsoup.select.Elements elements6 = element3.parents();
        org.jsoup.select.Elements elements9 = element3.getElementsByAttributeValueMatching("#document", "hi!");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.html("");
        java.lang.String str14 = element13.className();
        org.jsoup.nodes.Element element15 = element3.prependChild((org.jsoup.nodes.Node) element13);
        org.jsoup.nodes.Element element17 = element13.appendText("#document");
        org.jsoup.select.Elements elements20 = element17.getElementsByAttributeValueNot("<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body></body>\n</html>");
        boolean boolean21 = element17.hasText();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element5 = document1.createElement("<#root></#root>");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element8 = document7.head();
        java.lang.Integer int9 = document7.elementSiblingIndex();
        org.jsoup.select.Elements elements11 = document7.getElementsByAttribute("#root");
        java.lang.String str12 = document7.ownText();
        org.jsoup.select.Elements elements15 = document7.getElementsByAttributeValueContaining("<html> <head> <title>#root</title> </head> <body></body> </html>", "#document");
        org.jsoup.nodes.Element element16 = document1.prependChild((org.jsoup.nodes.Node) document7);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        org.jsoup.nodes.Element element9 = element5.removeClass("");
        org.jsoup.nodes.Element element11 = element5.appendElement("#root");
        org.jsoup.nodes.Element element13 = element11.prependText("");
        java.lang.String str14 = element13.text();
        org.jsoup.nodes.Element element16 = element13.append("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        boolean boolean9 = element7.hasAttr("hi!  #document");
        org.jsoup.nodes.Node node10 = element7.nextSibling();
        org.jsoup.select.Elements elements12 = element7.getElementsByTag("hi!");
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element16 = document14.html("");
        boolean boolean18 = element16.hasClass("#document");
        org.jsoup.select.Elements elements19 = element16.parents();
        org.jsoup.select.Elements elements22 = element16.getElementsByAttributeValueMatching("#document", "hi!");
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element26 = document24.html("");
        java.lang.String str27 = element26.className();
        org.jsoup.nodes.Element element28 = element16.prependChild((org.jsoup.nodes.Node) element26);
        org.jsoup.nodes.Element element29 = element7.prependChild((org.jsoup.nodes.Node) element28);
        java.lang.String str31 = element29.absUrl("<html> \n <head></head> \n <body> \n </body>\n</html>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueStarting("<#root></#root>", "#document");
        java.lang.String str5 = document1.baseUri();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        boolean boolean7 = element5.hasClass("");
        java.lang.String str8 = element5.html();
        java.lang.String str9 = element5.text();
        org.jsoup.select.Elements elements12 = element5.getElementsByAttributeValueMatching("hi!", "hi!  #document");
        org.jsoup.select.Elements elements15 = element5.getElementsByAttributeValue("hi!", "#document");
        org.jsoup.nodes.Element element17 = element5.appendText("#document");
        org.jsoup.nodes.Element element19 = element17.removeClass("#document");
        org.jsoup.nodes.Element element21 = element19.prependText("hi!  #document");
        org.jsoup.select.Elements elements23 = element19.getElementsByClass("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document1.addClass("#document");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.select.Elements elements10 = element7.getElementsByAttributeValueMatching("", "hi!  #document");
        org.jsoup.nodes.Element element12 = element7.removeClass("hi!  #document");
        org.jsoup.nodes.Element element14 = element7.toggleClass("hi!  #document");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = element14.childNodes();
        org.jsoup.nodes.Element element17 = element14.val("hi!");
        org.jsoup.nodes.Element element19 = element14.toggleClass("hi!#root <html> <head></head> <body></body> </html>");
        boolean boolean20 = element14.isBlock();
        boolean boolean21 = element14.isBlock();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.jsoup.nodes.Element element14 = document7.classNames((java.util.Set<java.lang.String>) strSet12);
        org.jsoup.nodes.Element element15 = document1.classNames((java.util.Set<java.lang.String>) strSet12);
        java.lang.String str16 = document1.className();
        org.jsoup.nodes.Document document17 = document1.ownerDocument();
        org.jsoup.nodes.Element element18 = document1.head();
        java.util.regex.Pattern pattern19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements20 = element18.getElementsMatchingText(pattern19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!  #document" + "'", str16, "hi!  #document");
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNull(element18);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.html("hi!");
        java.lang.Integer int11 = element10.elementSiblingIndex();
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element14 = document13.head();
        java.lang.String str15 = document13.outerHtml();
        java.lang.Integer int16 = document13.elementSiblingIndex();
        java.lang.String str17 = document13.nodeName();
        org.jsoup.nodes.Element element19 = document13.removeClass("");
        boolean boolean21 = element19.hasAttr("hi!  #document");
        java.lang.String str22 = element19.tagName();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element25 = document24.head();
        java.lang.String str26 = document24.outerHtml();
        java.lang.Integer int27 = document24.elementSiblingIndex();
        org.jsoup.nodes.Element element29 = document24.addClass("#document");
        boolean boolean31 = element29.hasClass("hi!");
        org.jsoup.nodes.Document document33 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        org.jsoup.nodes.Element element40 = document33.classNames((java.util.Set<java.lang.String>) strSet38);
        org.jsoup.select.Elements elements43 = document33.getElementsByAttributeValueStarting("#document", "hi!  #document");
        org.jsoup.nodes.Document document44 = document33.normalise();
        org.jsoup.nodes.Document document46 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element48 = document46.html("");
        org.jsoup.nodes.Element element50 = element48.html("#document");
        org.jsoup.nodes.Document document52 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element54 = document52.html("");
        java.lang.String str55 = element54.className();
        org.jsoup.nodes.Element element56 = element54.empty();
        org.jsoup.select.Elements elements58 = element54.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element60 = element54.html("hi!");
        boolean boolean62 = element60.hasAttr("hi!");
        java.util.Set<java.lang.String> strSet63 = element60.classNames();
        org.jsoup.nodes.Element element64 = element50.classNames(strSet63);
        org.jsoup.nodes.Element element65 = document33.classNames(strSet63);
        org.jsoup.nodes.Element element66 = element29.classNames(strSet63);
        org.jsoup.nodes.Element element67 = element19.classNames(strSet63);
        org.jsoup.nodes.Element element68 = element10.prependChild((org.jsoup.nodes.Node) element19);
        org.jsoup.nodes.Element element70 = element19.after("<html>\n <head></head>\n <body></body>\n</html><#root></#root>");
        java.util.Set<java.lang.String> strSet71 = element19.classNames();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#document" + "'", str17, "#document");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#root" + "'", str22, "#root");
        org.junit.Assert.assertNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(elements58);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(strSet63);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertNotNull(element66);
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertNotNull(element70);
        org.junit.Assert.assertNotNull(strSet71);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<html> <head></head> <body></body> </html>");
        java.lang.String str2 = document1.className();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.outputSettings();
        org.jsoup.nodes.Document document5 = org.jsoup.nodes.Document.createShell("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.parser.Tag tag6 = document5.tag();
        org.jsoup.nodes.Document document7 = document5.ownerDocument();
        boolean boolean9 = document5.hasClass("<html>\n <head></head>\n <body>\n </body>\n</html><<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node13 = document11.removeAttr("#document");
        org.jsoup.nodes.Element element15 = document11.createElement("<#root></#root>");
        org.jsoup.nodes.Element element18 = document11.attr("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>", "#root");
        java.util.Set<java.lang.String> strSet19 = document11.classNames();
        org.jsoup.nodes.Element element20 = document5.classNames(strSet19);
        org.jsoup.nodes.Element element21 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("#document", "hi!");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document1.outputSettings();
        org.jsoup.nodes.Element element11 = document1.append("<html><head></head><body></body></html>&lt;#root&gt;&lt;/#root&gt;hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = element11.dataset();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.appendText("hi!");
        java.lang.String str6 = element5.html();
        org.jsoup.nodes.Element element9 = element5.attr("<html>\n <head></head>\n <body></body>\n</html>", "hi!");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("hi!  #document");
        java.lang.String str12 = document11.title();
        org.jsoup.nodes.Element element13 = element5.appendChild((org.jsoup.nodes.Node) document11);
        org.jsoup.nodes.Element element14 = document11.firstElementSibling();
        org.jsoup.nodes.Element element15 = document11.head();
        org.jsoup.nodes.Element element17 = document11.append("hi!");
        org.jsoup.nodes.Element element19 = document11.createElement("hi! #document");
        org.jsoup.select.Elements elements21 = element19.getElementsContainingOwnText("<html>\n <head></head>\n <body>\n  #document\n </body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.Integer int3 = document1.elementSiblingIndex();
        java.util.regex.Pattern pattern4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements5 = document1.getElementsMatchingText(pattern4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element7 = document1.prependChild((org.jsoup.nodes.Node) document6);
        java.lang.Integer int8 = document1.siblingIndex();
        java.lang.String str9 = document1.text();
        org.jsoup.nodes.Element element12 = document1.attr("#root", "hi!  #document");
        org.jsoup.nodes.Element element15 = document1.attr("hi!  #document", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element17 = document1.appendText("#root");
        org.jsoup.nodes.Element element19 = document1.createElement("<#root></#root>hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = document1.outputSettings();
        org.jsoup.nodes.Element element22 = document1.text("hi!");
        org.jsoup.select.Elements elements24 = element22.getElementsMatchingText("<#root></#root>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttribute("hi!  #document");
        org.jsoup.nodes.Element element12 = document1.val("");
        org.jsoup.select.Elements elements14 = document1.getElementsMatchingText("hi!  #document");
        org.jsoup.select.Elements elements16 = document1.getElementsMatchingOwnText("<html>\n <head></head>\n <body>\n </body>\n</html><<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>");
        java.lang.String str17 = document1.outerHtml();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        org.jsoup.nodes.Element element10 = element5.attr("hi!  #document", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element11 = element10.parent();
        java.lang.String str12 = element10.data();
        boolean boolean14 = element10.hasClass("");
        java.lang.String str16 = element10.absUrl("hi!#root");
        java.lang.String str17 = element10.text();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.removeClass("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element6.getElementsByAttribute("hi! #document");
        org.jsoup.select.Elements elements10 = element6.getElementsByIndexGreaterThan((int) (byte) 100);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element8 = document1.attr("#root", " hi!");
        java.util.regex.Pattern pattern9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = document1.getElementsMatchingOwnText(pattern9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element9 = element3.empty();
        java.lang.String str10 = element3.data();
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str13 = document12.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = document12.outputSettings();
        document12.title("hi!  #document");
        org.jsoup.nodes.Element element17 = element3.appendChild((org.jsoup.nodes.Node) document12);
        org.jsoup.nodes.Element element18 = element17.empty();
        org.jsoup.select.Elements elements20 = element18.getElementsMatchingText("<#root> #root <html> <head></head> <body></body> </html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#document" + "'", str13, "#document");
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.id();
        java.lang.String str6 = document1.nodeName();
        org.jsoup.nodes.Element element8 = document1.val("#root");
        // The following exception was thrown during execution in test generation
        try {
            element8.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueNot("hi!  #document", "hi!");
        org.jsoup.select.Elements elements10 = document1.getElementsByTag("hi!");
        org.jsoup.nodes.Element element12 = document1.append("#root");
        org.jsoup.select.Elements elements13 = document1.parents();
        org.jsoup.nodes.Element element14 = document1.empty();
        java.lang.Integer int15 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element16 = document1.empty();
        org.jsoup.select.Elements elements19 = document1.getElementsByAttributeValueNot("<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body></body>\n</html>");
        java.util.regex.Pattern pattern21 = null;
        org.jsoup.select.Elements elements22 = document1.getElementsByAttributeValueMatching("<hi!></hi!>", pattern21);
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element6 = document5.head();
        java.lang.String str7 = document5.outerHtml();
        java.lang.Integer int8 = document5.elementSiblingIndex();
        java.lang.String str9 = document5.nodeName();
        org.jsoup.nodes.Element element11 = document5.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = document5.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings12.indentAmount(10);
        boolean boolean15 = document1.equals((java.lang.Object) outputSettings14);
        org.jsoup.nodes.Element element17 = document1.addClass("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element19 = document1.prependElement("hi!");
        java.lang.String str20 = element19.ownText();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Node node5 = document1.nextSibling();
        boolean boolean7 = document1.hasAttr("hi!#root <html> <head></head> <body></body> </html>");
        org.jsoup.nodes.Element element8 = document1.empty();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("#document", "hi!");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueNot("hi!  #document", "hi!");
        document1.title("hi!  #document");
        org.jsoup.nodes.Element element15 = document1.html("<html>\n <head></head>\n <body></body>\n</html><#root class=\"\"></#root>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document1.dataset();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        boolean boolean3 = document1.isBlock();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str6 = document1.attr("hi!");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueNot("#root <html> <head></head> <body></body> </html>", "<html>\n <head></head>\n <body>\n </body>\n</html><<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.html("");
        java.lang.String str14 = element13.className();
        boolean boolean16 = element13.hasClass("hi!");
        boolean boolean18 = element13.hasAttr("#document");
        org.jsoup.nodes.Element element19 = element13.empty();
        org.jsoup.nodes.Element element20 = element13.parent();
        org.jsoup.nodes.Element element21 = document1.appendChild((org.jsoup.nodes.Node) element13);
        java.lang.String str22 = document1.outerHtml();
        java.util.regex.Pattern pattern24 = null;
        org.jsoup.select.Elements elements25 = document1.getElementsByAttributeValueMatching("hi! #document", pattern24);
        boolean boolean26 = document1.hasText();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html><#root></#root>" + "'", str22, "<html>\n <head></head>\n <body></body>\n</html><#root></#root>");
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.parser.Tag tag6 = document1.tag();
        org.jsoup.nodes.Element element8 = document1.createElement("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements10 = document1.getElementsByClass("#document");
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = document1.outputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings11.escapeMode();
        java.nio.charset.Charset charset13 = outputSettings11.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings11.prettyPrint(true);
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str18 = document17.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = document17.outputSettings();
        boolean boolean20 = outputSettings19.prettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder21 = outputSettings19.encoder();
        org.jsoup.nodes.Document document23 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element24 = document23.head();
        java.lang.String str25 = document23.outerHtml();
        java.lang.Integer int26 = document23.elementSiblingIndex();
        java.lang.String str27 = document23.nodeName();
        org.jsoup.nodes.Element element29 = document23.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = document23.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings30.indentAmount(10);
        org.jsoup.nodes.Entities.EscapeMode escapeMode33 = outputSettings32.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings19.escapeMode(escapeMode33);
        org.jsoup.nodes.Entities.EscapeMode escapeMode35 = outputSettings19.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings11.escapeMode(escapeMode35);
        org.jsoup.nodes.Document document38 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element39 = document38.head();
        java.lang.String str40 = document38.outerHtml();
        java.lang.Integer int41 = document38.elementSiblingIndex();
        java.lang.String str42 = document38.nodeName();
        org.jsoup.nodes.Element element44 = document38.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = document38.outputSettings();
        java.nio.charset.Charset charset46 = outputSettings45.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings45.indentAmount((int) '4');
        java.nio.charset.Charset charset49 = outputSettings48.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings11.charset(charset49);
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset13);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#document" + "'", str18, "#document");
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(charsetEncoder21);
        org.junit.Assert.assertNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#document" + "'", str27, "#document");
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertTrue("'" + escapeMode33 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode33.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertTrue("'" + escapeMode35 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode35.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertNull(element39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "#document" + "'", str42, "#document");
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertNotNull(charset46);
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertNotNull(charset49);
        org.junit.Assert.assertNotNull(outputSettings50);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueStarting("#document", "hi!  #document");
        boolean boolean13 = document1.hasClass("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element15 = document1.appendText("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = document1.new OutputSettings();
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet19 = document18.classNames();
        boolean boolean20 = document18.isBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = document18.new OutputSettings();
        java.nio.charset.Charset charset22 = outputSettings21.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings16.charset(charset22);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings23.indentAmount((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be true");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(charset22);
        org.junit.Assert.assertNotNull(outputSettings23);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.nodes.Element element6 = document1.append("#root #document");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.nodes.Document document5 = document1.ownerDocument();
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueContaining("<html>\n <head></head>\n <body></body>\n</html>", "hi!");
        java.util.regex.Pattern pattern10 = null;
        org.jsoup.select.Elements elements11 = document5.getElementsByAttributeValueMatching("hi!#root <html> <head></head> <body></body> </html>", pattern10);
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("hi!");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingOwnText("#document");
        org.jsoup.select.Elements elements7 = document1.getElementsByIndexEquals(0);
        java.lang.String str8 = document1.title();
        org.jsoup.nodes.Element element10 = document1.appendElement("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements12 = document1.getElementsByClass("<#root> #root <html> <head></head> <body></body> </html>");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document1.append("#document");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = document1.childNodes();
        org.jsoup.select.Elements elements8 = document1.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element11 = document1.attr("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>", "");
        java.lang.String str12 = document1.nodeName();
        document1.title("<html>\n <head></head>\n <body></body>\n</html><#document></#document>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("#document", "hi!");
        org.jsoup.nodes.Element element8 = document1.val("#root");
        org.jsoup.nodes.Element element10 = document1.prependText("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        document1.title("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        document1.title("hi!  #document");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.Integer int4 = element3.siblingIndex();
        org.jsoup.select.Elements elements7 = element3.getElementsByAttributeValueMatching("<html><head></head><body></body></html>&lt;#root&gt;&lt;/#root&gt;hi!", "<html>\n <head></head>\n <body>\n </body>\n</html><<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>");
        org.jsoup.nodes.Element element9 = element3.appendText("");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        document1.setBaseUri("");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.html("");
        java.lang.String str14 = element13.className();
        org.jsoup.nodes.Element element15 = element13.empty();
        java.lang.String str16 = element15.className();
        org.jsoup.nodes.Node node17 = element15.nextSibling();
        java.lang.String str18 = element15.className();
        org.jsoup.select.Elements elements19 = element15.getAllElements();
        org.jsoup.nodes.Element element20 = document1.prependChild((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Element element23 = element20.appendChild((org.jsoup.nodes.Node) document22);
        org.jsoup.nodes.Node node24 = document22.nextSibling();
        java.lang.String str25 = document22.className();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = document22.new OutputSettings();
        org.jsoup.nodes.Element element27 = document22.body();
        org.jsoup.select.Elements elements30 = element27.getElementsByAttributeValue("<body></body>\n<html> \n <head></head> \n <body> \n </body>\n</html><#root #root=\"\"></#root>", "&lt;&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&gt;&lt;/&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&gt;");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements30);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        document1.setBaseUri("");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.html("");
        java.lang.String str14 = element13.className();
        org.jsoup.nodes.Element element15 = element13.empty();
        java.lang.String str16 = element15.className();
        org.jsoup.nodes.Node node17 = element15.nextSibling();
        java.lang.String str18 = element15.className();
        org.jsoup.select.Elements elements19 = element15.getAllElements();
        org.jsoup.nodes.Element element20 = document1.prependChild((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Element element23 = element20.appendChild((org.jsoup.nodes.Node) document22);
        org.jsoup.select.Elements elements25 = document22.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element27 = document22.text("<html>\n <head>\n  <title>&lt;html&gt;\n &lt;head&gt;\n  &lt;title&gt;#root&lt;/title&gt;\n &lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title>\n </head>\n <body></body>\n</html>#document");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(element27);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        java.lang.String str8 = element5.className();
        org.jsoup.parser.Tag tag9 = element5.tag();
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element12 = document11.head();
        org.jsoup.nodes.Element element13 = element5.prependChild((org.jsoup.nodes.Node) document11);
        org.jsoup.nodes.Node node14 = document11.nextSibling();
        org.jsoup.nodes.Element element16 = document11.prependText("<hi!  #document></hi!  #document>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.appendText("hi!");
        java.lang.String str6 = element3.data();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element10 = document8.html("");
        java.lang.String str11 = element10.className();
        org.jsoup.nodes.Element element12 = element10.empty();
        java.lang.String str13 = element12.className();
        org.jsoup.nodes.Node node14 = element12.nextSibling();
        java.lang.String str15 = element12.className();
        org.jsoup.parser.Tag tag16 = element12.tag();
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element19 = document18.head();
        org.jsoup.nodes.Element element20 = element12.prependChild((org.jsoup.nodes.Node) document18);
        boolean boolean21 = element3.equals((java.lang.Object) element12);
        org.jsoup.nodes.Element element24 = element12.attr("<html>\n <head></head>\n <body></body>\n</html>", "<#root></#root>");
        org.jsoup.nodes.Node node25 = element12.nextSibling();
        org.jsoup.nodes.Element element27 = element12.prependText("<html>\n <head></head>\n <body>\n </body>\n</html><<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>");
        element27.setBaseUri("<html> \n <head> \n  <title>#root</title> \n </head> \n <body> \n </body>\n</html>hi!");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(element27);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.appendText("hi!");
        java.lang.String str6 = element5.html();
        org.jsoup.nodes.Element element9 = element5.attr("<html>\n <head></head>\n <body></body>\n</html>", "hi!");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("hi!  #document");
        java.lang.String str12 = document11.title();
        org.jsoup.nodes.Element element13 = element5.appendChild((org.jsoup.nodes.Node) document11);
        org.jsoup.nodes.Element element14 = document11.firstElementSibling();
        org.jsoup.nodes.Element element15 = document11.head();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element17 = element15.removeClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNull(element15);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document1.addClass("#document");
        java.util.Set<java.lang.String> strSet7 = element6.classNames();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = element6.dataset();
        org.jsoup.nodes.Element element9 = element6.parent();
        boolean boolean10 = element6.isBlock();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = element6.dataset();
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element15 = document13.html("");
        java.lang.String str16 = element15.className();
        org.jsoup.nodes.Element element17 = element15.empty();
        org.jsoup.select.Elements elements19 = element15.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element21 = element15.html("hi!");
        org.jsoup.nodes.Element element23 = element21.addClass("hi!  #document");
        org.jsoup.nodes.Element element24 = element6.prependChild((org.jsoup.nodes.Node) element21);
        java.lang.String str25 = element21.id();
        org.jsoup.select.Elements elements26 = element21.siblingElements();
        org.jsoup.select.Elements elements28 = element21.getElementsByTag("<#root class=\"\"></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(elements28);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.jsoup.nodes.Element element14 = document7.classNames((java.util.Set<java.lang.String>) strSet12);
        org.jsoup.nodes.Element element15 = document1.classNames((java.util.Set<java.lang.String>) strSet12);
        java.lang.String str16 = document1.className();
        org.jsoup.nodes.Document document17 = document1.ownerDocument();
        org.jsoup.nodes.Element element19 = document1.prepend("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element21 = element19.val("#root");
        org.jsoup.nodes.Element element23 = element21.addClass("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements25 = element21.getElementsContainingText("<html>\n <head></head>\n <body></body>\n</html><#root></#root>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!  #document" + "'", str16, "hi!  #document");
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttribute("hi!  #document");
        org.jsoup.nodes.Element element12 = document1.getElementById("hi!  #document");
        org.jsoup.nodes.Element element14 = document1.createElement("<#root hi!  #document=\"#document\"></#root>");
        org.jsoup.nodes.Element element16 = document1.appendText("<html>\n <head>\n  <title>&lt;html&gt;\n &lt;head&gt;\n  &lt;title&gt;#root&lt;/title&gt;\n &lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title>\n </head>\n <body></body>\n</html>#document");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        org.jsoup.nodes.Element element2 = document1.empty();
        boolean boolean3 = document1.isBlock();
        org.jsoup.select.Elements elements5 = document1.getElementsByTag("hi!");
        org.jsoup.nodes.Node node6 = document1.nextSibling();
        java.lang.String str7 = document1.html();
        java.lang.String str8 = document1.text();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = document1.createElement("hi!");
        org.jsoup.select.Elements elements7 = element5.getElementsByAttribute("#root #document");
        java.lang.String str8 = element5.tagName();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.jsoup.nodes.Element element14 = document7.classNames((java.util.Set<java.lang.String>) strSet12);
        org.jsoup.nodes.Element element15 = document1.classNames((java.util.Set<java.lang.String>) strSet12);
        java.lang.String str16 = document1.className();
        org.jsoup.nodes.Document document17 = document1.ownerDocument();
        org.jsoup.nodes.Element element19 = document1.prepend("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element21 = element19.val("#root");
        boolean boolean23 = element21.hasClass("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements25 = element21.getElementsContainingText("");
        java.lang.String str27 = element21.attr("\n<#root <html> <head></head> <body></body> </html>></#root <html> <head></head> <body></body> </html>>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!  #document" + "'", str16, "hi!  #document");
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueStarting("#document", "hi!  #document");
        java.lang.Integer int12 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document13 = document1.normalise();
        java.lang.String str14 = document13.title();
        org.jsoup.nodes.Element element16 = document13.html("<#root>\n #root\n <html>\n  <head></head>\n  <body>\n   &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n  </body>\n </html>\n</#root>");
        org.jsoup.select.Elements elements18 = document13.getElementsContainingOwnText("<html>\n <head></head>\n <body></body>\n</html><#root></#root>");
        org.jsoup.select.Elements elements20 = document13.getElementsContainingOwnText("<html>\n <head></head>\n <body>\n  #documenthi!\n </body>\n</html>");
        java.lang.String str21 = document13.outerHtml();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "&lt;#root&gt; #root \n<html> \n <head></head> \n <body>\n   &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;   \n </body>\n</html>" + "'", str21, "&lt;#root&gt; #root \n<html> \n <head></head> \n <body>\n   &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;   \n </body>\n</html>");
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("#document", "hi!");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document1.outputSettings();
        org.jsoup.nodes.Element element11 = document1.append("<html><head></head><body></body></html>&lt;#root&gt;&lt;/#root&gt;hi!");
        org.jsoup.nodes.Element element13 = document1.addClass("");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.outputSettings();
        document1.title("hi!  #document");
        java.lang.String str6 = document1.title();
        org.jsoup.nodes.Element element8 = document1.toggleClass("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Attributes attributes9 = element8.attributes();
        java.lang.String str10 = element8.baseUri();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!  #document" + "'", str6, "hi!  #document");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueStarting("#document", "hi!  #document");
        java.lang.Integer int12 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document13 = document1.normalise();
        org.jsoup.nodes.Element element15 = document13.appendElement("hi!");
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet18 = document17.classNames();
        boolean boolean19 = document17.isBlock();
        java.lang.Integer int20 = document17.elementSiblingIndex();
        java.lang.String str22 = document17.attr("hi!");
        java.lang.Integer int23 = document17.elementSiblingIndex();
        org.jsoup.select.Elements elements26 = document17.getElementsByAttributeValueEnding("<#root></#root>", "<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements28 = document17.getElementsMatchingText("");
        org.jsoup.nodes.Document document30 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element31 = document30.head();
        java.lang.String str32 = document30.outerHtml();
        java.lang.Integer int33 = document30.siblingIndex();
        java.lang.String str34 = document30.data();
        org.jsoup.nodes.Document document36 = org.jsoup.nodes.Document.createShell("#document");
        java.util.Set<java.lang.String> strSet37 = document36.classNames();
        org.jsoup.nodes.Element element38 = document30.classNames(strSet37);
        org.jsoup.nodes.Element element39 = document17.classNames(strSet37);
        org.jsoup.nodes.Element element40 = document13.classNames(strSet37);
        org.jsoup.nodes.Document document42 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element43 = document42.head();
        java.lang.String str44 = document42.outerHtml();
        java.lang.Integer int45 = document42.elementSiblingIndex();
        java.lang.String str46 = document42.nodeName();
        org.jsoup.nodes.Document document48 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray52 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet53 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet53, strArray52);
        org.jsoup.nodes.Element element55 = document48.classNames((java.util.Set<java.lang.String>) strSet53);
        org.jsoup.nodes.Element element56 = document42.classNames((java.util.Set<java.lang.String>) strSet53);
        java.lang.String str57 = document42.className();
        org.jsoup.nodes.Document document58 = document42.ownerDocument();
        org.jsoup.nodes.Element element60 = document42.prepend("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = document42.outputSettings();
        org.jsoup.nodes.Document document62 = document42.normalise();
        java.lang.String str63 = document42.title();
        // The following exception was thrown during execution in test generation
        try {
            element40.replaceWith((org.jsoup.nodes.Node) document42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNull(element43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "#document" + "'", str46, "#document");
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!  #document" + "'", str57, "hi!  #document");
        org.junit.Assert.assertNotNull(document58);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertNotNull(outputSettings61);
        org.junit.Assert.assertNotNull(document62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.jsoup.nodes.Element element14 = document7.classNames((java.util.Set<java.lang.String>) strSet12);
        org.jsoup.nodes.Element element15 = document1.classNames((java.util.Set<java.lang.String>) strSet12);
        java.lang.String str16 = document1.className();
        org.jsoup.nodes.Document document17 = document1.ownerDocument();
        org.jsoup.nodes.Element element18 = document1.head();
        java.lang.String str19 = document1.nodeName();
        org.jsoup.nodes.Element element21 = document1.appendElement("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements24 = document1.getElementsByAttributeValueStarting(" #document", "hi!#root");
        org.jsoup.nodes.Element element26 = document1.html("<html>\n <head></head>\n <body>\n  #document\n </body>\n</html>");
        boolean boolean28 = document1.hasAttr("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; #document &lt;/body&gt; &lt;/html&gt;#root\n<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element30 = document1.before(" hi!#root");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!  #document" + "'", str16, "hi!  #document");
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#document" + "'", str19, "#document");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element7 = document1.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.select.Elements elements9 = document1.getElementsByClass("#document");
        java.lang.String str10 = document1.title();
        org.jsoup.nodes.Element element12 = document1.createElement("\n<head></head>");
        org.jsoup.nodes.Element element14 = document1.createElement("<html> <head></head> <body></body> </html>");
        boolean boolean16 = document1.hasAttr("<html>\n <head>\n  <title> hi!</title>\n </head>\n <body>\n  #document\n </body>\n</html>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element7 = document1.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element9 = document6.text("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str10 = document6.nodeName();
        org.jsoup.nodes.Element element12 = document6.prependText("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element14 = document6.getElementById("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = element14.removeClass("<html>\n <head></head>\n <body>\n  #document\n </body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document" + "'", str10, "#document");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.jsoup.nodes.Element element14 = document7.classNames((java.util.Set<java.lang.String>) strSet12);
        org.jsoup.nodes.Element element15 = document1.classNames((java.util.Set<java.lang.String>) strSet12);
        java.lang.String str16 = document1.className();
        org.jsoup.nodes.Document document17 = document1.ownerDocument();
        org.jsoup.nodes.Element element19 = document1.prepend("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element21 = element19.val("#root");
        boolean boolean23 = element21.hasClass("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements25 = element21.getElementsContainingText("");
        org.jsoup.select.Elements elements27 = element21.getElementsByClass("<#root>\n #root\n <html>\n  <head></head>\n  <body>\n   &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n  </body>\n </html>\n</#root>");
        java.lang.Integer int28 = element21.siblingIndex();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!  #document" + "'", str16, "hi!  #document");
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        org.jsoup.nodes.Element element9 = element5.removeClass("");
        org.jsoup.nodes.Element element11 = element5.appendElement("#root");
        org.jsoup.nodes.Element element13 = element11.prependText("");
        org.jsoup.nodes.Element element15 = element13.after("hi!");
        org.jsoup.nodes.Element element17 = element13.prependElement("hi! #document<#root>\n #document<hi!></hi!>\n</#root>");
        org.jsoup.nodes.Element element19 = element13.before("#root");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        boolean boolean9 = element7.hasAttr("hi!  #document");
        java.lang.String str10 = element7.tagName();
        org.jsoup.select.Elements elements12 = element7.getElementsByClass("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.regex.Pattern pattern14 = null;
        org.jsoup.select.Elements elements15 = element7.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body></body>\n</html>", pattern14);
        org.jsoup.select.Elements elements18 = element7.getElementsByAttributeValueNot("<#root hi!  #document=\"#document\"></#root>", "hi!#root");
        org.jsoup.select.Elements elements20 = element7.getElementsByTag("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements22 = element7.getElementsMatchingOwnText("hi!#root\n<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueStarting("#document", "hi!  #document");
        org.jsoup.nodes.Document document12 = document1.normalise();
        java.util.Set<java.lang.String> strSet13 = document1.classNames();
        org.jsoup.nodes.Element element14 = document1.body();
        org.jsoup.nodes.Element element16 = element14.before("hi!#root\n<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements18 = element16.select("<html>\n <head></head>\n <body>\n  #documenthi!\n </body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<html>? <head></head>? <body>?  #documenthi!? </body>?</html>': unexpected token at '<html>? <head></head>? <body>?  #documenthi!? </body>?</html>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        document1.setBaseUri("");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.html("");
        java.lang.String str14 = element13.className();
        org.jsoup.nodes.Element element15 = element13.empty();
        java.lang.String str16 = element15.className();
        org.jsoup.nodes.Node node17 = element15.nextSibling();
        java.lang.String str18 = element15.className();
        org.jsoup.select.Elements elements19 = element15.getAllElements();
        org.jsoup.nodes.Element element20 = document1.prependChild((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Element element23 = element20.appendChild((org.jsoup.nodes.Node) document22);
        org.jsoup.nodes.Node node24 = document22.nextSibling();
        org.jsoup.select.Elements elements26 = document22.getElementsByIndexEquals((int) 'a');
        java.lang.Integer int27 = document22.siblingIndex();
        java.util.Set<java.lang.String> strSet28 = document22.classNames();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(strSet28);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        boolean boolean3 = document1.isBlock();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str6 = document1.attr("hi!");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueNot("#root <html> <head></head> <body></body> </html>", "<html>\n <head></head>\n <body>\n </body>\n</html><<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>");
        org.jsoup.select.Elements elements11 = document1.getElementsContainingOwnText("hi!  #document");
        java.lang.String str12 = document1.outerHtml();
        org.jsoup.nodes.Element element14 = document1.text("hi! #document<#root>\n #document<hi!></hi!>\n</#root>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str12, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = document1.outputSettings();
        java.util.regex.Pattern pattern7 = null;
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueMatching("#root", pattern7);
        java.lang.Integer int9 = document1.siblingIndex();
        java.lang.String str10 = document1.data();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Node node5 = document1.nextSibling();
        java.lang.String str6 = document1.data();
        java.lang.String str7 = document1.title();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.select.Elements elements6 = element3.getElementsByIndexLessThan((int) (short) 10);
        java.lang.String str7 = element3.data();
        org.jsoup.nodes.Element element9 = element3.append("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.html("");
        java.lang.String str14 = element13.className();
        org.jsoup.nodes.Element element15 = element13.empty();
        boolean boolean17 = element15.hasClass("");
        java.lang.String str18 = element15.html();
        java.lang.String str19 = element15.text();
        org.jsoup.select.Elements elements22 = element15.getElementsByAttributeValueMatching("hi!", "hi!  #document");
        org.jsoup.select.Elements elements24 = element15.getElementsContainingOwnText("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element25 = element3.appendChild((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Element element27 = element3.removeClass("\n<head></head>");
        boolean boolean28 = element27.hasText();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element6 = document1.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = element6.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.html("#document");
        org.jsoup.select.Elements elements7 = element5.getElementsByAttributeStarting("#document");
        org.jsoup.nodes.Element element9 = element5.prependText("#document");
        org.jsoup.nodes.Element element11 = element9.getElementById("#root");
        org.jsoup.select.Elements elements13 = element9.getElementsByTag("#document");
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str16 = document15.val();
        java.lang.String[] strArray27 = new java.lang.String[] { "<#root></#root>", "<#root></#root>", "<#root hi!  #document=\"#document\"></#root>", "#document", "<#root hi!  #document=\"#document\"></#root>", "<#root hi!  #document=\"#document\"></#root>", "#document", "#root", "hi!  #document", "<html>\n <head></head>\n <body></body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        org.jsoup.nodes.Element element30 = document15.classNames((java.util.Set<java.lang.String>) strSet28);
        org.jsoup.nodes.Element element31 = element9.classNames((java.util.Set<java.lang.String>) strSet28);
        org.jsoup.select.Elements elements34 = element9.getElementsByAttributeValueMatching("body", "<#root>\n #root\n <html>\n  <head></head>\n  <body>\n   &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n  </body>\n </html>\n</#root>");
        org.jsoup.nodes.Document document36 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element38 = document36.html("");
        java.lang.String str39 = element38.className();
        org.jsoup.nodes.Element element40 = element38.empty();
        org.jsoup.select.Elements elements42 = element38.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element44 = element38.html("hi!");
        org.jsoup.nodes.Element element46 = element38.appendText("#root");
        org.jsoup.nodes.Element element47 = element9.prependChild((org.jsoup.nodes.Node) element46);
        org.jsoup.nodes.Element element48 = element46.lastElementSibling();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "<#root></#root>", "<#root></#root>", "<#root hi!  #document=\"#document\"></#root>", "#document", "<#root hi!  #document=\"#document\"></#root>", "<#root hi!  #document=\"#document\"></#root>", "#document", "#root", "hi!  #document", "<html>\n <head></head>\n <body></body>\n</html>" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNull(element48);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.new OutputSettings();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element7 = document5.html("");
        org.jsoup.nodes.Element element9 = element7.removeClass("#document");
        org.jsoup.nodes.Element element10 = document1.prependChild((org.jsoup.nodes.Node) element7);
        java.util.Set<java.lang.String> strSet11 = element7.classNames();
        java.lang.String str13 = element7.absUrl("hi!#root");
        java.lang.String str14 = element7.ownText();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document1.addClass("#document");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element9 = element7.html("hi!#root\n<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html>");
        java.util.regex.Pattern pattern11 = null;
        org.jsoup.select.Elements elements12 = element7.getElementsByAttributeValueMatching("hi! #document<#root>\n #document<hi!></hi!>\n</#root>", pattern11);
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.removeClass("#document");
        org.jsoup.select.Elements elements7 = element3.getElementsMatchingText("hi!  #document");
        org.jsoup.nodes.Element element9 = element3.prependText("");
        org.jsoup.select.Elements elements11 = element9.getElementsByAttribute("<html> <head></head> <body></body> </html>");
        org.jsoup.select.Elements elements12 = element9.getAllElements();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        java.lang.Integer int5 = document1.siblingIndex();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueNot("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>", "hi!  #document");
        document1.title("<hi!  #document></hi!  #document>");
        boolean boolean12 = document1.hasClass("<html> <head></head> <body></body> </html> <#root></#root>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings8.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings8.indentAmount(10);
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str14 = document13.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = document13.outputSettings();
        boolean boolean16 = outputSettings15.prettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder17 = outputSettings15.encoder();
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements22 = document19.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Node node23 = document19.nextSibling();
        java.lang.String str24 = document19.html();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = document19.outputSettings();
        org.jsoup.nodes.Document document27 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element28 = document27.head();
        java.lang.String str29 = document27.outerHtml();
        java.lang.Integer int30 = document27.elementSiblingIndex();
        java.lang.String str31 = document27.nodeName();
        org.jsoup.nodes.Element element33 = document27.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = document27.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings34.indentAmount(10);
        org.jsoup.nodes.Entities.EscapeMode escapeMode37 = outputSettings36.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings25.escapeMode(escapeMode37);
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings15.escapeMode(escapeMode37);
        org.jsoup.nodes.Document document41 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element42 = document41.head();
        java.lang.String str43 = document41.outerHtml();
        java.lang.Integer int44 = document41.elementSiblingIndex();
        java.lang.String str45 = document41.nodeName();
        org.jsoup.nodes.Element element47 = document41.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = document41.outputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode49 = outputSettings48.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings39.escapeMode(escapeMode49);
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings11.escapeMode(escapeMode49);
        java.nio.charset.Charset charset52 = outputSettings11.charset();
        java.nio.charset.CharsetEncoder charsetEncoder53 = outputSettings11.encoder();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#document" + "'", str14, "#document");
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(charsetEncoder17);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#document" + "'", str31, "#document");
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertTrue("'" + escapeMode37 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode37.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertNull(element42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "#document" + "'", str45, "#document");
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertTrue("'" + escapeMode49 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode49.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertNotNull(outputSettings51);
        org.junit.Assert.assertNotNull(charset52);
        org.junit.Assert.assertNotNull(charsetEncoder53);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueStarting("#document", "hi!  #document");
        boolean boolean13 = document1.hasClass("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.Set<java.lang.String> strSet14 = document1.classNames();
        org.jsoup.nodes.Document document15 = document1.normalise();
        org.jsoup.nodes.Element element16 = document1.empty();
        org.jsoup.nodes.Element element18 = document1.prepend("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element19 = document1.parent();
        org.jsoup.nodes.Element element21 = document1.createElement("hi!");
        org.jsoup.select.Elements elements24 = document1.getElementsByAttributeValueStarting("&lt;&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&gt;&lt;/&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&gt;", " hi!#root");
        java.lang.String str25 = document1.ownText();
        org.jsoup.select.Elements elements26 = document1.parents();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(elements26);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependElement("hi!");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element14 = document12.html("");
        java.lang.String str15 = element14.className();
        org.jsoup.nodes.Element element16 = element14.empty();
        boolean boolean18 = element16.hasClass("");
        java.lang.String str19 = element16.html();
        java.lang.String str20 = element16.text();
        boolean boolean21 = element10.equals((java.lang.Object) str20);
        org.jsoup.select.Elements elements24 = element10.getElementsByAttributeValueNot("#document", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element27 = document26.head();
        java.lang.String str28 = document26.outerHtml();
        java.lang.Integer int29 = document26.siblingIndex();
        java.lang.String str30 = document26.outerHtml();
        org.jsoup.nodes.Element element31 = element10.appendChild((org.jsoup.nodes.Node) document26);
        java.lang.String str32 = element10.val();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNull(element27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!  #document");
        java.lang.String str2 = document1.title();
        org.jsoup.nodes.Element element4 = document1.appendText("<#root></#root>hi!");
        org.jsoup.parser.Tag tag5 = document1.tag();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(tag5);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.select.Elements elements6 = element3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.select.Elements elements8 = element3.getElementsContainingOwnText("#root");
        org.jsoup.nodes.Element element9 = element3.empty();
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.html("");
        java.lang.String str14 = element13.className();
        org.jsoup.nodes.Element element15 = element13.empty();
        org.jsoup.select.Elements elements17 = element13.getElementsByIndexLessThan((int) (short) 100);
        java.lang.String str18 = element13.className();
        org.jsoup.nodes.Element element21 = element13.attr("hi!  #document", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements23 = element13.getElementsContainingOwnText("#document");
        org.jsoup.select.Elements elements24 = element13.parents();
        org.jsoup.nodes.Element element26 = element13.val("#root");
        java.util.Set<java.lang.String> strSet27 = element26.classNames();
        org.jsoup.nodes.Element element28 = element3.classNames(strSet27);
        org.jsoup.nodes.Document document30 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element31 = document30.head();
        java.lang.String str32 = document30.outerHtml();
        java.lang.Integer int33 = document30.elementSiblingIndex();
        org.jsoup.nodes.Document document35 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element36 = document30.prependChild((org.jsoup.nodes.Node) document35);
        org.jsoup.nodes.Attributes attributes37 = document30.attributes();
        org.jsoup.nodes.Element element38 = element3.prependChild((org.jsoup.nodes.Node) document30);
        java.lang.String str39 = document30.baseUri();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        boolean boolean5 = element3.hasClass("#document");
        org.jsoup.select.Elements elements6 = element3.parents();
        org.jsoup.select.Elements elements9 = element3.getElementsByAttributeValueMatching("#document", "hi!");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.html("");
        java.lang.String str14 = element13.className();
        org.jsoup.nodes.Element element15 = element3.prependChild((org.jsoup.nodes.Node) element13);
        org.jsoup.nodes.Element element17 = element13.prependText("#document");
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element21 = document19.html("");
        org.jsoup.nodes.Element element23 = element21.appendText("hi!");
        java.lang.String str24 = element23.html();
        java.lang.String str25 = element23.text();
        org.jsoup.nodes.Element element26 = element13.appendChild((org.jsoup.nodes.Node) element23);
        org.jsoup.nodes.Element element28 = element26.toggleClass("hi!");
        org.jsoup.nodes.Document document30 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        org.jsoup.nodes.Element element37 = document30.classNames((java.util.Set<java.lang.String>) strSet35);
        org.jsoup.nodes.Element element38 = element28.classNames((java.util.Set<java.lang.String>) strSet35);
        java.lang.String str39 = element28.id();
        org.jsoup.nodes.Element element41 = element28.prepend("<#root>\n #root\n <html>\n  <head></head>\n  <body>\n   &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n  </body>\n </html>\n</#root>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(element41);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = document1.toString();
        java.lang.String str5 = document1.title();
        org.jsoup.nodes.Element element7 = document1.appendText("<#root hi! #document=\"#document\">");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Element element5 = document1.append("hi!  #document");
        java.lang.String str6 = document1.toString();
        java.lang.Integer int7 = document1.elementSiblingIndex();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! #document" + "'", str6, "hi! #document");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.Integer int4 = document1.siblingIndex();
        java.lang.String str5 = document1.ownText();
        java.lang.String str7 = document1.attr("<html> \n <head></head> \n <body> \n </body>\n</html>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependElement("hi!");
        org.jsoup.select.Elements elements11 = element3.parents();
        org.jsoup.nodes.Element element12 = element3.empty();
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element15 = document14.head();
        java.lang.String str16 = document14.outerHtml();
        java.lang.Integer int17 = document14.elementSiblingIndex();
        org.jsoup.nodes.Element element19 = document14.addClass("#document");
        java.util.Set<java.lang.String> strSet20 = element19.classNames();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = element19.dataset();
        org.jsoup.nodes.Element element22 = element19.parent();
        boolean boolean23 = element19.isBlock();
        java.util.Map<java.lang.String, java.lang.String> strMap24 = element19.dataset();
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element28 = document26.html("");
        java.lang.String str29 = element28.className();
        org.jsoup.nodes.Element element30 = element28.empty();
        org.jsoup.select.Elements elements32 = element28.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element34 = element28.html("hi!");
        org.jsoup.nodes.Element element36 = element34.addClass("hi!  #document");
        org.jsoup.nodes.Element element37 = element19.prependChild((org.jsoup.nodes.Node) element34);
        org.jsoup.nodes.Attributes attributes38 = element34.attributes();
        org.jsoup.nodes.Element element39 = element3.prependChild((org.jsoup.nodes.Node) element34);
        java.lang.String str41 = element3.attr("#documenthi!");
        org.jsoup.nodes.Element element43 = element3.prependElement("#document");
        java.lang.String str44 = element43.className();
        org.jsoup.nodes.Element element46 = element43.addClass("<html>\n <head>\n  <title> hi!</title>\n </head>\n <body>\n  #document\n </body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(element22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(element46);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.siblingIndex();
        java.lang.String str5 = document1.data();
        org.jsoup.nodes.Element element6 = document1.empty();
        boolean boolean8 = element6.hasClass("<#root hi!  #document=\"#document\"></#root>");
        org.jsoup.nodes.Element element10 = element6.append("<hi!  #document></hi!  #document>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = element10.child((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.removeClass("");
        org.jsoup.nodes.Element element5 = element3.toggleClass("hi!");
        org.jsoup.nodes.Document document6 = element5.ownerDocument();
        org.jsoup.nodes.Element element8 = document6.toggleClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document6.outputSettings();
        java.nio.charset.CharsetEncoder charsetEncoder10 = outputSettings9.encoder();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(charsetEncoder10);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        document1.title("#root");
        org.jsoup.nodes.Document document7 = document1.ownerDocument();
        java.lang.String str8 = document7.className();
        java.lang.String str9 = document7.outerHtml();
        java.lang.String str10 = document7.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = document7.outputSettings();
        org.jsoup.nodes.Element element13 = document7.toggleClass("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element15 = document7.removeClass("<html> <head></head> <body></body> </html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document" + "'", str10, "#document");
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings8.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings8.indentAmount(10);
        boolean boolean12 = outputSettings8.prettyPrint();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Element element8 = element5.removeClass("hi!");
        org.jsoup.nodes.Element element10 = element8.appendText("hi!");
        org.jsoup.select.Elements elements12 = element8.getElementsContainingOwnText("hi!  #document");
        org.jsoup.nodes.Node node14 = element8.removeAttr("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = element8.dataset();
        org.jsoup.select.Elements elements17 = element8.getElementsContainingText("hi!  #document");
        org.jsoup.select.Elements elements19 = element8.getElementsMatchingText("#root #document");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        boolean boolean7 = element5.hasClass("");
        java.lang.String str8 = element5.html();
        java.lang.String str9 = element5.text();
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.html("");
        java.lang.String str14 = element13.className();
        org.jsoup.nodes.Element element15 = element13.empty();
        boolean boolean17 = element15.hasClass("");
        java.lang.String str18 = element15.html();
        java.lang.String str19 = element15.text();
        org.jsoup.select.Elements elements22 = element15.getElementsByAttributeValueMatching("hi!", "hi!  #document");
        org.jsoup.select.Elements elements25 = element15.getElementsByAttributeValue("hi!", "#document");
        org.jsoup.nodes.Element element27 = element15.appendElement("hi!  #document");
        org.jsoup.nodes.Element element28 = element5.appendChild((org.jsoup.nodes.Node) element27);
        org.jsoup.nodes.Document document29 = element27.ownerDocument();
        java.lang.String str31 = element27.attr("#root");
        java.lang.Integer int32 = element27.siblingIndex();
        org.jsoup.nodes.Document document34 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element36 = document34.html("");
        org.jsoup.select.Elements elements38 = document34.getElementsContainingText("");
        org.jsoup.nodes.Element element40 = document34.prependText("hi!");
        document34.setBaseUri("");
        org.jsoup.nodes.Document document44 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element46 = document44.html("");
        java.lang.String str47 = element46.className();
        org.jsoup.nodes.Element element48 = element46.empty();
        java.lang.String str49 = element48.className();
        org.jsoup.nodes.Node node50 = element48.nextSibling();
        java.lang.String str51 = element48.className();
        org.jsoup.select.Elements elements52 = element48.getAllElements();
        org.jsoup.nodes.Element element53 = document34.prependChild((org.jsoup.nodes.Node) element48);
        org.jsoup.nodes.Document document55 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Element element56 = element53.appendChild((org.jsoup.nodes.Node) document55);
        org.jsoup.nodes.Node node57 = document55.nextSibling();
        java.lang.String str58 = document55.className();
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = document55.new OutputSettings();
        org.jsoup.nodes.Element element61 = document55.removeClass("");
        org.jsoup.nodes.Element element62 = element61.empty();
        boolean boolean64 = element62.hasAttr("");
        org.jsoup.nodes.Element element66 = element62.html("#root #document");
        element27.replaceWith((org.jsoup.nodes.Node) element62);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(elements52);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(document55);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNotNull(element62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(element66);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        boolean boolean5 = element3.hasClass("#document");
        org.jsoup.select.Elements elements6 = element3.parents();
        java.lang.String str7 = element3.toString();
        java.util.regex.Pattern pattern9 = null;
        org.jsoup.select.Elements elements10 = element3.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body></body>\n</html>", pattern9);
        org.jsoup.nodes.Element element12 = element3.appendText("hi!  #document");
        java.lang.String str13 = element3.toString();
        org.jsoup.nodes.Element element16 = element3.attr("<html>\n <head></head>\n <body>\n  #document\n </body>\n</html>", "&lt;#root&gt; #root \n<html> \n <head></head> \n <body>\n   &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;   \n </body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! #document" + "'", str13, "hi! #document");
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.jsoup.nodes.Element element14 = document7.classNames((java.util.Set<java.lang.String>) strSet12);
        org.jsoup.nodes.Element element15 = document1.classNames((java.util.Set<java.lang.String>) strSet12);
        java.lang.String str16 = document1.className();
        java.lang.String str17 = document1.nodeName();
        document1.setBaseUri("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element21 = document1.after("\n<body></body>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!  #document" + "'", str16, "hi!  #document");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#document" + "'", str17, "#document");
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Element element7 = document1.attr("#root", "hi!  #document");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.new OutputSettings();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.charset("hi!#root\n<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!#root?<html>? <head></head>? <body>?  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;? </body>?</html>");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.html("hi!");
        java.lang.Integer int11 = element10.elementSiblingIndex();
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element14 = document13.head();
        java.lang.String str15 = document13.outerHtml();
        java.lang.Integer int16 = document13.elementSiblingIndex();
        java.lang.String str17 = document13.nodeName();
        org.jsoup.nodes.Element element19 = document13.removeClass("");
        boolean boolean21 = element19.hasAttr("hi!  #document");
        java.lang.String str22 = element19.tagName();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element25 = document24.head();
        java.lang.String str26 = document24.outerHtml();
        java.lang.Integer int27 = document24.elementSiblingIndex();
        org.jsoup.nodes.Element element29 = document24.addClass("#document");
        boolean boolean31 = element29.hasClass("hi!");
        org.jsoup.nodes.Document document33 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        org.jsoup.nodes.Element element40 = document33.classNames((java.util.Set<java.lang.String>) strSet38);
        org.jsoup.select.Elements elements43 = document33.getElementsByAttributeValueStarting("#document", "hi!  #document");
        org.jsoup.nodes.Document document44 = document33.normalise();
        org.jsoup.nodes.Document document46 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element48 = document46.html("");
        org.jsoup.nodes.Element element50 = element48.html("#document");
        org.jsoup.nodes.Document document52 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element54 = document52.html("");
        java.lang.String str55 = element54.className();
        org.jsoup.nodes.Element element56 = element54.empty();
        org.jsoup.select.Elements elements58 = element54.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element60 = element54.html("hi!");
        boolean boolean62 = element60.hasAttr("hi!");
        java.util.Set<java.lang.String> strSet63 = element60.classNames();
        org.jsoup.nodes.Element element64 = element50.classNames(strSet63);
        org.jsoup.nodes.Element element65 = document33.classNames(strSet63);
        org.jsoup.nodes.Element element66 = element29.classNames(strSet63);
        org.jsoup.nodes.Element element67 = element19.classNames(strSet63);
        org.jsoup.nodes.Element element68 = element10.prependChild((org.jsoup.nodes.Node) element19);
        org.jsoup.select.Elements elements71 = element19.getElementsByAttributeValueContaining("#documenthi!hi!", "<html> <head> <title>#root</title> </head> <body></body> </html>");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#document" + "'", str17, "#document");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#root" + "'", str22, "#root");
        org.junit.Assert.assertNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(elements58);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(strSet63);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertNotNull(element66);
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertNotNull(elements71);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!  #document", "#document");
        org.jsoup.nodes.Node node6 = element4.removeAttr("\n<head></head>");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#document");
        java.lang.String str2 = document1.title();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = document1.dataset();
        java.lang.String str5 = document1.attr("hi! #document");
        org.jsoup.nodes.Element element6 = document1.empty();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = document1.new OutputSettings();
        org.jsoup.nodes.Element element9 = document1.createElement("head");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element7 = document1.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element9 = document6.text("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str10 = element9.data();
        java.util.regex.Pattern pattern12 = null;
        org.jsoup.select.Elements elements13 = element9.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body></body>\n</html>", pattern12);
        java.lang.Integer int14 = element9.elementSiblingIndex();
        org.jsoup.nodes.Node node15 = element9.previousSibling();
        org.jsoup.nodes.Element element17 = element9.wrap(" hi!#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = element17.before("\n<body></body>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(element17);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document1.append("#document");
        java.lang.String str6 = element5.text();
        org.jsoup.nodes.Element element9 = element5.attr("hi!", "<#root hi!  #document=\"#document\"></#root>");
        org.jsoup.select.Elements elements11 = element5.getElementsContainingText("#root");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        document1.setBaseUri("");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.html("");
        java.lang.String str14 = element13.className();
        org.jsoup.nodes.Element element15 = element13.empty();
        java.lang.String str16 = element15.className();
        org.jsoup.nodes.Node node17 = element15.nextSibling();
        java.lang.String str18 = element15.className();
        org.jsoup.select.Elements elements19 = element15.getAllElements();
        org.jsoup.nodes.Element element20 = document1.prependChild((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Element element23 = element20.appendChild((org.jsoup.nodes.Node) document22);
        org.jsoup.select.Elements elements25 = document22.getElementsMatchingText("hi!");
        java.lang.String str26 = document22.id();
        java.lang.String str27 = document22.outerHtml();
        org.jsoup.nodes.Attributes attributes28 = document22.attributes();
        org.jsoup.nodes.Element element30 = document22.appendElement("#documenthi!");
        org.jsoup.nodes.Document document32 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element34 = document32.html("");
        java.lang.String str35 = element34.className();
        org.jsoup.nodes.Element element36 = element34.empty();
        java.lang.String str37 = element36.className();
        java.lang.String str39 = element36.absUrl("#document");
        org.jsoup.nodes.Element element41 = element36.val("hi!  #document");
        org.jsoup.nodes.Element element42 = element30.prependChild((org.jsoup.nodes.Node) element41);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str27, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element42);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document1.append("#document");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = document1.childNodes();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element9 = document8.head();
        java.lang.String str10 = document8.outerHtml();
        java.lang.Integer int11 = document8.siblingIndex();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = document8.outputSettings();
        java.lang.String str13 = document8.title();
        org.jsoup.select.Elements elements14 = document8.getAllElements();
        boolean boolean15 = document1.equals((java.lang.Object) elements14);
        document1.title("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = document1.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = document1.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings19.indentAmount((int) (byte) 100);
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = outputSettings19.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings19.indentAmount((int) (short) 1);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings24);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element6 = document5.head();
        java.lang.String str7 = document5.outerHtml();
        java.lang.Integer int8 = document5.elementSiblingIndex();
        java.lang.String str9 = document5.nodeName();
        org.jsoup.nodes.Element element11 = document5.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = document5.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings12.indentAmount(10);
        boolean boolean15 = document1.equals((java.lang.Object) outputSettings14);
        java.lang.String str16 = document1.tagName();
        org.jsoup.nodes.Element element17 = document1.head();
        org.jsoup.select.Elements elements19 = document1.getElementsByTag("<<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>></<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
        org.junit.Assert.assertNull(element17);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        boolean boolean3 = document1.isBlock();
        boolean boolean4 = document1.hasText();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        boolean boolean5 = element3.hasClass("#document");
        org.jsoup.select.Elements elements6 = element3.parents();
        org.jsoup.select.Elements elements9 = element3.getElementsByAttributeValueMatching("#document", "hi!");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.html("");
        java.lang.String str14 = element13.className();
        org.jsoup.nodes.Element element15 = element3.prependChild((org.jsoup.nodes.Node) element13);
        org.jsoup.nodes.Element element17 = element13.prependText("#document");
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element21 = document19.html("");
        boolean boolean23 = element21.hasClass("#document");
        org.jsoup.select.Elements elements24 = element21.parents();
        org.jsoup.select.Elements elements27 = element21.getElementsByAttributeValueMatching("#document", "hi!");
        org.jsoup.nodes.Document document29 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element31 = document29.html("");
        java.lang.String str32 = element31.className();
        org.jsoup.nodes.Element element33 = element21.prependChild((org.jsoup.nodes.Node) element31);
        org.jsoup.nodes.Element element34 = element31.previousElementSibling();
        org.jsoup.nodes.Element element36 = element31.toggleClass("hi!  #document");
        element17.replaceWith((org.jsoup.nodes.Node) element31);
        java.lang.String str38 = element31.html();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNull(element34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("#document", "hi!");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element9 = document1.head();
        org.jsoup.nodes.Element element11 = element9.after("<#root></#root>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.siblingIndex();
        java.lang.String str5 = document1.data();
        org.jsoup.nodes.Element element6 = document1.empty();
        boolean boolean8 = element6.hasClass("<#root hi!  #document=\"#document\"></#root>");
        org.jsoup.select.Elements elements10 = element6.getElementsByIndexLessThan((int) '4');
        org.jsoup.nodes.Element element12 = element6.removeClass("hi!");
        org.jsoup.select.Elements elements14 = element6.getElementsByAttributeStarting("#document<#root>\n hi!\n</#root>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element7 = document1.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element9 = document6.text("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str10 = document6.nodeName();
        org.jsoup.nodes.Element element12 = document6.prependText("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = document6.new OutputSettings();
        boolean boolean14 = outputSettings13.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings13.indentAmount((int) (short) 0);
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document" + "'", str10, "#document");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(outputSettings16);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttribute("hi!  #document");
        document1.setBaseUri("");
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element15 = document14.head();
        java.lang.String str16 = document14.outerHtml();
        java.lang.Integer int17 = document14.elementSiblingIndex();
        java.lang.String str18 = document14.nodeName();
        org.jsoup.nodes.Element element20 = document14.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = document14.outputSettings();
        org.jsoup.select.Elements elements23 = document14.getElementsByAttribute("hi!  #document");
        document14.setBaseUri("");
        org.jsoup.nodes.Element element26 = document1.prependChild((org.jsoup.nodes.Node) document14);
        org.jsoup.select.Elements elements28 = document14.getElementsByIndexGreaterThan((int) '4');
        java.lang.String str30 = document14.attr("hi!");
        org.jsoup.select.Elements elements31 = document14.getAllElements();
        java.lang.String str32 = document14.ownText();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#document" + "'", str18, "#document");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element9 = element3.empty();
        java.lang.String str11 = element3.absUrl("#document");
        org.jsoup.nodes.Document document12 = element3.ownerDocument();
        java.lang.String str13 = document12.title();
        org.jsoup.nodes.Element element15 = document12.prependElement("#document hi! #document");
        java.util.Set<java.lang.String> strSet16 = element15.classNames();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttribute("hi!  #document");
        document1.setBaseUri("");
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element15 = document14.head();
        java.lang.String str16 = document14.outerHtml();
        java.lang.Integer int17 = document14.elementSiblingIndex();
        java.lang.String str18 = document14.nodeName();
        org.jsoup.nodes.Element element20 = document14.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = document14.outputSettings();
        org.jsoup.select.Elements elements23 = document14.getElementsByAttribute("hi!  #document");
        document14.setBaseUri("");
        org.jsoup.nodes.Element element26 = document1.prependChild((org.jsoup.nodes.Node) document14);
        org.jsoup.nodes.Element element28 = document14.getElementById("hi!");
        java.lang.String str29 = document14.title();
        org.jsoup.select.Elements elements31 = document14.getElementsByAttributeStarting("<hi!></hi!>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#document" + "'", str18, "#document");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(elements31);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.html("hi!");
        java.lang.String str10 = element3.toString();
        java.lang.String str12 = element3.absUrl("<html> \n <head></head> \n <body> \n </body>\n</html>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.removeClass("#document");
        java.lang.Integer int6 = element5.elementSiblingIndex();
        org.jsoup.nodes.Element element8 = element5.val("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        java.lang.String str8 = element3.className();
        org.jsoup.nodes.Element element11 = element3.attr("hi!  #document", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements13 = element3.getElementsByIndexLessThan(100);
        org.jsoup.nodes.Element element14 = element3.empty();
        org.jsoup.nodes.Element element16 = element14.appendText("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element18 = element16.prependText("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element19 = element18.parent();
        java.lang.String str20 = element18.tagName();
        org.jsoup.nodes.Element element23 = element18.attr("hi!#root", "\n<<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#root" + "'", str20, "#root");
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        org.jsoup.nodes.Element element3 = document1.parent();
        java.lang.String str4 = document1.nodeName();
        java.lang.String str5 = document1.nodeName();
        java.lang.String str6 = document1.id();
        org.jsoup.nodes.Element element9 = document1.attr("<html>\n <head></head>\n <body></body>\n</html><<html>\n <head></head>\n <body>\n </body>\n</html><<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>></<html>\n <head></head>\n <body>\n </body>\n</html><<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>>", "<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = element9.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Element element8 = element5.removeClass("hi!");
        org.jsoup.nodes.Element element10 = element8.appendText("hi!");
        org.jsoup.select.Elements elements13 = element8.getElementsByAttributeValueEnding("#root", "hi!  #document");
        org.jsoup.nodes.Element element15 = element8.removeClass("hi! #document<#root>\n #document<hi!></hi!>\n</#root>");
        element8.setBaseUri("<html><head></head><body></body></html>&lt;#root&gt;&lt;/#root&gt;hi!");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.html("hi!");
        org.jsoup.select.Elements elements11 = element8.parents();
        org.jsoup.select.Elements elements13 = element8.getElementsByClass("hi!  #document");
        boolean boolean14 = element8.isBlock();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<#root>\n <hi!  #document></hi!  #document>\n</#root>\n<html>\n <head></head>\n <body>\n  hi! #document\n </body>\n</html>");
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root class=\"\"></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element9 = element3.empty();
        org.jsoup.select.Elements elements11 = element3.getElementsContainingOwnText("#root");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.indentAmount(10);
        boolean boolean11 = outputSettings10.prettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder12 = outputSettings10.encoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings10.prettyPrint(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings14.escapeMode();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(charsetEncoder12);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        org.jsoup.nodes.Element element9 = document1.html("");
        org.jsoup.nodes.Document document10 = document1.normalise();
        org.jsoup.select.Elements elements12 = document1.getElementsMatchingText("<html>\n <head>\n  <title> hi!</title>\n </head>\n <body>\n  #document\n </body>\n</html>");
        java.lang.String str13 = document1.id();
        org.jsoup.nodes.Element element15 = document1.addClass("#document hi! #document");
        java.lang.String str16 = element15.id();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        org.jsoup.nodes.Element element9 = element5.removeClass("");
        org.jsoup.nodes.Element element11 = element5.appendElement("#root");
        java.lang.Integer int12 = element11.siblingIndex();
        java.lang.String str14 = element11.absUrl("<#root></#root>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        java.lang.String str8 = element3.className();
        org.jsoup.nodes.Element element11 = element3.attr("hi!  #document", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Node node12 = element11.nextSibling();
        boolean boolean13 = element11.isBlock();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        boolean boolean9 = outputSettings8.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = outputSettings8.escapeMode();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.appendText("hi!");
        java.lang.String str6 = element3.data();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element10 = document8.html("");
        java.lang.String str11 = element10.className();
        org.jsoup.nodes.Element element12 = element10.empty();
        java.lang.String str13 = element12.className();
        org.jsoup.nodes.Node node14 = element12.nextSibling();
        java.lang.String str15 = element12.className();
        org.jsoup.parser.Tag tag16 = element12.tag();
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element19 = document18.head();
        org.jsoup.nodes.Element element20 = element12.prependChild((org.jsoup.nodes.Node) document18);
        boolean boolean21 = element3.equals((java.lang.Object) element12);
        java.util.Set<java.lang.String> strSet22 = element3.classNames();
        org.jsoup.select.Elements elements23 = element3.getAllElements();
        org.jsoup.nodes.Element element25 = element3.prependText("#document");
        org.jsoup.nodes.Element element27 = element25.prepend("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements30 = element27.getElementsByAttributeValueStarting("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>", "<#root class=\"\"></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = element27.childNodes();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(nodeList31);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.nodes.Document document3 = document1.normalise();
        document3.title("hi!  #document");
        document3.title("<html> <head></head> <body></body> </html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(document3);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        boolean boolean5 = element3.hasClass("#document");
        org.jsoup.select.Elements elements6 = element3.parents();
        org.jsoup.select.Elements elements9 = element3.getElementsByAttributeValueMatching("#document", "hi!");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.html("");
        java.lang.String str14 = element13.className();
        org.jsoup.nodes.Element element15 = element3.prependChild((org.jsoup.nodes.Node) element13);
        org.jsoup.select.Elements elements18 = element13.getElementsByAttributeValueContaining("#root", "#root");
        org.jsoup.parser.Tag tag19 = element13.tag();
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element22 = document21.head();
        java.lang.String str23 = document21.outerHtml();
        java.lang.Integer int24 = document21.elementSiblingIndex();
        java.lang.String str25 = document21.nodeName();
        org.jsoup.select.Elements elements28 = document21.getElementsByAttributeValueNot("hi!  #document", "hi!");
        boolean boolean29 = element13.equals((java.lang.Object) elements28);
        org.jsoup.nodes.Element element31 = element13.removeClass("hi! #document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = element13.childNode(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#document" + "'", str25, "#document");
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(element31);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        boolean boolean3 = document1.isBlock();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str6 = document1.attr("hi!");
        java.lang.Integer int7 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element9 = document1.wrap("hi!");
        org.jsoup.nodes.Document document10 = document1.normalise();
        java.lang.String str11 = document10.id();
        org.jsoup.nodes.Element element13 = document10.removeClass("hi!");
        org.jsoup.nodes.Element element14 = document10.body();
        org.jsoup.select.Elements elements16 = element14.select("body");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueNot("hi!  #document", "hi!");
        org.jsoup.select.Elements elements10 = document1.getElementsByTag("hi!");
        org.jsoup.nodes.Element element12 = document1.append("#root");
        org.jsoup.nodes.Element element15 = document1.attr("hi!", "#root");
        java.lang.Integer int16 = document1.siblingIndex();
        org.jsoup.nodes.Document document17 = document1.normalise();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(document17);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Document document3 = document1.ownerDocument();
        boolean boolean5 = document1.hasClass("<html>\n <head></head>\n <body>\n </body>\n</html><<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>");
        org.jsoup.nodes.Element element7 = document1.html("\n<#root <html> <head></head> <body></body> </html>></#root <html> <head></head> <body></body> </html>>");
        java.util.regex.Pattern pattern9 = null;
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueMatching("<html>\n <head>\n  <title> hi!</title>\n </head>\n <body>\n  #document\n </body>\n</html>", pattern9);
        boolean boolean11 = document1.hasText();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element9 = document7.html("");
        java.lang.String str10 = element9.className();
        org.jsoup.nodes.Element element11 = element9.empty();
        org.jsoup.select.Elements elements13 = element9.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element15 = element9.html("hi!");
        boolean boolean17 = element15.hasAttr("hi!");
        java.util.Set<java.lang.String> strSet18 = element15.classNames();
        org.jsoup.nodes.Element element19 = document1.appendChild((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Element element21 = document1.append("hi!  #document");
        org.jsoup.nodes.Element element22 = document1.body();
        org.jsoup.nodes.Element element24 = document1.createElement("<html>\n <head></head>\n <body>\n </body>\n</html><<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>");
        java.lang.String str25 = element24.data();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        java.lang.String str7 = element3.tagName();
        org.jsoup.select.Elements elements9 = element3.select("body");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#root" + "'", str7, "#root");
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.html("#document");
        boolean boolean7 = element3.hasAttr("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet10 = document9.classNames();
        boolean boolean11 = document9.isBlock();
        java.lang.Integer int12 = document9.elementSiblingIndex();
        java.lang.String str14 = document9.attr("hi!");
        java.lang.Integer int15 = document9.elementSiblingIndex();
        org.jsoup.select.Elements elements17 = document9.getElementsByIndexEquals((int) (byte) 0);
        org.jsoup.nodes.Element element18 = element3.appendChild((org.jsoup.nodes.Node) document9);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = document9.dataset();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!  #document");
        org.jsoup.nodes.Element element2 = document1.body();
        org.jsoup.nodes.Element element3 = document1.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements5 = element3.getElementsByIndexLessThan((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNull(element3);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueStarting("#document", "hi!  #document");
        boolean boolean13 = document1.hasClass("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element15 = document1.appendText("#root");
        org.jsoup.nodes.Element element17 = document1.appendElement("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Node node19 = document1.removeAttr("<#root></#root>hi!");
        boolean boolean20 = document1.hasText();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        boolean boolean9 = element7.hasAttr("hi!  #document");
        org.jsoup.nodes.Node node10 = element7.nextSibling();
        org.jsoup.select.Elements elements12 = element7.getElementsByTag("hi!");
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element16 = document14.html("");
        boolean boolean18 = element16.hasClass("#document");
        org.jsoup.select.Elements elements19 = element16.parents();
        org.jsoup.select.Elements elements22 = element16.getElementsByAttributeValueMatching("#document", "hi!");
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element26 = document24.html("");
        java.lang.String str27 = element26.className();
        org.jsoup.nodes.Element element28 = element16.prependChild((org.jsoup.nodes.Node) element26);
        org.jsoup.nodes.Element element29 = element7.prependChild((org.jsoup.nodes.Node) element28);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element31 = element7.before("hi!#root <html> <head></head> <body></body> </html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.parser.Tag tag6 = document1.tag();
        org.jsoup.nodes.Element element8 = document1.createElement("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements10 = document1.getElementsByClass("#document");
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = document1.outputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings11.escapeMode();
        java.nio.charset.Charset charset13 = outputSettings11.charset();
        java.nio.charset.CharsetEncoder charsetEncoder14 = outputSettings11.encoder();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element17 = document16.head();
        java.lang.String str18 = document16.outerHtml();
        java.lang.Integer int19 = document16.elementSiblingIndex();
        java.lang.String str20 = document16.nodeName();
        org.jsoup.nodes.Element element22 = document16.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = document16.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings23.indentAmount(10);
        boolean boolean26 = outputSettings25.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings25.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings28.indentAmount((int) 'a');
        org.jsoup.nodes.Document document32 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str33 = document32.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = document32.new OutputSettings();
        org.jsoup.nodes.Document document36 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element37 = document36.head();
        java.lang.String str38 = document36.outerHtml();
        java.lang.Integer int39 = document36.elementSiblingIndex();
        java.lang.String str40 = document36.nodeName();
        org.jsoup.nodes.Element element42 = document36.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = document36.outputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode44 = outputSettings43.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings34.escapeMode(escapeMode44);
        boolean boolean46 = outputSettings34.prettyPrint();
        java.nio.charset.Charset charset47 = outputSettings34.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings30.charset(charset47);
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings11.charset(charset47);
        org.jsoup.nodes.Entities.EscapeMode escapeMode50 = outputSettings11.escapeMode();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset13);
        org.junit.Assert.assertNotNull(charsetEncoder14);
        org.junit.Assert.assertNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#document" + "'", str20, "#document");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#document" + "'", str33, "#document");
        org.junit.Assert.assertNull(element37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "#document" + "'", str40, "#document");
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertTrue("'" + escapeMode44 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode44.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(charset47);
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertTrue("'" + escapeMode50 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode50.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!  #document");
        java.lang.String str2 = document1.title();
        org.jsoup.select.Elements elements4 = document1.getElementsContainingOwnText("<#root></#root>hi!");
        java.lang.String str5 = document1.data();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements10 = document7.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Node node11 = document7.nextSibling();
        java.lang.String str12 = document7.html();
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element16 = document14.html("");
        boolean boolean18 = element16.hasClass("#document");
        org.jsoup.select.Elements elements19 = element16.parents();
        org.jsoup.select.Elements elements22 = element16.getElementsByAttributeValueMatching("#document", "hi!");
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element26 = document24.html("");
        java.lang.String str27 = element26.className();
        org.jsoup.nodes.Element element28 = element16.prependChild((org.jsoup.nodes.Node) element26);
        org.jsoup.nodes.Element element30 = element26.prependText("#document");
        org.jsoup.nodes.Document document32 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element34 = document32.html("");
        boolean boolean36 = element34.hasClass("#document");
        org.jsoup.select.Elements elements37 = element34.parents();
        org.jsoup.select.Elements elements40 = element34.getElementsByAttributeValueMatching("#document", "hi!");
        org.jsoup.nodes.Document document42 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element44 = document42.html("");
        java.lang.String str45 = element44.className();
        org.jsoup.nodes.Element element46 = element34.prependChild((org.jsoup.nodes.Node) element44);
        org.jsoup.nodes.Element element47 = element44.previousElementSibling();
        org.jsoup.nodes.Element element49 = element44.toggleClass("hi!  #document");
        element30.replaceWith((org.jsoup.nodes.Node) element44);
        org.jsoup.nodes.Document document52 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements55 = document52.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.select.Elements elements57 = document52.getElementsMatchingText("");
        org.jsoup.nodes.Element element59 = document52.html("hi!  #document");
        org.jsoup.nodes.Document document61 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element63 = document61.html("");
        org.jsoup.nodes.Element element65 = element63.html("#document");
        org.jsoup.nodes.Element element67 = element65.appendElement("hi!");
        org.jsoup.nodes.Element element68 = document52.appendChild((org.jsoup.nodes.Node) element65);
        element44.replaceWith((org.jsoup.nodes.Node) element68);
        org.jsoup.nodes.Element element70 = document7.appendChild((org.jsoup.nodes.Node) element44);
        org.jsoup.nodes.Element element72 = document7.prependText("hi! #document");
        org.jsoup.select.Elements elements75 = element72.getElementsByAttributeValueMatching("body", "<hi!  #document></hi!  #document>");
        org.jsoup.nodes.Element element76 = document1.appendChild((org.jsoup.nodes.Node) element72);
        org.jsoup.select.Elements elements79 = document1.getElementsByAttributeValueNot("<#root> #root <html> <head></head> <body></body> </html>", "#document <head></head>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNull(element47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(elements55);
        org.junit.Assert.assertNotNull(elements57);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertNotNull(element70);
        org.junit.Assert.assertNotNull(element72);
        org.junit.Assert.assertNotNull(elements75);
        org.junit.Assert.assertNotNull(element76);
        org.junit.Assert.assertNotNull(elements79);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("#document", "hi!");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element9 = document1.head();
        org.jsoup.select.Elements elements11 = element9.getElementsByClass("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str12 = element9.text();
        org.jsoup.nodes.Element element14 = element9.prependElement("hi!#root");
        org.jsoup.nodes.Element element16 = element14.before("<hi!></hi!>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        document1.setBaseUri("");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.html("");
        java.lang.String str14 = element13.className();
        org.jsoup.nodes.Element element15 = element13.empty();
        java.lang.String str16 = element15.className();
        org.jsoup.nodes.Node node17 = element15.nextSibling();
        java.lang.String str18 = element15.className();
        org.jsoup.select.Elements elements19 = element15.getAllElements();
        org.jsoup.nodes.Element element20 = document1.prependChild((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Element element23 = element20.appendChild((org.jsoup.nodes.Node) document22);
        org.jsoup.select.Elements elements25 = document22.getElementsMatchingText("hi!");
        org.jsoup.select.Elements elements27 = document22.getElementsMatchingText("hi!#root");
        org.jsoup.nodes.Element element29 = document22.addClass("#document<#root>\n hi!\n</#root>");
        org.jsoup.nodes.Element element30 = document22.nextElementSibling();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNull(element30);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element7 = document1.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element9 = document6.text("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element11 = document6.prependText("#root");
        org.jsoup.nodes.Element element13 = document6.before("#document");
        org.jsoup.nodes.Element element15 = element13.toggleClass("<#root></#root>hi!");
        org.jsoup.select.Elements elements17 = element13.getElementsByIndexLessThan(0);
        org.jsoup.nodes.Element element19 = element13.prepend("<hi!  #document></hi!  #document>");
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element23 = document21.html("");
        java.lang.String str24 = element23.className();
        org.jsoup.nodes.Element element25 = element23.empty();
        java.lang.String str26 = element25.className();
        org.jsoup.nodes.Node node27 = element25.nextSibling();
        org.jsoup.nodes.Element element30 = element25.attr("hi!  #document", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element31 = element30.parent();
        java.lang.String str32 = element30.data();
        org.jsoup.nodes.Element element33 = element13.appendChild((org.jsoup.nodes.Node) element30);
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(element33);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.jsoup.nodes.Element element14 = document7.classNames((java.util.Set<java.lang.String>) strSet12);
        org.jsoup.nodes.Element element15 = document1.classNames((java.util.Set<java.lang.String>) strSet12);
        java.lang.String str16 = document1.className();
        org.jsoup.nodes.Element element17 = document1.empty();
        java.lang.String str18 = document1.ownText();
        org.jsoup.select.Elements elements21 = document1.getElementsByAttributeValueContaining("hi!", "hi!  #document");
        org.jsoup.nodes.Document document22 = document1.normalise();
        org.jsoup.nodes.Element element24 = document22.getElementById("<html>\n <head></head>\n <body>\n </body>\n</html><<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!  #document" + "'", str16, "hi!  #document");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNull(element24);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.jsoup.nodes.Element element14 = document7.classNames((java.util.Set<java.lang.String>) strSet12);
        org.jsoup.nodes.Element element15 = document1.classNames((java.util.Set<java.lang.String>) strSet12);
        java.lang.String str16 = document1.className();
        java.lang.String str17 = document1.nodeName();
        java.lang.String str18 = document1.val();
        org.jsoup.select.Elements elements19 = document1.parents();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!  #document" + "'", str16, "hi!  #document");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#document" + "'", str17, "#document");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        boolean boolean7 = element5.hasClass("");
        java.lang.String str8 = element5.html();
        java.lang.String str9 = element5.text();
        boolean boolean11 = element5.hasAttr("");
        java.lang.Object obj12 = null;
        boolean boolean13 = element5.equals(obj12);
        org.jsoup.nodes.Element element15 = element5.html("#root <html> <head></head> <body></body> </html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueStarting("#document", "hi!  #document");
        boolean boolean13 = document1.hasClass("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.Set<java.lang.String> strSet14 = document1.classNames();
        org.jsoup.nodes.Document document15 = document1.normalise();
        org.jsoup.nodes.Element element16 = document1.empty();
        org.jsoup.nodes.Element element18 = document1.prepend("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element20 = document1.toggleClass("<html> \n <head> \n  <title>#root</title> \n </head> \n <body> \n </body>\n</html>hi!");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document1.append("#document");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = document1.childNodes();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element9 = document8.head();
        java.lang.String str10 = document8.outerHtml();
        java.lang.Integer int11 = document8.siblingIndex();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = document8.outputSettings();
        java.lang.String str13 = document8.title();
        org.jsoup.select.Elements elements14 = document8.getAllElements();
        boolean boolean15 = document1.equals((java.lang.Object) elements14);
        document1.title("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element19 = document1.append(" #document");
        org.jsoup.select.Elements elements21 = document1.getElementsMatchingText("<html>\n <head></head>\n <body></body>\n</html><#document></#document>");
        org.jsoup.nodes.Element element23 = document1.text("#root <html> <head></head> <body></body> </html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        java.lang.String str8 = element5.className();
        org.jsoup.parser.Tag tag9 = element5.tag();
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element12 = document11.head();
        org.jsoup.nodes.Element element13 = element5.prependChild((org.jsoup.nodes.Node) document11);
        org.jsoup.nodes.Element element14 = document11.empty();
        java.lang.String str15 = document11.ownText();
        org.jsoup.nodes.Element element17 = document11.prependText(" hi!#root");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element6 = document5.head();
        java.lang.String str7 = document5.outerHtml();
        java.lang.Integer int8 = document5.elementSiblingIndex();
        java.lang.String str9 = document5.nodeName();
        org.jsoup.nodes.Element element11 = document5.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = document5.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings12.indentAmount(10);
        boolean boolean15 = document1.equals((java.lang.Object) outputSettings14);
        org.jsoup.nodes.Element element17 = document1.createElement("#document");
        org.jsoup.nodes.Element element19 = document1.val("");
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = document1.outputSettings();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(outputSettings20);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.wrap("hi!");
        org.jsoup.nodes.Element element4 = document1.body();
        boolean boolean6 = document1.hasClass("hi!");
        java.lang.String str7 = document1.data();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements12 = document9.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.select.Elements elements14 = document9.getElementsMatchingText("");
        org.jsoup.nodes.Element element16 = document9.html("hi!  #document");
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element20 = document18.html("");
        org.jsoup.nodes.Element element22 = element20.html("#document");
        org.jsoup.nodes.Element element24 = element22.appendElement("hi!");
        org.jsoup.nodes.Element element25 = document9.appendChild((org.jsoup.nodes.Node) element22);
        org.jsoup.nodes.Document document26 = element25.ownerDocument();
        org.jsoup.nodes.Element element28 = element25.removeClass("#document");
        boolean boolean29 = document1.equals((java.lang.Object) element28);
        java.lang.Integer int30 = document1.siblingIndex();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = document1.outputSettings();
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(outputSettings31);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        java.util.Set<java.lang.String> strSet3 = document1.classNames();
        org.jsoup.nodes.Element element5 = document1.val("hi!  #document");
        java.lang.String str6 = document1.outerHtml();
        java.lang.String str7 = document1.data();
        org.jsoup.nodes.Element element9 = document1.createElement("#root");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.html("");
        org.jsoup.select.Elements elements15 = document11.getElementsContainingText("");
        org.jsoup.nodes.Element element17 = document11.prependText("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = document11.outputSettings();
        org.jsoup.nodes.Element element19 = element9.appendChild((org.jsoup.nodes.Node) document11);
        org.jsoup.select.Elements elements22 = document11.getElementsByAttributeValueStarting("hi!  #document", "#document");
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = document11.new OutputSettings();
        org.jsoup.select.Elements elements26 = document11.getElementsByAttributeValueStarting("<html> \n <head> \n  <title>#root</title> \n </head> \n <body> \n </body>\n</html>hi!", "hi! #document<#root>\n #document<hi!></hi!>\n</#root>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements26);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Node node5 = document1.removeAttr("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements7 = document1.getElementsMatchingText("");
        org.jsoup.select.Elements elements9 = document1.getElementsByIndexGreaterThan((int) (short) 100);
        boolean boolean11 = document1.hasClass("");
        org.jsoup.nodes.Element element13 = document1.createElement("hi! #document<#root>\n #document<hi!></hi!>\n</#root>");
        org.jsoup.select.Elements elements16 = document1.getElementsByAttributeValueContaining("#document <head></head>", "\n<head></head>");
        boolean boolean17 = document1.hasText();
        java.lang.String str18 = document1.outerHtml();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element6 = document5.head();
        java.lang.String str7 = document5.outerHtml();
        java.lang.Integer int8 = document5.elementSiblingIndex();
        java.lang.String str9 = document5.nodeName();
        org.jsoup.nodes.Element element11 = document5.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = document5.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings12.indentAmount(10);
        boolean boolean15 = document1.equals((java.lang.Object) outputSettings14);
        org.jsoup.nodes.Element element17 = document1.addClass("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element19 = document1.prependElement("hi!");
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element23 = document21.html("");
        org.jsoup.select.Elements elements25 = document21.getElementsContainingText("");
        org.jsoup.nodes.Element element27 = document21.prependText("hi!");
        document21.setBaseUri("");
        org.jsoup.nodes.Document document31 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element33 = document31.html("");
        java.lang.String str34 = element33.className();
        org.jsoup.nodes.Element element35 = element33.empty();
        java.lang.String str36 = element35.className();
        org.jsoup.nodes.Node node37 = element35.nextSibling();
        java.lang.String str38 = element35.className();
        org.jsoup.select.Elements elements39 = element35.getAllElements();
        org.jsoup.nodes.Element element40 = document21.prependChild((org.jsoup.nodes.Node) element35);
        org.jsoup.nodes.Attributes attributes41 = document21.attributes();
        element19.replaceWith((org.jsoup.nodes.Node) document21);
        org.jsoup.nodes.Element element44 = element19.getElementById("<hi!  #document></hi!  #document>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertNull(element44);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        java.lang.String str8 = element5.className();
        org.jsoup.parser.Tag tag9 = element5.tag();
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element12 = document11.head();
        org.jsoup.nodes.Element element13 = element5.prependChild((org.jsoup.nodes.Node) document11);
        java.lang.Integer int14 = element5.siblingIndex();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str3 = document1.absUrl("#document");
        org.jsoup.nodes.Attributes attributes4 = document1.attributes();
        org.jsoup.select.Elements elements6 = document1.getElementsContainingText("head");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.append("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements6 = element3.getElementsByAttributeValueNot(" #document", "&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByIndexEquals((int) (short) 100);
        org.jsoup.nodes.Document document4 = document1.ownerDocument();
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body></body>\n</html><#document></#document>", "<html> <head> <title>#root</title> </head> <body></body> </html>");
        java.lang.String str8 = document1.outerHtml();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str8, "<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueStarting("#document", "hi!  #document");
        boolean boolean13 = document1.hasClass("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element15 = document1.appendText("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = document1.new OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings16.prettyPrint(true);
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element24 = document22.html("");
        org.jsoup.select.Elements elements26 = document22.getElementsContainingText("");
        org.jsoup.nodes.Element element28 = document22.prependText("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = document22.outputSettings();
        int int30 = outputSettings29.indentAmount();
        java.nio.charset.Charset charset31 = outputSettings29.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings20.charset(charset31);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(charset31);
        org.junit.Assert.assertNotNull(outputSettings32);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.removeClass("");
        org.jsoup.nodes.Element element5 = element3.toggleClass("hi!");
        org.jsoup.select.Elements elements7 = element3.getElementsByAttribute("hi!  #document");
        org.jsoup.nodes.Element element10 = element3.attr("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>", "<html> <head></head> <body></body> </html>");
        java.lang.String str11 = element3.id();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element6 = document5.head();
        java.lang.String str7 = document5.outerHtml();
        java.lang.Integer int8 = document5.elementSiblingIndex();
        java.lang.String str9 = document5.nodeName();
        org.jsoup.nodes.Element element11 = document5.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = document5.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings12.indentAmount(10);
        boolean boolean15 = document1.equals((java.lang.Object) outputSettings14);
        java.lang.String str16 = document1.nodeName();
        org.jsoup.nodes.Element element18 = document1.createElement("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element20 = element18.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet23 = document22.classNames();
        boolean boolean24 = document22.isBlock();
        java.lang.Integer int25 = document22.elementSiblingIndex();
        java.lang.String str27 = document22.attr("hi!");
        java.lang.Integer int28 = document22.elementSiblingIndex();
        org.jsoup.select.Elements elements31 = document22.getElementsByAttributeValueEnding("<#root></#root>", "<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements33 = document22.getElementsMatchingText("");
        org.jsoup.nodes.Document document35 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element36 = document35.head();
        java.lang.String str37 = document35.outerHtml();
        java.lang.Integer int38 = document35.siblingIndex();
        java.lang.String str39 = document35.data();
        org.jsoup.nodes.Document document41 = org.jsoup.nodes.Document.createShell("#document");
        java.util.Set<java.lang.String> strSet42 = document41.classNames();
        org.jsoup.nodes.Element element43 = document35.classNames(strSet42);
        org.jsoup.nodes.Element element44 = document22.classNames(strSet42);
        org.jsoup.nodes.Element element45 = element18.classNames(strSet42);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#document" + "'", str16, "#document");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNull(element36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element45);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!  #document");
        org.jsoup.nodes.Element element2 = document1.body();
        org.jsoup.select.Elements elements5 = document1.getElementsByAttributeValueContaining("<html> <head> <title>#root</title> </head> <body></body> </html>", "\n<body></body>");
        java.lang.String str6 = document1.val();
        org.jsoup.nodes.Element element7 = document1.body();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueNot("<html>\n <head></head>\n <body></body>\n</html><#root></#root>", "<html>\n <head></head>\n <body></body>\n</html><#root class=\"\"></#root>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<html>\n <head></head>\n <body>\n  #documenthi!\n </body>\n</html>");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("<html>\n <head>\n  <title> hi!</title>\n </head>\n <body>\n  #document\n </body>\n</html>", "");
        org.jsoup.select.Elements elements5 = document1.parents();
        java.lang.String str7 = document1.attr("<#root hi! #document=\"#document\">");
        org.jsoup.select.Elements elements9 = document1.getElementsContainingText("");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.outputSettings();
        org.jsoup.select.Elements elements8 = document1.getElementsByIndexGreaterThan(0);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document1.outputSettings();
        org.jsoup.select.Elements elements11 = document1.getElementsByIndexLessThan((-1));
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = document1.new OutputSettings();
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements17 = document14.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Element element19 = document14.createElement(" #document");
        org.jsoup.nodes.Element element21 = document14.addClass("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element23 = document14.prependElement(" #document");
        org.jsoup.select.Elements elements26 = element23.getElementsByAttributeValueContaining("body", "<hi!  #document></hi!  #document>");
        java.util.Set<java.lang.String> strSet27 = element23.classNames();
        org.jsoup.nodes.Element element28 = document1.classNames(strSet27);
        org.jsoup.parser.Tag tag29 = element28.tag();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(tag29);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document1.append("#document");
        java.lang.String str6 = document1.text();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttribute("hi!");
        java.lang.String str9 = document1.outerHtml();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>#document" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>#document");
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element7 = document1.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.select.Elements elements9 = document1.getElementsByClass("#document");
        java.lang.String str10 = document1.title();
        document1.title("hi! #document");
        java.lang.String str14 = document1.absUrl("<hi!  #document></hi!  #document>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element9 = document7.html("");
        java.lang.String str10 = element9.className();
        org.jsoup.nodes.Element element11 = element9.empty();
        org.jsoup.select.Elements elements13 = element9.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element15 = element9.html("hi!");
        boolean boolean17 = element15.hasAttr("hi!");
        java.util.Set<java.lang.String> strSet18 = element15.classNames();
        org.jsoup.nodes.Element element19 = document1.appendChild((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Node node21 = element15.removeAttr("#document");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element7 = document5.html("");
        java.lang.String str8 = element7.className();
        org.jsoup.nodes.Element element9 = element7.empty();
        org.jsoup.select.Elements elements11 = element7.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element13 = element7.html("hi!");
        boolean boolean14 = document1.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = document1.new OutputSettings();
        boolean boolean16 = outputSettings15.prettyPrint();
        java.nio.charset.Charset charset17 = outputSettings15.charset();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(charset17);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.new OutputSettings();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element6 = document5.head();
        java.lang.String str7 = document5.outerHtml();
        java.lang.Integer int8 = document5.elementSiblingIndex();
        java.lang.String str9 = document5.nodeName();
        org.jsoup.nodes.Element element11 = document5.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = document5.outputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode13 = outputSettings12.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings3.escapeMode(escapeMode13);
        boolean boolean15 = outputSettings3.prettyPrint();
        boolean boolean16 = outputSettings3.prettyPrint();
        java.nio.charset.Charset charset17 = outputSettings3.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings3.charset("<html> <head></head> <body></body> </html> <#root></#root>");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: <html> <head></head> <body></body> </html> <#root></#root>");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertTrue("'" + escapeMode13 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode13.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(charset17);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.indentAmount(10);
        java.nio.charset.Charset charset11 = outputSettings10.charset();
        java.nio.charset.CharsetEncoder charsetEncoder12 = outputSettings10.encoder();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertNotNull(charsetEncoder12);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.select.Elements elements7 = document1.getElementsByIndexGreaterThan(10);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = document1.dataset();
        org.jsoup.nodes.Element element9 = document1.empty();
        org.jsoup.nodes.Node node11 = document1.removeAttr("<#root></#root>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element7 = document1.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element9 = document6.text("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str10 = document6.nodeName();
        org.jsoup.nodes.Element element12 = document6.prependText("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = document6.new OutputSettings();
        java.util.Set<java.lang.String> strSet14 = document6.classNames();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document" + "'", str10, "#document");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element6 = document5.head();
        java.lang.String str7 = document5.outerHtml();
        java.lang.Integer int8 = document5.elementSiblingIndex();
        java.lang.String str9 = document5.nodeName();
        org.jsoup.nodes.Element element11 = document5.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = document5.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings12.indentAmount(10);
        boolean boolean15 = document1.equals((java.lang.Object) outputSettings14);
        org.jsoup.nodes.Element element17 = document1.createElement("#document");
        org.jsoup.nodes.Element element19 = document1.val("");
        java.lang.String str20 = element19.val();
        org.jsoup.nodes.Element element23 = element19.attr("<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Attributes attributes24 = element19.attributes();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(attributes24);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.siblingIndex();
        java.lang.String str5 = document1.data();
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("#document");
        java.util.Set<java.lang.String> strSet8 = document7.classNames();
        org.jsoup.nodes.Element element9 = document1.classNames(strSet8);
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValueNot("<hi!  #document></hi!  #document>", "<hi!  #document></hi!  #document>");
        org.jsoup.nodes.Node node14 = element9.removeAttr("#documenthi!");
        org.jsoup.select.Elements elements15 = element9.children();
        org.jsoup.nodes.Attributes attributes16 = element9.attributes();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        java.lang.Integer int5 = document1.siblingIndex();
        org.jsoup.nodes.Element element7 = document1.prepend("hi!  #document");
        java.lang.Integer int8 = element7.elementSiblingIndex();
        org.jsoup.nodes.Element element10 = element7.val("<html>\n <head></head>\n <body></body>\n</html><#root></#root>");
        java.util.regex.Pattern pattern11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element7.getElementsMatchingText(pattern11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = document1.createElement("hi!");
        java.util.Set<java.lang.String> strSet6 = document1.classNames();
        org.jsoup.nodes.Element element8 = document1.appendText("#document");
        java.lang.String str9 = document1.data();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsMatchingOwnText("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element10 = document9.head();
        java.lang.String str11 = document9.outerHtml();
        java.lang.Integer int12 = document9.elementSiblingIndex();
        org.jsoup.nodes.Element element14 = document9.addClass("#document");
        java.util.Set<java.lang.String> strSet15 = element14.classNames();
        org.jsoup.nodes.Element element16 = element3.classNames(strSet15);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = element3.before(" hi!#root");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document1.addClass("#document");
        org.jsoup.nodes.Element element7 = element6.empty();
        java.lang.String str8 = element7.toString();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element12 = document10.html("");
        java.lang.String str13 = element12.className();
        org.jsoup.nodes.Element element14 = element12.empty();
        java.lang.String str15 = element14.className();
        org.jsoup.nodes.Node node16 = element14.nextSibling();
        java.lang.String str17 = element14.className();
        org.jsoup.parser.Tag tag18 = element14.tag();
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element21 = document20.head();
        org.jsoup.nodes.Element element22 = element14.prependChild((org.jsoup.nodes.Node) document20);
        org.jsoup.nodes.Element element24 = element14.prependText("#document");
        java.util.Set<java.lang.String> strSet25 = element24.classNames();
        org.jsoup.nodes.Element element27 = element24.prepend("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            element7.replaceWith((org.jsoup.nodes.Node) element24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(element27);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("hi!");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("#document", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element9 = document8.head();
        java.lang.String str10 = document8.outerHtml();
        java.lang.Integer int11 = document8.siblingIndex();
        java.lang.String str12 = document8.data();
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("#document");
        java.util.Set<java.lang.String> strSet15 = document14.classNames();
        org.jsoup.nodes.Element element16 = document8.classNames(strSet15);
        org.jsoup.nodes.Element element17 = document1.classNames(strSet15);
        java.lang.String str18 = document1.data();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements21 = document1.getElementsByAttributeValueContaining("", "<html> <head></head> <body></body> </html> <#root></#root>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.removeClass("#document");
        org.jsoup.select.Elements elements7 = element3.getElementsMatchingText("hi!  #document");
        org.jsoup.nodes.Element element9 = element3.prependText("");
        org.jsoup.nodes.Attributes attributes10 = element9.attributes();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        org.jsoup.select.Elements elements8 = document1.getElementsByClass(" hi!");
        org.jsoup.select.Elements elements10 = document1.getElementsContainingText("#document <head></head>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi! #document<#root>\n #document<hi!></hi!>\n</#root>");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.Integer int3 = document1.elementSiblingIndex();
        org.jsoup.select.Elements elements5 = document1.getElementsByAttribute("#root");
        java.lang.String str6 = document1.title();
        org.jsoup.nodes.Element element8 = document1.createElement("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str9 = document1.text();
        org.jsoup.nodes.Element element11 = document1.html("hi!#root <html> <head></head> <body></body> </html>");
        org.jsoup.nodes.Element element12 = element11.empty();
        java.lang.String str14 = element11.absUrl("\n<<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>");
        org.jsoup.nodes.Element element16 = element11.prepend("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.jsoup.nodes.Element element14 = document7.classNames((java.util.Set<java.lang.String>) strSet12);
        org.jsoup.nodes.Element element15 = document1.classNames((java.util.Set<java.lang.String>) strSet12);
        java.lang.String str16 = document1.className();
        org.jsoup.nodes.Document document17 = document1.ownerDocument();
        org.jsoup.nodes.Element element19 = document1.prepend("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element21 = element19.val("#root");
        boolean boolean23 = element21.hasClass("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements25 = element21.getElementsContainingText("");
        java.lang.String str26 = element21.className();
        org.jsoup.nodes.Element element28 = element21.removeClass("#document<#root>\n hi!\n</#root>");
        org.jsoup.nodes.Element element30 = element21.toggleClass("");
        org.jsoup.nodes.Element element32 = element30.append("head");
        java.lang.String str33 = element30.className();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!  #document" + "'", str16, "hi!  #document");
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!  #document" + "'", str26, "hi!  #document");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi! #document " + "'", str33, "hi! #document ");
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element7 = document1.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element9 = document6.text("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element11 = document6.prependText("#root");
        org.jsoup.nodes.Element element13 = document6.before("#document");
        java.lang.String str14 = document6.nodeName();
        org.jsoup.nodes.Element element16 = document6.prependText("<html>\n <head></head>\n <body>\n  #document\n </body>\n</html>");
        java.lang.String str17 = document6.toString();
        org.jsoup.nodes.Element element19 = document6.val("<<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>></<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#document" + "'", str14, "#document");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; #document &lt;/body&gt; &lt;/html&gt;#root\n<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html>" + "'", str17, "&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; #document &lt;/body&gt; &lt;/html&gt;#root\n<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html>");
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependElement("hi!");
        org.jsoup.nodes.Element element12 = element10.appendElement("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str13 = element10.text();
        org.jsoup.parser.Tag tag14 = element10.tag();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.nodes.Element element9 = document1.head();
        org.jsoup.nodes.Element element11 = document1.prepend("#document");
        org.jsoup.parser.Tag tag12 = document1.tag();
        boolean boolean13 = document1.hasText();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = document1.new OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.indentAmount(0);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings14.prettyPrint(true);
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(outputSettings18);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.select.Elements elements6 = document1.getElementsMatchingText("");
        org.jsoup.nodes.Element element8 = document1.html("hi!  #document");
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element12 = document10.html("");
        org.jsoup.nodes.Element element14 = element12.html("#document");
        org.jsoup.nodes.Element element16 = element14.appendElement("hi!");
        org.jsoup.nodes.Element element17 = document1.appendChild((org.jsoup.nodes.Node) element14);
        org.jsoup.nodes.Document document18 = element17.ownerDocument();
        org.jsoup.select.Elements elements20 = document18.getElementsByClass("<hi!  #document></hi!  #document>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Element element7 = document1.attr("#root", "hi!  #document");
        org.jsoup.nodes.Element element9 = element7.addClass("<#root hi!  #document=\"#document\"></#root>");
        org.jsoup.nodes.Element element11 = element7.prependElement("<html>\n <head></head>\n <body></body>\n</html><#document></#document>");
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element15 = document13.html("");
        org.jsoup.select.Elements elements17 = document13.getElementsContainingText("");
        org.jsoup.nodes.Element element19 = document13.prependText("hi!");
        org.jsoup.nodes.Document document20 = document13.ownerDocument();
        java.lang.Integer int21 = document20.siblingIndex();
        org.jsoup.nodes.Element element22 = element11.appendChild((org.jsoup.nodes.Node) document20);
        java.lang.String str23 = element22.className();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.util.regex.Pattern pattern7 = null;
        org.jsoup.select.Elements elements8 = element3.getElementsByAttributeValueMatching("", pattern7);
        org.jsoup.select.Elements elements10 = element3.getElementsContainingOwnText("<html>\n <head></head>\n <body>\n  #document\n </body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.select.Elements elements7 = element3.getElementsByAttributeValue("hi!#root", "hi!#root");
        org.jsoup.select.Elements elements10 = element3.getElementsByAttributeValueNot("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>", "\n<head></head>");
        org.jsoup.nodes.Document document11 = element3.ownerDocument();
        org.jsoup.select.Elements elements13 = element3.getElementsByTag("hi!  #document");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Element element4 = document1.head();
        java.lang.String str5 = document1.nodeName();
        java.lang.String str6 = document1.id();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = document1.outputSettings();
        org.jsoup.nodes.Attributes attributes8 = document1.attributes();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.nodes.Document document5 = document1.ownerDocument();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueNot("hi!  #document", "#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = document1.after("<html> <head></head> <body></body> </html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        document1.setBaseUri("");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.html("");
        java.lang.String str14 = element13.className();
        org.jsoup.nodes.Element element15 = element13.empty();
        java.lang.String str16 = element15.className();
        org.jsoup.nodes.Node node17 = element15.nextSibling();
        java.lang.String str18 = element15.className();
        org.jsoup.select.Elements elements19 = element15.getAllElements();
        org.jsoup.nodes.Element element20 = document1.prependChild((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Element element23 = element20.appendChild((org.jsoup.nodes.Node) document22);
        org.jsoup.select.Elements elements25 = document22.getElementsMatchingText("hi!");
        org.jsoup.nodes.Document document27 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element29 = document27.html("");
        boolean boolean31 = element29.hasClass("#document");
        org.jsoup.select.Elements elements32 = element29.parents();
        org.jsoup.select.Elements elements35 = element29.getElementsByAttributeValueMatching("#document", "hi!");
        org.jsoup.nodes.Document document37 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element39 = document37.html("");
        java.lang.String str40 = element39.className();
        org.jsoup.nodes.Element element41 = element29.prependChild((org.jsoup.nodes.Node) element39);
        org.jsoup.nodes.Element element43 = element39.appendText("#document");
        org.jsoup.select.Elements elements46 = element43.getElementsByAttributeValueMatching("", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element47 = document22.prependChild((org.jsoup.nodes.Node) element43);
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = document22.new OutputSettings();
        java.nio.charset.Charset charset49 = outputSettings48.charset();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(charset49);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.html("hi!");
        java.lang.Integer int11 = element10.elementSiblingIndex();
        boolean boolean13 = element10.hasAttr("#root");
        org.jsoup.nodes.Element element14 = element10.empty();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element18 = document16.removeClass("");
        org.jsoup.nodes.Element element20 = element18.toggleClass("hi!");
        org.jsoup.select.Elements elements22 = element18.getElementsByAttribute("hi!  #document");
        org.jsoup.nodes.Element element25 = element18.attr("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>", "<html> <head></head> <body></body> </html>");
        org.jsoup.select.Elements elements28 = element25.getElementsByAttributeValueStarting("#root <html> <head></head> <body></body> </html>", "hi!#root <html> <head></head> <body></body> </html>");
        org.jsoup.nodes.Element element29 = element14.appendChild((org.jsoup.nodes.Node) element25);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(element29);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        document1.setBaseUri("");
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = document1.outputSettings();
        int int11 = outputSettings10.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings10.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings10.indentAmount(0);
        boolean boolean16 = outputSettings15.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings15.escapeMode();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = document1.createElement("hi!");
        java.lang.String str7 = document1.attr("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element9 = document1.removeClass("<#root hi!  #document=\"#document\"></#root>");
        org.jsoup.nodes.Node node11 = document1.removeAttr("<<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>></<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.nodes.Element element6 = element5.parent();
        java.lang.String str7 = element5.val();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element10 = document9.head();
        java.lang.String str11 = document9.outerHtml();
        java.lang.Integer int12 = document9.elementSiblingIndex();
        java.lang.String str13 = document9.nodeName();
        org.jsoup.nodes.Element element15 = document9.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = document9.outputSettings();
        org.jsoup.select.Elements elements18 = document9.getElementsByAttribute("hi!  #document");
        org.jsoup.nodes.Element element20 = document9.val("");
        org.jsoup.nodes.Element element22 = document9.addClass("hi!");
        boolean boolean23 = element5.equals((java.lang.Object) element22);
        org.jsoup.select.Elements elements26 = element5.getElementsByAttributeValueContaining("hi! #document", "#root <html> <head></head> <body></body> </html>");
        org.jsoup.select.Elements elements29 = element5.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body></body>\n</html><#root class=\"\"></#root>", "#documenthi!");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#document" + "'", str13, "#document");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(elements29);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        java.lang.String str8 = element5.className();
        boolean boolean10 = element5.hasClass("hi!  #document");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.jsoup.nodes.Element element14 = document7.classNames((java.util.Set<java.lang.String>) strSet12);
        org.jsoup.nodes.Element element15 = document1.classNames((java.util.Set<java.lang.String>) strSet12);
        java.lang.String str16 = document1.className();
        org.jsoup.nodes.Document document17 = document1.ownerDocument();
        org.jsoup.nodes.Element element18 = document1.head();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int19 = element18.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!  #document" + "'", str16, "hi!  #document");
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNull(element18);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.new OutputSettings();
        org.jsoup.parser.Tag tag4 = document1.tag();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = document1.new OutputSettings();
        org.jsoup.select.Elements elements7 = document1.getElementsByClass("hi!  #document");
        boolean boolean8 = document1.hasText();
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueEnding("#document <head></head>", "hi!#root <html> <head></head> <body></body> </html>");
        org.jsoup.nodes.Element element13 = document1.createElement("#documenthi!");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.new OutputSettings();
        org.jsoup.parser.Tag tag4 = document1.tag();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = document1.new OutputSettings();
        org.jsoup.select.Elements elements7 = document1.getElementsByClass("hi!  #document");
        org.jsoup.select.Elements elements9 = document1.getElementsByClass("<#root hi!  #document=\"#document\"></#root>");
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = document1.new OutputSettings();
        document1.title("\n<#root <html> <head></head> <body></body> </html>></#root <html> <head></head> <body></body> </html>>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependElement("hi!");
        org.jsoup.select.Elements elements11 = element3.parents();
        org.jsoup.nodes.Element element12 = element3.empty();
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element15 = document14.head();
        java.lang.String str16 = document14.outerHtml();
        java.lang.Integer int17 = document14.elementSiblingIndex();
        org.jsoup.nodes.Element element19 = document14.addClass("#document");
        java.util.Set<java.lang.String> strSet20 = element19.classNames();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = element19.dataset();
        org.jsoup.nodes.Element element22 = element19.parent();
        boolean boolean23 = element19.isBlock();
        java.util.Map<java.lang.String, java.lang.String> strMap24 = element19.dataset();
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element28 = document26.html("");
        java.lang.String str29 = element28.className();
        org.jsoup.nodes.Element element30 = element28.empty();
        org.jsoup.select.Elements elements32 = element28.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element34 = element28.html("hi!");
        org.jsoup.nodes.Element element36 = element34.addClass("hi!  #document");
        org.jsoup.nodes.Element element37 = element19.prependChild((org.jsoup.nodes.Node) element34);
        org.jsoup.nodes.Attributes attributes38 = element34.attributes();
        org.jsoup.nodes.Element element39 = element3.prependChild((org.jsoup.nodes.Node) element34);
        org.jsoup.nodes.Element element41 = element3.val("hi! #document");
        java.lang.String str42 = element3.text();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(element22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        java.lang.String str8 = element3.className();
        org.jsoup.nodes.Element element11 = element3.attr("hi!  #document", "<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str13 = element11.absUrl("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element15 = element11.val("#document <head></head>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependElement("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element10.siblingNodes();
        org.jsoup.nodes.Element element12 = element10.empty();
        org.jsoup.nodes.Element element14 = element10.html("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element15 = element10.empty();
        org.jsoup.nodes.Element element17 = element15.before("");
        org.jsoup.nodes.Element element18 = element17.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = element18.baseUri();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNull(element18);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueStarting("#document", "hi!  #document");
        org.jsoup.nodes.Document document12 = document1.normalise();
        org.jsoup.select.Elements elements14 = document12.getElementsByClass("#documenthi!hi!");
        org.jsoup.nodes.Document document15 = document12.normalise();
        org.jsoup.nodes.Element element16 = document15.body();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        boolean boolean7 = element5.hasClass("");
        java.lang.String str8 = element5.html();
        java.lang.String str9 = element5.text();
        org.jsoup.select.Elements elements12 = element5.getElementsByAttributeValueMatching("hi!", "hi!  #document");
        java.lang.String str14 = element5.attr("#root");
        org.jsoup.nodes.Element element16 = element5.toggleClass("");
        org.jsoup.select.Elements elements18 = element5.getElementsByIndexGreaterThan(1);
        org.jsoup.nodes.Element element20 = element5.addClass("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        java.lang.String str21 = element20.tagName();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#root" + "'", str21, "#root");
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        document1.setBaseUri("");
        boolean boolean11 = document1.hasAttr("");
        java.lang.String str12 = document1.data();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependText("hi!");
        org.jsoup.nodes.Element element12 = element10.prependText("#document");
        java.lang.String str13 = element10.html();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = element10.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#documenthi!" + "'", str13, "#documenthi!");
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList2 = document1.childNodes();
        java.lang.String str3 = document1.className();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(nodeList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.nodes.Attributes attributes6 = element5.attributes();
        org.jsoup.select.Elements elements9 = element5.getElementsByAttributeValueContaining("#document", "#root");
        org.jsoup.select.Elements elements10 = element5.children();
        org.jsoup.nodes.Element element12 = element5.removeClass("");
        org.jsoup.select.Elements elements13 = element12.parents();
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element17 = document15.html("");
        java.lang.String str18 = element17.className();
        org.jsoup.nodes.Element element19 = element17.empty();
        boolean boolean21 = element19.hasClass("");
        java.lang.String str22 = element19.html();
        java.lang.String str23 = element19.text();
        org.jsoup.select.Elements elements26 = element19.getElementsByAttributeValueMatching("hi!", "hi!  #document");
        org.jsoup.select.Elements elements29 = element19.getElementsByAttributeValue("hi!", "#document");
        org.jsoup.nodes.Element element31 = element19.appendText("#document");
        java.util.regex.Pattern pattern33 = null;
        org.jsoup.select.Elements elements34 = element31.getElementsByAttributeValueMatching("#root", pattern33);
        org.jsoup.nodes.Element element35 = element12.appendChild((org.jsoup.nodes.Node) element31);
        java.lang.Integer int36 = element31.elementSiblingIndex();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        boolean boolean7 = element5.hasClass("");
        java.lang.String str8 = element5.html();
        java.lang.String str9 = element5.text();
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.html("");
        java.lang.String str14 = element13.className();
        org.jsoup.nodes.Element element15 = element13.empty();
        boolean boolean17 = element15.hasClass("");
        java.lang.String str18 = element15.html();
        java.lang.String str19 = element15.text();
        org.jsoup.select.Elements elements22 = element15.getElementsByAttributeValueMatching("hi!", "hi!  #document");
        org.jsoup.select.Elements elements25 = element15.getElementsByAttributeValue("hi!", "#document");
        org.jsoup.nodes.Element element27 = element15.appendElement("hi!  #document");
        org.jsoup.nodes.Element element28 = element5.appendChild((org.jsoup.nodes.Node) element27);
        org.jsoup.nodes.Document document29 = element27.ownerDocument();
        org.jsoup.nodes.Document document31 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element33 = document31.html("");
        java.lang.String str34 = element33.className();
        org.jsoup.nodes.Element element35 = element33.empty();
        org.jsoup.select.Elements elements37 = element33.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element39 = element33.html("hi!");
        java.lang.String str40 = element39.html();
        org.jsoup.nodes.Element element42 = element39.toggleClass("<#root></#root>hi!");
        org.jsoup.nodes.Element element44 = element39.val(" #document");
        org.jsoup.nodes.Element element45 = document29.appendChild((org.jsoup.nodes.Node) element39);
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = document29.new OutputSettings();
        org.jsoup.nodes.Element element48 = document29.removeClass("&lt;&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&gt;&lt;/&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&gt;");
        org.jsoup.nodes.Document document49 = element48.ownerDocument();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(document49);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Element element4 = document1.head();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.createElement(" #document");
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.select.Elements elements10 = document1.getElementsMatchingOwnText("<html>\n <head>\n  <title> hi!</title>\n </head>\n <body>\n  #document\n </body>\n</html>");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element14 = document12.html("");
        java.lang.String str15 = element14.className();
        org.jsoup.nodes.Element element16 = element14.empty();
        boolean boolean18 = element16.hasClass("");
        java.lang.String str19 = element16.html();
        java.lang.String str20 = element16.text();
        org.jsoup.select.Elements elements23 = element16.getElementsByAttributeValueMatching("hi!", "hi!  #document");
        java.lang.String str25 = element16.attr("#root");
        org.jsoup.nodes.Document document27 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element29 = document27.html("");
        org.jsoup.nodes.Element element31 = element29.html("#document");
        org.jsoup.nodes.Element element33 = element31.appendElement("hi!");
        org.jsoup.nodes.Element element34 = element16.appendChild((org.jsoup.nodes.Node) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) element16);
        org.jsoup.nodes.Node node36 = element16.previousSibling();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNull(node36);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependElement("hi!");
        org.jsoup.select.Elements elements11 = element3.parents();
        org.jsoup.nodes.Element element12 = element3.empty();
        java.lang.String str13 = element12.tagName();
        org.jsoup.select.Elements elements16 = element12.getElementsByAttributeValue("&lt;&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&gt;&lt;/&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&gt;", "body");
        org.jsoup.nodes.Element element18 = element12.html("");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#root" + "'", str13, "#root");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!#root\n<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element3 = document1.getElementById("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element7 = document1.prependChild((org.jsoup.nodes.Node) document6);
        java.lang.Integer int8 = document1.siblingIndex();
        java.lang.String str9 = document1.text();
        org.jsoup.select.Elements elements11 = document1.getElementsMatchingText("");
        org.jsoup.nodes.Element element13 = document1.toggleClass("\n<head></head>");
        boolean boolean14 = element13.hasText();
        boolean boolean15 = element13.isBlock();
        org.jsoup.select.Elements elements17 = element13.getElementsContainingText("<html>\n <head></head>\n <body>\n  #document\n </body>\n</html>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document1.addClass("#document");
        java.util.Set<java.lang.String> strSet7 = element6.classNames();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = element6.dataset();
        org.jsoup.nodes.Element element9 = element6.parent();
        boolean boolean10 = element6.isBlock();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = element6.dataset();
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element15 = document13.html("");
        java.lang.String str16 = element15.className();
        org.jsoup.nodes.Element element17 = element15.empty();
        org.jsoup.select.Elements elements19 = element15.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element21 = element15.html("hi!");
        org.jsoup.nodes.Element element23 = element21.addClass("hi!  #document");
        org.jsoup.nodes.Element element24 = element6.prependChild((org.jsoup.nodes.Node) element21);
        java.lang.String str25 = element21.id();
        org.jsoup.select.Elements elements26 = element21.siblingElements();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = element21.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(elements26);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        document1.setBaseUri("");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.html("");
        java.lang.String str14 = element13.className();
        org.jsoup.nodes.Element element15 = element13.empty();
        java.lang.String str16 = element15.className();
        org.jsoup.nodes.Node node17 = element15.nextSibling();
        java.lang.String str18 = element15.className();
        org.jsoup.select.Elements elements19 = element15.getAllElements();
        org.jsoup.nodes.Element element20 = document1.prependChild((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Element element23 = element20.appendChild((org.jsoup.nodes.Node) document22);
        org.jsoup.nodes.Node node24 = document22.nextSibling();
        java.lang.String str25 = document22.className();
        org.jsoup.nodes.Document document27 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element29 = document27.removeClass("");
        org.jsoup.nodes.Element element31 = element29.toggleClass("hi!");
        org.jsoup.nodes.Element element32 = document22.appendChild((org.jsoup.nodes.Node) element31);
        org.jsoup.nodes.Element element34 = document22.text("#documenthi!");
        org.jsoup.nodes.Element element35 = element34.lastElementSibling();
        org.jsoup.select.Elements elements37 = element34.getElementsByClass("hi!  #document");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(elements37);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        boolean boolean5 = element3.hasClass("#document");
        org.jsoup.select.Elements elements6 = element3.parents();
        org.jsoup.select.Elements elements9 = element3.getElementsByAttributeValueMatching("#document", "hi!");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.html("");
        java.lang.String str14 = element13.className();
        org.jsoup.nodes.Element element15 = element3.prependChild((org.jsoup.nodes.Node) element13);
        org.jsoup.nodes.Element element17 = element13.appendText("#document");
        org.jsoup.select.Elements elements19 = element13.getElementsByAttributeStarting("#root");
        org.jsoup.nodes.Element element21 = element13.after("<#root>\n #root\n <html>\n  <head></head>\n  <body>\n   &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n  </body>\n </html>\n</#root>");
        org.jsoup.nodes.Element element22 = element21.nextElementSibling();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = document1.outputSettings();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element7 = document6.head();
        java.lang.String str8 = document6.outerHtml();
        java.lang.Integer int9 = document6.elementSiblingIndex();
        java.lang.String str10 = document6.nodeName();
        org.jsoup.nodes.Element element12 = document6.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = document6.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings13.indentAmount(10);
        boolean boolean16 = outputSettings15.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings15.prettyPrint(true);
        boolean boolean19 = outputSettings15.prettyPrint();
        java.nio.charset.Charset charset20 = outputSettings15.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings4.charset(charset20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document" + "'", str10, "#document");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertNotNull(outputSettings21);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("hi!");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingOwnText("#document");
        org.jsoup.select.Elements elements7 = document1.getElementsByIndexEquals(0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = document1.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        boolean boolean3 = document1.isBlock();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str6 = document1.attr("hi!");
        java.lang.Integer int7 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element9 = document1.wrap("hi!");
        org.jsoup.nodes.Document document10 = document1.normalise();
        java.lang.String str11 = document10.id();
        org.jsoup.nodes.Element element13 = document10.removeClass("hi!");
        org.jsoup.nodes.Element element15 = document10.toggleClass("hi!  #document");
        org.jsoup.nodes.Element element17 = document10.appendElement("#root <html> <head></head> <body></body> </html>");
        org.jsoup.nodes.Node node19 = document10.removeAttr("#document<#root>\n hi!\n</#root>");
        org.jsoup.nodes.Node node20 = node19.nextSibling();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document1.addClass("#document");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document1.childNodes();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueMatching("hi! #document<hi!></hi!>", "<#root hi!  #document=\"#document\"></#root>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.appendText("hi!");
        java.lang.String str6 = element5.html();
        java.lang.String str7 = element5.text();
        org.jsoup.select.Elements elements9 = element5.getElementsByAttributeStarting("#root");
        org.jsoup.nodes.Element element11 = element5.prepend("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Node node13 = element5.removeAttr("hi! #document");
        org.jsoup.parser.Tag tag14 = element5.tag();
        org.jsoup.nodes.Element element16 = element5.append("hi!#root");
        org.jsoup.select.Elements elements18 = element5.getElementsByIndexEquals((int) ' ');
        java.lang.Class<?> wildcardClass19 = elements18.getClass();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        document1.title("#root");
        org.jsoup.nodes.Document document7 = document1.ownerDocument();
        java.lang.String str8 = document7.className();
        java.lang.String str9 = document7.outerHtml();
        java.lang.String str10 = document7.nodeName();
        boolean boolean12 = document7.hasAttr("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str13 = document7.data();
        org.jsoup.nodes.Document document14 = document7.normalise();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document" + "'", str10, "#document");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(document14);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        document1.title("#root");
        org.jsoup.nodes.Document document7 = document1.ownerDocument();
        java.lang.String str8 = document7.className();
        java.lang.String str9 = document7.outerHtml();
        java.lang.String str10 = document7.nodeName();
        org.jsoup.nodes.Element element12 = document7.append("");
        org.jsoup.select.Elements elements14 = element12.getElementsByTag("#document<#root>\n hi!\n</#root>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document" + "'", str10, "#document");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("hi!");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingOwnText("#document");
        org.jsoup.nodes.Node node6 = document1.nextSibling();
        java.lang.String str7 = document1.title();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = document1.outputSettings();
        java.lang.String str6 = document1.title();
        java.util.regex.Pattern pattern8 = null;
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueMatching("", pattern8);
        java.lang.String str10 = document1.title();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Element element8 = element5.removeClass("hi!");
        org.jsoup.nodes.Element element10 = element8.appendText("hi!");
        org.jsoup.select.Elements elements13 = element8.getElementsByAttributeValueEnding("#root", "hi!  #document");
        org.jsoup.nodes.Element element15 = element8.removeClass("hi! #document<#root>\n #document<hi!></hi!>\n</#root>");
        org.jsoup.select.Elements elements17 = element8.getElementsMatchingOwnText("hi!#root\n<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        boolean boolean9 = element3.hasClass("#document");
        org.jsoup.nodes.Element element12 = element3.attr("#document", "#root");
        java.lang.String str13 = element12.toString();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = element12.dataset();
        java.lang.String str15 = element12.className();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsMatchingOwnText("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element10 = document9.head();
        java.lang.String str11 = document9.outerHtml();
        java.lang.Integer int12 = document9.elementSiblingIndex();
        org.jsoup.nodes.Element element14 = document9.addClass("#document");
        java.util.Set<java.lang.String> strSet15 = element14.classNames();
        org.jsoup.nodes.Element element16 = element3.classNames(strSet15);
        org.jsoup.select.Elements elements18 = element16.getElementsMatchingText("#document");
        org.jsoup.nodes.Element element19 = element16.empty();
        org.jsoup.nodes.Element element21 = element19.prependElement("<html>\n <head></head>\n <body></body>\n</html><#root></#root>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        java.lang.String str9 = element3.baseUri();
        org.jsoup.select.Elements elements10 = element3.getAllElements();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements5 = document1.getElementsMatchingOwnText("#root");
        org.jsoup.nodes.Element element7 = document1.prepend("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.Set<java.lang.String> strSet8 = document1.classNames();
        org.jsoup.nodes.Element element9 = document1.body();
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValueStarting("\n<#root <html> <head></head> <body></body> </html>></#root <html> <head></head> <body></body> </html>>", "<html>\n <head>\n  <title> hi!</title>\n </head>\n <body>\n  #document\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Element element8 = element5.removeClass("hi!");
        org.jsoup.nodes.Element element10 = element8.appendText("hi!");
        org.jsoup.select.Elements elements12 = element8.getElementsContainingOwnText("hi!  #document");
        org.jsoup.nodes.Node node14 = element8.removeAttr("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = element8.dataset();
        java.lang.Integer int16 = element8.elementSiblingIndex();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependElement("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element10.siblingNodes();
        org.jsoup.nodes.Element element12 = element10.empty();
        org.jsoup.nodes.Element element14 = element10.html("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element15 = element10.empty();
        org.jsoup.select.Elements elements17 = element10.getElementsByIndexEquals(0);
        java.lang.String str18 = element10.baseUri();
        java.lang.String str19 = element10.data();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        document1.title("#root");
        org.jsoup.nodes.Document document7 = document1.ownerDocument();
        java.lang.String str8 = document7.className();
        java.lang.String str9 = document7.outerHtml();
        org.jsoup.nodes.Element element11 = document7.text("<html>\n <head></head>\n <body>\n  #document\n </body>\n</html>");
        org.jsoup.select.Elements elements13 = document7.getElementsByIndexLessThan(2);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.outputSettings();
        org.jsoup.select.Elements elements5 = document1.getElementsMatchingOwnText("#root");
        org.jsoup.select.Elements elements7 = document1.getElementsByClass("<#root> #root <html> <head></head> <body></body> </html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.wrap("hi!");
        org.jsoup.nodes.Element element4 = document1.body();
        boolean boolean6 = document1.hasClass("hi!");
        java.lang.String str7 = document1.data();
        org.jsoup.nodes.Element element8 = document1.empty();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document1.outputSettings();
        java.lang.String str10 = document1.data();
        java.lang.String str11 = document1.data();
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttribute("hi!  #document");
        org.jsoup.nodes.Element element12 = document1.val("");
        org.jsoup.nodes.Element element14 = element12.removeClass("#document");
        org.jsoup.nodes.Element element16 = element14.prependElement("hi!#root");
        org.jsoup.parser.Tag tag17 = element14.tag();
        org.jsoup.select.Elements elements20 = element14.getElementsByAttributeValueNot("<#root>\n #root\n <html>\n  <head></head>\n  <body>\n   &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n  </body>\n </html>\n</#root>", "<html><head></head><body></body></html>&lt;#root&gt;&lt;/#root&gt;hi!");
        org.jsoup.nodes.Node node21 = element14.nextSibling();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependElement("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element10.siblingNodes();
        org.jsoup.nodes.Element element12 = element10.empty();
        org.jsoup.nodes.Element element14 = element10.html("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element15 = element10.empty();
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element20 = document17.attr("hi!  #document", "#document");
        org.jsoup.nodes.Node node21 = element20.nextSibling();
        org.jsoup.select.Elements elements23 = element20.getElementsByTag("hi!");
        java.lang.String str24 = element20.val();
        element10.replaceWith((org.jsoup.nodes.Node) element20);
        org.jsoup.nodes.Node node27 = element20.removeAttr("#document <head></head>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Element element6 = document1.createElement(" #document");
        org.jsoup.nodes.Element element8 = document1.addClass("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        java.lang.String str9 = element8.val();
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.html("");
        java.lang.String str14 = element13.className();
        org.jsoup.nodes.Element element15 = element13.empty();
        org.jsoup.select.Elements elements17 = element13.getElementsMatchingOwnText("");
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element20 = document19.head();
        java.lang.String str21 = document19.outerHtml();
        java.lang.Integer int22 = document19.elementSiblingIndex();
        org.jsoup.nodes.Element element24 = document19.addClass("#document");
        java.util.Set<java.lang.String> strSet25 = element24.classNames();
        org.jsoup.nodes.Element element26 = element13.classNames(strSet25);
        org.jsoup.nodes.Element element28 = element13.val("body");
        org.jsoup.nodes.Element element29 = element8.appendChild((org.jsoup.nodes.Node) element13);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        java.lang.String str3 = document1.outerHtml();
        document1.title("#document");
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("#document");
        java.util.Set<java.lang.String> strSet8 = document7.classNames();
        org.jsoup.nodes.Element element9 = document1.classNames(strSet8);
        org.jsoup.nodes.Element element11 = document1.appendText("\n<head></head>");
        org.jsoup.nodes.Element element13 = document1.createElement("\n<head></head>");
        org.jsoup.nodes.Element element14 = document1.head();
        java.lang.String str15 = document1.nodeName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str3, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#document" + "'", str15, "#document");
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        boolean boolean5 = element3.hasClass("#document");
        org.jsoup.select.Elements elements6 = element3.parents();
        org.jsoup.select.Elements elements9 = element3.getElementsByAttributeValueMatching("#document", "hi!");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.html("");
        java.lang.String str14 = element13.className();
        org.jsoup.nodes.Element element15 = element3.prependChild((org.jsoup.nodes.Node) element13);
        org.jsoup.nodes.Element element17 = element13.prependText("#document");
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element21 = document19.html("");
        org.jsoup.nodes.Element element23 = element21.appendText("hi!");
        java.lang.String str24 = element23.html();
        java.lang.String str25 = element23.text();
        org.jsoup.nodes.Element element26 = element13.appendChild((org.jsoup.nodes.Node) element23);
        org.jsoup.nodes.Element element28 = element13.before("hi!");
        org.jsoup.select.Elements elements31 = element13.getElementsByAttributeValueStarting("<html> <head> <title>#root</title> </head> <body></body> </html>", "hi! #document");
        org.jsoup.nodes.Element element33 = element13.prepend("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements35 = element33.select("&lt;#root&gt; #root \n<html> \n <head></head> \n <body>\n   &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;   \n </body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '&lt;#root&gt; #root ?<html> ? <head></head> ? <body>?   &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;   ? </body>?</html>': unexpected token at '&lt;#root&gt; #root ?<html> ? <head></head> ? <body>?   &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;   ? </body>?</html>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(element33);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.wrap("hi!");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Element element6 = document1.prependText("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        boolean boolean8 = document1.hasAttr("<html>\n <head></head>\n <body>\n  #documenthi!\n </body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = document1.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        boolean boolean3 = document1.isBlock();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str6 = document1.attr("hi!");
        java.lang.Integer int7 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.nodes.Element element10 = document1.append("hi!#root\n<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html>");
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = document1.new OutputSettings();
        org.jsoup.nodes.Node node12 = document1.nextSibling();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        boolean boolean9 = element7.hasAttr("hi!  #document");
        java.lang.String str10 = element7.tagName();
        org.jsoup.select.Elements elements12 = element7.getElementsByClass("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.regex.Pattern pattern14 = null;
        org.jsoup.select.Elements elements15 = element7.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body></body>\n</html>", pattern14);
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element19 = document17.html("");
        java.lang.String str20 = element19.className();
        org.jsoup.nodes.Element element21 = element19.empty();
        java.lang.String str22 = element21.className();
        org.jsoup.nodes.Element element23 = element7.appendChild((org.jsoup.nodes.Node) element21);
        org.jsoup.nodes.Element element25 = element7.prepend("<hi!  #document></hi!  #document>");
        java.lang.String str26 = element7.data();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.outputSettings();
        boolean boolean4 = outputSettings3.prettyPrint();
        int int5 = outputSettings3.indentAmount();
        java.nio.charset.Charset charset6 = outputSettings3.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings3.charset("<#root class=\"\"></#root>");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: <#root class=\"\"></#root>");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.jsoup.nodes.Element element14 = document7.classNames((java.util.Set<java.lang.String>) strSet12);
        org.jsoup.nodes.Element element15 = document1.classNames((java.util.Set<java.lang.String>) strSet12);
        java.lang.String str16 = document1.className();
        org.jsoup.nodes.Document document17 = document1.ownerDocument();
        org.jsoup.nodes.Element element19 = document1.prepend("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element21 = element19.val("#root");
        org.jsoup.nodes.Element element23 = element21.addClass("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.regex.Pattern pattern25 = null;
        org.jsoup.select.Elements elements26 = element23.getElementsByAttributeValueMatching("&lt;&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&gt;&lt;/&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&gt;", pattern25);
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!  #document" + "'", str16, "hi!  #document");
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements26);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.html("hi!");
        org.jsoup.nodes.Element element11 = element9.addClass("hi!  #document");
        boolean boolean12 = element11.hasText();
        org.jsoup.nodes.Element element14 = element11.append("\n<head></head>");
        org.jsoup.select.Elements elements16 = element14.getElementsByAttribute("<hi!></hi!>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        boolean boolean3 = document1.isBlock();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str6 = document1.attr("hi!");
        java.lang.Integer int7 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        boolean boolean9 = outputSettings8.prettyPrint();
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements13 = document11.getElementsByIndexEquals((int) (short) 100);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = document11.new OutputSettings();
        java.nio.charset.Charset charset15 = outputSettings14.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings8.charset(charset15);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.charset("hi! #document <html>\n <head></head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi! #document <html>? <head></head>? <body></body>?</html>");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(charset15);
        org.junit.Assert.assertNotNull(outputSettings16);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!  #document");
        org.jsoup.nodes.Element element2 = document1.head();
        org.jsoup.select.Elements elements4 = element2.getElementsMatchingOwnText("");
        org.jsoup.select.Elements elements5 = element2.children();
        org.jsoup.select.Elements elements8 = element2.getElementsByAttributeValueNot("hi!  #document", " #document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element2.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependText("hi!");
        org.jsoup.nodes.Element element12 = element10.prependText("#document");
        org.jsoup.nodes.Attributes attributes13 = element12.attributes();
        org.jsoup.nodes.Element element15 = element12.prepend("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = element12.childNode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.appendText("hi!");
        java.lang.String str6 = element5.html();
        org.jsoup.nodes.Element element9 = element5.attr("<html>\n <head></head>\n <body></body>\n</html>", "hi!");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("hi!  #document");
        java.lang.String str12 = document11.title();
        org.jsoup.nodes.Element element13 = element5.appendChild((org.jsoup.nodes.Node) document11);
        org.jsoup.nodes.Element element15 = element13.toggleClass("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        java.util.regex.Pattern pattern17 = null;
        org.jsoup.select.Elements elements18 = element13.getElementsByAttributeValueMatching("<hi!  #document></hi!  #document>", pattern17);
        org.jsoup.nodes.Element element20 = element13.append("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;");
        java.lang.String str21 = element20.data();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        java.lang.String str8 = element5.className();
        org.jsoup.parser.Tag tag9 = element5.tag();
        java.lang.String str10 = element5.ownText();
        org.jsoup.select.Elements elements12 = element5.getElementsContainingText("#document");
        org.jsoup.select.Elements elements15 = element5.getElementsByAttributeValueContaining("#document", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element17 = element5.prependText("&lt;&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&gt;&lt;/&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&gt;");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = element5.before("<#root class=\"\"></#root>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        document1.title("#root");
        org.jsoup.nodes.Element element8 = document1.getElementById("<html> <head></head> <body></body> </html>");
        java.lang.String str9 = document1.nodeName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.select.Elements elements9 = element3.getElementsMatchingOwnText("hi!  #document");
        boolean boolean10 = element3.hasText();
        org.jsoup.nodes.Element element12 = element3.prependText("hi!#root");
        org.jsoup.nodes.Element element14 = element3.val("&lt;&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&gt;&lt;/&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&gt;");
        java.lang.String str16 = element14.attr(" #document");
        org.jsoup.parser.Tag tag17 = element14.tag();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(tag17);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.jsoup.nodes.Element element14 = document7.classNames((java.util.Set<java.lang.String>) strSet12);
        org.jsoup.nodes.Element element15 = document1.classNames((java.util.Set<java.lang.String>) strSet12);
        java.lang.String str16 = document1.className();
        org.jsoup.nodes.Document document17 = document1.ownerDocument();
        org.jsoup.nodes.Document document18 = document1.normalise();
        org.jsoup.select.Elements elements21 = document1.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body>\n  #documenthi!\n </body>\n</html>", "&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; #document &lt;/body&gt; &lt;/html&gt;#root\n<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!  #document" + "'", str16, "hi!  #document");
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("#document", "hi!");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueNot("hi!  #document", "hi!");
        boolean boolean12 = document1.isBlock();
        org.jsoup.nodes.Element element14 = document1.prependElement("<html>\n <head></head>\n <body></body>\n</html><#document></#document>");
        org.jsoup.select.Elements elements17 = element14.getElementsByAttributeValueMatching(" hi!", "<#root>\n <hi!  #document></hi!  #document>\n</#root>\n<html>\n <head></head>\n <body>\n  hi! #document\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements17);
    }
}

