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
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node6 = document5.previousSibling();
        org.jsoup.nodes.Element element7 = document5.nextElementSibling();
        java.lang.String str8 = document5.title();
        org.jsoup.nodes.Element element10 = document5.toggleClass("hi!");
        org.jsoup.nodes.Document document11 = document5.normalise();
        document5.title("");
        java.util.Set<java.lang.String> strSet14 = document5.classNames();
        org.jsoup.nodes.Element element15 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element17 = document5.prependElement("#root");
        org.jsoup.nodes.Element element18 = document5.head();
        java.lang.String str19 = element18.tagName();
        java.util.regex.Pattern pattern21 = null;
        org.jsoup.select.Elements elements22 = element18.getElementsByAttributeValueMatching("#root", pattern21);
        org.jsoup.nodes.Element element24 = element18.prependElement("<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element25 = element24.lastElementSibling();
        org.jsoup.nodes.Document document27 = org.jsoup.nodes.Document.createShell("#document");
        org.jsoup.select.Elements elements29 = document27.getElementsContainingOwnText("#document");
        org.jsoup.select.Elements elements31 = document27.getElementsByAttribute("hi!hi!");
        org.jsoup.nodes.Node node32 = document27.previousSibling();
        org.jsoup.select.Elements elements35 = document27.getElementsByAttributeValueStarting("hi! ", "hi! head");
        java.lang.String str37 = document27.absUrl("<hi!></hi!>");
        java.lang.String str38 = document27.text();
        org.jsoup.nodes.Element element39 = element25.prependChild((org.jsoup.nodes.Node) document27);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "head" + "'", str19, "head");
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(element39);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node6 = document5.previousSibling();
        org.jsoup.nodes.Element element7 = document5.nextElementSibling();
        java.lang.String str8 = document5.title();
        org.jsoup.nodes.Element element10 = document5.toggleClass("hi!");
        org.jsoup.nodes.Document document11 = document5.normalise();
        document5.title("");
        java.util.Set<java.lang.String> strSet14 = document5.classNames();
        org.jsoup.nodes.Element element15 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document16 = document5.normalise();
        org.jsoup.nodes.Element element18 = document16.addClass("head");
        org.jsoup.select.Elements elements21 = document16.getElementsByAttributeValueStarting("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>", "hi!");
        org.jsoup.nodes.Element element23 = document16.createElement("<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements25 = document16.getElementsMatchingOwnText("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str26 = document16.id();
        org.jsoup.nodes.Element element28 = document16.before("<title></title>");
        org.jsoup.nodes.Element element30 = element28.html("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList31 = element28.dataNodes();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(dataNodeList31);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        org.jsoup.nodes.Element element10 = document1.appendText("hi!");
        java.lang.String str11 = document1.tagName();
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node14 = document13.previousSibling();
        org.jsoup.nodes.Element element15 = document13.nextElementSibling();
        java.lang.String str16 = document13.title();
        org.jsoup.nodes.Element element18 = document13.toggleClass("hi!");
        org.jsoup.nodes.Document document19 = document13.normalise();
        document13.title("");
        java.util.Set<java.lang.String> strSet22 = document13.classNames();
        org.jsoup.nodes.Element element24 = document13.text("");
        org.jsoup.nodes.Element element25 = document1.prependChild((org.jsoup.nodes.Node) document13);
        org.jsoup.select.Elements elements28 = document1.getElementsByAttributeValueContaining(" hi!", " hi!");
        org.jsoup.select.Elements elements30 = document1.getElementsMatchingOwnText("<#root></#root>\n<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements31 = document1.getAllElements();
        org.jsoup.parser.Tag tag32 = document1.tag();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(tag32);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document4 = document1.ownerDocument();
        org.jsoup.select.Elements elements6 = document1.getElementsByAttribute("#document");
        java.lang.String str7 = document1.title();
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.nodes.Element element9 = document8.head();
        org.jsoup.nodes.Element element10 = element9.parent();
        org.jsoup.select.Elements elements12 = element9.getElementsByAttribute("hi!hi!");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        java.lang.String str11 = document1.html();
        org.jsoup.nodes.Element element13 = document1.prependText("hi!");
        org.jsoup.select.Elements elements14 = document1.children();
        org.jsoup.select.Elements elements16 = document1.getElementsContainingText(" hi!");
        org.jsoup.select.Elements elements18 = document1.getElementsByAttribute(" hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = document1.dataset();
        org.jsoup.select.Elements elements21 = document1.getElementsByTag("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element24 = document1.attr("hi!\n<hi!hi!></hi!hi!>", "hi! hi!");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.select.Elements elements8 = element6.getElementsMatchingOwnText("");
        org.jsoup.select.Elements elements10 = element6.getElementsByIndexEquals(100);
        element6.setBaseUri(" hi!");
        org.jsoup.nodes.Element element13 = element6.empty();
        org.jsoup.nodes.Node node14 = element6.previousSibling();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        java.lang.String str7 = document1.tagName();
        org.jsoup.nodes.Element element9 = document1.tagName("<html>\n                                <head></head>\n                                <body></body>\n</html>");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#root" + "'", str7, "#root");
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        java.lang.String str11 = document1.html();
        org.jsoup.nodes.Element element13 = document1.prependText("hi!");
        org.jsoup.nodes.Element element15 = document1.prepend("hi!");
        java.lang.String str17 = document1.absUrl(" hi!");
        org.jsoup.nodes.Element element18 = document1.empty();
        org.jsoup.select.Elements elements21 = document1.getElementsByAttributeValueContaining("hi!hi!", "<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements23 = document1.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements25 = document1.getElementsByAttribute("<html>\n <head>\n  <title>head</title>\n </head>\n <body></body>\n</html>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList26 = document1.dataNodes();
        org.jsoup.nodes.Element element27 = document1.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element28 = element27.empty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(dataNodeList26);
        org.junit.Assert.assertNull(element27);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        java.lang.String str11 = document1.html();
        java.lang.String str12 = document1.nodeName();
        org.jsoup.nodes.Document document13 = document1.normalise();
        java.lang.String str14 = document13.baseUri();
        boolean boolean16 = document13.hasClass(" hi!");
        org.jsoup.nodes.Element element18 = document13.tagName(" hi! head");
        org.jsoup.nodes.Element element20 = element18.val("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements22 = element18.getElementsMatchingOwnText("<#root></#root>\n<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node25 = document24.previousSibling();
        org.jsoup.nodes.Element element26 = document24.nextElementSibling();
        org.jsoup.nodes.Document document27 = document24.ownerDocument();
        org.jsoup.select.Elements elements29 = document24.getElementsByAttribute("#document");
        java.lang.String str30 = document24.title();
        org.jsoup.nodes.Document document31 = document24.normalise();
        org.jsoup.select.Elements elements33 = document31.getElementsMatchingOwnText("hi!");
        java.lang.String str34 = document31.nodeName();
        org.jsoup.select.Elements elements37 = document31.getElementsByAttributeValueMatching("<#root class=\"hi!\">\n hi!\n</#root>", "<title></title>");
        org.jsoup.nodes.Document document39 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node40 = document39.previousSibling();
        org.jsoup.nodes.Element element41 = document39.nextElementSibling();
        java.lang.String str42 = document39.title();
        org.jsoup.nodes.Element element44 = document39.toggleClass("hi!");
        org.jsoup.nodes.Element element46 = document39.toggleClass("");
        java.lang.String str48 = document39.absUrl("hi!");
        java.lang.String str49 = document39.html();
        org.jsoup.nodes.Element element51 = document39.prependText("hi!");
        org.jsoup.select.Elements elements52 = element51.getAllElements();
        org.jsoup.select.Elements elements55 = element51.getElementsByAttributeValueNot("hi!", "head");
        org.jsoup.nodes.Element element56 = document31.prependChild((org.jsoup.nodes.Node) element51);
        org.jsoup.nodes.Element element57 = element18.prependChild((org.jsoup.nodes.Node) document31);
        org.jsoup.nodes.Element element58 = element18.parent();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(element26);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#document" + "'", str34, "#document");
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNull(element41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(elements52);
        org.junit.Assert.assertNotNull(elements55);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNull(element58);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Element element9 = document1.prependText("hi!hi!");
        java.util.regex.Pattern pattern11 = null;
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValueMatching("#document", pattern11);
        org.jsoup.nodes.Node node13 = element9.nextSibling();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document1.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.prettyPrint(false);
        int int12 = outputSettings11.indentAmount();
        java.nio.charset.CharsetEncoder charsetEncoder13 = outputSettings11.encoder();
        java.nio.charset.Charset charset14 = outputSettings11.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings11.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings11.prettyPrint(false);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(charsetEncoder13);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(outputSettings17);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        java.lang.String str2 = document1.id();
        java.lang.String str3 = document1.data();
        org.jsoup.select.Elements elements4 = document1.parents();
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueStarting("#document", "hi!hi!");
        org.jsoup.select.Elements elements9 = document1.getElementsMatchingText("hi!hi!");
        org.jsoup.nodes.Document document10 = document1.clone();
        org.jsoup.nodes.Element element12 = document10.prependElement("&lt;#root class=&quot;hi!&quot;&gt; hi! \n<!--#root-->hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Element element9 = document7.text("#root");
        org.jsoup.nodes.Element element11 = document7.createElement("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element13 = element11.appendText("head");
        org.jsoup.nodes.Element element15 = element11.addClass(" hi! head");
        org.jsoup.select.Elements elements17 = element15.getElementsContainingText("#documenthi!");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node6 = document5.previousSibling();
        org.jsoup.nodes.Element element7 = document5.nextElementSibling();
        java.lang.String str8 = document5.title();
        org.jsoup.nodes.Element element10 = document5.toggleClass("hi!");
        org.jsoup.nodes.Document document11 = document5.normalise();
        document5.title("");
        java.util.Set<java.lang.String> strSet14 = document5.classNames();
        org.jsoup.nodes.Element element15 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.select.Elements elements17 = document5.getElementsByAttribute("head");
        org.jsoup.nodes.Element element19 = document5.getElementById("#document");
        org.jsoup.nodes.Element element21 = document5.prepend("hi!hi!");
        java.lang.String str23 = document5.attr("head");
        org.jsoup.select.Elements elements24 = document5.getAllElements();
        org.jsoup.select.Elements elements26 = document5.getElementsByIndexEquals((int) (short) 0);
        org.jsoup.nodes.Element element27 = document5.firstElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element29 = element27.appendElement("<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>\n<#root></#root>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNull(element27);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node6 = document5.previousSibling();
        org.jsoup.nodes.Element element7 = document5.nextElementSibling();
        java.lang.String str8 = document5.title();
        org.jsoup.nodes.Element element10 = document5.toggleClass("hi!");
        org.jsoup.nodes.Document document11 = document5.normalise();
        document5.title("");
        java.util.Set<java.lang.String> strSet14 = document5.classNames();
        org.jsoup.nodes.Element element15 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element17 = document5.prependElement("#root");
        org.jsoup.nodes.Element element18 = document5.head();
        org.jsoup.nodes.Node node20 = document5.childNode((int) (short) 1);
        org.jsoup.select.Elements elements22 = document5.getElementsByAttribute("<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node25 = document24.previousSibling();
        org.jsoup.nodes.Element element26 = document24.nextElementSibling();
        java.lang.String str27 = document24.title();
        org.jsoup.nodes.Element element29 = document24.toggleClass("hi!");
        org.jsoup.nodes.Element element31 = document24.toggleClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = document24.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings32.prettyPrint(false);
        boolean boolean35 = outputSettings32.prettyPrint();
        org.jsoup.nodes.Document document37 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements39 = document37.getElementsContainingText("");
        int int40 = document37.siblingIndex();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = document37.outputSettings();
        java.nio.charset.Charset charset42 = outputSettings41.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings32.charset(charset42);
        org.jsoup.nodes.Document document44 = document5.outputSettings(outputSettings32);
        org.jsoup.nodes.Document document46 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements48 = document46.getElementsContainingText("");
        org.jsoup.nodes.Element element49 = document46.nextElementSibling();
        org.jsoup.select.Elements elements51 = document46.getElementsByIndexEquals((int) '4');
        org.jsoup.nodes.Document document53 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node54 = document53.previousSibling();
        org.jsoup.nodes.Element element55 = document53.nextElementSibling();
        org.jsoup.nodes.Document document57 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node58 = document57.previousSibling();
        org.jsoup.nodes.Element element59 = document57.nextElementSibling();
        java.lang.String str60 = document57.title();
        org.jsoup.nodes.Element element62 = document57.toggleClass("hi!");
        org.jsoup.nodes.Document document63 = document57.normalise();
        document57.title("");
        java.util.Set<java.lang.String> strSet66 = document57.classNames();
        org.jsoup.nodes.Element element67 = document53.prependChild((org.jsoup.nodes.Node) document57);
        org.jsoup.nodes.Element element69 = document57.prependElement("#root");
        org.jsoup.nodes.Element element70 = document57.head();
        java.lang.String str71 = element70.tagName();
        java.util.regex.Pattern pattern73 = null;
        org.jsoup.select.Elements elements74 = element70.getElementsByAttributeValueMatching("#root", pattern73);
        org.jsoup.nodes.Element element76 = element70.val(" hi!");
        boolean boolean77 = document46.equals((java.lang.Object) element76);
        document44.replaceWith((org.jsoup.nodes.Node) element76);
        org.jsoup.nodes.Element element80 = document44.addClass("");
        org.jsoup.nodes.Document document82 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node83 = document82.previousSibling();
        org.jsoup.nodes.Element element84 = document82.nextElementSibling();
        java.lang.String str85 = document82.title();
        org.jsoup.nodes.Element element87 = document82.toggleClass("hi!");
        org.jsoup.nodes.Document document88 = document82.normalise();
        org.jsoup.nodes.Attributes attributes89 = document82.attributes();
        java.lang.String str90 = document82.ownText();
        org.jsoup.nodes.Element element91 = document44.prependChild((org.jsoup.nodes.Node) document82);
        org.jsoup.nodes.Element element92 = document82.head();
        java.lang.String str93 = element92.id();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertNotNull(charset42);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertNull(element49);
        org.junit.Assert.assertNotNull(elements51);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNull(element55);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNull(element59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(element62);
        org.junit.Assert.assertNotNull(document63);
        org.junit.Assert.assertNotNull(strSet66);
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertNotNull(element69);
        org.junit.Assert.assertNotNull(element70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "head" + "'", str71, "head");
        org.junit.Assert.assertNotNull(elements74);
        org.junit.Assert.assertNotNull(element76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(element80);
        org.junit.Assert.assertNull(node83);
        org.junit.Assert.assertNull(element84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertNotNull(element87);
        org.junit.Assert.assertNotNull(document88);
        org.junit.Assert.assertNotNull(attributes89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertNotNull(element91);
        org.junit.Assert.assertNotNull(element92);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.nodes.Element element8 = document1.head();
        org.jsoup.nodes.Document document9 = document1.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = document9.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings10.clone();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " hi!" + "'", str7, " hi!");
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(outputSettings11);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Document document7 = document1.normalise();
        document1.title("");
        java.util.Set<java.lang.String> strSet10 = document1.classNames();
        org.jsoup.nodes.Element element12 = document1.text("");
        java.lang.String str13 = element12.val();
        org.jsoup.parser.Tag tag14 = element12.tag();
        org.jsoup.nodes.Element element15 = element12.empty();
        org.jsoup.select.Elements elements16 = element12.parents();
        java.util.Set<java.lang.String> strSet17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = element12.classNames(strSet17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsContainingText("");
        int int4 = document1.siblingIndex();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = document1.outputSettings();
        org.jsoup.nodes.Element element7 = document1.appendText("#document");
        org.jsoup.nodes.Element element10 = document1.attr("<title></title>    \n<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>", "");
        org.jsoup.select.Elements elements12 = document1.getElementsByAttribute("#root");
        java.lang.String str13 = document1.title();
        org.jsoup.select.Elements elements15 = document1.getElementsByTag("<head>\n <title></title>\n</head>");
        org.jsoup.select.Elements elements17 = document1.getElementsByIndexGreaterThan(10);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node6 = document5.previousSibling();
        org.jsoup.nodes.Element element7 = document5.nextElementSibling();
        java.lang.String str8 = document5.title();
        org.jsoup.nodes.Element element10 = document5.toggleClass("hi!");
        org.jsoup.nodes.Document document11 = document5.normalise();
        document5.title("");
        java.util.Set<java.lang.String> strSet14 = document5.classNames();
        org.jsoup.nodes.Element element15 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element17 = document5.prependElement("#root");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList18 = element17.textNodes();
        org.jsoup.select.Elements elements21 = element17.getElementsByAttributeValueContaining("head", "<title></title>");
        element17.remove();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(textNodeList18);
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        org.jsoup.select.Elements elements10 = element8.getElementsMatchingOwnText("");
        java.lang.String str12 = element8.attr("");
        org.jsoup.select.Elements elements15 = element8.getElementsByAttributeValueEnding(" hi!", " hi!");
        org.jsoup.nodes.Element element17 = element8.toggleClass("hi!");
        org.jsoup.nodes.Element element20 = element8.attr("<title></title>", "hi!");
        org.jsoup.select.Elements elements22 = element8.getElementsByClass(" hi!");
        java.lang.String str23 = element8.ownText();
        java.lang.String str24 = element8.tagName();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#root" + "'", str24, "#root");
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.select.Elements elements5 = document1.getElementsByIndexEquals(1);
        org.jsoup.select.Elements elements6 = document1.getAllElements();
        org.jsoup.select.Elements elements8 = document1.getElementsMatchingText("<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        java.lang.String str9 = document1.outerHtml();
        org.jsoup.select.Elements elements12 = document1.getElementsByAttributeValueMatching("<head>\n <title></title>\n</head>\n<body>\n</body>hi!hi!", "hi! ");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document1.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.prettyPrint(false);
        java.nio.charset.Charset charset12 = outputSettings9.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings9.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node17 = document16.previousSibling();
        org.jsoup.nodes.Element element18 = document16.nextElementSibling();
        java.lang.String str19 = document16.title();
        org.jsoup.nodes.Element element21 = document16.toggleClass("hi!");
        org.jsoup.nodes.Element element23 = document16.toggleClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = document16.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings24.prettyPrint(false);
        int int27 = outputSettings26.indentAmount();
        java.nio.charset.Charset charset28 = outputSettings26.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings14.charset(charset28);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings13.charset(charset28);
        int int31 = outputSettings30.indentAmount();
        java.nio.charset.Charset charset32 = outputSettings30.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings30.indentAmount((int) (byte) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(charset28);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(charset32);
        org.junit.Assert.assertNotNull(outputSettings34);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        java.lang.String str11 = document1.html();
        java.lang.String str12 = document1.nodeName();
        org.jsoup.nodes.Element element13 = document1.parent();
        org.jsoup.select.Elements elements16 = document1.getElementsByAttributeValueContaining("<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>", "#document");
        java.lang.String str17 = document1.title();
        boolean boolean19 = document1.hasAttr("<#root class=\" hi!\">\n <html>\n  <head>\n   <title></title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>hi!");
        org.jsoup.select.Elements elements22 = document1.getElementsByAttributeValue("hi!hi!\n<html>\n <head></head>\n <body></body>\n</html>", "&lt;html&gt; &lt;head&gt; &lt;title&gt;&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.select.Elements elements7 = element6.parents();
        java.lang.String str8 = element6.baseUri();
        java.lang.String str10 = element6.attr("#root");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        org.jsoup.select.Elements elements10 = element8.getElementsMatchingOwnText("");
        java.lang.String str12 = element8.attr("");
        org.jsoup.select.Elements elements15 = element8.getElementsByAttributeValueEnding(" hi!", " hi!");
        org.jsoup.nodes.Element element17 = element8.addClass("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str18 = element8.html();
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node21 = document20.previousSibling();
        org.jsoup.nodes.Element element22 = document20.nextElementSibling();
        java.lang.String str23 = document20.title();
        org.jsoup.nodes.Element element25 = document20.toggleClass("hi!");
        org.jsoup.nodes.Element element27 = document20.toggleClass("");
        java.lang.String str29 = document20.absUrl("hi!");
        java.lang.String str30 = document20.html();
        org.jsoup.nodes.Element element32 = document20.prependText("hi!");
        boolean boolean34 = document20.hasAttr("#root");
        org.jsoup.nodes.Element element36 = document20.appendElement("hi!hi!");
        java.util.regex.Pattern pattern38 = null;
        org.jsoup.select.Elements elements39 = document20.getElementsByAttributeValueMatching("hi!hi!", pattern38);
        org.jsoup.nodes.Element element42 = document20.attr("hi!hi!", "<title></title>");
        org.jsoup.nodes.Document document44 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node45 = document44.previousSibling();
        org.jsoup.nodes.Element element46 = document44.nextElementSibling();
        java.lang.String str47 = document44.title();
        org.jsoup.nodes.Element element49 = document44.toggleClass("hi!");
        org.jsoup.nodes.Element element51 = document44.toggleClass("");
        java.lang.String str53 = document44.absUrl("hi!");
        java.lang.String str54 = document44.html();
        org.jsoup.nodes.Element element56 = document44.prependText("hi!");
        org.jsoup.nodes.Element element58 = document44.prepend("hi!");
        java.util.Set<java.lang.String> strSet59 = document44.classNames();
        org.jsoup.nodes.Element element60 = document20.classNames(strSet59);
        org.jsoup.nodes.Element element61 = element8.classNames(strSet59);
        java.lang.String str62 = element8.tagName();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(element46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(strSet59);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "#root" + "'", str62, "#root");
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("head  \n<title></title>");
        org.jsoup.nodes.Attributes attributes2 = document1.attributes();
        org.junit.Assert.assertNotNull(attributes2);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.select.Elements elements5 = document1.getElementsByIndexEquals(1);
        org.jsoup.select.Elements elements6 = document1.getAllElements();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = document1.textNodes();
        org.jsoup.nodes.Element element8 = document1.nextElementSibling();
        org.jsoup.select.Elements elements10 = document1.getElementsByIndexEquals((int) (short) 100);
        java.lang.String str11 = document1.nodeName();
        java.util.Set<java.lang.String> strSet12 = document1.classNames();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(textNodeList7);
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#document");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node4 = document3.previousSibling();
        org.jsoup.nodes.Element element5 = document3.nextElementSibling();
        java.lang.String str6 = document3.title();
        org.jsoup.nodes.Element element8 = document3.toggleClass("hi!");
        java.lang.String str9 = document3.className();
        org.jsoup.select.Elements elements12 = document3.getElementsByAttributeValueNot(" hi!", " hi!");
        org.jsoup.select.Elements elements14 = document3.getElementsByIndexLessThan((int) (short) 0);
        java.lang.String str15 = document3.ownText();
        org.jsoup.nodes.Element element17 = document3.appendText("hi!");
        org.jsoup.nodes.Element element19 = document3.createElement("#root");
        org.jsoup.nodes.Document.QuirksMode quirksMode20 = document3.quirksMode();
        org.jsoup.nodes.Document.QuirksMode quirksMode21 = document3.quirksMode();
        org.jsoup.nodes.Document document22 = document1.quirksMode(quirksMode21);
        java.lang.String str23 = document1.outerHtml();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " hi!" + "'", str9, " hi!");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + quirksMode20 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode20.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertTrue("'" + quirksMode21 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode21.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.nodes.Element element8 = document1.head();
        org.jsoup.nodes.Document document9 = document1.clone();
        org.jsoup.nodes.Document document10 = document1.normalise();
        org.jsoup.nodes.Element element13 = document1.attr(" hi!", " hi!");
        org.jsoup.nodes.Element element15 = document1.text("hi!hi!\n<#root class=\" hi!\">\n <#root></#root>\n <html>\n  <head>\n   <title></title>\n  </head>\n  <body></body>\n </html>\n</#root>");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " hi!" + "'", str7, " hi!");
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node6 = document5.previousSibling();
        org.jsoup.nodes.Element element7 = document5.nextElementSibling();
        java.lang.String str8 = document5.title();
        org.jsoup.nodes.Element element10 = document5.toggleClass("hi!");
        org.jsoup.nodes.Document document11 = document5.normalise();
        document5.title("");
        java.util.Set<java.lang.String> strSet14 = document5.classNames();
        org.jsoup.nodes.Element element15 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element17 = document5.prependElement("#root");
        org.jsoup.nodes.Element element19 = element17.tagName("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element22 = element17.attr("#root", "<#root></#root>\n<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element24 = element22.prependElement("<title></title>    \n<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element26 = element22.prependElement("<title></title>");
        org.jsoup.select.Elements elements29 = element26.getElementsByAttributeValueNot("hi!hi!", " hi!");
        java.lang.String str31 = element26.attr("<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>&lt;#root&gt;\n<!--#root-->   \n<title></title>");
        java.lang.String str32 = element26.tagName();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<title></title>" + "'", str32, "<title></title>");
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node6 = document5.previousSibling();
        org.jsoup.nodes.Element element7 = document5.nextElementSibling();
        java.lang.String str8 = document5.title();
        org.jsoup.nodes.Element element10 = document5.toggleClass("hi!");
        org.jsoup.nodes.Document document11 = document5.normalise();
        document5.title("");
        java.util.Set<java.lang.String> strSet14 = document5.classNames();
        org.jsoup.nodes.Element element15 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element17 = document5.prependElement("#root");
        java.lang.Integer int18 = element17.elementSiblingIndex();
        org.jsoup.nodes.Element element19 = element17.parent();
        org.jsoup.nodes.Document document20 = element19.ownerDocument();
        java.lang.String str21 = document20.html();
        org.jsoup.select.Elements elements23 = document20.getElementsByAttributeStarting("hi!");
        org.jsoup.select.Elements elements26 = document20.getElementsByAttributeValueNot("<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>", "hi!");
        org.jsoup.nodes.Element element28 = document20.prepend("<#root></#root>\n<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element30 = element28.getElementById("hi!hi!");
        org.jsoup.select.Elements elements32 = element28.getElementsMatchingOwnText("<#root class=\" hi! head\">\n <html>\n  <head>\n   <title></title>\n  </head>\n  <body></body>\n </html>\n</#root>\n<#document></#document>");
        java.util.Map<java.lang.String, java.lang.String> strMap33 = element28.dataset();
        org.jsoup.nodes.Element element35 = element28.prependElement("<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>&lt;#root&gt;\n<!--#root-->   \n<title></title>");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<#root></#root>\n<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>" + "'", str21, "<#root></#root>\n<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNull(element30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNotNull(element35);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node6 = document5.previousSibling();
        org.jsoup.nodes.Element element7 = document5.nextElementSibling();
        java.lang.String str8 = document5.title();
        org.jsoup.nodes.Element element10 = document5.toggleClass("hi!");
        org.jsoup.nodes.Document document11 = document5.normalise();
        document5.title("");
        java.util.Set<java.lang.String> strSet14 = document5.classNames();
        org.jsoup.nodes.Element element15 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element17 = document5.prependElement("#root");
        org.jsoup.nodes.Element element18 = document5.head();
        org.jsoup.nodes.Element element20 = document5.text("<#root></#root>\n<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node23 = document22.previousSibling();
        org.jsoup.nodes.Element element24 = document22.nextElementSibling();
        java.lang.String str25 = document22.title();
        org.jsoup.nodes.Element element27 = document22.toggleClass("hi!");
        org.jsoup.nodes.Document document28 = document22.normalise();
        document22.title("");
        java.util.Set<java.lang.String> strSet31 = document22.classNames();
        org.jsoup.nodes.Element element33 = document22.text("");
        java.lang.String str34 = document22.id();
        document5.replaceWith((org.jsoup.nodes.Node) document22);
        java.lang.String str37 = document5.absUrl("#document hi!");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueNot(" hi!", " hi!");
        org.jsoup.select.Elements elements12 = document1.getElementsByIndexLessThan((int) (short) 0);
        java.lang.String str13 = document1.ownText();
        org.jsoup.nodes.Element element15 = document1.appendText("hi!");
        org.jsoup.nodes.Element element17 = document1.createElement("#root");
        org.jsoup.nodes.Element element19 = document1.prepend("#document");
        element19.setBaseUri("<#root></#root>\n<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements23 = element19.getElementsContainingOwnText("hi! hi!");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " hi!" + "'", str7, " hi!");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueNot(" hi!", " hi!");
        org.jsoup.select.Elements elements12 = document1.getElementsByIndexLessThan((int) (byte) 1);
        org.jsoup.nodes.Node node14 = document1.removeAttr("head");
        org.jsoup.nodes.Node node15 = document1.previousSibling();
        org.jsoup.nodes.Element element17 = document1.getElementById("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList18 = document1.dataNodes();
        int int19 = document1.siblingIndex();
        org.jsoup.select.Elements elements21 = document1.getElementsByIndexGreaterThan(10);
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = document1.outputSettings();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " hi!" + "'", str7, " hi!");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(element17);
        org.junit.Assert.assertNotNull(dataNodeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(outputSettings22);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsContainingText("");
        int int4 = document1.siblingIndex();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = document1.outputSettings();
        org.jsoup.nodes.Element element7 = document1.appendText("#document");
        org.jsoup.nodes.Element element10 = document1.attr("<title></title>    \n<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>", "");
        org.jsoup.select.Elements elements12 = document1.getElementsByAttribute("#root");
        org.jsoup.nodes.Element element14 = document1.addClass("");
        org.jsoup.nodes.Element element16 = document1.addClass("<#root class=\" hi! head\">\n <html>\n  <head>\n   <title></title>\n  </head>\n  <body></body>\n </html>\n</#root>\n<#document></#document>");
        java.lang.String str17 = element16.data();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root class=\" hi!\">\n <html>\n  <head>\n   <title></title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>hi!");
        org.jsoup.nodes.Document.QuirksMode quirksMode2 = document1.quirksMode();
        org.jsoup.nodes.Document document3 = document1.clone();
        org.jsoup.nodes.Element element6 = document1.attr(" hi! hi!hi!", "<#root>");
        java.lang.String str7 = element6.baseUri();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertTrue("'" + quirksMode2 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode2.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<#root class=\" hi!\">\n <html>\n  <head>\n   <title></title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>hi!" + "'", str7, "<#root class=\" hi!\">\n <html>\n  <head>\n   <title></title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>hi!");
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document4 = document1.ownerDocument();
        org.jsoup.select.Elements elements6 = document1.getElementsByAttribute("#document");
        java.lang.String str7 = document1.title();
        org.jsoup.nodes.Element element9 = document1.append("");
        java.lang.Integer int10 = document1.elementSiblingIndex();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node6 = document5.previousSibling();
        org.jsoup.nodes.Element element7 = document5.nextElementSibling();
        java.lang.String str8 = document5.title();
        org.jsoup.nodes.Element element10 = document5.toggleClass("hi!");
        org.jsoup.nodes.Document document11 = document5.normalise();
        document5.title("");
        java.util.Set<java.lang.String> strSet14 = document5.classNames();
        org.jsoup.nodes.Element element15 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element17 = document5.prependElement("#root");
        org.jsoup.nodes.Element element18 = document5.head();
        org.jsoup.nodes.Node node20 = document5.childNode((int) (short) 1);
        org.jsoup.select.Elements elements22 = document5.getElementsByClass("&lt;#root class=&quot;hi!&quot;&gt; hi! \n<!--#root-->hi!");
        document5.remove();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node6 = document5.previousSibling();
        org.jsoup.nodes.Element element7 = document5.nextElementSibling();
        java.lang.String str8 = document5.title();
        org.jsoup.nodes.Element element10 = document5.toggleClass("hi!");
        org.jsoup.nodes.Document document11 = document5.normalise();
        document5.title("");
        java.util.Set<java.lang.String> strSet14 = document5.classNames();
        org.jsoup.nodes.Element element15 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element17 = document5.prependElement("#root");
        org.jsoup.nodes.Element element18 = document5.head();
        org.jsoup.nodes.Node node20 = document5.childNode((int) (short) 1);
        boolean boolean22 = document5.hasClass("hi!");
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("#root");
        java.lang.String str25 = document24.id();
        java.lang.String str26 = document24.data();
        org.jsoup.select.Elements elements27 = document24.parents();
        org.jsoup.select.Elements elements30 = document24.getElementsByAttributeValueStarting("#document", "hi!hi!");
        org.jsoup.select.Elements elements32 = document24.getElementsMatchingText("hi!hi!");
        org.jsoup.nodes.Document document33 = document24.clone();
        org.jsoup.nodes.Element element35 = document24.getElementById(" hi! head");
        org.jsoup.nodes.Element element36 = document5.before((org.jsoup.nodes.Node) document24);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNull(element35);
        org.junit.Assert.assertNotNull(element36);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Element element9 = document7.removeClass("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element11 = element9.prependText("<#root></#root>\n<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        java.lang.Integer int12 = element11.elementSiblingIndex();
        org.jsoup.nodes.Element element14 = element11.val("<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>&lt;#root&gt;\n<!--#root-->   \n<title></title>");
        org.jsoup.nodes.Element element15 = element14.nextElementSibling();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNull(element15);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node6 = document5.previousSibling();
        org.jsoup.nodes.Element element7 = document5.nextElementSibling();
        java.lang.String str8 = document5.title();
        org.jsoup.nodes.Element element10 = document5.toggleClass("hi!");
        org.jsoup.nodes.Document document11 = document5.normalise();
        document5.title("");
        java.util.Set<java.lang.String> strSet14 = document5.classNames();
        org.jsoup.nodes.Element element15 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document16 = document5.normalise();
        org.jsoup.select.Elements elements18 = document5.getElementsByIndexEquals((int) ' ');
        org.jsoup.nodes.Document document19 = document5.normalise();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = document19.childNode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(document19);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Document document7 = document1.normalise();
        document1.title("");
        java.util.Set<java.lang.String> strSet10 = document1.classNames();
        org.jsoup.nodes.Element element12 = document1.text("");
        org.jsoup.select.Elements elements14 = document1.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.select.Elements elements16 = document1.getElementsContainingText("#root");
        java.lang.String str17 = document1.ownText();
        org.jsoup.nodes.Element element19 = document1.getElementById("#root");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = element19.text();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(element19);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document1.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.prettyPrint(false);
        boolean boolean12 = outputSettings9.prettyPrint();
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node15 = document14.previousSibling();
        org.jsoup.nodes.Element element16 = document14.nextElementSibling();
        java.lang.String str17 = document14.title();
        org.jsoup.nodes.Element element19 = document14.toggleClass("hi!");
        org.jsoup.nodes.Element element21 = document14.toggleClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = document14.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings22.prettyPrint(false);
        int int25 = outputSettings24.indentAmount();
        java.nio.charset.CharsetEncoder charsetEncoder26 = outputSettings24.encoder();
        java.nio.charset.Charset charset27 = outputSettings24.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings9.charset(charset27);
        java.nio.charset.Charset charset29 = outputSettings28.charset();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(charsetEncoder26);
        org.junit.Assert.assertNotNull(charset27);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(charset29);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Element element9 = document7.removeClass("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element11 = element9.prependText("<#root></#root>\n<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        java.lang.Integer int12 = element11.elementSiblingIndex();
        org.jsoup.nodes.Element element14 = element11.val("<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>&lt;#root&gt;\n<!--#root-->   \n<title></title>");
        org.jsoup.nodes.Node node16 = element14.removeAttr("<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>\n<#root></#root>");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueNot(" hi!", " hi!");
        org.jsoup.select.Elements elements12 = document1.getElementsByIndexLessThan((int) (short) 0);
        java.lang.String str13 = document1.ownText();
        org.jsoup.nodes.Element element15 = document1.appendText("hi!");
        org.jsoup.nodes.Element element17 = document1.createElement("#root");
        org.jsoup.nodes.Node node18 = element17.nextSibling();
        java.lang.String str19 = element17.toString();
        org.jsoup.nodes.Element element21 = element17.appendText("<#root class=\"hi!\">\n hi!\n</#root>");
        org.jsoup.nodes.Document document23 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node24 = document23.previousSibling();
        org.jsoup.nodes.Element element25 = document23.nextElementSibling();
        java.lang.String str26 = document23.title();
        org.jsoup.nodes.Element element28 = document23.toggleClass("hi!");
        java.lang.String str29 = document23.className();
        org.jsoup.select.Elements elements32 = document23.getElementsByAttributeValueNot(" hi!", " hi!");
        org.jsoup.select.Elements elements34 = document23.getElementsByIndexLessThan((int) (short) 0);
        java.lang.String str35 = document23.ownText();
        org.jsoup.nodes.Element element37 = document23.appendText("hi!");
        org.jsoup.nodes.Element element39 = document23.createElement("#root");
        org.jsoup.nodes.Element element41 = element39.html("<#root class=\"hi!\">\n hi!\n</#root>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element42 = element21.before((org.jsoup.nodes.Node) element41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " hi!" + "'", str7, " hi!");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<#root></#root>" + "'", str19, "<#root></#root>");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + " hi!" + "'", str29, " hi!");
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element41);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        org.jsoup.nodes.Element element10 = document1.appendText("hi!");
        java.lang.String str11 = document1.tagName();
        org.jsoup.nodes.Element element13 = document1.html("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Element element16 = element15.empty();
        org.jsoup.select.Elements elements19 = element16.getElementsByAttributeValueStarting("<#root class=\"hi!\">\n hi!\n</#root>", "#document");
        org.jsoup.nodes.Element element21 = element16.appendElement("hi!");
        org.jsoup.nodes.Element element23 = element21.prependElement("<html><head><title></title></head><body></body></html>");
        org.jsoup.select.Elements elements24 = element21.parents();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements24);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        java.lang.String str11 = document1.html();
        java.lang.String str12 = document1.nodeName();
        org.jsoup.nodes.Document document13 = document1.normalise();
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node16 = document15.previousSibling();
        org.jsoup.nodes.Element element17 = document15.nextElementSibling();
        java.lang.String str18 = document15.title();
        org.jsoup.nodes.Element element20 = document15.toggleClass("hi!");
        org.jsoup.nodes.Element element22 = document15.toggleClass("");
        java.lang.String str24 = document15.absUrl("hi!");
        java.lang.String str25 = document15.html();
        java.lang.String str26 = document15.nodeName();
        org.jsoup.nodes.Document document27 = document15.normalise();
        org.jsoup.nodes.Document document29 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node30 = document29.previousSibling();
        org.jsoup.nodes.Element element31 = document29.nextElementSibling();
        java.lang.String str32 = document29.title();
        org.jsoup.nodes.Element element34 = document29.toggleClass("hi!");
        org.jsoup.nodes.Element element36 = document29.toggleClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = document29.outputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = outputSettings37.escapeMode();
        java.nio.charset.CharsetEncoder charsetEncoder39 = outputSettings37.encoder();
        boolean boolean40 = outputSettings37.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode41 = outputSettings37.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings37.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings42.indentAmount((int) ' ');
        java.nio.charset.CharsetEncoder charsetEncoder45 = outputSettings42.encoder();
        org.jsoup.nodes.Document document46 = document27.outputSettings(outputSettings42);
        org.jsoup.nodes.Document document47 = document13.outputSettings(outputSettings42);
        boolean boolean48 = outputSettings42.prettyPrint();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#document" + "'", str26, "#document");
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + escapeMode41 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode41.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertNotNull(charsetEncoder45);
        org.junit.Assert.assertNotNull(document46);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        java.lang.String str11 = document1.html();
        org.jsoup.nodes.Element element13 = document1.prependText("hi!");
        boolean boolean15 = document1.hasAttr("#root");
        org.jsoup.nodes.Element element17 = document1.appendElement("hi!hi!");
        org.jsoup.select.Elements elements19 = element17.getElementsContainingText("<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        org.jsoup.nodes.Element element12 = document1.appendText("hi!");
        org.jsoup.nodes.Element element13 = document1.empty();
        java.lang.Integer int14 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element17 = document1.attr("<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>", "<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>");
        boolean boolean19 = element17.hasAttr("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element22 = element17.attr("hi! hi!", "<#root class=\"hi!\">\n hi!\n</#root>");
        org.jsoup.nodes.Element element24 = element17.val("<html>\n <head></head>\n <body>\n  #root\n </body>\n</html>");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueNot(" hi!", " hi!");
        org.jsoup.select.Elements elements12 = document1.getElementsByIndexLessThan((int) (byte) 1);
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node15 = document14.previousSibling();
        org.jsoup.nodes.Element element16 = document14.nextElementSibling();
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node19 = document18.previousSibling();
        org.jsoup.nodes.Element element20 = document18.nextElementSibling();
        java.lang.String str21 = document18.title();
        org.jsoup.nodes.Element element23 = document18.toggleClass("hi!");
        org.jsoup.nodes.Document document24 = document18.normalise();
        document18.title("");
        java.util.Set<java.lang.String> strSet27 = document18.classNames();
        org.jsoup.nodes.Element element28 = document14.prependChild((org.jsoup.nodes.Node) document18);
        org.jsoup.nodes.Element element30 = document18.prependElement("#root");
        java.lang.String str31 = element30.html();
        boolean boolean32 = document1.equals((java.lang.Object) element30);
        java.util.Map<java.lang.String, java.lang.String> strMap33 = document1.dataset();
        org.jsoup.nodes.Document document34 = document1.normalise();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " hi!" + "'", str7, " hi!");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNotNull(document34);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node6 = document5.previousSibling();
        org.jsoup.nodes.Element element7 = document5.nextElementSibling();
        java.lang.String str8 = document5.title();
        org.jsoup.nodes.Element element10 = document5.toggleClass("hi!");
        org.jsoup.nodes.Document document11 = document5.normalise();
        document5.title("");
        java.util.Set<java.lang.String> strSet14 = document5.classNames();
        org.jsoup.nodes.Element element15 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element17 = document5.prependElement("#root");
        org.jsoup.nodes.Element element18 = document5.head();
        org.jsoup.select.Elements elements21 = document5.getElementsByAttributeValueMatching("", " hi!");
        org.jsoup.nodes.Document document23 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node24 = document23.previousSibling();
        org.jsoup.nodes.Element element25 = document23.nextElementSibling();
        java.lang.String str26 = document23.title();
        org.jsoup.nodes.Element element28 = document23.toggleClass("hi!");
        org.jsoup.nodes.Element element30 = document23.toggleClass("");
        java.lang.String str32 = document23.absUrl("hi!");
        java.lang.String str33 = document23.html();
        org.jsoup.nodes.Element element35 = document23.prependText("hi!");
        org.jsoup.nodes.Element element37 = document23.prepend("hi!");
        java.util.Set<java.lang.String> strSet38 = document23.classNames();
        org.jsoup.nodes.Element element39 = document5.classNames(strSet38);
        org.jsoup.nodes.Element element41 = element39.tagName(" hi! head");
        org.jsoup.select.Elements elements42 = element39.siblingElements();
        org.jsoup.select.Elements elements44 = element39.getElementsByIndexEquals(10);
        org.jsoup.nodes.Document document46 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node47 = document46.previousSibling();
        org.jsoup.nodes.Element element48 = document46.nextElementSibling();
        java.lang.String str49 = document46.title();
        org.jsoup.nodes.Element element51 = document46.toggleClass("hi!");
        java.lang.String str52 = document46.className();
        org.jsoup.nodes.Element element53 = document46.head();
        org.jsoup.nodes.Document document54 = document46.clone();
        org.jsoup.nodes.Document document55 = document46.normalise();
        org.jsoup.nodes.Element element58 = document46.attr(" hi!", " hi!");
        org.jsoup.select.Elements elements60 = element58.getElementsMatchingText("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element61 = element39.appendChild((org.jsoup.nodes.Node) element58);
        org.jsoup.nodes.Document document63 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node64 = document63.previousSibling();
        org.jsoup.nodes.Element element65 = document63.nextElementSibling();
        java.lang.String str66 = document63.title();
        org.jsoup.nodes.Element element68 = document63.toggleClass("hi!");
        org.jsoup.nodes.Element element70 = document63.toggleClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings71 = document63.outputSettings();
        org.jsoup.nodes.Document document72 = document63.clone();
        org.jsoup.select.Elements elements73 = document72.parents();
        org.jsoup.nodes.Element element75 = document72.prepend("<#root class=\" hi!\">\n <html>\n  <head>\n   <title></title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>hi!");
        org.jsoup.nodes.Element element76 = element61.appendChild((org.jsoup.nodes.Node) element75);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNull(element48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + " hi!" + "'", str52, " hi!");
        org.junit.Assert.assertNull(element53);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertNotNull(document55);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(elements60);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNull(element65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertNotNull(element70);
        org.junit.Assert.assertNotNull(outputSettings71);
        org.junit.Assert.assertNotNull(document72);
        org.junit.Assert.assertNotNull(elements73);
        org.junit.Assert.assertNotNull(element75);
        org.junit.Assert.assertNotNull(element76);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueContaining("#root", " hi!");
        org.jsoup.nodes.Element element13 = document1.tagName("hi!");
        org.jsoup.nodes.Document.QuirksMode quirksMode14 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document15 = document1.quirksMode(quirksMode14);
        org.jsoup.nodes.Document document16 = document1.normalise();
        org.jsoup.nodes.Element element18 = document16.html(" head");
        org.jsoup.select.Elements elements20 = document16.getElementsByAttribute("<head>\n <title></title>\n</head>\n<body>\n</body>hi!hi!");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + quirksMode14 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode14.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueContaining("#root", " hi!");
        org.jsoup.select.Elements elements13 = document1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node16 = document15.previousSibling();
        org.jsoup.nodes.Element element17 = document15.nextElementSibling();
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node20 = document19.previousSibling();
        org.jsoup.nodes.Element element21 = document19.nextElementSibling();
        java.lang.String str22 = document19.title();
        org.jsoup.nodes.Element element24 = document19.toggleClass("hi!");
        org.jsoup.nodes.Document document25 = document19.normalise();
        document19.title("");
        java.util.Set<java.lang.String> strSet28 = document19.classNames();
        org.jsoup.nodes.Element element29 = document15.prependChild((org.jsoup.nodes.Node) document19);
        org.jsoup.nodes.Element element31 = document19.prependElement("#root");
        org.jsoup.nodes.Element element32 = document19.head();
        java.lang.String str33 = element32.tagName();
        java.util.regex.Pattern pattern35 = null;
        org.jsoup.select.Elements elements36 = element32.getElementsByAttributeValueMatching("#root", pattern35);
        org.jsoup.nodes.Element element38 = element32.prependElement("<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Node node39 = element38.unwrap();
        boolean boolean40 = document1.equals((java.lang.Object) node39);
        org.jsoup.nodes.Element element42 = document1.prependText("hi!\n<hi!hi!></hi!hi!>");
        org.jsoup.nodes.Element element44 = element42.removeClass("<#root class=\" hi!\"> hi!");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(element17);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "head" + "'", str33, "head");
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element44);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node6 = document5.previousSibling();
        org.jsoup.nodes.Element element7 = document5.nextElementSibling();
        java.lang.String str8 = document5.title();
        org.jsoup.nodes.Element element10 = document5.toggleClass("hi!");
        org.jsoup.nodes.Document document11 = document5.normalise();
        document5.title("");
        java.util.Set<java.lang.String> strSet14 = document5.classNames();
        org.jsoup.nodes.Element element15 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document16 = document5.normalise();
        org.jsoup.nodes.Element element18 = document16.addClass("head");
        org.jsoup.nodes.Document.QuirksMode quirksMode19 = document16.quirksMode();
        java.lang.String str20 = document16.outerHtml();
        org.jsoup.select.Elements elements22 = document16.getElementsMatchingOwnText("#document");
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node25 = document24.previousSibling();
        org.jsoup.nodes.Element element26 = document24.nextElementSibling();
        org.jsoup.nodes.Document document28 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node29 = document28.previousSibling();
        org.jsoup.nodes.Element element30 = document28.nextElementSibling();
        java.lang.String str31 = document28.title();
        org.jsoup.nodes.Element element33 = document28.toggleClass("hi!");
        org.jsoup.nodes.Document document34 = document28.normalise();
        document28.title("");
        java.util.Set<java.lang.String> strSet37 = document28.classNames();
        org.jsoup.nodes.Element element38 = document24.prependChild((org.jsoup.nodes.Node) document28);
        org.jsoup.nodes.Element element40 = document28.prependElement("#root");
        org.jsoup.nodes.Element element41 = document28.head();
        java.lang.String str42 = element41.tagName();
        java.util.regex.Pattern pattern44 = null;
        org.jsoup.select.Elements elements45 = element41.getElementsByAttributeValueMatching("#root", pattern44);
        org.jsoup.nodes.Element element47 = element41.val(" hi!");
        org.jsoup.nodes.Document document49 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node50 = document49.previousSibling();
        org.jsoup.nodes.Element element51 = document49.nextElementSibling();
        java.lang.String str52 = document49.title();
        org.jsoup.nodes.Element element54 = document49.toggleClass("hi!");
        org.jsoup.nodes.Element element56 = document49.toggleClass("");
        org.jsoup.select.Elements elements58 = element56.getElementsMatchingOwnText("");
        java.lang.String str60 = element56.attr("");
        org.jsoup.nodes.Element element62 = element56.prependText("");
        org.jsoup.nodes.Element element63 = element41.after((org.jsoup.nodes.Node) element56);
        org.jsoup.nodes.Element element64 = element63.nextElementSibling();
        org.jsoup.nodes.Node node65 = element64.nextSibling();
        boolean boolean66 = document16.equals((java.lang.Object) node65);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + quirksMode19 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode19.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>" + "'", str20, "<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(element26);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(element30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "head" + "'", str42, "head");
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNull(element51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(elements58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(element62);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        org.jsoup.select.Elements elements10 = element8.getElementsMatchingOwnText("");
        java.lang.String str12 = element8.attr("");
        org.jsoup.select.Elements elements15 = element8.getElementsByAttributeValueEnding(" hi!", " hi!");
        org.jsoup.nodes.Element element17 = element8.toggleClass("hi!");
        org.jsoup.nodes.Element element18 = element8.empty();
        boolean boolean19 = element18.isBlock();
        org.jsoup.nodes.Element element21 = element18.val("#root&lt;#root class=&quot; hi!&quot;&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;hi!");
        java.lang.String str23 = element21.absUrl("<#root class=\"hi!\">\n hi!\n</#root>");
        org.jsoup.nodes.Element element25 = element21.append("");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(element25);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes4 = element3.attributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        java.lang.String str11 = document1.html();
        org.jsoup.nodes.Element element13 = document1.prependText("hi!");
        org.jsoup.nodes.Element element15 = document1.prepend("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList16 = document1.textNodes();
        org.jsoup.nodes.Element element18 = document1.removeClass(" hi!");
        org.jsoup.nodes.Element element19 = document1.body();
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node22 = document21.previousSibling();
        org.jsoup.nodes.Element element23 = document21.nextElementSibling();
        java.lang.String str24 = document21.title();
        org.jsoup.nodes.Element element26 = document21.toggleClass("hi!");
        org.jsoup.select.Elements elements28 = element26.getElementsMatchingOwnText("");
        org.jsoup.nodes.Document document30 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node31 = document30.previousSibling();
        org.jsoup.nodes.Element element32 = document30.nextElementSibling();
        java.lang.String str33 = document30.title();
        org.jsoup.nodes.Element element35 = document30.toggleClass("hi!");
        org.jsoup.nodes.Document document37 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node38 = document37.previousSibling();
        org.jsoup.nodes.Element element39 = document37.nextElementSibling();
        java.lang.String str40 = document37.title();
        org.jsoup.nodes.Element element42 = document37.toggleClass("hi!");
        org.jsoup.nodes.Element element44 = document37.toggleClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = document37.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings45.prettyPrint(false);
        int int48 = outputSettings47.indentAmount();
        java.nio.charset.CharsetEncoder charsetEncoder49 = outputSettings47.encoder();
        org.jsoup.nodes.Document document50 = document30.outputSettings(outputSettings47);
        org.jsoup.nodes.Document document52 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node53 = document52.previousSibling();
        org.jsoup.nodes.Element element54 = document52.nextElementSibling();
        java.lang.String str55 = document52.title();
        org.jsoup.nodes.Element element57 = document52.toggleClass("hi!");
        org.jsoup.nodes.Document document58 = document52.normalise();
        document52.title("head");
        java.lang.String str61 = document52.title();
        org.jsoup.nodes.Document document63 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node64 = document63.previousSibling();
        org.jsoup.nodes.Element element65 = document63.nextElementSibling();
        java.lang.String str66 = document63.title();
        org.jsoup.nodes.Element element68 = document63.toggleClass("hi!");
        org.jsoup.nodes.Document document69 = document63.normalise();
        document63.title("");
        java.util.Set<java.lang.String> strSet72 = document63.classNames();
        org.jsoup.nodes.Element element73 = document52.classNames(strSet72);
        org.jsoup.nodes.Element element74 = document50.classNames(strSet72);
        org.jsoup.nodes.Element element75 = element26.classNames(strSet72);
        boolean boolean76 = document1.equals((java.lang.Object) element75);
        org.jsoup.select.Elements elements78 = document1.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Attributes attributes79 = document1.attributes();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(textNodeList16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(element32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(element39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(charsetEncoder49);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertNull(element54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(document58);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "head" + "'", str61, "head");
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNull(element65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertNotNull(document69);
        org.junit.Assert.assertNotNull(strSet72);
        org.junit.Assert.assertNotNull(element73);
        org.junit.Assert.assertNotNull(element74);
        org.junit.Assert.assertNotNull(element75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(elements78);
        org.junit.Assert.assertNotNull(attributes79);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Document document7 = document1.normalise();
        document1.title("");
        java.util.Set<java.lang.String> strSet10 = document1.classNames();
        org.jsoup.nodes.Element element12 = document1.text("");
        java.lang.String str13 = document1.id();
        org.jsoup.nodes.Element element15 = document1.removeClass("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element17 = document1.appendText("<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>\n<#root class=\"hi!\" value=\"#document\"></#root>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList18 = document1.dataNodes();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(dataNodeList18);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element3 = document1.appendElement("hi!");
        org.jsoup.nodes.Node node5 = document1.removeAttr("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str6 = document1.toString();
        org.jsoup.nodes.Element element8 = document1.toggleClass("<html>\n <head>\n  <title>head</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements10 = document1.getElementsByClass("#documenthi!");
        org.jsoup.nodes.Document.QuirksMode quirksMode11 = document1.quirksMode();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<hi!></hi!>" + "'", str6, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + quirksMode11 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode11.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node6 = document5.previousSibling();
        org.jsoup.nodes.Element element7 = document5.nextElementSibling();
        java.lang.String str8 = document5.title();
        org.jsoup.nodes.Element element10 = document5.toggleClass("hi!");
        org.jsoup.nodes.Document document11 = document5.normalise();
        document5.title("");
        java.util.Set<java.lang.String> strSet14 = document5.classNames();
        org.jsoup.nodes.Element element15 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document16 = document5.normalise();
        org.jsoup.nodes.Element element18 = document16.addClass("head");
        java.lang.String str19 = document16.outerHtml();
        int int20 = document16.siblingIndex();
        java.lang.String str21 = document16.text();
        org.jsoup.select.Elements elements23 = document16.getElementsContainingText("head");
        org.jsoup.nodes.Element element25 = document16.createElement("<#root class=\" hi!\">\n <html>\n  <head>\n   <title>head</title>\n  </head>\n  <body></body>\n </html>\n</#root>");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>" + "'", str19, "<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element25);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node6 = document5.previousSibling();
        org.jsoup.nodes.Element element7 = document5.nextElementSibling();
        java.lang.String str8 = document5.title();
        org.jsoup.nodes.Element element10 = document5.toggleClass("hi!");
        org.jsoup.nodes.Document document11 = document5.normalise();
        document5.title("");
        java.util.Set<java.lang.String> strSet14 = document5.classNames();
        org.jsoup.nodes.Element element15 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element17 = document5.prependElement("#root");
        org.jsoup.nodes.Element element19 = element17.tagName("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element22 = element17.attr("#root", "<#root></#root>\n<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element24 = element22.prependElement("<title></title>    \n<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element26 = element22.prependElement("<title></title>");
        org.jsoup.select.Elements elements29 = element26.getElementsByAttributeValueNot("hi!hi!", " hi!");
        boolean boolean30 = element26.isBlock();
        org.jsoup.select.Elements elements32 = element26.getElementsByIndexGreaterThan((int) (short) 0);
        org.jsoup.nodes.Element element34 = element26.toggleClass("<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>\n<#root class=\"hi!\" value=\"#document\"></#root>");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(element34);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        org.jsoup.nodes.Element element12 = document1.appendText("hi!");
        org.jsoup.nodes.Element element13 = document1.empty();
        org.jsoup.select.Elements elements15 = element13.select("#document");
        org.jsoup.nodes.Node node17 = element13.removeAttr("hi!hi!<title></title>");
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node20 = document19.previousSibling();
        org.jsoup.nodes.Element element21 = document19.nextElementSibling();
        java.lang.String str22 = document19.title();
        org.jsoup.nodes.Element element24 = document19.toggleClass("hi!");
        org.jsoup.nodes.Element element26 = document19.toggleClass("");
        java.lang.String str28 = document19.absUrl("hi!");
        java.lang.String str29 = document19.html();
        org.jsoup.nodes.Element element31 = document19.prependText("hi!");
        org.jsoup.nodes.Element element33 = document19.prepend("hi!");
        org.jsoup.nodes.Element element35 = document19.getElementById("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Document.QuirksMode quirksMode36 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document37 = document19.quirksMode(quirksMode36);
        boolean boolean38 = element13.equals((java.lang.Object) quirksMode36);
        org.jsoup.nodes.Element element40 = element13.val("hi! hi!");
        org.jsoup.nodes.Element element42 = element13.prependElement("&lt;#root class=&quot; hi!&quot;&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;head&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;\n<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNull(element35);
        org.junit.Assert.assertTrue("'" + quirksMode36 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode36.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node6 = document5.previousSibling();
        org.jsoup.nodes.Element element7 = document5.nextElementSibling();
        java.lang.String str8 = document5.title();
        org.jsoup.nodes.Element element10 = document5.toggleClass("hi!");
        org.jsoup.nodes.Document document11 = document5.normalise();
        document5.title("");
        java.util.Set<java.lang.String> strSet14 = document5.classNames();
        org.jsoup.nodes.Element element15 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document16 = document5.normalise();
        org.jsoup.nodes.Element element18 = document16.addClass("head");
        org.jsoup.nodes.Element element20 = element18.prepend("");
        org.jsoup.nodes.Element element22 = element18.html("<html>\n <head>\n  <title>head</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element24 = element22.wrap("hi! hi!");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNull(element24);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        org.jsoup.nodes.Element element10 = document1.appendText("hi!");
        java.lang.String str11 = document1.tagName();
        org.jsoup.nodes.Element element13 = document1.html("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Element element16 = element15.empty();
        java.lang.Integer int17 = element15.elementSiblingIndex();
        org.jsoup.nodes.Element element19 = element15.tagName("hi!");
        org.jsoup.nodes.Element element20 = element19.empty();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node6 = document5.previousSibling();
        org.jsoup.nodes.Element element7 = document5.nextElementSibling();
        java.lang.String str8 = document5.title();
        org.jsoup.nodes.Element element10 = document5.toggleClass("hi!");
        org.jsoup.nodes.Document document11 = document5.normalise();
        document5.title("");
        java.util.Set<java.lang.String> strSet14 = document5.classNames();
        org.jsoup.nodes.Element element15 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element17 = document5.prependElement("#root");
        org.jsoup.nodes.Element element18 = document5.head();
        org.jsoup.select.Elements elements21 = document5.getElementsByAttributeValueMatching("", " hi!");
        org.jsoup.nodes.Document document23 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node24 = document23.previousSibling();
        org.jsoup.nodes.Element element25 = document23.nextElementSibling();
        java.lang.String str26 = document23.title();
        org.jsoup.nodes.Element element28 = document23.toggleClass("hi!");
        org.jsoup.nodes.Element element30 = document23.toggleClass("");
        java.lang.String str32 = document23.absUrl("hi!");
        java.lang.String str33 = document23.html();
        org.jsoup.nodes.Element element35 = document23.prependText("hi!");
        org.jsoup.nodes.Element element37 = document23.prepend("hi!");
        java.util.Set<java.lang.String> strSet38 = document23.classNames();
        org.jsoup.nodes.Element element39 = document5.classNames(strSet38);
        org.jsoup.nodes.Element element41 = element39.tagName(" hi! head");
        org.jsoup.select.Elements elements43 = element41.getElementsByIndexEquals(0);
        org.jsoup.select.Elements elements45 = element41.getElementsMatchingOwnText("<title></title>    #document");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(elements45);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Document document7 = document1.normalise();
        boolean boolean9 = document1.hasClass("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements12 = document1.getElementsByAttributeValue("hi!", "#document");
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = document1.outputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings13.escapeMode();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node6 = document5.previousSibling();
        org.jsoup.nodes.Element element7 = document5.nextElementSibling();
        java.lang.String str8 = document5.title();
        org.jsoup.nodes.Element element10 = document5.toggleClass("hi!");
        org.jsoup.nodes.Document document11 = document5.normalise();
        document5.title("");
        java.util.Set<java.lang.String> strSet14 = document5.classNames();
        org.jsoup.nodes.Element element15 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document16 = document5.normalise();
        org.jsoup.nodes.Element element18 = document16.addClass("head");
        org.jsoup.nodes.Element element20 = element18.prepend("");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = element18.dataset();
        org.jsoup.nodes.Element element22 = element18.empty();
        org.jsoup.nodes.Element element24 = element18.getElementById("<#root></#root>\n<html>\n <head>\n  <title></title>\n </head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNull(element24);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node6 = document5.previousSibling();
        org.jsoup.nodes.Element element7 = document5.nextElementSibling();
        java.lang.String str8 = document5.title();
        org.jsoup.nodes.Element element10 = document5.toggleClass("hi!");
        org.jsoup.nodes.Document document11 = document5.normalise();
        document5.title("");
        java.util.Set<java.lang.String> strSet14 = document5.classNames();
        org.jsoup.nodes.Element element15 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element17 = document5.prependElement("#root");
        org.jsoup.nodes.Element element18 = document5.head();
        org.jsoup.select.Elements elements21 = document5.getElementsByAttributeValueMatching("", " hi!");
        org.jsoup.nodes.Document document23 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node24 = document23.previousSibling();
        org.jsoup.nodes.Element element25 = document23.nextElementSibling();
        java.lang.String str26 = document23.title();
        org.jsoup.nodes.Element element28 = document23.toggleClass("hi!");
        org.jsoup.nodes.Element element30 = document23.toggleClass("");
        java.lang.String str32 = document23.absUrl("hi!");
        java.lang.String str33 = document23.html();
        org.jsoup.nodes.Element element35 = document23.prependText("hi!");
        org.jsoup.nodes.Element element37 = document23.prepend("hi!");
        java.util.Set<java.lang.String> strSet38 = document23.classNames();
        org.jsoup.nodes.Element element39 = document5.classNames(strSet38);
        org.jsoup.nodes.Element element41 = element39.tagName(" hi! head");
        org.jsoup.nodes.Element element44 = element41.attr(" hi!", " hi! head");
        org.jsoup.nodes.Document document46 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node47 = document46.previousSibling();
        org.jsoup.nodes.Element element48 = document46.nextElementSibling();
        java.lang.String str49 = document46.title();
        org.jsoup.nodes.Element element51 = document46.toggleClass("hi!");
        org.jsoup.nodes.Element element53 = document46.toggleClass("");
        java.lang.String str55 = document46.absUrl("hi!");
        java.lang.String str56 = document46.html();
        java.lang.String str57 = document46.nodeName();
        org.jsoup.nodes.Document document58 = document46.normalise();
        java.lang.String str59 = document58.baseUri();
        boolean boolean61 = document58.hasClass(" hi!");
        org.jsoup.nodes.Element element63 = document58.append("#root");
        org.jsoup.nodes.Element element64 = element63.empty();
        org.jsoup.nodes.Element element65 = element44.after((org.jsoup.nodes.Node) element63);
        org.jsoup.select.Elements elements67 = element44.getElementsByAttribute("hi! hi!");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNull(element48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "#document" + "'", str57, "#document");
        org.junit.Assert.assertNotNull(document58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertNotNull(elements67);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        java.lang.String str11 = document1.html();
        java.lang.String str12 = document1.nodeName();
        org.jsoup.nodes.Document document13 = document1.normalise();
        java.lang.String str14 = document13.baseUri();
        boolean boolean16 = document13.hasClass(" hi!");
        org.jsoup.nodes.Element element18 = document13.append("#root");
        org.jsoup.nodes.Attributes attributes19 = element18.attributes();
        org.jsoup.select.Elements elements21 = element18.getElementsByClass("<<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>></<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>>hi!hi!&lt;html&gt; &lt;head&gt; &lt;title&gt;&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node6 = document5.previousSibling();
        org.jsoup.nodes.Element element7 = document5.nextElementSibling();
        java.lang.String str8 = document5.title();
        org.jsoup.nodes.Element element10 = document5.toggleClass("hi!");
        org.jsoup.nodes.Document document11 = document5.normalise();
        document5.title("");
        java.util.Set<java.lang.String> strSet14 = document5.classNames();
        org.jsoup.nodes.Element element15 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element17 = document5.prependElement("#root");
        org.jsoup.nodes.Element element18 = document5.head();
        org.jsoup.nodes.Node node20 = document5.childNode((int) (short) 1);
        java.util.regex.Pattern pattern22 = null;
        org.jsoup.select.Elements elements23 = document5.getElementsByAttributeValueMatching("<title></title>    \n<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>", pattern22);
        org.jsoup.select.Elements elements25 = document5.getElementsByAttribute("#root");
        java.lang.String str27 = document5.absUrl("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str28 = document5.ownText();
        org.jsoup.nodes.Element element29 = document5.previousElementSibling();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(element29);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document1.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.prettyPrint(false);
        int int12 = outputSettings11.indentAmount();
        int int13 = outputSettings11.indentAmount();
        int int14 = outputSettings11.indentAmount();
        java.nio.charset.Charset charset15 = outputSettings11.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = outputSettings11.escapeMode();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(charset15);
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueContaining("#root", " hi!");
        org.jsoup.nodes.Element element13 = document1.tagName("hi!");
        org.jsoup.nodes.Document.QuirksMode quirksMode14 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document15 = document1.quirksMode(quirksMode14);
        org.jsoup.nodes.Element element16 = document1.previousElementSibling();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = document1.outputSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = document1.siblingNodes();
        org.jsoup.nodes.Element element20 = document1.prepend("hi!hi!&lt;title&gt;&lt;/title&gt;");
        org.jsoup.select.Elements elements22 = element20.getElementsByClass("<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>&lt;#root&gt;\n<!--#root-->   \n<title></title>");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + quirksMode14 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode14.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document4 = document1.ownerDocument();
        org.jsoup.select.Elements elements6 = document1.getElementsByAttribute("#document");
        java.lang.String str7 = document1.title();
        org.jsoup.nodes.Element element9 = document1.append("");
        org.jsoup.nodes.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = document1.appendChild(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        java.lang.String str11 = document1.html();
        java.lang.String str12 = document1.nodeName();
        org.jsoup.nodes.Element element13 = document1.parent();
        org.jsoup.select.Elements elements16 = document1.getElementsByAttributeValueContaining("<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>", "#document");
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node19 = document18.previousSibling();
        org.jsoup.nodes.Element element20 = document18.nextElementSibling();
        java.lang.String str21 = document18.title();
        org.jsoup.nodes.Element element23 = document18.toggleClass("hi!");
        org.jsoup.nodes.Element element25 = document18.toggleClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = document18.outputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings26.escapeMode();
        java.nio.charset.CharsetEncoder charsetEncoder28 = outputSettings26.encoder();
        boolean boolean29 = outputSettings26.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = outputSettings26.escapeMode();
        org.jsoup.nodes.Document document31 = document1.outputSettings(outputSettings26);
        java.lang.String str33 = document1.absUrl("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Document document34 = document1.normalise();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList35 = document1.dataNodes();
        org.jsoup.nodes.Element element37 = document1.createElement(" hi!");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertTrue("'" + escapeMode27 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode27.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + escapeMode30 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode30.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(dataNodeList35);
        org.junit.Assert.assertNotNull(element37);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Document document7 = document1.normalise();
        document1.title("");
        java.util.Set<java.lang.String> strSet10 = document1.classNames();
        org.jsoup.nodes.Element element12 = document1.text("");
        org.jsoup.select.Elements elements14 = document1.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.select.Elements elements16 = document1.getElementsContainingText("#root");
        org.jsoup.nodes.Element element18 = document1.createElement("<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element20 = document1.toggleClass("hi!hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList21 = document1.textNodes();
        org.jsoup.select.Elements elements22 = document1.parents();
        org.jsoup.select.Elements elements24 = document1.getElementsContainingOwnText("hi! hi!");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(textNodeList21);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements24);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        java.lang.String str11 = document1.html();
        org.jsoup.nodes.Element element13 = document1.prependText("hi!");
        org.jsoup.nodes.Element element15 = document1.toggleClass("#document");
        org.jsoup.nodes.Node node16 = element15.nextSibling();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueNot(" hi!", " hi!");
        org.jsoup.select.Elements elements12 = document1.getElementsByIndexLessThan((int) (byte) 1);
        java.lang.Integer int13 = document1.elementSiblingIndex();
        java.lang.String str14 = document1.outerHtml();
        org.jsoup.nodes.Element element16 = document1.addClass("&lt;#root class=&quot;hi!&quot;&gt; hi! \n<!--#root-->hi!");
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node19 = document18.previousSibling();
        org.jsoup.nodes.Element element20 = document18.nextElementSibling();
        java.lang.String str21 = document18.title();
        org.jsoup.nodes.Element element23 = document18.toggleClass("hi!");
        org.jsoup.nodes.Element element25 = document18.toggleClass("");
        org.jsoup.select.Elements elements27 = element25.getElementsMatchingOwnText("");
        java.lang.String str29 = element25.attr("");
        org.jsoup.nodes.Element element31 = element25.prependText("");
        org.jsoup.nodes.Document document33 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node34 = document33.previousSibling();
        org.jsoup.nodes.Element element35 = document33.nextElementSibling();
        org.jsoup.nodes.Document document37 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node38 = document37.previousSibling();
        org.jsoup.nodes.Element element39 = document37.nextElementSibling();
        java.lang.String str40 = document37.title();
        org.jsoup.nodes.Element element42 = document37.toggleClass("hi!");
        org.jsoup.nodes.Document document43 = document37.normalise();
        document37.title("");
        java.util.Set<java.lang.String> strSet46 = document37.classNames();
        org.jsoup.nodes.Element element47 = document33.prependChild((org.jsoup.nodes.Node) document37);
        org.jsoup.nodes.Document document48 = document37.normalise();
        org.jsoup.nodes.Element element50 = document48.addClass("head");
        org.jsoup.nodes.Document.QuirksMode quirksMode51 = document48.quirksMode();
        java.lang.String str52 = document48.outerHtml();
        java.lang.String str53 = document48.val();
        org.jsoup.nodes.Element element54 = element25.appendChild((org.jsoup.nodes.Node) document48);
        java.lang.String str55 = element25.val();
        org.jsoup.nodes.Document document57 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node58 = document57.previousSibling();
        org.jsoup.nodes.Element element59 = document57.nextElementSibling();
        java.lang.String str60 = document57.title();
        org.jsoup.nodes.Element element62 = document57.toggleClass("hi!");
        org.jsoup.nodes.Document document63 = document57.normalise();
        document57.title("head");
        java.lang.String str66 = document57.title();
        org.jsoup.nodes.Document document68 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node69 = document68.previousSibling();
        org.jsoup.nodes.Element element70 = document68.nextElementSibling();
        java.lang.String str71 = document68.title();
        org.jsoup.nodes.Element element73 = document68.toggleClass("hi!");
        org.jsoup.nodes.Document document74 = document68.normalise();
        document68.title("");
        java.util.Set<java.lang.String> strSet77 = document68.classNames();
        org.jsoup.nodes.Element element78 = document57.classNames(strSet77);
        org.jsoup.nodes.Element element79 = document57.empty();
        java.util.Set<java.lang.String> strSet80 = document57.classNames();
        org.jsoup.nodes.Element element81 = element25.classNames(strSet80);
        org.jsoup.nodes.Element element82 = element16.classNames(strSet80);
        org.jsoup.nodes.Element element84 = element82.tagName("#documenthi!");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " hi!" + "'", str7, " hi!");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(element35);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(element39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertTrue("'" + quirksMode51 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode51.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>" + "'", str52, "<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNull(element59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(element62);
        org.junit.Assert.assertNotNull(document63);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "head" + "'", str66, "head");
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertNull(element70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(element73);
        org.junit.Assert.assertNotNull(document74);
        org.junit.Assert.assertNotNull(strSet77);
        org.junit.Assert.assertNotNull(element78);
        org.junit.Assert.assertNotNull(element79);
        org.junit.Assert.assertNotNull(strSet80);
        org.junit.Assert.assertNotNull(element81);
        org.junit.Assert.assertNotNull(element82);
        org.junit.Assert.assertNotNull(element84);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Element element9 = document7.toggleClass("<title></title>    \n<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        org.jsoup.parser.Tag tag10 = document7.tag();
        org.jsoup.select.Elements elements13 = document7.getElementsByAttributeValueContaining("<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>&lt;#root&gt;\n<!--#root-->   \n<title></title>", "<#root>");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = document7.dataset();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        java.lang.String str11 = document1.html();
        org.jsoup.nodes.Element element13 = document1.prependText("hi!");
        boolean boolean15 = document1.hasAttr("#root");
        boolean boolean17 = document1.hasClass(" hi!");
        java.util.regex.Pattern pattern19 = null;
        org.jsoup.select.Elements elements20 = document1.getElementsByAttributeValueMatching("", pattern19);
        org.jsoup.nodes.Element element21 = document1.empty();
        org.jsoup.nodes.Document document22 = document1.normalise();
        org.jsoup.select.Elements elements25 = document22.getElementsByAttributeValueNot("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>", "<#root></#root>");
        org.jsoup.select.Elements elements27 = document22.getElementsByClass("&lt;head&gt; &lt;title&gt;&lt;/title&gt; &lt;/head&gt;\n<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elements27);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.nodes.Element element8 = document1.head();
        org.jsoup.nodes.Document document9 = document1.clone();
        java.lang.String str11 = document9.absUrl("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Document document12 = document9.ownerDocument();
        java.lang.String str14 = document12.attr("<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        java.lang.Integer int15 = document12.elementSiblingIndex();
        org.jsoup.select.Elements elements17 = document12.getElementsMatchingText("hi!hi!<title></title>");
        java.lang.String str18 = document12.nodeName();
        boolean boolean20 = document12.hasAttr("head  \n<title></title>");
        java.lang.String str21 = document12.baseUri();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " hi!" + "'", str7, " hi!");
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#document" + "'", str18, "#document");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document4 = document1.ownerDocument();
        org.jsoup.select.Elements elements6 = document1.getElementsByAttribute("#document");
        java.lang.String str7 = document1.title();
        org.jsoup.nodes.Element element9 = document1.appendText("hi!hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = document1.outputSettings();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node13 = document12.previousSibling();
        org.jsoup.nodes.Element element14 = document12.nextElementSibling();
        java.lang.String str15 = document12.title();
        org.jsoup.nodes.Element element17 = document12.toggleClass("hi!");
        org.jsoup.nodes.Element element19 = document12.toggleClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = document12.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings20.prettyPrint(false);
        int int23 = outputSettings22.indentAmount();
        int int24 = outputSettings22.indentAmount();
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node27 = document26.previousSibling();
        org.jsoup.nodes.Element element28 = document26.nextElementSibling();
        java.lang.String str29 = document26.title();
        org.jsoup.nodes.Element element31 = document26.toggleClass("hi!");
        org.jsoup.nodes.Element element33 = document26.toggleClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = document26.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings34.prettyPrint(false);
        int int37 = outputSettings36.indentAmount();
        java.nio.charset.Charset charset38 = outputSettings36.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings22.charset(charset38);
        java.nio.charset.Charset charset40 = outputSettings22.charset();
        int int41 = outputSettings22.indentAmount();
        org.jsoup.nodes.Document document43 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node44 = document43.previousSibling();
        org.jsoup.nodes.Element element45 = document43.nextElementSibling();
        java.lang.String str46 = document43.title();
        org.jsoup.nodes.Element element48 = document43.toggleClass("hi!");
        org.jsoup.nodes.Element element50 = document43.toggleClass("");
        java.lang.String str52 = document43.absUrl("hi!");
        java.lang.String str53 = document43.html();
        org.jsoup.select.Elements elements54 = document43.children();
        org.jsoup.select.Elements elements55 = document43.getAllElements();
        org.jsoup.select.Elements elements58 = document43.getElementsByAttributeValueStarting("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>", "#root");
        org.jsoup.nodes.Document document59 = document43.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = document43.outputSettings();
        org.jsoup.nodes.Document document62 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node63 = document62.previousSibling();
        org.jsoup.nodes.Element element64 = document62.nextElementSibling();
        java.lang.String str65 = document62.title();
        org.jsoup.nodes.Element element67 = document62.toggleClass("hi!");
        org.jsoup.nodes.Element element69 = document62.toggleClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings70 = document62.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings72 = outputSettings70.prettyPrint(false);
        org.jsoup.nodes.Document document74 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node75 = document74.previousSibling();
        org.jsoup.nodes.Element element76 = document74.nextElementSibling();
        java.lang.String str77 = document74.title();
        org.jsoup.nodes.Element element79 = document74.toggleClass("hi!");
        org.jsoup.nodes.Element element81 = document74.toggleClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings82 = document74.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings84 = outputSettings82.prettyPrint(false);
        java.nio.charset.Charset charset85 = outputSettings82.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings86 = outputSettings70.charset(charset85);
        org.jsoup.nodes.Document.OutputSettings outputSettings87 = outputSettings60.charset(charset85);
        org.jsoup.nodes.Document.OutputSettings outputSettings88 = outputSettings22.charset(charset85);
        org.jsoup.nodes.Document.OutputSettings outputSettings89 = outputSettings10.charset(charset85);
        org.jsoup.nodes.Document.OutputSettings outputSettings91 = outputSettings89.indentAmount((int) (byte) 100);
        boolean boolean92 = outputSettings91.prettyPrint();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(charset38);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertNotNull(charset40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(element45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(elements54);
        org.junit.Assert.assertNotNull(elements55);
        org.junit.Assert.assertNotNull(elements58);
        org.junit.Assert.assertNotNull(document59);
        org.junit.Assert.assertNotNull(outputSettings60);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertNull(element64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertNotNull(element69);
        org.junit.Assert.assertNotNull(outputSettings70);
        org.junit.Assert.assertNotNull(outputSettings72);
        org.junit.Assert.assertNull(node75);
        org.junit.Assert.assertNull(element76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(element79);
        org.junit.Assert.assertNotNull(element81);
        org.junit.Assert.assertNotNull(outputSettings82);
        org.junit.Assert.assertNotNull(outputSettings84);
        org.junit.Assert.assertNotNull(charset85);
        org.junit.Assert.assertNotNull(outputSettings86);
        org.junit.Assert.assertNotNull(outputSettings87);
        org.junit.Assert.assertNotNull(outputSettings88);
        org.junit.Assert.assertNotNull(outputSettings89);
        org.junit.Assert.assertNotNull(outputSettings91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueNot(" hi!", " hi!");
        org.jsoup.select.Elements elements12 = document1.getElementsByIndexLessThan((int) (byte) 1);
        java.lang.Integer int13 = document1.elementSiblingIndex();
        java.lang.String str14 = document1.outerHtml();
        org.jsoup.nodes.Element element16 = document1.append("#root");
        org.jsoup.select.Elements elements17 = document1.parents();
        org.jsoup.select.Elements elements19 = document1.getElementsByTag("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>");
        java.lang.String str20 = document1.html();
        java.lang.String str21 = document1.data();
        org.jsoup.nodes.Element element23 = document1.html("<head>\n <title></title>\n</head>");
        java.lang.String str24 = element23.id();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " hi!" + "'", str7, " hi!");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#root" + "'", str20, "#root");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.nodes.Element element8 = document1.head();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.prettyPrint(false);
        org.jsoup.nodes.Document document12 = document1.outputSettings(outputSettings11);
        org.jsoup.nodes.Element element13 = document1.head();
        java.lang.String str14 = document1.data();
        java.lang.String str15 = document1.title();
        org.jsoup.nodes.Element element16 = document1.empty();
        org.jsoup.nodes.Node node17 = element16.previousSibling();
        org.jsoup.select.Elements elements20 = element16.getElementsByAttributeValueContaining("<head>\n <title></title>\n</head>\n<body>\n</body>", "&lt;#root class=&quot; hi!&quot;&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;head&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;\n<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " hi!" + "'", str7, " hi!");
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node6 = document5.previousSibling();
        org.jsoup.nodes.Element element7 = document5.nextElementSibling();
        java.lang.String str8 = document5.title();
        org.jsoup.nodes.Element element10 = document5.toggleClass("hi!");
        org.jsoup.nodes.Document document11 = document5.normalise();
        document5.title("");
        java.util.Set<java.lang.String> strSet14 = document5.classNames();
        org.jsoup.nodes.Element element15 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element17 = document5.prependElement("#root");
        org.jsoup.nodes.Element element18 = document5.body();
        org.jsoup.nodes.Document.QuirksMode quirksMode19 = document5.quirksMode();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + quirksMode19 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode19.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueNot(" hi!", " hi!");
        org.jsoup.select.Elements elements12 = document1.getElementsByIndexLessThan((int) (byte) 1);
        org.jsoup.nodes.Node node14 = document1.removeAttr("head");
        java.lang.String str15 = document1.baseUri();
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node18 = document17.previousSibling();
        org.jsoup.nodes.Element element19 = document17.nextElementSibling();
        java.lang.String str20 = document17.title();
        org.jsoup.nodes.Element element22 = document17.toggleClass("hi!");
        org.jsoup.nodes.Document document23 = document17.normalise();
        document17.title("head");
        org.jsoup.nodes.Element element26 = document1.prependChild((org.jsoup.nodes.Node) document17);
        org.jsoup.nodes.Element element28 = document17.html("<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element30 = document17.createElement("#root&lt;#root class=&quot; hi!&quot;&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;hi!");
        java.lang.String str31 = document17.nodeName();
        java.lang.Class<?> wildcardClass32 = document17.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " hi!" + "'", str7, " hi!");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#document" + "'", str31, "#document");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node6 = document5.previousSibling();
        org.jsoup.nodes.Element element7 = document5.nextElementSibling();
        java.lang.String str8 = document5.title();
        org.jsoup.nodes.Element element10 = document5.toggleClass("hi!");
        org.jsoup.nodes.Document document11 = document5.normalise();
        document5.title("");
        java.util.Set<java.lang.String> strSet14 = document5.classNames();
        org.jsoup.nodes.Element element15 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element17 = document5.prependElement("#root");
        org.jsoup.nodes.Element element18 = document5.head();
        org.jsoup.nodes.Node node20 = document5.childNode((int) (short) 1);
        document5.remove();
        org.jsoup.select.Elements elements23 = document5.getElementsContainingOwnText("<#root class=\"hi!\">\n hi!\n</#root>");
        org.jsoup.nodes.Element element24 = document5.empty();
        org.jsoup.select.Elements elements27 = element24.getElementsByAttributeValueNot("head", "<title></title>    \n<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = element24.childNodes();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(nodeList28);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node6 = document5.previousSibling();
        org.jsoup.nodes.Element element7 = document5.nextElementSibling();
        java.lang.String str8 = document5.title();
        org.jsoup.nodes.Element element10 = document5.toggleClass("hi!");
        org.jsoup.nodes.Document document11 = document5.normalise();
        document5.title("");
        java.util.Set<java.lang.String> strSet14 = document5.classNames();
        org.jsoup.nodes.Element element15 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element17 = document5.prependElement("#root");
        org.jsoup.nodes.Element element18 = document5.head();
        org.jsoup.nodes.Node node20 = document5.childNode((int) (short) 1);
        boolean boolean22 = document5.hasClass("hi!");
        org.jsoup.nodes.Element element24 = document5.before("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element26 = element24.after("hi!hi!");
        int int27 = element26.siblingIndex();
        org.jsoup.nodes.Element element29 = element26.appendElement("hi!");
        org.jsoup.nodes.Attributes attributes30 = element29.attributes();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList31 = element29.dataNodes();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7 + "'", int27 == 7);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(dataNodeList31);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueNot(" hi!", " hi!");
        org.jsoup.select.Elements elements12 = document1.getElementsByIndexLessThan((int) (byte) 1);
        org.jsoup.nodes.Node node14 = document1.removeAttr("head");
        org.jsoup.nodes.Node node15 = document1.previousSibling();
        org.jsoup.nodes.Element element17 = document1.getElementById("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList18 = document1.dataNodes();
        org.jsoup.select.Elements elements20 = document1.getElementsByTag("<html>\n <<title></title>    #document></<title></title>    #document>\n <head value=\" hi!\"></head>\n <#root class=\"hi!\">\n </#root>\n <body></body>\n</html>");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " hi!" + "'", str7, " hi!");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(element17);
        org.junit.Assert.assertNotNull(dataNodeList18);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node9 = document8.previousSibling();
        org.jsoup.nodes.Element element10 = document8.nextElementSibling();
        java.lang.String str11 = document8.title();
        org.jsoup.nodes.Element element13 = document8.toggleClass("hi!");
        org.jsoup.nodes.Element element15 = document8.toggleClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = document8.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.prettyPrint(false);
        int int19 = outputSettings18.indentAmount();
        java.nio.charset.CharsetEncoder charsetEncoder20 = outputSettings18.encoder();
        org.jsoup.nodes.Document document21 = document1.outputSettings(outputSettings18);
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings22.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings22.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings22.prettyPrint(false);
        org.jsoup.nodes.Document document28 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node29 = document28.previousSibling();
        org.jsoup.nodes.Element element30 = document28.nextElementSibling();
        java.lang.String str31 = document28.title();
        org.jsoup.nodes.Element element33 = document28.toggleClass("hi!");
        org.jsoup.nodes.Element element35 = document28.toggleClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = document28.outputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode37 = outputSettings36.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings26.escapeMode(escapeMode37);
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings18.escapeMode(escapeMode37);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(charsetEncoder20);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(element30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertTrue("'" + escapeMode37 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode37.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertNotNull(outputSettings39);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node6 = document5.previousSibling();
        org.jsoup.nodes.Element element7 = document5.nextElementSibling();
        java.lang.String str8 = document5.title();
        org.jsoup.nodes.Element element10 = document5.toggleClass("hi!");
        org.jsoup.nodes.Document document11 = document5.normalise();
        document5.title("");
        java.util.Set<java.lang.String> strSet14 = document5.classNames();
        org.jsoup.nodes.Element element15 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element17 = document5.prependElement("#root");
        org.jsoup.nodes.Element element19 = document5.append("#document");
        org.jsoup.nodes.Element element20 = element19.nextElementSibling();
        org.jsoup.select.Elements elements22 = element19.getElementsContainingOwnText("<#root></#root>\n<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements24 = element19.getElementsByIndexEquals((int) ' ');
        java.lang.Integer int25 = element19.elementSiblingIndex();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNull(element20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Attributes attributes2 = document1.attributes();
        org.jsoup.select.Elements elements4 = document1.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements5 = document1.siblingElements();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValue("#root", "hi!");
        org.jsoup.select.Elements elements9 = document1.siblingElements();
        boolean boolean10 = document1.isBlock();
        org.jsoup.nodes.Document.QuirksMode quirksMode11 = document1.quirksMode();
        org.jsoup.nodes.Document.QuirksMode quirksMode12 = document1.quirksMode();
        org.jsoup.nodes.Element element14 = document1.addClass(" hi!");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node17 = document16.previousSibling();
        org.jsoup.nodes.Element element18 = document16.nextElementSibling();
        org.jsoup.nodes.Document document19 = document16.ownerDocument();
        org.jsoup.select.Elements elements21 = document16.getElementsByAttribute("#document");
        java.lang.String str22 = document16.title();
        org.jsoup.nodes.Document document23 = document16.normalise();
        org.jsoup.select.Elements elements25 = document23.getElementsByIndexEquals((int) (byte) 0);
        org.jsoup.nodes.Element element27 = document23.html("hi!");
        org.jsoup.nodes.Element element29 = document23.removeClass("hi!\n<hi!hi!></hi!hi!>");
        java.lang.String str30 = document23.baseUri();
        org.jsoup.nodes.Element element31 = document1.appendChild((org.jsoup.nodes.Node) document23);
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + quirksMode11 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode11.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertTrue("'" + quirksMode12 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode12.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(element18);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(element31);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        org.jsoup.select.Elements elements10 = element8.getElementsMatchingOwnText("");
        java.lang.String str12 = element8.attr("");
        org.jsoup.nodes.Element element14 = element8.prependText("");
        java.lang.String str15 = element8.text();
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node18 = document17.previousSibling();
        org.jsoup.nodes.Element element19 = document17.nextElementSibling();
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node22 = document21.previousSibling();
        org.jsoup.nodes.Element element23 = document21.nextElementSibling();
        java.lang.String str24 = document21.title();
        org.jsoup.nodes.Element element26 = document21.toggleClass("hi!");
        org.jsoup.nodes.Document document27 = document21.normalise();
        document21.title("");
        java.util.Set<java.lang.String> strSet30 = document21.classNames();
        org.jsoup.nodes.Element element31 = document17.prependChild((org.jsoup.nodes.Node) document21);
        org.jsoup.nodes.Element element33 = document21.prependElement("#root");
        org.jsoup.nodes.Element element34 = document21.head();
        java.lang.String str35 = element34.tagName();
        java.util.regex.Pattern pattern37 = null;
        org.jsoup.select.Elements elements38 = element34.getElementsByAttributeValueMatching("#root", pattern37);
        org.jsoup.nodes.Element element40 = element34.val(" hi!");
        org.jsoup.nodes.Document document42 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node43 = document42.previousSibling();
        org.jsoup.nodes.Element element44 = document42.nextElementSibling();
        java.lang.String str45 = document42.title();
        org.jsoup.nodes.Element element47 = document42.toggleClass("hi!");
        org.jsoup.nodes.Element element49 = document42.toggleClass("");
        org.jsoup.select.Elements elements51 = element49.getElementsMatchingOwnText("");
        java.lang.String str53 = element49.attr("");
        org.jsoup.nodes.Element element55 = element49.prependText("");
        org.jsoup.nodes.Element element56 = element34.after((org.jsoup.nodes.Node) element49);
        org.jsoup.nodes.Document document58 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node59 = document58.previousSibling();
        org.jsoup.nodes.Element element60 = document58.nextElementSibling();
        org.jsoup.nodes.Document document61 = document58.ownerDocument();
        org.jsoup.select.Elements elements63 = document58.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element64 = document58.head();
        org.jsoup.nodes.Element element66 = document58.append("");
        org.jsoup.nodes.Element element67 = element56.appendChild((org.jsoup.nodes.Node) element66);
        org.jsoup.nodes.Element element68 = element8.appendChild((org.jsoup.nodes.Node) element67);
        java.lang.Integer int69 = element8.elementSiblingIndex();
        java.lang.String str71 = element8.absUrl("<html>\n <head></head>\n <body>\n  #root\n </body>\n</html>");
        java.util.List<org.jsoup.nodes.Node> nodeList72 = element8.childNodes();
        org.jsoup.nodes.Document document74 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node75 = document74.previousSibling();
        org.jsoup.nodes.Element element76 = document74.nextElementSibling();
        java.lang.String str77 = document74.title();
        org.jsoup.nodes.Element element79 = document74.toggleClass("hi!");
        org.jsoup.nodes.Element element81 = document74.toggleClass("");
        org.jsoup.select.Elements elements84 = document74.getElementsByAttributeValueContaining("#root", " hi!");
        org.jsoup.nodes.Element element86 = document74.tagName("hi!");
        org.jsoup.nodes.Document.QuirksMode quirksMode87 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document88 = document74.quirksMode(quirksMode87);
        org.jsoup.select.Elements elements90 = document74.getElementsByIndexEquals((int) ' ');
        org.jsoup.select.Elements elements92 = document74.getElementsByIndexEquals((int) (short) 0);
        org.jsoup.select.Elements elements93 = document74.siblingElements();
        java.lang.String str94 = document74.html();
        org.jsoup.nodes.Element element96 = document74.append(" hi! head");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element97 = element8.after((org.jsoup.nodes.Node) document74);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "head" + "'", str35, "head");
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(element44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(elements51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNull(element60);
        org.junit.Assert.assertNotNull(document61);
        org.junit.Assert.assertNotNull(elements63);
        org.junit.Assert.assertNull(element64);
        org.junit.Assert.assertNotNull(element66);
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(nodeList72);
        org.junit.Assert.assertNull(node75);
        org.junit.Assert.assertNull(element76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(element79);
        org.junit.Assert.assertNotNull(element81);
        org.junit.Assert.assertNotNull(elements84);
        org.junit.Assert.assertNotNull(element86);
        org.junit.Assert.assertTrue("'" + quirksMode87 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode87.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document88);
        org.junit.Assert.assertNotNull(elements90);
        org.junit.Assert.assertNotNull(elements92);
        org.junit.Assert.assertNotNull(elements93);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
        org.junit.Assert.assertNotNull(element96);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node6 = document5.previousSibling();
        org.jsoup.nodes.Element element7 = document5.nextElementSibling();
        java.lang.String str8 = document5.title();
        org.jsoup.nodes.Element element10 = document5.toggleClass("hi!");
        org.jsoup.nodes.Document document11 = document5.normalise();
        document5.title("");
        java.util.Set<java.lang.String> strSet14 = document5.classNames();
        org.jsoup.nodes.Element element15 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.select.Elements elements17 = document5.getElementsByAttribute("head");
        org.jsoup.nodes.Element element19 = document5.getElementById("#document");
        org.jsoup.nodes.Element element21 = document5.prepend("hi!hi!");
        java.lang.String str23 = document5.attr("head");
        org.jsoup.select.Elements elements24 = document5.getAllElements();
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node27 = document26.previousSibling();
        org.jsoup.nodes.Element element28 = document26.nextElementSibling();
        java.lang.String str29 = document26.title();
        org.jsoup.nodes.Element element31 = document26.toggleClass("hi!");
        org.jsoup.nodes.Element element33 = document26.toggleClass("");
        java.lang.String str35 = document26.absUrl("hi!");
        java.lang.String str36 = document26.html();
        org.jsoup.nodes.Element element38 = document26.prependText("hi!");
        java.util.Set<java.lang.String> strSet39 = document26.classNames();
        org.jsoup.nodes.Element element40 = document26.body();
        java.lang.String str41 = document26.nodeName();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList42 = document26.dataNodes();
        org.jsoup.nodes.Element element43 = document5.prependChild((org.jsoup.nodes.Node) document26);
        org.jsoup.nodes.Element element45 = document26.prependElement("<head>\n <title></title>\n</head>");
        org.jsoup.select.Elements elements48 = document26.getElementsByAttributeValueMatching("<html><head><title></title></head><body></body></html>", "<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        java.lang.Integer int49 = document26.elementSiblingIndex();
        org.jsoup.nodes.Element element51 = document26.val(" head");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertNull(element40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "#document" + "'", str41, "#document");
        org.junit.Assert.assertNotNull(dataNodeList42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(element51);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node6 = document5.previousSibling();
        org.jsoup.nodes.Element element7 = document5.nextElementSibling();
        java.lang.String str8 = document5.title();
        org.jsoup.nodes.Element element10 = document5.toggleClass("hi!");
        org.jsoup.nodes.Document document11 = document5.normalise();
        document5.title("");
        java.util.Set<java.lang.String> strSet14 = document5.classNames();
        org.jsoup.nodes.Element element15 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.select.Elements elements17 = document5.getElementsByAttribute("head");
        org.jsoup.nodes.Element element19 = document5.getElementById("#document");
        org.jsoup.nodes.Element element21 = document5.prepend("hi!hi!");
        java.lang.String str23 = document5.attr("head");
        org.jsoup.select.Elements elements24 = document5.getAllElements();
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node27 = document26.previousSibling();
        org.jsoup.nodes.Element element28 = document26.nextElementSibling();
        java.lang.String str29 = document26.title();
        org.jsoup.nodes.Element element31 = document26.toggleClass("hi!");
        org.jsoup.nodes.Element element33 = document26.toggleClass("");
        java.lang.String str35 = document26.absUrl("hi!");
        java.lang.String str36 = document26.html();
        org.jsoup.nodes.Element element38 = document26.prependText("hi!");
        java.util.Set<java.lang.String> strSet39 = document26.classNames();
        org.jsoup.nodes.Element element40 = document26.body();
        java.lang.String str41 = document26.nodeName();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList42 = document26.dataNodes();
        org.jsoup.nodes.Element element43 = document5.prependChild((org.jsoup.nodes.Node) document26);
        org.jsoup.nodes.Element element45 = document26.prependElement("<head>\n <title></title>\n</head>");
        java.util.Map<java.lang.String, java.lang.String> strMap46 = document26.dataset();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertNull(element40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "#document" + "'", str41, "#document");
        org.junit.Assert.assertNotNull(dataNodeList42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(strMap46);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.select.Elements elements7 = element6.parents();
        org.jsoup.select.Elements elements9 = element6.getElementsByIndexGreaterThan((int) (short) 0);
        org.jsoup.nodes.Element element10 = element6.empty();
        org.jsoup.select.Elements elements12 = element6.getElementsContainingText("<#root>");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document1.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.prettyPrint(false);
        int int12 = outputSettings11.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings13.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings11.escapeMode(escapeMode14);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings15.indentAmount((int) (short) 0);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings17.indentAmount(0);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings19.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings19.charset("<head>\n <title></title>\n</head>\n<body>\n</body>hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: <head>? <title></title>?</head>?<body>?</body>hi!hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(outputSettings20);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document4 = document1.ownerDocument();
        org.jsoup.select.Elements elements6 = document1.getElementsByAttribute("#document");
        java.lang.String str7 = document1.title();
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.select.Elements elements10 = document8.getElementsMatchingOwnText("hi!");
        java.lang.String str11 = document8.nodeName();
        org.jsoup.select.Elements elements14 = document8.getElementsByAttributeValueMatching("<#root class=\"hi!\">\n hi!\n</#root>", "<title></title>");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node17 = document16.previousSibling();
        org.jsoup.nodes.Element element18 = document16.nextElementSibling();
        java.lang.String str19 = document16.title();
        org.jsoup.nodes.Element element21 = document16.toggleClass("hi!");
        org.jsoup.nodes.Element element23 = document16.toggleClass("");
        java.lang.String str25 = document16.absUrl("hi!");
        java.lang.String str26 = document16.html();
        org.jsoup.nodes.Element element28 = document16.prependText("hi!");
        org.jsoup.select.Elements elements29 = element28.getAllElements();
        org.jsoup.select.Elements elements32 = element28.getElementsByAttributeValueNot("hi!", "head");
        org.jsoup.nodes.Element element33 = document8.prependChild((org.jsoup.nodes.Node) element28);
        org.jsoup.select.Elements elements34 = element33.siblingElements();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(elements34);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document1.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.prettyPrint(false);
        int int12 = outputSettings11.indentAmount();
        int int13 = outputSettings11.indentAmount();
        int int14 = outputSettings11.indentAmount();
        java.nio.charset.Charset charset15 = outputSettings11.charset();
        boolean boolean16 = outputSettings11.prettyPrint();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(charset15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Element element9 = document7.text("#root");
        org.jsoup.nodes.Node node10 = document7.previousSibling();
        org.jsoup.nodes.Element element13 = document7.attr(" hi!", "<#root></#root>\n<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements15 = document7.getElementsByIndexLessThan(0);
        org.jsoup.nodes.Element element16 = document7.nextElementSibling();
        org.jsoup.select.Elements elements19 = document7.getElementsByAttributeValueStarting("<#root class=\" hi! head\"> <html> <head> <title></title> </head> <body></body> </html> </#root> <#document></#document>", "#document hi!");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<title></title>");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node4 = document3.previousSibling();
        org.jsoup.nodes.Element element5 = document3.nextElementSibling();
        java.lang.String str6 = document3.title();
        org.jsoup.nodes.Element element8 = document3.toggleClass("hi!");
        org.jsoup.nodes.Element element10 = document3.toggleClass("");
        java.lang.String str12 = document3.absUrl("hi!");
        java.lang.String str13 = document3.html();
        org.jsoup.nodes.Element element15 = document3.prependText("hi!");
        boolean boolean17 = document3.hasAttr("#root");
        boolean boolean19 = document3.hasClass(" hi!");
        java.util.regex.Pattern pattern21 = null;
        org.jsoup.select.Elements elements22 = document3.getElementsByAttributeValueMatching("", pattern21);
        org.jsoup.select.Elements elements23 = document3.getAllElements();
        org.jsoup.nodes.Document document24 = document3.ownerDocument();
        org.jsoup.nodes.Element element25 = document1.appendChild((org.jsoup.nodes.Node) document24);
        org.jsoup.select.Elements elements26 = element25.children();
        org.jsoup.nodes.Element element28 = element25.appendText("");
        org.jsoup.nodes.Element element30 = element28.removeClass("<#root></#root>\n<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
    }
}

