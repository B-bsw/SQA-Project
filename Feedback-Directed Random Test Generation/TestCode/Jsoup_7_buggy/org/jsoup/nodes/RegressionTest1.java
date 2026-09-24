package org.jsoup.nodes;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueNot("hi!  #document", "hi!");
        org.jsoup.select.Elements elements10 = document1.getElementsByTag("hi!");
        org.jsoup.nodes.Element element12 = document1.append("#root");
        org.jsoup.nodes.Element element14 = element12.val(" #document");
        boolean boolean16 = element12.hasAttr("<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings12.indentAmount((int) (byte) -1);
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
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        java.lang.String str8 = element7.html();
        java.lang.String str9 = element7.toString();
        java.util.regex.Pattern pattern10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element7.getElementsMatchingText(pattern10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.appendText("hi!");
        java.lang.String str6 = element5.html();
        org.jsoup.nodes.Element element9 = element5.attr("<html>\n <head></head>\n <body></body>\n</html>", "hi!");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("hi!  #document");
        java.lang.String str12 = document11.title();
        org.jsoup.nodes.Element element13 = element5.appendChild((org.jsoup.nodes.Node) document11);
        org.jsoup.nodes.Element element14 = document11.firstElementSibling();
        org.jsoup.nodes.Element element15 = document11.body();
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
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        boolean boolean9 = element7.hasAttr("hi!  #document");
        java.lang.String str10 = element7.tagName();
        org.jsoup.select.Elements elements12 = element7.getElementsMatchingOwnText("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements15 = element7.getElementsByAttributeValueStarting("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Node node5 = document1.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = document1.prependElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.select.Elements elements5 = document1.children();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        org.jsoup.nodes.Element element7 = document1.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = element7.getElementsContainingOwnText("<#root></#root>");
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
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
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
        org.jsoup.select.Elements elements23 = element12.getElementsByIndexEquals((int) '4');
        org.jsoup.nodes.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element25 = element12.appendChild(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
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
        org.jsoup.nodes.Document document28 = document1.normalise();
        java.lang.String str30 = document28.absUrl("#document");
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
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.head();
        org.jsoup.nodes.Node node5 = document1.nextSibling();
        org.jsoup.nodes.Document document6 = document1.normalise();
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueMatching("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.appendText("hi!");
        java.util.regex.Pattern pattern7 = null;
        org.jsoup.select.Elements elements8 = element3.getElementsByAttributeValueMatching("#document", pattern7);
        boolean boolean9 = element3.isBlock();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element3.lastElementSibling();
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
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        org.jsoup.select.Elements elements8 = element3.getElementsContainingText("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element12 = document10.html("");
        org.jsoup.nodes.Element element14 = element12.html("#document");
        org.jsoup.nodes.Element element16 = element14.appendElement("hi!");
        org.jsoup.nodes.Element element18 = element16.addClass("");
        // The following exception was thrown during execution in test generation
        try {
            element3.replaceWith((org.jsoup.nodes.Node) element18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        java.nio.charset.Charset charset9 = outputSettings8.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings8.indentAmount((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings8.indentAmount((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be true");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(charset9);
        org.junit.Assert.assertNotNull(outputSettings11);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.appendText("hi!");
        java.lang.String str6 = element5.html();
        org.jsoup.nodes.Element element9 = element5.attr("<html>\n <head></head>\n <body></body>\n</html>", "hi!");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("hi!  #document");
        java.lang.String str12 = document11.title();
        org.jsoup.nodes.Element element13 = element5.appendChild((org.jsoup.nodes.Node) document11);
        java.util.regex.Pattern pattern14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements15 = element13.getElementsMatchingOwnText(pattern14);
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
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element9 = element3.empty();
        org.jsoup.nodes.Element element10 = element3.parent();
        java.util.regex.Pattern pattern12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = element10.getElementsByAttributeValueMatching("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>", pattern12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(element10);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.html("#document");
        org.jsoup.select.Elements elements7 = element5.getElementsByAttributeStarting("#document");
        org.jsoup.nodes.Element element9 = element5.prependText("#document");
        org.jsoup.nodes.Element element11 = element9.html("");
        java.lang.String str12 = element11.className();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
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
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.indentAmount((int) (short) 10);
        int int17 = outputSettings14.indentAmount();
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
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document1.addClass("#document");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.select.Elements elements9 = element7.getElementsContainingText("hi!  #document");
        org.jsoup.nodes.Element element11 = element7.wrap("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = element11.getElementsByClass(" hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNull(element11);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
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
        org.jsoup.nodes.Element element23 = element22.nextElementSibling();
        java.util.regex.Pattern pattern24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements25 = element23.getElementsMatchingText(pattern24);
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
        org.junit.Assert.assertNull(element23);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
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
        org.jsoup.nodes.Element element15 = element5.prependText("#document");
        java.util.Set<java.lang.String> strSet16 = element15.classNames();
        org.jsoup.select.Elements elements17 = element15.children();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        boolean boolean9 = element3.hasClass("#document");
        org.jsoup.nodes.Element element12 = element3.attr("#document", "#root");
        java.lang.String str13 = element12.toString();
        org.jsoup.nodes.Element element15 = element12.html("<html>\n <head></head>\n <body></body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element17 = element15.child((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
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
        int int15 = outputSettings13.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = outputSettings13.escapeMode();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
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
        org.jsoup.nodes.Element element18 = document1.removeClass("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element20 = document1.before("<#root></#root>");
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
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
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
        org.jsoup.select.Elements elements24 = element21.getElementsContainingText("<#root></#root>");
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
        org.junit.Assert.assertNotNull(elements24);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.removeClass("");
        org.jsoup.nodes.Element element5 = element3.toggleClass("hi!");
        org.jsoup.select.Elements elements7 = element3.getElementsByTag("#document");
        boolean boolean9 = element3.hasClass("\n<head></head>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.new OutputSettings();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings3.charset("hi! #document");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi! #document");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
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
        org.jsoup.select.Elements elements20 = document1.getElementsByAttribute("#root <html> <head></head> <body></body> </html>");
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
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.select.Elements elements9 = element5.getElementsByAttributeValue("hi!  #document", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element11 = element5.appendText("#root");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings8.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings8.indentAmount(10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings8.charset("<#root></#root>");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: <#root></#root>");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings11);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.title();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = document1.childNode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element27 = element22.child((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
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
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element25 = element10.child((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!  #document");
        java.lang.String str2 = document1.val();
        java.lang.String str3 = document1.title();
        java.lang.String str4 = document1.nodeName();
        java.lang.String str5 = document1.outerHtml();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
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
        org.jsoup.select.Elements elements16 = element15.getAllElements();
        org.jsoup.nodes.Node node17 = element15.nextSibling();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
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
        org.jsoup.nodes.Element element18 = document1.removeClass("");
        boolean boolean19 = element18.isBlock();
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
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.appendText("hi!");
        java.util.regex.Pattern pattern7 = null;
        org.jsoup.select.Elements elements8 = element3.getElementsByAttributeValueMatching("#document", pattern7);
        boolean boolean9 = element3.isBlock();
        org.jsoup.select.Elements elements12 = element3.getElementsByAttributeValueMatching("hi! #document", " hi!");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Node node6 = document1.removeAttr("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element8 = document1.addClass("");
        org.jsoup.nodes.Element element10 = document1.val("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element14 = document12.html("");
        boolean boolean16 = element14.hasClass("#document");
        org.jsoup.select.Elements elements17 = element14.parents();
        org.jsoup.select.Elements elements20 = element14.getElementsByAttributeValueMatching("#document", "hi!");
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element24 = document22.html("");
        java.lang.String str25 = element24.className();
        org.jsoup.nodes.Element element26 = element14.prependChild((org.jsoup.nodes.Node) element24);
        org.jsoup.nodes.Element element28 = element24.prependText("#document");
        org.jsoup.nodes.Document document30 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element32 = document30.html("");
        org.jsoup.nodes.Element element34 = element32.appendText("hi!");
        java.lang.String str35 = element34.html();
        java.lang.String str36 = element34.text();
        org.jsoup.nodes.Element element37 = element24.appendChild((org.jsoup.nodes.Node) element34);
        org.jsoup.nodes.Element element39 = element37.toggleClass("hi!");
        org.jsoup.nodes.Document document41 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        org.jsoup.nodes.Element element48 = document41.classNames((java.util.Set<java.lang.String>) strSet46);
        org.jsoup.nodes.Element element49 = element39.classNames((java.util.Set<java.lang.String>) strSet46);
        org.jsoup.nodes.Element element50 = element10.classNames((java.util.Set<java.lang.String>) strSet46);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(element50);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        boolean boolean7 = element5.hasClass("");
        java.lang.String str8 = element5.html();
        java.lang.String str9 = element5.text();
        boolean boolean11 = element5.hasAttr("");
        java.util.regex.Pattern pattern13 = null;
        org.jsoup.select.Elements elements14 = element5.getElementsByAttributeValueMatching(" #document", pattern13);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.html("#document");
        org.jsoup.select.Elements elements7 = element5.getElementsByAttributeStarting("#document");
        org.jsoup.nodes.Element element9 = element5.prependText("#document");
        org.jsoup.nodes.Element element11 = element9.getElementById("#root");
        org.jsoup.select.Elements elements13 = element9.getElementsByTag("#document");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = element9.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        boolean boolean9 = element7.hasAttr("hi!  #document");
        java.util.Set<java.lang.String> strSet10 = element7.classNames();
        org.jsoup.nodes.Element element12 = element7.val("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements13 = element7.getAllElements();
        java.util.regex.Pattern pattern15 = null;
        org.jsoup.select.Elements elements16 = element7.getElementsByAttributeValueMatching("<#root></#root>hi!", pattern15);
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element5 = document1.createElement("<#root></#root>");
        org.jsoup.select.Elements elements6 = element5.parents();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        boolean boolean5 = element3.hasClass("#document");
        org.jsoup.select.Elements elements6 = element3.parents();
        java.lang.String str7 = element3.toString();
        org.jsoup.nodes.Element element9 = element3.prepend("#root");
        org.jsoup.nodes.Element element11 = element3.val("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = element3.child((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Element element5 = document1.append("hi!  #document");
        org.jsoup.nodes.Element element7 = document1.appendElement("hi!");
        org.jsoup.nodes.Element element9 = document1.append("hi!#root");
        boolean boolean11 = document1.hasClass("#root");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
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
        org.jsoup.select.Elements elements22 = element5.getElementsMatchingText("hi!");
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
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.Integer int4 = element3.siblingIndex();
        java.lang.Integer int5 = element3.siblingIndex();
        org.jsoup.nodes.Element element7 = element3.getElementById("hi! #document");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.wrap("hi!");
        org.jsoup.nodes.Element element4 = document1.body();
        boolean boolean6 = document1.hasClass("hi!");
        java.lang.String str7 = document1.data();
        java.lang.String str8 = document1.id();
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
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
        java.util.regex.Pattern pattern36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements37 = element35.getElementsMatchingText(pattern36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        boolean boolean9 = element7.hasAttr("hi!  #document");
        org.jsoup.nodes.Node node10 = element7.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.siblingNodes();
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
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
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
        org.jsoup.select.Elements elements20 = element10.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body></body>\n</html>", "#root");
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
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.nodes.Document document5 = document1.ownerDocument();
        java.util.regex.Pattern pattern7 = null;
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueMatching("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>", pattern7);
        boolean boolean10 = document1.hasClass("<#root hi!  #document=\"#document\"></#root>");
        boolean boolean11 = document1.hasText();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.select.Elements elements7 = document1.getElementsByIndexGreaterThan(10);
        java.lang.String str8 = document1.className();
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueNot("hi!", "#root");
        org.jsoup.select.Elements elements12 = document1.getAllElements();
        org.jsoup.nodes.Node node14 = document1.removeAttr("<#root></#root>hi!");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        org.jsoup.select.Elements elements4 = document1.getElementsByTag("#document");
        org.jsoup.nodes.Element element6 = document1.html("hi!");
        org.jsoup.nodes.Element element8 = element6.prependText("#document");
        java.lang.String str9 = element8.data();
        // The following exception was thrown during execution in test generation
        try {
            element8.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element7 = document1.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element9 = document6.text("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element11 = document6.prependText("#root");
        org.jsoup.nodes.Element element13 = document6.before("#document");
        org.jsoup.nodes.Element element15 = element13.prependText("hi!");
        java.util.regex.Pattern pattern16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements17 = element13.getElementsMatchingText(pattern16);
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
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.html("hi!");
        java.lang.String str10 = element9.html();
        org.jsoup.select.Elements elements12 = element9.getElementsByIndexGreaterThan((int) (byte) -1);
        org.jsoup.nodes.Element element14 = element9.getElementById(" #document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements16 = element14.getElementsByAttributeStarting("<html>\n <head></head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#documenthi!");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        boolean boolean7 = element5.hasClass("");
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
        java.lang.String str22 = element13.className();
        org.jsoup.nodes.Element element24 = element13.addClass("<#root></#root>hi!");
        // The following exception was thrown during execution in test generation
        try {
            element5.replaceWith((org.jsoup.nodes.Node) element24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.head();
        java.lang.String str5 = element4.baseUri();
        java.lang.String str6 = element4.toString();
        java.lang.String str7 = element4.baseUri();
        org.jsoup.select.Elements elements9 = element4.getElementsByIndexLessThan((int) (short) 100);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n<head></head>" + "'", str6, "\n<head></head>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
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
        org.jsoup.select.Elements elements57 = element55.getElementsByIndexEquals(10);
        org.jsoup.select.Elements elements59 = element55.getElementsMatchingOwnText("#document");
        java.util.regex.Pattern pattern61 = null;
        org.jsoup.select.Elements elements62 = element55.getElementsByAttributeValueMatching("hi! #document", pattern61);
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
        org.junit.Assert.assertNotNull(elements57);
        org.junit.Assert.assertNotNull(elements59);
        org.junit.Assert.assertNotNull(elements62);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
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
        java.lang.Class<?> wildcardClass14 = element5.getClass();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueStarting("#root", "hi!  #document");
        java.lang.String str5 = document1.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = document1.createElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.select.Elements elements6 = element3.getElementsByIndexLessThan((int) (short) 10);
        java.lang.String str7 = element3.data();
        org.jsoup.nodes.Element element9 = element3.append("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str12 = document11.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = document11.new OutputSettings();
        java.lang.String str14 = document11.id();
        java.lang.String str15 = document11.outerHtml();
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("#document");
        java.util.Set<java.lang.String> strSet18 = document17.classNames();
        org.jsoup.nodes.Element element19 = document11.classNames(strSet18);
        org.jsoup.nodes.Element element20 = element3.classNames(strSet18);
        org.jsoup.nodes.Element element21 = element3.parent();
        org.jsoup.nodes.Element element23 = element3.toggleClass("#documenthi!");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str15, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNull(element21);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str2 = document1.val();
        java.lang.String[] strArray13 = new java.lang.String[] { "<#root></#root>", "<#root></#root>", "<#root hi!  #document=\"#document\"></#root>", "#document", "<#root hi!  #document=\"#document\"></#root>", "<#root hi!  #document=\"#document\"></#root>", "#document", "#root", "hi!  #document", "<html>\n <head></head>\n <body></body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = document1.classNames((java.util.Set<java.lang.String>) strSet14);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = element16.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "<#root></#root>", "<#root></#root>", "<#root hi!  #document=\"#document\"></#root>", "#document", "<#root hi!  #document=\"#document\"></#root>", "<#root hi!  #document=\"#document\"></#root>", "#document", "#root", "hi!  #document", "<html>\n <head></head>\n <body></body>\n</html>" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
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
        org.jsoup.nodes.Attributes attributes32 = element13.attributes();
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
        org.junit.Assert.assertNotNull(attributes32);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.new OutputSettings();
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueEnding("#root", "#root");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
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
        java.lang.String str23 = element15.toString();
        java.lang.String str24 = element15.ownText();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
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
        java.lang.String str18 = document1.attr("\n<head></head>");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.new OutputSettings();
        java.lang.String str4 = document1.id();
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.nodes.Element element7 = document1.removeClass("#root");
        java.lang.String str8 = document1.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            document1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.html("hi!");
        org.jsoup.nodes.Element element11 = element9.addClass("hi!  #document");
        boolean boolean13 = element9.hasClass("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            element9.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.html("hi!");
        java.lang.Integer int10 = element3.siblingIndex();
        org.jsoup.select.Elements elements13 = element3.getElementsByAttributeValue("<#root></#root>hi!", "hi!#root");
        org.jsoup.nodes.Element element16 = element3.attr("hi!", "#root <html> <head></head> <body></body> </html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = element16.child((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = document1.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        org.jsoup.nodes.Element element4 = document1.createElement("#root");
        org.jsoup.select.Elements elements6 = element4.getElementsByTag(" #document");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.html("hi!");
        org.jsoup.select.Elements elements11 = element3.getElementsContainingOwnText("#document");
        org.jsoup.nodes.Element element13 = element3.removeClass("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element14 = element13.parent();
        java.util.regex.Pattern pattern16 = null;
        org.jsoup.select.Elements elements17 = element13.getElementsByAttributeValueMatching("<#root></#root>", pattern16);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.select.Elements elements5 = document1.children();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        org.jsoup.nodes.Element element7 = document1.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = element7.getElementsByAttributeStarting("<#root></#root>");
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
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.outputSettings();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = document1.before("\n<head></head>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(outputSettings3);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.siblingIndex();
        java.lang.String str6 = document1.attr("<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.select.Elements elements6 = element3.getElementsByIndexLessThan((int) (short) 10);
        java.lang.String str7 = element3.data();
        java.lang.Integer int8 = element3.elementSiblingIndex();
        org.jsoup.nodes.Element element9 = element3.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element9.getElementsByAttributeStarting("hi!  #document");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        boolean boolean3 = document1.isBlock();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str6 = document1.attr("hi!");
        java.lang.Integer int7 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element9 = document1.wrap("hi!");
        org.jsoup.nodes.Document document10 = document1.normalise();
        org.jsoup.nodes.Element element11 = document10.head();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements14 = document10.getElementsByAttributeValue("", "hi! #document");
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
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
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
        org.jsoup.nodes.Element element24 = element22.prependElement("hi! #document");
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
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Element element6 = element4.before("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element7 = element6.firstElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element7.getElementsByAttributeValueContaining("", "<#root></#root>hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        boolean boolean3 = document1.isBlock();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str6 = document1.attr("hi!");
        java.lang.Integer int7 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element9 = document1.wrap("hi!");
        org.jsoup.nodes.Document document10 = document1.normalise();
        java.lang.String str11 = document10.id();
        document10.title("<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.html("hi!");
        boolean boolean11 = element9.hasAttr("hi!");
        java.util.Set<java.lang.String> strSet12 = element9.classNames();
        java.util.regex.Pattern pattern14 = null;
        org.jsoup.select.Elements elements15 = element9.getElementsByAttributeValueMatching("hi!", pattern14);
        java.lang.String str16 = element9.text();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str2 = document1.ownText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = document1.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
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
        org.jsoup.select.Elements elements19 = element15.getElementsByAttributeStarting("<html>\n <head></head>\n <body></body>\n</html>");
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
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node59 = element46.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.outputSettings();
        boolean boolean4 = outputSettings3.prettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder5 = outputSettings3.encoder();
        java.nio.charset.CharsetEncoder charsetEncoder6 = outputSettings3.encoder();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(charsetEncoder5);
        org.junit.Assert.assertNotNull(charsetEncoder6);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
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
        org.jsoup.select.Elements elements57 = element55.getElementsByIndexEquals(10);
        org.jsoup.select.Elements elements59 = element55.getElementsMatchingOwnText("#document");
        org.jsoup.select.Elements elements61 = element55.getElementsByIndexLessThan((int) (short) 1);
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
        org.junit.Assert.assertNotNull(elements57);
        org.junit.Assert.assertNotNull(elements59);
        org.junit.Assert.assertNotNull(elements61);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements8 = element3.getElementsByAttributeValueEnding("<html>\n <head></head>\n <body></body>\n</html>", "hi!  #document");
        org.jsoup.select.Elements elements10 = element3.getElementsContainingText("#root");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.html("#document");
        org.jsoup.select.Elements elements6 = element3.children();
        java.util.Set<java.lang.String> strSet7 = element3.classNames();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueStarting("#root", "hi!  #document");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.toString();
        java.lang.String str7 = document1.className();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        boolean boolean9 = element7.hasAttr("hi!  #document");
        org.jsoup.nodes.Element element10 = element7.parent();
        java.lang.String str11 = element7.text();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element7 = document1.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.select.Elements elements9 = document1.getElementsByClass("#document");
        java.lang.String str10 = document1.data();
        // The following exception was thrown during execution in test generation
        try {
            document1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependText("hi!");
        org.jsoup.nodes.Element element12 = element10.prependText("#document");
        java.lang.String str13 = element12.tagName();
        org.jsoup.nodes.Element element15 = element12.append("hi!");
        java.lang.String str16 = element15.id();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements19 = element15.getElementsByAttributeValueStarting("", "hi! #document");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#root" + "'", str13, "#root");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.nodes.Attributes attributes6 = element5.attributes();
        org.jsoup.select.Elements elements9 = element5.getElementsByAttributeValueContaining("#document", "#root");
        org.jsoup.select.Elements elements12 = element5.getElementsByAttributeValueEnding("#document", "#document");
        org.jsoup.select.Elements elements14 = element5.getElementsByIndexLessThan((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            element5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element5.child((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        java.lang.Integer int5 = document1.siblingIndex();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings6.prettyPrint(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.indentAmount((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be true");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(outputSettings8);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
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
        java.util.List<org.jsoup.nodes.Node> nodeList31 = element26.childNodes();
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
        org.junit.Assert.assertNotNull(nodeList31);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
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
        org.jsoup.nodes.Element element21 = element17.lastElementSibling();
        org.jsoup.nodes.Document document23 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element25 = document23.html("");
        java.lang.String str26 = element25.className();
        org.jsoup.nodes.Element element27 = element25.empty();
        org.jsoup.select.Elements elements29 = element25.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element31 = element25.html("hi!");
        org.jsoup.nodes.Element element33 = element31.addClass("hi!  #document");
        // The following exception was thrown during execution in test generation
        try {
            element21.replaceWith((org.jsoup.nodes.Node) element31);
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
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNull(element21);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueStarting("#document", "hi!  #document");
        boolean boolean13 = document1.hasClass("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element15 = document1.appendText("#root");
        java.lang.String str16 = document1.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = document1.before("#root <html> <head></head> <body></body> </html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = document1.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
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
        org.jsoup.nodes.Node node33 = node32.nextSibling();
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
        org.junit.Assert.assertNull(node33);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.html("hi!");
        org.jsoup.select.Elements elements11 = element3.getElementsContainingOwnText("#document");
        org.jsoup.nodes.Element element13 = element3.prependText("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttribute("hi!  #document");
        org.jsoup.nodes.Element element12 = document1.val("");
        org.jsoup.nodes.Element element13 = element12.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = element13.toString();
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
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(element13);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Element element6 = element4.before("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element7 = element6.firstElementSibling();
        org.jsoup.select.Elements elements10 = element7.getElementsByAttributeValueEnding("hi!", "#root");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.append("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements5 = document1.getElementsByAttributeStarting("<#root></#root>hi!");
        org.jsoup.nodes.Element element7 = document1.removeClass("hi! #document");
        java.lang.String str8 = document1.nodeName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document" + "'", str8, "#document");
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
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
        org.jsoup.select.Elements elements46 = element41.getElementsMatchingText(" hi!");
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
        org.junit.Assert.assertNotNull(elements46);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element6 = element3.toggleClass("#document");
        java.lang.String str7 = element6.data();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = element6.before("<html>\n <head></head>\n <body>\n </body>\n</html><<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        boolean boolean9 = element7.hasAttr("hi!  #document");
        java.util.Set<java.lang.String> strSet10 = element7.classNames();
        org.jsoup.nodes.Element element12 = element7.val("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str13 = element7.data();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.indentAmount(10);
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings8.prettyPrint(true);
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element15 = document14.head();
        java.lang.String str16 = document14.outerHtml();
        java.lang.Integer int17 = document14.elementSiblingIndex();
        java.lang.String str18 = document14.nodeName();
        org.jsoup.nodes.Element element20 = document14.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = document14.outputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = outputSettings21.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings21.indentAmount(10);
        java.nio.charset.Charset charset25 = outputSettings24.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings12.charset(charset25);
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#document" + "'", str18, "#document");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(charset25);
        org.junit.Assert.assertNotNull(outputSettings26);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        java.lang.Integer int5 = document1.siblingIndex();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.outputSettings();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings6.charset("<#root></#root>");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: <#root></#root>");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(outputSettings6);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
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
        java.lang.Integer int25 = element24.elementSiblingIndex();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Element element6 = element4.before("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element8 = element4.appendElement("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements10 = element8.getElementsByAttribute("#documenthi!");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.val("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str4 = document1.nodeName();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements68 = element66.select("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;?<html>? <head></head>? <body></body>?</html>': unexpected token at '&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;?<html>? <head></head>? <body></body>?</html>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.siblingIndex();
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.nodes.Element element6 = document1.head();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = element6.attr("#root", "<#root></#root>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element9 = element3.empty();
        java.lang.String str11 = element3.absUrl("#document");
        java.lang.Integer int12 = element3.siblingIndex();
        org.jsoup.select.Elements elements14 = element3.getElementsByIndexEquals((int) (short) 100);
        element3.setBaseUri("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
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
        java.util.regex.Pattern pattern17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements18 = element5.getElementsMatchingText(pattern17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document1.addClass("#document");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document1.childNodes();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.new OutputSettings();
        boolean boolean9 = outputSettings8.prettyPrint();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element6 = element3.toggleClass("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = element6.childNode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
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
        java.util.regex.Pattern pattern40 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements41 = element37.getElementsMatchingOwnText(pattern40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
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
        java.lang.String str16 = document1.data();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!  #document");
        org.jsoup.nodes.Element element2 = document1.head();
        org.jsoup.nodes.Document document3 = element2.ownerDocument();
        java.lang.String str4 = document3.val();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.ownText();
        org.jsoup.nodes.Node node3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element4 = document1.appendChild(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        java.lang.String str3 = document1.val();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
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
        org.jsoup.select.Elements elements23 = element18.getElementsByAttributeValue("hi!  #document", "hi!  #document");
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
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.new OutputSettings();
        java.lang.String str4 = document1.id();
        java.lang.String str5 = document1.outerHtml();
        document1.title("#root <html> <head></head> <body></body> </html>");
        java.lang.String str8 = document1.text();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#root <html> <head></head> <body></body> </html>" + "'", str8, "#root <html> <head></head> <body></body> </html>");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.select.Elements elements5 = document3.getElementsMatchingText("#document");
        java.lang.String str6 = document3.outerHtml();
        java.lang.String str7 = document3.nodeName();
        boolean boolean9 = document3.hasClass("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.removeClass("#document");
        java.util.regex.Pattern pattern6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = element3.getElementsMatchingOwnText(pattern6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.new OutputSettings();
        java.lang.String str4 = document1.id();
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.nodes.Element element7 = document1.removeClass("#root");
        java.lang.String str8 = document1.title();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = document1.getElementById("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
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
        org.jsoup.nodes.Element element15 = element5.prependText("#document");
        boolean boolean17 = element5.hasClass("hi!  #document");
        java.lang.String str18 = element5.className();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("#document", "hi!");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element9 = document1.head();
        java.lang.String str11 = document1.absUrl("hi!");
        org.jsoup.select.Elements elements12 = document1.getAllElements();
        org.jsoup.select.Elements elements14 = document1.getElementsByIndexGreaterThan((int) ' ');
        boolean boolean16 = document1.hasClass("<#root></#root>hi!");
        java.lang.String str17 = document1.nodeName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#document" + "'", str17, "#document");
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.appendText("hi!");
        java.lang.String str6 = element5.html();
        org.jsoup.nodes.Element element9 = element5.attr("<html>\n <head></head>\n <body></body>\n</html>", "hi!");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("hi!  #document");
        java.lang.String str12 = document11.title();
        org.jsoup.nodes.Element element13 = element5.appendChild((org.jsoup.nodes.Node) document11);
        org.jsoup.nodes.Element element14 = document11.firstElementSibling();
        java.lang.String str15 = document11.nodeName();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#document" + "'", str15, "#document");
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueStarting("#document", "hi!  #document");
        boolean boolean13 = document1.hasClass("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.Set<java.lang.String> strSet14 = document1.classNames();
        org.jsoup.nodes.Document document15 = document1.normalise();
        org.jsoup.nodes.Element element17 = document1.addClass("hi!");
        org.jsoup.nodes.Attributes attributes18 = element17.attributes();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element7 = document1.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element9 = document6.text("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element11 = document6.prependText("#root");
        org.jsoup.nodes.Element element13 = document6.before("#document");
        org.jsoup.nodes.Element element15 = element13.prependText("hi!");
        org.jsoup.nodes.Element element16 = element15.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = element16.previousSibling();
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
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNull(element16);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
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
        org.jsoup.select.Elements elements16 = element5.getElementsByAttributeValueNot("hi!", " hi!");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document1.append("#document");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = document1.childNodes();
        org.jsoup.select.Elements elements8 = document1.getElementsByIndexLessThan((int) ' ');
        java.util.regex.Pattern pattern9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = document1.getElementsMatchingText(pattern9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.html("hi!");
        org.jsoup.select.Elements elements10 = element9.getAllElements();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        java.nio.charset.Charset charset9 = outputSettings8.charset();
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element12 = document11.head();
        java.lang.String str13 = document11.outerHtml();
        java.lang.Integer int14 = document11.elementSiblingIndex();
        java.lang.String str15 = document11.nodeName();
        org.jsoup.nodes.Element element17 = document11.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = document11.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings18.indentAmount(10);
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = outputSettings20.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings8.escapeMode(escapeMode21);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings8.charset("<html>\n <head></head>\n <body>\n </body>\n</html><<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: <html>? <head></head>? <body>? </body>?</html><<html>? <head></head>? <body></body>?</html>></<html>? <head></head>? <body></body>?</html>>");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(charset9);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#document" + "'", str15, "#document");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + escapeMode21 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode21.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings22);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
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
        org.jsoup.select.Elements elements17 = element15.getElementsByIndexGreaterThan(10);
        java.lang.Integer int18 = element15.elementSiblingIndex();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
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
        org.jsoup.select.Elements elements20 = element13.getElementsByIndexEquals((int) (short) -1);
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
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element7 = document1.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element9 = document6.text("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element11 = document6.prependText("#root");
        org.jsoup.nodes.Element element12 = document6.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = element12.prependElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!  #document", "#document");
        org.jsoup.select.Elements elements6 = document1.getElementsContainingText("hi!  #document");
        java.lang.String str7 = document1.className();
        java.util.Set<java.lang.String> strSet8 = document1.classNames();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document1.outputSettings();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.charset("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: &lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;?<html>? <head></head>? <body></body>?</html>");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(outputSettings9);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Node node5 = document1.nextSibling();
        java.lang.String str6 = document1.html();
        org.jsoup.nodes.Document document7 = document1.ownerDocument();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(document7);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
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
        org.jsoup.select.Elements elements15 = document11.getElementsMatchingText("<#root></#root>hi!");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
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
        org.jsoup.nodes.Element element15 = element5.prependText("#document");
        boolean boolean17 = element5.hasClass("hi!  #document");
        org.jsoup.nodes.Element element19 = element5.addClass("hi!  #document");
        org.jsoup.nodes.Element element21 = element19.html("");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
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
        org.jsoup.select.Elements elements17 = element5.getElementsByIndexEquals((int) (short) 0);
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
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueNot("hi!  #document", "hi!");
        boolean boolean10 = document1.hasClass("");
        org.jsoup.nodes.Element element11 = document1.head();
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element15 = document13.html("");
        org.jsoup.nodes.Element element17 = element15.appendText("hi!");
        java.lang.String str18 = element15.data();
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element22 = document20.html("");
        java.lang.String str23 = element22.className();
        org.jsoup.nodes.Element element24 = element22.empty();
        java.lang.String str25 = element24.className();
        org.jsoup.nodes.Node node26 = element24.nextSibling();
        java.lang.String str27 = element24.className();
        org.jsoup.parser.Tag tag28 = element24.tag();
        org.jsoup.nodes.Document document30 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element31 = document30.head();
        org.jsoup.nodes.Element element32 = element24.prependChild((org.jsoup.nodes.Node) document30);
        boolean boolean33 = element15.equals((java.lang.Object) element24);
        java.lang.String str34 = element24.ownText();
        org.jsoup.select.Elements elements36 = element24.getElementsByIndexEquals(1);
        org.jsoup.nodes.Element element38 = element24.removeClass("");
        boolean boolean40 = element24.hasAttr("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element41 = element11.appendChild((org.jsoup.nodes.Node) element24);
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
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNull(element31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!  #document");
        java.lang.String str2 = document1.title();
        java.lang.Integer int3 = document1.siblingIndex();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!  #document");
        org.jsoup.nodes.Element element2 = document1.head();
        org.jsoup.select.Elements elements4 = element2.getElementsMatchingOwnText("");
        org.jsoup.select.Elements elements5 = element2.children();
        org.jsoup.select.Elements elements8 = element2.getElementsByAttributeValueNot("hi!  #document", " #document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element2.appendElement("");
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
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("#document", "hi!");
        org.jsoup.nodes.Element element8 = document1.val("#root");
        org.jsoup.nodes.Element element10 = document1.prependText("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        java.lang.String str11 = element10.html();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements14 = element10.getElementsByAttributeValueNot("", "hi!  #document");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>" + "'", str11, "&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Node node5 = document1.nextSibling();
        java.lang.String str6 = document1.html();
        java.lang.String str7 = document1.outerHtml();
        boolean boolean8 = document1.isBlock();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        org.jsoup.nodes.Element element2 = document1.empty();
        java.lang.String str3 = document1.nodeName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
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
        boolean boolean32 = element28.isBlock();
        org.jsoup.nodes.Element element34 = element28.prependText("hi!  #document");
        java.lang.String str35 = element34.data();
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        org.jsoup.select.Elements elements4 = document1.getElementsByTag("#document");
        org.jsoup.nodes.Element element6 = document1.html("hi!");
        org.jsoup.nodes.Element element8 = element6.prependText("#document");
        java.lang.String str9 = element8.data();
        org.jsoup.nodes.Element element11 = element8.getElementById("#documenthi!");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(element11);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
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
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings3.prettyPrint(true);
        java.nio.charset.Charset charset18 = outputSettings17.charset();
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
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(charset18);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueStarting("#document", "hi!  #document");
        java.lang.String str12 = document1.title();
        org.jsoup.nodes.Element element14 = document1.prependElement("#root");
        boolean boolean16 = element14.hasAttr("hi!  #document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        java.nio.charset.Charset charset9 = outputSettings8.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings8.indentAmount((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.charset("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(charset9);
        org.junit.Assert.assertNotNull(outputSettings11);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
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
        org.jsoup.select.Elements elements17 = element15.getElementsByIndexGreaterThan(10);
        org.jsoup.select.Elements elements20 = element15.getElementsByAttributeValueEnding("<hi!  #document></hi!  #document>", "#root");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.html("hi!");
        java.lang.Integer int11 = element8.elementSiblingIndex();
        java.lang.String str12 = element8.tagName();
        boolean boolean14 = element8.hasClass("#document");
        java.lang.String str15 = element8.data();
        org.jsoup.nodes.Element element17 = element8.append("");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#root" + "'", str12, "#root");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.select.Elements elements6 = element3.getElementsByIndexLessThan((int) (short) 10);
        java.lang.String str7 = element3.data();
        org.jsoup.nodes.Element element9 = element3.append("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str12 = document11.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = document11.new OutputSettings();
        java.lang.String str14 = document11.id();
        java.lang.String str15 = document11.outerHtml();
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("#document");
        java.util.Set<java.lang.String> strSet18 = document17.classNames();
        org.jsoup.nodes.Element element19 = document11.classNames(strSet18);
        org.jsoup.nodes.Element element20 = element3.classNames(strSet18);
        org.jsoup.select.Elements elements22 = element3.getElementsByAttribute("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str15, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        java.lang.String str3 = document1.outerHtml();
        document1.title("#document");
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("#document");
        java.util.Set<java.lang.String> strSet8 = document7.classNames();
        org.jsoup.nodes.Element element9 = document1.classNames(strSet8);
        org.jsoup.nodes.Element element11 = document1.appendText("\n<head></head>");
        org.jsoup.nodes.Element element13 = document1.createElement("\n<head></head>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = document1.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str3, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
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
        org.jsoup.select.Elements elements22 = element5.getElementsByAttributeValueStarting("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>", "\n<head></head>");
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
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
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
        org.jsoup.select.Elements elements31 = element7.getElementsMatchingOwnText("#root <html> <head></head> <body></body> </html>");
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
        org.junit.Assert.assertNotNull(elements31);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!  #document", "#document");
        org.jsoup.select.Elements elements6 = document1.getElementsContainingText("hi!  #document");
        java.lang.String str7 = document1.className();
        java.util.Set<java.lang.String> strSet8 = document1.classNames();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document1.outputSettings();
        org.jsoup.nodes.Element element11 = document1.removeClass(" #document");
        org.jsoup.nodes.Element element13 = document1.addClass("");
        org.jsoup.select.Elements elements15 = document1.getElementsByIndexEquals(0);
        java.lang.String str16 = document1.nodeName();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#document" + "'", str16, "#document");
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements3 = document1.select("hi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'hi!': unexpected token at '!'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.removeClass("");
        org.jsoup.nodes.Element element5 = element3.toggleClass("hi!");
        org.jsoup.nodes.Document document6 = element5.ownerDocument();
        java.lang.Class<?> wildcardClass7 = document6.getClass();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element6 = element3.toggleClass("#document");
        java.util.regex.Pattern pattern8 = null;
        org.jsoup.select.Elements elements9 = element6.getElementsByAttributeValueMatching("<hi!  #document></hi!  #document>", pattern8);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.html("hi!");
        boolean boolean11 = element9.hasAttr("hi!");
        org.jsoup.select.Elements elements14 = element9.getElementsByAttributeValueStarting("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element20 = element17.after("#document");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(document18);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueStarting("#document", "hi!  #document");
        org.jsoup.nodes.Document document12 = document1.normalise();
        // The following exception was thrown during execution in test generation
        try {
            document1.remove();
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
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.removeClass("");
        org.jsoup.nodes.Element element5 = element3.toggleClass("hi!");
        org.jsoup.select.Elements elements7 = element3.getElementsByTag("hi!  #document");
        org.jsoup.select.Elements elements8 = element3.getAllElements();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.outputSettings();
        boolean boolean4 = outputSettings3.prettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder5 = outputSettings3.encoder();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element8 = document7.head();
        java.lang.String str9 = document7.outerHtml();
        java.lang.Integer int10 = document7.elementSiblingIndex();
        java.lang.String str11 = document7.nodeName();
        org.jsoup.parser.Tag tag12 = document7.tag();
        org.jsoup.nodes.Element element14 = document7.createElement("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements16 = document7.getElementsByClass("#document");
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = document7.outputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = outputSettings17.escapeMode();
        java.nio.charset.Charset charset19 = outputSettings17.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings3.charset(charset19);
        boolean boolean21 = outputSettings20.prettyPrint();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(charsetEncoder5);
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset19);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.select.Elements elements6 = document1.getElementsMatchingText("");
        org.jsoup.nodes.Element element8 = document1.html("hi!  #document");
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element12 = document10.html("");
        org.jsoup.nodes.Element element14 = element12.html("#document");
        org.jsoup.nodes.Element element16 = element14.appendElement("hi!");
        org.jsoup.nodes.Element element17 = document1.appendChild((org.jsoup.nodes.Node) element14);
        org.jsoup.select.Elements elements19 = document1.getElementsByAttribute(" hi!");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        org.jsoup.select.Elements elements4 = document1.getElementsByTag("#document");
        org.jsoup.nodes.Element element6 = document1.html("hi!");
        org.jsoup.select.Elements elements9 = element6.getElementsByAttributeValueContaining("#document", "<#root hi!  #document=\"#document\"></#root>");
        org.jsoup.nodes.Element element11 = element6.addClass(" hi!");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
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
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.html("");
        org.jsoup.select.Elements elements20 = document16.getElementsContainingText("");
        org.jsoup.nodes.Element element22 = document16.prependText("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = document16.outputSettings();
        java.nio.charset.Charset charset24 = outputSettings23.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings13.charset(charset24);
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings25.escapeMode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings25.charset("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: &lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;?<html>? <head></head>? <body></body>?</html>");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(charset24);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
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
        org.jsoup.select.Elements elements18 = element17.getAllElements();
        java.lang.String str19 = element17.val();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
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
        java.util.regex.Pattern pattern17 = null;
        org.jsoup.select.Elements elements18 = element13.getElementsByAttributeValueMatching("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>", pattern17);
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
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.nodes.Element element9 = document1.empty();
        java.util.regex.Pattern pattern10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element9.getElementsMatchingOwnText(pattern10);
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
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Element element5 = document1.append("hi!  #document");
        org.jsoup.nodes.Element element7 = document1.appendElement("hi!");
        org.jsoup.nodes.Element element9 = document1.append("hi!#root");
        // The following exception was thrown during execution in test generation
        try {
            document1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.nodes.Attributes attributes6 = element5.attributes();
        org.jsoup.select.Elements elements9 = element5.getElementsByAttributeValueContaining("#document", "#root");
        java.lang.String str10 = element5.text();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element3 = document1.createElement("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements6 = element3.getElementsByAttributeValueMatching(" hi!", "<html>\n <head></head>\n <body>\n  #document\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Node node6 = document1.removeAttr("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element8 = document1.addClass("");
        org.jsoup.nodes.Element element10 = document1.val("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = document1.dataset();
        org.jsoup.nodes.Element element12 = document1.body();
        org.jsoup.nodes.Element element13 = element12.nextElementSibling();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(element13);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
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
        org.jsoup.select.Elements elements23 = document22.parents();
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
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
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
        org.jsoup.nodes.Element element21 = element17.lastElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = element21.text();
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
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNull(element21);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
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
        org.jsoup.nodes.Element element15 = element5.append("#documenthi!");
        // The following exception was thrown during execution in test generation
        try {
            element15.remove();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Node node6 = document1.removeAttr("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element8 = document1.addClass("");
        org.jsoup.nodes.Element element10 = document1.val("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements12 = element10.getElementsMatchingText("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str13 = element10.id();
        org.jsoup.nodes.Element element15 = element10.addClass("\n<head></head>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = element15.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = document1.outputSettings();
        java.lang.String str6 = document1.title();
        java.util.regex.Pattern pattern8 = null;
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueMatching("", pattern8);
        org.jsoup.nodes.Element element11 = document1.addClass("#document");
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
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
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
        org.jsoup.nodes.Element element31 = element13.toggleClass("#document");
        org.jsoup.nodes.Document document33 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node35 = document33.removeAttr("#document");
        org.jsoup.nodes.Element element36 = document33.body();
        org.jsoup.nodes.Element element39 = document33.attr("#root", "hi!  #document");
        org.jsoup.nodes.Element element40 = element13.prependChild((org.jsoup.nodes.Node) element39);
        org.jsoup.parser.Tag tag41 = element40.tag();
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
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(tag41);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
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
        org.jsoup.nodes.Node node26 = element24.removeAttr("hi!");
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
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
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
        java.util.Map<java.lang.String, java.lang.String> strMap27 = element3.dataset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element29 = element3.child((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
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
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strMap27);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
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
        org.jsoup.select.Elements elements21 = element19.getElementsMatchingOwnText("<#root></#root>hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = element19.childNodes();
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
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(nodeList22);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.html("#document");
        org.jsoup.select.Elements elements8 = element5.getElementsByAttributeValueEnding("hi!  #document", "#document");
        org.jsoup.select.Elements elements9 = element5.getAllElements();
        org.jsoup.select.Elements elements11 = element5.getElementsByClass("#root");
        boolean boolean12 = element5.hasText();
        org.jsoup.nodes.Element element14 = element5.wrap("body");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.charset("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: &lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;?<html>? <head></head>? <body></body>?</html>");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
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
        org.junit.Assert.assertNotNull(outputSettings14);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = element21.childNode((int) (short) 1);
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
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNull(element21);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        boolean boolean7 = element5.hasClass("");
        org.jsoup.nodes.Element element9 = element5.appendElement(" #document");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element7 = document1.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element9 = document6.text("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element11 = document6.prependText("#root");
        org.jsoup.nodes.Element element12 = document6.firstElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = element12.previousSibling();
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
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNull(element12);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependElement("hi!");
        org.jsoup.nodes.Element element11 = element3.parent();
        org.jsoup.select.Elements elements13 = element3.getElementsByClass("<hi!  #document></hi!  #document>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.removeClass("");
        org.jsoup.nodes.Element element5 = element3.toggleClass("hi!");
        org.jsoup.select.Elements elements7 = element3.getElementsByTag("#document");
        java.lang.String str8 = element3.val();
        org.jsoup.select.Elements elements10 = element3.getElementsContainingOwnText("hi!  #document");
        org.jsoup.nodes.Element element12 = element3.appendText("body");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.select.Elements elements7 = document1.getElementsByIndexGreaterThan(10);
        boolean boolean9 = document1.hasAttr("");
        org.jsoup.select.Elements elements10 = document1.children();
        org.jsoup.select.Elements elements12 = document1.getElementsByAttribute("body");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.html("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = element10.dataset();
        org.jsoup.nodes.Element element13 = element10.prepend("<#root hi!  #document=\"#document\"></#root>");
        org.jsoup.parser.Tag tag14 = element10.tag();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(tag14);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
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
        org.jsoup.nodes.Element element41 = element30.firstElementSibling();
        java.lang.Class<?> wildcardClass42 = element30.getClass();
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
        org.junit.Assert.assertNull(element41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.appendText("hi!");
        java.util.Set<java.lang.String> strSet6 = element5.classNames();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Element element4 = document1.appendElement("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = element4.select(" hi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'hi!': unexpected token at '!'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
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
        org.jsoup.select.Elements elements18 = document12.children();
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
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell(" hi!");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
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
        java.lang.String str20 = element17.val();
        org.jsoup.nodes.Element element21 = element17.parent();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(element21);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
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
        org.jsoup.nodes.Node node18 = element17.previousSibling();
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
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.append("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements5 = document1.getElementsByClass("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueEnding("<#root hi!  #document=\"#document\"></#root>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Element element8 = element5.removeClass("hi!");
        org.jsoup.nodes.Element element10 = element8.appendText("hi!");
        org.jsoup.select.Elements elements12 = element8.getElementsContainingOwnText("hi!  #document");
        org.jsoup.nodes.Node node14 = element8.removeAttr("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements16 = element8.getElementsByIndexGreaterThan((int) (byte) 1);
        java.lang.String str17 = element8.tagName();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#root" + "'", str17, "#root");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("<#root hi!  #document=\"#document\"></#root>");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttribute("<#root></#root>hi!");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
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
        element17.setBaseUri("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
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
            org.jsoup.select.Elements elements19 = element17.getElementsByAttributeStarting("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
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
        org.jsoup.select.Elements elements24 = element18.getElementsByAttribute("<#root hi!  #document=\"#document\"></#root>");
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
        org.junit.Assert.assertNotNull(elements24);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element3 = document1.createElement("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str4 = document1.data();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        org.jsoup.nodes.Element element9 = element5.removeClass("");
        org.jsoup.parser.Tag tag10 = element9.tag();
        boolean boolean12 = element9.hasAttr(" #document");
        java.lang.String str13 = element9.val();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
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
        org.jsoup.nodes.Element element23 = document1.attr("hi!", "");
        org.jsoup.select.Elements elements25 = element23.getElementsByIndexLessThan((int) (byte) 1);
        java.lang.Class<?> wildcardClass26 = elements25.getClass();
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
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
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
        org.jsoup.nodes.Element element31 = element28.val("<#root hi!  #document=\"#document\"></#root>");
        java.lang.String str32 = element28.html();
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
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<hi!  #document></hi!  #document>" + "'", str32, "<hi!  #document></hi!  #document>");
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document1.append("#document");
        java.lang.String str6 = document1.text();
        org.jsoup.nodes.Element element8 = document1.appendElement("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element8.child((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
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
        org.jsoup.parser.Tag tag19 = document1.tag();
        org.jsoup.select.Elements elements22 = document1.getElementsByAttributeValue("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>", "#documenthi!");
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
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Element element4 = document1.appendElement("#document");
        java.lang.String str5 = document1.tagName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
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
        org.jsoup.nodes.Element element39 = element38.parent();
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
        org.junit.Assert.assertNotNull(element39);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        java.util.Set<java.lang.String> strSet9 = document1.classNames();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
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
        java.util.regex.Pattern pattern18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements19 = document1.getElementsMatchingOwnText(pattern18);
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
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements24 = element22.select("<html>\n <head>\n  <title> hi!</title>\n </head>\n <body>\n  #document\n </body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<html>? <head>?  <title> hi!</title>? </head>? <body>?  #document? </body>?</html>': unexpected token at '<html>? <head>?  <title> hi!</title>? </head>? <body>?  #document? </body>?</html>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        boolean boolean5 = element3.hasClass("#document");
        org.jsoup.select.Elements elements6 = element3.parents();
        java.lang.String str7 = element3.toString();
        java.lang.String str8 = element3.ownText();
        org.jsoup.select.Elements elements9 = element3.parents();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = element3.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        java.lang.String str8 = element5.absUrl("#document");
        java.lang.String str9 = element5.ownText();
        org.jsoup.nodes.Document document10 = element5.ownerDocument();
        org.jsoup.select.Elements elements11 = element5.getAllElements();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element3 = document1.createElement("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements5 = element3.getElementsContainingOwnText(" #document");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        java.lang.String str8 = element5.className();
        org.jsoup.nodes.Element element10 = element5.html("#document");
        org.jsoup.select.Elements elements12 = element5.getElementsMatchingOwnText("");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.append("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements5 = element3.getElementsMatchingOwnText("<#root></#root>hi!");
        org.jsoup.nodes.Element element7 = element3.removeClass("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements9 = element7.getElementsByTag("hi!#root");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Node node6 = document1.removeAttr("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element8 = document1.addClass("");
        org.jsoup.select.Elements elements10 = document1.getElementsByAttribute("#root");
        java.lang.Class<?> wildcardClass11 = elements10.getClass();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!  #document");
        java.lang.String str2 = document1.val();
        java.lang.String str3 = document1.title();
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValue("<html>\n <head></head>\n <body></body>\n</html>", "#root");
        org.jsoup.select.Elements elements8 = document1.getElementsByClass("hi!#root");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList18 = element7.siblingNodes();
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
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element7 = document1.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element9 = document6.text("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element11 = document6.prependText("#root");
        org.jsoup.nodes.Element element13 = document6.before("#document");
        org.jsoup.nodes.Element element15 = element13.prependText("hi!");
        org.jsoup.nodes.Element element17 = element13.before("#root");
        java.util.regex.Pattern pattern18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements19 = element13.getElementsMatchingOwnText(pattern18);
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
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        java.lang.String str8 = element5.absUrl("#document");
        java.lang.String str9 = element5.ownText();
        org.jsoup.nodes.Document document10 = element5.ownerDocument();
        org.jsoup.nodes.Element element12 = document10.prependText("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.html("hi!");
        java.lang.Integer int10 = element3.siblingIndex();
        java.lang.String str11 = element3.id();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
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
        org.jsoup.nodes.Element element18 = element8.parent();
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
        org.junit.Assert.assertNull(element18);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
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
        org.jsoup.nodes.Element element31 = element28.val("<#root hi!  #document=\"#document\"></#root>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = element28.removeAttr("");
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
        org.junit.Assert.assertNotNull(element31);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        java.lang.String str8 = element3.className();
        org.jsoup.nodes.Element element11 = element3.attr("hi!  #document", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements13 = element3.getElementsContainingOwnText("#document");
        org.jsoup.nodes.Node node14 = element3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node14.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
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
        java.util.Set<java.lang.String> strSet29 = element27.classNames();
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
        org.junit.Assert.assertNotNull(strSet29);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell(" #document");
        org.jsoup.select.Elements elements3 = document1.getElementsContainingText("#root");
        org.jsoup.nodes.Element element4 = document1.empty();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements27 = document1.getElementsByAttributeValueStarting("<html>\n <head>\n  <title> hi!</title>\n </head>\n <body>\n  #document\n </body>\n</html>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueStarting("#document", "hi!  #document");
        // The following exception was thrown during execution in test generation
        try {
            document1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document1.addClass("#document");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.select.Elements elements9 = element7.getElementsContainingText("hi!  #document");
        org.jsoup.nodes.Element element11 = element7.wrap("hi!");
        org.jsoup.select.Elements elements14 = element7.getElementsByAttributeValueMatching("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>", "<#root hi!  #document=\"#document\"></#root>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("hi!", "#root");
        org.jsoup.select.Elements elements8 = document1.getElementsByIndexEquals((int) (byte) 100);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
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
        document1.setBaseUri("hi!  #document");
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
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.html("#document");
        org.jsoup.select.Elements elements7 = element5.getElementsByAttributeStarting("#document");
        org.jsoup.nodes.Element element9 = element5.prependText("#document");
        java.util.regex.Pattern pattern11 = null;
        org.jsoup.select.Elements elements12 = element5.getElementsByAttributeValueMatching("#document", pattern11);
        boolean boolean13 = element5.isBlock();
        org.jsoup.nodes.Element element15 = element5.prepend("hi!  #document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = element5.previousElementSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = document1.outputSettings();
        java.lang.String str6 = document1.title();
        org.jsoup.nodes.Attributes attributes7 = document1.attributes();
        java.lang.Class<?> wildcardClass8 = document1.getClass();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings6.indentAmount((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.charset("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: &lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;?<html>? <head></head>? <body></body>?</html>");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(outputSettings8);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Node node6 = document1.removeAttr("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element8 = document1.addClass("");
        org.jsoup.nodes.Element element10 = document1.val("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = document1.dataset();
        org.jsoup.nodes.Element element12 = document1.body();
        java.lang.String str13 = document1.outerHtml();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str13, "<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings6.indentAmount((int) (byte) 10);
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings6.escapeMode();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
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
            org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings22.charset("<hi!  #document></hi!  #document>");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: <hi!  #document></hi!  #document>");
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
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.select.Elements elements6 = element3.getElementsByIndexLessThan((int) (short) 10);
        java.lang.String str7 = element3.data();
        org.jsoup.nodes.Element element9 = element3.append("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str12 = document11.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = document11.new OutputSettings();
        java.lang.String str14 = document11.id();
        java.lang.String str15 = document11.outerHtml();
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("#document");
        java.util.Set<java.lang.String> strSet18 = document17.classNames();
        org.jsoup.nodes.Element element19 = document11.classNames(strSet18);
        org.jsoup.nodes.Element element20 = element3.classNames(strSet18);
        org.jsoup.select.Elements elements21 = element3.children();
        boolean boolean23 = element3.hasAttr("hi!");
        org.jsoup.nodes.Node node25 = element3.removeAttr("<#root></#root>hi!");
        java.lang.String str27 = element3.attr(" hi!");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str15, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.html("#document");
        org.jsoup.select.Elements elements7 = element5.getElementsByAttributeStarting("#document");
        org.jsoup.nodes.Element element9 = element5.prependText("#document");
        java.util.regex.Pattern pattern11 = null;
        org.jsoup.select.Elements elements12 = element5.getElementsByAttributeValueMatching("#document", pattern11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = element5.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.html("hi!");
        org.jsoup.select.Elements elements11 = element3.getElementsContainingOwnText("#document");
        org.jsoup.nodes.Element element13 = element3.removeClass("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        java.lang.String str14 = element13.ownText();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
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
            org.jsoup.select.Elements elements13 = element11.getElementsContainingText("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
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
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
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
        org.jsoup.nodes.Document document27 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element28 = document27.head();
        java.lang.String str29 = document27.outerHtml();
        java.lang.Integer int30 = document27.elementSiblingIndex();
        org.jsoup.nodes.Element element32 = document27.addClass("#document");
        org.jsoup.nodes.Node node34 = element32.removeAttr("hi!  #document");
        org.jsoup.select.Elements elements36 = element32.getElementsContainingText("hi!  #document");
        // The following exception was thrown during execution in test generation
        try {
            element25.replaceWith((org.jsoup.nodes.Node) element32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(elements36);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.html("#document");
        org.jsoup.select.Elements elements8 = element5.getElementsByAttributeValueEnding("hi!  #document", "#document");
        org.jsoup.select.Elements elements9 = element5.getAllElements();
        org.jsoup.select.Elements elements11 = element5.getElementsByClass("#root");
        org.jsoup.nodes.Element element13 = element5.val(" #document");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
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
        org.jsoup.nodes.Element element13 = element6.addClass("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements15 = element13.getElementsByIndexEquals(100);
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Element element6 = document1.createElement(" #document");
        org.jsoup.nodes.Element element8 = document1.addClass("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element10 = element8.toggleClass("hi! #document");
        org.jsoup.select.Elements elements12 = element10.getElementsContainingText("hi!  #document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element7 = document1.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element9 = document6.text("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element11 = document6.prependText("#root");
        org.jsoup.nodes.Element element13 = document6.before("#document");
        org.jsoup.nodes.Element element15 = element13.prependText("hi!");
        org.jsoup.nodes.Element element17 = element13.before("#root");
        java.lang.String str18 = element13.text();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!#root <html> <head></head> <body></body> </html>" + "'", str18, "hi!#root <html> <head></head> <body></body> </html>");
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        boolean boolean9 = element3.hasClass("#document");
        org.jsoup.nodes.Element element12 = element3.attr("#document", "#root");
        org.jsoup.select.Elements elements14 = element12.getElementsByIndexGreaterThan((int) (byte) 0);
        org.jsoup.select.Elements elements15 = element12.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element12.childNodes();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("#document", "hi!");
        org.jsoup.nodes.Element element8 = document1.val("#root");
        org.jsoup.nodes.Element element10 = document1.text("#root <html> <head></head> <body></body> </html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
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
        org.jsoup.select.Elements elements22 = element20.getElementsContainingOwnText("hi!  #document");
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
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
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
        java.util.regex.Pattern pattern17 = null;
        org.jsoup.select.Elements elements18 = document10.getElementsByAttributeValueMatching("body", pattern17);
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
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
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
        org.jsoup.nodes.Element element18 = element5.val("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.select.Elements elements5 = document1.children();
        org.jsoup.nodes.Element element7 = document1.wrap(" hi!");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependText("hi!");
        org.jsoup.nodes.Element element12 = element10.prependText("#document");
        java.lang.String str13 = element12.tagName();
        org.jsoup.nodes.Element element15 = element12.append("hi!");
        java.lang.String str16 = element15.id();
        boolean boolean18 = element15.hasAttr("<#root hi!  #document=\"#document\"></#root>");
        java.util.regex.Pattern pattern19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements20 = element15.getElementsMatchingOwnText(pattern19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#root" + "'", str13, "#root");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
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
        org.jsoup.nodes.Element element14 = element11.val("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements15 = element11.parents();
        org.jsoup.select.Elements elements17 = element11.getElementsByClass("<#root></#root>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        boolean boolean7 = element5.hasClass("");
        java.lang.String str8 = element5.html();
        java.lang.String str9 = element5.text();
        org.jsoup.select.Elements elements12 = element5.getElementsByAttributeValueMatching("hi!", "hi!  #document");
        java.lang.String str14 = element5.attr("#root");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.html("");
        org.jsoup.nodes.Element element20 = element18.html("#document");
        org.jsoup.nodes.Element element22 = element20.appendElement("hi!");
        org.jsoup.nodes.Element element23 = element5.appendChild((org.jsoup.nodes.Node) element22);
        org.jsoup.nodes.Element element25 = element22.before("hi!");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
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
        java.util.regex.Pattern pattern25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements26 = element15.getElementsMatchingText(pattern25);
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
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element7 = document1.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element9 = document6.text("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str10 = document6.text();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<html> <head></head> <body></body> </html>" + "'", str10, "<html> <head></head> <body></body> </html>");
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
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
        org.jsoup.nodes.Element element21 = element15.firstElementSibling();
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
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Element element4 = document1.appendElement("#document");
        java.lang.String str5 = document1.title();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("body", " hi!");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!  #document");
        org.jsoup.nodes.Element element2 = document1.head();
        org.jsoup.nodes.Document document3 = element2.ownerDocument();
        org.jsoup.select.Elements elements6 = element2.getElementsByAttributeValue("\n<head></head>", "<#root hi!  #document=\"#document\"></#root>");
        org.jsoup.select.Elements elements8 = element2.getElementsByIndexGreaterThan(100);
        java.lang.String str9 = element2.id();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
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
        org.jsoup.select.Elements elements20 = element13.getElementsByAttributeValueNot(" hi!", "hi!");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element6 = element3.toggleClass("#document");
        java.lang.String str7 = element6.data();
        org.jsoup.parser.Tag tag8 = element6.tag();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements23 = document1.select("<#root></#root>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<#root></#root>': unexpected token at '<#root></#root>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
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
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        boolean boolean9 = element7.hasAttr("hi!  #document");
        org.jsoup.nodes.Node node10 = element7.nextSibling();
        org.jsoup.select.Elements elements12 = element7.getElementsByTag("hi!");
        java.lang.String str13 = element7.html();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
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
        org.jsoup.nodes.Element element20 = element7.appendText("hi!  #document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element21 = element20.nextElementSibling();
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
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        boolean boolean3 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Element element6 = element4.toggleClass("<html>\n <head></head>\n <body>\n  #document\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Element element7 = document1.attr("#root", "hi!  #document");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element10 = document9.head();
        java.lang.String str11 = document9.outerHtml();
        java.lang.Integer int12 = document9.elementSiblingIndex();
        java.lang.String str13 = document9.nodeName();
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        org.jsoup.nodes.Element element22 = document15.classNames((java.util.Set<java.lang.String>) strSet20);
        org.jsoup.nodes.Element element23 = document9.classNames((java.util.Set<java.lang.String>) strSet20);
        org.jsoup.nodes.Element element24 = document1.classNames((java.util.Set<java.lang.String>) strSet20);
        java.lang.Class<?> wildcardClass25 = strSet20.getClass();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#document" + "'", str13, "#document");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("\n<head></head>");
        org.jsoup.select.Elements elements3 = document1.getElementsContainingText("hi!  #document");
        org.junit.Assert.assertNotNull(elements3);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!  #document", "#document");
        org.jsoup.select.Elements elements6 = document1.getElementsContainingText("hi!  #document");
        java.lang.String str7 = document1.className();
        java.util.Set<java.lang.String> strSet8 = document1.classNames();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document1.outputSettings();
        org.jsoup.nodes.Element element11 = document1.removeClass(" #document");
        org.jsoup.nodes.Element element12 = element11.parent();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNull(element12);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
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
        org.jsoup.nodes.Element element43 = element26.prependText("hi!#root");
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
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
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
        java.util.List<org.jsoup.nodes.Node> nodeList33 = element26.childNodes();
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
        org.junit.Assert.assertNotNull(nodeList33);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        boolean boolean5 = element3.hasClass("#document");
        org.jsoup.select.Elements elements6 = element3.parents();
        org.jsoup.select.Elements elements9 = element3.getElementsByAttributeValueMatching("#document", "hi!");
        org.jsoup.select.Elements elements12 = element3.getElementsByAttributeValueStarting("hi!", "hi!  #document");
        org.jsoup.select.Elements elements15 = element3.getElementsByAttributeValueMatching(" #document", "#document");
        boolean boolean16 = element3.hasText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = element3.after("<hi!  #document></hi!  #document>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
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
        org.jsoup.nodes.Element element31 = element13.toggleClass("#document");
        org.jsoup.nodes.Document document33 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node35 = document33.removeAttr("#document");
        org.jsoup.nodes.Element element36 = document33.body();
        org.jsoup.nodes.Element element39 = document33.attr("#root", "hi!  #document");
        org.jsoup.nodes.Element element40 = element13.prependChild((org.jsoup.nodes.Node) element39);
        org.jsoup.select.Elements elements43 = element40.getElementsByAttributeValueMatching("hi! #document", "<#root></#root>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element45 = element40.child((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
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
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(elements43);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
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
        org.jsoup.select.Elements elements31 = document14.getElementsByAttributeValue("<#root></#root>hi!", "hi!");
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
        org.junit.Assert.assertNotNull(elements31);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        boolean boolean7 = element5.hasClass("");
        java.lang.String str8 = element5.html();
        java.lang.String str9 = element5.text();
        org.jsoup.select.Elements elements12 = element5.getElementsByAttributeValueMatching("hi!", "hi!  #document");
        org.jsoup.select.Elements elements14 = element5.getElementsContainingOwnText("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements17 = element5.getElementsByAttributeValueNot("#document", "#document");
        org.jsoup.select.Elements elements20 = element5.getElementsByAttributeValueStarting("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>", "#document");
        java.lang.String str21 = element5.className();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
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
        org.jsoup.select.Elements elements57 = element55.getElementsByIndexEquals(10);
        boolean boolean58 = element55.isBlock();
        java.util.regex.Pattern pattern59 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements60 = element55.getElementsMatchingText(pattern59);
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
        org.junit.Assert.assertNotNull(elements57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        boolean boolean7 = element5.hasClass("");
        java.lang.String str8 = element5.html();
        java.lang.String str9 = element5.text();
        org.jsoup.select.Elements elements12 = element5.getElementsByAttributeValueMatching("hi!", "hi!  #document");
        java.lang.String str13 = element5.data();
        org.jsoup.nodes.Element element15 = element5.prepend("#documenthi!");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document1.addClass("#document");
        boolean boolean8 = element6.hasClass("hi!");
        org.jsoup.nodes.Element element10 = element6.val("hi!");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = document1.childNode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.parser.Tag tag6 = document1.tag();
        org.jsoup.nodes.Element element8 = document1.createElement("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document1.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = document1.outputSettings();
        boolean boolean11 = outputSettings10.prettyPrint();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = element16.before("<html>\n <head></head>\n <body>\n </body>\n</html><<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>");
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
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        int int9 = outputSettings8.indentAmount();
        int int10 = outputSettings8.indentAmount();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Document document3 = document1.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = document1.after("<html>\n <head></head>\n <body>\n  #document\n </body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(document3);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = element19.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = document1.toString();
        org.jsoup.nodes.Element element6 = document1.appendElement("<html>\n <head></head>\n <body></body>\n</html>");
        element6.remove();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = element6.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str2 = document1.val();
        java.lang.String[] strArray13 = new java.lang.String[] { "<#root></#root>", "<#root></#root>", "<#root hi!  #document=\"#document\"></#root>", "#document", "<#root hi!  #document=\"#document\"></#root>", "<#root hi!  #document=\"#document\"></#root>", "#document", "#root", "hi!  #document", "<html>\n <head></head>\n <body></body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = document1.classNames((java.util.Set<java.lang.String>) strSet14);
        org.jsoup.nodes.Element element18 = document1.prependElement("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        java.lang.String str19 = element18.id();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "<#root></#root>", "<#root></#root>", "<#root hi!  #document=\"#document\"></#root>", "#document", "<#root hi!  #document=\"#document\"></#root>", "<#root hi!  #document=\"#document\"></#root>", "#document", "#root", "hi!  #document", "<html>\n <head></head>\n <body></body>\n</html>" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.outputSettings();
        document1.title("hi!  #document");
        java.lang.String str6 = document1.title();
        org.jsoup.nodes.Element element8 = document1.toggleClass("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Attributes attributes9 = element8.attributes();
        org.jsoup.select.Elements elements11 = element8.getElementsMatchingOwnText("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.parser.Tag tag12 = element8.tag();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!  #document" + "'", str6, "hi!  #document");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
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
        java.lang.String str17 = element16.html();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<#root></#root>" + "'", str17, "<#root></#root>");
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.appendText("hi!");
        java.lang.String str6 = element5.html();
        java.lang.String str7 = element5.text();
        java.lang.String str9 = element5.attr("#root");
        java.lang.Integer int10 = element5.elementSiblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = element5.child(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node59 = document48.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByIndexEquals((int) (short) 100);
        org.jsoup.nodes.Document document4 = document1.ownerDocument();
        java.lang.String str5 = document4.outerHtml();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = document1.outputSettings();
        java.lang.String str6 = document1.className();
        java.util.regex.Pattern pattern7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = document1.getElementsMatchingText(pattern7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("hi!");
        java.lang.String str4 = document1.nodeName();
        org.jsoup.select.Elements elements6 = document1.getElementsByClass("#documenthi!");
        org.jsoup.select.Elements elements8 = document1.getElementsByIndexGreaterThan(1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.select.Elements elements7 = document1.getElementsByIndexGreaterThan(10);
        java.lang.String str8 = document1.className();
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueNot("hi!", "#root");
        org.jsoup.select.Elements elements12 = document1.getAllElements();
        org.jsoup.nodes.Element element13 = document1.head();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNull(element13);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
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
        org.jsoup.nodes.Element element15 = element5.prependText("#document");
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element19 = document17.html("");
        java.lang.String str20 = element19.className();
        org.jsoup.nodes.Element element21 = element19.empty();
        java.lang.String str22 = element21.className();
        org.jsoup.nodes.Node node23 = element21.nextSibling();
        org.jsoup.nodes.Element element26 = element21.attr("hi!  #document", "<html>\n <head></head>\n <body></body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            element5.replaceWith((org.jsoup.nodes.Node) element21);
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
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(element26);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("#document", "hi!");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element9 = document1.head();
        java.lang.String str11 = document1.absUrl("hi!");
        org.jsoup.select.Elements elements12 = document1.getAllElements();
        org.jsoup.select.Elements elements14 = document1.getElementsByIndexGreaterThan((int) ' ');
        org.jsoup.select.Elements elements16 = document1.getElementsByAttributeStarting("#document");
        java.lang.String str17 = document1.title();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Node node6 = document1.removeAttr("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element8 = document1.addClass("");
        org.jsoup.nodes.Element element10 = document1.val("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements12 = element10.getElementsMatchingText("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str13 = element10.id();
        org.jsoup.nodes.Element element14 = element10.parent();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document1.addClass("#document");
        java.util.Set<java.lang.String> strSet7 = element6.classNames();
        java.lang.Integer int8 = element6.elementSiblingIndex();
        org.jsoup.nodes.Node node9 = element6.nextSibling();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
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
        java.util.List<org.jsoup.nodes.Node> nodeList18 = document1.childNodes();
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
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document1.append("#document");
        java.lang.String str6 = document1.text();
        org.jsoup.nodes.Element element8 = document1.appendElement("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements9 = element8.getAllElements();
        boolean boolean10 = element8.isBlock();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        org.jsoup.nodes.Element element2 = document1.empty();
        boolean boolean3 = document1.isBlock();
        org.jsoup.nodes.Node node4 = document1.nextSibling();
        org.jsoup.select.Elements elements6 = document1.getElementsByIndexEquals((int) (short) -1);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("#document", "hi!");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document1.new OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = outputSettings9.escapeMode();
        java.nio.charset.CharsetEncoder charsetEncoder11 = outputSettings9.encoder();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder11);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.Integer int3 = document1.elementSiblingIndex();
        boolean boolean5 = document1.hasClass("");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.html("hi!");
        org.jsoup.nodes.Element element11 = element3.appendText("#root");
        org.jsoup.select.Elements elements14 = element3.getElementsByAttributeValueEnding("hi!  #document", "<html> <head></head> <body></body> </html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
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
        org.jsoup.select.Elements elements21 = element20.getAllElements();
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
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
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
        org.jsoup.nodes.Element element41 = element30.firstElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements42 = element41.siblingElements();
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
        org.junit.Assert.assertNull(element41);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
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
        element13.remove();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
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
        java.lang.String str14 = element5.baseUri();
        java.util.regex.Pattern pattern15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements16 = element5.getElementsMatchingOwnText(pattern15);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
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
        org.jsoup.select.Elements elements19 = element13.getElementsByIndexGreaterThan(1);
        org.jsoup.select.Elements elements21 = element13.getElementsByIndexEquals((int) (byte) 0);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        java.lang.String str8 = element5.className();
        org.jsoup.nodes.Element element10 = element5.html("#document");
        java.lang.Integer int11 = element5.elementSiblingIndex();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element9 = element3.empty();
        java.lang.String str11 = element3.absUrl("#document");
        java.lang.Integer int12 = element3.siblingIndex();
        org.jsoup.nodes.Element element14 = element3.wrap("hi! #document");
        java.util.regex.Pattern pattern15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements16 = element3.getElementsMatchingOwnText(pattern15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
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
        org.jsoup.nodes.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element24 = element22.appendChild(node23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = node28.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(node28);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.head();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = document1.new OutputSettings();
        org.jsoup.nodes.Element element7 = document1.toggleClass("hi!#root");
        org.jsoup.select.Elements elements9 = element7.getElementsContainingText("#documenthi!");
        java.lang.String str10 = element7.className();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " hi!#root" + "'", str10, " hi!#root");
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.nodes.Attributes attributes6 = element5.attributes();
        org.jsoup.select.Elements elements9 = element5.getElementsByAttributeValueContaining("#document", "#root");
        org.jsoup.select.Elements elements12 = element5.getElementsByAttributeValueEnding("#document", "#document");
        org.jsoup.select.Elements elements14 = element5.getElementsByIndexLessThan((int) (byte) 100);
        java.lang.String str15 = element5.baseUri();
        org.jsoup.nodes.Element element17 = element5.wrap("#document");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(element17);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
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
        java.util.List<org.jsoup.nodes.Node> nodeList17 = element5.childNodes();
        java.lang.Class<?> wildcardClass18 = nodeList17.getClass();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
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
        boolean boolean13 = outputSettings11.prettyPrint();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.html("hi!");
        org.jsoup.nodes.Element element11 = element3.appendText("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = element11.before("<html>\n <head></head>\n <body>\n  #document\n </body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependElement("hi!");
        org.jsoup.nodes.Element element12 = element10.appendElement("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements14 = element12.getElementsByClass(" #document");
        org.jsoup.nodes.Attributes attributes15 = element12.attributes();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(attributes15);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
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
        org.jsoup.select.Elements elements26 = document1.getElementsByTag("#document");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = document1.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(elements26);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependElement("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element10.siblingNodes();
        org.jsoup.nodes.Element element12 = element10.empty();
        org.jsoup.select.Elements elements14 = element10.getElementsByClass("#document");
        org.jsoup.nodes.Element element15 = element10.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element17 = element15.appendText(" hi!");
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
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(element15);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element7 = document5.html("");
        java.lang.String str8 = element7.className();
        org.jsoup.nodes.Element element9 = element7.empty();
        org.jsoup.select.Elements elements11 = element7.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element13 = element7.html("hi!");
        boolean boolean14 = document1.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("hi!  #document");
        org.jsoup.nodes.Element element17 = document1.appendChild((org.jsoup.nodes.Node) document16);
        org.jsoup.nodes.Element element18 = document16.parent();
        org.jsoup.select.Elements elements21 = document16.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String str22 = document16.val();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueStarting("#document", "hi!  #document");
        boolean boolean13 = document1.hasClass("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element15 = document1.appendText("#root");
        org.jsoup.nodes.Element element16 = document1.empty();
        java.lang.Integer int17 = document1.elementSiblingIndex();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements20 = element17.getElementsByAttributeValueNot(" hi!#root", "");
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
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.select.Elements elements6 = document1.getElementsMatchingText("");
        java.util.regex.Pattern pattern8 = null;
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueMatching(" hi!#root", pattern8);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.html("hi!");
        org.jsoup.select.Elements elements11 = element3.getElementsContainingOwnText("#document");
        java.lang.Integer int12 = element3.elementSiblingIndex();
        org.jsoup.select.Elements elements15 = element3.getElementsByAttributeValueMatching("#root <html> <head></head> <body></body> </html>", "<hi!  #document></hi!  #document>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
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
        java.nio.charset.CharsetEncoder charsetEncoder17 = outputSettings16.encoder();
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
        org.junit.Assert.assertNotNull(charsetEncoder17);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("#document", "hi!");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttribute("hi!");
        boolean boolean10 = document1.hasAttr("<#root></#root>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = document1.getElementsByAttributeValueNot("", " hi!#root");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.html("hi!");
        org.jsoup.select.Elements elements11 = element3.getElementsContainingOwnText("#document");
        boolean boolean12 = element3.hasText();
        org.jsoup.nodes.Element element13 = element3.empty();
        org.jsoup.select.Elements elements15 = element13.getElementsByAttributeStarting("#root");
        java.lang.String str16 = element13.data();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        boolean boolean5 = element3.hasClass("#document");
        org.jsoup.select.Elements elements6 = element3.parents();
        org.jsoup.select.Elements elements9 = element3.getElementsByAttributeValueMatching("#document", "hi!");
        org.jsoup.select.Elements elements12 = element3.getElementsByAttributeValueStarting("hi!", "hi!  #document");
        org.jsoup.select.Elements elements15 = element3.getElementsByAttributeValueMatching(" #document", "#document");
        boolean boolean16 = element3.hasText();
        org.jsoup.select.Elements elements19 = element3.getElementsByAttributeValueContaining("#root", "<#root></#root>hi!");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element22 = element17.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element9 = element3.empty();
        java.lang.String str11 = element3.absUrl("#document");
        java.lang.Integer int12 = element3.siblingIndex();
        org.jsoup.select.Elements elements14 = element3.getElementsByIndexEquals((int) (short) 100);
        org.jsoup.select.Elements elements15 = element3.getAllElements();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element17 = element3.before("#document");
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
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element7 = document1.prependChild((org.jsoup.nodes.Node) document6);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = document6.child((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = document1.outputSettings();
        java.lang.String str6 = document1.toString();
        org.jsoup.nodes.Element element8 = document1.createElement("#root");
        org.jsoup.nodes.Element element10 = document1.prependText(" #document");
        org.jsoup.select.Elements elements12 = element10.getElementsByIndexEquals(100);
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.html("#document");
        org.jsoup.select.Elements elements7 = element5.getElementsByAttributeStarting("#document");
        org.jsoup.nodes.Element element9 = element5.prependText("#document");
        java.util.regex.Pattern pattern11 = null;
        org.jsoup.select.Elements elements12 = element5.getElementsByAttributeValueMatching("#document", pattern11);
        boolean boolean13 = element5.isBlock();
        org.jsoup.nodes.Element element15 = element5.prepend(" #document");
        org.jsoup.select.Elements elements16 = element15.children();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = element15.after("#root");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueStarting("#document", "hi!  #document");
        boolean boolean13 = document1.hasClass("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.Set<java.lang.String> strSet14 = document1.classNames();
        org.jsoup.nodes.Document document15 = document1.normalise();
        org.jsoup.nodes.Element element17 = document1.addClass("hi!");
        org.jsoup.nodes.Document document18 = document1.ownerDocument();
        org.jsoup.select.Elements elements20 = document18.getElementsByIndexEquals((int) (byte) 1);
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element24 = document22.html("");
        org.jsoup.select.Elements elements26 = document22.getElementsContainingText("");
        org.jsoup.nodes.Element element28 = document22.prependText("hi!");
        document22.setBaseUri("");
        org.jsoup.nodes.Document document32 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element34 = document32.html("");
        java.lang.String str35 = element34.className();
        org.jsoup.nodes.Element element36 = element34.empty();
        java.lang.String str37 = element36.className();
        org.jsoup.nodes.Node node38 = element36.nextSibling();
        java.lang.String str39 = element36.className();
        org.jsoup.select.Elements elements40 = element36.getAllElements();
        org.jsoup.nodes.Element element41 = document22.prependChild((org.jsoup.nodes.Node) element36);
        org.jsoup.nodes.Document document43 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Element element44 = element41.appendChild((org.jsoup.nodes.Node) document43);
        org.jsoup.nodes.Node node45 = document43.nextSibling();
        java.lang.String str46 = document43.className();
        org.jsoup.nodes.Element element48 = document43.text("<#root hi!  #document=\"#document\"></#root>");
        java.util.Set<java.lang.String> strSet49 = document43.classNames();
        org.jsoup.nodes.Element element50 = document18.classNames(strSet49);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(strSet49);
        org.junit.Assert.assertNotNull(element50);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
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
        boolean boolean19 = element7.hasText();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        boolean boolean5 = element3.hasClass("#document");
        java.lang.String str6 = element3.html();
        org.jsoup.select.Elements elements8 = element3.getElementsMatchingText("");
        org.jsoup.nodes.Node node9 = element3.nextSibling();
        org.jsoup.select.Elements elements11 = element3.getElementsByIndexGreaterThan((int) (byte) 100);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
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
        java.lang.String str25 = element24.id();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.select.Elements elements6 = element3.getElementsByIndexLessThan((int) (short) 10);
        java.lang.String str7 = element3.data();
        org.jsoup.nodes.Document document8 = element3.ownerDocument();
        org.jsoup.select.Elements elements10 = document8.getElementsByClass("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements12 = document8.getElementsByIndexEquals((int) '#');
        java.util.regex.Pattern pattern13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements14 = document8.getElementsMatchingOwnText(pattern13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        java.lang.String str8 = element3.className();
        org.jsoup.nodes.Element element11 = element3.attr("hi!  #document", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements13 = element3.getElementsContainingOwnText("#document");
        org.jsoup.select.Elements elements14 = element3.parents();
        org.jsoup.nodes.Element element16 = element3.val("#root");
        boolean boolean18 = element16.hasClass("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements24 = document1.getElementsByAttributeValue("<html>\n <head></head>\n <body></body>\n</html>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        boolean boolean3 = document1.isBlock();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str6 = document1.attr("hi!");
        java.lang.Integer int7 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element9 = document1.wrap("hi!");
        org.jsoup.nodes.Document document10 = document1.normalise();
        org.jsoup.nodes.Element element11 = document10.head();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = document10.after("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.html("hi!");
        java.lang.String str11 = element8.baseUri();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Element element6 = document1.createElement(" #document");
        org.jsoup.nodes.Element element8 = document1.addClass("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element10 = document1.prependElement(" #document");
        boolean boolean11 = element10.isBlock();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("hi!");
        java.lang.String str4 = document1.val();
        boolean boolean6 = document1.hasAttr("hi!");
        org.jsoup.nodes.Element element8 = document1.wrap("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element8.getElementsByAttributeValue("<#root></#root>", "<hi!  #document></hi!  #document>");
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
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        boolean boolean9 = element7.hasAttr("hi!  #document");
        org.jsoup.nodes.Node node10 = element7.nextSibling();
        org.jsoup.nodes.Element element12 = element7.html("<hi!  #document></hi!  #document>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = element12.before("#documenthi!");
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
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
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
        org.jsoup.nodes.Node node30 = element7.nextSibling();
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
        org.junit.Assert.assertNull(node30);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = document1.outputSettings();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.select.Elements elements7 = document1.getElementsByIndexGreaterThan((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!  #document", "#document");
        org.jsoup.select.Elements elements6 = document1.getElementsContainingText("hi!  #document");
        boolean boolean8 = document1.hasAttr("#document");
        org.jsoup.nodes.Element element10 = document1.val("hi!#root <html> <head></head> <body></body> </html>");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.outputSettings();
        org.jsoup.select.Elements elements8 = document1.getElementsByIndexGreaterThan(0);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document1.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.indentAmount((int) (short) 0);
        int int12 = outputSettings11.indentAmount();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
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
        boolean boolean17 = document1.isBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = document1.outputSettings();
        boolean boolean19 = document1.hasText();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        java.lang.String str8 = element5.className();
        java.lang.String str9 = element5.className();
        element5.setBaseUri("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element12 = element5.parent();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(element12);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#document");
        org.jsoup.nodes.Element element2 = document1.body();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element4 = element2.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.outputSettings();
        org.jsoup.select.Elements elements8 = document1.getElementsByIndexGreaterThan(0);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document1.outputSettings();
        org.jsoup.select.Elements elements11 = document1.getElementsByIndexLessThan((-1));
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = document1.new OutputSettings();
        org.jsoup.nodes.Element element15 = document1.attr("#root <html> <head></head> <body></body> </html>", "hi!#root");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
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
        java.lang.Integer int21 = document1.siblingIndex();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!  #document");
        java.lang.String str2 = document1.title();
        org.jsoup.select.Elements elements4 = document1.getElementsContainingOwnText("<#root></#root>hi!");
        java.lang.String str5 = document1.tagName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element34 = element32.getElementById("");
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
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element32);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = element17.childNode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(document18);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
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
        org.jsoup.select.Elements elements20 = element17.getElementsByAttributeValueMatching("", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements22 = element17.getElementsMatchingText(" hi!");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
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
        org.jsoup.select.Elements elements16 = document10.getElementsByAttributeValueEnding("#root", " #document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = document10.child((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = element31.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        org.jsoup.nodes.Element element4 = document1.getElementById("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(element4);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
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
        java.lang.String str15 = document11.toString();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependElement("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = element10.dataset();
        org.jsoup.nodes.Element element13 = element10.after("hi!  #document");
        org.jsoup.select.Elements elements16 = element13.getElementsByAttributeValueMatching("#document", "hi!  #document");
        element13.setBaseUri("hi!");
        org.jsoup.nodes.Element element21 = element13.attr(" hi!", "<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
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
        org.jsoup.nodes.Element element18 = document1.head();
        org.jsoup.select.Elements elements20 = document1.getElementsContainingText("#root");
        java.util.regex.Pattern pattern22 = null;
        org.jsoup.select.Elements elements23 = document1.getElementsByAttributeValueMatching("hi!#root", pattern22);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element25 = document1.createElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
        org.junit.Assert.assertNull(element18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
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
        org.jsoup.nodes.Element element15 = element5.prependText("#document");
        java.util.Set<java.lang.String> strSet16 = element15.classNames();
        org.jsoup.nodes.Element element18 = element15.prepend("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element20 = element15.after("<html>\n <head></head>\n <body></body>\n</html>");
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
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements33 = element31.select("hi! #document");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'hi! #document': unexpected token at '! #document'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.html("hi!");
        boolean boolean11 = element9.hasAttr("hi!");
        java.util.Set<java.lang.String> strSet12 = element9.classNames();
        org.jsoup.nodes.Element element15 = element9.attr("hi!", "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Element element4 = document1.head();
        java.lang.String str5 = document1.nodeName();
        java.lang.String str6 = document1.id();
        java.lang.String str8 = document1.attr(" hi!");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
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
        java.lang.String str25 = element10.id();
        org.jsoup.nodes.Element element27 = element10.toggleClass("");
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
        org.junit.Assert.assertNotNull(element27);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element6 = element3.append("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements8 = element6.getElementsByIndexGreaterThan((int) (short) 100);
        java.lang.Class<?> wildcardClass9 = elements8.getClass();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        boolean boolean7 = element5.hasClass("");
        java.lang.String str8 = element5.html();
        java.lang.String str9 = element5.text();
        org.jsoup.select.Elements elements12 = element5.getElementsByAttributeValueMatching("hi!", "hi!  #document");
        org.jsoup.nodes.Element element15 = element5.attr("#root", "");
        org.jsoup.nodes.Element element17 = element15.toggleClass("");
        org.jsoup.select.Elements elements19 = element17.getElementsByClass("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.removeClass("#document");
        org.jsoup.select.Elements elements6 = element5.children();
        java.util.Set<java.lang.String> strSet7 = element5.classNames();
        org.jsoup.select.Elements elements8 = element5.getAllElements();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
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
        org.jsoup.nodes.Element element23 = element22.parent();
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
        org.junit.Assert.assertNull(element23);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
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
        java.lang.String str21 = element17.attr(" #document");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        java.lang.String str7 = element3.tagName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = element3.before("<#root>\n #root\n <html>\n  <head></head>\n  <body>\n   &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n  </body>\n </html>\n</#root>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#root" + "'", str7, "#root");
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
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
        org.jsoup.nodes.Element element19 = element10.previousElementSibling();
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
        org.junit.Assert.assertNull(element19);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        document1.title("#root");
        org.jsoup.nodes.Document document7 = document1.ownerDocument();
        java.lang.String str8 = document7.className();
        java.lang.String str9 = document7.outerHtml();
        org.jsoup.nodes.Element element10 = document7.head();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        java.lang.Integer int5 = document1.siblingIndex();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings6.prettyPrint(false);
        java.nio.charset.Charset charset9 = outputSettings6.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings6.charset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(charset9);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
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
        org.jsoup.select.Elements elements20 = element13.getElementsByIndexGreaterThan((int) (short) 1);
        java.lang.String str21 = element13.id();
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
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
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
        org.jsoup.nodes.Element element21 = element17.previousElementSibling();
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
        org.junit.Assert.assertNull(element21);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("hi!", "#root");
        org.jsoup.nodes.Node node8 = document1.childNode(0);
        java.lang.String str9 = document1.outerHtml();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
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
        java.lang.String str17 = element14.html();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Element element8 = element5.removeClass("hi!");
        org.jsoup.nodes.Element element10 = element8.appendText("hi!");
        org.jsoup.nodes.Element element12 = element8.prepend("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!  #document");
        org.jsoup.nodes.Element element2 = document1.head();
        org.jsoup.select.Elements elements4 = document1.getElementsContainingText("body");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements4);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.nodes.Attributes attributes6 = element5.attributes();
        org.jsoup.select.Elements elements9 = element5.getElementsByAttributeValueContaining("#document", "#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = element5.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueNot("hi!  #document", "hi!");
        org.jsoup.select.Elements elements10 = document1.getElementsByTag("hi!");
        org.jsoup.nodes.Element element12 = document1.append("#root");
        org.jsoup.nodes.Element element14 = document1.removeClass("hi!");
        org.jsoup.parser.Tag tag15 = document1.tag();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(tag15);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        document1.setBaseUri("");
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = document1.outputSettings();
        org.jsoup.nodes.Element element12 = document1.prependElement("#root");
        org.jsoup.select.Elements elements14 = document1.getElementsContainingOwnText("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str15 = document1.html();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = document1.new OutputSettings();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<#root></#root>hi!" + "'", str15, "<#root></#root>hi!");
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
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
        java.lang.String str22 = element12.ownText();
        org.jsoup.select.Elements elements24 = element12.getElementsByIndexEquals(1);
        org.jsoup.nodes.Element element26 = element12.removeClass("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements28 = element26.getElementsByClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element26);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.wrap("hi!");
        org.jsoup.nodes.Element element4 = document1.body();
        boolean boolean6 = document1.hasClass("hi!");
        java.lang.String str7 = document1.data();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueContaining("#root", "#root");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = document1.childNodes();
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
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
        java.lang.String str21 = element5.text();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element7 = document5.html("");
        java.lang.String str8 = element7.className();
        org.jsoup.nodes.Element element9 = element7.empty();
        org.jsoup.select.Elements elements11 = element7.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element13 = element7.html("hi!");
        boolean boolean14 = document1.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("hi!  #document");
        org.jsoup.nodes.Element element17 = document1.appendChild((org.jsoup.nodes.Node) document16);
        java.lang.String str19 = document1.absUrl("hi!  #document");
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = document1.outputSettings();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(outputSettings20);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
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
        org.jsoup.select.Elements elements15 = element14.parents();
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
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
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
        org.jsoup.nodes.Element element16 = element13.addClass("<html>\n <head>\n  <title> hi!</title>\n </head>\n <body>\n  #document\n </body>\n</html>");
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
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!  #document");
        org.jsoup.nodes.Element element2 = document1.head();
        org.jsoup.nodes.Document document3 = element2.ownerDocument();
        boolean boolean5 = document3.hasClass("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = document3.attr("", "#documenthi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("#document", "hi!");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document1.outputSettings();
        // The following exception was thrown during execution in test generation
        try {
            document1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(outputSettings9);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.html("#document");
        org.jsoup.select.Elements elements8 = element5.getElementsByAttributeValueEnding("hi!  #document", "#document");
        org.jsoup.select.Elements elements9 = element5.getAllElements();
        org.jsoup.select.Elements elements11 = element5.getElementsMatchingOwnText("#root <html> <head></head> <body></body> </html>");
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("hi!  #document");
        java.lang.String str14 = document13.val();
        java.lang.String str15 = document13.title();
        org.jsoup.select.Elements elements18 = document13.getElementsByAttributeValue("<html>\n <head></head>\n <body></body>\n</html>", "#root");
        org.jsoup.nodes.Element element19 = element5.prependChild((org.jsoup.nodes.Node) document13);
        java.lang.String str20 = element19.tagName();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#root" + "'", str20, "#root");
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.val("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element5 = element3.appendText("#document");
        java.lang.String str6 = element5.tagName();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        boolean boolean9 = element3.hasClass("#document");
        org.jsoup.nodes.Element element12 = element3.attr("#document", "#root");
        org.jsoup.select.Elements elements14 = element12.getElementsMatchingText("hi!  #document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = element12.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueNot("hi!  #document", "hi!");
        org.jsoup.nodes.Element element9 = document1.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element9.getElementsByIndexLessThan((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.removeClass("");
        org.jsoup.nodes.Element element5 = element3.toggleClass("hi!");
        org.jsoup.select.Elements elements7 = element5.getElementsMatchingText("hi!");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        org.jsoup.nodes.Element element10 = element5.attr("hi!  #document", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element11 = element10.parent();
        java.util.regex.Pattern pattern13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements14 = element11.getElementsByAttributeValueMatching("\n<head></head>", pattern13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(element11);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
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
        element13.setBaseUri("hi!  #document");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = element13.dataset();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueStarting("#document", "hi!  #document");
        boolean boolean13 = document1.hasClass("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element15 = document1.appendElement("#root <html> <head></head> <body></body> </html>");
        org.jsoup.nodes.Element element17 = document1.appendElement("hi!  #document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
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
        org.jsoup.select.Elements elements24 = element21.getElementsByAttributeValueMatching("", "hi!");
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
        org.junit.Assert.assertNotNull(elements24);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependText("hi!");
        org.jsoup.nodes.Element element12 = element10.prependText("#document");
        java.lang.String str13 = element10.html();
        org.jsoup.select.Elements elements14 = element10.parents();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = element10.appendElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#documenthi!" + "'", str13, "#documenthi!");
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("#document", "hi!");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element9 = document1.head();
        java.lang.String str11 = document1.absUrl("hi!");
        org.jsoup.nodes.Element element13 = document1.toggleClass("#root <html> <head></head> <body></body> </html>");
        org.jsoup.nodes.Element element15 = document1.addClass("<#root></#root>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements24 = element6.select("<html>\n <head></head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<html>? <head></head>? <body></body>?</html>': unexpected token at '<html>? <head></head>? <body></body>?</html>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("hi!");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingOwnText("#document");
        org.jsoup.nodes.Node node6 = document1.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node6.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
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
        java.lang.String str14 = document13.title();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        boolean boolean3 = document1.isBlock();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str6 = document1.attr("hi!");
        java.lang.Integer int7 = document1.elementSiblingIndex();
        org.jsoup.select.Elements elements9 = document1.getElementsMatchingText("");
        java.lang.Integer int10 = document1.elementSiblingIndex();
        java.lang.Class<?> wildcardClass11 = document1.getClass();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element6 = element3.append("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements9 = element6.getElementsByAttributeValueNot(" hi!", "hi!#root");
        org.jsoup.parser.Tag tag10 = element6.tag();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
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
        org.jsoup.select.Elements elements39 = element28.getAllElements();
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
        org.junit.Assert.assertNotNull(elements39);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = element11.after("\n<head></head>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
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
        java.lang.String str18 = element17.ownText();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
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
        java.util.regex.Pattern pattern37 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements38 = document1.getElementsMatchingOwnText(pattern37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#root" + "'", str34, "#root");
        org.junit.Assert.assertNotNull(element36);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.select.Elements elements6 = element3.getElementsByIndexLessThan((int) (short) 10);
        java.lang.String str7 = element3.data();
        org.jsoup.nodes.Document document8 = element3.ownerDocument();
        java.lang.String str9 = document8.data();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = document8.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str2 = document1.val();
        java.util.regex.Pattern pattern4 = null;
        org.jsoup.select.Elements elements5 = document1.getElementsByAttributeValueMatching("hi!", pattern4);
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element8 = document7.head();
        java.lang.String str9 = document7.outerHtml();
        java.lang.Integer int10 = document7.elementSiblingIndex();
        java.lang.String str11 = document7.nodeName();
        org.jsoup.nodes.Element element13 = document7.removeClass("");
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element17 = document15.html("");
        java.lang.String str18 = element17.className();
        boolean boolean20 = element17.hasClass("hi!");
        boolean boolean22 = element17.hasAttr("#document");
        java.lang.String str23 = element17.baseUri();
        org.jsoup.select.Elements elements26 = element17.getElementsByAttributeValueContaining("hi!  #document", "#root");
        java.util.Set<java.lang.String> strSet27 = element17.classNames();
        org.jsoup.nodes.Element element28 = element13.classNames(strSet27);
        org.jsoup.nodes.Element element30 = element28.getElementById("<html>\n <head></head>\n <body>\n </body>\n</html><<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>");
        // The following exception was thrown during execution in test generation
        try {
            document1.replaceWith((org.jsoup.nodes.Node) element28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNull(element30);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        java.lang.String str8 = element3.className();
        org.jsoup.nodes.Element element11 = element3.attr("hi!  #document", "<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str12 = element11.baseUri();
        java.util.Set<java.lang.String> strSet13 = element11.classNames();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.html("hi!");
        boolean boolean11 = element9.hasAttr("hi!");
        java.lang.String str12 = element9.html();
        java.lang.String str13 = element9.text();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str2 = document1.val();
        java.lang.String[] strArray13 = new java.lang.String[] { "<#root></#root>", "<#root></#root>", "<#root hi!  #document=\"#document\"></#root>", "#document", "<#root hi!  #document=\"#document\"></#root>", "<#root hi!  #document=\"#document\"></#root>", "#document", "#root", "hi!  #document", "<html>\n <head></head>\n <body></body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = document1.classNames((java.util.Set<java.lang.String>) strSet14);
        org.jsoup.nodes.Element element18 = document1.createElement("<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "<#root></#root>", "<#root></#root>", "<#root hi!  #document=\"#document\"></#root>", "#document", "<#root hi!  #document=\"#document\"></#root>", "<#root hi!  #document=\"#document\"></#root>", "#document", "#root", "hi!  #document", "<html>\n <head></head>\n <body></body>\n</html>" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.select.Elements elements6 = element4.getElementsByAttributeStarting("#root");
        java.lang.String str8 = element4.absUrl("#documenthi!");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
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
        java.lang.String str14 = document10.title();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
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
        org.jsoup.select.Elements elements25 = element7.getElementsContainingOwnText("hi!#root");
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
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
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
        java.lang.String str26 = document22.toString();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str26, "<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.new OutputSettings();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element7 = document5.html("");
        org.jsoup.nodes.Element element9 = element7.removeClass("#document");
        org.jsoup.nodes.Element element10 = document1.prependChild((org.jsoup.nodes.Node) element7);
        org.jsoup.nodes.Element element13 = element10.attr("#documenthi!", "hi!#root");
        org.jsoup.select.Elements elements16 = element13.getElementsByAttributeValue("<html>\n <head></head>\n <body>\n </body>\n</html><<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>", "<html>\n <head>\n  <title> hi!</title>\n </head>\n <body>\n  #document\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.appendText("hi!");
        java.lang.String str6 = element5.html();
        org.jsoup.nodes.Element element9 = element5.attr("<html>\n <head></head>\n <body></body>\n</html>", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element5.getElementsByAttributeValueStarting("", " hi!#root");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
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
        java.lang.String str37 = element33.absUrl(" hi!");
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!  #document", "#document");
        org.jsoup.select.Elements elements6 = document1.getElementsContainingText("hi!  #document");
        java.lang.String str7 = document1.className();
        java.util.Set<java.lang.String> strSet8 = document1.classNames();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document1.outputSettings();
        org.jsoup.nodes.Element element11 = document1.removeClass(" #document");
        org.jsoup.nodes.Element element13 = document1.addClass("");
        org.jsoup.select.Elements elements15 = document1.getElementsByIndexEquals(0);
        org.jsoup.nodes.Node node16 = document1.nextSibling();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        java.lang.String str8 = element3.className();
        org.jsoup.nodes.Element element11 = element3.attr("hi!  #document", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements13 = element3.getElementsContainingOwnText("#document");
        org.jsoup.select.Elements elements14 = element3.parents();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = element3.child((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element7 = document1.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.select.Elements elements9 = document1.getElementsByClass("#document");
        org.jsoup.select.Elements elements12 = document1.getElementsByAttributeValueMatching(" #document", " hi!#root");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        org.jsoup.select.Elements elements8 = document1.getElementsByClass(" hi!");
        org.jsoup.nodes.Attributes attributes9 = document1.attributes();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.select.Elements elements6 = document1.getElementsMatchingText("");
        org.jsoup.nodes.Element element8 = document1.html("hi!  #document");
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element12 = document10.html("");
        org.jsoup.nodes.Element element14 = element12.html("#document");
        org.jsoup.nodes.Element element16 = element14.appendElement("hi!");
        org.jsoup.nodes.Element element17 = document1.appendChild((org.jsoup.nodes.Node) element14);
        boolean boolean18 = element17.hasText();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
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
        java.lang.String str27 = element25.absUrl("<#root></#root>hi!");
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.wrap("hi!");
        org.jsoup.nodes.Element element4 = document1.body();
        boolean boolean6 = document1.hasClass("hi!");
        java.lang.String str7 = document1.data();
        org.jsoup.nodes.Element element8 = document1.empty();
        java.lang.String str9 = element8.toString();
        java.lang.String str11 = element8.absUrl("hi!#root <html> <head></head> <body></body> </html>");
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element9 = element3.empty();
        org.jsoup.nodes.Element element11 = element9.addClass("#root <html> <head></head> <body></body> </html>");
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element15 = document13.html("");
        java.lang.String str16 = element15.className();
        org.jsoup.nodes.Element element17 = element15.empty();
        boolean boolean19 = element17.hasClass("");
        java.lang.String str20 = element17.html();
        java.lang.String str21 = element17.text();
        org.jsoup.select.Elements elements24 = element17.getElementsByAttributeValueMatching("hi!", "hi!  #document");
        java.lang.String str26 = element17.attr("#root");
        // The following exception was thrown during execution in test generation
        try {
            element9.replaceWith((org.jsoup.nodes.Node) element17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.id();
        java.lang.String str6 = document1.nodeName();
        org.jsoup.nodes.Element element8 = document1.val("#root");
        org.jsoup.nodes.Element element10 = element8.val("<html>\n <head></head>\n <body>\n </body>\n</html><<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>");
        boolean boolean12 = element10.hasAttr("#root");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element7 = document1.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element9 = document6.text("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element11 = document6.prependText("#root");
        org.jsoup.nodes.Element element13 = document6.before("#document");
        org.jsoup.nodes.Element element15 = element13.prependText("hi!");
        org.jsoup.nodes.Element element17 = element13.before("#root");
        org.jsoup.select.Elements elements19 = element13.getElementsByIndexLessThan((int) (byte) -1);
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.nodes.Element element5 = element2.attr(" hi!#root", "#document");
        // The following exception was thrown during execution in test generation
        try {
            element2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.siblingIndex();
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element8 = document7.head();
        java.lang.String str9 = document7.outerHtml();
        java.lang.Integer int10 = document7.elementSiblingIndex();
        java.lang.String str11 = document7.nodeName();
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        org.jsoup.nodes.Element element20 = document13.classNames((java.util.Set<java.lang.String>) strSet18);
        org.jsoup.nodes.Element element21 = document7.classNames((java.util.Set<java.lang.String>) strSet18);
        java.lang.String str22 = document7.className();
        org.jsoup.nodes.Document document23 = document7.ownerDocument();
        org.jsoup.nodes.Element element25 = document7.prepend("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element27 = document7.text("#root");
        java.lang.String str28 = element27.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            document1.replaceWith((org.jsoup.nodes.Node) element27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!  #document" + "'", str22, "hi!  #document");
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
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
        org.jsoup.nodes.Attributes attributes18 = document11.attributes();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
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
        java.lang.String str17 = element3.toString();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueNot("hi!  #document", "hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document1.new OutputSettings();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        org.jsoup.select.Elements elements4 = document1.getElementsByTag("#document");
        org.jsoup.nodes.Element element6 = document1.html("hi!");
        java.lang.String str7 = document1.title();
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeStarting("<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttribute("hi!  #document");
        org.jsoup.nodes.Element element12 = document1.val("");
        org.jsoup.nodes.Element element13 = document1.body();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(element13);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.nodes.Document document5 = document1.ownerDocument();
        boolean boolean6 = document5.isBlock();
        java.lang.String str7 = document5.tagName();
        org.jsoup.nodes.Element element8 = document5.parent();
        java.lang.String str9 = document5.data();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#root" + "'", str7, "#root");
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings8.escapeMode();
        java.nio.charset.Charset charset10 = outputSettings8.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings8.indentAmount(1);
        int int13 = outputSettings12.indentAmount();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset10);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.val("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements6 = element3.getElementsByAttributeValueStarting("hi!", "hi!#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element3.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
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
        org.jsoup.select.Elements elements20 = element18.getElementsMatchingOwnText("#root");
        java.lang.String str21 = element18.data();
        org.jsoup.select.Elements elements22 = element18.getAllElements();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document1.addClass("#document");
        java.util.Set<java.lang.String> strSet7 = element6.classNames();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = element6.dataset();
        org.jsoup.nodes.Element element9 = element6.parent();
        boolean boolean10 = element6.isBlock();
        java.lang.Integer int11 = element6.elementSiblingIndex();
        org.jsoup.select.Elements elements13 = element6.getElementsByTag("hi!#root");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        boolean boolean3 = document1.isBlock();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str6 = document1.attr("hi!");
        java.lang.Integer int7 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.nodes.Element element10 = document1.prepend("<#root></#root>hi!");
        org.jsoup.nodes.Element element12 = document1.getElementById("#root");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(element12);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        boolean boolean7 = element5.hasClass("");
        java.lang.String str8 = element5.html();
        java.lang.String str9 = element5.text();
        java.lang.String str10 = element5.className();
        org.jsoup.select.Elements elements12 = element5.getElementsContainingText("<hi!  #document></hi!  #document>");
        java.util.regex.Pattern pattern13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements14 = element5.getElementsMatchingText(pattern13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.html("#document");
        org.jsoup.select.Elements elements8 = element5.getElementsByAttributeValueEnding("hi!  #document", "#document");
        org.jsoup.select.Elements elements9 = element5.getAllElements();
        org.jsoup.select.Elements elements11 = element5.getElementsByClass("#root");
        org.jsoup.nodes.Element element13 = element5.append("hi!");
        // The following exception was thrown during execution in test generation
        try {
            element5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueNot("hi!  #document", "hi!");
        boolean boolean10 = document1.hasClass("");
        java.lang.String str11 = document1.outerHtml();
        java.lang.String str12 = document1.title();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        boolean boolean5 = element3.hasClass("#document");
        org.jsoup.select.Elements elements6 = element3.parents();
        java.lang.String str7 = element3.toString();
        java.util.regex.Pattern pattern9 = null;
        org.jsoup.select.Elements elements10 = element3.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body></body>\n</html>", pattern9);
        org.jsoup.nodes.Element element12 = element3.appendText("hi!  #document");
        org.jsoup.select.Elements elements14 = element12.getElementsContainingOwnText("\n<head></head>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
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
        java.util.regex.Pattern pattern18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements19 = element9.getElementsMatchingOwnText(pattern18);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#root" + "'", str12, "#root");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.removeClass("");
        org.jsoup.nodes.Element element5 = element3.toggleClass("hi!");
        org.jsoup.select.Elements elements7 = element3.getElementsByTag("#document");
        java.lang.String str8 = element3.val();
        org.jsoup.select.Elements elements10 = element3.getElementsContainingOwnText("hi!  #document");
        org.jsoup.nodes.Node node12 = element3.removeAttr("body");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        org.jsoup.select.Elements elements4 = document1.getElementsByTag("#document");
        org.jsoup.nodes.Element element6 = document1.html("hi!");
        java.lang.String str7 = document1.title();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = document1.after("<html>\n <head>\n  <title> hi!</title>\n </head>\n <body>\n  #document\n </body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.html("hi!");
        org.jsoup.nodes.Element element11 = element9.addClass("hi!  #document");
        org.jsoup.select.Elements elements13 = element11.getElementsByIndexLessThan((int) (short) 0);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi! #document");
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueNot("hi!  #document", "hi!");
        org.jsoup.nodes.Element element9 = document1.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int10 = element9.elementSiblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
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
        java.lang.String str21 = element5.ownText();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.Integer int4 = document1.siblingIndex();
        java.lang.String str5 = document1.ownText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = document1.child((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
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
        org.jsoup.nodes.Document document39 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements42 = document39.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.select.Elements elements44 = document39.getElementsMatchingText("");
        org.jsoup.nodes.Element element46 = document39.html("hi!  #document");
        org.jsoup.nodes.Document document48 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element50 = document48.html("");
        org.jsoup.nodes.Element element52 = element50.html("#document");
        org.jsoup.nodes.Element element54 = element52.appendElement("hi!");
        org.jsoup.nodes.Element element55 = document39.appendChild((org.jsoup.nodes.Node) element52);
        element31.replaceWith((org.jsoup.nodes.Node) element55);
        element55.remove();
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
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(element55);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
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
        java.lang.String str18 = document1.id();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = document1.dataset();
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
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependText("hi!");
        org.jsoup.nodes.Element element11 = element3.empty();
        org.jsoup.select.Elements elements13 = element3.getElementsByAttributeStarting("hi!#root");
        boolean boolean14 = element3.isBlock();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.parser.Tag tag6 = document1.tag();
        org.jsoup.nodes.Element element8 = document1.createElement("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements10 = document1.getElementsByClass("#document");
        org.jsoup.nodes.Element element12 = document1.prependElement("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.Integer int13 = element12.elementSiblingIndex();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependElement("hi!");
        java.lang.String str12 = element3.attr("hi!  #document");
        org.jsoup.select.Elements elements15 = element3.getElementsByAttributeValueNot("hi!  #document", "#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element17 = element3.after("hi!#root");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.parser.Tag tag6 = document1.tag();
        org.jsoup.nodes.Element element8 = document1.createElement("<html>\n <head></head>\n <body></body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = document1.attr("", "<html>\n <head>\n  <title> hi!</title>\n </head>\n <body>\n  #document\n </body>\n</html>");
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
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Node node5 = document1.removeAttr("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str6 = document1.outerHtml();
        java.util.regex.Pattern pattern7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = document1.getElementsMatchingText(pattern7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
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
        org.jsoup.nodes.Document document16 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str17 = document16.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = document16.new OutputSettings();
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element21 = document20.head();
        java.lang.String str22 = document20.outerHtml();
        java.lang.Integer int23 = document20.elementSiblingIndex();
        java.lang.String str24 = document20.nodeName();
        org.jsoup.nodes.Element element26 = document20.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = document20.outputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings27.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings18.escapeMode(escapeMode28);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings13.escapeMode(escapeMode28);
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#document" + "'", str17, "#document");
        org.junit.Assert.assertNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#document" + "'", str24, "#document");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertTrue("'" + escapeMode28 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode28.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(outputSettings30);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
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
        org.jsoup.nodes.Document document31 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str32 = document31.nodeName();
        org.jsoup.nodes.Document document34 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element36 = document34.html("");
        java.lang.String str37 = element36.className();
        org.jsoup.nodes.Element element38 = element36.empty();
        org.jsoup.select.Elements elements40 = element36.getElementsMatchingOwnText("");
        org.jsoup.nodes.Document document42 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element43 = document42.head();
        java.lang.String str44 = document42.outerHtml();
        java.lang.Integer int45 = document42.elementSiblingIndex();
        org.jsoup.nodes.Element element47 = document42.addClass("#document");
        java.util.Set<java.lang.String> strSet48 = element47.classNames();
        org.jsoup.nodes.Element element49 = element36.classNames(strSet48);
        org.jsoup.nodes.Element element50 = document31.classNames(strSet48);
        org.jsoup.nodes.Element element51 = element29.classNames(strSet48);
        java.util.Set<java.lang.String> strSet52 = element51.classNames();
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
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#document" + "'", str32, "#document");
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNull(element43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(strSet52);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
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
        org.jsoup.nodes.Node node40 = element39.nextSibling();
        java.lang.Integer int41 = element39.elementSiblingIndex();
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
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
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
        boolean boolean32 = element28.isBlock();
        java.lang.String str33 = element28.text();
        org.jsoup.nodes.Element element35 = element28.toggleClass("");
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(element35);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
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
        java.nio.charset.Charset charset14 = outputSettings11.charset();
        java.nio.charset.CharsetEncoder charsetEncoder15 = outputSettings11.encoder();
        int int16 = outputSettings11.indentAmount();
        java.nio.charset.CharsetEncoder charsetEncoder17 = outputSettings11.encoder();
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
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertNotNull(charsetEncoder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(charsetEncoder17);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
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
        java.lang.String str13 = element7.val();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttribute("hi!  #document");
        document1.setBaseUri("");
        org.jsoup.select.Elements elements14 = document1.getElementsByIndexEquals((-1));
        java.lang.String str15 = document1.title();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.parser.Tag tag6 = document1.tag();
        org.jsoup.nodes.Element element8 = document1.createElement("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements10 = document1.getElementsByClass("#document");
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = document1.outputSettings();
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str14 = document13.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = document13.outputSettings();
        boolean boolean16 = outputSettings15.prettyPrint();
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element19 = document18.head();
        java.lang.String str20 = document18.outerHtml();
        java.lang.Integer int21 = document18.elementSiblingIndex();
        java.lang.String str22 = document18.nodeName();
        org.jsoup.nodes.Element element24 = document18.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = document18.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings25.indentAmount(10);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings25.prettyPrint(true);
        boolean boolean30 = outputSettings29.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode31 = outputSettings29.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings15.escapeMode(escapeMode31);
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings11.escapeMode(escapeMode31);
        java.nio.charset.CharsetEncoder charsetEncoder34 = outputSettings33.encoder();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#document" + "'", str14, "#document");
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#document" + "'", str22, "#document");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + escapeMode31 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode31.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertNotNull(charsetEncoder34);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.select.Elements elements4 = element2.getElementsByIndexLessThan(1);
        java.lang.String str5 = element2.data();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.html("#document");
        org.jsoup.select.Elements elements8 = element5.getElementsByAttributeValueEnding("hi!  #document", "#document");
        org.jsoup.select.Elements elements9 = element5.getAllElements();
        org.jsoup.select.Elements elements11 = element5.getElementsMatchingOwnText("#root <html> <head></head> <body></body> </html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = element5.getElementsByAttributeStarting("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
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
        java.lang.String str21 = element13.toString();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
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
        java.util.regex.Pattern pattern65 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements66 = document1.getElementsMatchingText(pattern65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = element3.getElementsContainingText("");
        boolean boolean6 = element3.isBlock();
        org.jsoup.nodes.Attributes attributes7 = element3.attributes();
        org.jsoup.nodes.Element element9 = element3.append("hi! #document");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document1.addClass("#document");
        boolean boolean8 = element6.hasClass("hi!");
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        org.jsoup.nodes.Element element17 = document10.classNames((java.util.Set<java.lang.String>) strSet15);
        org.jsoup.select.Elements elements20 = document10.getElementsByAttributeValueStarting("#document", "hi!  #document");
        org.jsoup.nodes.Document document21 = document10.normalise();
        org.jsoup.nodes.Document document23 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element25 = document23.html("");
        org.jsoup.nodes.Element element27 = element25.html("#document");
        org.jsoup.nodes.Document document29 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element31 = document29.html("");
        java.lang.String str32 = element31.className();
        org.jsoup.nodes.Element element33 = element31.empty();
        org.jsoup.select.Elements elements35 = element31.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element37 = element31.html("hi!");
        boolean boolean39 = element37.hasAttr("hi!");
        java.util.Set<java.lang.String> strSet40 = element37.classNames();
        org.jsoup.nodes.Element element41 = element27.classNames(strSet40);
        org.jsoup.nodes.Element element42 = document10.classNames(strSet40);
        org.jsoup.nodes.Element element43 = element6.classNames(strSet40);
        org.jsoup.nodes.Element element46 = element6.attr("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>", "#documenthi!");
        boolean boolean47 = element6.isBlock();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.new OutputSettings();
        java.lang.String str4 = document1.id();
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("#document");
        java.util.Set<java.lang.String> strSet8 = document7.classNames();
        org.jsoup.nodes.Element element9 = document1.classNames(strSet8);
        org.jsoup.nodes.Element element11 = document1.val("#document");
        document1.title("<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
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
        org.jsoup.nodes.Node node33 = element27.removeAttr(" hi!");
        org.jsoup.nodes.Element element35 = element27.before("#root <html> <head></head> <body></body> </html>");
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
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(element35);
    }
}

