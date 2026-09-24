package org.jsoup.nodes;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.jsoup.parser.Tag tag0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element2 = new org.jsoup.nodes.Element(tag0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jsoup.parser.Tag tag0 = null;
        org.jsoup.nodes.Attributes attributes2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag0, "", attributes2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element3 = element1.prependElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        // The following exception was thrown during execution in test generation
        try {
            element1.outerHtmlTail(appendable3, 0, outputSettings5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jsoup.parser.Tag tag0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element2 = new org.jsoup.nodes.Element(tag0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = new org.jsoup.nodes.Element("hi!");
        int int5 = element4.childNodeSize();
        boolean boolean7 = element4.hasClass("hi!");
        java.util.regex.Pattern pattern9 = null;
        org.jsoup.select.Elements elements10 = element4.getElementsByAttributeValueMatching("hi!", pattern9);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element1.insertChildren((int) (byte) 100, (java.util.Collection<org.jsoup.nodes.Element>) elements10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = element4.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = element3.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        java.lang.String str3 = element1.nodeName();
        element1.setBaseUri("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueStarting("", "<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        java.util.regex.Pattern pattern4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements5 = element3.getElementsMatchingText(pattern4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = element7.getElementsByClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = new org.jsoup.nodes.Element("hi!");
        int int5 = element4.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            element1.replaceWith((org.jsoup.nodes.Node) element4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = element1.is("<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi!></hi!>': unexpected token at '<hi!></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        java.util.Set<java.lang.String> strSet4 = element3.classNames();
        java.lang.Integer int5 = element3.elementSiblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = element3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element10 = element4.addClass("");
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            element10.outerHtmlTail(appendable11, 10, outputSettings13);
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
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
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
        java.util.regex.Pattern pattern13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements14 = element12.getElementsMatchingOwnText(pattern13);
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
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        boolean boolean9 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element4);
        org.jsoup.nodes.Element element10 = element4.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element10.getElementsMatchingText("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(element10);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str8 = element7.id();
        org.jsoup.nodes.Element element10 = element7.removeClass("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element5.after((org.jsoup.nodes.Node) element10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("hi!", pattern6);
        org.jsoup.nodes.Element element8 = element1.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element1.attr("", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        int int8 = element7.childNodeSize();
        java.lang.String str9 = element7.nodeName();
        org.jsoup.nodes.Element element10 = element4.appendChild((org.jsoup.nodes.Node) element7);
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            element10.outerHtmlHead(appendable11, (int) (short) 100, outputSettings13);
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
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("hi!", pattern6);
        java.lang.String str8 = element1.tagName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element1.after("hi!.hi!.<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        java.lang.String str7 = element4.tagName();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            element4.outerHtmlHead(appendable8, (int) '#', outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
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
        java.util.regex.Pattern pattern12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = element4.getElementsMatchingText(pattern12);
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
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Element element9 = element7.tagName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = element7.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        java.lang.String str3 = element1.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        // The following exception was thrown during execution in test generation
        try {
            element7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        java.lang.String str3 = element1.nodeName();
        java.util.Set<java.lang.String> strSet4 = element1.classNames();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str7 = element6.id();
        org.jsoup.nodes.Element element9 = element6.removeClass("");
        java.lang.String str11 = element9.absUrl("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = element1.after((org.jsoup.nodes.Node) element9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        org.jsoup.nodes.Element element6 = element1.toggleClass("<hi!></hi!>");
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str9 = element8.id();
        org.jsoup.nodes.Element element11 = element8.removeClass("");
        java.lang.String str13 = element11.absUrl("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = element6.before((org.jsoup.nodes.Node) element11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.select.Elements elements7 = element5.getElementsByClass("hi!");
        java.lang.String str8 = element5.val();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element5.getElementsByAttributeValueContaining("", "<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        java.lang.String str6 = element3.data();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = element3.getElementsByAttributeValueNot("hi!.hi!.<hi!></hi!>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        org.jsoup.nodes.Node node6 = element3.parentNode();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element8.val("<hi!></hi!>");
        org.jsoup.parser.Tag tag11 = element8.tag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = element3.after((org.jsoup.nodes.Node) element8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNodeList5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        java.lang.String str3 = element1.nodeName();
        java.util.Set<java.lang.String> strSet4 = element1.classNames();
        java.lang.Class<?> wildcardClass5 = strSet4.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "<hi!></hi!>", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        org.jsoup.nodes.Element element13 = element4.classNames((java.util.Set<java.lang.String>) strSet11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = element4.is("hi!.hi!.<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'hi!.hi!.<hi!></hi!>': unexpected token at '!.hi!.<hi!></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "<hi!></hi!>", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = element4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        boolean boolean5 = element1.isBlock();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = element1.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Element element9 = element7.tagName("hi!");
        org.jsoup.select.Elements elements11 = element7.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        int int14 = element13.childNodeSize();
        boolean boolean16 = element13.hasClass("hi!");
        org.jsoup.nodes.Node node17 = element13.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = element7.before((org.jsoup.nodes.Node) element13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements14 = element4.getElementsByAttributeValueEnding("", "<hi!></hi!>");
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
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = element5.getElementsByAttributeValueStarting("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = element4.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = element9.is("<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = element14.getClass();
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
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Element element9 = element7.tagName("hi!");
        boolean boolean10 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element9);
        boolean boolean11 = element9.isBlock();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = element9.after("hi!.hi!.<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("hi!", pattern6);
        java.lang.String str8 = element1.tagName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = element1.is("");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '': unexpected token at ''");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        java.util.Set<java.lang.String> strSet4 = element3.classNames();
        java.lang.Integer int5 = element3.elementSiblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = element3.after("hi!.hi!.<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element4.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements17 = element10.select("hi!.hi!.<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'hi!.hi!.<hi!></hi!>': unexpected token at '!.hi!.<hi!></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
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
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
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
        java.lang.Class<?> wildcardClass15 = element4.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("hi!", pattern6);
        org.jsoup.nodes.Element element9 = element1.appendText("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element9.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        boolean boolean4 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element5 = element1.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = element5.ownText();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(element5);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.parser.Tag tag6 = element4.tag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = element4.getElementsByAttributeValueStarting("", "<hi! class=\"\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.select.Elements elements7 = element5.getElementsByClass("hi!");
        java.lang.String str8 = element5.val();
        org.jsoup.select.Evaluator evaluator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = element5.is(evaluator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        org.jsoup.nodes.Element element6 = element1.append("hi!.hi!.<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = element1.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        boolean boolean9 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element4);
        org.jsoup.nodes.Element element10 = element4.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element10.siblingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(element10);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("hi!", pattern6);
        org.jsoup.nodes.Element element9 = element1.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element12 = element1.attr("hi!.hi!.<hi!></hi!>", "<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = element12.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.val("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet4 = element3.classNames();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        int int7 = element6.childNodeSize();
        boolean boolean9 = element6.hasClass("hi!");
        java.util.regex.Pattern pattern11 = null;
        org.jsoup.select.Elements elements12 = element6.getElementsByAttributeValueMatching("hi!", pattern11);
        java.lang.String str13 = element6.tagName();
        // The following exception was thrown during execution in test generation
        try {
            element3.replaceWith((org.jsoup.nodes.Node) element6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
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
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str20 = element19.id();
        java.lang.Integer int21 = element19.elementSiblingIndex();
        java.lang.String str22 = element19.className();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList23 = element19.dataNodes();
        org.jsoup.select.Elements elements25 = element19.getElementsByTag("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element26 = element13.insertChildren((int) 'a', (java.util.Collection<org.jsoup.nodes.Element>) elements25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
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
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(dataNodeList23);
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            element3.outerHtmlHead(appendable5, (int) (short) 0, outputSettings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList6 = element3.textNodes();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element8.appendText("");
        org.jsoup.nodes.Element element12 = element10.removeClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList13 = element10.textNodes();
        org.jsoup.nodes.Element element15 = element10.text("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = element3.before((org.jsoup.nodes.Node) element15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(textNodeList6);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(textNodeList13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        boolean boolean5 = element1.isBlock();
        java.lang.String str6 = element1.text();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = element1.getElementsByAttributeValue("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.parser.Tag tag6 = element4.tag();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element(tag6, "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str11 = element10.id();
        java.lang.Integer int12 = element10.elementSiblingIndex();
        org.jsoup.nodes.Element element13 = element10.empty();
        java.lang.String str14 = element13.outerHtml();
        org.jsoup.select.Elements elements17 = element13.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element21 = element19.appendText("");
        java.util.Set<java.lang.String> strSet22 = element21.classNames();
        org.jsoup.nodes.Element element23 = element13.classNames(strSet22);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element24 = element8.after((org.jsoup.nodes.Node) element13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<hi!></hi!>" + "'", str14, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        boolean boolean4 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element5 = element1.previousElementSibling();
        java.lang.String str6 = element1.cssSelector();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            element1.outerHtmlHead(appendable7, (int) '#', outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        org.jsoup.nodes.Node node6 = element3.parentNode();
        java.util.regex.Pattern pattern7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = element3.getElementsMatchingText(pattern7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNodeList5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        org.jsoup.nodes.Element element6 = element4.toggleClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element4.childNodes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
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
        // The following exception was thrown during execution in test generation
        try {
            element4.remove();
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
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        java.lang.String str4 = element1.className();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList5 = element1.dataNodes();
        org.jsoup.nodes.Element element8 = element1.attr("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element10 = element1.appendElement("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element1.select("hi!.hi!.<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'hi!.hi!.<hi!></hi!>': unexpected token at '!.hi!.<hi!></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(dataNodeList5);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        org.jsoup.nodes.Element element8 = element4.append("hi!");
        org.jsoup.nodes.Node node9 = element4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element4.select("hi!.hi!.<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'hi!.hi!.<hi!></hi!>': unexpected token at '!.hi!.<hi!></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        org.jsoup.nodes.Element element5 = element1.clone();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            element5.outerHtmlHead(appendable6, (-1), outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "<hi!></hi!>", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        org.jsoup.nodes.Element element13 = element4.classNames((java.util.Set<java.lang.String>) strSet11);
        java.lang.String str14 = element13.cssSelector();
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            element13.outerHtmlHead(appendable15, (int) 'a', outputSettings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        org.jsoup.nodes.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            element4.replaceWith(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Attributes attributes8 = element7.attributes();
        org.jsoup.select.Elements elements11 = element7.getElementsByAttributeValue("<hi!></hi!>", "<hi!></hi!>");
        org.jsoup.nodes.Element element12 = element7.parent();
        org.jsoup.select.Evaluator evaluator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = element12.is(evaluator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNull(element12);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet9 = element8.classNames();
        org.jsoup.nodes.Element element11 = element8.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        int int14 = element13.childNodeSize();
        boolean boolean16 = element13.hasClass("hi!");
        java.util.regex.Pattern pattern18 = null;
        org.jsoup.select.Elements elements19 = element13.getElementsByAttributeValueMatching("hi!", pattern18);
        org.jsoup.nodes.Element element20 = element13.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element21 = element11.before((org.jsoup.nodes.Node) element13);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        boolean boolean9 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element4);
        org.jsoup.nodes.Element element10 = element4.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element10.getElementsByAttribute("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(element10);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        java.lang.String str3 = element1.nodeName();
        element1.setBaseUri("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = element1.before("<hi!>\n</hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        java.lang.String str4 = element1.className();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList5 = element1.dataNodes();
        org.jsoup.nodes.Element element8 = element1.attr("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element10 = element1.appendElement("hi!");
        org.jsoup.nodes.Attributes attributes11 = element10.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements14 = element10.getElementsByAttributeValue("<hi! class=\"\"></hi!>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(dataNodeList5);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
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
        org.jsoup.nodes.Element element12 = element4.parent();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = element4.is("<hi! class=\"\"></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! class=\"\"></hi!>': unexpected token at '<hi! class=\"\"></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNull(element12);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
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
        // The following exception was thrown during execution in test generation
        try {
            element1.remove();
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
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        boolean boolean9 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element4);
        org.jsoup.nodes.Element element10 = element4.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = element10.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(element10);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element6 = element5.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element6.child((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
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
        org.jsoup.select.NodeVisitor nodeVisitor21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = element20.traverse(nodeVisitor21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        java.lang.String str6 = element3.nodeName();
        org.jsoup.nodes.Node node7 = element3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = element3.child((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jsoup.parser.Tag tag0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element2 = new org.jsoup.nodes.Element(tag0, "<hi!>\n</hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = element9.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = element9.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
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
        // The following exception was thrown during execution in test generation
        try {
            element12.remove();
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
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        java.lang.String str7 = element4.tagName();
        org.jsoup.select.Elements elements9 = element4.getElementsByIndexLessThan((int) (byte) 100);
        java.lang.String str10 = element4.className();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.parser.Tag tag6 = element4.tag();
        org.jsoup.select.Elements elements9 = element4.getElementsByAttributeValueMatching("hi!", "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element10 = element4.empty();
        java.util.regex.Pattern pattern11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element4.getElementsMatchingText(pattern11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        org.jsoup.nodes.Element element6 = element1.toggleClass("<hi!></hi!>");
        org.jsoup.select.Elements elements8 = element1.getElementsContainingOwnText("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element1.getElementsByAttributeValueNot("<hi!>\n</hi!>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element1.nodeName();
        org.jsoup.nodes.Element element7 = element1.appendText("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str10 = element9.id();
        org.jsoup.nodes.Element element12 = element9.removeClass("");
        element12.setBaseUri("hi!");
        org.jsoup.nodes.Element element16 = element12.append("hi!");
        int int17 = element16.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = element7.after((org.jsoup.nodes.Node) element16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.select.Elements elements6 = element3.getElementsByAttributeValueMatching("<hi! class=\"\"></hi!>", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = element3.is("");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '': unexpected token at ''");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements38 = element3.select("<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi!></hi!>': unexpected token at '<hi!></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        org.jsoup.nodes.Element element4 = element1.val("hi!");
        org.jsoup.select.Elements elements7 = element4.getElementsByAttributeValueMatching("hi!", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        int int8 = element7.childNodeSize();
        java.lang.String str9 = element7.nodeName();
        org.jsoup.nodes.Element element10 = element4.appendChild((org.jsoup.nodes.Node) element7);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = element4.dataset();
        java.lang.Class<?> wildcardClass12 = strMap11.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("hi!", pattern6);
        boolean boolean9 = element1.hasClass("hi!.hi!.<hi!></hi!>");
        org.jsoup.select.NodeVisitor nodeVisitor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = element1.traverse(nodeVisitor10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element10 = element4.addClass("");
        java.lang.String str11 = element4.cssSelector();
        org.jsoup.nodes.Node node12 = element4.parentNode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
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
        // The following exception was thrown during execution in test generation
        try {
            element10.remove();
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
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(textNodeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
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
        org.jsoup.parser.Tag tag19 = element17.tag();
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str23 = element22.id();
        org.jsoup.nodes.Element element25 = element22.removeClass("");
        java.lang.String str27 = element25.absUrl("hi!");
        org.jsoup.nodes.Element element29 = element25.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet30 = element29.classNames();
        org.jsoup.nodes.Element element32 = element29.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Attributes attributes33 = element32.attributes();
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element(tag19, "<hi! class=\"\"></hi!>", attributes33);
        java.util.Set<java.lang.String> strSet35 = element34.classNames();
        java.util.Set<java.lang.String> strSet36 = element34.classNames();
        org.jsoup.nodes.Element element37 = element9.classNames(strSet36);
        // The following exception was thrown during execution in test generation
        try {
            element37.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<hi!></hi!>" + "'", str18, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNotNull(element37);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList6 = element3.textNodes();
        org.jsoup.nodes.Element element8 = element3.text("");
        org.jsoup.nodes.Node node9 = element3.previousSibling();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(textNodeList6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
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
        org.jsoup.nodes.Element element46 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str47 = element46.id();
        java.lang.Integer int48 = element46.elementSiblingIndex();
        org.jsoup.nodes.Element element49 = element46.empty();
        java.lang.String str50 = element49.outerHtml();
        org.jsoup.parser.Tag tag51 = element49.tag();
        org.jsoup.select.Elements elements54 = element49.getElementsByAttributeValueMatching("hi!", "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element55 = element49.empty();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList56 = element49.textNodes();
        // The following exception was thrown during execution in test generation
        try {
            element44.replaceWith((org.jsoup.nodes.Node) element49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "<hi!></hi!>" + "'", str50, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertNotNull(elements54);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNotNull(textNodeList56);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        boolean boolean4 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element6 = element1.appendElement("hi!");
        java.util.regex.Pattern pattern7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = element1.getElementsMatchingOwnText(pattern7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        java.lang.String str6 = element3.nodeName();
        org.jsoup.nodes.Element element8 = element3.prependText("hi!");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            element8.outerHtmlTail(appendable9, 10, outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.removeClass("hi!");
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(100);
        org.jsoup.select.Evaluator evaluator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = element1.is(evaluator6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
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
        java.util.List<org.jsoup.nodes.TextNode> textNodeList14 = element4.textNodes();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str17 = element16.id();
        org.jsoup.nodes.Element element19 = element16.removeClass("");
        java.lang.String str21 = element19.absUrl("hi!");
        org.jsoup.nodes.Element element23 = element19.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet24 = element23.classNames();
        org.jsoup.nodes.Element element26 = element23.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element28 = element26.html("");
        org.jsoup.nodes.Element element30 = element26.removeClass("<hi!>\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element31 = element4.after((org.jsoup.nodes.Node) element30);
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
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(textNodeList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = element4.empty();
        org.jsoup.nodes.Element element11 = element4.prepend("<hi!>\n</hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(textNodeList12);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements17 = element12.getElementsByAttributeValueStarting("", "<hi! class=\"\"></hi!>");
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
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("hi!", pattern6);
        boolean boolean9 = element1.hasClass("<hi!></hi!>");
        org.jsoup.select.NodeVisitor nodeVisitor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = element1.traverse(nodeVisitor10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
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
        java.lang.Class<?> wildcardClass37 = element35.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        org.jsoup.nodes.Element element6 = element1.toggleClass("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = element6.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((-1));
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            element1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element4.siblingNodes();
        org.jsoup.nodes.Element element8 = element4.prependElement("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.select.Elements elements10 = element8.getElementsContainingOwnText("");
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            element8.outerHtmlTail(appendable11, (int) (byte) 100, outputSettings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        boolean boolean9 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element4);
        org.jsoup.nodes.Element element10 = element4.previousElementSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element4.siblingNodes();
        java.lang.Class<?> wildcardClass12 = nodeList11.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
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
        org.jsoup.nodes.Element element19 = element3.nextElementSibling();
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
        org.junit.Assert.assertNull(element19);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
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
        org.jsoup.select.NodeVisitor nodeVisitor24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = element14.traverse(nodeVisitor24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("hi!", pattern6);
        org.jsoup.nodes.Element element9 = element1.appendText("<hi!></hi!>");
        org.jsoup.nodes.Document document10 = element1.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = document10.equals((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("hi!", pattern6);
        org.jsoup.nodes.Element element9 = element1.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element12 = element1.attr("hi!.hi!.<hi!></hi!>", "<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements15 = element1.getElementsByAttributeValue("", "hi!.hi!.<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
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
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            element7.outerHtmlTail(appendable12, (int) (byte) 10, outputSettings14);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<hi!></hi!>" + "'", str11, "<hi!></hi!>");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        org.jsoup.select.Elements elements5 = element4.getAllElements();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = element4.after("<hi! class=\"\">\n</hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        boolean boolean4 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element6 = element1.appendElement("hi!");
        org.jsoup.select.Evaluator evaluator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = element6.is(evaluator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.className();
        org.jsoup.nodes.Element element4 = element1.html("hi!");
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str7 = element6.id();
        java.lang.Integer int8 = element6.elementSiblingIndex();
        org.jsoup.nodes.Element element9 = element6.empty();
        org.jsoup.parser.Tag tag10 = element9.tag();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str14 = element13.id();
        java.lang.Integer int15 = element13.elementSiblingIndex();
        org.jsoup.nodes.Element element16 = element13.empty();
        org.jsoup.parser.Tag tag17 = element16.tag();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str21 = element20.id();
        java.lang.Integer int22 = element20.elementSiblingIndex();
        java.lang.String str23 = element20.className();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList24 = element20.dataNodes();
        org.jsoup.nodes.Element element27 = element20.attr("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element29 = element20.appendElement("hi!");
        org.jsoup.nodes.Attributes attributes30 = element29.attributes();
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element(tag17, "<hi!>\n <hi!></hi!>\n</hi!>", attributes30);
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element(tag10, "hi!.hi!.<hi!></hi!>", attributes30);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element33 = element1.before((org.jsoup.nodes.Node) element32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(dataNodeList24);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(attributes30);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet9 = element8.classNames();
        org.jsoup.nodes.Element element11 = element8.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element13 = element11.html("");
        org.jsoup.select.Elements elements14 = element13.parents();
        int int15 = element13.childNodeSize();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
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
        // The following exception was thrown during execution in test generation
        try {
            element6.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.val("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = element1.after("hi!.hi!.<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str6 = element5.id();
        org.jsoup.nodes.Element element8 = element5.removeClass("");
        java.lang.String str10 = element8.absUrl("hi!");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "<hi!></hi!>", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        org.jsoup.nodes.Element element17 = element8.classNames((java.util.Set<java.lang.String>) strSet15);
        java.lang.String str18 = element17.cssSelector();
        // The following exception was thrown during execution in test generation
        try {
            element1.replaceWith((org.jsoup.nodes.Node) element17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "<hi!></hi!>", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!.hi!.<hi!></hi!>" + "'", str18, "hi!.hi!.<hi!></hi!>");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.className();
        org.jsoup.nodes.Element element4 = element1.html("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsContainingText("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            element4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = element7.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "<hi!></hi!>", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        org.jsoup.nodes.Element element13 = element4.classNames((java.util.Set<java.lang.String>) strSet11);
        java.lang.String str14 = element13.cssSelector();
        org.jsoup.nodes.Element element15 = element13.previousElementSibling();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "<hi!></hi!>", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!.hi!.<hi!></hi!>" + "'", str14, "hi!.hi!.<hi!></hi!>");
        org.junit.Assert.assertNull(element15);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        boolean boolean4 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements6 = element1.getElementsByIndexEquals((int) '#');
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            element5.outerHtmlTail(appendable6, 1, outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueStarting("<hi!>\n</hi!>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Attributes attributes8 = element7.attributes();
        org.jsoup.select.Elements elements11 = element7.getElementsByAttributeValue("<hi!></hi!>", "<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = element7.is("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! class=\"\">? hi!.hi!.? <hi!></hi!>?</hi!>': unexpected token at '<hi! class=\"\">? hi!.hi!.? <hi!></hi!>?</hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
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
        org.jsoup.select.Elements elements16 = element12.getElementsByClass("<hi!>\n</hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element10 = element4.addClass("");
        // The following exception was thrown during execution in test generation
        try {
            element10.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element10 = element4.append("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.select.Elements elements13 = element10.getElementsByAttributeValueNot("<hi! class=\"\"></hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = element10.after("<hi! class=\"<hi!></hi!>\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet9 = element8.classNames();
        org.jsoup.nodes.Element element11 = element8.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element13 = element11.html("");
        org.jsoup.select.Elements elements14 = element13.parents();
        org.jsoup.nodes.Element element17 = element13.attr("<hi! class=\"\">\n</hi!>", false);
        java.util.List<org.jsoup.nodes.Node> nodeList18 = element13.siblingNodes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element25 = element23.appendElement("");
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
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        java.lang.String str3 = element1.nodeName();
        java.lang.String str4 = element1.text();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = element1.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements39 = element35.getElementsByAttributeValueEnding("<hi!>\n</hi!>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
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
        org.jsoup.nodes.Element element12 = element4.parent();
        // The following exception was thrown during execution in test generation
        try {
            element12.remove();
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
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNull(element12);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        java.lang.String str6 = element3.nodeName();
        org.jsoup.nodes.Node node7 = element3.nextSibling();
        java.lang.String str8 = element3.text();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        java.lang.String str6 = element3.data();
        org.jsoup.nodes.Node node7 = element3.nextSibling();
        org.jsoup.select.Elements elements8 = element3.getAllElements();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = element3.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.parser.Tag tag6 = element4.tag();
        org.jsoup.select.Evaluator evaluator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = element4.is(evaluator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.val("<hi!></hi!>");
        java.lang.String str4 = element1.text();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = element1.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        java.lang.String str3 = element1.nodeName();
        java.lang.String str4 = element1.text();
        org.jsoup.nodes.Node node5 = element1.previousSibling();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        org.jsoup.nodes.Node node6 = element3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = node6.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNodeList5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        org.jsoup.nodes.Element element6 = element1.append("hi!.hi!.<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element6.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = element6.before("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
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
        org.jsoup.select.Elements elements14 = element7.getElementsContainingOwnText("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element16 = element7.before("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element19 = element7.attr("<hi! class=\"\"></hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = element19.childNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = element21.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35");
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
        org.junit.Assert.assertNotNull(strSet22);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
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
            org.jsoup.select.Elements elements16 = element13.select("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.val("<hi!></hi!>");
        org.jsoup.parser.Tag tag4 = element1.tag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = element1.select("<hi! class=\"<hi!></hi!>\"></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! class=\"<hi!></hi!>\"></hi!>': unexpected token at '<hi! class=\"<hi!></hi!>\"></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = element17.is("hi!.hi!.<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'hi!.hi!.<hi!></hi!>': unexpected token at '!.hi!.<hi!></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = element13.wrap("");
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
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.select.Elements elements5 = element3.getElementsMatchingText("");
        org.jsoup.nodes.Element element7 = element3.prependText("hi!");
        java.util.regex.Pattern pattern9 = null;
        org.jsoup.select.Elements elements10 = element3.getElementsByAttributeValueMatching("<hi!>\n</hi!>", pattern9);
        java.lang.String str11 = element3.html();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = element3.is("<hi! class=\"<hi!></hi!>\"></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! class=\"<hi!></hi!>\"></hi!>': unexpected token at '<hi! class=\"<hi!></hi!>\"></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("hi!", pattern6);
        org.jsoup.nodes.Element element9 = element1.appendText("<hi!></hi!>");
        boolean boolean10 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = element1.is("<hi! class=\"\">\n</hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! class=\"\">?</hi!>': unexpected token at '<hi! class=\"\">?</hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements16 = element13.getElementsByAttributeValueContaining("<hi! class=\"<hi!></hi!>\"></hi!>", "");
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
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        java.lang.String str3 = element1.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = element1.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.removeClass("hi!");
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(100);
        java.lang.String str6 = element1.id();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element1.child((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element1.nodeName();
        org.jsoup.nodes.Element element7 = element1.appendText("<hi! class=\"\"></hi!>");
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            element1.outerHtmlTail(appendable8, (int) (short) 100, outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = element20.unwrap();
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
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(textNodeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet9 = element8.classNames();
        org.jsoup.nodes.Element element11 = element8.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element13 = element11.html("");
        org.jsoup.nodes.Element element15 = element11.removeClass("<hi!>\n</hi!>");
        org.jsoup.select.Elements elements18 = element11.getElementsByAttributeValueStarting("<hi! class=\"\">\n</hi!>", "<hi! class=\"\">\n</hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
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
        java.util.regex.Pattern pattern15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements16 = element13.getElementsMatchingOwnText(pattern15);
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
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element4.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.select.Elements elements7 = element5.getElementsByClass("hi!");
        java.lang.String str8 = element5.val();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str12 = element11.id();
        java.lang.Integer int13 = element11.elementSiblingIndex();
        org.jsoup.nodes.Element element14 = element11.empty();
        java.lang.String str15 = element14.outerHtml();
        org.jsoup.select.Elements elements18 = element14.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element20 = element14.append("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.select.Elements elements23 = element20.getElementsByAttributeValueNot("<hi! class=\"\"></hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element24 = element5.insertChildren(10, (java.util.Collection<org.jsoup.nodes.Element>) elements23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<hi!></hi!>" + "'", str15, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "<hi!></hi!>", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        org.jsoup.nodes.Element element13 = element4.classNames((java.util.Set<java.lang.String>) strSet11);
        java.lang.String str14 = element13.cssSelector();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        int int17 = element16.childNodeSize();
        boolean boolean19 = element16.hasClass("hi!");
        java.util.regex.Pattern pattern21 = null;
        org.jsoup.select.Elements elements22 = element16.getElementsByAttributeValueMatching("hi!", pattern21);
        java.lang.String str23 = element16.tagName();
        java.lang.String str25 = element16.attr("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element26 = element13.after((org.jsoup.nodes.Node) element16);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        org.jsoup.nodes.Element element8 = element4.append("hi!");
        org.jsoup.nodes.Element element10 = element8.addClass("hi!.hi!.<hi!></hi!>");
        org.jsoup.select.Elements elements12 = element10.getElementsByTag("<hi!>\n <hi!></hi!>\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements14 = element10.select("<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi!></hi!>': unexpected token at '<hi!></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Element element9 = element7.tagName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValue("<hi! class=\"\"></hi!>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        boolean boolean4 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element5 = element1.previousElementSibling();
        java.lang.String str6 = element1.cssSelector();
        boolean boolean8 = element1.hasAttr("<hi!>\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        java.lang.String str4 = element1.className();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList5 = element1.dataNodes();
        org.jsoup.nodes.Element element8 = element1.attr("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element10 = element1.appendElement("hi!");
        org.jsoup.nodes.Node node11 = element10.unwrap();
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.traverse(nodeVisitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(dataNodeList5);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        java.lang.Integer int7 = element4.elementSiblingIndex();
        org.jsoup.select.NodeVisitor nodeVisitor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = element4.traverse(nodeVisitor8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document27 = node26.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        java.lang.String str7 = element4.tagName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = element4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        org.jsoup.nodes.Element element8 = element4.append("hi!");
        org.jsoup.nodes.Node node9 = element4.parentNode();
        org.jsoup.nodes.Element element10 = element4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = element4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(element10);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Element element9 = element7.tagName("hi!");
        org.jsoup.select.Elements elements11 = element7.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element13 = element7.addClass("<hi!></hi!>");
        org.jsoup.select.Elements elements15 = element7.getElementsMatchingText("hi!");
        org.jsoup.nodes.Document document16 = element7.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements19 = document16.getElementsByAttributeValueMatching("<hi!></hi!>", "<hi! class=\"\">\n</hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNull(document16);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        org.jsoup.nodes.Element element8 = element4.html("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = element8.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = element9.parentNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = element1.childNode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
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
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        java.lang.String str3 = element1.nodeName();
        java.lang.String str4 = element1.text();
        int int5 = element1.childNodeSize();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            element1.outerHtmlHead(appendable6, (int) (byte) 0, outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = element16.attr("");
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
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
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
        org.jsoup.select.Elements elements13 = element10.getElementsByIndexGreaterThan((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
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
        org.jsoup.select.Elements elements21 = element1.getElementsMatchingText("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element25 = element23.appendText("");
        int int26 = element25.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList27 = element25.textNodes();
        org.jsoup.select.Elements elements29 = element25.getElementsByIndexGreaterThan((int) (short) 0);
        java.lang.String str30 = element25.outerHtml();
        org.jsoup.nodes.Node node31 = element25.root();
        // The following exception was thrown during execution in test generation
        try {
            element1.replaceWith((org.jsoup.nodes.Node) element25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(textNodeList27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<hi!>\n</hi!>" + "'", str30, "<hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(node31);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.util.regex.Pattern pattern5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = element4.getElementsMatchingText(pattern5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        boolean boolean9 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element4);
        org.jsoup.nodes.Element element10 = element4.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element10.getElementsByIndexLessThan((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(element10);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Attributes attributes8 = element7.attributes();
        org.jsoup.select.Elements elements11 = element7.getElementsByAttributeValue("<hi!></hi!>", "<hi!></hi!>");
        org.jsoup.nodes.Element element12 = element7.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = element12.ownText();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNull(element12);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        java.lang.Integer int7 = element4.elementSiblingIndex();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element9.val("<hi!></hi!>");
        org.jsoup.parser.Tag tag12 = element9.tag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = element4.before((org.jsoup.nodes.Node) element9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("hi!", pattern6);
        boolean boolean9 = element1.hasClass("<hi!></hi!>");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element14 = element12.prepend("hi!");
        org.jsoup.select.Elements elements16 = element12.getElementsByIndexEquals((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element17 = element1.insertChildren((int) (short) 1, (java.util.Collection<org.jsoup.nodes.Element>) elements16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        java.lang.String str4 = element1.className();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList5 = element1.dataNodes();
        org.jsoup.select.Elements elements7 = element1.getElementsByTag("hi!");
        org.jsoup.parser.Tag tag8 = element1.tag();
        java.util.regex.Pattern pattern9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element1.getElementsMatchingOwnText(pattern9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexGreaterThan((int) (short) 0);
        org.jsoup.nodes.Element element9 = element3.toggleClass("");
        org.jsoup.nodes.Document document10 = element3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = document10.parents();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
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
        java.util.List<org.jsoup.nodes.Node> nodeList12 = element7.siblingNodes();
        org.jsoup.nodes.Element element13 = element7.firstElementSibling();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<hi!></hi!>" + "'", str11, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNull(element13);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        org.jsoup.nodes.Element element8 = element4.append("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element8.before("hi!.hi!.<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet9 = element8.classNames();
        org.jsoup.nodes.Element element11 = element8.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element13 = element11.html("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = element11.after("<hi! class=\"\"></hi!>");
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
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        java.lang.String str3 = element1.data();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = element1.after("hi!.hi!.<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            element4.outerHtmlHead(appendable7, (int) 'a', outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element10 = element4.append("<hi!>\n <hi!></hi!>\n</hi!>");
        java.lang.String str11 = element10.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>" + "'", str11, "<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.removeClass("hi!");
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(100);
        java.lang.String str6 = element1.id();
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeStarting("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element12 = element10.appendText("");
        int int13 = element12.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList14 = element12.textNodes();
        java.lang.String str15 = element12.nodeName();
        org.jsoup.nodes.Node node16 = element12.nextSibling();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element20 = element18.appendText("");
        org.jsoup.nodes.Element element22 = element20.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element24 = element20.toggleClass("");
        org.jsoup.nodes.Element element26 = element24.tagName("hi!");
        org.jsoup.select.Elements elements28 = element24.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element33 = element31.appendText("");
        org.jsoup.nodes.Element element35 = element33.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element37 = element33.toggleClass("");
        org.jsoup.nodes.Element element39 = element37.tagName("hi!");
        org.jsoup.select.Elements elements41 = element37.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element42 = element24.insertChildren((int) (byte) -1, (java.util.Collection<org.jsoup.nodes.Element>) elements41);
        org.jsoup.nodes.Element element44 = element42.removeClass("<hi!></hi!>");
        boolean boolean45 = element12.hasSameValue((java.lang.Object) element44);
        // The following exception was thrown during execution in test generation
        try {
            element1.replaceWith((org.jsoup.nodes.Node) element12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(textNodeList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
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
        org.jsoup.nodes.Element element17 = element10.addClass("");
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element21 = element19.appendText("");
        org.jsoup.nodes.Element element23 = element21.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element25 = element21.toggleClass("");
        org.jsoup.nodes.Element element27 = element25.toggleClass("<hi!></hi!>");
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element31 = element29.appendText("");
        int int32 = element31.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList33 = element31.textNodes();
        org.jsoup.nodes.Element element34 = element25.prependChild((org.jsoup.nodes.Node) element31);
        boolean boolean35 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element31);
        org.jsoup.nodes.Node node36 = element31.unwrap();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element37 = element10.before(node36);
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
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(textNodeList33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node36);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        boolean boolean4 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element6 = element1.appendElement("hi!");
        org.jsoup.select.Elements elements7 = element6.parents();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = element4.before("<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("hi!", pattern6);
        org.jsoup.nodes.Element element9 = element1.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element12 = element1.attr("hi!.hi!.<hi!></hi!>", "<hi!></hi!>");
        org.jsoup.nodes.Node node13 = element12.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements15 = element12.select("<hi!>\n <hi!></hi!>\n</hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi!>? <hi!></hi!>?</hi!>': unexpected token at '<hi!>? <hi!></hi!>?</hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
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
        // The following exception was thrown during execution in test generation
        try {
            element11.remove();
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
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.val("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = element1.siblingNodes();
        org.jsoup.select.NodeVisitor nodeVisitor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = element1.traverse(nodeVisitor5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(nodeList4);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        org.jsoup.nodes.Element element6 = element1.append("hi!.hi!.<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element6.before("hi!.<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.val("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = element1.siblingNodes();
        org.jsoup.nodes.Node node5 = element1.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList6 = node5.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
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
        java.util.List<org.jsoup.nodes.Node> nodeList29 = element7.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element32 = element7.attr("", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(nodeList29);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Element element9 = element7.tagName("hi!");
        boolean boolean10 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element9);
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = element3.child((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jsoup.parser.Tag tag0 = null;
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element5 = element3.appendText("");
        boolean boolean6 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element3);
        org.jsoup.nodes.Attributes attributes7 = element3.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element(tag0, "<hi!>\n <hi!></hi!>\n</hi!>", attributes7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = element4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.parser.Tag tag6 = element4.tag();
        org.jsoup.select.Elements elements9 = element4.getElementsByAttributeValueMatching("hi!", "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element10 = element4.empty();
        java.lang.Class<?> wildcardClass11 = element4.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element29 = element8.after("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
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
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element10 = element4.append("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element12 = element10.val("<hi!>\n <hi!></hi!>\n</hi!>");
        java.lang.Class<?> wildcardClass13 = element12.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        java.lang.String str3 = element1.nodeName();
        java.util.Set<java.lang.String> strSet4 = element1.classNames();
        org.jsoup.select.Evaluator evaluator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = element1.is(evaluator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        java.util.Set<java.lang.String> strSet4 = element3.classNames();
        java.lang.Integer int5 = element3.elementSiblingIndex();
        org.jsoup.select.Elements elements7 = element3.getElementsMatchingOwnText("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element9 = element3.prepend("<hi! class=\"<hi!></hi!>\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element9.before("<hi! class=\"\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
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
        org.jsoup.select.Elements elements21 = element1.getElementsMatchingText("hi!.hi!.<hi!></hi!>");
        java.util.regex.Pattern pattern22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements23 = element1.getElementsMatchingOwnText(pattern22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
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
        java.lang.Class<?> wildcardClass14 = element7.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element4.siblingNodes();
        org.jsoup.nodes.Element element8 = element4.prependElement("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.select.Elements elements10 = element8.getElementsContainingOwnText("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = element8.attr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
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
        java.lang.String str16 = element15.nodeName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("hi!", pattern6);
        boolean boolean9 = element1.hasClass("<hi!></hi!>");
        boolean boolean10 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
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
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element25 = element23.appendText("");
        int int26 = element25.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList27 = element25.textNodes();
        java.lang.String str28 = element25.cssSelector();
        org.jsoup.nodes.Element element30 = element25.addClass("<hi! class=\"\">\n</hi!>");
        boolean boolean31 = element21.equals((java.lang.Object) "<hi! class=\"\">\n</hi!>");
        java.lang.Appendable appendable32 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = null;
        // The following exception was thrown during execution in test generation
        try {
            element21.outerHtmlTail(appendable32, (int) (short) 0, outputSettings34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(textNodeList27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element4.getElementsByAttributeValueStarting("", "hi!.hi!.<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet9 = element8.classNames();
        org.jsoup.nodes.Element element11 = element8.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element13 = element11.html("");
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str16 = element15.id();
        java.lang.Integer int17 = element15.elementSiblingIndex();
        org.jsoup.nodes.Element element18 = element15.empty();
        java.lang.String str19 = element18.outerHtml();
        org.jsoup.select.Elements elements22 = element18.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        boolean boolean23 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element18);
        org.jsoup.nodes.Element element24 = element18.previousElementSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = element18.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            element13.replaceWith((org.jsoup.nodes.Node) element18);
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
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<hi!></hi!>" + "'", str19, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(element24);
        org.junit.Assert.assertNotNull(nodeList25);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = element4.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element9.prepend("<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        boolean boolean4 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element5 = element1.previousElementSibling();
        java.lang.String str6 = element1.cssSelector();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = element1.select("<hi!>\n</hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi!>?</hi!>': unexpected token at '<hi!>?</hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList6 = element3.textNodes();
        org.jsoup.nodes.Element element8 = element3.text("");
        org.jsoup.select.Elements elements10 = element3.getElementsByIndexEquals(0);
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element14 = element12.appendText("");
        int int15 = element14.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList16 = element14.textNodes();
        org.jsoup.select.Elements elements18 = element14.getElementsByIndexGreaterThan((int) (short) 0);
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element22 = element20.appendText("");
        int int23 = element22.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList24 = element22.textNodes();
        org.jsoup.select.Elements elements26 = element22.getElementsByIndexGreaterThan((int) (short) 0);
        org.jsoup.nodes.Element element28 = element22.toggleClass("");
        boolean boolean29 = element14.hasSameValue((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element30 = element3.before((org.jsoup.nodes.Node) element14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(textNodeList6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(textNodeList16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(textNodeList24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("hi!", pattern6);
        org.jsoup.nodes.Element element9 = element1.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element12 = element1.attr("hi!.hi!.<hi!></hi!>", "<hi!></hi!>");
        org.jsoup.select.Elements elements15 = element1.getElementsByAttributeValueStarting("hi!", "hi!.hi!.<hi!></hi!>");
        java.util.Set<java.lang.String> strSet16 = element1.classNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = element1.attr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Attributes attributes6 = element3.attributes();
        org.jsoup.nodes.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element3.prependChild(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
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
        org.jsoup.nodes.Element element40 = element37.lastElementSibling();
        org.jsoup.select.Evaluator evaluator41 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean42 = element40.is(evaluator41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(element40);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element10 = element4.addClass("");
        org.jsoup.select.Elements elements12 = element4.getElementsByTag("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element14 = element4.text("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements17 = element14.getElementsByAttributeValue("<hi! class=\"<hi!></hi!>\"></hi!>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.removeClass("hi!");
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(100);
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            element1.outerHtmlHead(appendable6, (int) (byte) 100, outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
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
        org.jsoup.select.Elements elements29 = element7.getElementsByAttributeValueMatching("hi!.hi!.<hi!></hi!>", "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str32 = element31.id();
        java.lang.Integer int33 = element31.elementSiblingIndex();
        org.jsoup.nodes.Element element34 = element31.empty();
        java.lang.String str35 = element31.nodeName();
        org.jsoup.nodes.Element element37 = element31.appendText("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element39 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str40 = element39.id();
        java.lang.Integer int41 = element39.elementSiblingIndex();
        org.jsoup.nodes.Element element42 = element39.empty();
        java.lang.String str43 = element42.outerHtml();
        org.jsoup.select.Elements elements46 = element42.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element48 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element50 = element48.appendText("");
        java.util.Set<java.lang.String> strSet51 = element50.classNames();
        org.jsoup.nodes.Element element52 = element42.classNames(strSet51);
        org.jsoup.nodes.Element element53 = element31.classNames(strSet51);
        java.lang.String str54 = element31.cssSelector();
        // The following exception was thrown during execution in test generation
        try {
            element7.replaceWith((org.jsoup.nodes.Node) element31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<hi!></hi!>" + "'", str43, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element41 = element1.child((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
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
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        java.lang.String str4 = element1.className();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList5 = element1.dataNodes();
        org.jsoup.select.Elements elements7 = element1.getElementsByTag("hi!");
        org.jsoup.parser.Tag tag8 = element1.tag();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element11.appendText("");
        org.jsoup.nodes.Element element15 = element13.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element17 = element13.toggleClass("");
        org.jsoup.nodes.Attributes attributes18 = element17.attributes();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element(tag8, "", attributes18);
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str23 = element22.id();
        java.lang.Integer int24 = element22.elementSiblingIndex();
        org.jsoup.nodes.Element element25 = element22.empty();
        java.lang.String str26 = element25.outerHtml();
        org.jsoup.parser.Tag tag27 = element25.tag();
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element(tag27, "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element(tag27, "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str35 = element34.id();
        org.jsoup.nodes.Element element37 = element34.removeClass("");
        java.lang.String str39 = element37.absUrl("hi!");
        org.jsoup.nodes.Element element41 = element37.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet42 = element41.classNames();
        org.jsoup.nodes.Element element44 = element41.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Attributes attributes45 = element44.attributes();
        org.jsoup.nodes.Element element46 = new org.jsoup.nodes.Element(tag27, "<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>", attributes45);
        org.jsoup.nodes.Element element47 = new org.jsoup.nodes.Element(tag8, "<hi!>\n <hi!></hi!>\n</hi!>", attributes45);
        org.jsoup.select.Elements elements48 = element47.siblingElements();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(dataNodeList5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<hi!></hi!>" + "'", str26, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertNotNull(elements48);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
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
        org.jsoup.select.Evaluator evaluator31 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = element30.is(evaluator31);
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
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList6 = element3.textNodes();
        org.jsoup.nodes.Element element8 = element3.text("");
        org.jsoup.select.Elements elements10 = element3.getElementsByIndexEquals(0);
        org.jsoup.nodes.Node node11 = element3.nextSibling();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(textNodeList6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet9 = element8.classNames();
        org.jsoup.nodes.Element element11 = element8.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element13 = element11.html("");
        org.jsoup.nodes.Element element15 = element11.removeClass("<hi!>\n</hi!>");
        org.jsoup.select.Evaluator evaluator16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = element15.is(evaluator16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        java.lang.String str6 = element3.data();
        java.util.Set<java.lang.String> strSet7 = element3.classNames();
        org.jsoup.nodes.Element element9 = element3.prepend("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        int int12 = element11.childNodeSize();
        boolean boolean14 = element11.hasClass("hi!");
        java.util.regex.Pattern pattern16 = null;
        org.jsoup.select.Elements elements17 = element11.getElementsByAttributeValueMatching("hi!", pattern16);
        boolean boolean19 = element11.hasClass("<hi!></hi!>");
        int int20 = element11.siblingIndex();
        org.jsoup.select.Elements elements21 = element11.siblingElements();
        // The following exception was thrown during execution in test generation
        try {
            element9.replaceWith((org.jsoup.nodes.Node) element11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
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
        java.lang.Appendable appendable28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = null;
        // The following exception was thrown during execution in test generation
        try {
            element25.outerHtmlHead(appendable28, (int) ' ', outputSettings30);
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
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        org.jsoup.nodes.Node node5 = element1.parentNode();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element1.dataset();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = element1.is("");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '': unexpected token at ''");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        boolean boolean4 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element6 = element1.appendElement("hi!");
        boolean boolean7 = element6.isBlock();
        java.lang.String str8 = element6.baseUri();
        org.jsoup.nodes.Node node9 = element6.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node9.childNodesCopy();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
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
        org.jsoup.nodes.Element element13 = element7.addClass("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements16 = element13.getElementsByAttributeValueEnding("<hi!>\n <hi!></hi!>\n</hi!>", "");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<hi!></hi!>" + "'", str11, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        java.lang.String str6 = element3.data();
        org.jsoup.nodes.Element element8 = element3.html("<hi!></hi!>");
        org.jsoup.nodes.Document document9 = element3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList10 = document9.childNodesCopy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        java.lang.String str3 = element1.nodeName();
        java.lang.String str4 = element1.text();
        int int5 = element1.childNodeSize();
        org.jsoup.nodes.Element element6 = element1.nextElementSibling();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.className();
        org.jsoup.nodes.Element element4 = element1.prependElement("<hi!>\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = element1.appendElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.val("<hi!></hi!>");
        org.jsoup.parser.Tag tag4 = element1.tag();
        org.jsoup.nodes.Element element7 = element1.attr("<hi!></hi!>", "<hi!></hi!>");
        java.lang.Object obj8 = null;
        boolean boolean9 = element7.equals(obj8);
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        int int12 = element11.childNodeSize();
        boolean boolean14 = element11.hasClass("hi!");
        java.util.regex.Pattern pattern16 = null;
        org.jsoup.select.Elements elements17 = element11.getElementsByAttributeValueMatching("hi!", pattern16);
        org.jsoup.nodes.Element element19 = element11.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element22 = element11.attr("hi!.hi!.<hi!></hi!>", "<hi!></hi!>");
        org.jsoup.select.Elements elements25 = element11.getElementsByAttributeValueStarting("hi!", "hi!.hi!.<hi!></hi!>");
        java.util.Set<java.lang.String> strSet26 = element11.classNames();
        org.jsoup.select.Elements elements27 = element11.getAllElements();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element28 = element7.before((org.jsoup.nodes.Node) element11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(elements27);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        java.lang.String str4 = element1.className();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList5 = element1.dataNodes();
        org.jsoup.nodes.Element element8 = element1.attr("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element10 = element1.appendElement("hi!");
        org.jsoup.nodes.Node node11 = element10.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements14 = element10.getElementsByAttributeValueEnding("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(dataNodeList5);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
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
        // The following exception was thrown during execution in test generation
        try {
            element15.remove();
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
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.parser.Tag tag6 = element4.tag();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element(tag6, "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag6, "hi!");
        org.jsoup.nodes.Element element11 = element10.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = element11.data();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNull(element11);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        org.jsoup.nodes.Element element8 = element4.append("hi!");
        org.jsoup.nodes.Attributes attributes9 = element4.attributes();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element11.appendText("");
        org.jsoup.nodes.Element element15 = element13.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element17 = element13.toggleClass("");
        org.jsoup.nodes.Element element19 = element17.toggleClass("<hi!></hi!>");
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element23 = element21.appendText("");
        int int24 = element23.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList25 = element23.textNodes();
        org.jsoup.nodes.Element element26 = element17.prependChild((org.jsoup.nodes.Node) element23);
        boolean boolean27 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element23);
        org.jsoup.select.Elements elements29 = element23.getElementsMatchingOwnText("<hi!>\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element30 = element4.after((org.jsoup.nodes.Node) element23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(textNodeList25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.parser.Tag tag6 = element4.tag();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element(tag6, "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag6, "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str15 = element14.id();
        java.lang.Integer int16 = element14.elementSiblingIndex();
        org.jsoup.nodes.Element element17 = element14.empty();
        java.lang.String str18 = element14.nodeName();
        org.jsoup.nodes.Element element20 = element14.appendText("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str23 = element22.id();
        java.lang.Integer int24 = element22.elementSiblingIndex();
        org.jsoup.nodes.Element element25 = element22.empty();
        java.lang.String str26 = element25.outerHtml();
        org.jsoup.select.Elements elements29 = element25.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element33 = element31.appendText("");
        java.util.Set<java.lang.String> strSet34 = element33.classNames();
        org.jsoup.nodes.Element element35 = element25.classNames(strSet34);
        org.jsoup.nodes.Element element36 = element14.classNames(strSet34);
        org.jsoup.select.Elements elements39 = element36.getElementsByAttributeValueNot("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>", "hi!.hi!.<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element40 = element10.insertChildren((int) (byte) 1, (java.util.Collection<org.jsoup.nodes.Element>) elements39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<hi!></hi!>" + "'", str26, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(elements39);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        org.jsoup.nodes.Element element6 = element1.toggleClass("<hi!></hi!>");
        org.jsoup.select.Elements elements8 = element1.getElementsContainingOwnText("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element1.getElementById("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("hi!", pattern6);
        org.jsoup.nodes.Element element9 = element1.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element12 = element1.attr("hi!.hi!.<hi!></hi!>", "<hi!></hi!>");
        java.lang.String str13 = element1.data();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements15 = element1.getElementsByClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Attributes attributes8 = element7.attributes();
        org.jsoup.nodes.Node node9 = element7.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element7.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = element7.after("<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("hi!", pattern6);
        boolean boolean9 = element1.hasClass("<hi!></hi!>");
        org.jsoup.select.Elements elements11 = element1.getElementsByAttribute("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        org.jsoup.select.Elements elements13 = element1.getElementsByClass("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element17 = element15.appendText("");
        org.jsoup.nodes.Element element19 = element17.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element21 = element17.toggleClass("");
        org.jsoup.nodes.Attributes attributes22 = element21.attributes();
        org.jsoup.nodes.Node node23 = element21.parentNode();
        org.jsoup.select.Elements elements24 = element21.children();
        org.jsoup.nodes.Element element26 = element21.prependElement("<hi! class=\"\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element27 = element1.after((org.jsoup.nodes.Node) element21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element26);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements21 = element14.getElementsByClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexGreaterThan((int) (short) 0);
        org.jsoup.nodes.Element element9 = element3.toggleClass("");
        org.jsoup.nodes.Element element11 = element3.appendText("");
        org.jsoup.nodes.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            element11.replaceWith(node12);
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
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        org.jsoup.nodes.Node node6 = element3.parentNode();
        org.jsoup.nodes.Element element8 = element3.text("");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            element8.outerHtmlTail(appendable9, (int) (short) 100, outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNodeList5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("hi!", pattern6);
        org.jsoup.nodes.Element element9 = element1.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element12 = element1.attr("hi!.hi!.<hi!></hi!>", "<hi!></hi!>");
        org.jsoup.nodes.Node node13 = element12.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = node13.attr("hi!.hi!.<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element10 = element4.addClass("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element10.siblingNodes();
        java.util.regex.Pattern pattern12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = element10.getElementsMatchingText(pattern12);
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
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element41 = element1.after("<hi! class=\"<hi!></hi!>\"></hi!>");
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
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
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
        org.jsoup.nodes.Document document17 = element1.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int18 = document17.elementSiblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(document17);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((-1));
        org.jsoup.nodes.Element element4 = element1.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = element4.append("<hi! class=\"\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(element4);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsMatchingText("");
        java.lang.String str9 = element4.toString();
        org.jsoup.nodes.Attributes attributes10 = element4.attributes();
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = element4.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<hi! class=\"\"></hi!>" + "'", str9, "<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Element element9 = element7.tagName("hi!");
        org.jsoup.select.Elements elements11 = element7.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element13 = element7.addClass("<hi!></hi!>");
        org.jsoup.nodes.Element element15 = element7.addClass("<hi!></hi!>");
        java.lang.String str16 = element15.val();
        org.jsoup.nodes.Node node17 = element15.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = element15.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
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
        org.jsoup.nodes.Element element19 = element3.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element21 = element19.removeClass("<hi!>\n</hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(element19);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node47 = element1.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        org.jsoup.nodes.Node node5 = element1.parentNode();
        org.jsoup.nodes.Element element7 = element1.html("hi!.hi!.<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = element1.select("<<hi!>\n</hi!>></<hi!>\n</hi!>>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<<hi!>?</hi!>></<hi!>?</hi!>>': unexpected token at '<<hi!>?</hi!>></<hi!>?</hi!>>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.removeClass("hi!");
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(100);
        java.lang.String str6 = element1.id();
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeStarting("hi!.hi!.<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element1.siblingNodes();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.className();
        org.jsoup.select.Elements elements4 = element1.getElementsMatchingOwnText("hi!");
        int int5 = element1.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueNot("<hi!>\n</hi!>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexLessThan((int) (byte) 0);
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element7.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = element7.getElementsByAttributeValueStarting("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        org.jsoup.nodes.Element element8 = element4.append("hi!");
        int int9 = element8.siblingIndex();
        org.jsoup.select.Elements elements10 = element8.siblingElements();
        org.jsoup.nodes.Element element12 = element8.val("hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str15 = element14.id();
        org.jsoup.nodes.Element element17 = element14.removeClass("");
        java.lang.String str19 = element17.absUrl("hi!");
        java.lang.String str20 = element17.cssSelector();
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        int int24 = element23.childNodeSize();
        boolean boolean26 = element23.hasClass("hi!");
        java.util.regex.Pattern pattern28 = null;
        org.jsoup.select.Elements elements29 = element23.getElementsByAttributeValueMatching("hi!", pattern28);
        org.jsoup.nodes.Element element31 = element23.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element34 = element23.attr("hi!.hi!.<hi!></hi!>", "<hi!></hi!>");
        org.jsoup.select.Elements elements37 = element23.getElementsByAttributeValueStarting("hi!", "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element38 = element17.insertChildren((int) (short) 0, (java.util.Collection<org.jsoup.nodes.Element>) elements37);
        org.jsoup.nodes.Element element40 = element17.prependText("<hi!>\n</hi!>");
        org.jsoup.select.Elements elements42 = element40.getElementsMatchingText("<hi!></hi!>");
        boolean boolean43 = element8.hasSameValue((java.lang.Object) element40);
        boolean boolean45 = element40.hasAttr("<hi! class=\"\">\n</hi!>");
        java.lang.Appendable appendable46 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = null;
        // The following exception was thrown during execution in test generation
        try {
            element40.outerHtmlHead(appendable46, (int) (byte) 1, outputSettings48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
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
        org.jsoup.select.Elements elements46 = element7.getElementsByAttributeStarting("hi!.hi!.<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node47 = element7.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(elements46);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Element element9 = element3.appendElement("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = element3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.val("<hi!></hi!>");
        java.lang.String str4 = element3.html();
        element3.setBaseUri("hi!.<hi!></hi!>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.select.Elements elements7 = element5.getElementsContainingText("<hi! class=\"\"></hi!>");
        org.jsoup.select.Elements elements8 = element5.children();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element5.childNodes();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexGreaterThan((int) (short) 0);
        java.lang.String str8 = element3.outerHtml();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str11 = element10.id();
        java.lang.Integer int12 = element10.elementSiblingIndex();
        org.jsoup.nodes.Element element13 = element10.empty();
        java.lang.String str14 = element13.outerHtml();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        int int17 = element16.childNodeSize();
        java.lang.String str18 = element16.nodeName();
        org.jsoup.nodes.Element element19 = element13.appendChild((org.jsoup.nodes.Node) element16);
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element23 = element21.appendText("");
        org.jsoup.nodes.Element element24 = element19.appendChild((org.jsoup.nodes.Node) element21);
        boolean boolean25 = element3.hasSameValue((java.lang.Object) element21);
        org.jsoup.select.Elements elements27 = element21.getElementsByClass("<hi! class=\"\">\n</hi!>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNodeList5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<hi!>\n</hi!>" + "'", str8, "<hi!>\n</hi!>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<hi!></hi!>" + "'", str14, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(elements27);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
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
        org.jsoup.nodes.Node node27 = element20.unwrap();
        node27.remove();
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
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
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
        java.lang.Appendable appendable31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = null;
        // The following exception was thrown during execution in test generation
        try {
            element30.outerHtmlHead(appendable31, (int) 'a', outputSettings33);
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
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList6 = element3.textNodes();
        org.jsoup.nodes.Element element8 = element3.text("");
        org.jsoup.select.Elements elements9 = element3.children();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(textNodeList6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
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
        java.util.regex.Pattern pattern21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements22 = element10.getElementsMatchingText(pattern21);
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
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(textNodeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element30 = element10.after("<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
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
        org.jsoup.select.Evaluator evaluator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = element10.is(evaluator13);
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
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        org.jsoup.nodes.Element element8 = element4.append("hi!");
        org.jsoup.nodes.Element element10 = element8.addClass("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        int int13 = element12.childNodeSize();
        boolean boolean15 = element12.hasClass("hi!");
        java.util.regex.Pattern pattern17 = null;
        org.jsoup.select.Elements elements18 = element12.getElementsByAttributeValueMatching("hi!", pattern17);
        org.jsoup.nodes.Element element20 = element12.appendText("<hi!></hi!>");
        boolean boolean21 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element22 = element10.after((org.jsoup.nodes.Node) element12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
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
        org.jsoup.nodes.Attributes attributes36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element37 = new org.jsoup.nodes.Element(tag6, "<hi!></hi!>", attributes36);
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
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        java.lang.String str7 = element4.tagName();
        org.jsoup.select.Elements elements9 = element4.getElementsByIndexEquals((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = element4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.select.Elements elements7 = element5.getElementsByClass("hi!");
        java.lang.String str8 = element5.val();
        boolean boolean10 = element5.hasClass("hi!");
        java.util.regex.Pattern pattern11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element5.getElementsMatchingOwnText(pattern11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
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
        org.jsoup.nodes.Element element24 = element20.toggleClass("");
        org.jsoup.nodes.Attributes attributes25 = element24.attributes();
        org.jsoup.nodes.Node node26 = element24.parentNode();
        org.jsoup.select.Elements elements27 = element24.children();
        org.jsoup.nodes.Element element29 = element24.prependElement("<hi! class=\"\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            element15.replaceWith((org.jsoup.nodes.Node) element29);
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
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element29);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element1.nodeName();
        org.jsoup.nodes.Element element6 = element1.empty();
        org.jsoup.parser.Tag tag7 = element1.tag();
        // The following exception was thrown during execution in test generation
        try {
            element1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Element element9 = element7.tagName("hi!");
        boolean boolean10 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element9);
        boolean boolean11 = element9.isBlock();
        java.util.regex.Pattern pattern13 = null;
        org.jsoup.select.Elements elements14 = element9.getElementsByAttributeValueMatching("hi!.hi!.<hi!></hi!>", pattern13);
        org.jsoup.nodes.Element element15 = element9.nextElementSibling();
        java.lang.String str16 = element9.baseUri();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = element14.absUrl("");
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
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        java.util.Set<java.lang.String> strSet4 = element3.classNames();
        int int5 = element3.siblingIndex();
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
        org.jsoup.select.Elements elements20 = element17.getAllElements();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element21 = element3.insertChildren((int) (short) 100, (java.util.Collection<org.jsoup.nodes.Element>) elements20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<hi!></hi!>" + "'", str12, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Node node6 = element3.parentNode();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str9 = element8.id();
        java.lang.Integer int10 = element8.elementSiblingIndex();
        org.jsoup.nodes.Element element11 = element8.empty();
        java.lang.String str12 = element11.outerHtml();
        org.jsoup.select.Elements elements15 = element11.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element19 = element17.appendText("");
        java.util.Set<java.lang.String> strSet20 = element19.classNames();
        org.jsoup.nodes.Element element21 = element11.classNames(strSet20);
        org.jsoup.nodes.Element element22 = element3.classNames(strSet20);
        java.lang.String str23 = element3.text();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<hi!></hi!>" + "'", str12, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = element1.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = element1.is("hi!.<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'hi!.<hi!></hi!>': unexpected token at '!.<hi!></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(nodeList5);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.parser.Tag tag6 = element4.tag();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element8.appendText("");
        boolean boolean11 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element8);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = element4.after((org.jsoup.nodes.Node) element8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = element15.unwrap();
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
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        java.util.Set<java.lang.String> strSet4 = element3.classNames();
        java.lang.Integer int5 = element3.elementSiblingIndex();
        org.jsoup.select.Elements elements7 = element3.getElementsMatchingOwnText("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element9 = element3.prepend("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Document document10 = element3.ownerDocument();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element45 = element41.before("<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
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
        org.jsoup.select.Elements elements25 = element21.getElementsByIndexEquals(0);
        org.jsoup.nodes.Node node26 = element21.parentNode();
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
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNull(node26);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("hi!", pattern6);
        org.jsoup.nodes.Element element9 = element1.appendText("<hi!></hi!>");
        org.jsoup.nodes.Document document10 = element1.ownerDocument();
        org.jsoup.nodes.Element element11 = element1.empty();
        java.lang.String str13 = element1.attr("hi!");
        org.jsoup.select.NodeVisitor nodeVisitor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = element1.traverse(nodeVisitor14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.Class<?> wildcardClass5 = element4.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.parser.Tag tag6 = element4.tag();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element(tag6, "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag6, "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element11 = element10.empty();
        boolean boolean13 = element10.hasClass("");
        org.jsoup.nodes.Document document14 = element10.ownerDocument();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
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
        org.jsoup.select.Elements elements21 = element1.getElementsMatchingText("hi!.hi!.<hi!></hi!>");
        java.lang.String str22 = element1.outerHtml();
        org.jsoup.nodes.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            element1.replaceWith(node23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<hi!></hi!>" + "'", str22, "<hi!></hi!>");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        org.jsoup.nodes.Element element8 = element4.append("hi!");
        org.jsoup.nodes.Node node9 = element4.parentNode();
        org.jsoup.nodes.Element element10 = element4.parent();
        java.util.regex.Pattern pattern11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element10.getElementsMatchingText(pattern11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(element10);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements46 = element27.select("<hi! class=\"\"></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! class=\"\"></hi!>': unexpected token at '<hi! class=\"\"></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
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
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "<hi!></hi!>", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        org.jsoup.nodes.Element element13 = element4.classNames((java.util.Set<java.lang.String>) strSet11);
        org.jsoup.nodes.Element element15 = element4.html("");
        org.jsoup.select.Elements elements17 = element4.getElementsByIndexEquals((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "<hi!></hi!>", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element1.nodeName();
        org.jsoup.nodes.Element element7 = element1.appendText("<hi! class=\"\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = element1.before("<hi! class=\"<hi!></hi!>\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
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
        java.lang.String str22 = element15.ownText();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexGreaterThan((int) (short) 0);
        org.jsoup.nodes.Element element9 = element3.toggleClass("");
        org.jsoup.nodes.Document document10 = element3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet11 = document10.classNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
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
        java.lang.String str22 = element16.absUrl("<hi! class=\"\"></hi!>");
        org.jsoup.select.Elements elements23 = element16.children();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements25 = element16.select("<hi! class=\"<hi!></hi!>\"></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! class=\"<hi!></hi!>\"></hi!>': unexpected token at '<hi! class=\"<hi!></hi!>\"></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element25 = element23.appendElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
        org.junit.Assert.assertNotNull(dataNodeList14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        java.lang.String str3 = element1.nodeName();
        java.lang.String str4 = element1.text();
        org.jsoup.nodes.Element element6 = element1.prepend("hi!.hi!.<hi!></hi!>");
        java.lang.String str7 = element1.html();
        org.jsoup.nodes.Element element9 = element1.addClass("");
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element11.appendText("");
        int int14 = element13.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList15 = element13.textNodes();
        org.jsoup.select.Elements elements17 = element13.getElementsByIndexGreaterThan((int) (short) 0);
        org.jsoup.nodes.Element element19 = element13.toggleClass("");
        org.jsoup.nodes.Element element21 = element13.appendText("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element22 = element1.before((org.jsoup.nodes.Node) element13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.\n<hi!></hi!>" + "'", str7, "hi!.hi!.\n<hi!></hi!>");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(textNodeList15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
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
        java.lang.String str21 = element17.outerHtml();
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
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("hi!", pattern6);
        org.jsoup.nodes.Element element9 = element1.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element11 = element9.getElementById("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element12 = element9.parent();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNull(element12);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
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
        boolean boolean14 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element4);
        org.jsoup.select.Elements elements16 = element4.getElementsContainingOwnText("<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        org.jsoup.nodes.Element element8 = element4.html("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = element8.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element8.after("hi!.hi!.\n<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.className();
        org.jsoup.nodes.Element element4 = element1.html("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = element4.is("<hi! class=\"\"></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! class=\"\"></hi!>': unexpected token at '<hi! class=\"\"></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Attributes attributes8 = element7.attributes();
        org.jsoup.nodes.Node node9 = element7.parentNode();
        java.util.Set<java.lang.String> strSet10 = element7.classNames();
        org.jsoup.select.Elements elements11 = element7.getAllElements();
        org.jsoup.select.Elements elements13 = element7.getElementsByClass("<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
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
        org.jsoup.select.Elements elements44 = element27.siblingElements();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList45 = element27.dataNodes();
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
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(dataNodeList45);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        java.lang.String str9 = element3.attr("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            element3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexGreaterThan((int) (short) 0);
        org.jsoup.nodes.Element element9 = element3.toggleClass("");
        org.jsoup.nodes.Document document10 = element3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = document10.removeClass("hi!.hi!.<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
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
        org.jsoup.nodes.Element element23 = element21.previousElementSibling();
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
        org.junit.Assert.assertNull(element23);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        org.jsoup.nodes.Element element8 = element4.append("hi!");
        int int9 = element8.siblingIndex();
        org.jsoup.select.Elements elements10 = element8.siblingElements();
        org.jsoup.nodes.Element element12 = element8.val("hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str15 = element14.id();
        org.jsoup.nodes.Element element17 = element14.removeClass("");
        java.lang.String str19 = element17.absUrl("hi!");
        java.lang.String str20 = element17.cssSelector();
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        int int24 = element23.childNodeSize();
        boolean boolean26 = element23.hasClass("hi!");
        java.util.regex.Pattern pattern28 = null;
        org.jsoup.select.Elements elements29 = element23.getElementsByAttributeValueMatching("hi!", pattern28);
        org.jsoup.nodes.Element element31 = element23.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element34 = element23.attr("hi!.hi!.<hi!></hi!>", "<hi!></hi!>");
        org.jsoup.select.Elements elements37 = element23.getElementsByAttributeValueStarting("hi!", "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element38 = element17.insertChildren((int) (short) 0, (java.util.Collection<org.jsoup.nodes.Element>) elements37);
        org.jsoup.nodes.Element element40 = element17.prependText("<hi!>\n</hi!>");
        org.jsoup.select.Elements elements42 = element40.getElementsMatchingText("<hi!></hi!>");
        boolean boolean43 = element8.hasSameValue((java.lang.Object) element40);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element45 = element40.tagName("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Tag name must not be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        java.util.Set<java.lang.String> strSet4 = element3.classNames();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element8 = element6.appendText("");
        org.jsoup.nodes.Element element10 = element8.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element12 = element8.toggleClass("");
        org.jsoup.nodes.Element element14 = element12.tagName("hi!");
        org.jsoup.select.Elements elements16 = element12.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element18 = element12.addClass("<hi!></hi!>");
        java.lang.String str19 = element12.ownText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element20 = element3.after((org.jsoup.nodes.Node) element12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        org.jsoup.select.Elements elements7 = element4.getElementsByAttributeValueEnding("hi!", "hi!.<hi!.class=\"<hi!></hi!>\"></hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.val("<hi!></hi!>");
        org.jsoup.parser.Tag tag4 = element1.tag();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = element1.is("<hi! class=\"\"></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! class=\"\"></hi!>': unexpected token at '<hi! class=\"\"></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        java.lang.String str6 = element3.nodeName();
        org.jsoup.select.Elements elements8 = element3.getElementsByIndexEquals((int) (byte) 0);
        org.jsoup.nodes.Element element10 = element3.getElementById("hi!.hi!.");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNull(element10);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        org.jsoup.nodes.Element element8 = element4.append("hi!");
        org.jsoup.nodes.Element element10 = element8.addClass("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element12 = element8.prepend("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = element12.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        java.lang.String str3 = element1.nodeName();
        java.lang.String str4 = element1.text();
        org.jsoup.nodes.Element element6 = element1.prepend("hi!.hi!.<hi!></hi!>");
        java.lang.String str7 = element1.html();
        org.jsoup.nodes.Element element9 = element1.addClass("");
        java.lang.String str10 = element9.baseUri();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.\n<hi!></hi!>" + "'", str7, "hi!.hi!.\n<hi!></hi!>");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements24 = element18.getElementsByAttributeValueNot("<<hi!>\n</hi!>></<hi!>\n</hi!>>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
        org.junit.Assert.assertNotNull(dataNodeList14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        org.jsoup.nodes.Element element6 = element1.append("hi!.hi!.<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element6.siblingNodes();
        element6.setBaseUri("hi!");
        org.jsoup.nodes.Element element11 = element6.appendText("<hi! class=\"\">\n</hi!>");
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
        org.jsoup.nodes.Element element39 = element37.removeClass("<hi!></hi!>");
        java.lang.String str40 = element39.data();
        // The following exception was thrown during execution in test generation
        try {
            element11.replaceWith((org.jsoup.nodes.Node) element39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(nodeList7);
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
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
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
        org.jsoup.select.Elements elements20 = element15.getElementsByAttributeValueContaining("<hi! class=\"<hi!></hi!>\"></hi!>", "hi!.hi!.\n<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element22 = element15.before("hi!.hi!.<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
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
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
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
        java.util.regex.Pattern pattern27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements28 = element4.getElementsMatchingOwnText(pattern27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
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
        java.lang.Appendable appendable35 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = null;
        // The following exception was thrown during execution in test generation
        try {
            element29.outerHtmlHead(appendable35, (int) (short) 0, outputSettings37);
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
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet9 = element8.classNames();
        org.jsoup.nodes.Element element11 = element8.val("hi!.hi!.<hi!></hi!>");
        java.util.regex.Pattern pattern12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = element8.getElementsMatchingOwnText(pattern12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = element26.cssSelector();
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi!': unexpected token at '<hi!'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        boolean boolean4 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList5 = element1.dataNodes();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dataNodeList5);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
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
        org.jsoup.nodes.Element element21 = element10.parent();
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str24 = element23.id();
        java.lang.Integer int25 = element23.elementSiblingIndex();
        org.jsoup.nodes.Element element26 = element23.empty();
        java.lang.String str27 = element26.outerHtml();
        org.jsoup.parser.Tag tag28 = element26.tag();
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element(tag28, "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element(tag28, "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element35 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str36 = element35.id();
        java.lang.Integer int37 = element35.elementSiblingIndex();
        org.jsoup.nodes.Element element38 = element35.empty();
        java.lang.String str39 = element38.outerHtml();
        org.jsoup.parser.Tag tag40 = element38.tag();
        org.jsoup.nodes.Element element43 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str44 = element43.id();
        org.jsoup.nodes.Element element46 = element43.removeClass("");
        java.lang.String str48 = element46.absUrl("hi!");
        org.jsoup.nodes.Element element50 = element46.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet51 = element50.classNames();
        org.jsoup.nodes.Element element53 = element50.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Attributes attributes54 = element53.attributes();
        org.jsoup.nodes.Element element55 = new org.jsoup.nodes.Element(tag40, "<hi! class=\"\"></hi!>", attributes54);
        org.jsoup.nodes.Element element56 = new org.jsoup.nodes.Element(tag28, "<hi!></hi!>", attributes54);
        org.jsoup.nodes.Element element58 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element60 = element58.val("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList61 = element58.siblingNodes();
        org.jsoup.nodes.Element element63 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element65 = element63.appendText("");
        org.jsoup.nodes.Element element67 = element65.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element69 = element65.toggleClass("");
        org.jsoup.nodes.Element element71 = element69.tagName("hi!");
        boolean boolean72 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element71);
        org.jsoup.nodes.Element element73 = element58.appendChild((org.jsoup.nodes.Node) element71);
        java.lang.String str74 = element71.text();
        boolean boolean75 = element56.equals((java.lang.Object) element71);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element76 = element10.before((org.jsoup.nodes.Node) element71);
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
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(textNodeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNull(element21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<hi!></hi!>" + "'", str27, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<hi!></hi!>" + "'", str39, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(attributes54);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertNotNull(nodeList61);
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertNotNull(element69);
        org.junit.Assert.assertNotNull(element71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(element73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str4 = element3.id();
        org.jsoup.nodes.Element element6 = element3.removeClass("");
        java.lang.String str8 = element6.absUrl("hi!");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "<hi!></hi!>", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        org.jsoup.nodes.Element element15 = element6.classNames((java.util.Set<java.lang.String>) strSet13);
        org.jsoup.nodes.Element element16 = element1.classNames((java.util.Set<java.lang.String>) strSet13);
        org.jsoup.select.Elements elements18 = element1.getElementsByIndexLessThan((int) (short) 1);
        java.util.List<org.jsoup.nodes.Node> nodeList19 = element1.childNodesCopy();
        java.util.regex.Pattern pattern20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements21 = element1.getElementsMatchingText(pattern20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "<hi!></hi!>", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(nodeList19);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        java.lang.String str4 = element1.className();
        org.jsoup.nodes.Element element7 = element1.attr("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>", false);
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str10 = element9.id();
        org.jsoup.nodes.Element element12 = element9.removeClass("");
        java.lang.String str14 = element12.absUrl("hi!");
        org.jsoup.nodes.Element element16 = element12.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet17 = element16.classNames();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str22 = element21.id();
        org.jsoup.nodes.Element element24 = element21.removeClass("");
        java.lang.String str26 = element24.absUrl("hi!");
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "<hi!></hi!>", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        org.jsoup.nodes.Element element33 = element24.classNames((java.util.Set<java.lang.String>) strSet31);
        org.jsoup.nodes.Element element34 = element19.classNames((java.util.Set<java.lang.String>) strSet31);
        org.jsoup.nodes.Element element35 = element16.classNames((java.util.Set<java.lang.String>) strSet31);
        // The following exception was thrown during execution in test generation
        try {
            element1.replaceWith((org.jsoup.nodes.Node) element35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "hi!", "<hi!></hi!>", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element35);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.className();
        org.jsoup.nodes.Element element4 = element1.prependElement("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element5 = element4.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByAttributeValue("hi!.hi!.\n<hi!></hi!>", "<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        boolean boolean6 = element4.hasAttr("hi!.hi!.<hi!></hi!>");
        java.lang.String str7 = element4.data();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = element4.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
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
        org.jsoup.nodes.Element element49 = element46.attr("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>", true);
        // The following exception was thrown during execution in test generation
        try {
            element46.remove();
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
        org.junit.Assert.assertNotNull(element49);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        boolean boolean4 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element6 = element1.appendElement("hi!");
        org.jsoup.select.Elements elements9 = element6.getElementsByAttributeValueNot("<hi! class=\"\">\n</hi!>", "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element11 = element6.after("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element14 = element11.attr("<hi! class=\"\">\n</hi!>", true);
        org.jsoup.select.Elements elements16 = element14.getElementsByAttribute("hi!");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        boolean boolean9 = element7.hasAttr("<hi!>\n <hi!></hi!>\n</hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList10 = element7.textNodes();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(textNodeList10);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
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
        org.jsoup.nodes.Node node21 = element20.root();
        org.jsoup.select.Elements elements23 = element20.getElementsMatchingOwnText("hi!.<hi!></hi!>");
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
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element1.nodeName();
        org.jsoup.nodes.Element element6 = element1.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element6.after("<<hi!>\n</hi!>></<hi!>\n</hi!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        java.lang.String str6 = element3.nodeName();
        org.jsoup.nodes.Node node7 = element3.nextSibling();
        org.jsoup.select.Elements elements9 = element3.getElementsMatchingText("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = element3.is("hi!.hi!.\n<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'hi!.hi!.?<hi!></hi!>': unexpected token at '!.hi!.?<hi!></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
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
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element27 = element25.val("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = element25.siblingNodes();
        org.jsoup.select.Elements elements30 = element25.getElementsByClass("<hi!>\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element31 = element9.before((org.jsoup.nodes.Node) element25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNotNull(elements30);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        java.lang.String str6 = element3.nodeName();
        org.jsoup.select.Elements elements8 = element3.getElementsByIndexEquals((int) (byte) 0);
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element3.siblingNodes();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            element3.outerHtmlHead(appendable10, (int) (short) -1, outputSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
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
        org.jsoup.nodes.Element element59 = new org.jsoup.nodes.Element("hi!");
        int int60 = element59.childNodeSize();
        boolean boolean62 = element59.hasClass("hi!");
        org.jsoup.nodes.Node node63 = element59.parentNode();
        java.util.Map<java.lang.String, java.lang.String> strMap64 = element59.dataset();
        org.jsoup.nodes.Attributes attributes65 = element59.attributes();
        org.jsoup.nodes.Element element66 = new org.jsoup.nodes.Element(tag5, "<<hi!>\n</hi!>></<hi!>\n</hi!>>", attributes65);
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
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertNotNull(strMap64);
        org.junit.Assert.assertNotNull(attributes65);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("hi!", pattern6);
        org.jsoup.nodes.Element element9 = element1.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element12 = element1.attr("hi!.hi!.<hi!></hi!>", "<hi!></hi!>");
        org.jsoup.nodes.Node node13 = element12.nextSibling();
        org.jsoup.nodes.Element element15 = element12.removeClass("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element17 = element15.after("hi!.hi!.<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        boolean boolean5 = element1.isBlock();
        java.lang.String str6 = element1.text();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            element1.outerHtmlHead(appendable7, (int) '#', outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        java.lang.String str7 = element4.tagName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = element4.is("<hi! class=\"<hi!></hi!>\"></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! class=\"<hi!></hi!>\"></hi!>': unexpected token at '<hi! class=\"<hi!></hi!>\"></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
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
        org.jsoup.nodes.Element element28 = element7.empty();
        org.jsoup.select.Elements elements31 = element28.getElementsByAttributeValueContaining("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>", "hi!.<hi!></hi!>");
        org.jsoup.select.Elements elements34 = element28.getElementsByAttributeValueStarting("hi!.hi!.<hi!></hi!>", "hi!.hi!.\n<hi!></hi!>");
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
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(elements34);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        java.lang.String str4 = element1.className();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList5 = element1.dataNodes();
        org.jsoup.nodes.Element element8 = element1.attr("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element10 = element1.appendElement("hi!");
        org.jsoup.nodes.Attributes attributes11 = element10.attributes();
        org.jsoup.nodes.Element element12 = element10.clone();
        org.jsoup.nodes.Document document13 = element12.ownerDocument();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(dataNodeList5);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsMatchingText("");
        java.lang.String str9 = element4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element4.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = element4.after("hi!.hi!.\n<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<hi! class=\"\"></hi!>" + "'", str9, "<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Element element9 = element7.tagName("hi!");
        org.jsoup.select.Elements elements11 = element7.getElementsMatchingText("hi!");
        java.util.regex.Pattern pattern12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = element7.getElementsMatchingOwnText(pattern12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        java.lang.String str3 = element1.nodeName();
        element1.setBaseUri("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueStarting("", "<hi!>\n</hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        org.jsoup.nodes.Element element5 = element1.clone();
        int int6 = element1.siblingIndex();
        java.util.regex.Pattern pattern7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = element1.getElementsMatchingOwnText(pattern7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = element4.after("hi!.<hi!.class=\"<hi!></hi!>\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Element element9 = element7.tagName("hi!");
        boolean boolean10 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element9);
        boolean boolean11 = element9.isBlock();
        org.jsoup.nodes.Element element13 = element9.prependText("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element15 = element9.prependElement("<hi!>\n <hi!></hi!>\n</hi!>");
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            element15.outerHtmlTail(appendable16, (int) (short) 10, outputSettings18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet9 = element8.classNames();
        org.jsoup.nodes.Element element11 = element8.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element13 = element11.html("");
        org.jsoup.select.Elements elements14 = element13.parents();
        java.lang.Class<?> wildcardClass15 = elements14.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.parser.Tag tag6 = element4.tag();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element(tag6, "hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag6, "<hi! class=\"\">\n</hi!>");
        org.jsoup.nodes.Element element12 = element10.prependText("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element15 = element10.attr("<hi!>\n hi!\n</hi!>", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        org.jsoup.nodes.Element element4 = element1.val("hi!");
        java.lang.String str5 = element1.html();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
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
        org.jsoup.nodes.Document document17 = element1.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList18 = document17.childNodesCopy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(document17);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
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
        org.jsoup.nodes.Document document24 = element23.ownerDocument();
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
        org.junit.Assert.assertNull(document24);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        org.jsoup.nodes.Element element8 = element4.append("hi!");
        org.jsoup.nodes.Element element10 = element8.addClass("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element12 = element10.prependElement("<hi!></hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = element13.cssSelector();
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'hi!': unexpected token at '!'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.val("<hi!></hi!>");
        org.jsoup.parser.Tag tag4 = element1.tag();
        org.jsoup.nodes.Attributes attributes5 = element1.attributes();
        java.lang.String str6 = element1.data();
        java.lang.String str7 = element1.ownText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element1.getElementsByAttributeValueNot("", "<<hi!>\n</hi!>></<hi!>\n</hi!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = element4.empty();
        org.jsoup.nodes.Element element11 = element4.prepend("<hi!>\n</hi!>");
        org.jsoup.select.Elements elements14 = element11.getElementsByAttributeValueEnding("hi!.hi!.<hi!></hi!>", "<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        int int15 = element11.siblingIndex();
        java.util.regex.Pattern pattern16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements17 = element11.getElementsMatchingOwnText(pattern16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
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
        java.util.regex.Pattern pattern61 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements62 = element1.getElementsMatchingText(pattern61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
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
        org.jsoup.nodes.Element element18 = element13.nextElementSibling();
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
        org.junit.Assert.assertNull(element18);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
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
        org.jsoup.select.Elements elements44 = element27.siblingElements();
        java.util.regex.Pattern pattern45 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements46 = element27.getElementsMatchingText(pattern45);
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
        org.junit.Assert.assertNotNull(elements44);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element9 = element7.appendText("");
        org.jsoup.nodes.Element element11 = element9.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element13 = element9.toggleClass("");
        org.jsoup.nodes.Element element15 = element13.prependElement("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str18 = element17.id();
        java.lang.Integer int19 = element17.elementSiblingIndex();
        org.jsoup.nodes.Element element20 = element17.empty();
        java.lang.String str21 = element20.outerHtml();
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        int int24 = element23.childNodeSize();
        java.lang.String str25 = element23.nodeName();
        org.jsoup.nodes.Element element26 = element20.appendChild((org.jsoup.nodes.Node) element23);
        org.jsoup.nodes.Element element28 = element20.html("<hi!></hi!>");
        org.jsoup.nodes.Element element29 = element20.nextElementSibling();
        org.jsoup.nodes.Element element31 = element20.append("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element32 = element15.appendChild((org.jsoup.nodes.Node) element31);
        org.jsoup.nodes.Element element34 = element15.val("<hi! class=\"\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element35 = element5.before((org.jsoup.nodes.Node) element15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<hi!></hi!>" + "'", str21, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("hi!", pattern6);
        org.jsoup.nodes.Element element9 = element1.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element10 = element1.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet11 = element10.classNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(element10);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        boolean boolean9 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element4);
        org.jsoup.nodes.Element element11 = element4.prependElement("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element12 = element11.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = element12.prependElement("<hi! class=\"<hi!></hi!>\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNull(element12);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
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
        org.jsoup.nodes.Attributes attributes15 = element7.attributes();
        org.jsoup.nodes.Element element16 = element7.nextElementSibling();
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
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNull(element16);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("hi!", pattern6);
        org.jsoup.nodes.Element element9 = element1.appendText("<hi!></hi!>");
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            element9.outerHtmlHead(appendable10, (int) (short) -1, outputSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        boolean boolean4 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element5 = element1.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = element1.before("<hi!>\n</hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(element5);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        org.jsoup.nodes.Element element6 = element4.toggleClass("<hi!></hi!>");
        org.jsoup.select.Elements elements7 = element6.getAllElements();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = element6.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("hi!", pattern6);
        org.jsoup.nodes.Element element8 = element1.empty();
        org.jsoup.select.Elements elements11 = element1.getElementsByAttributeValueNot("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!>\n</hi!>");
        java.util.Set<java.lang.String> strSet12 = element1.classNames();
        org.jsoup.nodes.Element element14 = element1.removeClass("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element15 = element14.previousElementSibling();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNull(element15);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.className();
        org.jsoup.nodes.Element element4 = element1.html("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsContainingText("<hi!></hi!>");
        org.jsoup.nodes.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element4.before(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.val("<hi!></hi!>");
        org.jsoup.parser.Tag tag4 = element1.tag();
        org.jsoup.nodes.Attributes attributes5 = element1.attributes();
        java.lang.String str6 = element1.data();
        java.util.Set<java.lang.String> strSet7 = element1.classNames();
        org.jsoup.select.Elements elements10 = element1.getElementsByAttributeValueContaining("hi!", "<hi!>\n hi!\n</hi!>");
        boolean boolean12 = element1.hasClass("hi!.<hi!.class=\"<hi!></hi!>\"></hi!>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        java.lang.String str3 = element1.nodeName();
        element1.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = element1.toggleClass("hi!.hi!.<hi!></hi!>");
        java.lang.String str8 = element1.html();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        java.lang.String str7 = element4.tagName();
        boolean boolean9 = element4.hasClass("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Node node10 = element4.previousSibling();
        org.jsoup.select.Evaluator evaluator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = element4.is(evaluator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        java.util.Set<java.lang.String> strSet4 = element3.classNames();
        java.lang.Integer int5 = element3.elementSiblingIndex();
        org.jsoup.nodes.Element element8 = element3.attr("<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>", false);
        java.util.Set<java.lang.String> strSet9 = element3.classNames();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element3.getElementsByAttributeValue("", "<hi!>\n</hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        java.lang.String str4 = element1.className();
        org.jsoup.nodes.Element element7 = element1.attr("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>", false);
        org.jsoup.select.Elements elements9 = element7.getElementsContainingText("");
        org.jsoup.select.NodeVisitor nodeVisitor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = element7.traverse(nodeVisitor10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("hi!", pattern6);
        org.jsoup.nodes.Element element8 = element1.empty();
        org.jsoup.select.Elements elements11 = element1.getElementsByAttributeValueNot("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!>\n</hi!>");
        java.util.Set<java.lang.String> strSet12 = element1.classNames();
        org.jsoup.nodes.Element element14 = element1.removeClass("<hi!>\n hi!\n</hi!>");
        int int15 = element1.siblingIndex();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str19 = element18.id();
        java.lang.Integer int20 = element18.elementSiblingIndex();
        org.jsoup.nodes.Element element21 = element18.empty();
        java.lang.String str22 = element21.outerHtml();
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        int int25 = element24.childNodeSize();
        java.lang.String str26 = element24.nodeName();
        org.jsoup.nodes.Element element27 = element21.appendChild((org.jsoup.nodes.Node) element24);
        org.jsoup.nodes.Element element29 = element24.addClass("hi!.hi!.<hi!></hi!>");
        org.jsoup.select.Elements elements31 = element24.getElementsContainingOwnText("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element32 = element1.insertChildren(0, (java.util.Collection<org.jsoup.nodes.Element>) elements31);
        org.jsoup.nodes.Element element34 = element32.tagName("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<hi!></hi!>" + "'", str22, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        boolean boolean9 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element4);
        org.jsoup.nodes.Element element11 = element4.prependElement("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element12 = element11.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.DataNode> dataNodeList13 = element12.dataNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNull(element12);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        org.jsoup.select.Elements elements6 = element4.getElementsContainingOwnText("<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>");
        java.lang.String str7 = element4.data();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element10 = element4.addClass("");
        java.lang.String str11 = element10.toString();
        org.jsoup.nodes.Element element13 = element10.val("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = element13.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<hi! class=\"\"></hi!>" + "'", str11, "<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
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
        org.jsoup.select.Elements elements54 = element8.getElementsByAttributeValueStarting("hi!.<hi!.class=\"<hi!></hi!>\"></hi!>", "hi!.hi!.");
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
        org.junit.Assert.assertNotNull(elements54);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Attributes attributes8 = element7.attributes();
        org.jsoup.nodes.Node node9 = element7.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element7.childNodesCopy();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("<hi!>\n <hi!></hi!>\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            element7.replaceWith((org.jsoup.nodes.Node) element12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element1.id();
        org.jsoup.nodes.Element element6 = element1.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element1.after("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet9 = element8.classNames();
        org.jsoup.nodes.Element element11 = element8.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.select.Elements elements13 = element11.getElementsMatchingText("");
        org.jsoup.nodes.Element element15 = element11.val("");
        int int16 = element15.childNodeSize();
        org.jsoup.select.Elements elements18 = element15.getElementsByAttribute("hi!.hi!.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
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
        org.jsoup.nodes.Element element16 = element14.appendText("hi!.hi!.<hi!></hi!>");
        java.lang.String str17 = element14.className();
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
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = element7.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
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
        org.jsoup.nodes.Node node16 = element15.root();
        org.jsoup.nodes.Attributes attributes17 = node16.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = node16.childNodes();
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
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
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
        boolean boolean15 = element4.hasAttr("hi!.<hi!></hi!>");
        java.lang.Class<?> wildcardClass16 = element4.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element4.childNodesCopy();
        org.jsoup.nodes.Element element10 = element4.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            element10.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(element10);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("hi!", pattern6);
        org.jsoup.nodes.Element element9 = element1.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element12 = element1.attr("hi!.hi!.<hi!></hi!>", "<hi!></hi!>");
        java.lang.String str13 = element1.data();
        boolean boolean15 = element1.hasClass("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        org.jsoup.select.Elements elements11 = element8.getElementsByAttributeValueStarting("hi!.hi!.<hi!></hi!>", "hi!");
        org.jsoup.select.Elements elements13 = element8.getElementsByClass("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
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
        java.util.Map<java.lang.String, java.lang.String> strMap21 = element20.dataset();
        org.jsoup.select.Elements elements23 = element20.getElementsByIndexLessThan((int) (short) 100);
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
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
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
        java.lang.Class<?> wildcardClass24 = elements23.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
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
        java.lang.Appendable appendable21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        // The following exception was thrown during execution in test generation
        try {
            element3.outerHtmlTail(appendable21, (int) (byte) 0, outputSettings23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        boolean boolean4 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        java.lang.String str5 = element1.className();
        java.lang.Class<?> wildcardClass6 = element1.getClass();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.select.Elements elements7 = element5.getElementsByClass("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = element5.is("");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '': unexpected token at ''");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
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
        boolean boolean28 = element4.isBlock();
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.select.Elements elements5 = element3.getElementsMatchingText("");
        int int6 = element3.childNodeSize();
        org.jsoup.nodes.Element element8 = element3.appendElement("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element9 = element8.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element9.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        boolean boolean6 = element4.hasAttr("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element8 = element4.removeClass("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.select.Evaluator evaluator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = element4.is(evaluator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
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
        org.jsoup.nodes.Element element23 = element18.text("<hi!></hi!>");
        org.jsoup.select.Elements elements25 = element18.getElementsByIndexLessThan((int) (short) 1);
        org.jsoup.nodes.Element element26 = element18.nextElementSibling();
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
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNull(element26);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Element element9 = element7.tagName("hi!");
        org.jsoup.select.Elements elements11 = element7.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element13 = element7.addClass("<hi!></hi!>");
        org.jsoup.nodes.Element element15 = element7.addClass("<hi!></hi!>");
        java.lang.String str16 = element15.val();
        org.jsoup.nodes.Node node17 = element15.nextSibling();
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        // The following exception was thrown during execution in test generation
        try {
            element15.outerHtmlHead(appendable18, (int) (byte) 1, outputSettings20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
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
        org.jsoup.select.Elements elements14 = element7.getElementsContainingOwnText("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element15 = element7.parent();
        java.util.regex.Pattern pattern16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements17 = element15.getElementsMatchingText(pattern16);
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
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList3 = element1.childNodesCopy();
        boolean boolean5 = element1.hasClass("<hi!>\n</hi!>");
        org.jsoup.parser.Tag tag6 = element1.tag();
        org.jsoup.select.NodeVisitor nodeVisitor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = element1.traverse(nodeVisitor7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = element4.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = element9.hasText();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        org.jsoup.nodes.Element element6 = element1.append("hi!.hi!.<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element6.siblingNodes();
        java.lang.String str8 = element6.outerHtml();
        org.jsoup.select.Elements elements11 = element6.getElementsByAttributeValueContaining("<hi!>\n hi!\n</hi!>", "hi!.<hi!.class=\"<hi!></hi!>\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = element6.after("<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>" + "'", str8, "<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        boolean boolean4 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element6 = element1.appendElement("hi!");
        org.jsoup.select.Elements elements9 = element6.getElementsByAttributeValueNot("<hi! class=\"\">\n</hi!>", "hi!.hi!.<hi!></hi!>");
        java.lang.String str10 = element6.toString();
        java.util.regex.Pattern pattern11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element6.getElementsMatchingText(pattern11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<hi!></hi!>" + "'", str10, "<hi!></hi!>");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        java.lang.String str3 = element1.nodeName();
        java.util.Set<java.lang.String> strSet4 = element1.classNames();
        org.jsoup.nodes.Element element6 = element1.removeClass("hi!.hi!.\n<hi!></hi!>");
        java.util.regex.Pattern pattern7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = element1.getElementsMatchingOwnText(pattern7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("hi!", pattern6);
        org.jsoup.nodes.Element element9 = element1.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str12 = element11.id();
        org.jsoup.nodes.Element element14 = element11.removeClass("");
        element14.setBaseUri("hi!");
        org.jsoup.nodes.Element element18 = element14.append("hi!");
        org.jsoup.nodes.Element element20 = element18.addClass("hi!.hi!.<hi!></hi!>");
        org.jsoup.select.Elements elements22 = element20.getElementsByTag("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element24 = element20.prependText("hi!.hi!.<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element25 = element9.after((org.jsoup.nodes.Node) element24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        int int8 = element7.childNodeSize();
        java.lang.String str9 = element7.nodeName();
        org.jsoup.nodes.Element element10 = element4.appendChild((org.jsoup.nodes.Node) element7);
        org.jsoup.select.Elements elements13 = element7.getElementsByAttributeValue("<hi!></hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element14 = element7.nextElementSibling();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
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
        org.jsoup.select.Elements elements46 = element7.getElementsByAttributeStarting("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element48 = element7.removeClass("<hi!>\n hi!\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element50 = element7.after("hi!.<hi!.class=\"<hi!></hi!>\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNotNull(element48);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        org.jsoup.select.Elements elements11 = element8.getElementsByAttributeValueStarting("hi!.hi!.<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element13 = element8.append("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        java.lang.String str14 = element8.cssSelector();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        java.lang.String str3 = element1.nodeName();
        java.lang.String str4 = element1.text();
        int int5 = element1.childNodeSize();
        boolean boolean6 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element1.textNodes();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(textNodeList7);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
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
        org.jsoup.nodes.Element element22 = element15.tagName("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        boolean boolean23 = element15.isBlock();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
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
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element("hi!");
        int int29 = element28.childNodeSize();
        org.jsoup.nodes.Element element31 = element28.val("hi!");
        org.jsoup.nodes.Element element33 = element28.addClass("hi!");
        org.jsoup.nodes.Element element34 = element28.clone();
        // The following exception was thrown during execution in test generation
        try {
            element16.replaceWith((org.jsoup.nodes.Node) element34);
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element34);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        java.lang.String str6 = element3.nodeName();
        org.jsoup.nodes.Node node7 = element3.nextSibling();
        org.jsoup.nodes.Element element9 = element3.prependElement("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        java.util.regex.Pattern pattern10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element9.getElementsMatchingText(pattern10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element10 = element4.addClass("");
        org.jsoup.select.Elements elements12 = element4.getElementsByTag("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element14 = element4.text("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        boolean boolean15 = element14.hasText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements18 = element14.getElementsByAttributeValueContaining("<hi! class=\"<hi!></hi!>\"></hi!>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
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
        org.jsoup.select.Elements elements30 = element7.getElementsByIndexGreaterThan((int) (short) 100);
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
        org.junit.Assert.assertNotNull(elements30);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Attributes attributes8 = element7.attributes();
        org.jsoup.nodes.Node node9 = element7.parentNode();
        org.jsoup.select.Elements elements10 = element7.children();
        org.jsoup.nodes.Element element12 = element7.prependElement("<hi! class=\"\"></hi!>");
        int int13 = element12.siblingIndex();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
        java.lang.String str28 = element8.val();
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        java.lang.String str3 = element1.nodeName();
        java.util.Set<java.lang.String> strSet4 = element1.classNames();
        org.jsoup.nodes.Element element6 = element1.appendElement("hi!.hi!.<hi!></hi!>");
        org.jsoup.select.Elements elements8 = element6.getElementsContainingText("<hi!>\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
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
        org.jsoup.select.Elements elements25 = element21.getElementsByIndexEquals(0);
        org.jsoup.select.Elements elements28 = element21.getElementsByAttributeValueStarting("hi!.hi!.<hi!></hi!>", "<<hi!>\n</hi!>></<hi!>\n</hi!>>");
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
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elements28);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        org.jsoup.nodes.Element element8 = element4.append("hi!");
        int int9 = element8.siblingIndex();
        java.util.regex.Pattern pattern11 = null;
        org.jsoup.select.Elements elements12 = element8.getElementsByAttributeValueMatching("hi!.<hi!.class=\"<hi!></hi!>\"></hi!>", pattern11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = element8.firstElementSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.select.Elements elements5 = element3.getElementsMatchingText("");
        org.jsoup.nodes.Element element7 = element3.prependText("hi!");
        org.jsoup.select.Elements elements9 = element7.getElementsByAttribute("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element11 = element7.append("<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>");
        org.jsoup.nodes.Element element12 = element7.empty();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
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
        java.util.List<org.jsoup.nodes.Node> nodeList17 = element15.siblingNodes();
        org.jsoup.nodes.Element element19 = element15.appendText("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<hi!></hi!>" + "'", str16, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
        element18.remove();
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
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
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
        org.jsoup.nodes.Node node18 = element15.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node18.parentNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
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
        org.jsoup.nodes.Element element18 = element16.toggleClass("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        boolean boolean19 = element18.hasText();
        org.jsoup.nodes.Element element20 = element18.parent();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(textNodeList15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(element20);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.parser.Tag tag6 = element4.tag();
        java.lang.String str7 = element4.html();
        org.jsoup.select.Elements elements9 = element4.getElementsContainingText("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element4.child((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        java.lang.String str6 = element3.nodeName();
        org.jsoup.nodes.Node node7 = element3.nextSibling();
        org.jsoup.nodes.Element element9 = element3.prepend("<hi!>\n</hi!>");
        org.jsoup.select.Elements elements10 = element3.children();
        // The following exception was thrown during execution in test generation
        try {
            element3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        java.util.Set<java.lang.String> strSet4 = element3.classNames();
        org.jsoup.nodes.Element element6 = element3.addClass("hi!.hi!.<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = element3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        java.lang.String str3 = element1.nodeName();
        java.lang.String str4 = element1.text();
        org.jsoup.nodes.Element element6 = element1.prepend("hi!.hi!.<hi!></hi!>");
        org.jsoup.parser.Tag tag7 = element6.tag();
        org.jsoup.nodes.Element element9 = element6.val("<hi!>\n hi!\n</hi!>");
        java.lang.String str10 = element6.baseUri();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        java.lang.String str3 = element1.nodeName();
        java.lang.String str4 = element1.text();
        org.jsoup.nodes.Element element6 = element1.prepend("hi!.hi!.<hi!></hi!>");
        java.lang.String str7 = element1.html();
        org.jsoup.nodes.Element element9 = element1.addClass("");
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element11.appendText("");
        org.jsoup.select.Elements elements15 = element13.getElementsMatchingText("");
        int int16 = element13.childNodeSize();
        org.jsoup.nodes.Element element18 = element13.appendElement("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element20 = element13.text("hi!.hi!.\n<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element21 = element1.before((org.jsoup.nodes.Node) element20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.\n<hi!></hi!>" + "'", str7, "hi!.hi!.\n<hi!></hi!>");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element10 = element4.append("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Node node11 = element4.root();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = element4.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Attributes attributes8 = element7.attributes();
        org.jsoup.select.Elements elements11 = element7.getElementsByAttributeValue("<hi!></hi!>", "<hi!></hi!>");
        org.jsoup.nodes.Element element12 = element7.parent();
        org.jsoup.nodes.Element element14 = element7.html("<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.parser.Tag tag6 = element4.tag();
        org.jsoup.select.Elements elements9 = element4.getElementsByAttributeValueMatching("hi!", "hi!.hi!.<hi!></hi!>");
        java.lang.String str10 = element4.className();
        java.lang.String str11 = element4.ownText();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        org.jsoup.nodes.Element element6 = element1.getElementById("<hi!>\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element1.nodeName();
        java.util.regex.Pattern pattern6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = element1.getElementsMatchingText(pattern6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element10 = element4.addClass("");
        org.jsoup.select.Elements elements12 = element4.getElementsByTag("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element14 = element4.text("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element17 = element4.attr("", "<<hi!>\n</hi!>></<hi!>\n</hi!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
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
        boolean boolean24 = element21.isBlock();
        java.lang.String str25 = element21.id();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
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
        org.jsoup.nodes.Element element15 = element4.append("<hi!>\n</hi!>");
        java.lang.String str16 = element4.cssSelector();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
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
        org.jsoup.nodes.Node node21 = element20.root();
        java.lang.Class<?> wildcardClass22 = element20.getClass();
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
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        java.lang.String str4 = element1.className();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList5 = element1.dataNodes();
        org.jsoup.nodes.Element element8 = element1.attr("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element10 = element1.appendElement("hi!");
        java.util.regex.Pattern pattern12 = null;
        org.jsoup.select.Elements elements13 = element10.getElementsByAttributeValueMatching("<hi! class=\"\"></hi!>", pattern12);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(dataNodeList5);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.parser.Tag tag6 = element4.tag();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element(tag6, "hi!.hi!.<hi!></hi!>");
        java.util.Set<java.lang.String> strSet9 = element8.classNames();
        org.jsoup.nodes.Element element11 = element8.prependText("hi!");
        org.jsoup.nodes.Element element14 = element8.attr("<hi!>\n hi!\n</hi!>", false);
        org.jsoup.select.Elements elements15 = element8.parents();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Attributes attributes8 = element7.attributes();
        org.jsoup.nodes.Node node9 = element7.parentNode();
        org.jsoup.select.Elements elements10 = element7.children();
        org.jsoup.nodes.Element element12 = element7.tagName("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = element12.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.parser.Tag tag6 = element4.tag();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element(tag6, "hi!.hi!.<hi!></hi!>");
        java.util.Set<java.lang.String> strSet9 = element8.classNames();
        org.jsoup.nodes.Element element11 = element8.prependText("hi!");
        java.util.regex.Pattern pattern12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = element8.getElementsMatchingOwnText(pattern12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        java.lang.Integer int7 = element4.elementSiblingIndex();
        org.jsoup.select.Elements elements9 = element4.getElementsByIndexGreaterThan(100);
        org.jsoup.parser.Tag tag10 = element4.tag();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Element element9 = element7.tagName("hi!");
        boolean boolean10 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element9);
        boolean boolean11 = element9.isBlock();
        java.util.regex.Pattern pattern13 = null;
        org.jsoup.select.Elements elements14 = element9.getElementsByAttributeValueMatching("hi!.hi!.<hi!></hi!>", pattern13);
        org.jsoup.nodes.Element element15 = element9.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element17 = element15.prependElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(element15);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
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
        org.jsoup.select.Elements elements62 = element60.getElementsByIndexEquals((int) '4');
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
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet9 = element8.classNames();
        org.jsoup.nodes.Element element11 = element8.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element13 = element11.html("");
        org.jsoup.nodes.Element element15 = element11.addClass("<hi!></hi!>");
        org.jsoup.select.NodeVisitor nodeVisitor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = element15.traverse(nodeVisitor16);
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
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Element element9 = element7.tagName("hi!");
        boolean boolean10 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element9);
        boolean boolean11 = element9.isBlock();
        java.util.regex.Pattern pattern13 = null;
        org.jsoup.select.Elements elements14 = element9.getElementsByAttributeValueMatching("hi!.hi!.<hi!></hi!>", pattern13);
        java.lang.String str15 = element9.tagName();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Attributes attributes8 = element7.attributes();
        org.jsoup.nodes.Node node9 = element7.parentNode();
        org.jsoup.select.Elements elements10 = element7.children();
        org.jsoup.nodes.Element element11 = element7.parent();
        org.jsoup.select.Elements elements13 = element7.getElementsMatchingOwnText("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.select.Elements elements14 = element7.siblingElements();
        org.jsoup.nodes.Element element15 = element7.parent();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(element15);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        org.jsoup.select.Elements elements11 = element8.getElementsByAttributeValueStarting("hi!.hi!.<hi!></hi!>", "hi!");
        java.lang.String str12 = element8.id();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = element8.child((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.className();
        org.jsoup.nodes.Element element4 = element1.html("hi!");
        org.jsoup.nodes.Element element6 = element1.getElementById("<hi!>\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = element6.parentNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        java.lang.String str6 = element3.cssSelector();
        org.jsoup.select.NodeVisitor nodeVisitor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = element3.traverse(nodeVisitor7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        java.lang.String str4 = element1.className();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList5 = element1.dataNodes();
        org.jsoup.nodes.Element element8 = element1.attr("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element10 = element1.appendElement("hi!");
        java.util.regex.Pattern pattern11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element10.getElementsMatchingText(pattern11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(dataNodeList5);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
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
        org.jsoup.select.Elements elements37 = element34.getElementsByAttributeValue("<hi!>\n</hi!>", "<hi! class=\"<hi!></hi!>\"></hi!>");
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
        org.junit.Assert.assertNotNull(elements37);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.prepend("hi!");
        org.jsoup.nodes.Element element4 = element1.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = element4.getElementsByClass("<hi! class=\"<hi!></hi!>\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNull(element4);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.prepend("hi!");
        java.lang.String str4 = element3.data();
        org.jsoup.nodes.Element element6 = element3.tagName("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        org.jsoup.select.Elements elements7 = element3.children();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = element3.child(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.util.List<org.jsoup.nodes.Node> nodeList3 = element1.siblingNodes();
        org.jsoup.nodes.Element element5 = element1.removeClass("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element7 = element5.appendText("<hi!></hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        java.lang.String str7 = element4.tagName();
        boolean boolean9 = element4.hasClass("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.select.Evaluator evaluator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = element4.is(evaluator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.select.Elements elements7 = element5.getElementsByClass("hi!");
        java.lang.String str8 = element5.val();
        boolean boolean10 = element5.hasClass("hi!");
        org.jsoup.select.Elements elements11 = element5.children();
        java.lang.String str12 = element5.id();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = element5.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        org.jsoup.nodes.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = element1.before(node5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
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
        org.jsoup.select.Elements elements18 = element15.siblingElements();
        // The following exception was thrown during execution in test generation
        try {
            element15.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
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
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.val("<hi!></hi!>");
        org.jsoup.parser.Tag tag4 = element1.tag();
        org.jsoup.nodes.Attributes attributes5 = element1.attributes();
        java.lang.String str6 = element1.data();
        java.lang.String str7 = element1.ownText();
        org.jsoup.nodes.Element element9 = element1.val("<hi!>\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element9.after("<hi!>\n hi!\n</hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
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
        org.jsoup.nodes.Element element15 = element4.append("<hi!>\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = element15.unwrap();
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
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
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
        org.jsoup.select.Elements elements30 = element27.getElementsByAttributeValueEnding("hi!.hi!.\n<hi!></hi!>", "<hi! class=\"\"></hi!>");
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
        org.junit.Assert.assertNotNull(elements30);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        java.util.Set<java.lang.String> strSet4 = element3.classNames();
        java.lang.Integer int5 = element3.elementSiblingIndex();
        org.jsoup.nodes.Element element8 = element3.attr("<hi!>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>", false);
        org.jsoup.nodes.Element element9 = element3.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element3.getElementsByAttributeValueStarting("", "<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        java.lang.String str6 = element3.data();
        java.util.Set<java.lang.String> strSet7 = element3.classNames();
        org.jsoup.nodes.Element element9 = element3.html("<hi! class=\"\">\n</hi!>");
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            element3.outerHtmlTail(appendable10, (int) (byte) 10, outputSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Element element9 = element7.tagName("hi!");
        org.jsoup.select.Elements elements11 = element7.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element13 = element7.addClass("<hi!></hi!>");
        org.jsoup.select.Elements elements15 = element7.getElementsMatchingText("hi!");
        org.jsoup.nodes.Document document16 = element7.ownerDocument();
        org.jsoup.nodes.Node node18 = element7.removeAttr("<hi! <hi! class=\"<hi!></hi!>\"></hi!>=\"<hi! class=&quot;<hi!></hi!>&quot;></hi!>\"></hi!>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        java.lang.String str7 = element4.cssSelector();
        java.util.Set<java.lang.String> strSet8 = element4.classNames();
        org.jsoup.select.Elements elements11 = element4.getElementsByAttributeValueNot("hi!.hi!.<hi!></hi!>", "hi!.hi!.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
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
        org.jsoup.select.Elements elements27 = element20.getElementsByAttributeValueContaining("<hi! class=\"\">&lt;hi!&gt; &lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>", "<hi! class=\"\"></hi!>");
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
        org.junit.Assert.assertNotNull(elements27);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
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
        org.jsoup.nodes.Element element27 = element25.prependText("<hi!>\n hi!\n</hi!>");
        org.jsoup.select.Elements elements29 = element27.getElementsByTag("<<hi!>\n</hi!>></<hi!>\n</hi!>>");
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
        org.junit.Assert.assertNotNull(elements29);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
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
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList27 = element4.dataNodes();
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
        org.junit.Assert.assertNotNull(dataNodeList27);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
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
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str27 = element26.id();
        org.jsoup.nodes.Element element29 = element26.removeClass("");
        element29.setBaseUri("hi!");
        org.jsoup.nodes.Element element33 = element29.append("hi!");
        int int34 = element33.siblingIndex();
        org.jsoup.select.Elements elements35 = element33.siblingElements();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element36 = element3.insertChildren((int) (short) 10, (java.util.Collection<org.jsoup.nodes.Element>) elements35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(elements35);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet9 = element8.classNames();
        org.jsoup.nodes.Element element11 = element8.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element13 = element11.html("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList14 = element11.dataNodes();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        int int17 = element16.childNodeSize();
        boolean boolean19 = element16.hasClass("hi!");
        java.util.regex.Pattern pattern21 = null;
        org.jsoup.select.Elements elements22 = element16.getElementsByAttributeValueMatching("hi!", pattern21);
        org.jsoup.nodes.Element element23 = element16.empty();
        org.jsoup.select.Elements elements26 = element16.getElementsByAttributeValueNot("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!>\n</hi!>");
        java.util.Set<java.lang.String> strSet27 = element16.classNames();
        // The following exception was thrown during execution in test generation
        try {
            element11.replaceWith((org.jsoup.nodes.Node) element16);
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
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(dataNodeList14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(strSet27);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
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
        java.lang.String str18 = element1.absUrl("hi!.hi!.<hi!></hi!>");
        org.jsoup.select.NodeVisitor nodeVisitor19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = element1.traverse(nodeVisitor19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dataNodeList15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.nodes.Element element5 = element3.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element3.toggleClass("");
        org.jsoup.nodes.Attributes attributes8 = element7.attributes();
        org.jsoup.nodes.Node node9 = element7.parentNode();
        org.jsoup.select.Elements elements10 = element7.children();
        org.jsoup.nodes.Element element12 = element7.tagName("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Node node13 = element12.parentNode();
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            element12.outerHtmlHead(appendable14, 10, outputSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element1.nodeName();
        java.util.regex.Pattern pattern7 = null;
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("hi!.<hi!></hi!>", pattern7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.select.Elements elements5 = element3.getElementsMatchingText("");
        int int6 = element3.childNodeSize();
        org.jsoup.nodes.Element element8 = element3.appendElement("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element9 = element8.previousElementSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element8.childNodesCopy();
        org.jsoup.nodes.Element element12 = element8.append("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.select.Elements elements14 = element8.getElementsByIndexLessThan(100);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        java.lang.String str6 = element4.absUrl("hi!");
        org.jsoup.nodes.Element element8 = element4.append("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet9 = element8.classNames();
        org.jsoup.nodes.Element element11 = element8.val("hi!.hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element13 = element11.html("");
        org.jsoup.select.Elements elements14 = element13.parents();
        org.jsoup.nodes.Node node15 = element13.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = node15.childNodeSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.className();
        org.jsoup.nodes.Element element4 = element1.html("hi!");
        org.jsoup.nodes.Element element6 = element1.getElementById("<hi!>\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element1.before("<hi!>\n</hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str20 = element19.id();
        java.lang.Integer int21 = element19.elementSiblingIndex();
        org.jsoup.nodes.Element element22 = element19.empty();
        java.lang.String str23 = element22.outerHtml();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element("hi!");
        int int26 = element25.childNodeSize();
        java.lang.String str27 = element25.nodeName();
        org.jsoup.nodes.Element element28 = element22.appendChild((org.jsoup.nodes.Node) element25);
        org.jsoup.select.Elements elements30 = element28.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element34 = element32.appendText("");
        int int35 = element34.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList36 = element34.textNodes();
        java.lang.String str37 = element34.data();
        org.jsoup.nodes.Element element38 = element28.prependChild((org.jsoup.nodes.Node) element34);
        org.jsoup.nodes.Node node39 = element38.parentNode();
        org.jsoup.select.Elements elements42 = element38.getElementsByAttributeValueEnding("<hi! class=\"\"></hi!>", "<hi! class=\"\"></hi!>");
        org.jsoup.select.Elements elements44 = element38.getElementsByAttributeStarting("<hi!>\n hi!\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element45 = element15.insertChildren((int) (short) 1, (java.util.Collection<org.jsoup.nodes.Element>) elements44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<hi!></hi!>" + "'", str16, "<hi!></hi!>");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<hi!></hi!>" + "'", str23, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(textNodeList36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertNotNull(elements44);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.val("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet4 = element3.classNames();
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
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element21 = element19.appendText("");
        int int22 = element21.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList23 = element21.textNodes();
        java.lang.String str24 = element21.data();
        org.jsoup.nodes.Element element25 = element15.prependChild((org.jsoup.nodes.Node) element21);
        java.util.List<org.jsoup.nodes.Node> nodeList26 = element15.siblingNodes();
        org.jsoup.nodes.Element element27 = element3.appendChild((org.jsoup.nodes.Node) element15);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements29 = element27.select("<hi! class=\"<hi!></hi!>\"></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! class=\"<hi!></hi!>\"></hi!>': unexpected token at '<hi! class=\"<hi!></hi!>\"></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<hi!></hi!>" + "'", str10, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(textNodeList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(element27);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.removeClass("hi!");
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(100);
        java.lang.String str6 = element1.id();
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeStarting("hi!.hi!.<hi!></hi!>");
        boolean boolean10 = element1.hasAttr("hi!.hi!.<hi!></hi!>");
        java.lang.String str11 = element1.html();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        java.lang.Integer int3 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = element1.empty();
        java.lang.String str5 = element1.nodeName();
        org.jsoup.nodes.Element element7 = element1.appendText("<hi! class=\"\"></hi!>");
        java.lang.String str8 = element7.data();
        java.lang.String str9 = element7.nodeName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
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
        java.lang.String str23 = element21.absUrl("<hi!></hi!>");
        org.jsoup.nodes.Element element25 = element21.val("hi!.hi!.");
        java.util.regex.Pattern pattern27 = null;
        org.jsoup.select.Elements elements28 = element25.getElementsByAttributeValueMatching("<hi!>\n hi!\n</hi!>", pattern27);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements28);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
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
        org.jsoup.select.Elements elements23 = element20.getElementsContainingText("hi!.hi!.\n<hi!></hi!>");
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
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.val("<hi!></hi!>");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = element3.dataset();
        java.util.Set<java.lang.String> strSet5 = element3.classNames();
        org.jsoup.select.NodeVisitor nodeVisitor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = element3.traverse(nodeVisitor6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        int int4 = element3.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element3.textNodes();
        java.lang.String str6 = element3.nodeName();
        org.jsoup.nodes.Element element8 = element3.text("<hi!></hi!>");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str11 = element10.id();
        java.lang.Integer int12 = element10.elementSiblingIndex();
        org.jsoup.nodes.Element element13 = element10.empty();
        java.lang.String str14 = element13.outerHtml();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        int int17 = element16.childNodeSize();
        java.lang.String str18 = element16.nodeName();
        org.jsoup.nodes.Element element19 = element13.appendChild((org.jsoup.nodes.Node) element16);
        org.jsoup.select.Elements elements21 = element19.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element25 = element23.appendText("");
        int int26 = element25.siblingIndex();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList27 = element25.textNodes();
        java.lang.String str28 = element25.data();
        org.jsoup.nodes.Element element29 = element19.prependChild((org.jsoup.nodes.Node) element25);
        java.util.Set<java.lang.String> strSet30 = element29.classNames();
        org.jsoup.nodes.Element element31 = element8.classNames(strSet30);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element33 = element31.after("<hi!>\n</hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<hi!></hi!>" + "'", str14, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(textNodeList27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(element31);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("");
        org.jsoup.select.Elements elements5 = element3.getElementsMatchingText("");
        int int6 = element3.childNodeSize();
        org.jsoup.nodes.Element element8 = element3.appendElement("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element9 = element8.previousElementSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element8.childNodesCopy();
        org.jsoup.nodes.Element element12 = element8.append("<hi!>\n <hi!></hi!>\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = element12.tagName("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Tag name must not be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.id();
        org.jsoup.nodes.Element element4 = element1.removeClass("");
        element4.setBaseUri("hi!");
        java.lang.String str7 = element4.tagName();
        org.jsoup.select.Elements elements9 = element4.getElementsByIndexLessThan((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element4.after("<hi! class=\"\">\n hi!.hi!.\n <hi!></hi!>\n</hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        int int2 = element1.childNodeSize();
        boolean boolean4 = element1.hasClass("hi!");
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("hi!", pattern6);
        org.jsoup.nodes.Element element9 = element1.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element12 = element1.attr("hi!.hi!.<hi!></hi!>", "<hi!></hi!>");
        org.jsoup.select.Elements elements15 = element1.getElementsByAttributeValueStarting("hi!", "hi!.hi!.<hi!></hi!>");
        java.util.Set<java.lang.String> strSet16 = element1.classNames();
        org.jsoup.select.Elements elements17 = element1.getAllElements();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = element1.dataset();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(strMap18);
    }
}

