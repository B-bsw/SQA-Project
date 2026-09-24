package org.jsoup.nodes;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
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
        org.jsoup.select.Elements elements21 = element19.getElementsContainingText("#root");
        org.jsoup.nodes.Node node23 = element19.removeAttr("<html>\n <head></head>\n <body>\n  #document\n </body>\n</html>");
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
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Element element6 = document1.text("hi! #document<#root>\n #document<hi!></hi!>\n</#root>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        java.lang.String str8 = element5.absUrl("#document");
        org.jsoup.nodes.Element element9 = element5.empty();
        org.jsoup.nodes.Element element11 = element5.prependText("");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        document1.setBaseUri("");
        boolean boolean11 = document1.hasAttr("");
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element15 = document13.append("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements17 = document13.getElementsByClass("#document");
        java.lang.String str18 = document13.text();
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element22 = document20.html("");
        java.lang.String str23 = element22.className();
        org.jsoup.select.Elements elements25 = element22.getElementsByIndexLessThan((int) (short) 10);
        boolean boolean26 = document13.equals((java.lang.Object) elements25);
        org.jsoup.nodes.Element element27 = document1.appendChild((org.jsoup.nodes.Node) document13);
        org.jsoup.select.Elements elements30 = document1.getElementsByAttributeValueStarting("body", "hi!#root <html> <head></head> <body></body> </html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements30);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document1.append("#document");
        java.lang.String str6 = document1.text();
        org.jsoup.nodes.Element element8 = document1.appendElement("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements10 = element8.getElementsByIndexGreaterThan((int) '4');
        java.lang.String str11 = element8.data();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
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
        org.jsoup.select.Elements elements25 = document11.getElementsByAttributeValueStarting("<html>\n <head>\n  <title> hi!</title>\n </head>\n <body>\n  #document\n </body>\n</html>", " #document");
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
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        java.lang.Integer int5 = document1.siblingIndex();
        org.jsoup.nodes.Element element6 = document1.body();
        org.jsoup.nodes.Element element7 = document1.body();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = document1.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str3 = document1.absUrl("#document");
        org.jsoup.nodes.Attributes attributes4 = document1.attributes();
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValue("#root <html> <head></head> <body></body> </html>", "\n<head></head>");
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node11 = document9.removeAttr("#document");
        // The following exception was thrown during execution in test generation
        try {
            document1.replaceWith((org.jsoup.nodes.Node) document9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        org.jsoup.nodes.Element element9 = element5.removeClass("");
        org.jsoup.nodes.Element element11 = element5.appendElement("#root");
        org.jsoup.nodes.Node node13 = element5.removeAttr("hi!");
        org.jsoup.select.Elements elements16 = element5.getElementsByAttributeValueEnding("<html>\n <head></head>\n <body></body>\n</html>", "hi!");
        org.jsoup.select.Elements elements18 = element5.getElementsContainingOwnText("body");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueStarting("#root", "hi!  #document");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.jsoup.nodes.Element element14 = document7.classNames((java.util.Set<java.lang.String>) strSet12);
        org.jsoup.select.Elements elements17 = document7.getElementsByAttributeValueStarting("#document", "hi!  #document");
        org.jsoup.nodes.Document document18 = document7.normalise();
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element22 = document20.html("");
        org.jsoup.nodes.Element element24 = element22.html("#document");
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element28 = document26.html("");
        java.lang.String str29 = element28.className();
        org.jsoup.nodes.Element element30 = element28.empty();
        org.jsoup.select.Elements elements32 = element28.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element34 = element28.html("hi!");
        boolean boolean36 = element34.hasAttr("hi!");
        java.util.Set<java.lang.String> strSet37 = element34.classNames();
        org.jsoup.nodes.Element element38 = element24.classNames(strSet37);
        org.jsoup.nodes.Element element39 = document7.classNames(strSet37);
        org.jsoup.nodes.Element element41 = element39.prependText("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element43 = element41.prependText("#root");
        org.jsoup.nodes.Element element44 = document1.appendChild((org.jsoup.nodes.Node) element41);
        org.jsoup.nodes.Document document46 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element48 = document46.html("");
        java.lang.String str49 = element48.className();
        org.jsoup.nodes.Element element50 = element48.empty();
        java.lang.String str51 = element50.className();
        org.jsoup.nodes.Node node52 = element50.nextSibling();
        org.jsoup.nodes.Element element54 = element50.removeClass("");
        org.jsoup.nodes.Element element56 = element50.appendElement("#root");
        org.jsoup.nodes.Element element57 = element44.appendChild((org.jsoup.nodes.Node) element50);
        org.jsoup.select.Elements elements59 = element57.getElementsByAttribute("<html> \n <head></head> \n <body> \n </body>\n</html>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(elements59);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.appendText("hi!");
        java.util.regex.Pattern pattern7 = null;
        org.jsoup.select.Elements elements8 = element3.getElementsByAttributeValueMatching("#document", pattern7);
        boolean boolean9 = element3.isBlock();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element3.nextElementSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        boolean boolean3 = document1.isBlock();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str6 = document1.attr("hi!");
        java.lang.Integer int7 = document1.elementSiblingIndex();
        org.jsoup.select.Elements elements9 = document1.getElementsByIndexEquals((int) (byte) 0);
        org.jsoup.nodes.Node node11 = document1.childNode(0);
        java.lang.String str12 = document1.outerHtml();
        java.lang.String str14 = document1.absUrl("hi! #document");
        org.jsoup.nodes.Element element16 = document1.text("#root #document");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str12, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!  #document");
        org.jsoup.nodes.Element element2 = document1.head();
        org.jsoup.nodes.Document document3 = element2.ownerDocument();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element7 = document5.html("");
        boolean boolean9 = element7.hasClass("#document");
        org.jsoup.select.Elements elements10 = element7.parents();
        org.jsoup.select.Elements elements13 = element7.getElementsByAttributeValueMatching("#document", "hi!");
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element17 = document15.html("");
        java.lang.String str18 = element17.className();
        org.jsoup.nodes.Element element19 = element7.prependChild((org.jsoup.nodes.Node) element17);
        org.jsoup.select.Elements elements20 = element17.children();
        org.jsoup.nodes.Element element21 = document3.prependChild((org.jsoup.nodes.Node) element17);
        org.jsoup.select.Elements elements23 = document3.getElementsMatchingOwnText("#document");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.outputSettings();
        org.jsoup.nodes.Element element8 = document1.getElementById("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int9 = element8.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
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
        org.jsoup.nodes.Element element27 = document1.empty();
        org.jsoup.nodes.Element element29 = element27.appendElement(" hi!");
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
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
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
        org.jsoup.nodes.Element element42 = element7.val("#documenthi!");
        java.util.Map<java.lang.String, java.lang.String> strMap43 = element7.dataset();
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
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(strMap43);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
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
        java.lang.String str19 = element18.tagName();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#root" + "'", str19, "#root");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
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
        org.jsoup.nodes.Element element23 = element13.wrap("hi!  #document");
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
        org.junit.Assert.assertNull(element23);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueNot("hi!  #document", "hi!");
        org.jsoup.select.Elements elements10 = document1.getElementsByTag("hi!");
        org.jsoup.nodes.Element element12 = document1.append("#root");
        org.jsoup.nodes.Element element14 = element12.val(" #document");
        org.jsoup.nodes.Node node16 = element12.removeAttr("body");
        org.jsoup.nodes.Node node17 = node16.nextSibling();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependElement("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element10.siblingNodes();
        org.jsoup.nodes.Element element12 = element10.empty();
        org.jsoup.nodes.Element element14 = element10.html("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements15 = element14.parents();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = element14.childNode(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
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
        java.lang.String str16 = element14.tagName();
        java.lang.String str18 = element14.attr("<html> <head></head> <body></body> </html>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Element element6 = document1.createElement(" #document");
        org.jsoup.nodes.Element element8 = document1.addClass("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element10 = document1.prependElement(" #document");
        java.lang.String str11 = document1.title();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document1.addClass("#document");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.select.Elements elements9 = element7.getElementsContainingText("hi!  #document");
        boolean boolean11 = element7.hasClass("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements14 = element7.getElementsByAttributeValueMatching("#root", "<html> \n <head></head> \n <body> \n </body>\n</html>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
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
        // The following exception was thrown during execution in test generation
        try {
            element3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
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
        java.lang.String str29 = element3.id();
        org.jsoup.select.Elements elements32 = element3.getElementsByAttributeValue("#document", "#document<#root>\n hi!\n</#root>");
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(elements32);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("#document", "hi!");
        org.jsoup.nodes.Element element8 = document1.val("#root");
        org.jsoup.nodes.Node node10 = element8.removeAttr("#root #document");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        java.lang.String str8 = element7.html();
        org.jsoup.select.Elements elements9 = element7.parents();
        java.lang.Integer int10 = element7.elementSiblingIndex();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element14 = document12.html("");
        org.jsoup.nodes.Element element16 = element14.appendText("hi!");
        java.lang.String str17 = element14.data();
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element21 = document19.html("");
        java.lang.String str22 = element21.className();
        org.jsoup.nodes.Element element23 = element21.empty();
        java.lang.String str24 = element23.className();
        org.jsoup.nodes.Node node25 = element23.nextSibling();
        java.lang.String str26 = element23.className();
        org.jsoup.parser.Tag tag27 = element23.tag();
        org.jsoup.nodes.Document document29 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element30 = document29.head();
        org.jsoup.nodes.Element element31 = element23.prependChild((org.jsoup.nodes.Node) document29);
        boolean boolean32 = element14.equals((java.lang.Object) element23);
        org.jsoup.select.Elements elements34 = element23.getElementsByIndexEquals((int) '4');
        org.jsoup.nodes.Element element36 = element23.addClass("#root");
        org.jsoup.nodes.Element element37 = element7.appendChild((org.jsoup.nodes.Node) element36);
        boolean boolean38 = element36.hasText();
        org.jsoup.select.Elements elements41 = element36.getElementsByAttributeValueEnding(" #document", "#documenthi!");
        org.jsoup.nodes.Document document42 = element36.ownerDocument();
        java.lang.Integer int43 = document42.siblingIndex();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNull(element30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.indentAmount(10);
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings8.prettyPrint(true);
        int int13 = outputSettings8.indentAmount();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.removeClass("");
        org.jsoup.nodes.Element element5 = element3.toggleClass("hi!");
        org.jsoup.nodes.Document document6 = element5.ownerDocument();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = document6.new OutputSettings();
        org.jsoup.nodes.Node node9 = document6.removeAttr("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements11 = document6.getElementsMatchingText("hi! #document<#root>\n #document<hi!></hi!>\n</#root>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
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
        org.jsoup.nodes.Node node20 = element10.removeAttr("<html> <head></head> <body></body> </html>");
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
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
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
        org.jsoup.nodes.Element element22 = element20.prependElement(" #document");
        java.lang.Integer int23 = element20.siblingIndex();
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
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
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
        java.lang.String str24 = document1.absUrl("#documenthi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements26 = document1.select(" hi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'hi!': unexpected token at '!'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document1.append("#document");
        java.lang.String str6 = document1.text();
        org.jsoup.nodes.Element element8 = document1.appendElement("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element10 = element8.appendText("#root");
        java.lang.String str11 = element8.className();
        element8.remove();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.head();
        org.jsoup.nodes.Node node5 = document1.nextSibling();
        java.lang.String str6 = document1.nodeName();
        document1.title("\n<body></body>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element9 = element3.empty();
        java.lang.String str11 = element3.absUrl("#document");
        boolean boolean12 = element3.hasText();
        java.lang.String str13 = element3.html();
        java.lang.String str14 = element3.id();
        org.jsoup.select.Elements elements16 = element3.getElementsByAttributeStarting("#document");
        org.jsoup.nodes.Element element18 = element3.prependText("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element21 = element18.attr("<#root></#root>hi!", " #document");
        org.jsoup.nodes.Document document23 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element24 = document23.head();
        java.lang.String str25 = document23.outerHtml();
        java.lang.Integer int26 = document23.elementSiblingIndex();
        java.lang.String str27 = document23.nodeName();
        org.jsoup.select.Elements elements30 = document23.getElementsByAttributeValueNot("hi!  #document", "hi!");
        org.jsoup.select.Elements elements32 = document23.getElementsByTag("hi!");
        org.jsoup.nodes.Element element34 = document23.append("#root");
        org.jsoup.nodes.Element element37 = document23.attr("hi!", "#root");
        org.jsoup.nodes.Element element39 = element37.toggleClass("");
        boolean boolean40 = element18.equals((java.lang.Object) "");
        org.jsoup.nodes.Attributes attributes41 = element18.attributes();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#document" + "'", str27, "#document");
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(attributes41);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document1.append("#document");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = document1.childNodes();
        org.jsoup.select.Elements elements8 = document1.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element11 = document1.attr("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>", "");
        java.lang.Integer int12 = document1.siblingIndex();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
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
        org.jsoup.nodes.Element element54 = element9.appendText("#root #document");
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
        org.junit.Assert.assertNotNull(element54);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
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
        java.lang.String str28 = document22.nodeName();
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#document" + "'", str28, "#document");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        boolean boolean5 = element3.hasClass("#document");
        org.jsoup.select.Elements elements6 = element3.parents();
        org.jsoup.select.Elements elements9 = element3.getElementsByAttributeValueMatching("#document", "hi!");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.html("");
        java.lang.String str14 = element13.className();
        org.jsoup.nodes.Element element15 = element3.prependChild((org.jsoup.nodes.Node) element13);
        org.jsoup.nodes.Element element16 = element13.lastElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = element16.wrap("#root");
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
        org.junit.Assert.assertNull(element16);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("#document", "hi!");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element11 = document1.attr("hi!  #document", "#document");
        org.jsoup.nodes.Element element12 = element11.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = element12.removeAttr("<#root>\n #root\n <html>\n  <head></head>\n  <body>\n   &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n  </body>\n </html>\n</#root>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNull(element12);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("#document", "hi!");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element9 = document1.head();
        java.lang.String str11 = document1.absUrl("hi!");
        org.jsoup.select.Elements elements12 = document1.getAllElements();
        org.jsoup.select.Elements elements14 = document1.getElementsByIndexGreaterThan((int) ' ');
        boolean boolean16 = document1.hasClass("<#root></#root>hi!");
        org.jsoup.nodes.Element element18 = document1.toggleClass("#document");
        org.jsoup.nodes.Element element20 = element18.prependText("#document");
        java.lang.String str21 = element18.ownText();
        element18.setBaseUri(" hi!");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#document" + "'", str21, "#document");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
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
        java.util.Map<java.lang.String, java.lang.String> strMap20 = element13.dataset();
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet23 = document22.classNames();
        boolean boolean24 = document22.isBlock();
        java.lang.Integer int25 = document22.elementSiblingIndex();
        java.lang.String str27 = document22.attr("hi!");
        java.lang.Integer int28 = document22.elementSiblingIndex();
        org.jsoup.nodes.Element element30 = document22.wrap("hi!");
        org.jsoup.nodes.Document document31 = document22.normalise();
        java.lang.String str33 = document31.attr("hi!  #document");
        org.jsoup.nodes.Element element34 = element13.appendChild((org.jsoup.nodes.Node) document31);
        java.lang.String str35 = element34.baseUri();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(element30);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("#document", "hi!");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueNot("#document", "#document");
        org.jsoup.nodes.Element element11 = document1.text("#document");
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = document1.outputSettings();
        java.lang.String str13 = document1.toString();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n <head></head>\n <body>\n  #document\n </body>\n</html>" + "'", str13, "<html>\n <head></head>\n <body>\n  #document\n </body>\n</html>");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.removeClass("");
        org.jsoup.nodes.Element element5 = element3.toggleClass("hi!");
        org.jsoup.nodes.Document document6 = element5.ownerDocument();
        org.jsoup.select.Elements elements8 = element5.getElementsContainingOwnText("<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependText("hi!");
        org.jsoup.nodes.Element element12 = element10.prependText("#document");
        java.lang.String str13 = element10.html();
        java.lang.String str14 = element10.text();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#documenthi!" + "'", str13, "#documenthi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#documenthi!" + "'", str14, "#documenthi!");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.html("#document");
        org.jsoup.select.Elements elements7 = element5.getElementsByAttributeStarting("#document");
        org.jsoup.nodes.Element element9 = element5.prependText("#document");
        org.jsoup.nodes.Element element11 = element9.getElementById("#root");
        java.lang.Integer int12 = element9.elementSiblingIndex();
        java.lang.String str13 = element9.val();
        boolean boolean15 = element9.equals((java.lang.Object) 100);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!  #document");
        java.lang.String str7 = document1.toString();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        boolean boolean3 = document1.isBlock();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str6 = document1.attr("hi!");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueNot("#root <html> <head></head> <body></body> </html>", "<html>\n <head></head>\n <body>\n </body>\n</html><<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>");
        org.jsoup.select.Elements elements11 = document1.getElementsContainingOwnText("hi!  #document");
        java.lang.String str13 = document1.absUrl("<#root hi!  #document=\"#document\"></#root>");
        java.lang.String str14 = document1.ownText();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("\n<body></body>");
        org.jsoup.nodes.Element element3 = document1.prepend("<#root></#root>");
        org.junit.Assert.assertNotNull(element3);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        boolean boolean7 = element5.hasClass("");
        java.lang.String str8 = element5.html();
        java.lang.String str9 = element5.text();
        org.jsoup.select.Elements elements12 = element5.getElementsByAttributeValueMatching("hi!", "hi!  #document");
        org.jsoup.select.Elements elements14 = element5.getElementsContainingOwnText("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Node node16 = element5.removeAttr("hi!");
        org.jsoup.select.Elements elements17 = element5.getAllElements();
        org.jsoup.select.Elements elements19 = element5.getElementsMatchingText("hi!  #document");
        org.jsoup.select.Elements elements21 = element5.getElementsContainingText("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element23 = element5.after("<html> <head></head> <body></body> </html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        org.jsoup.nodes.Element element10 = element5.attr("hi!  #document", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element11 = element10.parent();
        java.lang.String str12 = element10.data();
        java.lang.String str13 = element10.id();
        java.lang.Class<?> wildcardClass14 = element10.getClass();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByIndexEquals((int) (short) 100);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = document1.new OutputSettings();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element7 = document6.head();
        java.lang.String str8 = document6.outerHtml();
        java.lang.Integer int9 = document6.elementSiblingIndex();
        java.lang.String str10 = document6.nodeName();
        org.jsoup.nodes.Element element12 = document6.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = document6.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings13.indentAmount(10);
        boolean boolean16 = outputSettings15.prettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder17 = outputSettings15.encoder();
        java.nio.charset.Charset charset18 = outputSettings15.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings4.charset(charset18);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document" + "'", str10, "#document");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(charsetEncoder17);
        org.junit.Assert.assertNotNull(charset18);
        org.junit.Assert.assertNotNull(outputSettings19);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        boolean boolean9 = element7.hasAttr("hi!  #document");
        org.jsoup.nodes.Node node10 = element7.nextSibling();
        java.util.regex.Pattern pattern11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element7.getElementsMatchingText(pattern11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
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
        java.util.List<org.jsoup.nodes.Node> nodeList48 = element46.siblingNodes();
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
        org.junit.Assert.assertNotNull(nodeList48);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.removeClass("");
        org.jsoup.nodes.Element element5 = element3.toggleClass("hi!");
        org.jsoup.nodes.Document document6 = element5.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = document6.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(document6);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
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
        java.util.regex.Pattern pattern18 = null;
        org.jsoup.select.Elements elements19 = element16.getElementsByAttributeValueMatching("hi!#root <html> <head></head> <body></body> </html>", pattern18);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
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
        org.jsoup.select.Elements elements22 = element15.getElementsByAttribute("hi!  #document");
        org.jsoup.select.Elements elements23 = element15.parents();
        element15.remove();
        java.lang.String str25 = element15.toString();
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
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.parser.Tag tag6 = document1.tag();
        org.jsoup.nodes.Element element8 = document1.createElement("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements10 = document1.getElementsByClass("#document");
        org.jsoup.nodes.Attributes attributes11 = document1.attributes();
        java.lang.String str12 = document1.title();
        java.lang.String str13 = document1.text();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = document1.createElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
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
        org.jsoup.nodes.Element element27 = document22.addClass("hi! #document");
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = document22.new OutputSettings();
        org.jsoup.nodes.Element element30 = document22.after("\n<head></head>");
        org.jsoup.nodes.Element element32 = element30.append("<hi!  #document></hi!  #document>");
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
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.wrap("hi!");
        org.jsoup.nodes.Element element4 = document1.body();
        boolean boolean6 = document1.hasClass("hi!");
        org.jsoup.select.Elements elements7 = document1.getAllElements();
        org.jsoup.nodes.Element element9 = document1.appendText("body");
        org.jsoup.select.Elements elements11 = element9.getElementsContainingOwnText("hi!#root <html> <head></head> <body></body> </html>");
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("#document", "hi!");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element9 = document1.head();
        java.lang.String str11 = document1.absUrl("hi!");
        org.jsoup.select.Elements elements12 = document1.getAllElements();
        org.jsoup.nodes.Element element14 = document1.text("hi!#root");
        org.jsoup.nodes.Element element16 = document1.getElementById("<#root></#root>hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = document1.new OutputSettings();
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
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
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
        org.jsoup.nodes.Element element18 = element17.firstElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements20 = element18.getElementsByAttribute("<#root></#root>hi!");
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
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.new OutputSettings();
        java.lang.String str4 = document1.id();
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("#document");
        java.util.Set<java.lang.String> strSet8 = document7.classNames();
        org.jsoup.nodes.Element element9 = document1.classNames(strSet8);
        java.util.Set<java.lang.String> strSet10 = document1.classNames();
        org.jsoup.nodes.Element element11 = document1.head();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = document1.toString();
        org.jsoup.nodes.Element element6 = document1.toggleClass("#document");
        org.jsoup.nodes.Element element8 = document1.getElementById("\n<body></body>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = document1.outputSettings();
        java.util.regex.Pattern pattern7 = null;
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueMatching("#root", pattern7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList9 = document1.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
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
        java.lang.String str14 = document11.data();
        org.jsoup.select.Elements elements16 = document11.getElementsByIndexGreaterThan((int) (byte) 100);
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
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        boolean boolean7 = element5.hasClass("");
        java.lang.String str8 = element5.html();
        boolean boolean10 = element5.hasClass("<#root></#root>hi!");
        org.jsoup.nodes.Element element12 = element5.addClass("<#root></#root>hi!");
        java.util.regex.Pattern pattern13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements14 = element5.getElementsMatchingOwnText(pattern13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
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
        org.jsoup.select.Elements elements30 = element26.getElementsMatchingText("#document");
        org.jsoup.nodes.Node node32 = element26.removeAttr("hi!");
        org.jsoup.nodes.Element element34 = element26.wrap("<#root>\n #root\n <html>\n  <head></head>\n  <body>\n   &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n  </body>\n </html>\n</#root>");
        java.lang.String str35 = element34.html();
        org.jsoup.nodes.Node node36 = element34.nextSibling();
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
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "#document<#root>\n hi!\n</#root>" + "'", str35, "#document<#root>\n hi!\n</#root>");
        org.junit.Assert.assertNull(node36);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
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
        java.lang.String str28 = document22.nodeName();
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#document" + "'", str28, "#document");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!  #document");
        org.jsoup.nodes.Element element2 = document1.head();
        org.jsoup.nodes.Element element4 = document1.createElement("\n<body></body>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
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
        org.jsoup.nodes.Element element42 = element7.val("#documenthi!");
        org.jsoup.nodes.Element element45 = element42.attr("#document <head></head>", "#documenthi!");
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
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element45);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
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
        org.jsoup.nodes.Element element16 = element5.addClass("<#root></#root>hi!");
        org.jsoup.nodes.Element element18 = element5.appendText("");
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
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
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
        org.jsoup.select.Elements elements21 = element19.getElementsMatchingOwnText("#root #document");
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
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Document document3 = document1.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            document1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(document3);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.nodes.Element element6 = element5.parent();
        org.jsoup.nodes.Element element9 = element5.attr("hi!#root", "<html>\n <head></head>\n <body></body>\n</html>");
        java.util.regex.Pattern pattern11 = null;
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValueMatching(" #document", pattern11);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        boolean boolean4 = document1.isBlock();
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueMatching("hi!#root <html> <head></head> <body></body> </html>", "<html>\n <head></head>\n <body></body>\n</html><#document></#document>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
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
        org.jsoup.select.Elements elements27 = element6.getElementsByAttributeValue("#documenthi!", "hi!");
        org.jsoup.nodes.Attributes attributes28 = element6.attributes();
        org.jsoup.select.Elements elements31 = element6.getElementsByAttributeValueMatching("<html> \n <head></head> \n <body> \n </body>\n</html>\n<html>\n <head></head>\n <body></body>\n</html>", "body");
        java.lang.Integer int32 = element6.siblingIndex();
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
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.outputSettings();
        document1.title("hi!  #document");
        java.lang.String str6 = document1.title();
        org.jsoup.nodes.Element element8 = document1.toggleClass("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueMatching("hi!", "#document <head></head>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!  #document" + "'", str6, "hi!  #document");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.select.Elements elements9 = element3.getElementsMatchingOwnText("hi!  #document");
        boolean boolean10 = element3.hasText();
        org.jsoup.nodes.Element element12 = element3.prependText("hi!#root");
        java.lang.String str13 = element12.className();
        org.jsoup.nodes.Element element15 = element12.getElementById("<html> <head></head> <body></body> </html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(element15);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Node node6 = document1.removeAttr("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element8 = document1.addClass("");
        org.jsoup.nodes.Element element10 = document1.prepend("<html>\n <head>\n  <title> hi!</title>\n </head>\n <body>\n  #document\n </body>\n</html>");
        org.jsoup.nodes.Element element12 = element10.prepend("<#root hi!  #document=\"#document\"></#root>");
        java.lang.String str13 = element12.ownText();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<#root hi! #document=\"#document\">" + "'", str13, "<#root hi! #document=\"#document\">");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.html("hi!");
        java.lang.String str10 = element9.html();
        org.jsoup.nodes.Element element12 = element9.toggleClass("<#root></#root>hi!");
        org.jsoup.nodes.Element element14 = element9.removeClass("#documenthi!");
        org.jsoup.nodes.Node node16 = element9.removeAttr("#documenthi!");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#documenthi!hi!");
        // The following exception was thrown during execution in test generation
        try {
            document1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.wrap("hi!");
        org.jsoup.nodes.Element element4 = document1.body();
        boolean boolean6 = document1.hasClass("hi!");
        org.jsoup.select.Elements elements7 = document1.getAllElements();
        org.jsoup.parser.Tag tag8 = document1.tag();
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Document document3 = document1.ownerDocument();
        java.util.regex.Pattern pattern4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements5 = document3.getElementsMatchingText(pattern4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(document3);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
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
        java.lang.String str19 = element7.className();
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element22 = document21.head();
        java.lang.String str23 = document21.outerHtml();
        java.lang.Integer int24 = document21.elementSiblingIndex();
        java.lang.String str25 = document21.nodeName();
        org.jsoup.nodes.Document document27 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        org.jsoup.nodes.Element element34 = document27.classNames((java.util.Set<java.lang.String>) strSet32);
        org.jsoup.nodes.Element element35 = document21.classNames((java.util.Set<java.lang.String>) strSet32);
        java.lang.String str36 = document21.className();
        java.lang.String str37 = document21.nodeName();
        document21.setBaseUri("hi!");
        // The following exception was thrown during execution in test generation
        try {
            element7.replaceWith((org.jsoup.nodes.Node) document21);
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#document" + "'", str25, "#document");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!  #document" + "'", str36, "hi!  #document");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#document" + "'", str37, "#document");
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.html("hi!");
        org.jsoup.select.Elements elements11 = element3.getElementsContainingOwnText("#document");
        org.jsoup.nodes.Element element13 = element3.removeClass("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element15 = element13.append(" hi!");
        org.jsoup.nodes.Document document16 = element13.ownerDocument();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(document16);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
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
        org.jsoup.select.Elements elements32 = document1.getElementsByAttributeValue("<html>\n <head></head>\n <body>\n  #documenthi!\n </body>\n</html>", "#document<#root>\n hi!\n</#root>");
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
        org.junit.Assert.assertNotNull(elements32);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
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
        org.jsoup.select.Elements elements31 = element28.getElementsByIndexGreaterThan(10);
        java.lang.String str32 = element28.data();
        org.jsoup.nodes.Element element34 = element28.prependText("<#root></#root>");
        java.lang.String str35 = element34.text();
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
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<#root></#root>" + "'", str35, "<#root></#root>");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.head();
        java.lang.String str5 = element4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element4.siblingNodes();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        org.jsoup.nodes.Element element15 = document8.classNames((java.util.Set<java.lang.String>) strSet13);
        org.jsoup.select.Elements elements18 = document8.getElementsByAttributeValueStarting("#document", "hi!  #document");
        java.lang.Integer int19 = document8.elementSiblingIndex();
        org.jsoup.nodes.Document document20 = document8.normalise();
        java.lang.String str21 = document20.title();
        java.lang.Integer int22 = document20.siblingIndex();
        java.lang.String str23 = document20.nodeName();
        org.jsoup.select.Elements elements26 = document20.getElementsByAttributeValueEnding("#document", " hi!");
        org.jsoup.nodes.Element element27 = element4.appendChild((org.jsoup.nodes.Node) document20);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#document" + "'", str23, "#document");
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element27);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element7 = document1.prependChild((org.jsoup.nodes.Node) document6);
        java.lang.Integer int8 = document1.elementSiblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = document1.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.wrap("hi!");
        org.jsoup.nodes.Element element4 = document1.body();
        boolean boolean6 = document1.hasClass("hi!");
        org.jsoup.select.Elements elements7 = document1.getAllElements();
        org.jsoup.nodes.Node node8 = document1.nextSibling();
        org.jsoup.nodes.Element element9 = document1.head();
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
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
        org.jsoup.select.Elements elements26 = element12.select(" #document");
        java.lang.String str27 = element12.className();
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
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
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
        java.util.regex.Pattern pattern20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements21 = element19.getElementsMatchingOwnText(pattern20);
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
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.nodes.Document document5 = document1.ownerDocument();
        boolean boolean6 = document5.isBlock();
        java.lang.String str7 = document5.tagName();
        org.jsoup.select.Elements elements9 = document5.getElementsByIndexEquals((-1));
        java.util.Set<java.lang.String> strSet10 = document5.classNames();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#root" + "'", str7, "#root");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueNot("hi!  #document", "hi!");
        org.jsoup.select.Elements elements10 = document1.getElementsByTag("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = document1.outputSettings();
        java.util.Set<java.lang.String> strSet12 = document1.classNames();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
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
        org.jsoup.nodes.Node node20 = element19.nextSibling();
        java.lang.Class<?> wildcardClass21 = element19.getClass();
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
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
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
        org.jsoup.select.Elements elements22 = document11.getElementsByAttributeValueEnding("hi!#root <html> <head></head> <body></body> </html>", "<html> <head> <title>#root</title> </head> <body></body> </html>");
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
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
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
        org.jsoup.nodes.Element element22 = element20.prependElement(" #document");
        org.jsoup.select.Elements elements25 = element22.getElementsByAttributeValue("hi!  #document", "hi!");
        java.util.regex.Pattern pattern26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements27 = element22.getElementsMatchingText(pattern26);
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
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        boolean boolean9 = element7.hasAttr("hi!  #document");
        java.util.Set<java.lang.String> strSet10 = element7.classNames();
        org.jsoup.select.Elements elements13 = element7.getElementsByAttributeValueNot("#document", " #document");
        java.util.regex.Pattern pattern15 = null;
        org.jsoup.select.Elements elements16 = element7.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body></body>\n</html>", pattern15);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element17 = element7.lastElementSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
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
        org.jsoup.select.Elements elements16 = element10.getElementsByTag("<html>\n <head></head>\n <body>\n </body>\n</html><<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>");
        java.lang.Class<?> wildcardClass17 = elements16.getClass();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
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
        org.jsoup.nodes.Element element32 = element27.parent();
        java.lang.Class<?> wildcardClass33 = element27.getClass();
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
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        org.jsoup.nodes.Element element9 = document1.html("");
        org.jsoup.nodes.Document document10 = document1.normalise();
        org.jsoup.nodes.Element element12 = document10.text("hi!  #document");
        org.jsoup.nodes.Element element14 = document10.removeClass("hi!#root");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.html("");
        java.lang.String str19 = element18.className();
        org.jsoup.nodes.Element element20 = element18.empty();
        boolean boolean22 = element20.hasClass("");
        java.lang.String str23 = element20.html();
        java.lang.String str24 = element20.text();
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element28 = document26.html("");
        java.lang.String str29 = element28.className();
        org.jsoup.nodes.Element element30 = element28.empty();
        boolean boolean32 = element30.hasClass("");
        java.lang.String str33 = element30.html();
        java.lang.String str34 = element30.text();
        org.jsoup.select.Elements elements37 = element30.getElementsByAttributeValueMatching("hi!", "hi!  #document");
        org.jsoup.select.Elements elements40 = element30.getElementsByAttributeValue("hi!", "#document");
        org.jsoup.nodes.Element element42 = element30.appendElement("hi!  #document");
        org.jsoup.nodes.Element element43 = element20.appendChild((org.jsoup.nodes.Node) element42);
        org.jsoup.nodes.Element element44 = document10.prependChild((org.jsoup.nodes.Node) element20);
        java.lang.String str45 = document10.toString();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "<#root>\n <hi!  #document></hi!  #document>\n</#root>\n<html>\n <head></head>\n <body>\n  hi! #document\n </body>\n</html>" + "'", str45, "<#root>\n <hi!  #document></hi!  #document>\n</#root>\n<html>\n <head></head>\n <body>\n  hi! #document\n </body>\n</html>");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        boolean boolean9 = element3.hasClass("#document");
        org.jsoup.nodes.Element element12 = element3.attr("#document", "#root");
        org.jsoup.select.Elements elements14 = element12.getElementsByIndexGreaterThan((int) (byte) 0);
        org.jsoup.select.Elements elements15 = element12.getAllElements();
        java.lang.String str16 = element12.baseUri();
        org.jsoup.nodes.Element element18 = element12.addClass("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element19 = element18.empty();
        org.jsoup.select.Elements elements21 = element19.getElementsMatchingOwnText(" hi!");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        document1.setBaseUri("");
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = document1.outputSettings();
        org.jsoup.nodes.Element element12 = document1.prependElement("#root");
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element16 = document14.html("");
        java.lang.String str17 = element16.className();
        org.jsoup.nodes.Element element18 = element16.empty();
        boolean boolean20 = element18.hasClass("");
        java.lang.String str21 = element18.html();
        java.lang.String str22 = element18.text();
        org.jsoup.select.Elements elements25 = element18.getElementsByAttributeValueMatching("hi!", "hi!  #document");
        org.jsoup.select.Elements elements27 = element18.getElementsContainingOwnText("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Node node29 = element18.removeAttr("hi!");
        org.jsoup.select.Elements elements30 = element18.getAllElements();
        org.jsoup.nodes.Node node32 = element18.removeAttr(" #document");
        org.jsoup.nodes.Element element33 = element12.prependChild((org.jsoup.nodes.Node) element18);
        org.jsoup.nodes.Element element35 = element18.prepend("");
        java.util.List<org.jsoup.nodes.Node> nodeList36 = element35.siblingNodes();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(nodeList36);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements24 = element21.getElementsByAttributeValueContaining("#document hi! #document", "hi!  #document");
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
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNull(element21);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.appendText("hi!");
        java.lang.String str6 = element5.html();
        org.jsoup.nodes.Element element9 = element5.attr("<html>\n <head></head>\n <body></body>\n</html>", "hi!");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("hi!  #document");
        java.lang.String str12 = document11.title();
        org.jsoup.nodes.Element element13 = element5.appendChild((org.jsoup.nodes.Node) document11);
        boolean boolean15 = element13.hasClass(" #document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements17 = element13.getElementsByAttributeStarting("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        boolean boolean3 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.body();
        boolean boolean5 = element4.isBlock();
        org.jsoup.nodes.Element element7 = element4.val("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.html("hi!");
        java.lang.Integer int11 = element10.elementSiblingIndex();
        boolean boolean13 = element10.hasAttr("#root");
        org.jsoup.select.Elements elements15 = element10.getElementsByAttributeStarting("#root <html> <head></head> <body></body> </html>");
        boolean boolean16 = element10.hasText();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        boolean boolean9 = element7.hasAttr("hi!  #document");
        java.lang.String str10 = element7.tagName();
        java.lang.String str11 = element7.toString();
        org.jsoup.nodes.Document document12 = element7.ownerDocument();
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
        org.jsoup.nodes.Element element36 = element34.appendText("hi!");
        java.lang.String str37 = element36.html();
        java.lang.String str38 = element36.text();
        org.jsoup.nodes.Element element39 = element26.appendChild((org.jsoup.nodes.Node) element36);
        java.util.List<org.jsoup.nodes.Node> nodeList40 = element26.siblingNodes();
        boolean boolean41 = document12.equals((java.lang.Object) element26);
        org.jsoup.nodes.Element element43 = element26.append("<html>\n <head>\n  <title> hi!</title>\n </head>\n <body>\n  #document\n </body>\n</html>");
        org.jsoup.nodes.Element element45 = element43.toggleClass("");
        java.lang.Integer int46 = element45.siblingIndex();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
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
        org.jsoup.nodes.Element element27 = document1.empty();
        java.lang.String str28 = document1.data();
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
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
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
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings15.prettyPrint(false);
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element20 = document19.head();
        java.lang.String str21 = document19.outerHtml();
        java.lang.Integer int22 = document19.elementSiblingIndex();
        java.lang.String str23 = document19.nodeName();
        org.jsoup.parser.Tag tag24 = document19.tag();
        org.jsoup.nodes.Element element26 = document19.createElement("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements28 = document19.getElementsByClass("#document");
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = document19.outputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = outputSettings29.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode31 = outputSettings29.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings17.escapeMode(escapeMode31);
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
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#document" + "'", str23, "#document");
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertTrue("'" + escapeMode30 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode30.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode31 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode31.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings32);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node40 = element38.childNode(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
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
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int16 = node15.siblingIndex();
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
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element3 = document1.createElement("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = element3.dataset();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
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
        org.jsoup.select.Elements elements39 = element35.getElementsByIndexEquals(100);
        org.jsoup.select.Elements elements42 = element35.getElementsByAttributeValue("<html> <head></head> <body></body> </html>", "body");
        java.lang.String[] strArray49 = new java.lang.String[] { "body", "hi! #document", "<html>\n <head>\n  <title> hi!</title>\n </head>\n <body>\n  #document\n </body>\n</html>", "<html>\n <head>\n  <title> hi!</title>\n </head>\n <body>\n  #document\n </body>\n</html>", "<#root></#root>", "" };
        java.util.LinkedHashSet<java.lang.String> strSet50 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet50, strArray49);
        org.jsoup.nodes.Element element52 = element35.classNames((java.util.Set<java.lang.String>) strSet50);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element54 = element52.child((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "body", "hi! #document", "<html>\n <head>\n  <title> hi!</title>\n </head>\n <body>\n  #document\n </body>\n</html>", "<html>\n <head>\n  <title> hi!</title>\n </head>\n <body>\n  #document\n </body>\n</html>", "<#root></#root>", "" });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(element52);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
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
        java.lang.String str22 = document1.baseUri();
        org.jsoup.nodes.Element element24 = document1.append(" hi!");
        org.jsoup.nodes.Document document26 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet27 = document26.classNames();
        org.jsoup.nodes.Node node29 = document26.removeAttr("#document");
        org.jsoup.nodes.Element element30 = document1.appendChild(node29);
        java.util.regex.Pattern pattern31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements32 = document1.getElementsMatchingOwnText(pattern31);
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
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(element30);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
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
        org.jsoup.select.Elements elements18 = element17.parents();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements20 = element17.select("\n<head></head>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<head></head>': unexpected token at '<head></head>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
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
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.appendText("hi!");
        java.lang.String str6 = element5.html();
        java.lang.String str7 = element5.text();
        org.jsoup.nodes.Element element9 = element5.addClass("hi! #document");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element12 = document11.head();
        java.lang.String str13 = document11.outerHtml();
        java.lang.Integer int14 = document11.siblingIndex();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = document11.outputSettings();
        java.lang.String str16 = document11.title();
        org.jsoup.select.Elements elements17 = document11.getAllElements();
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element20 = document19.head();
        java.lang.String str21 = document19.outerHtml();
        java.lang.Integer int22 = document19.elementSiblingIndex();
        java.lang.String str23 = document19.nodeName();
        org.jsoup.nodes.Element element25 = document19.removeClass("");
        org.jsoup.nodes.Document document27 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element29 = document27.html("");
        java.lang.String str30 = element29.className();
        boolean boolean32 = element29.hasClass("hi!");
        boolean boolean34 = element29.hasAttr("#document");
        java.lang.String str35 = element29.baseUri();
        org.jsoup.select.Elements elements38 = element29.getElementsByAttributeValueContaining("hi!  #document", "#root");
        java.util.Set<java.lang.String> strSet39 = element29.classNames();
        org.jsoup.nodes.Element element40 = element25.classNames(strSet39);
        org.jsoup.nodes.Document document42 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element44 = document42.html("");
        org.jsoup.nodes.Element element46 = element44.appendText("hi!");
        java.lang.String str47 = element44.data();
        org.jsoup.nodes.Document document49 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element51 = document49.html("");
        java.lang.String str52 = element51.className();
        org.jsoup.nodes.Element element53 = element51.empty();
        java.lang.String str54 = element53.className();
        org.jsoup.nodes.Node node55 = element53.nextSibling();
        java.lang.String str56 = element53.className();
        org.jsoup.parser.Tag tag57 = element53.tag();
        org.jsoup.nodes.Document document59 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element60 = document59.head();
        org.jsoup.nodes.Element element61 = element53.prependChild((org.jsoup.nodes.Node) document59);
        boolean boolean62 = element44.equals((java.lang.Object) element53);
        java.util.Set<java.lang.String> strSet63 = element44.classNames();
        org.jsoup.nodes.Element element64 = element40.classNames(strSet63);
        org.jsoup.nodes.Element element65 = document11.classNames(strSet63);
        boolean boolean66 = element5.equals((java.lang.Object) element65);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#document" + "'", str23, "#document");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(tag57);
        org.junit.Assert.assertNull(element60);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(strSet63);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Element element6 = document1.createElement(" #document");
        org.jsoup.nodes.Element element8 = document1.addClass("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        boolean boolean9 = element8.isBlock();
        org.jsoup.select.Elements elements10 = element8.parents();
        org.jsoup.select.Elements elements13 = element8.getElementsByAttributeValueEnding("#document hi! #document", "<html>\n <head></head>\n <body>\n </body>\n</html><<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttribute("hi!  #document");
        org.jsoup.nodes.Element element12 = document1.getElementById("hi!  #document");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = element12.text();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNull(element12);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = document1.toString();
        org.jsoup.select.Elements elements5 = document1.parents();
        java.lang.String str6 = document1.title();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.select.Elements elements3 = document1.children();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        org.jsoup.nodes.Element element9 = element5.removeClass("");
        org.jsoup.parser.Tag tag10 = element9.tag();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str14 = document12.absUrl("#document");
        boolean boolean15 = element9.equals((java.lang.Object) document12);
        org.jsoup.select.Elements elements17 = document12.getElementsByIndexGreaterThan((int) (short) 1);
        org.jsoup.nodes.Element element19 = document12.prependText("");
        java.lang.String str20 = document12.tagName();
        java.lang.String str21 = document12.nodeName();
        org.jsoup.nodes.Element element23 = document12.val("<#root></#root>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#root" + "'", str20, "#root");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#document" + "'", str21, "#document");
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
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
        java.lang.String str39 = element38.data();
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        document1.setBaseUri("");
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = document1.outputSettings();
        org.jsoup.nodes.Element element12 = document1.prependElement("#root");
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element16 = document14.html("");
        java.lang.String str17 = element16.className();
        org.jsoup.nodes.Element element18 = element16.empty();
        boolean boolean20 = element18.hasClass("");
        java.lang.String str21 = element18.html();
        java.lang.String str22 = element18.text();
        org.jsoup.select.Elements elements25 = element18.getElementsByAttributeValueMatching("hi!", "hi!  #document");
        org.jsoup.select.Elements elements27 = element18.getElementsContainingOwnText("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Node node29 = element18.removeAttr("hi!");
        org.jsoup.select.Elements elements30 = element18.getAllElements();
        org.jsoup.nodes.Node node32 = element18.removeAttr(" #document");
        org.jsoup.nodes.Element element33 = element12.prependChild((org.jsoup.nodes.Node) element18);
        java.lang.String str34 = element33.html();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<#root></#root>" + "'", str34, "<#root></#root>");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.appendText("hi!");
        java.lang.String str6 = element5.html();
        org.jsoup.nodes.Element element9 = element5.attr("<html>\n <head></head>\n <body></body>\n</html>", "hi!");
        org.jsoup.nodes.Element element11 = element5.wrap("#documenthi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = element11.getElementById("#root <html> <head></head> <body></body> </html>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(element11);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.String str4 = document1.id();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!  #document", "#document");
        org.jsoup.select.Elements elements6 = document1.getElementsContainingText("hi!  #document");
        java.lang.String str7 = document1.text();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueMatching("", "#document hi! #document");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("\n<body></body>");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
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
        org.jsoup.select.Elements elements22 = element19.getElementsByAttributeValueNot("#root", "<#root></#root>");
        java.lang.Class<?> wildcardClass23 = elements22.getClass();
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
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        boolean boolean7 = element5.hasClass("");
        java.lang.String str8 = element5.html();
        java.util.regex.Pattern pattern10 = null;
        org.jsoup.select.Elements elements11 = element5.getElementsByAttributeValueMatching("", pattern10);
        java.lang.Integer int12 = element5.elementSiblingIndex();
        java.lang.String str13 = element5.tagName();
        org.jsoup.nodes.Element element15 = element5.wrap("#root");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#root" + "'", str13, "#root");
        org.junit.Assert.assertNull(element15);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.parser.Tag tag6 = document1.tag();
        org.jsoup.nodes.Element element8 = document1.createElement("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements10 = document1.getElementsByClass("#document");
        org.jsoup.nodes.Attributes attributes11 = document1.attributes();
        org.jsoup.nodes.Element element13 = document1.val("#document");
        org.jsoup.select.Elements elements16 = element13.getElementsByAttributeValueEnding("<html>\n <head></head>\n <body></body>\n</html><#document></#document>", "#root #document");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
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
        java.util.regex.Pattern pattern18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements19 = document1.getElementsMatchingText(pattern18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        boolean boolean5 = element3.hasClass("#document");
        org.jsoup.select.Elements elements6 = element3.parents();
        java.lang.String str7 = element3.toString();
        java.lang.String str8 = element3.ownText();
        org.jsoup.select.Elements elements9 = element3.parents();
        org.jsoup.select.Elements elements11 = element3.getElementsByAttributeStarting("#documenthi!");
        org.jsoup.nodes.Element element13 = element3.prepend("#document hi! #document");
        org.jsoup.nodes.Element element15 = element3.appendText(" hi!");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!  #document", "#document");
        org.jsoup.nodes.Node node5 = element4.nextSibling();
        org.jsoup.select.Elements elements7 = element4.getElementsByTag("hi!");
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str10 = document9.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = document9.new OutputSettings();
        org.jsoup.nodes.Element element12 = element4.prependChild((org.jsoup.nodes.Node) document9);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document" + "'", str10, "#document");
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        org.jsoup.nodes.Element element9 = document1.html("");
        org.jsoup.nodes.Document document10 = document1.normalise();
        org.jsoup.select.Elements elements12 = document1.getElementsMatchingText("<html>\n <head>\n  <title> hi!</title>\n </head>\n <body>\n  #document\n </body>\n</html>");
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element16 = document14.html("");
        org.jsoup.nodes.Element element18 = element16.html("#document");
        org.jsoup.nodes.Element element20 = element18.appendElement("hi!");
        boolean boolean21 = document1.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.nodes.Element element9 = document1.head();
        org.jsoup.nodes.Element element11 = document1.prepend("#document");
        java.util.regex.Pattern pattern13 = null;
        org.jsoup.select.Elements elements14 = element11.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body></body>\n</html>", pattern13);
        org.jsoup.nodes.Element element16 = element11.appendText("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = element11.after("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; #document &lt;/body&gt; &lt;/html&gt;#root\n<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueStarting("#document", "hi!  #document");
        org.jsoup.nodes.Document document12 = document1.normalise();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = document1.childNode(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(document12);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
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
        java.lang.String str19 = element17.absUrl("hi!");
        boolean boolean21 = element17.hasClass("<#root hi!  #document=\"#document\"></#root>");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
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
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element24 = document22.html("");
        java.lang.String str25 = element24.className();
        org.jsoup.nodes.Element element26 = element24.empty();
        java.lang.String str27 = element26.className();
        org.jsoup.nodes.Node node28 = element26.nextSibling();
        java.lang.String str29 = element26.className();
        org.jsoup.parser.Tag tag30 = element26.tag();
        org.jsoup.nodes.Document document32 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element33 = document32.head();
        org.jsoup.nodes.Element element34 = element26.prependChild((org.jsoup.nodes.Node) document32);
        org.jsoup.nodes.Node node35 = document32.nextSibling();
        java.lang.String str36 = document32.outerHtml();
        org.jsoup.nodes.Element element37 = element9.prependChild((org.jsoup.nodes.Node) document32);
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
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNull(element33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(element37);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependElement("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element10.siblingNodes();
        org.jsoup.nodes.Element element12 = element10.empty();
        org.jsoup.nodes.Element element14 = element12.getElementById("#documenthi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements15 = element14.children();
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
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element5 = document1.head();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValue("<html> \n <head></head> \n <body> \n </body>\n</html>\n<html>\n <head></head>\n <body></body>\n</html>", "<#root></#root>");
        java.lang.String str9 = document1.nodeName();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
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
        java.util.regex.Pattern pattern19 = null;
        org.jsoup.select.Elements elements20 = element17.getElementsByAttributeValueMatching("#root", pattern19);
        org.jsoup.parser.Tag tag21 = element17.tag();
        org.jsoup.select.Elements elements23 = element17.getElementsByClass("&lt;&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&gt;&lt;/&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&gt;");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements25 = element17.select("#document<#root>\n hi!\n</#root>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '#document<#root>? hi!?</#root>': unexpected token at '<#root>? hi!?</#root>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element9 = element3.empty();
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("hi!  #document");
        java.lang.String str12 = document11.val();
        java.lang.String str13 = document11.title();
        java.lang.String str14 = document11.ownText();
        org.jsoup.nodes.Element element15 = element3.prependChild((org.jsoup.nodes.Node) document11);
        org.jsoup.select.Elements elements18 = element3.getElementsByAttributeValue(" hi!#root", "#root");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        int int9 = outputSettings8.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings8.prettyPrint(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings8.charset("<#root>\n #root\n <html>\n  <head></head>\n  <body>\n   &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n  </body>\n </html>\n</#root>");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: <#root>? #root? <html>?  <head></head>?  <body>?   &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;?  </body>? </html>?</#root>");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(outputSettings11);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        java.util.Set<java.lang.String> strSet3 = document1.classNames();
        org.jsoup.nodes.Element element5 = document1.val("hi!  #document");
        org.jsoup.nodes.Element element7 = document1.addClass("");
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node11 = document9.removeAttr("#document");
        org.jsoup.nodes.Element element12 = document9.body();
        document9.title("#root");
        org.jsoup.nodes.Document document15 = document9.ownerDocument();
        boolean boolean16 = element7.equals((java.lang.Object) document9);
        org.jsoup.nodes.Element element17 = document9.body();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!  #document", "#document");
        org.jsoup.select.Elements elements6 = document1.getElementsContainingText("hi!  #document");
        // The following exception was thrown during execution in test generation
        try {
            document1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Element element4 = document1.head();
        java.lang.String str5 = document1.nodeName();
        java.lang.String str6 = document1.id();
        java.lang.String str7 = document1.nodeName();
        org.jsoup.select.Elements elements9 = document1.getElementsByAttribute("hi!  #document");
        org.jsoup.select.Elements elements10 = document1.getAllElements();
        java.lang.String str12 = document1.attr("<html> <head></head> <body></body> </html>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
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
        java.lang.Integer int17 = element13.elementSiblingIndex();
        org.jsoup.nodes.Document document18 = element13.ownerDocument();
        java.lang.String str19 = document18.text();
        org.jsoup.select.Elements elements21 = document18.getElementsByAttribute("<#root></#root>hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = document18.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings22.prettyPrint(false);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(outputSettings24);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        boolean boolean3 = document1.isBlock();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str6 = document1.attr("hi!");
        java.lang.Integer int7 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element9 = document1.wrap("hi!");
        org.jsoup.nodes.Document document10 = document1.normalise();
        java.lang.String str12 = document10.attr("hi!  #document");
        document10.title("\n<head></head>");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = document10.childNodes();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
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
        boolean boolean22 = element5.hasAttr("#document <head></head>");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        org.jsoup.select.Elements elements4 = document1.getElementsContainingOwnText("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = document1.after("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(elements4);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!  #document", "#document");
        org.jsoup.select.Elements elements6 = document1.getElementsContainingText("hi!  #document");
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = document1.outputSettings();
        boolean boolean8 = outputSettings7.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings7.indentAmount(100);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(outputSettings10);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        boolean boolean3 = document1.isBlock();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str6 = document1.attr("hi!");
        java.lang.Integer int7 = document1.elementSiblingIndex();
        org.jsoup.select.Elements elements9 = document1.getElementsByIndexEquals((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = document1.getElementsByAttributeValueContaining("", "<#root hi! #document=\"#document\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.html("hi!");
        java.lang.Integer int11 = element10.elementSiblingIndex();
        boolean boolean13 = element10.hasAttr("#root");
        org.jsoup.nodes.Element element15 = element10.addClass("");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
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
        java.lang.String str22 = element19.className();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements25 = element19.getElementsByAttributeValueContaining("", "#root <html> <head></head> <body></body> </html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.select.Elements elements5 = document1.getElementsByIndexEquals(0);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str3, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element7 = document1.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element9 = document6.text("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str10 = element9.data();
        java.lang.String str11 = element9.val();
        java.lang.String str12 = element9.tagName();
        org.jsoup.select.Elements elements13 = element9.parents();
        org.jsoup.nodes.Element element14 = element9.parent();
        org.jsoup.select.Elements elements16 = element14.getElementsByAttribute("#root");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#root" + "'", str12, "#root");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
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
        org.jsoup.nodes.Attributes attributes26 = element25.attributes();
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
        org.junit.Assert.assertNotNull(attributes26);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.wrap("hi!");
        org.jsoup.nodes.Element element4 = document1.body();
        boolean boolean6 = document1.hasClass("hi!");
        java.lang.String str7 = document1.data();
        org.jsoup.nodes.Element element8 = document1.empty();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element12 = document10.html("");
        java.lang.String str13 = element12.className();
        org.jsoup.nodes.Element element14 = element12.empty();
        org.jsoup.select.Elements elements16 = element12.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element18 = element12.html("hi!");
        java.lang.String str19 = element18.html();
        org.jsoup.select.Elements elements21 = element18.getElementsByIndexGreaterThan((int) (byte) -1);
        org.jsoup.nodes.Element element22 = document1.appendChild((org.jsoup.nodes.Node) element18);
        org.jsoup.nodes.Element element24 = element22.removeClass("<#root hi!  #document=\"#document\"></#root>");
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.html("hi!");
        org.jsoup.nodes.Element element11 = element9.addClass("hi!  #document");
        boolean boolean12 = element11.hasText();
        org.jsoup.nodes.Element element14 = element11.append("\n<head></head>");
        org.jsoup.select.Elements elements15 = element11.children();
        org.jsoup.nodes.Element element16 = element11.parent();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNull(element16);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        java.lang.String str3 = document1.outerHtml();
        document1.title("#document");
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("#document");
        java.util.Set<java.lang.String> strSet8 = document7.classNames();
        org.jsoup.nodes.Element element9 = document1.classNames(strSet8);
        org.jsoup.select.Elements elements11 = element9.getElementsByIndexEquals((-1));
        boolean boolean12 = element9.hasText();
        org.jsoup.select.Elements elements14 = element9.getElementsContainingOwnText("#root");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str3, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
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
        org.jsoup.select.Elements elements19 = document1.getElementsMatchingOwnText("#root #document");
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
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        java.lang.String str8 = element7.html();
        org.jsoup.nodes.Element element10 = element7.append(" #document");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!  #document");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.Integer int3 = element2.elementSiblingIndex();
        element2.remove();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.appendText("hi!");
        java.lang.String str6 = element5.html();
        java.lang.String str7 = element5.text();
        org.jsoup.select.Elements elements9 = element5.getElementsByAttributeStarting("#root");
        org.jsoup.nodes.Element element11 = element5.prepend("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Node node13 = element5.removeAttr("hi! #document");
        org.jsoup.nodes.Element element15 = element5.getElementById(" hi!#root");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(element15);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        org.jsoup.nodes.Element element9 = element5.removeClass("");
        org.jsoup.parser.Tag tag10 = element9.tag();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str14 = document12.absUrl("#document");
        boolean boolean15 = element9.equals((java.lang.Object) document12);
        org.jsoup.select.Elements elements17 = element9.getElementsContainingOwnText("#root");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = element9.childNodes();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#documenthi!");
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueStarting("#document", "hi!  #document");
        boolean boolean13 = document1.hasClass("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.Set<java.lang.String> strSet14 = document1.classNames();
        org.jsoup.nodes.Document document15 = document1.normalise();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = document1.outputSettings();
        org.jsoup.nodes.Attributes attributes17 = document1.attributes();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        boolean boolean3 = document1.isBlock();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str6 = document1.attr("hi!");
        java.lang.Integer int7 = document1.elementSiblingIndex();
        org.jsoup.select.Elements elements9 = document1.getElementsByIndexEquals((int) (byte) 0);
        org.jsoup.nodes.Node node11 = document1.childNode(0);
        org.jsoup.select.Elements elements13 = document1.getElementsByAttributeStarting("hi!");
        org.jsoup.nodes.Element element15 = document1.text("body");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        java.lang.String str3 = document1.outerHtml();
        document1.title("#document");
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("#document");
        java.util.Set<java.lang.String> strSet8 = document7.classNames();
        org.jsoup.nodes.Element element9 = document1.classNames(strSet8);
        document1.title(" #document");
        org.jsoup.nodes.Document document12 = document1.normalise();
        org.jsoup.select.Elements elements15 = document1.getElementsByAttributeValue("#documenthi!", "hi!  #document");
        org.jsoup.nodes.Element element16 = document1.head();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str3, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document1.addClass("#document");
        java.util.Set<java.lang.String> strSet7 = element6.classNames();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = element6.dataset();
        java.lang.String str9 = element6.className();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " #document" + "'", str9, " #document");
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Element element4 = document1.head();
        java.lang.String str5 = document1.nodeName();
        java.lang.String str6 = document1.id();
        java.lang.String str7 = document1.nodeName();
        org.jsoup.select.Elements elements9 = document1.getElementsByAttribute("hi!  #document");
        org.jsoup.nodes.Element element11 = document1.prepend("#documenthi!");
        org.jsoup.nodes.Element element14 = element11.attr("#documenthi!", "");
        java.lang.String str15 = element11.tagName();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root" + "'", str15, "#root");
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.html("hi!");
        org.jsoup.nodes.Element element11 = element9.addClass("hi!  #document");
        boolean boolean12 = element11.hasText();
        boolean boolean13 = element11.hasText();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Element element4 = document1.head();
        java.lang.String str5 = document1.nodeName();
        java.lang.String str6 = document1.id();
        java.lang.String str7 = document1.nodeName();
        org.jsoup.select.Elements elements9 = document1.getElementsByAttribute("hi!  #document");
        org.jsoup.nodes.Element element11 = document1.prepend("#documenthi!");
        org.jsoup.nodes.Element element14 = element11.attr("#documenthi!", "");
        java.util.regex.Pattern pattern15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements16 = element14.getElementsMatchingOwnText(pattern15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<html> <head></head> <body></body> </html>");
        java.lang.String str2 = document1.className();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings3.prettyPrint(false);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(outputSettings5);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.html("#document");
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Document document8 = element3.ownerDocument();
        org.jsoup.select.Elements elements10 = document8.getElementsMatchingText(" hi!");
        java.lang.String str11 = document8.className();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.nodes.Attributes attributes9 = document1.attributes();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.siblingIndex();
        java.lang.String str5 = document1.data();
        org.jsoup.nodes.Element element6 = document1.empty();
        org.jsoup.nodes.Element element8 = element6.prependText("<#root hi!  #document=\"#document\"></#root>");
        org.jsoup.nodes.Element element10 = element8.appendText("<html>\n <head></head>\n <body></body>\n</html><#document></#document>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element6 = element3.append("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str8 = element3.absUrl("\n<<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
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
        java.lang.String str26 = element3.val();
        org.jsoup.nodes.Element element27 = element3.parent();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(element27);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = document1.createElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Node node6 = document1.removeAttr("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element8 = document1.addClass("");
        org.jsoup.nodes.Element element10 = document1.prepend("<html>\n <head>\n  <title> hi!</title>\n </head>\n <body>\n  #document\n </body>\n</html>");
        java.lang.String str11 = document1.val();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element11 = document9.html("");
        java.lang.String str12 = element11.className();
        boolean boolean14 = element11.hasClass("hi!");
        boolean boolean16 = element11.hasAttr("#document");
        java.lang.String str17 = element11.baseUri();
        org.jsoup.select.Elements elements20 = element11.getElementsByAttributeValueContaining("hi!  #document", "#root");
        java.util.Set<java.lang.String> strSet21 = element11.classNames();
        org.jsoup.nodes.Element element22 = element7.classNames(strSet21);
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element26 = document24.html("");
        org.jsoup.nodes.Element element28 = element26.appendText("hi!");
        java.lang.String str29 = element26.data();
        org.jsoup.nodes.Document document31 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element33 = document31.html("");
        java.lang.String str34 = element33.className();
        org.jsoup.nodes.Element element35 = element33.empty();
        java.lang.String str36 = element35.className();
        org.jsoup.nodes.Node node37 = element35.nextSibling();
        java.lang.String str38 = element35.className();
        org.jsoup.parser.Tag tag39 = element35.tag();
        org.jsoup.nodes.Document document41 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element42 = document41.head();
        org.jsoup.nodes.Element element43 = element35.prependChild((org.jsoup.nodes.Node) document41);
        boolean boolean44 = element26.equals((java.lang.Object) element35);
        java.util.Set<java.lang.String> strSet45 = element26.classNames();
        org.jsoup.nodes.Element element46 = element22.classNames(strSet45);
        org.jsoup.nodes.Document document48 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element49 = document48.head();
        java.lang.String str50 = document48.outerHtml();
        java.lang.Integer int51 = document48.siblingIndex();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = document48.outputSettings();
        java.lang.String str53 = document48.title();
        org.jsoup.select.Elements elements56 = document48.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body></body>\n</html>", "hi!  #document");
        org.jsoup.nodes.Element element57 = element46.prependChild((org.jsoup.nodes.Node) document48);
        org.jsoup.select.Elements elements58 = element46.children();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNull(element42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNull(element49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(outputSettings52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(elements56);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(elements58);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element7 = document1.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Attributes attributes8 = document1.attributes();
        document1.title("#document");
        org.jsoup.select.Elements elements11 = document1.getAllElements();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
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
        org.jsoup.nodes.Element element21 = element19.toggleClass("#document");
        org.jsoup.nodes.Element element23 = element21.appendElement("#document<#root>\n hi!\n</#root>");
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
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.html("#document");
        org.jsoup.select.Elements elements7 = element5.getElementsByAttributeStarting("#document");
        org.jsoup.nodes.Element element9 = element5.prependText("#document");
        org.jsoup.nodes.Element element11 = element9.getElementById("#root");
        java.lang.Integer int12 = element9.elementSiblingIndex();
        java.lang.String str13 = element9.val();
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element17 = document15.html("");
        org.jsoup.nodes.Element element19 = element17.html("#document");
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element23 = document21.html("");
        java.lang.String str24 = element23.className();
        org.jsoup.nodes.Element element25 = element23.empty();
        org.jsoup.select.Elements elements27 = element23.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element29 = element23.html("hi!");
        boolean boolean31 = element29.hasAttr("hi!");
        java.util.Set<java.lang.String> strSet32 = element29.classNames();
        org.jsoup.nodes.Element element33 = element19.classNames(strSet32);
        org.jsoup.nodes.Element element34 = element9.classNames(strSet32);
        java.util.regex.Pattern pattern35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements36 = element34.getElementsMatchingOwnText(pattern35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element34);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Element element8 = element5.removeClass("hi!");
        org.jsoup.nodes.Element element10 = element8.appendText("hi!");
        org.jsoup.select.Elements elements12 = element8.getElementsContainingOwnText("hi!  #document");
        org.jsoup.nodes.Node node14 = element8.removeAttr("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        boolean boolean18 = document16.hasClass("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element22 = document20.html("");
        java.lang.String str23 = element22.className();
        org.jsoup.nodes.Element element24 = element22.empty();
        org.jsoup.select.Elements elements26 = element22.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element28 = element22.html("hi!");
        boolean boolean29 = document16.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = document16.new OutputSettings();
        org.jsoup.nodes.Element element31 = element8.prependChild((org.jsoup.nodes.Node) document16);
        boolean boolean32 = element31.hasText();
        java.util.regex.Pattern pattern33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements34 = element31.getElementsMatchingOwnText(pattern33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("#document", "hi!");
        org.jsoup.nodes.Element element8 = document1.val("#root");
        org.jsoup.nodes.Element element10 = document1.prependText("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        java.lang.String str11 = element10.html();
        org.jsoup.select.Elements elements14 = element10.getElementsByAttributeValueContaining("hi!#root", "&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>" + "'", str11, "&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!  #document", "#document");
        org.jsoup.select.Elements elements6 = document1.getElementsContainingText("hi!  #document");
        java.lang.String str7 = document1.text();
        java.lang.String str9 = document1.absUrl("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str10 = document1.outerHtml();
        org.jsoup.nodes.Element element12 = document1.val("");
        java.lang.String str13 = element12.val();
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document15.attr("hi!  #document", "#document");
        org.jsoup.select.Elements elements20 = document15.getElementsContainingText("hi!  #document");
        java.lang.String str21 = document15.text();
        org.jsoup.nodes.Element element22 = element12.prependChild((org.jsoup.nodes.Node) document15);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(element22);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
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
        java.util.regex.Pattern pattern16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements17 = element15.getElementsMatchingOwnText(pattern16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
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
        java.lang.String str15 = element10.id();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependElement("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element10.siblingNodes();
        org.jsoup.nodes.Element element12 = element10.empty();
        org.jsoup.select.Elements elements14 = element10.getElementsByClass("#document");
        element10.remove();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
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
        org.jsoup.nodes.Document document21 = element5.ownerDocument();
        org.jsoup.select.Elements elements23 = element5.getElementsByClass("<html>\n <head>\n  <title> hi!</title>\n </head>\n <body>\n  #document\n </body>\n</html>");
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
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        java.lang.String str5 = element3.ownText();
        org.jsoup.select.Elements elements8 = element3.getElementsByAttributeValueMatching("hi!#root\n<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html>", "&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element10 = element3.getElementById("body");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNull(element10);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
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
        org.jsoup.nodes.Element element38 = element35.prependElement("hi!  #document");
        java.util.regex.Pattern pattern40 = null;
        org.jsoup.select.Elements elements41 = element35.getElementsByAttributeValueMatching("<#root hi!  #document=\"#document\"></#root>", pattern40);
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
        org.junit.Assert.assertNotNull(elements41);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.parser.Tag tag6 = document1.tag();
        org.jsoup.nodes.Element element8 = document1.createElement("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document1.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = document1.outputSettings();
        java.lang.String str11 = document1.outerHtml();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.select.Elements elements9 = element3.getElementsMatchingOwnText("hi!  #document");
        boolean boolean10 = element3.hasText();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Node node14 = document12.removeAttr("hi!");
        org.jsoup.nodes.Element element15 = element3.appendChild((org.jsoup.nodes.Node) document12);
        org.jsoup.nodes.Element element16 = document12.head();
        org.jsoup.nodes.Element element17 = document12.head();
        boolean boolean19 = document12.hasAttr("hi!  #document");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertNull(element17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements5 = document1.getElementsByTag("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Node node6 = document1.removeAttr("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element8 = document1.addClass("");
        boolean boolean10 = document1.hasClass("<html>\n <head></head>\n <body></body>\n</html><#root></#root>");
        org.jsoup.nodes.Document document11 = document1.normalise();
        org.jsoup.nodes.Element element13 = document1.text("<#root>\n <hi!  #document></hi!  #document>\n</#root>\n<html>\n <head></head>\n <body>\n  hi! #document\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
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
        org.jsoup.nodes.Element element22 = element20.prependElement(" #document");
        org.jsoup.nodes.Element element24 = element22.wrap("<#root></#root>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements25 = element24.siblingElements();
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
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNull(element24);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.nodes.Element element3 = document1.body();
        org.jsoup.nodes.Document document4 = document1.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = document4.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNotNull(document4);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element3.childNodes();
        org.jsoup.nodes.Element element9 = element3.toggleClass("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Node node11 = element9.removeAttr("#documenthi!");
        org.jsoup.select.Elements elements13 = element9.getElementsByIndexEquals(0);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
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
        boolean boolean20 = element7.hasClass("hi!  #document");
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element7 = document1.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element9 = document6.text("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element11 = document6.after("<html>\n <head></head>\n <body></body>\n</html>");
        boolean boolean13 = element11.hasAttr("hi!#root");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.html("hi!");
        java.lang.Integer int11 = element8.elementSiblingIndex();
        org.jsoup.nodes.Element element13 = element8.prepend(" #document");
        org.jsoup.select.Elements elements15 = element8.getElementsByAttribute(" hi!");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
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
        org.jsoup.nodes.Document document65 = element64.ownerDocument();
        boolean boolean66 = document65.hasText();
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
        org.junit.Assert.assertNotNull(document65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element7 = document1.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element9 = document6.text("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str10 = element9.data();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element14 = document12.html("");
        java.lang.String str15 = element14.className();
        org.jsoup.nodes.Element element16 = element14.empty();
        java.lang.String str17 = element16.className();
        org.jsoup.nodes.Element element19 = element16.removeClass("hi!");
        org.jsoup.nodes.Element element21 = element19.appendText("hi!");
        org.jsoup.select.Elements elements23 = element19.getElementsContainingOwnText("hi!  #document");
        java.util.regex.Pattern pattern25 = null;
        org.jsoup.select.Elements elements26 = element19.getElementsByAttributeValueMatching("<#root></#root>hi!", pattern25);
        boolean boolean28 = element19.hasAttr("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element29 = element9.prependChild((org.jsoup.nodes.Node) element19);
        java.lang.String str30 = element29.baseUri();
        boolean boolean32 = element29.hasClass("#document <head></head>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        boolean boolean3 = document1.isBlock();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str6 = document1.attr("#root");
        java.lang.String str7 = document1.val();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
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
        org.jsoup.nodes.Element element21 = document1.html("hi!");
        java.lang.String str22 = document1.data();
        java.lang.String str23 = document1.text();
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
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
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
        org.jsoup.select.Elements elements26 = element10.parents();
        org.jsoup.nodes.Node node27 = element10.nextSibling();
        java.util.Map<java.lang.String, java.lang.String> strMap28 = element10.dataset();
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
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(strMap28);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        boolean boolean7 = element5.hasClass("");
        java.lang.String str8 = element5.html();
        java.lang.String str9 = element5.text();
        org.jsoup.select.Elements elements12 = element5.getElementsByAttributeValueMatching("hi!", "hi!  #document");
        org.jsoup.select.Elements elements14 = element5.getElementsContainingOwnText("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Node node16 = element5.removeAttr("hi!");
        org.jsoup.select.Elements elements17 = element5.getAllElements();
        org.jsoup.nodes.Node node19 = element5.removeAttr(" #document");
        java.util.regex.Pattern pattern21 = null;
        org.jsoup.select.Elements elements22 = element5.getElementsByAttributeValueMatching("&lt;&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&gt;&lt;/&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&gt;", pattern21);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.wrap("hi!");
        org.jsoup.nodes.Element element4 = document1.body();
        boolean boolean6 = document1.hasClass("hi!");
        java.lang.String str7 = document1.data();
        org.jsoup.nodes.Element element8 = document1.empty();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document1.outputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = outputSettings9.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings9.indentAmount((int) (byte) 100);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings12);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
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
        org.jsoup.nodes.Element element66 = document1.prependText("hi! #document");
        org.jsoup.select.Elements elements69 = element66.getElementsByAttributeValueMatching("body", "<hi!  #document></hi!  #document>");
        java.lang.String str70 = element66.tagName();
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
        org.junit.Assert.assertNotNull(elements69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "#root" + "'", str70, "#root");
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = document1.outputSettings();
        java.lang.String str6 = document1.toString();
        org.jsoup.nodes.Element element8 = document1.createElement("#root");
        org.jsoup.nodes.Element element10 = document1.prependText(" #document");
        org.jsoup.select.Elements elements12 = document1.getElementsMatchingOwnText("hi!#root");
        org.jsoup.select.Elements elements14 = document1.getElementsMatchingOwnText("head");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.outputSettings();
        document1.title("hi!  #document");
        java.lang.String str6 = document1.title();
        org.jsoup.nodes.Element element8 = document1.toggleClass("<html>\n <head></head>\n <body></body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = document1.child((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!  #document" + "'", str6, "hi!  #document");
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
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
        org.jsoup.select.Elements elements44 = element3.getElementsByAttributeValueEnding("hi!#root <html> <head></head> <body></body> </html>", "#documenthi!");
        org.jsoup.nodes.Element element46 = element3.addClass("");
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
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(element46);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Element element6 = document1.createElement(" #document");
        org.jsoup.nodes.Element element8 = document1.addClass("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element8.getElementsByAttributeValueContaining("", "hi!#root");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.parser.Tag tag6 = document1.tag();
        org.jsoup.nodes.Element element8 = document1.createElement("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document1.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = document1.outputSettings();
        org.jsoup.select.Elements elements12 = document1.getElementsByIndexLessThan((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements15 = document1.getElementsByAttributeValueNot("", " #document");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.new OutputSettings();
        java.lang.String str4 = document1.id();
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("#document");
        java.util.Set<java.lang.String> strSet8 = document7.classNames();
        org.jsoup.nodes.Element element9 = document1.classNames(strSet8);
        org.jsoup.nodes.Element element11 = document1.val("#document");
        java.lang.String str12 = element11.tagName();
        org.jsoup.select.Elements elements13 = element11.parents();
        java.util.regex.Pattern pattern14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements15 = element11.getElementsMatchingOwnText(pattern14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#root" + "'", str12, "#root");
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependText("hi!");
        org.jsoup.select.Elements elements13 = element3.getElementsByAttributeValue("#documenthi!", "<html> \n <head></head> \n <body> \n </body>\n</html>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        org.jsoup.nodes.Element element9 = element5.removeClass("");
        org.jsoup.parser.Tag tag10 = element9.tag();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str14 = document12.absUrl("#document");
        boolean boolean15 = element9.equals((java.lang.Object) document12);
        org.jsoup.select.Elements elements17 = element9.getElementsContainingOwnText("#root");
        org.jsoup.select.Elements elements20 = element9.getElementsByAttributeValueContaining("<html>\n <head></head>\n <body></body>\n</html><#root></#root>", " #document");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttribute("hi!  #document");
        document1.setBaseUri("");
        org.jsoup.nodes.Element element13 = document1.head();
        java.lang.Integer int14 = document1.siblingIndex();
        org.jsoup.nodes.Element element15 = document1.parent();
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element19 = document17.html("");
        java.lang.String str20 = element19.className();
        org.jsoup.nodes.Element element21 = element19.empty();
        org.jsoup.nodes.Attributes attributes22 = element21.attributes();
        org.jsoup.select.Elements elements25 = element21.getElementsByAttributeValueContaining("#document", "#root");
        org.jsoup.select.Elements elements26 = element21.children();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = element15.equals((java.lang.Object) element21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(element15);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elements26);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
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
        org.jsoup.nodes.Element element15 = document10.text("#documenthi!");
        org.jsoup.select.Elements elements18 = element15.getElementsByAttributeValueNot("<html>\n <head></head>\n <body></body>\n</html>", " hi!#root");
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
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.wrap("hi!");
        org.jsoup.nodes.Element element4 = document1.body();
        boolean boolean6 = document1.hasClass("hi!");
        java.lang.String str7 = document1.data();
        org.jsoup.nodes.Element element8 = document1.empty();
        java.lang.String str9 = element8.toString();
        org.jsoup.nodes.Element element11 = element8.removeClass("<html> \n <head></head> \n <body> \n </body>\n</html>\n<html>\n <head></head>\n <body></body>\n</html>");
        boolean boolean13 = element8.hasAttr("<#root></#root>hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = element8.childNodes();
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.new OutputSettings();
        java.nio.charset.Charset charset4 = outputSettings3.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings3.escapeMode(escapeMode5);
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings6.prettyPrint(false);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(outputSettings8);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
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
        java.lang.String str19 = document12.val();
        java.lang.String str20 = document12.title();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!  #document");
        java.lang.String str2 = document1.val();
        java.lang.String str3 = document1.title();
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValue("<html>\n <head></head>\n <body></body>\n</html>", "#root");
        java.lang.String str7 = document1.nodeName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("#document", "hi!");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueNot("#document", "#document");
        org.jsoup.nodes.Element element11 = document1.text("#document");
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = document1.outputSettings();
        java.lang.String str13 = document1.className();
        document1.title("<html> \n <head></head> \n <body> \n </body>\n</html>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("#document", "hi!");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element9 = document1.head();
        java.lang.String str11 = document1.absUrl("hi!");
        org.jsoup.select.Elements elements12 = document1.getAllElements();
        org.jsoup.select.Elements elements14 = document1.getElementsByIndexGreaterThan((int) ' ');
        boolean boolean16 = document1.hasClass("<#root></#root>hi!");
        org.jsoup.nodes.Element element18 = document1.toggleClass("#document");
        org.jsoup.nodes.Element element19 = document1.head();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
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
        java.lang.String str14 = document7.title();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document" + "'", str10, "#document");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#root" + "'", str14, "#root");
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.nodes.Element element5 = element2.attr(" hi!#root", "#document");
        org.jsoup.select.Elements elements7 = element5.getElementsMatchingOwnText("#document hi! #document");
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.val("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements5 = element3.getElementsContainingOwnText("hi! #document<#root>\n #document<hi!></hi!>\n</#root>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
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
        java.lang.String str22 = document1.baseUri();
        org.jsoup.nodes.Element element24 = document1.append(" hi!");
        org.jsoup.select.Elements elements26 = document1.getElementsContainingText("hi!");
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements26);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
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
        boolean boolean20 = element18.hasAttr("<html><head></head><body></body></html>&lt;#root&gt;&lt;/#root&gt;hi!");
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = document1.nodeName();
        org.jsoup.select.Elements elements6 = document1.select("body");
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = document1.outputSettings();
        java.lang.String str8 = document1.outerHtml();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueNot("hi!  #document", "hi!");
        org.jsoup.select.Elements elements10 = document1.getElementsByTag("hi!");
        org.jsoup.nodes.Node node11 = document1.nextSibling();
        org.jsoup.select.Elements elements13 = document1.getElementsContainingOwnText("#document<#root>\n hi!\n</#root>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependElement("hi!");
        org.jsoup.nodes.Element element12 = element10.appendElement("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element13 = element10.parent();
        java.lang.String str14 = element10.baseUri();
        org.jsoup.parser.Tag tag15 = element10.tag();
        org.jsoup.nodes.Attributes attributes16 = element10.attributes();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element7 = document5.html("");
        java.lang.String str8 = element7.className();
        org.jsoup.nodes.Element element9 = element7.empty();
        org.jsoup.select.Elements elements11 = element7.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element13 = element7.html("hi!");
        boolean boolean14 = document1.equals((java.lang.Object) "hi!");
        boolean boolean16 = document1.hasClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = document1.new OutputSettings();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings17.charset("<html>\n <head></head>\n <body>\n  #document\n </body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: <html>? <head></head>? <body>?  #document? </body>?</html>");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
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
        org.jsoup.nodes.Element element27 = element13.previousElementSibling();
        java.lang.Integer int28 = element13.elementSiblingIndex();
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
        org.junit.Assert.assertNull(element27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Node node5 = document1.nextSibling();
        java.lang.String str6 = document1.html();
        org.jsoup.nodes.Node node8 = document1.removeAttr("hi!");
        java.lang.String str9 = document1.html();
        org.jsoup.select.Elements elements12 = document1.getElementsByAttributeValueMatching("\n<head></head>", "#root");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
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
        java.lang.String str19 = element10.tagName();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.html("hi!");
        boolean boolean11 = element9.hasAttr("hi!");
        java.util.Set<java.lang.String> strSet12 = element9.classNames();
        org.jsoup.select.Elements elements14 = element9.getElementsByAttribute("#root");
        org.jsoup.nodes.Element element16 = element9.appendText("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements18 = element16.getElementsContainingText("<html>\n <head></head>\n <body></body>\n</html><#document></#document>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
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
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document17.head();
        java.lang.String str19 = document17.outerHtml();
        java.lang.Integer int20 = document17.siblingIndex();
        org.jsoup.nodes.Document document21 = document17.ownerDocument();
        java.util.Set<java.lang.String> strSet22 = document21.classNames();
        org.jsoup.nodes.Element element23 = element15.classNames(strSet22);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        java.lang.Integer int5 = document1.siblingIndex();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.outputSettings();
        java.nio.charset.CharsetEncoder charsetEncoder7 = outputSettings6.encoder();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings6.escapeMode();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(charsetEncoder7);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
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
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = document1.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.prettyPrint(true);
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
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(outputSettings18);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
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
        org.jsoup.nodes.Node node28 = document1.removeAttr("<html>\n <head></head>\n <body>\n </body>\n</html><<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>");
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = document1.new OutputSettings();
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
        org.junit.Assert.assertNotNull(node28);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
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
        java.lang.Integer int38 = element31.siblingIndex();
        org.jsoup.nodes.Element element40 = element31.wrap("<#root></#root>hi!");
        org.jsoup.nodes.Node node41 = element31.previousSibling();
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(element40);
        org.junit.Assert.assertNull(node41);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
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
        java.lang.String str16 = document1.title();
        org.jsoup.nodes.Element element18 = document1.addClass("<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
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
        org.jsoup.select.Elements elements24 = element22.getElementsMatchingText("hi! #document<#root>\n #document<hi!></hi!>\n</#root>");
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
        org.junit.Assert.assertNotNull(elements24);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = document1.outputSettings();
        java.util.regex.Pattern pattern7 = null;
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueMatching("#root", pattern7);
        org.jsoup.select.Elements elements10 = document1.getElementsContainingOwnText("#document");
        // The following exception was thrown during execution in test generation
        try {
            document1.title("hi!#root <html> <head></head> <body></body> </html>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        boolean boolean9 = element7.hasAttr("hi!  #document");
        java.util.Set<java.lang.String> strSet10 = element7.classNames();
        org.jsoup.select.Elements elements13 = element7.getElementsByAttributeValueNot("#document", " #document");
        java.util.regex.Pattern pattern15 = null;
        org.jsoup.select.Elements elements16 = element7.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body></body>\n</html>", pattern15);
        org.jsoup.nodes.Attributes attributes17 = element7.attributes();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.html("hi!");
        org.jsoup.select.Elements elements11 = element3.getElementsContainingOwnText("#document");
        org.jsoup.nodes.Element element13 = element3.removeClass("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element14 = element3.parent();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueNot("hi!  #document", "hi!");
        org.jsoup.select.Elements elements10 = document1.getElementsByTag("hi!");
        org.jsoup.nodes.Element element12 = document1.append("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = document1.outputSettings();
        boolean boolean14 = outputSettings13.prettyPrint();
        boolean boolean15 = outputSettings13.prettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder16 = outputSettings13.encoder();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(charsetEncoder16);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.select.Elements elements6 = element3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.select.Elements elements8 = element3.getElementsContainingOwnText("#root");
        org.jsoup.nodes.Element element9 = element3.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element3.select("<html> <head></head> <body></body> </html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<html> <head></head> <body></body> </html>': unexpected token at '<html> <head></head> <body></body> </html>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!  #document", "#document");
        org.jsoup.select.Elements elements6 = document1.getElementsContainingText("hi!  #document");
        java.lang.String str7 = document1.text();
        java.lang.String str8 = document1.title();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
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
        org.jsoup.nodes.Node node13 = document9.nextSibling();
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
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Element element6 = element4.before("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element7 = element6.firstElementSibling();
        org.jsoup.nodes.Element element9 = element6.prependElement("hi! #document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element6.select("hi!#root\n<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'hi!#root?<html>? <head></head>? <body>?  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;? </body>?</html>': unexpected token at '!#root?<html>? <head></head>? <body>?  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;? </body>?</html>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        java.util.Set<java.lang.String> strSet3 = document1.classNames();
        org.jsoup.nodes.Element element5 = document1.val("hi!  #document");
        org.jsoup.nodes.Element element7 = document1.addClass("");
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node11 = document9.removeAttr("#document");
        org.jsoup.nodes.Element element12 = document9.body();
        document9.title("#root");
        org.jsoup.nodes.Document document15 = document9.ownerDocument();
        boolean boolean16 = element7.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements18 = element7.getElementsMatchingText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        org.jsoup.nodes.Element element27 = document20.classNames((java.util.Set<java.lang.String>) strSet25);
        org.jsoup.nodes.Element element29 = element27.html("hi!");
        java.lang.Integer int30 = element27.elementSiblingIndex();
        org.jsoup.nodes.Element element32 = element27.prepend(" #document");
        org.jsoup.select.Elements elements35 = element32.getElementsByAttributeValueEnding("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>", "<html>\n <head>\n  <title> hi!</title>\n </head>\n <body>\n  #document\n </body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            element7.replaceWith((org.jsoup.nodes.Node) element32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(elements35);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
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
        org.jsoup.select.Elements elements19 = element17.getElementsMatchingText("<html>\n <head></head>\n <body>\n  #document\n </body>\n</html>");
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
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
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
        boolean boolean50 = outputSettings11.prettyPrint();
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
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueNot("hi!  #document", "hi!");
        org.jsoup.select.Elements elements10 = document1.getElementsByTag("hi!");
        org.jsoup.nodes.Node node11 = document1.nextSibling();
        org.jsoup.nodes.Element element14 = document1.attr("&lt;&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&gt;&lt;/&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&gt;", "#documenthi!hi!");
        org.jsoup.nodes.Element element15 = element14.empty();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.append("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements5 = element3.getElementsMatchingOwnText("<#root></#root>hi!");
        org.jsoup.nodes.Element element7 = element3.removeClass("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements9 = element7.getElementsContainingText("");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        org.jsoup.select.Elements elements8 = element3.getElementsContainingText("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str9 = element3.data();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.html("hi!");
        boolean boolean11 = element9.hasAttr("hi!");
        java.util.Set<java.lang.String> strSet12 = element9.classNames();
        org.jsoup.nodes.Element element14 = element9.html("hi!  #document");
        java.lang.String str15 = element9.ownText();
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element19 = document17.html("");
        org.jsoup.select.Elements elements21 = document17.getElementsContainingText("");
        org.jsoup.nodes.Element element23 = document17.prependText("hi!");
        document17.setBaseUri("");
        org.jsoup.nodes.Document document27 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element29 = document27.html("");
        java.lang.String str30 = element29.className();
        org.jsoup.nodes.Element element31 = element29.empty();
        java.lang.String str32 = element31.className();
        org.jsoup.nodes.Node node33 = element31.nextSibling();
        java.lang.String str34 = element31.className();
        org.jsoup.select.Elements elements35 = element31.getAllElements();
        org.jsoup.nodes.Element element36 = document17.prependChild((org.jsoup.nodes.Node) element31);
        org.jsoup.select.Elements elements38 = element31.getElementsByAttribute("hi!  #document");
        org.jsoup.select.Elements elements39 = element31.parents();
        java.lang.String str40 = element31.ownText();
        org.jsoup.nodes.Element element41 = element31.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element42 = element9.prependChild((org.jsoup.nodes.Node) element41);
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
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! #document" + "'", str15, "hi! #document");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNull(element41);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
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
        org.jsoup.select.Elements elements20 = element13.getElementsByTag("hi!  #document");
        org.jsoup.nodes.Element element22 = element13.html("");
        org.jsoup.select.Elements elements24 = element22.getElementsMatchingOwnText("#documenthi!hi!");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
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
        org.jsoup.select.Elements elements20 = element5.getElementsMatchingText("#document");
        org.jsoup.nodes.Element element22 = element5.prependElement("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element24 = element22.after(" hi!");
        org.jsoup.nodes.Document document25 = element22.ownerDocument();
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
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(document25);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        boolean boolean9 = element7.hasAttr("hi!  #document");
        java.lang.String str10 = element7.tagName();
        java.lang.String str11 = element7.toString();
        org.jsoup.nodes.Document document12 = element7.ownerDocument();
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
        org.jsoup.nodes.Element element36 = element34.appendText("hi!");
        java.lang.String str37 = element36.html();
        java.lang.String str38 = element36.text();
        org.jsoup.nodes.Element element39 = element26.appendChild((org.jsoup.nodes.Node) element36);
        java.util.List<org.jsoup.nodes.Node> nodeList40 = element26.siblingNodes();
        boolean boolean41 = document12.equals((java.lang.Object) element26);
        org.jsoup.select.Elements elements42 = element26.siblingElements();
        org.jsoup.nodes.Element element44 = element26.appendText("<html>\n <head></head>\n <body></body>\n</html><#document></#document>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertNotNull(element44);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
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
        boolean boolean14 = outputSettings11.prettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder15 = outputSettings11.encoder();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(charsetEncoder15);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
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
        org.jsoup.nodes.Element element37 = element35.prependText("#root");
        org.jsoup.nodes.Element element39 = element37.prepend("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        java.lang.String str40 = element39.tagName();
        org.jsoup.nodes.Node node42 = element39.removeAttr("<#root hi! #document=\"#document\">");
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
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "#root" + "'", str40, "#root");
        org.junit.Assert.assertNotNull(node42);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = document1.outputSettings();
        java.lang.String str6 = document1.baseUri();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document1.addClass("#document");
        java.util.Set<java.lang.String> strSet7 = element6.classNames();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = element6.dataset();
        org.jsoup.nodes.Element element9 = element6.parent();
        org.jsoup.select.Elements elements11 = element6.getElementsContainingText("\n<head></head>");
        java.lang.String str12 = element6.baseUri();
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node16 = document14.removeAttr("#document");
        org.jsoup.select.Elements elements19 = document14.getElementsByAttributeValueContaining("#document", "hi!");
        org.jsoup.select.Elements elements21 = document14.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element22 = document14.head();
        java.lang.String str23 = document14.val();
        org.jsoup.nodes.Element element25 = document14.text("");
        org.jsoup.nodes.Element element26 = element6.appendChild((org.jsoup.nodes.Node) document14);
        document14.title("<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element7 = document1.prependChild((org.jsoup.nodes.Node) document6);
        java.lang.Integer int8 = document1.siblingIndex();
        org.jsoup.nodes.Element element10 = document1.toggleClass("");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        document1.setBaseUri("");
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = document1.outputSettings();
        org.jsoup.nodes.Element element12 = document1.prependElement("#root");
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element16 = document14.html("");
        java.lang.String str17 = element16.className();
        org.jsoup.nodes.Element element18 = element16.empty();
        boolean boolean20 = element18.hasClass("");
        java.lang.String str21 = element18.html();
        java.lang.String str22 = element18.text();
        org.jsoup.select.Elements elements25 = element18.getElementsByAttributeValueMatching("hi!", "hi!  #document");
        org.jsoup.select.Elements elements27 = element18.getElementsContainingOwnText("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Node node29 = element18.removeAttr("hi!");
        org.jsoup.select.Elements elements30 = element18.getAllElements();
        org.jsoup.nodes.Node node32 = element18.removeAttr(" #document");
        org.jsoup.nodes.Element element33 = element12.prependChild((org.jsoup.nodes.Node) element18);
        org.jsoup.nodes.Document document35 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element36 = document35.head();
        java.lang.String str37 = document35.outerHtml();
        java.lang.Integer int38 = document35.elementSiblingIndex();
        java.lang.String str39 = document35.nodeName();
        org.jsoup.nodes.Document document41 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        org.jsoup.nodes.Element element48 = document41.classNames((java.util.Set<java.lang.String>) strSet46);
        org.jsoup.nodes.Element element49 = document35.classNames((java.util.Set<java.lang.String>) strSet46);
        java.lang.String str50 = document35.className();
        org.jsoup.nodes.Element element51 = document35.empty();
        org.jsoup.nodes.Document document53 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet54 = document53.classNames();
        org.jsoup.nodes.Element element55 = document35.classNames(strSet54);
        org.jsoup.select.Elements elements58 = element55.getElementsByAttributeValueNot("<#root>\n #root\n <html>\n  <head></head>\n  <body>\n   &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n  </body>\n </html>\n</#root>", "<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        boolean boolean59 = element33.equals((java.lang.Object) element55);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNull(element36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "#document" + "'", str39, "#document");
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!  #document" + "'", str50, "hi!  #document");
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(document53);
        org.junit.Assert.assertNotNull(strSet54);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNotNull(elements58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Node node6 = document1.removeAttr("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element8 = document1.addClass("");
        org.jsoup.nodes.Element element10 = document1.val("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements12 = element10.getElementsMatchingText("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements15 = element10.getElementsByAttributeValue(" hi!#root", "<html> <head></head> <body></body> </html>");
        java.lang.String str16 = element10.baseUri();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.nodes.Attributes attributes6 = element5.attributes();
        org.jsoup.select.Elements elements9 = element5.getElementsByAttributeValueContaining("#document", "#root");
        org.jsoup.select.Elements elements12 = element5.getElementsByAttributeValueEnding("#document", "#document");
        org.jsoup.select.Elements elements14 = element5.getElementsByIndexLessThan((int) (byte) 100);
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("\n<head></head>");
        org.jsoup.nodes.Element element17 = element5.prependChild((org.jsoup.nodes.Node) document16);
        boolean boolean19 = element5.hasAttr("hi!#root <html> <head></head> <body></body> </html>");
        java.lang.String str20 = element5.data();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document(" #document");
        java.lang.String str2 = document1.className();
        java.lang.String str3 = document1.title();
        java.lang.String str4 = document1.nodeName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
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
        java.lang.String str20 = document1.title();
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
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
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
        org.jsoup.select.Elements elements19 = element10.getElementsByIndexEquals((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.nodes.Element element9 = document1.head();
        org.jsoup.nodes.Element element10 = document1.body();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = document1.new OutputSettings();
        java.lang.String str12 = document1.ownText();
        org.jsoup.nodes.Element element13 = document1.body();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(element13);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element9 = element3.empty();
        org.jsoup.nodes.Element element10 = element3.parent();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = element3.dataset();
        org.jsoup.select.Elements elements14 = element3.getElementsByAttributeValueNot("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>", "<hi!  #document></hi!  #document>");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.html("");
        java.lang.String str19 = element18.className();
        org.jsoup.nodes.Element element20 = element18.empty();
        boolean boolean22 = element20.hasClass("");
        java.lang.String str23 = element20.html();
        java.lang.String str24 = element20.text();
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element28 = document26.html("");
        java.lang.String str29 = element28.className();
        org.jsoup.nodes.Element element30 = element28.empty();
        boolean boolean32 = element30.hasClass("");
        java.lang.String str33 = element30.html();
        java.lang.String str34 = element30.text();
        org.jsoup.select.Elements elements37 = element30.getElementsByAttributeValueMatching("hi!", "hi!  #document");
        org.jsoup.select.Elements elements40 = element30.getElementsByAttributeValue("hi!", "#document");
        org.jsoup.nodes.Element element42 = element30.appendElement("hi!  #document");
        org.jsoup.nodes.Element element43 = element20.appendChild((org.jsoup.nodes.Node) element42);
        org.jsoup.nodes.Document document44 = element42.ownerDocument();
        org.jsoup.select.Elements elements46 = element42.getElementsByTag("<html>\n <head>\n  <title> hi!</title>\n </head>\n <body>\n  #document\n </body>\n</html>");
        java.util.Map<java.lang.String, java.lang.String> strMap47 = element42.dataset();
        org.jsoup.nodes.Node node48 = element42.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element49 = element3.appendChild(node48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNull(node48);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
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
        org.jsoup.nodes.Element element21 = document1.html("hi!");
        java.lang.String str22 = document1.data();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = document1.childNodes();
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
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(nodeList23);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        java.lang.String str8 = element3.className();
        org.jsoup.nodes.Element element11 = element3.attr("hi!  #document", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements13 = element3.getElementsByIndexLessThan(100);
        java.lang.String str14 = element3.toString();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
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
        org.jsoup.select.Elements elements17 = document10.getElementsByIndexLessThan((int) (short) 0);
        java.lang.String str18 = document10.nodeName();
        org.jsoup.select.Elements elements21 = document10.getElementsByAttributeValueMatching("hi!#root", "<html> <head> <title>#root</title> </head> <body></body> </html>");
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
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#document" + "'", str18, "#document");
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!  #document");
        java.lang.String str2 = document1.title();
        org.jsoup.nodes.Element element3 = document1.empty();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element8 = document5.attr("hi!  #document", "#document");
        org.jsoup.select.Elements elements10 = document5.getElementsContainingText("hi!  #document");
        boolean boolean12 = document5.hasAttr("#document");
        org.jsoup.nodes.Element element13 = element3.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("#document");
        org.jsoup.nodes.Element element16 = document15.empty();
        org.jsoup.nodes.Document document17 = document15.normalise();
        org.jsoup.nodes.Element element19 = document15.append("#document");
        java.lang.String str20 = element19.text();
        org.jsoup.nodes.Element element23 = element19.attr("hi!", "<#root hi!  #document=\"#document\"></#root>");
        boolean boolean25 = element23.hasClass("hi!");
        org.jsoup.nodes.Element element26 = element13.prependChild((org.jsoup.nodes.Node) element23);
        org.jsoup.select.Elements elements29 = element13.getElementsByAttributeValueNot("<hi!  #document></hi!  #document>", "hi! #document");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#document" + "'", str20, "#document");
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements29);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
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
        org.jsoup.nodes.Element element16 = document1.createElement("<html>\n <head></head>\n <body>\n  #document\n </body>\n</html>");
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
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.html("hi!");
        org.jsoup.nodes.Element element11 = element9.addClass("hi!  #document");
        boolean boolean12 = element11.hasText();
        org.jsoup.nodes.Element element14 = element11.append("\n<head></head>");
        java.lang.Integer int15 = element14.siblingIndex();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document1.addClass("#document");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueContaining("#document<#root>\n hi!\n</#root>", "hi!");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        boolean boolean7 = element5.hasClass("");
        java.lang.String str8 = element5.html();
        java.lang.String str9 = element5.text();
        org.jsoup.select.Elements elements12 = element5.getElementsByAttributeValueMatching("hi!", "hi!  #document");
        org.jsoup.select.Elements elements15 = element5.getElementsByAttributeValue("hi!", "#document");
        java.lang.String str16 = element5.id();
        java.lang.String str17 = element5.className();
        org.jsoup.nodes.Attributes attributes18 = element5.attributes();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
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
        java.lang.String str19 = document1.nodeName();
        java.lang.String str20 = document1.ownText();
        org.jsoup.select.Elements elements22 = document1.getElementsMatchingOwnText("\n<body></body>");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#document" + "'", str19, "#document");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueNot("hi!  #document", "hi!");
        org.jsoup.select.Elements elements10 = document1.getElementsByTag("hi!");
        org.jsoup.nodes.Element element12 = document1.append("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = document1.outputSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = document1.childNodes();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!  #document", "#document");
        org.jsoup.select.Elements elements6 = document1.getElementsContainingText("hi!  #document");
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = document1.outputSettings();
        int int8 = outputSettings7.indentAmount();
        java.nio.charset.CharsetEncoder charsetEncoder9 = outputSettings7.encoder();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(charsetEncoder9);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        boolean boolean7 = element5.hasClass("");
        java.lang.String str8 = element5.html();
        java.lang.String str9 = element5.text();
        org.jsoup.select.Elements elements12 = element5.getElementsByAttributeValueMatching("hi!", "hi!  #document");
        org.jsoup.select.Elements elements14 = element5.getElementsContainingOwnText("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str15 = element5.ownText();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependElement("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element10.siblingNodes();
        org.jsoup.nodes.Element element12 = element10.empty();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = element12.childNodes();
        org.jsoup.select.Elements elements16 = element12.getElementsByAttributeValueStarting("\n<body></body>", "hi!");
        org.jsoup.nodes.Element element18 = element12.toggleClass("hi!#root <html> <head></head> <body></body> </html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueStarting("#document", "hi!  #document");
        org.jsoup.nodes.Document document12 = document1.normalise();
        java.lang.String str13 = document1.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements15 = document1.getElementsByAttributeStarting("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#document" + "'", str13, "#document");
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
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
        org.jsoup.select.Elements elements26 = element10.parents();
        org.jsoup.nodes.Node node27 = element10.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = node27.baseUri();
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
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.parser.Tag tag6 = document1.tag();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet9 = document8.classNames();
        java.util.Set<java.lang.String> strSet10 = document8.classNames();
        org.jsoup.nodes.Element element11 = document1.classNames(strSet10);
        org.jsoup.nodes.Element element13 = element11.prepend(" hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements15 = element13.select("<html>\n <head></head>\n <body></body>\n</html><#root></#root>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<html>? <head></head>? <body></body>?</html><#root></#root>': unexpected token at '<html>? <head></head>? <body></body>?</html><#root></#root>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.select.Elements elements6 = document1.getElementsMatchingText("");
        org.jsoup.nodes.Element element8 = document1.html("hi!  #document");
        java.lang.String str9 = element8.html();
        boolean boolean10 = element8.isBlock();
        boolean boolean11 = element8.isBlock();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! #document" + "'", str9, "hi! #document");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.outputSettings();
        document1.title("hi!  #document");
        java.lang.String str6 = document1.title();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = document1.outputSettings();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!  #document" + "'", str6, "hi!  #document");
        org.junit.Assert.assertNotNull(outputSettings7);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = document1.outputSettings();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.createElement("<html>\n <head></head>\n <body>\n </body>\n</html><<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>");
        java.util.regex.Pattern pattern8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = document1.getElementsMatchingOwnText(pattern8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
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
        org.jsoup.nodes.Element element24 = element21.attr("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>", "<#root></#root>hi!");
        java.util.regex.Pattern pattern25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements26 = element24.getElementsMatchingText(pattern25);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#document" + "'", str19, "#document");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.outputSettings();
        boolean boolean7 = outputSettings6.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings6.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings6.prettyPrint(false);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(outputSettings11);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
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
        java.util.regex.Pattern pattern19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements20 = document1.getElementsMatchingOwnText(pattern19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Element element8 = element5.removeClass("hi!");
        org.jsoup.nodes.Element element10 = element8.appendText("hi!");
        org.jsoup.select.Elements elements12 = element8.getElementsContainingOwnText("hi!  #document");
        java.util.regex.Pattern pattern14 = null;
        org.jsoup.select.Elements elements15 = element8.getElementsByAttributeValueMatching("<#root></#root>hi!", pattern14);
        boolean boolean17 = element8.hasAttr("<html>\n <head></head>\n <body></body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = element8.previousElementSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
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
        org.jsoup.select.Elements elements24 = element21.getAllElements();
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements29 = document26.getElementsByAttributeValueStarting("#root", "hi!  #document");
        java.lang.String str30 = document26.html();
        org.jsoup.nodes.Document document32 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        org.jsoup.nodes.Element element39 = document32.classNames((java.util.Set<java.lang.String>) strSet37);
        org.jsoup.select.Elements elements42 = document32.getElementsByAttributeValueStarting("#document", "hi!  #document");
        org.jsoup.nodes.Document document43 = document32.normalise();
        org.jsoup.nodes.Document document45 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element47 = document45.html("");
        org.jsoup.nodes.Element element49 = element47.html("#document");
        org.jsoup.nodes.Document document51 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element53 = document51.html("");
        java.lang.String str54 = element53.className();
        org.jsoup.nodes.Element element55 = element53.empty();
        org.jsoup.select.Elements elements57 = element53.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element59 = element53.html("hi!");
        boolean boolean61 = element59.hasAttr("hi!");
        java.util.Set<java.lang.String> strSet62 = element59.classNames();
        org.jsoup.nodes.Element element63 = element49.classNames(strSet62);
        org.jsoup.nodes.Element element64 = document32.classNames(strSet62);
        org.jsoup.nodes.Element element66 = element64.prependText("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element68 = element66.prependText("#root");
        org.jsoup.nodes.Element element69 = document26.appendChild((org.jsoup.nodes.Node) element66);
        java.lang.String str70 = element69.tagName();
        element21.replaceWith((org.jsoup.nodes.Node) element69);
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
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNotNull(elements57);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(strSet62);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertNotNull(element66);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertNotNull(element69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "#root" + "'", str70, "#root");
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.select.Elements elements5 = document3.getElementsMatchingText("#document");
        java.util.regex.Pattern pattern7 = null;
        org.jsoup.select.Elements elements8 = document3.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body></body>\n</html>", pattern7);
        org.jsoup.select.Elements elements10 = document3.getElementsContainingText("hi! #document<#root>\n #document<hi!></hi!>\n</#root>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
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
        element21.remove();
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
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
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
        org.jsoup.select.Elements elements31 = element27.getElementsByTag("<html>\n <head>\n  <title> hi!</title>\n </head>\n <body>\n  #document\n </body>\n</html>");
        java.util.Map<java.lang.String, java.lang.String> strMap32 = element27.dataset();
        java.lang.String str34 = element27.attr("#root");
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
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.html("#document");
        org.jsoup.select.Elements elements7 = element5.getElementsByAttributeStarting("#document");
        org.jsoup.nodes.Element element9 = element5.prependText("#document");
        org.jsoup.nodes.Element element11 = element9.getElementById("#root");
        java.lang.Integer int12 = element9.elementSiblingIndex();
        java.lang.String str13 = element9.val();
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element17 = document15.html("");
        org.jsoup.nodes.Element element19 = element17.html("#document");
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element23 = document21.html("");
        java.lang.String str24 = element23.className();
        org.jsoup.nodes.Element element25 = element23.empty();
        org.jsoup.select.Elements elements27 = element23.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element29 = element23.html("hi!");
        boolean boolean31 = element29.hasAttr("hi!");
        java.util.Set<java.lang.String> strSet32 = element29.classNames();
        org.jsoup.nodes.Element element33 = element19.classNames(strSet32);
        org.jsoup.nodes.Element element34 = element9.classNames(strSet32);
        org.jsoup.nodes.Document document36 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element38 = document36.removeClass("");
        org.jsoup.nodes.Element element40 = element38.toggleClass("hi!");
        org.jsoup.nodes.Document document41 = element40.ownerDocument();
        org.jsoup.select.Elements elements43 = element40.getElementsByIndexGreaterThan(0);
        boolean boolean44 = element34.equals((java.lang.Object) elements43);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!  #document", "#document");
        org.jsoup.select.Elements elements6 = document1.getElementsContainingText("hi!  #document");
        java.lang.String str7 = document1.className();
        java.util.Set<java.lang.String> strSet8 = document1.classNames();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document1.outputSettings();
        java.lang.String str10 = document1.baseUri();
        org.jsoup.parser.Tag tag11 = document1.tag();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("hi!");
        org.jsoup.nodes.Element element5 = document1.appendText("<#root></#root>hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
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
        org.jsoup.select.Elements elements20 = document12.getElementsByAttributeStarting("hi! #document<#root>\n #document<hi!></hi!>\n</#root>");
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
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.appendText("hi!");
        java.lang.String str6 = element3.data();
        java.lang.String str7 = element3.html();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document1.addClass("#document");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.select.Elements elements9 = element7.getElementsContainingText("hi!  #document");
        org.jsoup.nodes.Element element11 = element7.wrap("hi!");
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element14 = document13.head();
        java.lang.String str15 = document13.outerHtml();
        java.lang.Integer int16 = document13.elementSiblingIndex();
        java.lang.String str17 = document13.nodeName();
        org.jsoup.nodes.Element element19 = document13.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = document13.outputSettings();
        java.nio.charset.Charset charset21 = outputSettings20.charset();
        boolean boolean22 = element7.equals((java.lang.Object) outputSettings20);
        boolean boolean23 = element7.hasText();
        org.jsoup.select.Elements elements24 = element7.parents();
        org.jsoup.select.Elements elements25 = element7.children();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#document" + "'", str17, "#document");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNotNull(charset21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.new OutputSettings();
        java.lang.String str4 = document1.id();
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("#document");
        java.util.Set<java.lang.String> strSet8 = document7.classNames();
        org.jsoup.nodes.Element element9 = document1.classNames(strSet8);
        org.jsoup.nodes.Element element11 = document1.val("#document");
        boolean boolean12 = document1.hasText();
        org.jsoup.select.Elements elements14 = document1.getElementsByClass("\n<<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!  #document", "#document");
        org.jsoup.select.Elements elements6 = document1.getElementsContainingText("hi!  #document");
        java.util.regex.Pattern pattern8 = null;
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueMatching("#document", pattern8);
        org.jsoup.select.Elements elements11 = document1.getElementsByClass("hi!#root\n<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = document1.nextElementSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.html("hi!");
        java.lang.Integer int11 = element8.elementSiblingIndex();
        java.lang.String str12 = element8.tagName();
        boolean boolean14 = element8.hasClass("#document");
        java.lang.String str15 = element8.tagName();
        org.jsoup.select.Elements elements16 = element8.parents();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#root" + "'", str12, "#root");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root" + "'", str15, "#root");
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.nodes.Element element10 = document1.addClass("");
        org.jsoup.select.Elements elements11 = document1.children();
        org.jsoup.select.Elements elements14 = document1.getElementsByAttributeValueStarting("\n<head></head>", "<html><head></head><body></body></html>&lt;#root&gt;&lt;/#root&gt;hi!");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.outputSettings();
        org.jsoup.select.Elements elements8 = document1.getElementsByIndexGreaterThan(0);
        org.jsoup.nodes.Element element10 = document1.prependText("<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.outputSettings();
        document1.title("hi!  #document");
        java.lang.String str6 = document1.title();
        org.jsoup.nodes.Element element8 = document1.toggleClass("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Attributes attributes9 = element8.attributes();
        org.jsoup.select.Elements elements11 = element8.getElementsMatchingOwnText("<html>\n <head></head>\n <body></body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = element8.childNode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!  #document" + "'", str6, "hi!  #document");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!  #document");
        boolean boolean2 = document1.isBlock();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = document1.child((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements3);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.nodes.Attributes attributes6 = element5.attributes();
        org.jsoup.select.Elements elements9 = element5.getElementsByAttributeValueContaining("#document", "#root");
        org.jsoup.select.Elements elements12 = element5.getElementsByAttributeValueEnding("#document", "#document");
        org.jsoup.select.Elements elements14 = element5.getElementsByIndexLessThan((int) (byte) 100);
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("\n<head></head>");
        org.jsoup.nodes.Element element17 = element5.prependChild((org.jsoup.nodes.Node) document16);
        org.jsoup.select.Elements elements20 = document16.getElementsByAttributeValueContaining("<html>\n <head></head>\n <body>\n </body>\n</html><<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>", "hi!#root\n<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html>");
        org.jsoup.nodes.Element element22 = document16.prependElement("<#root hi! #document=\"#document\">");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element22);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.html("hi!");
        org.jsoup.nodes.Element element11 = element3.appendText("#root");
        java.lang.String str12 = element3.html();
        org.jsoup.nodes.Element element14 = element3.wrap("<#root></#root>");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap15 = element14.dataset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!#root" + "'", str12, "hi!#root");
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
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
        org.jsoup.nodes.Element element37 = element35.prependText("#root");
        org.jsoup.nodes.Element element39 = element37.append("<#root></#root>hi!");
        java.util.Set<java.lang.String> strSet40 = element37.classNames();
        org.jsoup.select.Elements elements43 = element37.getElementsByAttributeValueContaining("#document<#root>\n hi!\n</#root>", "#documenthi!");
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
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNotNull(elements43);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.head();
        java.lang.String str5 = element4.baseUri();
        java.lang.String str6 = element4.toString();
        java.lang.String str7 = element4.baseUri();
        java.lang.Class<?> wildcardClass8 = element4.getClass();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n<head></head>" + "'", str6, "\n<head></head>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.html("hi!");
        java.lang.Integer int11 = element8.elementSiblingIndex();
        java.lang.String str12 = element8.tagName();
        boolean boolean14 = element8.hasClass("#document");
        java.lang.String str15 = element8.tagName();
        org.jsoup.select.Elements elements17 = element8.getElementsContainingText("hi!#root");
        org.jsoup.nodes.Element element18 = element8.empty();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#root" + "'", str12, "#root");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root" + "'", str15, "#root");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
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
        org.jsoup.select.Elements elements20 = document1.getElementsMatchingText("#document");
        org.jsoup.select.Elements elements21 = document1.children();
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
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueStarting("#root", "hi!  #document");
        java.lang.String str5 = document1.baseUri();
        java.lang.String str6 = document1.outerHtml();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!  #document");
        java.lang.String str2 = document1.val();
        java.lang.String str3 = document1.title();
        java.lang.String str4 = document1.nodeName();
        org.jsoup.nodes.Element element5 = document1.body();
        java.util.Set<java.lang.String> strSet6 = document1.classNames();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNull(element5);
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.select.Elements elements6 = element3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.select.Elements elements8 = element3.getElementsContainingOwnText("#root");
        org.jsoup.nodes.Element element9 = element3.empty();
        org.jsoup.select.Elements elements11 = element9.getElementsByIndexGreaterThan((int) (byte) 1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
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
        org.jsoup.select.Elements elements24 = document1.getElementsContainingText("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element26 = document1.removeClass("#root");
        org.jsoup.select.Elements elements29 = document1.getElementsByAttributeValueMatching("", "&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
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
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements29);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueNot("hi!  #document", "hi!");
        org.jsoup.select.Elements elements10 = document1.getElementsByTag("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = document1.outputSettings();
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node15 = document13.removeAttr("#document");
        org.jsoup.nodes.Element element16 = document13.head();
        org.jsoup.nodes.Node node17 = document13.nextSibling();
        org.jsoup.nodes.Document document18 = document13.normalise();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = document13.outputSettings();
        java.nio.charset.Charset charset20 = outputSettings19.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings11.charset(charset20);
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertNotNull(outputSettings21);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.select.Elements elements6 = element3.getElementsByIndexLessThan((int) (short) 10);
        java.lang.String str7 = element3.data();
        org.jsoup.nodes.Document document8 = element3.ownerDocument();
        org.jsoup.select.Elements elements10 = document8.getElementsByClass("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements12 = document8.getElementsByIndexEquals((int) '#');
        org.jsoup.nodes.Element element14 = document8.toggleClass(" #document");
        org.jsoup.select.Elements elements16 = element14.getElementsByAttribute("body");
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
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
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
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = document1.outputSettings();
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node21 = document19.removeAttr("#document");
        org.jsoup.select.Elements elements24 = document19.getElementsByAttributeValueContaining("#document", "hi!");
        org.jsoup.select.Elements elements26 = document19.getElementsByAttribute("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = document19.outputSettings();
        boolean boolean28 = document1.equals((java.lang.Object) document19);
        java.lang.Integer int29 = document19.siblingIndex();
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
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
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
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings12.prettyPrint(false);
        java.nio.charset.Charset charset16 = outputSettings12.charset();
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
        org.junit.Assert.assertNotNull(charset16);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueStarting("#document", "hi!  #document");
        org.jsoup.nodes.Document document12 = document1.normalise();
        java.util.Set<java.lang.String> strSet13 = document1.classNames();
        org.jsoup.nodes.Element element14 = document1.body();
        org.jsoup.nodes.Element element16 = document1.append("<html> <head></head> <body></body> </html>");
        java.lang.String str17 = document1.nodeName();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#document" + "'", str17, "#document");
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependElement("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element10.siblingNodes();
        org.jsoup.nodes.Element element12 = element10.empty();
        org.jsoup.nodes.Element element14 = element10.html("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str15 = element10.ownText();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        boolean boolean7 = element5.hasClass("");
        java.lang.String str8 = element5.html();
        java.lang.String str9 = element5.text();
        org.jsoup.select.Elements elements12 = element5.getElementsByAttributeValueMatching("hi!", "hi!  #document");
        org.jsoup.nodes.Element element15 = element5.attr("#root", "");
        java.lang.String str16 = element5.className();
        org.jsoup.select.Elements elements18 = element5.getElementsMatchingText("#documenthi!");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element21 = document20.head();
        java.lang.String str22 = document20.outerHtml();
        java.lang.Integer int23 = document20.elementSiblingIndex();
        org.jsoup.nodes.Element element25 = document20.addClass("#document");
        boolean boolean26 = element5.equals((java.lang.Object) document20);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueStarting("#document", "hi!  #document");
        boolean boolean13 = document1.hasClass("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element15 = document1.appendElement("#root <html> <head></head> <body></body> </html>");
        java.lang.String str16 = element15.toString();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n<#root <html> <head></head> <body></body> </html>></#root <html> <head></head> <body></body> </html>>" + "'", str16, "\n<#root <html> <head></head> <body></body> </html>></#root <html> <head></head> <body></body> </html>>");
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.nodes.Document document3 = document1.normalise();
        document3.title("hi!  #document");
        org.jsoup.nodes.Node node6 = document3.nextSibling();
        org.jsoup.select.Elements elements8 = document3.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document3.new OutputSettings();
        java.lang.String str10 = document3.nodeName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document" + "'", str10, "#document");
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("#document", "hi!");
        org.jsoup.nodes.Element element8 = document1.val("#root");
        org.jsoup.nodes.Element element10 = document1.prependText("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        document1.title("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        boolean boolean14 = document1.hasAttr("<html>\n <head>\n  <title> hi!</title>\n </head>\n <body>\n  #document\n </body>\n</html>");
        java.lang.String str15 = document1.nodeName();
        java.lang.String str16 = document1.title();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#document" + "'", str15, "#document");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>" + "'", str16, "&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element7 = document5.html("");
        java.lang.String str8 = element7.className();
        org.jsoup.nodes.Element element9 = element7.empty();
        org.jsoup.select.Elements elements11 = element7.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element13 = element7.html("hi!");
        boolean boolean14 = document1.equals((java.lang.Object) "hi!");
        boolean boolean16 = document1.hasClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = document1.new OutputSettings();
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet20 = document19.classNames();
        boolean boolean21 = document19.isBlock();
        java.lang.Integer int22 = document19.elementSiblingIndex();
        java.lang.String str24 = document19.attr("hi!");
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element28 = document26.html("");
        java.lang.String str29 = element28.className();
        boolean boolean31 = element28.hasClass("hi!");
        boolean boolean33 = element28.hasAttr("#document");
        org.jsoup.nodes.Element element35 = element28.prependText("hi!");
        org.jsoup.nodes.Element element37 = element35.prependText("#document");
        java.lang.String str38 = element35.html();
        java.util.Set<java.lang.String> strSet39 = element35.classNames();
        org.jsoup.nodes.Element element40 = document19.classNames(strSet39);
        org.jsoup.nodes.Element element41 = document1.classNames(strSet39);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "#documenthi!" + "'", str38, "#documenthi!");
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element41);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
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
        org.jsoup.nodes.Element element21 = document1.head();
        boolean boolean23 = document1.hasClass("<html>\n <head>\n  <title> hi!</title>\n </head>\n <body>\n  #document\n </body>\n</html>");
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
        org.junit.Assert.assertNull(element21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!  #document", "#document");
        org.jsoup.select.Elements elements6 = document1.getElementsContainingText("hi!  #document");
        java.lang.String str7 = document1.className();
        java.util.Set<java.lang.String> strSet8 = document1.classNames();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document1.outputSettings();
        org.jsoup.nodes.Element element11 = document1.removeClass(" #document");
        java.lang.String str12 = document1.ownText();
        boolean boolean14 = document1.hasClass("<#root></#root>");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
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
        org.jsoup.nodes.Element element21 = document1.head();
        org.jsoup.nodes.Element element22 = document1.body();
        org.jsoup.nodes.Document document23 = document1.normalise();
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
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(document23);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        org.jsoup.nodes.Element element9 = element5.removeClass("");
        org.jsoup.parser.Tag tag10 = element9.tag();
        boolean boolean12 = element9.hasAttr(" #document");
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element16 = document14.wrap("hi!");
        org.jsoup.nodes.Element element17 = document14.body();
        boolean boolean19 = document14.hasClass("hi!");
        java.lang.String str20 = document14.data();
        org.jsoup.nodes.Element element21 = document14.empty();
        org.jsoup.select.Elements elements22 = document14.getAllElements();
        org.jsoup.nodes.Element element24 = document14.createElement("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element25 = element9.appendChild((org.jsoup.nodes.Node) element24);
        org.jsoup.nodes.Element element26 = element9.empty();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertNull(element17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.parser.Tag tag6 = document1.tag();
        org.jsoup.nodes.Element element8 = document1.createElement("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements10 = document1.getElementsByClass("#document");
        org.jsoup.nodes.Attributes attributes11 = document1.attributes();
        org.jsoup.nodes.Element element13 = document1.val("#document");
        org.jsoup.nodes.Element element15 = element13.html(" #document");
        element15.setBaseUri("#root");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document1.append("#document");
        java.lang.String str6 = document1.text();
        org.jsoup.nodes.Element element8 = document1.appendElement("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        boolean boolean9 = document1.hasText();
        org.jsoup.nodes.Element element11 = document1.val("<html>\n <head></head>\n <body></body>\n</html><#root></#root>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
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
        org.jsoup.nodes.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            document1.replaceWith(node21);
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
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        boolean boolean5 = element3.hasClass("#document");
        org.jsoup.select.Elements elements6 = element3.parents();
        java.lang.String str7 = element3.toString();
        java.lang.String str8 = element3.ownText();
        org.jsoup.select.Elements elements9 = element3.parents();
        org.jsoup.select.Elements elements11 = element3.getElementsByAttributeStarting("#documenthi!");
        org.jsoup.nodes.Element element13 = element3.prepend("#document hi! #document");
        org.jsoup.nodes.Element element15 = element3.removeClass("#documenthi!hi!");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        java.lang.String str8 = element7.html();
        org.jsoup.select.Elements elements9 = element7.parents();
        java.lang.Integer int10 = element7.elementSiblingIndex();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element14 = document12.html("");
        org.jsoup.nodes.Element element16 = element14.appendText("hi!");
        java.lang.String str17 = element14.data();
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element21 = document19.html("");
        java.lang.String str22 = element21.className();
        org.jsoup.nodes.Element element23 = element21.empty();
        java.lang.String str24 = element23.className();
        org.jsoup.nodes.Node node25 = element23.nextSibling();
        java.lang.String str26 = element23.className();
        org.jsoup.parser.Tag tag27 = element23.tag();
        org.jsoup.nodes.Document document29 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element30 = document29.head();
        org.jsoup.nodes.Element element31 = element23.prependChild((org.jsoup.nodes.Node) document29);
        boolean boolean32 = element14.equals((java.lang.Object) element23);
        org.jsoup.select.Elements elements34 = element23.getElementsByIndexEquals((int) '4');
        org.jsoup.nodes.Element element36 = element23.addClass("#root");
        org.jsoup.nodes.Element element37 = element7.appendChild((org.jsoup.nodes.Node) element36);
        org.jsoup.nodes.Element element39 = element36.prependText("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document41 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element43 = document41.html("");
        java.lang.String str44 = element43.className();
        boolean boolean46 = element43.hasClass("hi!");
        java.lang.String str47 = element43.tagName();
        org.jsoup.nodes.Element element48 = element36.prependChild((org.jsoup.nodes.Node) element43);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element50 = element36.getElementById("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNull(element30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "#root" + "'", str47, "#root");
        org.junit.Assert.assertNotNull(element48);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!  #document");
        java.lang.String str2 = document1.title();
        java.util.regex.Pattern pattern4 = null;
        org.jsoup.select.Elements elements5 = document1.getElementsByAttributeValueMatching("", pattern4);
        java.lang.String str6 = document1.outerHtml();
        java.lang.String str7 = document1.val();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = document1.select("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = document1.outputSettings();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(outputSettings4);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.html("hi!");
        java.lang.Integer int10 = element3.siblingIndex();
        org.jsoup.select.Elements elements13 = element3.getElementsByAttributeValue("<#root></#root>hi!", "hi!#root");
        org.jsoup.select.Elements elements15 = element3.getElementsByAttributeStarting("#document <head></head>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependElement("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = element10.dataset();
        org.jsoup.nodes.Element element13 = element10.after("hi!  #document");
        org.jsoup.select.Elements elements15 = element13.getElementsByIndexGreaterThan((int) ' ');
        java.lang.String str16 = element13.tagName();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.select.Elements elements5 = document1.children();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        org.jsoup.nodes.Element element7 = document1.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document8 = element7.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Element element5 = document1.append("hi!  #document");
        org.jsoup.nodes.Element element7 = element5.prependText("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
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
        java.lang.Class<?> wildcardClass26 = element3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("body");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        boolean boolean9 = element3.hasClass("#document");
        org.jsoup.nodes.Element element12 = element3.attr("#document", "#root");
        org.jsoup.select.Elements elements14 = element12.getElementsByIndexGreaterThan((int) (byte) 0);
        org.jsoup.select.Elements elements15 = element12.getAllElements();
        java.lang.String str16 = element12.baseUri();
        org.jsoup.nodes.Element element18 = element12.addClass("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            element18.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.nodes.Element element9 = document1.head();
        org.jsoup.nodes.Element element11 = document1.prepend("#document");
        java.lang.String str12 = element11.className();
        java.util.regex.Pattern pattern14 = null;
        org.jsoup.select.Elements elements15 = element11.getElementsByAttributeValueMatching("hi!#root", pattern14);
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.val("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str5 = document1.absUrl("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str7 = document1.attr("<html>\n <head></head>\n <body>\n </body>\n</html><<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>");
        java.lang.String str8 = document1.baseUri();
        java.lang.String str9 = document1.title();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = document1.child(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
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
        boolean boolean16 = outputSettings14.prettyPrint();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings14.charset("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: <html>? <head>?  <title>#root</title>? </head>? <body></body>?</html>");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        int int9 = outputSettings8.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings8.prettyPrint(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings11.escapeMode();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.wrap("hi!");
        org.jsoup.nodes.Element element4 = document1.body();
        boolean boolean6 = document1.hasClass("hi!");
        java.lang.String str7 = document1.data();
        java.lang.Integer int8 = document1.elementSiblingIndex();
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueEnding("<#root hi! #document=\"#document\">", "<#root></#root>hi!");
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        org.jsoup.nodes.Element element9 = element5.removeClass("");
        org.jsoup.parser.Tag tag10 = element9.tag();
        boolean boolean12 = element9.hasAttr(" #document");
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element16 = document14.wrap("hi!");
        org.jsoup.nodes.Element element17 = document14.body();
        boolean boolean19 = document14.hasClass("hi!");
        java.lang.String str20 = document14.data();
        org.jsoup.nodes.Element element21 = document14.empty();
        org.jsoup.select.Elements elements22 = document14.getAllElements();
        org.jsoup.nodes.Element element24 = document14.createElement("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element25 = element9.appendChild((org.jsoup.nodes.Node) element24);
        org.jsoup.nodes.Element element27 = element9.appendText("hi! #document<#root>\n #document<hi!></hi!>\n</#root>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertNull(element17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.html("hi!");
        org.jsoup.select.Elements elements11 = element3.getElementsContainingOwnText("#document");
        org.jsoup.nodes.Element element13 = element3.removeClass("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements16 = element3.getElementsByAttributeValueContaining("<#root></#root>", "hi!  #document");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
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
        org.jsoup.select.Elements elements18 = element3.getElementsByIndexLessThan(0);
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element22 = document20.html("");
        org.jsoup.select.Elements elements24 = document20.getElementsContainingText("");
        org.jsoup.nodes.Element element26 = document20.prependText("hi!");
        document20.setBaseUri("");
        boolean boolean30 = document20.hasClass("");
        org.jsoup.nodes.Element element31 = document20.empty();
        java.lang.String str32 = document20.title();
        // The following exception was thrown during execution in test generation
        try {
            element3.replaceWith((org.jsoup.nodes.Node) document20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("#document", "hi!");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueNot("#document", "#document");
        org.jsoup.nodes.Element element11 = document1.text("#document");
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = document1.outputSettings();
        java.lang.String str13 = document1.className();
        org.jsoup.select.Elements elements15 = document1.getElementsContainingText("");
        org.jsoup.nodes.Node node16 = document1.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = document1.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        boolean boolean7 = element5.hasClass("");
        java.lang.String str8 = element5.html();
        java.util.regex.Pattern pattern10 = null;
        org.jsoup.select.Elements elements11 = element5.getElementsByAttributeValueMatching("", pattern10);
        java.lang.Integer int12 = element5.elementSiblingIndex();
        org.jsoup.nodes.Document document13 = element5.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = element5.previousElementSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(document13);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
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
        java.lang.String str22 = element20.className();
        java.lang.String str23 = element20.text();
        org.jsoup.select.Elements elements25 = element20.getElementsByIndexGreaterThan(1);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " #document" + "'", str22, " #document");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        org.jsoup.nodes.Element element3 = document1.parent();
        org.jsoup.nodes.Element element4 = document1.empty();
        org.jsoup.select.Elements elements6 = element4.getElementsByTag("hi!#root\n<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html>");
        org.jsoup.select.Elements elements8 = element4.getElementsContainingText("<#root hi!  #document=\"#document\"></#root>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.nodes.Document document5 = document1.ownerDocument();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        org.jsoup.nodes.Element element8 = document1.prependText("<#root></#root>");
        org.jsoup.select.Elements elements9 = document1.children();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.removeClass("#document");
        org.jsoup.select.Elements elements6 = element5.getAllElements();
        org.jsoup.nodes.Element element8 = element5.addClass("\n<head></head>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
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
        java.util.regex.Pattern pattern30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements31 = document14.getElementsMatchingText(pattern30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("#document", "hi!");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element9 = document1.head();
        java.lang.String str11 = document1.absUrl("hi!");
        org.jsoup.select.Elements elements12 = document1.getAllElements();
        org.jsoup.select.Elements elements14 = document1.getElementsByIndexGreaterThan((int) ' ');
        org.jsoup.nodes.Document document15 = document1.normalise();
        boolean boolean16 = document15.hasText();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document1.addClass("#document");
        java.util.Set<java.lang.String> strSet7 = element6.classNames();
        java.lang.Integer int8 = element6.elementSiblingIndex();
        org.jsoup.nodes.Document document9 = element6.ownerDocument();
        java.lang.String str10 = document9.text();
        org.jsoup.nodes.Element element11 = document9.head();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList12 = element11.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(element11);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.removeClass("#document");
        org.jsoup.select.Elements elements7 = element3.getElementsMatchingText("hi!  #document");
        org.jsoup.nodes.Element element9 = element3.prependText("");
        java.lang.String str10 = element3.className();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("&lt;&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&gt;&lt;/&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&gt;");
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        boolean boolean9 = element7.hasAttr("hi!  #document");
        java.lang.String str10 = element7.tagName();
        org.jsoup.select.Elements elements12 = element7.getElementsMatchingOwnText("");
        org.jsoup.nodes.Element element14 = element7.appendText("<#root hi!  #document=\"#document\"></#root>");
        org.jsoup.nodes.Element element16 = element14.toggleClass("<#root>\n <hi!  #document></hi!  #document>\n</#root>\n<html>\n <head></head>\n <body>\n  hi! #document\n </body>\n</html>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
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
        org.jsoup.nodes.Node node18 = document13.removeAttr("body");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.parser.Tag tag6 = document1.tag();
        org.jsoup.nodes.Element element8 = document1.val("");
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueMatching("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; #document &lt;/body&gt; &lt;/html&gt;#root\n<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html>", "<html> \n <head></head> \n <body> \n </body>\n</html>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element12 = document1.head();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNull(element12);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element7 = document1.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element9 = document6.text("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str10 = element9.data();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element14 = document12.html("");
        java.lang.String str15 = element14.className();
        org.jsoup.nodes.Element element16 = element14.empty();
        java.lang.String str17 = element16.className();
        org.jsoup.nodes.Element element19 = element16.removeClass("hi!");
        org.jsoup.nodes.Element element21 = element19.appendText("hi!");
        org.jsoup.select.Elements elements23 = element19.getElementsContainingOwnText("hi!  #document");
        java.util.regex.Pattern pattern25 = null;
        org.jsoup.select.Elements elements26 = element19.getElementsByAttributeValueMatching("<#root></#root>hi!", pattern25);
        boolean boolean28 = element19.hasAttr("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element29 = element9.prependChild((org.jsoup.nodes.Node) element19);
        java.lang.String str30 = element29.baseUri();
        org.jsoup.select.Elements elements32 = element29.getElementsByIndexLessThan((int) (short) 10);
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(elements32);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        java.lang.String str8 = element7.html();
        org.jsoup.select.Elements elements9 = element7.parents();
        java.lang.Integer int10 = element7.elementSiblingIndex();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element14 = document12.html("");
        org.jsoup.nodes.Element element16 = element14.appendText("hi!");
        java.lang.String str17 = element14.data();
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element21 = document19.html("");
        java.lang.String str22 = element21.className();
        org.jsoup.nodes.Element element23 = element21.empty();
        java.lang.String str24 = element23.className();
        org.jsoup.nodes.Node node25 = element23.nextSibling();
        java.lang.String str26 = element23.className();
        org.jsoup.parser.Tag tag27 = element23.tag();
        org.jsoup.nodes.Document document29 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element30 = document29.head();
        org.jsoup.nodes.Element element31 = element23.prependChild((org.jsoup.nodes.Node) document29);
        boolean boolean32 = element14.equals((java.lang.Object) element23);
        org.jsoup.select.Elements elements34 = element23.getElementsByIndexEquals((int) '4');
        org.jsoup.nodes.Element element36 = element23.addClass("#root");
        org.jsoup.nodes.Element element37 = element7.appendChild((org.jsoup.nodes.Node) element36);
        org.jsoup.select.Elements elements39 = element7.getElementsContainingOwnText("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.regex.Pattern pattern40 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements41 = element7.getElementsMatchingOwnText(pattern40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNull(element30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements39);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = document1.createElement("hi!");
        java.util.Set<java.lang.String> strSet6 = document1.classNames();
        org.jsoup.nodes.Element element8 = document1.appendText("#document");
        java.lang.String str9 = document1.nodeName();
        java.lang.String str10 = document1.title();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        boolean boolean9 = element7.hasAttr("hi!  #document");
        java.lang.String str10 = element7.tagName();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document12.head();
        java.lang.String str14 = document12.outerHtml();
        java.lang.Integer int15 = document12.elementSiblingIndex();
        org.jsoup.nodes.Element element17 = document12.addClass("#document");
        boolean boolean19 = element17.hasClass("hi!");
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        org.jsoup.nodes.Element element28 = document21.classNames((java.util.Set<java.lang.String>) strSet26);
        org.jsoup.select.Elements elements31 = document21.getElementsByAttributeValueStarting("#document", "hi!  #document");
        org.jsoup.nodes.Document document32 = document21.normalise();
        org.jsoup.nodes.Document document34 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element36 = document34.html("");
        org.jsoup.nodes.Element element38 = element36.html("#document");
        org.jsoup.nodes.Document document40 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element42 = document40.html("");
        java.lang.String str43 = element42.className();
        org.jsoup.nodes.Element element44 = element42.empty();
        org.jsoup.select.Elements elements46 = element42.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element48 = element42.html("hi!");
        boolean boolean50 = element48.hasAttr("hi!");
        java.util.Set<java.lang.String> strSet51 = element48.classNames();
        org.jsoup.nodes.Element element52 = element38.classNames(strSet51);
        org.jsoup.nodes.Element element53 = document21.classNames(strSet51);
        org.jsoup.nodes.Element element54 = element17.classNames(strSet51);
        org.jsoup.nodes.Element element55 = element7.classNames(strSet51);
        java.lang.String str56 = element55.id();
        java.lang.String str58 = element55.absUrl("#document");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.outputSettings();
        org.jsoup.select.Elements elements8 = document1.getElementsByIndexGreaterThan(0);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document1.outputSettings();
        org.jsoup.select.Elements elements12 = document1.getElementsByAttributeValueMatching("hi!  #document", "#root");
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element15 = document14.head();
        java.lang.String str16 = document14.outerHtml();
        java.lang.Integer int17 = document14.elementSiblingIndex();
        java.lang.String str18 = document14.nodeName();
        org.jsoup.nodes.Element element20 = document14.removeClass("");
        boolean boolean22 = element20.hasAttr("hi!  #document");
        java.util.Set<java.lang.String> strSet23 = element20.classNames();
        org.jsoup.nodes.Element element24 = document1.classNames(strSet23);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element26 = element24.before("hi!#root <html> <head></head> <body></body> </html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#document" + "'", str18, "#document");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
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
        org.jsoup.nodes.Node node19 = element17.removeAttr("hi!  #document");
        java.lang.String str20 = element17.ownText();
        org.jsoup.nodes.Element element22 = element17.append(" hi!");
        org.jsoup.nodes.Element element24 = element22.appendElement("<html>\n <head></head>\n <body></body>\n</html><#root></#root>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#document" + "'", str20, "#document");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Node node6 = document1.removeAttr("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element8 = document1.addClass("");
        org.jsoup.nodes.Element element10 = document1.val("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = document1.dataset();
        org.jsoup.nodes.Element element12 = document1.body();
        java.lang.String str13 = element12.tagName();
        java.lang.String str14 = element12.html();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "body" + "'", str13, "body");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!  #document");
        java.lang.String str2 = document1.title();
        org.jsoup.nodes.Element element3 = document1.empty();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element8 = document5.attr("hi!  #document", "#document");
        org.jsoup.select.Elements elements10 = document5.getElementsContainingText("hi!  #document");
        boolean boolean12 = document5.hasAttr("#document");
        org.jsoup.nodes.Element element13 = element3.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element16 = document15.head();
        java.lang.String str17 = document15.outerHtml();
        java.lang.Integer int18 = document15.elementSiblingIndex();
        org.jsoup.nodes.Element element20 = document15.addClass("#document");
        org.jsoup.nodes.Element element21 = document5.appendChild((org.jsoup.nodes.Node) element20);
        org.jsoup.select.Elements elements22 = element20.children();
        java.lang.String str23 = element20.data();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element9 = element3.empty();
        org.jsoup.nodes.Element element11 = element9.addClass("#root <html> <head></head> <body></body> </html>");
        org.jsoup.parser.Tag tag12 = element11.tag();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
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
        java.util.Map<java.lang.String, java.lang.String> strMap19 = element13.dataset();
        org.jsoup.nodes.Element element20 = element13.empty();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
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
        org.jsoup.select.Elements elements30 = element26.getElementsMatchingText("#document");
        org.jsoup.nodes.Node node32 = element26.removeAttr("hi!");
        org.jsoup.nodes.Element element35 = element26.attr("<html> <head></head> <body></body> </html>", "");
        java.util.regex.Pattern pattern36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements37 = element26.getElementsMatchingOwnText(pattern36);
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
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(element35);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.select.Elements elements5 = document1.children();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        java.lang.String str7 = document1.tagName();
        java.lang.String str8 = document1.className();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#root" + "'", str7, "#root");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.parser.Tag tag6 = document1.tag();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet9 = document8.classNames();
        java.util.Set<java.lang.String> strSet10 = document8.classNames();
        org.jsoup.nodes.Element element11 = document1.classNames(strSet10);
        java.lang.String str12 = element11.toString();
        java.lang.String str13 = element11.tagName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = element11.before("#document <head></head>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#root" + "'", str13, "#root");
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!  #document");
        java.lang.String str2 = document1.title();
        org.jsoup.nodes.Element element3 = document1.empty();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element8 = document5.attr("hi!  #document", "#document");
        org.jsoup.select.Elements elements10 = document5.getElementsContainingText("hi!  #document");
        boolean boolean12 = document5.hasAttr("#document");
        org.jsoup.nodes.Element element13 = element3.appendChild((org.jsoup.nodes.Node) document5);
        java.lang.String str14 = element3.tagName();
        org.jsoup.parser.Tag tag15 = element3.tag();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#root" + "'", str14, "#root");
        org.junit.Assert.assertNotNull(tag15);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        org.jsoup.select.Elements elements8 = element7.parents();
        java.lang.String str9 = element7.baseUri();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        org.jsoup.select.Elements elements4 = document1.getElementsByTag("#document");
        org.jsoup.nodes.Element element6 = document1.html("hi!");
        org.jsoup.select.Elements elements9 = element6.getElementsByAttributeValueContaining("#document", "<#root hi!  #document=\"#document\"></#root>");
        org.jsoup.nodes.Element element11 = element6.prependElement("hi! #document");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
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
            org.jsoup.nodes.Element element24 = element22.after("<#root></#root>");
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
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element7 = document1.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element9 = document6.text("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str10 = element9.data();
        java.lang.String str11 = element9.val();
        java.lang.String str12 = element9.tagName();
        org.jsoup.select.Elements elements13 = element9.parents();
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("hi!  #document");
        org.jsoup.nodes.Element element16 = document15.body();
        org.jsoup.nodes.Element element17 = element9.appendChild((org.jsoup.nodes.Node) document15);
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node21 = document19.removeAttr("#document");
        org.jsoup.nodes.Element element22 = document19.head();
        org.jsoup.nodes.Node node23 = document19.nextSibling();
        org.jsoup.nodes.Document document24 = document19.normalise();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = document19.outputSettings();
        java.lang.String str26 = document19.title();
        element17.replaceWith((org.jsoup.nodes.Node) document19);
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#root" + "'", str12, "#root");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        boolean boolean9 = element7.hasAttr("hi!  #document");
        java.util.Set<java.lang.String> strSet10 = element7.classNames();
        java.lang.String str12 = element7.absUrl("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = element7.dataset();
        org.jsoup.nodes.Element element15 = element7.toggleClass("<#root hi!  #document=\"#document\"></#root>");
        org.jsoup.nodes.Element element17 = element15.val("<html> <head></head> <body></body> </html>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
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
        java.util.regex.Pattern pattern23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements24 = element7.getElementsMatchingOwnText(pattern23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.select.Elements elements4 = element2.getElementsByIndexLessThan(1);
        java.util.regex.Pattern pattern5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = element2.getElementsMatchingOwnText(pattern5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements4);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
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
        java.lang.Integer int27 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element29 = document1.prependText("#root");
        org.jsoup.select.Elements elements32 = document1.getElementsByAttributeValue("#root <html> <head></head> <body></body> </html>", "hi!  #document");
        org.jsoup.select.Elements elements35 = document1.getElementsByAttributeValueNot("<html>\n <head></head>\n <body>\n  #document\n </body>\n</html>", "hi!#root\n<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html>");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(elements35);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
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
        // The following exception was thrown during execution in test generation
        try {
            element14.remove();
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
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.outputSettings();
        org.jsoup.select.Elements elements8 = document1.getElementsByIndexGreaterThan(0);
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element11 = document10.head();
        java.lang.String str12 = document10.outerHtml();
        java.lang.Integer int13 = document10.elementSiblingIndex();
        org.jsoup.nodes.Element element15 = document10.addClass("#document");
        org.jsoup.nodes.Element element16 = element15.empty();
        org.jsoup.select.Elements elements19 = element16.getElementsByAttributeValueMatching("", "hi!  #document");
        org.jsoup.nodes.Element element21 = element16.removeClass("hi!  #document");
        org.jsoup.nodes.Element element23 = element16.toggleClass("hi!  #document");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = element23.childNodes();
        org.jsoup.nodes.Element element26 = element23.val("hi!");
        org.jsoup.nodes.Element element27 = document1.appendChild((org.jsoup.nodes.Node) element26);
        org.jsoup.select.Elements elements29 = element26.getElementsByAttributeStarting("hi! #document");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements29);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.outputSettings();
        document1.title("hi!  #document");
        java.lang.String str6 = document1.nodeName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueStarting("#document", "hi!  #document");
        java.lang.String str12 = document1.title();
        org.jsoup.nodes.Element element14 = document1.prependElement("#root");
        org.jsoup.select.Elements elements16 = element14.getElementsByIndexGreaterThan(10);
        org.jsoup.select.Elements elements17 = element14.parents();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        java.lang.String str6 = document1.ownText();
        document1.setBaseUri("&lt;&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&gt;&lt;/&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&gt;");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
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
        org.jsoup.select.Elements elements17 = document10.getElementsByIndexLessThan((int) (short) 0);
        java.lang.String str18 = document10.nodeName();
        org.jsoup.nodes.Element element20 = document10.addClass("hi!#root");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = document10.dataset();
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
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#document" + "'", str18, "#document");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(strMap21);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.html("#document");
        org.jsoup.parser.Tag tag6 = element5.tag();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element10 = document8.html("");
        java.lang.String str11 = element10.className();
        org.jsoup.nodes.Element element12 = element10.empty();
        java.lang.String str13 = element12.className();
        org.jsoup.nodes.Node node14 = element12.nextSibling();
        org.jsoup.nodes.Element element16 = element12.removeClass("");
        org.jsoup.parser.Tag tag17 = element16.tag();
        boolean boolean18 = element5.equals((java.lang.Object) element16);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element20 = element5.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
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
        boolean boolean16 = outputSettings15.prettyPrint();
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str19 = document18.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = document18.new OutputSettings();
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element23 = document22.head();
        java.lang.String str24 = document22.outerHtml();
        java.lang.Integer int25 = document22.elementSiblingIndex();
        java.lang.String str26 = document22.nodeName();
        org.jsoup.nodes.Element element28 = document22.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = document22.outputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = outputSettings29.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings20.escapeMode(escapeMode30);
        int int32 = outputSettings20.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings20.prettyPrint(true);
        java.nio.charset.CharsetEncoder charsetEncoder35 = outputSettings34.encoder();
        org.jsoup.nodes.Entities.EscapeMode escapeMode36 = outputSettings34.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings15.escapeMode(escapeMode36);
        java.nio.charset.CharsetEncoder charsetEncoder38 = outputSettings15.encoder();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#document" + "'", str19, "#document");
        org.junit.Assert.assertNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#document" + "'", str26, "#document");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertTrue("'" + escapeMode30 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode30.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertNotNull(charsetEncoder35);
        org.junit.Assert.assertTrue("'" + escapeMode36 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode36.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertNotNull(charsetEncoder38);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
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
        java.lang.String str14 = document11.data();
        java.lang.String str16 = document11.absUrl("<#root hi!  #document=\"#document\"></#root>");
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element19 = document18.head();
        java.lang.String str20 = document18.outerHtml();
        java.lang.Integer int21 = document18.elementSiblingIndex();
        java.lang.String str22 = document18.nodeName();
        org.jsoup.parser.Tag tag23 = document18.tag();
        org.jsoup.nodes.Element element25 = document18.createElement("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements27 = document18.getElementsByClass("#document");
        org.jsoup.nodes.Attributes attributes28 = document18.attributes();
        java.lang.String str29 = document18.title();
        java.util.Set<java.lang.String> strSet30 = document18.classNames();
        org.jsoup.nodes.Element element31 = document11.classNames(strSet30);
        org.jsoup.nodes.Node node32 = document11.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = node32.baseUri();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#document" + "'", str22, "#document");
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNull(node32);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!  #document", "#document");
        org.jsoup.select.Elements elements6 = document1.getElementsContainingText("hi!  #document");
        java.lang.String str7 = document1.className();
        java.util.Set<java.lang.String> strSet8 = document1.classNames();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document1.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.indentAmount((int) ' ');
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(outputSettings11);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
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
        int int15 = outputSettings3.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = outputSettings3.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings3.prettyPrint(false);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings18);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = document1.toString();
        java.lang.String str5 = document1.title();
        document1.setBaseUri(" hi!");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttribute("<html>\n <head></head>\n <body>\n  #document\n </body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<html>\n <head>\n  <title> hi!</title>\n </head>\n <body>\n  #document\n </body>\n</html>");
        org.jsoup.nodes.Element element3 = document1.addClass("<html>\n <head></head>\n <body>\n  #document\n </body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        document1.title("#root");
        document1.title("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str9 = document1.className();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = document1.outputSettings();
        java.lang.String str6 = document1.title();
        org.jsoup.select.Elements elements7 = document1.getAllElements();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element10 = document9.head();
        java.lang.String str11 = document9.outerHtml();
        java.lang.Integer int12 = document9.elementSiblingIndex();
        java.lang.String str13 = document9.nodeName();
        org.jsoup.nodes.Element element15 = document9.removeClass("");
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element19 = document17.html("");
        java.lang.String str20 = element19.className();
        boolean boolean22 = element19.hasClass("hi!");
        boolean boolean24 = element19.hasAttr("#document");
        java.lang.String str25 = element19.baseUri();
        org.jsoup.select.Elements elements28 = element19.getElementsByAttributeValueContaining("hi!  #document", "#root");
        java.util.Set<java.lang.String> strSet29 = element19.classNames();
        org.jsoup.nodes.Element element30 = element15.classNames(strSet29);
        org.jsoup.nodes.Document document32 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element34 = document32.html("");
        org.jsoup.nodes.Element element36 = element34.appendText("hi!");
        java.lang.String str37 = element34.data();
        org.jsoup.nodes.Document document39 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element41 = document39.html("");
        java.lang.String str42 = element41.className();
        org.jsoup.nodes.Element element43 = element41.empty();
        java.lang.String str44 = element43.className();
        org.jsoup.nodes.Node node45 = element43.nextSibling();
        java.lang.String str46 = element43.className();
        org.jsoup.parser.Tag tag47 = element43.tag();
        org.jsoup.nodes.Document document49 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element50 = document49.head();
        org.jsoup.nodes.Element element51 = element43.prependChild((org.jsoup.nodes.Node) document49);
        boolean boolean52 = element34.equals((java.lang.Object) element43);
        java.util.Set<java.lang.String> strSet53 = element34.classNames();
        org.jsoup.nodes.Element element54 = element30.classNames(strSet53);
        org.jsoup.nodes.Element element55 = document1.classNames(strSet53);
        org.jsoup.nodes.Document document57 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element59 = document57.html("");
        java.lang.String str60 = element59.className();
        boolean boolean62 = element59.hasClass("hi!");
        boolean boolean64 = element59.hasAttr("#document");
        org.jsoup.nodes.Element element65 = element59.empty();
        org.jsoup.nodes.Element element66 = element59.parent();
        java.util.Map<java.lang.String, java.lang.String> strMap67 = element59.dataset();
        org.jsoup.select.Elements elements70 = element59.getElementsByAttributeValueNot("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>", "<hi!  #document></hi!  #document>");
        org.jsoup.nodes.Element element72 = element59.removeClass("<#root>\n #root\n <html>\n  <head></head>\n  <body>\n   &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n  </body>\n </html>\n</#root>");
        boolean boolean73 = element55.equals((java.lang.Object) element72);
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#document" + "'", str13, "#document");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertNull(element50);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertNull(element66);
        org.junit.Assert.assertNotNull(strMap67);
        org.junit.Assert.assertNotNull(elements70);
        org.junit.Assert.assertNotNull(element72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.nodes.Document document5 = document1.normalise();
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueMatching("<#root></#root>", "");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.html("#document");
        org.jsoup.select.Elements elements7 = element5.getElementsByAttributeStarting("#document");
        org.jsoup.nodes.Element element9 = element5.prependText("#document");
        java.util.regex.Pattern pattern11 = null;
        org.jsoup.select.Elements elements12 = element5.getElementsByAttributeValueMatching("#document", pattern11);
        boolean boolean13 = element5.isBlock();
        org.jsoup.nodes.Element element15 = element5.prepend(" #document");
        org.jsoup.select.Elements elements16 = element15.parents();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Element element7 = document1.attr("#root", "hi!  #document");
        org.jsoup.nodes.Element element9 = element7.addClass("<#root hi!  #document=\"#document\"></#root>");
        org.jsoup.select.Elements elements11 = element7.getElementsByIndexLessThan((int) (byte) 1);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements5 = document1.getElementsMatchingOwnText("#root");
        org.jsoup.nodes.Element element7 = document1.prepend("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueEnding("<html>\n <head></head>\n <body></body>\n</html>", "hi!  #document");
        java.lang.String str12 = document1.absUrl("<html>\n <head></head>\n <body></body>\n</html>");
        document1.title("&lt;&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&gt;&lt;/&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&gt;");
        org.jsoup.select.Elements elements16 = document1.getElementsByIndexEquals((int) (byte) -1);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!  #document");
        org.jsoup.nodes.Element element8 = document1.prependElement("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Node node10 = document1.removeAttr("hi!");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        org.jsoup.select.Elements elements4 = document1.getElementsContainingOwnText("#document");
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = document1.outputSettings();
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeStarting("body");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element3.childNodes();
        org.jsoup.nodes.Element element9 = element3.toggleClass("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        java.lang.Integer int10 = element9.siblingIndex();
        org.jsoup.nodes.Element element12 = element9.appendText("#root <html> <head></head> <body></body> </html>");
        org.jsoup.select.Elements elements15 = element12.getElementsByAttributeValueEnding("\n<body></body>", "hi! #document");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
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
        java.nio.charset.Charset charset13 = outputSettings10.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings10.indentAmount((-1));
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(charsetEncoder12);
        org.junit.Assert.assertNotNull(charset13);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document1.addClass("#document");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.select.Elements elements9 = element7.getElementsContainingText("hi!  #document");
        org.jsoup.nodes.Element element11 = element7.wrap("hi!");
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element14 = document13.head();
        java.lang.String str15 = document13.outerHtml();
        java.lang.Integer int16 = document13.elementSiblingIndex();
        java.lang.String str17 = document13.nodeName();
        org.jsoup.nodes.Element element19 = document13.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = document13.outputSettings();
        java.nio.charset.Charset charset21 = outputSettings20.charset();
        boolean boolean22 = element7.equals((java.lang.Object) outputSettings20);
        boolean boolean23 = element7.hasText();
        org.jsoup.select.Elements elements24 = element7.getAllElements();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#document" + "'", str17, "#document");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNotNull(charset21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(elements24);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
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
        java.lang.String str17 = element5.className();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.html("hi!");
        org.jsoup.nodes.Element element12 = element10.append("#document");
        org.jsoup.nodes.Element element14 = element10.getElementById("<html>\n <head></head>\n <body>\n </body>\n</html><<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>");
        org.jsoup.select.Elements elements17 = element10.getElementsByAttributeValueNot("<html> <head></head> <body></body> </html>", "<#root></#root>");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        org.jsoup.select.Elements elements2 = document1.children();
        java.lang.String str3 = document1.html();
        java.lang.String str4 = document1.data();
        org.jsoup.nodes.Element element6 = document1.createElement("<#root></#root>hi!");
        java.lang.String str7 = document1.title();
        org.jsoup.nodes.Element element9 = document1.createElement("<#root></#root>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str3, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
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
        org.jsoup.nodes.Attributes attributes24 = element23.attributes();
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
        org.junit.Assert.assertNotNull(attributes24);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
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
        java.lang.Integer int27 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element29 = document1.prependText("#root");
        org.jsoup.select.Elements elements31 = document1.getElementsContainingOwnText("<html> <head></head> <body></body> </html>");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements31);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings8.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings8.indentAmount(10);
        int int12 = outputSettings8.indentAmount();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        boolean boolean3 = document1.isBlock();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str6 = document1.attr("hi!");
        java.lang.Integer int7 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element9 = document1.wrap("hi!");
        org.jsoup.nodes.Document document10 = document1.normalise();
        java.lang.String str12 = document10.attr("hi!  #document");
        document10.title("\n<head></head>");
        org.jsoup.nodes.Element element16 = document10.removeClass(" hi!");
        org.jsoup.select.Elements elements18 = document10.getElementsByIndexEquals(0);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.nodes.Element element5 = element2.attr(" hi!#root", "#document");
        org.jsoup.select.Elements elements6 = element2.getAllElements();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
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
        org.jsoup.nodes.Element element28 = element27.parent();
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
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        org.jsoup.nodes.Element element3 = document1.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = document1.childNode(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(element3);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!  #document", "#document");
        java.lang.String str5 = element4.toString();
        java.lang.String str6 = element4.toString();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = element3.childNode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
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
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
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
        java.lang.String str34 = document1.tagName();
        org.jsoup.nodes.Element element36 = document1.createElement("<html>\n <head></head>\n <body>\n  #document\n </body>\n</html>");
        org.jsoup.nodes.Element element38 = element36.html("");
        org.jsoup.nodes.Node node39 = element38.nextSibling();
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#root" + "'", str34, "#root");
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNull(node39);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependText("hi!");
        org.jsoup.nodes.Document document11 = element3.ownerDocument();
        java.lang.String str12 = element3.id();
        boolean boolean14 = element3.hasAttr("<#root hi!  #document=\"#document\"></#root>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("#document", "hi!");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element9 = document1.head();
        org.jsoup.select.Elements elements11 = element9.getElementsByClass("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str12 = element9.text();
        org.jsoup.nodes.Element element14 = element9.getElementById("hi! #document<#root>\n #document<hi!></hi!>\n</#root>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Element element8 = element5.removeClass("hi!");
        org.jsoup.nodes.Element element10 = element8.appendText("hi!");
        org.jsoup.select.Elements elements12 = element8.getElementsContainingOwnText("hi!  #document");
        java.util.regex.Pattern pattern14 = null;
        org.jsoup.select.Elements elements15 = element8.getElementsByAttributeValueMatching("<#root></#root>hi!", pattern14);
        boolean boolean16 = element8.hasText();
        java.lang.String str17 = element8.id();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        boolean boolean7 = element5.hasClass("");
        java.lang.String str8 = element5.html();
        java.lang.String str9 = element5.text();
        boolean boolean10 = element5.hasText();
        java.util.regex.Pattern pattern12 = null;
        org.jsoup.select.Elements elements13 = element5.getElementsByAttributeValueMatching("body", pattern12);
        org.jsoup.nodes.Element element15 = element5.prependText("#documenthi!");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Element element5 = document1.append("hi!  #document");
        org.jsoup.nodes.Element element7 = document1.appendElement("hi!");
        org.jsoup.nodes.Element element9 = document1.append("hi!#root");
        org.jsoup.nodes.Element element12 = document1.attr("\n<head></head>", "\n<body></body>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = document1.outputSettings();
        java.lang.String str6 = document1.title();
        org.jsoup.select.Elements elements7 = document1.children();
        java.lang.String str8 = document1.className();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
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
        org.jsoup.select.Elements elements66 = element64.getElementsByTag(" #document");
        org.jsoup.nodes.Node node68 = element64.childNode((int) (short) 0);
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
        org.junit.Assert.assertNotNull(elements66);
        org.junit.Assert.assertNotNull(node68);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.parser.Tag tag6 = document1.tag();
        org.jsoup.nodes.Element element8 = document1.createElement("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element9 = document1.head();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = document1.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        boolean boolean9 = element7.hasAttr("hi!  #document");
        org.jsoup.nodes.Node node10 = element7.nextSibling();
        org.jsoup.select.Elements elements12 = element7.getElementsByTag("hi!");
        java.lang.String str13 = element7.className();
        org.jsoup.parser.Tag tag14 = element7.tag();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("#document", "hi!");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueNot("#document", "#document");
        java.lang.String str10 = document1.nodeName();
        org.jsoup.nodes.Element element11 = document1.parent();
        org.jsoup.nodes.Element element13 = document1.text("<html>\n <head></head>\n <body></body>\n</html><#root></#root>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document" + "'", str10, "#document");
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        document1.title("#root");
        org.jsoup.nodes.Document document7 = document1.ownerDocument();
        document7.title("\n<#root <html> <head></head> <body></body> </html>></#root <html> <head></head> <body></body> </html>>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(document7);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
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
        java.util.List<org.jsoup.nodes.Node> nodeList26 = element25.childNodes();
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
        org.junit.Assert.assertNotNull(nodeList26);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        java.lang.String str3 = document1.outerHtml();
        document1.title("#document");
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("#document");
        java.util.Set<java.lang.String> strSet8 = document7.classNames();
        org.jsoup.nodes.Element element9 = document1.classNames(strSet8);
        document1.title("hi!  #document");
        java.util.Set<java.lang.String> strSet12 = document1.classNames();
        document1.setBaseUri("<html>\n <head></head>\n <body></body>\n</html>");
        boolean boolean15 = document1.hasText();
        org.jsoup.select.Elements elements17 = document1.getElementsByAttributeStarting("#document<#root>\n hi!\n</#root>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str3, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        java.lang.String str5 = element3.ownText();
        org.jsoup.select.Elements elements8 = element3.getElementsByAttributeValueMatching("hi!#root\n<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html>", "&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element9 = element3.parent();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByIndexEquals((int) (short) 100);
        java.lang.Integer int4 = document1.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = document1.after("head");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element7 = document1.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element9 = document6.text("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str10 = element9.data();
        java.lang.String str11 = element9.val();
        java.lang.String str12 = element9.tagName();
        org.jsoup.select.Elements elements13 = element9.parents();
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("hi!  #document");
        org.jsoup.nodes.Element element16 = document15.body();
        org.jsoup.nodes.Element element17 = element9.appendChild((org.jsoup.nodes.Node) document15);
        java.lang.String str18 = element9.tagName();
        org.jsoup.nodes.Element element20 = element9.before(" hi!");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#root" + "'", str12, "#root");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#root" + "'", str18, "#root");
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
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
        org.jsoup.nodes.Node node28 = document1.removeAttr("<html>\n <head></head>\n <body>\n </body>\n</html><<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>");
        boolean boolean30 = document1.hasAttr("<html> \n <head></head> \n <body> \n </body>\n</html>\n<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str31 = document1.id();
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
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements4 = document1.parents();
        java.util.Set<java.lang.String> strSet5 = document1.classNames();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        org.jsoup.select.Elements elements4 = document1.getElementsByTag("#document");
        org.jsoup.nodes.Element element6 = document1.html("hi!");
        org.jsoup.nodes.Element element8 = element6.prependText("#document");
        java.lang.String str9 = element6.val();
        boolean boolean11 = element6.hasClass("#documenthi!");
        org.jsoup.select.Elements elements14 = element6.getElementsByAttributeValueMatching("<#root></#root>", "<html><head></head><body></body></html>&lt;#root&gt;&lt;/#root&gt;hi!");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.html("hi!");
        java.lang.Integer int11 = element10.elementSiblingIndex();
        boolean boolean13 = element10.hasAttr("#root");
        org.jsoup.nodes.Element element14 = element10.empty();
        org.jsoup.nodes.Element element16 = element14.removeClass("<html>\n <head></head>\n <body>\n  #document\n </body>\n</html>");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
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
        org.jsoup.nodes.Element element18 = element13.wrap("#root #document");
        org.jsoup.nodes.Element element19 = element13.previousElementSibling();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(element18);
        org.junit.Assert.assertNull(element19);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueNot("hi!  #document", "hi!");
        org.jsoup.select.Elements elements10 = document1.getElementsByTag("hi!");
        org.jsoup.nodes.Element element12 = document1.append("#root");
        java.lang.String str13 = document1.title();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!  #document", "#document");
        org.jsoup.select.Elements elements6 = document1.getElementsContainingText("hi!  #document");
        java.util.regex.Pattern pattern8 = null;
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueMatching("#document", pattern8);
        org.jsoup.select.Elements elements12 = document1.getElementsByAttributeValueContaining("body", "<hi!  #document></hi!  #document>");
        java.util.regex.Pattern pattern13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements14 = document1.getElementsMatchingOwnText(pattern13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        document1.title("#root");
        org.jsoup.nodes.Document document7 = document1.ownerDocument();
        org.jsoup.nodes.Element element9 = document7.text(" #document");
        java.lang.String str10 = element9.text();
        org.jsoup.nodes.Element element11 = element9.empty();
        java.lang.String str12 = element9.val();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root #document" + "'", str10, "#root #document");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.select.Elements elements6 = element3.getElementsByIndexLessThan((int) (short) 10);
        java.lang.String str7 = element3.data();
        org.jsoup.nodes.Document document8 = element3.ownerDocument();
        org.jsoup.select.Elements elements11 = element3.getElementsByAttributeValueStarting("hi!  #document", "<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element13 = element3.prepend("\n<body></body>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueNot("hi!  #document", "hi!");
        boolean boolean10 = document1.hasClass("");
        org.jsoup.nodes.Element element11 = document1.head();
        org.jsoup.select.Elements elements13 = document1.getElementsByIndexLessThan(0);
        org.jsoup.nodes.Element element15 = document1.prepend("#root");
        org.jsoup.select.Elements elements17 = element15.getElementsByIndexEquals((int) (short) -1);
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        document1.title("#root");
        org.jsoup.nodes.Document document7 = document1.ownerDocument();
        java.lang.String str8 = document7.className();
        java.lang.String str9 = document7.outerHtml();
        org.jsoup.nodes.Element element10 = document7.body();
        element10.remove();
        java.lang.Class<?> wildcardClass12 = element10.getClass();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = element6.after("<#root></#root>hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
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
        org.jsoup.select.Elements elements17 = element5.getElementsByAttributeStarting("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
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
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueNot("#document <head></head>", "<html><head></head><body></body></html>&lt;#root&gt;&lt;/#root&gt;hi!");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        org.jsoup.nodes.Element element9 = element5.removeClass("");
        org.jsoup.parser.Tag tag10 = element9.tag();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str14 = document12.absUrl("#document");
        boolean boolean15 = element9.equals((java.lang.Object) document12);
        org.jsoup.nodes.Element element18 = element9.attr("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>", " #document");
        org.jsoup.parser.Tag tag19 = element9.tag();
        org.jsoup.nodes.Element element21 = element9.append("<#root hi! #document=\"#document\">");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document1.addClass("#document");
        boolean boolean8 = element6.hasClass("hi!");
        org.jsoup.nodes.Element element10 = element6.removeClass("<html> \n <head></head> \n <body> \n </body>\n</html>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements12 = element10.getElementsByAttribute("<html> <head> <title>#root</title> </head> <body></body> </html>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.siblingIndex();
        java.lang.String str5 = document1.data();
        org.jsoup.nodes.Element element6 = document1.empty();
        boolean boolean8 = element6.hasClass("<#root hi!  #document=\"#document\"></#root>");
        element6.setBaseUri("\n<head></head>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = document1.outputSettings();
        org.jsoup.nodes.Document document5 = document1.normalise();
        org.jsoup.select.Elements elements7 = document5.getElementsByTag("<html> <head></head> <body></body> </html>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!  #document", "#document");
        org.jsoup.select.Elements elements6 = document1.getElementsContainingText("hi!  #document");
        java.lang.String str7 = document1.className();
        java.util.Set<java.lang.String> strSet8 = document1.classNames();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document1.outputSettings();
        java.lang.String str10 = document1.nodeName();
        java.lang.String str11 = document1.outerHtml();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document" + "'", str10, "#document");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.select.Elements elements7 = document1.getElementsByIndexGreaterThan(10);
        java.lang.String str8 = document1.className();
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueNot("hi!", "#root");
        org.jsoup.select.Elements elements12 = document1.getAllElements();
        org.jsoup.select.Elements elements14 = document1.getElementsMatchingText(" #document");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
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
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element23 = document22.head();
        java.lang.String str24 = document22.outerHtml();
        java.lang.Integer int25 = document22.elementSiblingIndex();
        java.lang.String str26 = document22.nodeName();
        org.jsoup.nodes.Element element28 = document22.removeClass("");
        boolean boolean30 = element28.hasAttr("hi!  #document");
        java.util.Set<java.lang.String> strSet31 = element28.classNames();
        org.jsoup.nodes.Element element32 = document1.classNames(strSet31);
        org.jsoup.select.Elements elements34 = document1.getElementsByIndexGreaterThan((int) (short) 1);
        java.lang.Class<?> wildcardClass35 = document1.getClass();
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
        org.junit.Assert.assertNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#document" + "'", str26, "#document");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element7 = document1.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element9 = document6.text("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element11 = document6.prependText("#root");
        boolean boolean12 = element11.isBlock();
        org.jsoup.parser.Tag tag13 = element11.tag();
        org.jsoup.nodes.Node node14 = element11.previousSibling();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        boolean boolean9 = outputSettings8.prettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder10 = outputSettings8.encoder();
        boolean boolean11 = outputSettings8.prettyPrint();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charsetEncoder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        document1.title("#root");
        org.jsoup.nodes.Document document7 = document1.ownerDocument();
        java.lang.String str8 = document7.className();
        java.lang.String str9 = document7.outerHtml();
        java.lang.String str10 = document7.nodeName();
        org.jsoup.nodes.Element element12 = document7.append("");
        boolean boolean13 = element12.isBlock();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document" + "'", str10, "#document");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
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
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element20 = document18.html("");
        org.jsoup.select.Elements elements22 = document18.getElementsContainingText("");
        org.jsoup.nodes.Element element24 = document18.prependText("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = document18.outputSettings();
        java.nio.charset.Charset charset26 = outputSettings25.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings25.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings16.escapeMode(escapeMode27);
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings16.escapeMode(escapeMode29);
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings30.indentAmount((int) (short) 0);
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
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertTrue("'" + escapeMode27 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode27.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(outputSettings32);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.html("#document");
        org.jsoup.select.Elements elements7 = element5.getElementsByAttributeStarting("#document");
        org.jsoup.nodes.Element element9 = element5.prependText("#document");
        org.jsoup.nodes.Element element11 = element9.getElementById("#root");
        java.lang.Integer int12 = element9.elementSiblingIndex();
        java.lang.String str13 = element9.val();
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element17 = document15.html("");
        org.jsoup.nodes.Element element19 = element17.html("#document");
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element23 = document21.html("");
        java.lang.String str24 = element23.className();
        org.jsoup.nodes.Element element25 = element23.empty();
        org.jsoup.select.Elements elements27 = element23.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element29 = element23.html("hi!");
        boolean boolean31 = element29.hasAttr("hi!");
        java.util.Set<java.lang.String> strSet32 = element29.classNames();
        org.jsoup.nodes.Element element33 = element19.classNames(strSet32);
        org.jsoup.nodes.Element element34 = element9.classNames(strSet32);
        org.jsoup.nodes.Element element35 = element34.empty();
        boolean boolean36 = element34.hasText();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
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
        java.lang.String str18 = element17.text();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.html("#document");
        org.jsoup.select.Elements elements7 = element5.getElementsByAttributeStarting("#document");
        org.jsoup.nodes.Element element9 = element5.prependText("#document");
        org.jsoup.nodes.Element element11 = element9.getElementById("#root");
        java.lang.Integer int12 = element9.elementSiblingIndex();
        boolean boolean13 = element9.isBlock();
        java.lang.String str14 = element9.id();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document(" hi!");
        java.lang.Integer int2 = document1.elementSiblingIndex();
        document1.setBaseUri("<html>\n <head></head>\n <body>\n  #documenthi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Element element4 = document1.head();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = element4.data();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(element4);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        boolean boolean3 = document1.isBlock();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str6 = document1.attr("hi!");
        java.lang.Integer int7 = document1.elementSiblingIndex();
        org.jsoup.select.Elements elements9 = document1.getElementsByIndexEquals((int) (byte) 0);
        org.jsoup.nodes.Node node11 = document1.childNode(0);
        java.lang.String str12 = document1.outerHtml();
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element16 = document14.html("");
        org.jsoup.nodes.Element element18 = element16.appendText("hi!");
        java.lang.String str19 = element18.html();
        java.lang.String str20 = element18.text();
        org.jsoup.select.Elements elements22 = element18.getElementsByAttributeStarting("#root");
        org.jsoup.nodes.Element element24 = element18.prepend("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element25 = document1.appendChild((org.jsoup.nodes.Node) element18);
        org.jsoup.select.Elements elements27 = element25.getElementsMatchingText("\n<body></body>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str12, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element9 = element3.empty();
        java.lang.String str11 = element3.absUrl("#document");
        boolean boolean12 = element3.hasText();
        java.lang.String str13 = element3.html();
        java.lang.String str14 = element3.id();
        org.jsoup.select.Elements elements16 = element3.getElementsByAttributeStarting("#document");
        org.jsoup.nodes.Element element18 = element3.prependText("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        java.lang.String str19 = element18.tagName();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#root" + "'", str19, "#root");
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        boolean boolean9 = element3.hasClass("#document");
        org.jsoup.nodes.Element element12 = element3.attr("#document", "#root");
        org.jsoup.nodes.Element element13 = element12.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = element12.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
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
        element14.setBaseUri("<#root hi!  #document=\"#document\"></#root>");
        org.jsoup.select.Elements elements18 = element14.children();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
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
        org.jsoup.nodes.Document document23 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node25 = document23.removeAttr("#document");
        org.jsoup.nodes.Element element26 = document23.body();
        java.lang.Integer int27 = document23.siblingIndex();
        org.jsoup.nodes.Element element29 = document23.prependElement(" #document");
        org.jsoup.nodes.Element element31 = document23.prepend("#document");
        boolean boolean32 = document1.equals((java.lang.Object) "#document");
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
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        boolean boolean9 = element7.hasAttr("hi!  #document");
        java.lang.String str10 = element7.tagName();
        java.lang.String str11 = element7.toString();
        org.jsoup.nodes.Document document12 = element7.ownerDocument();
        org.jsoup.nodes.Element element13 = document12.body();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNull(element13);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
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
        org.jsoup.nodes.Element element18 = element17.empty();
        org.jsoup.select.Elements elements20 = element18.getElementsContainingText("\n<<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
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
        org.jsoup.select.Elements elements27 = element12.getElementsByAttributeValueEnding("<#root>\n <hi!  #document></hi!  #document>\n</#root>\n<html>\n <head></head>\n <body>\n  hi! #document\n </body>\n</html>", "<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
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
        org.junit.Assert.assertNotNull(elements27);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.nodes.Document document5 = document1.ownerDocument();
        java.util.Set<java.lang.String> strSet6 = document5.classNames();
        java.lang.String str7 = document5.ownText();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.nodes.Document document5 = document1.ownerDocument();
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueContaining("<html>\n <head></head>\n <body></body>\n</html>", "hi!");
        org.jsoup.nodes.Document document9 = document5.ownerDocument();
        java.lang.String str10 = document5.ownText();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root></#root>hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = document1.outputSettings();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(outputSettings2);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.parser.Tag tag6 = document1.tag();
        org.jsoup.nodes.Element element8 = document1.createElement("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements10 = document1.getElementsByClass("#document");
        org.jsoup.nodes.Attributes attributes11 = document1.attributes();
        org.jsoup.nodes.Element element13 = document1.val("#document");
        org.jsoup.nodes.Element element15 = element13.html(" #document");
        java.lang.String str16 = element13.id();
        java.lang.String str17 = element13.data();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }
}

